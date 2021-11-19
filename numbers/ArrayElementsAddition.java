package org.stackmybiz.numbers;

public class ArrayElementsAddition {
    public int addArrayElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayElementsAddition addition = new ArrayElementsAddition();
        int[] number = {10, 20, 30, 40, 50};
        System.out.println(addition.addArrayElements(number));
    }
}
