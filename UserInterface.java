//This is the user interface for selecting what actions to run

import java.util.NoSuchElementException;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) throws Exception {

        // creates a instaance of the mthod file
        InterfaceMethods iMethods = new InterfaceMethods();

        // print start up method
        iMethods.CommandsPageOne();

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
                iMethods.CommandsPageOne();
            }

            // method to display all courses in database
            else if (UserCommand.equals("2")) {

                Scanner Dscan = new Scanner(System.in);

                try {

                    String CID, CN, CDES, CT, CR, CG1, CTA, CTB, COE, CPR;
                    Boolean boolCR, boolCG1, boolCTA, boolCTB, boolCOE, boolCPR;

                    System.out.println("Make a Course ID:");
                    CID = Dscan.nextLine();

                    System.out.println("Name of Course:");
                    CN = Dscan.nextLine();

                    System.out.println("Description of Course:");
                    CDES = Dscan.nextLine();

                    System.out.println("Where will this run? (N/A if not being taken)");
                    CT = Dscan.next();

                    System.out.println("Is this a required credit?");
                    CR = Dscan.next();

                    System.out.println("Is this a group 1 credit?");
                    CG1 = Dscan.next();

                    System.out.println("Is this a table A liberal?");
                    CTA = Dscan.next();

                    System.out.println("Is this a table B liberal?");
                    CTB = Dscan.next();

                    System.out.println("Is this a open elective?");
                    COE = Dscan.next();

                    System.out.println("Is this a professinally realted?");
                    CPR = Dscan.next();

                //    InterfaceMethods.AddCourseToDatabase( Variables );
                //} catch (NoSuchElementException f) {
                //    System.out.print("Error catching");
                //}
                //iMethods.CommandsPageOne();
            }

            //method to find the a course in database with scepific ID
            else if (UserCommand.equals("3")) {

            }

            //method to find course within specfic timeframe
            else if (UserCommand.equals("4")) {

            }


            //method to find all courses within specfic
            else if (UserCommand.equals("5")) {

            }



            //method to end the program
            else if (UserCommand.equals("6")){
                
            }

            

            //method to show second list
            else if (UserCommand.equals("7")){

            }


            //method to show second list
            else if (UserCommand.equals("8")){

            }


            //method to show second list
            else if (UserCommand.equals("9")){

            }


            //method to show second list
            else if (UserCommand.equals("10")){

            }

            //method to show second list
            else if (UserCommand.equals("11")){

            }

            //method to show second list
            else if (UserCommand.equals("12")){

            }




        

        }

    }
}
