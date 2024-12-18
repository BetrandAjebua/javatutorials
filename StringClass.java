public class StringClass {
    public static void main(String[] args) {
        String litteralString1 = "ABC";
        String litteralString2 = "aef";

        String objectString1 = new String("abc");
        String objectString2 = new String("aef");


//        using equal comparism
//        System.out.println((litteralString1==litteralString2));//True
//        System.out.println(litteralString1==objectString1);//False
//        System.out.println(objectString2==objectString1);//False



        //        using equal compareTo
//        System.out.println((litteralString1.compareTo(litteralString2)));//-3
//        System.out.println(litteralString1.compareTo(objectString1));//0
//        System.out.println(objectString2.compareTo(objectString1));//3



        //        using equal equals
//        System.out.println((litteralString1.equals(litteralString2)));//false
//        System.out.println(litteralString1.equals(objectString1));//true
//        System.out.println(objectString2.equals(objectString1));//false


        //        using equal equalsIgnorcase
//        System.out.println((litteralString1.equalsIgnoreCase(litteralString2)));//false
//        System.out.println(litteralString1.equalsIgnoreCase(objectString1));//true
//        System.out.println(objectString2.equalsIgnoreCase(objectString1));//false

//        STRING METHODS
        String objectString3 = new String("");
        System.out.println(objectString3.length());//length
        System.out.println(objectString3.isEmpty());//bolean

        System.out.println(objectString3.isBlank());//boolean

        //FORMATED STREET
        int age = 23;
        String name="Betrand Ajebua";
        Boolean imPresent = false;
        System.out.println(String.format(" Good Day, my name is %s i am %d it is %b " +
                "that I am present",name,age,imPresent ).toUpperCase());
        System.out.println(String.format(" Good Day, my name is %s i am %d it is " +
                "%b that I am present",name,age,imPresent ).toLowerCase());
        System.out.println(String.format(" Good Day, my name is %s i am %d it is %b that" +
                " I am present",name,age,imPresent ).toCharArray());
        System.out.println(String.format(" Good Day, my name is %s i am %d it is %b that I a" +
                "m present",name,age,imPresent ).contains("Good Day e"));



    }
}
