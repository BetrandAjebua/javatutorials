public class LogicalTenaryOp {
    public static void main(String[] args) {
//        LOGICAL OPERATORS
//        GREATER THAN
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        System.out.println(num1>num2);


//        Less than operator
        System.out.println(num1<num3);

//        Greater than or Equal to
        System.out.println(num2>=num3);

//        lessthan or equal to
        System.out.println(num2<=num3);

//        Not equal too
        System.out.println(num3!=num2);

//        TENARY OPERATORS AND
        System.out.println(num3>num2 && num3<40);

        //        TENARY OPERATORS OR
        System.out.println(num3<num2 || num3<25);
    }
}
