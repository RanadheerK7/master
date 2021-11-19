package org.stackmybiz.numbers;

public class SecondLargestElement {

    public void findSecondLargest(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Second largest element: " + numbers[numbers.length-2]);
    }

    public static void main(String[] args) {
        SecondLargestElement sl = new SecondLargestElement();
        int[] numbers = {20, 40, 60, 30, 60};
        sl.findSecondLargest(numbers);
    }
}
