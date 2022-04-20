package sistecredito.retofalabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import sistecredito.retofalabella.models.DataProduct;
import sistecredito.retofalabella.userinterfaces.HomePage;
import sistecredito.retofalabella.utils.Constants;
import sistecredito.retofalabella.utils.Wait;

public class OptionsDispatch implements Task {
    DataProduct data;

    public OptionsDispatch(DataProduct data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.keyValues(data.getRegion()).into(HomePage.BUTTON_REGION));
        actor.attemptsTo(Enter.keyValues(data.getCity()).into(HomePage.BUTTON_CITY));
        actor.attemptsTo(Enter.keyValues(data.getCommune()).into(HomePage.BUTTON_COMMUNE));
        actor.attemptsTo(Click.on(HomePage.BUTTON_CONTINUE));
        actor.attemptsTo(Enter.keyValues(data.getAddress()).into(HomePage.INPUT_ADDRESS));
        actor.attemptsTo(Enter.keyValues(data.getComplement()).into(HomePage.INPUT_DATES_GENERAL));
        actor.attemptsTo(Click.on(HomePage.BUTTON_ENTER_ADDRESS));
        actor.remember(Constants.PRICE_SHIPPING,HomePage.PRICE_SHIPPING.resolveFor(actor).getText()
                .replace(Constants.SYMBOL_REPLACE,Constants.EMPTY).replace(Constants.SYMBOL_POINT,Constants.EMPTY));
        WaitUntil.the(HomePage.BUTTON_CONTINUE_GO_PAY, WebElementStateMatchers.isPresent());
        actor.attemptsTo(Click.on(HomePage.BUTTON_CONTINUE_GO_PAY));
        actor.remember(Constants.PRICE_FINAL,HomePage.PRICE_FINAL.resolveFor(actor).getText()
                .replace(Constants.SYMBOL_REPLACE,Constants.EMPTY).replace(Constants.SYMBOL_POINT,Constants.EMPTY));
        Wait.stopExecutions(5000);
    }
    public static OptionsDispatch optionsDispatch(DataProduct data){
        return Tasks.instrumented(OptionsDispatch.class, data);
    }
}
