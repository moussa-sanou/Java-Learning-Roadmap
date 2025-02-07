// Java program to illustrate the concept of Aggregation.

import java.util.List;

public class Student {

    String name;
    int id;
    String dept;

    Student(String name, int id, String dept)
    {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }
}
/* Department class contains list of student objects. It is associated with student
* class through its object(s). */

class Department
{
    String name;
    private List<Student> students;
    Department(String name, List<Student> students)
    {
        this.name = name;
        this.students = students;
    }

    public List<Student> getStudents()
    {
        return students;
    }
}