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
    public void CommandsPageOne(){
        System.out.println("");
        System.out.println("Welcome to course calander V1.0");
        System.out.println("To start the program please begin with entering the number of a command below:");
        System.out.println("1-Add a new course to the database");
        System.out.println("2-Remove a course from data base");
        System.out.println("3-Display all current courses in the database");
        System.our.println("4-Display Required courses in Database");
        System.our.println("5-Display Group 1 courses in Database");
        System.out.println("6-Show addiontal Options");
        System.out.print("");
    }

    public void CommandsPageTwo(){
        System.our.println("");
        System.out.println("7-Return to Previous Options");
        System.our.println("8-Display Open Elective Courses");
        System.our.println("9-Display Professinally Related Courses");
        System.our.println("10-Display Table A Liberal Courses");
        System.our.println("11-Display Table B Liberal Courses");
        System.out.println("12-Exit program")
        System.our.println("");




    }


    //method that prints out all the courses currently in database
    public void DisplayAllCourse(){

        for (String key : CourseList.keySet()){

            System.out.println(CourseList.get(key).getInfo());
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

    //method to add course to database 
    public static void AddCourseToDatabase(String CC, String CN, String CD, String CT, Boolean CR, Boolean CG1, Boolean CTA, Boolean CTB, Boolean COE, Boolean CPR){

        String KEY = CC;
        CourseObject ID = new CourseObject(CC, CN, CD, CT, CR, CG1, CTA, CTB, COE, CPR);

        CourseList.put(KEY, ID);

        System.out.println("New course Has been added Course added");
        System.out.println("");
    
    }

    //method to look up a specfic course
    public static void LookUpSpecfic(String ThisCKey){

        String ThisKey = ThisCKey;

        for(String keys : CourseList.keySet()){

            if(CourseList.get(keys).getId().equalsIgnoreCase(ThisKey)){

                System.out.println(CourseList.get(keys).getInfo());
            }
        }

    }
    
    //method to saerch by specfic program  
    public static void LookUpProgram(String Program){

        String ProgramSTR = Program;

        for(String keys : CourseList.keySet()){
            
            if(CourseList.get(keys).getProgram().equalsIgnoreCase(ProgramSTR)){

                System.out.println(CourseList.get(keys).getInfo());
            }
        }
    }

    //method to find time frame
    public static void LookUpTime(String TimeF){

        String ProgramTime = TimeF; 

        for(String keys : CourseList.keySet()){

            if(CourseList.get(keys).getTime().equalsIgnoreCase(ProgramTime)){

                System.out.println(CourseList.get(keys).getInfo());

            }
        }
    }





}