//This is the user interface for selecting what actions to run

import java.util.NoSuchElementException;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) throws Exception {

        // creates a instaance of the mthod file
        InterfaceMethods iMethods = new InterfaceMethods();

        // print start up method
        iMethods.StartUpCommands();

        // create the scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print(">");

        // scanner that checks if there is a extra line present and will procced with
        // the code
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input == null || input.equals(""))
                continue;

            // create a second scanner that will manage user input
            Scanner Userinput = new Scanner(input);
            String UserCommand = Userinput.next();

            // code will contiue if there is no input
            if (UserCommand == null || UserCommand.equals(""))
                continue;

            // method to display all courses in database
            else if (UserCommand.equals("1")) {

                iMethods.DisplayAllCourse();
                iMethods.StartUpCommands();
            }

            // method to display all courses in database
            else if (UserCommand.equals("2")) {

                Scanner Dscan = new Scanner(System.in);

                try {

                    String CID, CN, CDES, CT, CR, CG1, CTA, CTB, COE, CPR;
                    Boolean boolCR, boolCG1, boolCTA, boolCTB, boolCOE, boolCPR;

                    System.out.println("Make a Course ID:");
                    // take user
                    CID = Dscan.nextLine();

                    System.out.println("Name of Course:");
                    // take user input
                    CN = Dscan.nextLine();

                    System.out.println("Description of Course:");
                    // take unser input
                    CDES = Dscan.nextLine();

                    System.out.println("Where will this run? (N/A if not being taken)");
                    // take user input
                    CT = Dscan.next();

                    System.out.println("Is this a required credit?");
                    // take user input
                    CR = Dscan.next();
                    boolCR = InterfaceMethods.ReturnBoolValue(CR);

                    System.out.println("Is this a group 1 credit?");
                    // take user input
                    CG1 = Dscan.next();
                    boolCG1 = InterfaceMethods.ReturnBoolValue(CG1);

                    System.out.println("Is this a table A liberal?");
                    // take user input
                    CTA = Dscan.next();
                    boolCTA = InterfaceMethods.ReturnBoolValue(CTA);

                    System.out.println("Is this a table B liberal?");
                    // take user
                    CTB = Dscan.next();
                    boolCTB = InterfaceMethods.ReturnBoolValue(CTB);

                    System.out.println("Is this a open elective?");
                    // take user input
                    COE = Dscan.next();
                    boolCOE = InterfaceMethods.ReturnBoolValue(COE);

                    System.out.println("Is this a professinally realted?");
                    // take user inoput
                    CPR = Dscan.next();
                    boolCPR = InterfaceMethods.ReturnBoolValue(CPR);

                    InterfaceMethods.AddCourseToDatabase(CID, CN, CDES, CT, boolCR, boolCG1, boolCTA, boolCTB, boolCOE,
                            boolCPR);
                } catch (NoSuchElementException f) {
                    System.out.print("Error catching");
                }
                iMethods.StartUpCommands();
            }

            //method to find the a course in database with scepific ID
            else if (UserCommand.equals("3")) {

                Scanner Uscan = new Scanner(System.in);

                System.out.println("Enter course code that will be searched:");
                String Ccheck = Uscan.next();
                System.out.println(" ");

                InterfaceMethods.LookUpSpecfic(Ccheck);
            }

            //method to find course within specfic timeframe
            else if (UserCommand.equals("4")) {

                



            }


            //method to find all courses within specfic program



            //method to end the program
            else if (UserCommand.equals("6")){
                System.exit(0);
            }

        }

    }
}
