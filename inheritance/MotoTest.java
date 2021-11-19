package org.stackmybiz.inheritance;

public class MotoTest {
    public static void main(String[] args) {
        MotoVersionOne one = new MotoVersionOne();
        one.makeCall();
        one.sendMessage();
        one.playGame();

        MotoVersionTwo two = new MotoVersionTwo();
        two.makeCall();
        two.touch();

        MotoVersionOne moto = new MotoVersionTwo();
        moto.playGame();
    }
}
