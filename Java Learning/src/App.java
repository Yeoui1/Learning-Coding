import java.io.InputStream;

public class App {
    public static void main(String[] args) throws Exception {
        InputStream name;
        name = System.in;
        System.out.println("Hello " + name);
    }
}