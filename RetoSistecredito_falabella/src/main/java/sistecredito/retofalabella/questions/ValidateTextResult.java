package sistecredito.retofalabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import sistecredito.retofalabella.utils.Constants;

public class ValidateTextResult implements Question<Boolean> {
    String messageResult;

    public ValidateTextResult(String messageResult) {
        this.messageResult = messageResult;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String message;

        message = messageResult+Constants.COMPONENTS_ONE+actor.recall(Constants.PRODUCTS_RANDOM)+Constants.COMPONENTS_TWO;

        return actor.recall(Constants.TEXT_RESULT).equals(message);

    }
    public static ValidateTextResult isCorrect(String messageResult){
        return new ValidateTextResult(messageResult);
    }
}
