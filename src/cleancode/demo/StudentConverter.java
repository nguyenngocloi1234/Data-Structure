package cleancode.demo;

public class StudentConverter {
    public static final int NAME_PART = 0;
    public static final int AGE_PART =1;
    public static final int YEAR_OF_BIRTH_PART = 2;
    public static final String SPLIT_REGEX = " " ;

    public StudentConverter() {
    }

    public static Student converter(String studentDetail){

        String[] studentPart = studentDetail.split(SPLIT_REGEX);
        Student student = new Student();
        student.setName(studentPart[NAME_PART]);
        student.setAge(Integer.parseInt(studentPart[AGE_PART]));
        student.setYearOfBirth(Integer.parseInt(studentPart[YEAR_OF_BIRTH_PART]));
        return student;

    }
}
