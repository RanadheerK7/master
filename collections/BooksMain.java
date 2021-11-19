package org.stackmybiz.collections;

public class BooksMain {
    public static void main(String[] args) {
        BooksShoppingCart cart = new BooksShoppingCart();

        cart.addBooksToCart("Maths", 500.0);
        cart.addBooksToCart("Physics", 400.0);
        cart.addBooksToCart("Chemistry", 450.0);
        cart.addBooksToCart("Geography", 600.0);
        cart.addBooksToCart("History", 550.0);

        String bookName = "Maths";
        System.out.println(bookName + " book exist or not: " + cart.checkBookExist("Maths"));

        cart.showBooksCart();

        System.out.println("Price of Books: " + cart.booksPriceCalculator());
    }
}
