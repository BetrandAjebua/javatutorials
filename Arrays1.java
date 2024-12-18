import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {

//        DECLEARING AND INNITIALISING AN ARRAY

//        LOCALLY INNITIALISATION
//        char[] letters = new char[10];
//        letters[8]='a';
//        letters[9]='b';
//        letters[7]='c';
//        letters[6]='d';
//        letters[5]='e';
//        letters[4]='f';
//        letters[3]='g';
        char [] letters = {'f','h','d','g','a','e','c'}; //Formal innitialisatioin

//      PRINTING AND GETTING THE SIZE OF AN ARRAY
//        System.out.println(Arrays.toString(letters));//spaced out values
//        System.out.println(letters); //joiint calues
//        System.out.println("Size of an Array "+letters.length);//get the size of an Array

//        SORTING AN ARRAY
//        Arrays.sort(letters);
//        System.out.println("Sorted Array = "+Arrays.toString(letters));//spaced out values

//        PERFORMING ARRAY SEARCH
//        int foundIndex = Arrays.binarySearch(letters,'f');
//        System.out.println("Found Index = "+foundIndex);


//        Replacing everything in an array with a single value
//        Arrays.fill(letters,2,3,'c');
//        System.out.println("Fill array= "+Arrays.toString(letters));

//        Copying an Array
        int []arrOrigin = {2,5,7,9,34};
        int []arrcpy ={};

//        THE WRONG WAY TO COPY
//        arrcpy= arrOrigin;
//        Arrays.fill(arrOrigin,0);
//        System.out.println(Arrays.toString(arrcpy));
//        System.out.println(Arrays.toString(arrOrigin));

//                THE RIGHT WAY TO COPY
        arrcpy= Arrays.copyOf(arrOrigin,arrOrigin.length);// YOU COULD USE A arrOriginal.clone
//
//        OR YOU COULD COPY USING RANGE

//        arrcpy= Arrays.copyOfRange(arrOrigin,2,10);// YOU COULD USE A arrOriginal.clone
//
//        System.out.println(Arrays.toString(arrcpy));
//        System.out.println(Arrays.toString(arrOrigin));
////        pRINTING OUT THE COMPARISM OF TWO ARRAYS
//
////        Comparing Two Arrays
//        System.out.println(Arrays.compare(arrOrigin,arrcpy));


    }
}
