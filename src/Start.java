import com.student.manage.Student;
import com.student.manage.StudentDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Start {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Press 1 to Add student");
            System.out.println("Press 2 to Delete student");
            System.out.println("Press 3 to display student");
            System.out.println("Press 4 to exit student");
            int c = Integer.parseInt(br.readLine());
            if (c == 1) {
                // add student
                System.out.println("Enter user name:");
                String name = br.readLine();
                System.out.println("Enter user phone:");
                String phone = br.readLine();
                System.out.println("Enter user city:");
                String city = br.readLine();
                // create student object
                Student st = new Student(name, phone, city);
                boolean answer = StudentDao.insertStudent(st);
                System.out.println("Student added: "+answer);
            } else if (c ==2) {
                // delete student
                System.out.println("Enter student id to delete");
                int userId = Integer.parseInt(br.readLine());

                boolean answer = StudentDao.deleteStudent(userId);
                System.out.println("Student deleted: "+answer);
            }else if (c == 3) {
                // display student
                StudentDao.showStudent().forEach(System.out::println);

            }else if (c == 4){
                // exit
                break;
            }
            System.out.println("Thank you using my application..");
            System.out.println("See you soon.. bye");
        }

    }
}
