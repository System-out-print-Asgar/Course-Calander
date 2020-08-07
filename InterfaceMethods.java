//this holds the methods in the user interface
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;


public class InterfaceMethods{
    
    //map that holds all the course 
    public static TreeMap <String,CourseObject> CourseList = new TreeMap <String,CourseObject>();

    //method to display commands
    public void StartUpCommands(){
        System.out.println("Welcome to course calander V1.0");
        System.out.println("To start the program please begin with entering the number of a command below:");
        System.out.println("1-Display all current courses in the database");
        System.out.println("2-Add a new course to the database");
        System.out.println("3-Look up a specfic course in data base using ID");
        System.out.println("4-Look up all courses within a specfic time frame");
        System.out.println("5-Look up all courses within a specfic program");
        System.out.println("(Enter any other key to move to access the second menu)");

    }


    //method that prints out all the courses currently in database
    public void DisplayAllCourse(){

        for (String key : CourseList.keySet()){

            System.out.println(CourseList.get(key).getInfo());
        }
    }

    //method that displays all the course of a given time frame 
    public void DisplayInTimeFrame(String Time){

        for(String key : CourseList.keySet()){

            if(CourseList.get(key).getTime().equals(Time)){

                System.out.println(CourseList.get(key).getInfo());
            }
            
            else{
                continue;
            }
        }
    }

    //method to return boolean value of string input
    public static Boolean ReturnBoolValue(String Value){

        if((Value.equalsIgnoreCase("YES"))||(Value.equalsIgnoreCase("Y"))){
            return(true);
        }
        else{
            return(false);
        }

    }
    

    //this creates a course object and adds it to the databaseusing the users input
    public static void AddCourseToDatabase(String CC, String CN, String CD, String CT, Boolean CR, Boolean CG1, Boolean CTA, Boolean CTB, Boolean COE, Boolean CPR){

        String KEY = CC;
        CourseObject ID = new CourseObject(CC, CN, CD, CT, CR, CG1, CTA, CTB, COE, CPR);

        CourseList.put(KEY, ID);

        System.out.println("New course Has been added Course added");
        System.out.println("");
    
    }
    
    


}