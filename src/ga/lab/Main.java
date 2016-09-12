package ga.lab;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        String charString;
        double sumOfDoubles;
        int middleValue;

        //Problem 1:
        stringLengthOrValue("I said");
        stringLengthOrValue("hey");
        stringLengthOrValue("whats up?");
        stringLengthOrValue("hello!");

        //Problem 2:
        reversedOrder();

        //Problem 3:
        maxValue(new int[]{2, 52, 7, 91, 10, 12});
        maxValue(new int[]{12, 1, 11});
        maxValue(new int[]{0, 14});
        maxValue(new int[]{100, 23, 29, 101, 1});

        //Problem 4:

        summedDoubles = sumOfValues(new double[]{12.1, 13.9, 7.0});
        System.out.println(summedDoubles);
        //how do we print a variable to the command line

        summedDoubles = sumOfValues(new double[]{1.23, 2.09, 9.2});
        System.out.println(summedDoubles);
        //how do we print a variable to the command line

        summedDoubles = sumOfValues(new double[]{1.01, 15.1, 22.27, 19.99});
        System.out.println(summedDoubles);
        //how do we print a variable to the command line

        summedDoubles = sumOfValues(new double[]{3.08, 4.1, 7.2, 3.0});
        System.out.println(summedDoubles);
        //how do we print a variable to the command line


        //Problem 5:
        charString = charsToString(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(charString);
        //how do we print a variable to the command line

        charString = charsToString(new char[]{'t', 'h', 'e', 'r', 'e', '!'});
        System.out.println(charString);
        //how do we print a variable to the command line

        charString = charsToString(new char[]{'I', ' ', 'a','m', ' '});
        System.out.println(charString);
        //how do we print a variable to the command line

        charString = charsToString(new char[]{'A', ' ', 'S', 't', 'r', 'i', 'n', 'g', '.'});
        System.out.println(charString);
        //how do we print a variable to the command line

        //Problem 6:
        List<String> myStringList = new ArrayList<>();
        myStringList.add("This");
        myStringList.add("is");
        myStringList.add("my");
        myStringList.add("first");
        myStringList.add("list!");

        //Problem 7:
        reversedStringOrder(myStringList);

        //Problem 8:
        printOrAdd(myStringList);

        //Problem 9:
        int[] oddSizedArray = new int[7];
        for (int i = 0; i < oddSizedArray.length; i++){
            oddSizedArray[i] = (int) (Math.random() * 100);
        }

        //Problem 10:
        System.out.println(findMiddle(oddSizedArray));
        //how do we print a variable to the command line

        System.out.println(findMiddle(new int[]{2,7,9,12,15}));
        //how do we print a variable to the command line

        System.out.println(findMiddle(new int[]{13, 91, 27, 99, 14, 36, 10}));
        //how do we print a variable to the command line

        System.out.println(findMiddle(new int[]{100, 1, 45, 1092, 76, 12, 34, 11, 145}));
        //how do we print a variable to the command line

    }
    
// function 1
    public static void stringLengthOrValue(String stringLOV){

        if (stringLOV.length() > 5){
            System.out.println(stringLOV);
        }
        else {
            System.out.println(stringLOV.length());
        }
    }

    // function 2
    public static void reversedOrder(){

        int[] intArray2 = new int[10];
        for (int i = 0; i < intArray2.length; i++){
            intArray2[i] = i;
        }
        for (int i = intArray2.length-1; i >= 0; i--){
            System.out.println(intArray2[i]);
        }
    }

    // function 3
    public static void maxValue(int[] intArray3){

        int value3 = intArray3[0];
        for (int i = 0; i < intArray3.length; i++){
            if (intArray3[i] > value3) {
                value3 = intArray3[i];
            }
        }
        System.out.println(value3);
    }

    // function 4
    public static double sumOfValues(double[] doubleArray4){

        double value4 = 0.0;
        for (int i = 0; i < doubleArray4.length; i++){
            value4 = value4 + doubleArray4[i];
        }
        return value4;
    }

    // function 5
    public static String charsToString(char[] charArray5){

        String stringOfChars = "";
        for (int i = 0; i < charArray5.length; i++){
            stringOfChars = stringOfChars + charArray5[i];
        }
        return stringOfChars;
    }

    // function 7
    public static void reversedStringOrder(List<String> list7){

        for (int i = list7.size()-1; i >= 0; i--){
            System.out.println(list7.get(i));
        }
    }

    // function 8
    public static void printOrAdd(List<String> list8){

        if (list8.size() >= 10){
            for (int i = 0; i < list8.size(); i++){
                System.out.println(list8.get(i));
            }
        }
        else {
            for (int i = list8.size(); i < 10; i++){
                list8.add("Java" + (list8.size() + 1));
            }
            for (int i = 0; i < list8.size(); i++){
                System.out.println(list8.get(i));
            }
        }
    }

    // function 10
    public static int findMiddle(int[] intArray10){

        int middleNumber = (intArray10.length / 2);
        int middleValue = intArray10[middleNumber];
        return middleValue;

    }

}

