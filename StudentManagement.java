import java.util.*;
class Student
{
    int studentID;
    String studentName;
    String department;
    Student(int id, String n, String d)
    {
        studentID = id;
        studentName = n;
        department = d;
    }
    void displayStudentDetails()
    {
        if(studentID<=0)
            System.out.println("Invalid Student ID");
        else
            System.out.println("Student Id: " + studentID);
        if(studentName.isEmpty())
            System.out.println("Invalid Student Name");
        else
            System.out.println("Student Name: " + studentName);
        if(department.isEmpty())
            System.out.println("Invalid Department");
        else
            System.out.println("Department: " + department);
    }
}
class Undergraduate extends Student
{
    int semester;
    double cgpa;
    Undergraduate(int id, String n, String d, int sem, double cg)
    {
        super(id, n, d);
        semester = sem;
        cgpa = cg;
    }
    void displayUGDetails()
    {
        if(semester<=0 || semester>8)
            System.out.println("Invalid Semester");
        else
            System.out.println("Semester: " + semester);
        if(cgpa<=0 || cgpa>10)
            System.out.println("Invalid CGPA");
        else
            System.out.println("CGPA: " + cgpa);
    }
}
class Postgraduate extends Student
{
    String specialization;
    String researchTopic;
    Postgraduate(int id, String n, String d, String spe, String res)
    {
        super(id, n, d);
        specialization = spe;
        researchTopic = res;
    }
    void displayPGDetails()
    {
        if(specialization.isEmpty())
            System.out.println("Invalid Specialization");
        else
            System.out.println("Specialization: " + specialization);
        if(researchTopic.isEmpty())
            System.out.println("Invalid Research Topic");
        else
            System.out.println("Research Topic: " + researchTopic);
    }
}
class StudentManagement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student Id");
        int i = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student name");
        String n = sc.nextLine();
        System.out.println("Enter department");
        String d = sc.nextLine();
        System.out.println("Enter semester");
        int s = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter cgpa");
        double c = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter specialization");
        String sp = sc.nextLine();
        System.out.println("Enter research topic");
        String r = sc.nextLine();
        System.out.println("-----Student Details-----");
        Student obj = new Student(i, n, d);
        obj.displayStudentDetails();
        System.out.println("-----Undergraduate Details-----");
        Undergraduate u = new Undergraduate(i, n, d, s, c);
        u.displayUGDetails();
        System.out.println("-----Postgraduate Details-----");
        Postgraduate p = new Postgraduate(i, n, d, sp, r);
        p.displayPGDetails();
    }
}