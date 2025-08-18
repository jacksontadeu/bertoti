import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i != 0) {
                System.out.println(num + "Nao é primo");

            } else {
                System.out.println(num  + " é primo");
            }
        }
    }
}