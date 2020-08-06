//This is the user interface for selecting what actions to run

import java.util.Scanner;

public class UserInterface{

    public static void main(String[] args) throws Exception {

        //creates a instaance of the mthod file
        InterfaceMethods iMethods = new InterfaceMethods();

        //print start up method
        iMethods.StartUpCommands();

        //create the scanner 
        Scanner scanner = new Scanner(System.in);
        System.out.print(">");

        //scanner that checks if there is a extra line present and will procced with the code 
        while(scanner.hasNextLine()){
            String input = scanner.nextLine();
            if(input == null || input.equals("")) continue;

            //create a second scanner that will manage user input
            Scanner Userinput = new Scanner(input);
            String UserCommand =  Userinput.next();

            

            //code will contiue if there is no input
            if (UserCommand == null || UserCommand.equals("")) continue;

            //method to display all courses in database
            else if (UserCommand.equals("Display")){

                String CID, CN, CDES, CT, CR, CG1, CTA, CTB, COE, CPR;

                System.out.println("Make a Course ID:");
                //take user 
                CID = Userinput.next();

                System.out.println("Name of Course:");
                //take user input
                CN = Userinput.next();

                System.out.println("Description of Course:");
                //take unser input
                CDES = Userinput.nextLine();

                System.out.println("Where will this run? (N/A if not being taken)");
                //take user input
                CT = Userinput.next();

                System.out.println("Is this a required credit?");
                //take user input
                CR = Userinput.next();

                System.out.println("Is this a group 1 credit?");
                //take user input
                CG1 = Userinput.next(); 

                System.out.println("Is this a table A liberal?");
                //take user input
                CTA = Userinput.next();

                System.out.println("Is this a table B liberal?");
                //take user 
                CTB = Userinput.next();

                System.out.println("Is this a open elective?");
                //take user input
                COE = Userinput.next();

                System.out.println("Is this a professinally realted?");
                //take user inoput
                CPR = Userinput.next();
                

                

                //update display and create a method to add 

            }



            
        }











    }
}


