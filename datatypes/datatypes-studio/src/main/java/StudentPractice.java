import java.util.ArrayList;


public class StudentPractice {
    public static void main(String[] args) {
        // Instantiate Student, Teacher, and Course objects
        Student student = new Student();
        student.setName("Casey");          // Replace with your actual name
        student.setStudentId(1993);             // Replace with your student ID
        student.setNumberOfCredits(1);         // Set the number of credits for this class
        student.setGpa(4.0);                   // Set your GPA

        Teacher teacher = new Teacher("John", "Martin", "Math", 20);
        Course course = new Course("Computer Science", teacher);

        // Enroll the student in the course
        course.setEnrolledStudent(student);
    }
}

class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;


    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    // Getters and setters for the Teacher class could be added here

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }
}

class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic, Teacher instructor) {
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
    }

    public void setEnrolledStudent(Student student) {
        enrolledStudents.add(student);
    }
}
