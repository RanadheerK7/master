package org.stackmybiz.exceptions;

public class ExceptionsTask {

    public void exceptionsTask(int num1, String num2) {
        try {
            int result = num1 /Integer.parseInt(num2);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Divisor can not be zero");
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Wrong input format");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("It is always executed");
            System.out.println("To do clean up activities");
        }
    }

    public static void main(String[] args) {
        ExceptionsTask task = new ExceptionsTask();
        task.exceptionsTask(10, "abc");
    }
}
