package sistecredito.retofalabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import sistecredito.retofalabella.utils.Constants;

public class ValidatePrice implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        int priceProduct = Integer.parseInt(actor.recall(Constants.PRICE_PRODUCT));
        int priceShipping = Integer.parseInt(actor.recall(Constants.PRICE_SHIPPING));
        int priceFinal = Integer.parseInt(actor.recall(Constants.PRICE_FINAL));
        int sumPrices = priceProduct+priceShipping;

        return sumPrices == priceFinal;
    }
    public static ValidatePrice isCorrect(){
        return new ValidatePrice();
    }
}
