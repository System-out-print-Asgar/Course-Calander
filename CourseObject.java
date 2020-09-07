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

    //CD getter
    public String GetCourseDescription(){
        return(this.CourseDescription);
    }

    //CT getter
    public String GetCourseTime(){
        return(this.CourseTime);
    }

    //Check setter
    public Boolean SetCouseBoolean(String Input){
        String TestInput = SetCourseUpper(Input);
        if(TestInput.equalsIgnoreCase("yes") || TestInput.equalsIgnoreCase("y")){
            return(true);
        }
        else{
            return(false);
        }
    }


    //RC getter and setter
    public Boolean GetRequiredCourse(){
        return(this.RequiredCourse);
    }
    public String PrintRC(){
        System.out.println("Is this course a Required?: ");  
        if(this.RequiredCourse){
            return("Yes");
        }
        else{
            return("No");
        }
    }


    //GC getter and setter
    public Boolean GetGroup1Course(){
        return(this.Group1Course);
    }
    public String PrintGC(){
        System.out.println("Is this course a Group 1 Credit?: ");
        if(this.Group1Course){
            return("Yes");
        }
        else{
            return("No");
        }
    }


    //OC getter and setter
    public Boolean GetOpenElectiveCourse(){
        return(this.OpenElecCourse);
    }
    public String PrintOC(){
        System.out.println("Is this course a Open Elective?: ");
        if(this.OpenElecCourse){
            return("Yes");
        }
        else{
            return("No");
        }
    }


    //PC getter and setter
    public Boolean GetProfessionallyRelatedCourse(){
        return(this.ProfRelateCourse);
    }
    public String PrintPC(){
        System.out.println("Is this course a Professinally Related?: ");
        if(this.ProfRelateCourse){
            return("Yes");
        }
        else{
            return("No");
        }
    }


    //TAC getter and setter
    public Boolean GetTableACourse(){
        return(this.TableALibCourse);
    }
    public String PrintTAC(){
        System.out.println("Is this course a Table A Liberal?: ");
        if(this.TableALibCourse){
            return("Yes");
        }
        else{
            return("No");
        }
    }


    //TBC getter and setter
    public Boolean GetTableBCourse(){
        return(this.TableBLibCourse);
    }
    public String PrintTBC(){
        System.out.println("Is this course a Table B Liberal?: ");
        if(this.TableBLibCourse){
            return("Yes");
        }
        else{
            return("No");
        }
    }


   





}