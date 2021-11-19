package org.stackmybiz.collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListTask {
    public static void main(String[] args) {
        //Creating an array list object and adding elements to it
        ArrayList list = new ArrayList();
        list.add("StackMyBiz");
        list.add(1);
        list.add(20.0);
        list.add(true);

        //Access the element using get method
        System.out.println(list.get(0));
        System.out.println(list.get(2));

        //Accessing the elements using Iterator cursor(we can also use ListIterator for List Interface implemented classes)
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        /* With Generics */
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        //Using for each loop to access the elements
        for (Integer values : list1) {
            System.out.println(values);
        }

        // Get the size using size method
        System.out.println("Size: " + list1.size());

        //Checking the element present inside the list or not
        System.out.println(list1.contains(30));

        //Adding one collection object to the another one
        list.addAll(list1);
        System.out.println(list);

        //Empty the list
        list1.clear();
        System.out.println(list1);

        //Remove element using its index position(we can directly remove the object also)
        list.remove(5);
        System.out.println(list);


        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);

        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(10);
        list3.add(80);
        list3.add(50);
        list3.add(60);
        list3.add(70);

        //It keeps elements which are matched
        list2.retainAll(list3);
        System.out.println(list2);


        ArrayList<Integer> list4 = new ArrayList<Integer>();
        list4.add(10);
        list4.add(20);
        list4.add(30);
        list4.add(40);
        list4.add(50);

        ArrayList<Integer> list5 = new ArrayList<Integer>();
        list5.add(10);
        list5.add(80);
        list5.add(50);
        list5.add(60);
        list5.add(70);

        //It removes all elements which are matched
        list4.removeAll(list5);
        System.out.println(list4);

        System.out.println(list5.indexOf(50));

        List<String> words = Collections.synchronizedList(new ArrayList<String>());
        words.add("Stack");
        words.add("My");
        words.add("Biz");
        synchronized (words) {
            for (String word : words) {
                System.out.println(word);
            }
        }

        CopyOnWriteArrayList<String> wordList = new CopyOnWriteArrayList<String>();
        wordList.add("Welcome");
        wordList.add("To");
        wordList.add("StackMyBiz");
        Iterator<String> wordsList = wordList.iterator();
        while (wordsList.hasNext()) {
            System.out.println(wordsList.next());
        }
    }
}
