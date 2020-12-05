package mx.mixteco.javatest.discounts;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorShould {
    @Test
    public void total_zero_when_there_are_not_prices(){
        PriceCalculator calculator = new PriceCalculator();
        assertThat(calculator.getTotal(), CoreMatchers.is(0.0));
    }

    @Test
    public void total_is_the_sum_of_the_prices(){
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrices(10.2);
        calculator.addPrices(15.5);
        assertThat(calculator.getTotal(), CoreMatchers.is(25.7));
    }

    @Test
    public void apply_discount_to_prices(){
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrices(10.5);
        calculator.addPrices(17.5);

        calculator.setDiscount(50);

        assertThat(calculator.getTotal(), CoreMatchers.is(14.0));
    }
}