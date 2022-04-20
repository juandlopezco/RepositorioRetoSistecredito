package sistecredito.retofalabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import sistecredito.retofalabella.models.DataProduct;
import sistecredito.retofalabella.userinterfaces.HomePage;
import sistecredito.retofalabella.utils.Constants;
import sistecredito.retofalabella.utils.RandomProduct;

import javax.xml.crypto.Data;

public class SearchProductRandom implements Task {
    DataProduct data;

    public SearchProductRandom(DataProduct data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        data.setProductRandom(RandomProduct.generateString());
        actor.remember(Constants.PRODUCTS_RANDOM,data.getProductRandom());
        actor.attemptsTo(Enter.theValue(data.getProductRandom()).into(HomePage.SEARCH_PRODUCT).thenHit(Keys.ENTER));
        actor.remember(Constants.TEXT_RESULT,HomePage.TEXT_PRODUCT_RESULT.resolveFor(actor).getText());

    }
    public static SearchProductRandom random(DataProduct data){
        return Tasks.instrumented(SearchProductRandom.class, data);
    }
}
