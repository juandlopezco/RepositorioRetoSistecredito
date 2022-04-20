package sistecredito.retofalabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import sistecredito.retofalabella.utils.Constants;

public class ValidatePriceProductMultiple implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        int cantProduct = actor.recall(Constants.CANT_PRODUCTS);
        int priceProduct = Integer.parseInt(actor.recall(Constants.PRICE_MULTIPLE_PRODUCTS));
        int priceShipping = Integer.parseInt(actor.recall(Constants.PRICE_SHIPPING));
        int priceFinal = Integer.parseInt(actor.recall(Constants.PRICE_FINAL));
        int sumPrices = (cantProduct*priceProduct)+priceShipping;

        return sumPrices == priceFinal;
    }
    public static ValidatePriceProductMultiple isCorrect(){
        return new ValidatePriceProductMultiple();
    }
}
