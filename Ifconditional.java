import java.util.Scanner;

public class Ifconditional {
    static  int number1, number2;
    static  String operator1;
   static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
            String switch1 = "c";
        while (switch1.contains("c")) {
            System.out.println("\nEnter First Number: ");
            number1=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Second Number: ");
            number2=sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Second Operator: ");
            operator1=sc.nextLine();
            if (operator1.equals("+")) {
                System.out.printf("%d + %d = %d",number1, number2, number1 + number2);
            }
            else    if (operator1.equals("-")) {
                System.out.printf("%d - %d = %d",number1, number2, number1 - number2);
            }
            else    if (operator1.equals("*")) {
                System.out.printf("%d * %d = %d",number1, number2, number1 * number2);
            }
            else if (operator1.equals("/")) {
                if (number2 != 0) {
                    System.out.printf("%d / %d = %f",number1, number2, number1 / (float)number2);

                }else {
                    System.out.println("division by Zero not Posible");
                }
            }else{
                System.out.printf("\n%s is a wrong operator not recognise",operator1);

            }
System.out.print("\nEnter c to continue and q to quit");
            switch1 = sc.nextLine();
    }

        sc.close();
}
}
