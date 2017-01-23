package January.Lesson5;

public class Student
{
    String firstName;
    String lastName;
    int gradeLevel;
    double gpa;
    private static int num;
    private int ID;
    public Student ()
    {
        num++;
        ID = num;
        firstName = "None";
        lastName = "None";
        gradeLevel = 0;
        gpa = 0.0;
    }
    public Student (String fN, String lN, int gL, double gp)
    {
        num++;
        ID = num;
        firstName = fN;
        lastName = lN;
        if (gL >= 0 && gL <= 12)
        {
            gradeLevel = gL;
        }
        else
        {
            gradeLevel = 0;
        }
        if (gp >= 0 && gp <= 4.5)
        {
            gpa = gp;
        }
        else
        {
            gpa = 0;
        }
    }
    public String toString()
    {
        return (lastName + ", " + firstName + "\n" + "GPA: " + gpa + "\n" + "Grade Level: " + gradeLevel + " id # " + ID);
    }
}