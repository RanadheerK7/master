package org.stackmybiz.collections;

import java.util.HashMap;
import java.util.Iterator;

public class BooksShoppingCart {

    HashMap<String, Double> books = new HashMap<String, Double>();

    public void addBooksToCart(String bookName, double bookPrice) {
        if (!checkBookExist(bookName)) {
            books.put(bookName, bookPrice);
        } else {
            System.out.println("Book " + bookName + " already existed");
        }
    }

    public boolean checkBookExist(String bookName) {
        if (books.containsKey(bookName)) {
            return true;
        }
        return false;
    }

    public void showBooksCart() {
        Iterator<String> booksKeySet = books.keySet().iterator();
        while (booksKeySet.hasNext()) {
            String bookKey = booksKeySet.next();
            System.out.println("Book Name: " + bookKey + " Price: " + books.get(bookKey));
        }
    }

    public double booksPriceCalculator() {
        double price = 0;
        Iterator<String> booksKeySet = books.keySet().iterator();
        while (booksKeySet.hasNext()) {
            String bookKey = booksKeySet.next();
            price += books.get(bookKey);
        }
        return price;
    }

}
