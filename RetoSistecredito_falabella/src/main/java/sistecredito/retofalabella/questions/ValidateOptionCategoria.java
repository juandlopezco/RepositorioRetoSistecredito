package sistecredito.retofalabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import sistecredito.retofalabella.userinterfaces.HomePage;

public class ValidateOptionCategoria implements Question <Boolean> {

    private String data;

    public ValidateOptionCategoria(String data) {
        this.data = data;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return HomePage.BUTTON_CATEGORIES.resolveFor(actor).getText().equals(data);
    }

    public static ValidateOptionCategoria isVisible(String data){
        return new ValidateOptionCategoria(data);
    }
}
