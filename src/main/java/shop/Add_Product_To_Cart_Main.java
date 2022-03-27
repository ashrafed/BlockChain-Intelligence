package shop;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Add_Product_To_Cart_Main {
    private WebDriver driver;
    public Add_Product_To_Cart_Main(WebDriver driver){
        this.driver = driver;
    }

    By shop_path_1 = By.xpath("//p[.='Shop']");
    By product_path_2 = By.xpath("(//img[@alt=\"I'm a product\"])[4]");
    By choose_product_color_xpath_3 = By.xpath("//div[contains(@style,'background-color: rgb(0, 0, 0);')]");
    By product_input_path_4 = By.xpath("//input[@aria-label='Quantity']");
    By button_xpath_5 = By.xpath("//span[@class='buttonnext1002411228__content']");


    // check add one item = C$25.00
    public void Add_One_Product_To_Cart(){
        new ElementActions(driver)
                .click(shop_path_1)
                .click(product_path_2)
                .click(choose_product_color_xpath_3)
                .click(product_input_path_4)
                .click(button_xpath_5);
    }

    // check add Three items = C$75.00
    public void Add_Three_Product_To_Cart(){
        new ElementActions(driver)
                .click(shop_path_1)
                .click(product_path_2)
                .click(choose_product_color_xpath_3)
                .type(product_input_path_4 , "3")
                .click(button_xpath_5);
    }

    // check add ten items = C$200.00
    public void Add_ten_Product_To_Cart(){
        new ElementActions(driver)
                .click(shop_path_1)
                .click(product_path_2)
                .click(choose_product_color_xpath_3)
                .type(product_input_path_4 , "10")
                .click(button_xpath_5);
    }
}



