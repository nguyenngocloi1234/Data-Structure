package cleancode.demo;

public class Student {
    private String name;
    private int age;
    private int yearOfBirth;
    private String studentDetail;

    public Student(String studentDetail) {
        this.studentDetail = studentDetail;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getStudentDetail() {
        return studentDetail;
    }

    public void setStudentDetail(String studentDetail) {
        this.studentDetail = studentDetail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", yearOfBirth=" + yearOfBirth +
                ", studentDetail='" + studentDetail + '\'' +
                '}';
    }
}
