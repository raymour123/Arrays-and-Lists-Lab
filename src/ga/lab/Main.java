package ga.lab;

public class Main {
// This is obviously not finished but I have been making some great strides and will complete it over the weekend //
    // I just need to get some sleep before I tackle this paper rock scissors project tomorrow//
    public static void main(String[] args) {

        String charString;
        double summedDoubles;
        int middleValue;

        //Problem 1:
        String[] stringLengthOrValue = new String[4];

        stringLengthOrValue("I said");
        stringLengthOrValue("hey");
        stringLengthOrValue("whats up?");
        stringLengthOrValue("hello!");
    }

    public static void stringLengthOrValue(String y) {
        if (y.length() > 5) {
            System.out.println(y);
        } else {
            System.out.println(y.length());
        }
    }


        int length = stringLengthOrValue.length;

        System.out.println(stringLengthOrValue[0].length());
        System.out.println(stringLengthOrValue[1].length());
        System.out.println(stringLengthOrValue[2].length());
        System.out.println(stringLengthOrValue[3].length());

        for (int i = 0; i <= stringLengthOrValue.length - 1; i++){
            stringLengthOrValue[i] = i;
        }
*/


        //Problem 2:
        reversedOrder();
    }

    public static void reversedOrder() {

        int[] reversedOrder = new int[10];

        for (int i = 0; i < reversedOrder.length - 1; i++) {
            reversedOrder[i] = i;


            for (int i = reversedOrder.length -1; i >= 0; i--){
                System.out.println(reversedOrder[i]);
            }

        }
    }

}


/**
        //Problem 3:
        int[] maxValue = new int [];

        maxValue(new int[]{2, 52, 7, 91, 10, 12});
        maxValue(new int[]{12, 1, 11});
        maxValue(new int[]{0, 14});
        maxValue(new int[]{100, 23, 29, 101, 1});

        for (i = 0; i < maxValue.length; i++) {
        if (maxValue[i] > largest) {
        largest = maxValue[i];
        system.out.println(largest);
/**
        //Problem 4:

        _____ = sumOfValues(new double[]{12.1, 13.9, 7.0});
        //how do we print a variable to the command line

        _____ = sumOfValues(new double[]{1.23, 2.09, 9.2});
        //how do we print a variable to the command line

        _____ = sumOfValues(new double[]{1.01, 15.1, 22.27, 19.99});
        //how do we print a variable to the command line

        _____ = sumOfValues(new double[]{3.08, 4.1, 7.2, 3.0});
        //how do we print a variable to the command line


        //Problem 5:
        _____ = charsToString(new char[]{'h', 'e', 'l', 'l', 'o'});
        //how do we print a variable to the command line

        _____ = charsToString(new char[]{'t', 'h', 'e', 'r', 'e', '!'});
        //how do we print a variable to the command line

        _____ = charsToString(new char[]{'I', ' ', 'a','m', ' '});
        //how do we print a variable to the command line

        _____ = charsToString(new char[]{'A', ' ', 'S', 't', 'r', 'i', 'n', 'g', '.'});
        //how do we print a variable to the command line

        //Problem 6:
        //Put your code for problem 6 here

        //Problem 7:
        reversedStringOrder(/*use the List you created in problem 6*);

        //Problem 8:
        printOrAdd(/*use the List you created in problem 6*///);
/**
        //Problem 9:
        //Create an int array of an odd size, with the variable name 'oddSizedArray'
        //Make sure the size is at least 5.

        //Problem 10:
        findMiddle(/*use the array you created in problem 9*///);
 /**       //how do we print a variable to the command line

        findMiddle(new int[]{2,7,9,12,15});
        //how do we print a variable to the command line

        findMiddle(new int[]{13, 91, 27, 99, 14, 36, 10});
        //how do we print a variable to the command line

        findMiddle(new int[]{100, 1, 45, 1092, 76, 12, 34, 11, 145});
        //how do we print a variable to the command line **/



    //declare your functions

