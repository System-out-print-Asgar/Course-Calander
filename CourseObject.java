import java.security.PublicKey;

//This will hold the methods of the course objects and what will work on them

public class CourseObject {

    //Course Object Private variables
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


    //constructor method
    public CourseObject(String CC, String CN, String CD, String CT, Boolean RC, Boolean GC, Boolean TAC, Boolean TBC, Boolean OC, Boolean PC){
       CourseCode = CC;
       CourseName = CN;
       CourseDescription = CD;
       CourseTime = CT;
       RequiredCourse = RC;
       Group1Course = GC;
       TableALibCourse = TAC;
       TableBLibCourse = TBC;
       OpenElecCourse = OC;
       ProfRelateCourse = PC;
    }


    //Upcase Setter
    public String SetCourseUpper(String Input){
        String Nospace = Input.replaceAll("\\s+","");
        String UppercaseSTR = Nospace.toUpperCase();
        return(UppercaseSTR);
    }

    //CC getter
    public String GetCourseCode(){
        return(this.CourseCode);       
    }

    //CN getter
    public String GetCourseName(){
        return(this.CourseName);
    }

    //CT getter
    public String GetCourseTime(){
        return(this.CourseTime);
    }

    //Check Getter
    public Boolean SetCouseBoolean(String Input){

        TestInput = SetCourseUpper(Input);

        



    }

    //RC getter 
    public Boolean GetRequiredCourse(){
        return(this.RequiredCourse);
    }

    //GC getter
    public Boolean GetGroup1Course(){
        return(this.Group1Course);
    }

    //OC getter
    public Boolean GetOpenElectiveCourse(){
        return(this.OpenElecCourse);
    }

    //PC getter
    public Boolean GetProfessionallyRelatedCourse(){
        return(this.ProfRelateCourse);
    }

    //TAC getter
    public Boolean GetTableACourse(){
        return(this.TableALibCourse);
    }

    //TBC getter
    public Boolean GetTableBCourse(){
        return(this.TableBLibCourse);
    }


   





}