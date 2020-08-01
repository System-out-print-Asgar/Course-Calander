//this holds the methods in the user interface
import java.io.File;
import java.io.FileNotFoundException;;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;


public class InterfaceMethods{
    
    //map that holds all the course 
    public TreeMap <String,CourseObject> CourseList = new TreeMap <String,CourseObject>();


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
    


}