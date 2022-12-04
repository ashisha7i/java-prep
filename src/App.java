import com.pranshu.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Greeter greeter = new Greeter();
        greeter.greet("Pranshu");
        greeter.greet();

        Random random = new Random();
        random.random();
    }
}
