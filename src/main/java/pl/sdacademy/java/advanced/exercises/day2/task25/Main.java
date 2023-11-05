package pl.sdacademy.java.advanced.exercises.day2.task25;

public class Main {

    public static void main(String[] args) { //throws BasketEmptyException{
        Basket basket = new Basket();
        try {
            basket.removeFromBasket();
        } catch(Exception e) {
            System.out.println(e);
        }

        try {
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
        } catch(Exception e) {
            System.out.println(e);
        }
        //basket.removeFromBasket();
    }
}
