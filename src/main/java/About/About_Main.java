package About;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class About_Main {
    private WebDriver driver;

    public About_Main(WebDriver driver){
        this.driver =driver;
    }

    By about_path_1 = By.xpath("//p[.='About']");
    By OUR_STORY_path_2 = By.xpath("//span[.='OUR STORY & PHILOSOPHY']");


    public void about(){
        new ElementActions(driver)
                .click(about_path_1);
    }




}
