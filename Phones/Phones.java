import java.io.*;
   
   public class Phones {
   
       static final String DEFAULT_FILENAME = "phones.dat";
   
       static PhoneDirectory directory;  
   
       public static void main(String[] args) {
       
          String fileName;
          boolean done;  
          
          if (args.length == 0)
             fileName = DEFAULT_FILENAME;
          else
             fileName = args[0];
          
          readPhoneData(fileName);
          
          done = false;
          
          while (done == false) {
              TextIO.putln();
              TextIO.putln();
              TextIO.putln("Select the operation you want to perform:");
              TextIO.putln();
              TextIO.putln("     1.  Look up a phone number");
              TextIO.putln("     2.  Add an entry to the directory");
              TextIO.putln("     3.  Delete an entry from the directory");
              TextIO.putln("     4.  Change someone's phone number");
              TextIO.putln("     5.  Exit form this program.");
              TextIO.putln();
              TextIO.put("Enter the number of your choice: ");
              int menuOption = TextIO.getlnInt();
              switch (menuOption) {
                 case 1:
                    doLookup();
                    break;
                 case 2:
                    doAddEntry();
                    break;
                 case 3:
                    doDeleteEntry();
                    break;
                 case 4:
                    doModifyEntry();
                    break;
                 case 5:
                    done = true;
                    break;
                 default:
                    System.out.println("Illegal choice! Please try again.");
              } 
          } 
          
          if (directory.changed == true)
             writePhoneData(fileName);
             
          TextIO.putln("\nExiting program.");
       
       } 
   
       static void readPhoneData(String fileName) {
          TextReader in; 
          try {
             in = new TextReader( new FileReader(fileName) );
          }
          catch (Exception e) {
             in = null;
          }
          if (in == null) {            
             TextIO.putln("\nThe file \"" + fileName + "\" does not exist.");
             TextIO.put("Do you want to create the file? ");
             boolean create = TextIO.getlnBoolean();
             if (create == false) {
                TextIO.putln("Program aborted.");
                System.exit(0);
             }
             directory = new PhoneDirectory(); 
             try {
                PrintWriter out = new PrintWriter( new FileWriter(fileName) );
                directory.save(out);
                if (out.checkError())
                   throw new Exception();
                TextIO.putln("Empty directory created.");
             }
             catch (Exception e) {
                TextIO.putln("Can't create file.");
                TextIO.putln("Program aborted.");
                System.exit(0);
             }
          }
          else {
             try {
                 directory = new PhoneDirectory();
                 directory.load(in); 
             }
             catch (Exception e) {
                TextIO.putln("An error occurred while read data from \"" + fileName + "\":");
                TextIO.putln(e.toString());
                TextIO.putln("Program aborted.");
                System.exit(0);
             }
          }
       }  
       
       static void writePhoneData(String fileName) {
          PrintWriter out;
          try {
             out = new PrintWriter( new FileWriter(fileName) );
          }
          catch (Exception e) {
             TextIO.putln("\nCan't open file for output!");
             TextIO.putln("Changes have not been saved.");
             return;
          }
          directory.save(out);
          if (out.checkError()) {
             TextIO.putln("Some error occurred while saving data to a file.");
             TextIO.putln("Sorry, but your phone directory might be ruined");
          }
       }
       
       
       static void doLookup() {
          TextIO.putln("\nLook up the name: ");
          String name = TextIO.getln();
          String number = directory.numberFor(name);
          if (number == null)
             TextIO.putln("\nNo such name in the directory.");
          else
             TextIO.putln("\nThe number for " + name + " is " + number);
       }
       
       
       static void doAddEntry() {
          TextIO.putln("\nAdd entry for this name: ");
          String name = TextIO.getln();
          if (directory.numberFor(name) != null) {
             TextIO.putln("That name is already in the directory.");
             TextIO.putln("Use command number 4 to change the entry for " + name);
             return;
          }
          TextIO.putln("What is the number for " + name + "? ");
          String number = TextIO.getln();
          directory.addNewEntry(name,number);
       }
       
       
       static void doDeleteEntry() {
          TextIO.putln("\nDelete the entry for this name: ");
          String name = TextIO.getln();
          if (directory.numberFor(name) == null)
             TextIO.putln("There is not entry for " + name);
          else {
             directory.deleteEntry(name);
             TextIO.putln("Entry deleted.");
          }
       }
       
       
       static void doModifyEntry() {
          TextIO.putln("\nChange the number for this name: ");
          String name = TextIO.getln();
          if (directory.numberFor(name) == null) {
             TextIO.putln("That name is not in the directory.");
             TextIO.putln("Use command number 2 to add an entry for " + name);
             return;
          }
          TextIO.putln("What is the new number for " + name + "? ");
          String number = TextIO.getln();
          directory.updateEntry(name,number);
       }
   
   } 