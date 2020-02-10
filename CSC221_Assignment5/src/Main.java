//USER ERRORS TO HANDLE
//    1. If invalid character entered
//    2. If entered dollar amount has length > 9        DONE

//QUESTIONS
//    1. Format. with ending 0s?
//    2. Implement user interface?

import java.util.Scanner;

public class Main {

    static boolean checkAllDigits(char[] aCharArray) {
        boolean aBoolean = false;
        for(int i = 0; i < aCharArray.length; i++) {
            if(Character.isDigit(aCharArray[i])) {
                aBoolean = true;
            }
            else{
                aBoolean = false;
                break;
            }
        }

        return aBoolean;
    }

    public static void main(String[] args) {
        int spaces = 9;
        char[] starCharArray = new char[spaces];
        for(int i = 0; i < spaces; i++) {
            starCharArray[i] = '*';
        }

        System.out.println("Enter a dollar amount with length less than or equal to 9 characters: ");
        Scanner dollarAmountScanner = new Scanner(System.in);
        String dollarAmountString = dollarAmountScanner.next();
        char[] dollarAmountCharArray = dollarAmountString.toCharArray();
        boolean allDigits = checkAllDigits(dollarAmountCharArray);

        while(dollarAmountCharArray.length > 9 || !allDigits) {
            System.out.println("Please enter a dollar amount with length less than or equal to 9 characters: ");
            dollarAmountScanner = new Scanner(System.in);
            dollarAmountString = dollarAmountScanner.next();
            dollarAmountCharArray = dollarAmountString.toCharArray();

            allDigits = checkAllDigits(dollarAmountCharArray);
        }

        int inputLength = dollarAmountString.length();

        dollarAmountString.getChars(0, inputLength, starCharArray, spaces - inputLength);
        System.out.println(starCharArray);
    }
}
