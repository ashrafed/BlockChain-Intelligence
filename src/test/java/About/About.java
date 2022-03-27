package About;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.validation.ValidationEnums;
import com.shaft.validation.Validations;
import com.shaft.validation.ValidationsExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class About {
    private WebDriver driver ;
    private About_Main about_main;
    public final String BASE_URL = System.getProperty("BASE_URL");

    @BeforeClass
    public void beforclass(){
        driver = DriverFactory.getDriver();
        BrowserActions.navigateToURL(driver ,BASE_URL);
        about_main = new About_Main(driver);
    }


    @Test
    public void about(){
        about_main.about();

//        Validations.assertThat().browser(driver)
//                .attribute(ValidationEnums.BrowserAttribute.PAGE_SOURCE)
//                .contains("OUR STORY & PHILOSOPHY")
//                .perform();
    }

}
