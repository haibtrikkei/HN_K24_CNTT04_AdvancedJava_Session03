package demo_optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Demo_Optional {
    public static void main(String[] args) {
        //Bình thường
        Student s = null;  //s có thể null hoặc không null

        //Sử dụng Optional
        Optional<Student> os;

        os = Optional.ofNullable(s);

//        System.out.println(s.toString());
        if (os.isPresent()) {
            System.out.println(os.get());
        }else{
            System.out.println("No student found");
        }
    }
}
