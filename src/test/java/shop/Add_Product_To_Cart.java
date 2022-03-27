package shop;

import Home.Home_Main;
import com.mysql.cj.xdevapi.Schema;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.validation.ValidationEnums;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class Add_Product_To_Cart {
    private WebDriver driver;
    public Add_Product_To_Cart_Main add_Product_To_Cart_Main;
    public static final String BASE_URL = System.getProperty("BASE_URL");




    @BeforeMethod
    public void beforclass(){

        driver= DriverFactory.getDriver();
        BrowserActions.navigateToURL(driver ,BASE_URL);
        add_Product_To_Cart_Main = new Add_Product_To_Cart_Main(driver);

    }


    @Test
    @Description("check add one item = C$25.00")
    public void Add_One_Product_To_Cart(){
        add_Product_To_Cart_Main.Add_One_Product_To_Cart();

        Validations.assertThat().browser(driver)
                .attribute(ValidationEnums.BrowserAttribute.PAGE_SOURCE)
                .contains("C$25.00")
                .withCustomReportMessage("check add one item = C$25.00")
                .perform();
    }


    @Test
    @Description("check add Three items = C$75.00")
    public void Add_three_Product_To_Cart(){
        add_Product_To_Cart_Main.Add_Three_Product_To_Cart();

        Validations.assertThat().browser(driver)
                .attribute(ValidationEnums.BrowserAttribute.PAGE_SOURCE)
                .contains("C$25.00")
                .withCustomReportMessage("check add Three items = C$75.00")
                .perform();
    }


    @Test
    @Description("check add Three items = C$200.00")
    public void Add_ten_Product_To_Cart(){
        add_Product_To_Cart_Main.Add_Three_Product_To_Cart();

        Validations.assertThat().browser(driver)
                .attribute(ValidationEnums.BrowserAttribute.PAGE_SOURCE)
                .contains("C$25.00")
                .withCustomReportMessage("check add ten items = C$200.00")
                .perform();
    }


    @AfterMethod
    public void afterethod(){
        BrowserActions.closeCurrentWindow(driver);
    }
}
