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
                System.out.println("We will display all courses now!");

                //update display and create a method to add 

            }



            
        }











    }
}


