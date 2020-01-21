/**
 * Food
 */
public class School extends Thing 
{
    
    private String type;
    private int typeI;
    private double avggpa;
    private String name;
    private String color;
    private int students;
    
    String[] schoolType = {"Pre School", "Kindergarten", "Elementary", "Junior High", "High School", "College", "Other"};


    //Default Constructor
    public School()
    {
        
    }

    public School(String color, String name, int students, int type, double avggpa)
    {
        
        this.type = schoolType[type];
        this.typeI = type;
        this.avggpa = avggpa;
        this.students = students;
        this.name = name;
        this.color = color;
    }

    //accessors
    public String getColor()
    {
        return this.color;
    }

    public String getName ()
    {
        return this.name;
    }

    public int getStudents()
    {
        return this.students;
    }

    public String getType()
    {
        return this.type;
    }

    public int getTypeI()
    {
        return this.typeI;
    }

    public double getAvgpa()
    {
        return this.avggpa;
    }

    //end accessors


    //mutators
    public void setColor(String color)
    {
        this.color = color;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public void setStudents(int students) 
    {
        this.students = students;
    }

    public void setType(int type)
    {
        this.type = schoolType[type];
    }

    public void setTypeI(int type) 
    {
        this.typeI = type;
    }

    public void setAvggpa(double avggpa)
    {
        this.avggpa = avggpa;
    }




    @Override
    public String toString() 
    {
        if (this.avggpa == 0.0)
        {
            return "\nSchool Name: " + this.name + "\nSchool Colors: " + this.color + "\nNumber of Students: " + this.students + "\nType of School: " + this.type + "\naverage GPA could not be found";
        }
        return "\nSchool Name: " + this.name + "\nSchool Colors: " + this.color + "\nNumber of Students:" + this.students + "\nType of School: " + this.type + "\nAverage GPA: " + this.avggpa;
    }
}