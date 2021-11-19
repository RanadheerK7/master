package org.stackmybiz.inheritance;

public class MotoVersionTwo extends MotoVersionOne {
    public void touch() {
        System.out.println("It is a touch phone");
    }

    public void camera() {
        System.out.println("Click camera to take pictures");
    }

    public void playGame() {
        System.out.println("Games are overridden");
    }

}
