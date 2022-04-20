package sistecredito.retofalabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import sistecredito.retofalabella.userinterfaces.HomePage;
import sistecredito.retofalabella.utils.Constants;

public class SelectPoduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(HomePage.ADD_PRODUCT));
        actor.remember(Constants.PRICE_PRODUCT,HomePage.PRICE_PRODUCT.resolveFor(actor).getText().
                replace(Constants.SYMBOL,Constants.EMPTY).replace(Constants.SYMBOL_POINT,Constants.EMPTY).replace(Constants.PRICE_FINAL_,Constants.EMPTY));
        actor.attemptsTo(Click.on(HomePage.BUTTON_ADD_BAG));
        WaitUntil.the(HomePage.BUTTON_WATCH_SHOPPING_BAG, WebElementStateMatchers.isVisible());
        actor.attemptsTo(Click.on(HomePage.BUTTON_WATCH_SHOPPING_BAG));
        actor.attemptsTo(Click.on(HomePage.BUTTON_GO_SHOPPING));

    }
    public static SelectPoduct selectPoduct(){
        return Tasks.instrumented(SelectPoduct.class);
    }

}
