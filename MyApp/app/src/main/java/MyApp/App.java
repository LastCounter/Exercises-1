/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MyApp;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Scanner input = new Scanner(System.in);
        boolean isNumber;

        do {
            System.out.print("Enter the number for x: ");
            if (input.hasNextInt()) {
                int readNumber1 = input.nextInt();
                isNumber = true;
            }else
                System.out.println("Wrong Input!");
                isNumber = false;
                input.next();

        }while (!(isNumber = true));
        System.out.print("Enter number for y: ");
        int readNumber2 = input.nextInt();


}
}
