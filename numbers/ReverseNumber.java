package org.stackmybiz.numbers;

public class ReverseNumber {

    public int reverseNumber(int number) {
        int revNumber = 0;
        while (number != 0) {
            int reminder = number % 10;
            revNumber = revNumber * 10 + reminder;
            number /= 10;
        }
        return revNumber;
    }

    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        int number = -10012;
        System.out.println(reverseNumber.reverseNumber(number));
    }
}
