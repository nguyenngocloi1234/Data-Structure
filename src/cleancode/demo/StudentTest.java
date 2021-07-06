package cleancode.demo;

public class StudentTest {


    public static void main(String[] args) {
        Student student = StudentConverter.converter("Loi 26 1993");
        System.out.println(student.toString());

//        StudentConverter studentConverter = new StudentConverter();
//        Student student = studentConverter.converter("Loi 24 1994");
//        System.out.println(student);
// lưu ý: từ khóa static là của class, nên khi gọi class. ( thuộc tính, phương thức static) không cần khởi tạo đối tượng
    }
}

