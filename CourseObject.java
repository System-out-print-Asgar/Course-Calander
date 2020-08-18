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

    //Method to check if course is Liberal Table A
    public String checkLiberalA(){
        System.out.print("Is course a Table A Liberal?: ");

        if(this.TableALibCourse){
            System.out.print("Yes");
        }

        else{
            System.out.print("No");
        }

        return("");
    }

    //Method to check if course is a Liberal Table B
    public String checkLiberalB(){
        System.out.print("Is course a Table B Liberal?: ");

        if(this.TableBLibCourse){
            System.out.print("Yes");
        }

        else{
            System.out.print("No");
        }

        return("");
    }

    //Method to check if course is a Group 1 course 
    public String checkGroup1(){
        System.out.print("Is this course a Group 1 Course?: ");

        if(this.Group1Course){
            System.out.print("Yes");
        }

        else{
            System.out.print("No");
        }

        return("");
    }

    //method to check if course is a required course
    public String checkRequired(){
        System.out.print("Is this course a Required Credit Course?: ");

        if(this.RequiredCourse){
            System.out.print("Yes");
        }

        else{
            System.out.print("No");
        }

        return("");
    }

    //method ot check if course is open elective
    public String checkOpenElective(){
        System.out.print("Is this course a Open Elective?: ");

        if(this.OpenElecCourse){
            System.out.print("Yes");
        }

        else{
            System.out.print("No");
        }

        return("");
    }

    //method to check if course is proffesinally realted
    public String checkProfRelated(){
        System.out.print("Is this course a Professinally Related?: ");

        if(this.ProfRelateCourse){
            System.out.print("Yes");
        }

        else{
            System.out.print("No");
        }

        return("");
    }

    //method to get the time of a course
    public String getTime(){
        return(this.CourseTime);
    }

    //method ot get the ID of a course
    public String getId(){
        return(this.CourseCode);
    }

    //method to get get program acronym
    public String getProgram(){
        return(this.CourseCode.substring(0, 3));
    }

    //method to return all the info of a specific course 
    public String getInfo(){
        System.out.println(this.CourseCode+" - "+this.CourseName);
        System.out.println(this.CourseDescription);
        System.out.println("Time course takes place: "+this.CourseTime);
        System.out.println(checkLiberalA());
        System.out.println(checkLiberalB());
        System.out.println(checkGroup1());
        System.out.println(checkOpenElective());
        System.out.println(checkRequired());
        System.out.println(checkProfRelated());
        System.out.println("");
        return("");
    }

    //method to set a new timing for the course
    public void setCourseTime(String Time){
        CourseTime = Time;
    }





}