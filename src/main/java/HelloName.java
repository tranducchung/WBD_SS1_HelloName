import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name you in here");
        name = scanner.next();
        System.out.println("Hello " + name);
    }
}
