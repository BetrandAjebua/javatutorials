import java.util.Scanner;

public class ScannerOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Name: ");
        String namey = sc.nextLine();
        System.out.printf("%s is such a nice name:, whats your age? ", namey);
        int age = sc.nextInt();
        System.out.printf("%d is such a good age: ", age);

        System.out.print("Whats your Natieve Language... ");
        sc.nextLine();//Cleaning the buffer
        String language = sc.nextLine();

        System.out.printf("%s You  Speak %s , Welcome, have a Nice Stay here with us: ", namey, language);

    }
}
