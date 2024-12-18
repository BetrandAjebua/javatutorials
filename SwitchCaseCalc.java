import java.util.Scanner;

public class SwitchCaseCalc {
    public static void main(String[] args) {
        double number1, number2;
        double result=0;
        String operator;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Operator: ");
        operator = sc.nextLine();

        System.out.print("Enter First Number: ");
        number1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Second Number: ");
        number2 = sc.nextDouble();
        sc.nextLine();

        switch (operator){
            case "+":
                result=number1+number2;
                break;
                case "-":
                    result=number1-number2;
                    break;
                    case "*":
                        result=number1*number2;
                        break;

                        case "/":
                            if(number2!=0){
                                result=number1/number2;
                        }else {
                                System.out.println("The number is not divisible by zero");
                            }
                            break;


        }
        System.out.printf("%f %s %f = %f", number1, operator, number2, result);
    }
}
