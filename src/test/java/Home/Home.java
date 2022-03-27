package Home;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.validation.ValidationEnums;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Home {
    private WebDriver driver;
    private Home_Main home_main;
    public final String BASE_URL = System.getProperty("BASE_URL");


    @BeforeClass
    public void Beforclass(){
        driver= DriverFactory.getDriver();
        BrowserActions.navigateToURL(driver ,BASE_URL);
        home_main = new Home_Main(driver);

    }

    @Test
    @Description("check_Our_Collection_text is OUR COLLECTION")
    public void check_Our_Collection_text(){
        home_main.check_Our_Collection_text();

        Validations.assertThat().browser(driver)
                .attribute(ValidationEnums.BrowserAttribute.PAGE_SOURCE)
                .contains("OUR COLLECTION")
                .withCustomReportMessage("check_Our_Collection_text is OUR COLLECTION")
                .perform();
    }
}
