package mx.mixteco.javatest.discounts;

import java.util.ArrayList;

public class PriceCalculator {
    private double discount;
    private ArrayList<Double> prices = new ArrayList<>();

    public double getTotal() {
        double result = 0.0;
        for (Double price: prices) {
            result += price;
        }
        return result * ((100 - discount) /100);
    }

    public void addPrices(double price) {
        prices.add(price);
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
