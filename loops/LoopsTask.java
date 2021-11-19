package org.stackmybiz.loops;

public class LoopsTask {
    public static void main(String[] args) {
        String[] words = {"Welcome", "To", "StackMyBiz"};

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        int i = 0;
        while (i < words.length) {
            System.out.println(words[i]);
            i++;
        }

        int j = 0;
        do {
            System.out.println(words[j]);
            j++;
        } while (j < words.length);

        for (String word : words) {
            System.out.println(word);
        }

    }
}
