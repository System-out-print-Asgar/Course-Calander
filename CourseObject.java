import java.security.PublicKey;

//This will hold the methods of the course objects and what will work on them

public class CourseObject {
    //private variables of course object
    private String CourseCode;
    private String CourseName;
    private String CourseDescription;
    private String CourseTime;
    private Boolean RequiredCourse;
    private Boolean Group1Course;
    private Boolean TableALibCourse;
    private Boolean OpenElecCourse;
    private Boolean ProfRelateCourse;
    private Boolean TableBLibCourse;


    //constructor method for course objects
    public CourseObject(String Code, String Name, String Description, String Time, Boolean Required, Boolean G1, Boolean TAlib, Boolean TBlib, Boolean OpenEl, Boolean ProfRele){
        CourseCode = Code;
        CourseName = Name;
        CourseDescription = Description;
        CourseTime = Time;
        RequiredCourse = Required;
        Group1Course = G1;
        TableALibCourse = TAlib;
        TableBLibCourse = TBlib;
        OpenElecCourse = OpenEl;
        ProfRelateCourse = ProfRele;
    }





}