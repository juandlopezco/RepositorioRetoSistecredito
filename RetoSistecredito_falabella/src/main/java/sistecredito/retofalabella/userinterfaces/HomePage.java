package sistecredito.retofalabella.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target BUTTON_CATEGORIES = Target.the("button_categories").locatedBy("//span[@class='HamburgerBtn-module_title__26h1r']");
    public static final Target SEARCH_PRODUCT = Target.the("search_product").locatedBy("//input[@class='SearchBar-module_searchBar__Input__1VvhT']");
    public static final Target TEXT_PRODUCT_RESULT = Target.the("text_product_result").locatedBy("//h3[@class='jsx-860724461']");
    public static final Target ADD_PRODUCT = Target.the("add_product").locatedBy("//div[@id='testId-searchResults-products']/div[1]/div[1]/div[1]");
    public static final Target BUTTON_ADD_BAG = Target.the("button_add_bag").locatedBy("//button[@class='jsx-2166277967 button button-primary button-primary-xtra-large']");
    public static final Target PRICE_PRODUCT = Target.the("price_product").locatedBy("//span[@class='copy14 primary  jsx-3548557188 normal      ']");
    //public static final Target PRICE_PRODUCT = Target.the("price_product").locatedBy("//span[@class='copy10 primary high jsx-3548557188 normal      ']");
    public static final Target BUTTON_INCREMENT_PRODUCT = Target.the("button_increment_product").locatedBy("//button[@id='testId-stepper-increment-btn']");
    public static final Target BUTTON_CONTINUE_BUYING = Target.the("button_increment_product").locatedBy("//button[@class='jsx-2166277967 button button-secondary-link']");
    public static final Target BUTTON_WATCH_SHOPPING_BAG = Target.the("button_watch_shopping_bag").locatedBy("//a[@id='linkButton']");
    public static final Target BUTTON_CAR = Target.the("button_car").locatedBy("//li[@id='testId-UserAction-basket']");



    public static final Target BUTTON_GO_SHOPPING = Target.the("button_go_shopping").locatedBy("//button[@class='fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase']");
    public static final Target BUTTON_REGION = Target.the("button_region").locatedBy("//select[@id='region']");
    public static final Target BUTTON_CITY = Target.the("button_city").locatedBy("//select[@id='ciudad']");
    public static final Target BUTTON_COMMUNE = Target.the("button_commune").locatedBy("//select[@id='comuna']");
    public static final Target BUTTON_CONTINUE = Target.the("button_continue").locatedBy("//button[@class='fbra_button fbra_test_button fbra_formItem__field04']");
    public static final Target INPUT_ADDRESS = Target.the("input_address").locatedBy("//input[@id='address']");
    public static final Target INPUT_DATES_GENERAL = Target.the("input_date_general").locatedBy("//input[@id='departmentNumber']");
    public static final Target BUTTON_ENTER_ADDRESS = Target.the("button_enter_address").locatedBy("//button[@class='fbra_button fbra_test_button fbra_formItem__useAddress']");
    public static final Target BUTTON_CONTINUE_GO_PAY = Target.the("button_continue_go_pay").locatedBy("//button[@class='fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton']");
    public static final Target PRICE_SHIPPING = Target.the("price_shipping").locatedBy("//span[@class='fbra_price__purchasedPrice fbra_test_price__purchasedPrice']");
    public static final Target PRICE_FINAL = Target.the("price_final").locatedBy("//span[@class='fbra_text fbra_test_orderSummary__totalCostPrice fbra_orderSummary__totalCostPrice']");
    //public static final Target TEXT_STOCK = Target.the("text_stock").locatedBy("(//span[@class='copy5 primary  jsx-3548557188 normal      '])[2]");
    public static final Target TEXT_STOCK = Target.the("text_stock").locatedBy("//div[@class='jsx-3640063463 additional-information']/div[4]/div[1]/span[2]/span[1]");






}
