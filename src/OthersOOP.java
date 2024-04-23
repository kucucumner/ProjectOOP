import java.io.FileWriter;
import java.io.IOException; // 예외 추가

public class OthersOOP {
    public static void main(String[] args) throws IOException {
        // class : System, Math, FileWriter
        // instance : f1, f2
        System.out.println(Math.PI);
        System.out.println(Math.floor(1.8)); // 내림
        System.out.println(Math.ceil(1.8)); // 올림

        FileWriter f1 = new FileWriter("data.txt"); // new 를 인해서 뒤에 따라오는 클래스의 복제본을 만든다.
        f1.write("Hello");
        f1.write("JAVA");
        f1.close();

        FileWriter f2 = new FileWriter("data2.txt"); // new 를 인해서 뒤에 따라오는 클래스의 복제본을 만든다.
        f2.write("Hello");
        f2.write("JAVA2");
        f2.close();
    }
}
