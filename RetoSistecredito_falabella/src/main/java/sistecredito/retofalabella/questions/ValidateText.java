package sistecredito.retofalabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import sistecredito.retofalabella.utils.Constants;

public class ValidateText implements Question<Boolean> {
    String message;
    public ValidateText(String message) {
        this.message = message;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return actor.recall(Constants.TEXT_STOCK).equals(message);
    }
    public static ValidateText isEquals(String message){
        return new ValidateText(message);
    }
}
