package Home;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Main {
    private WebDriver driver;

    public Home_Main(WebDriver driver){
        this.driver = driver;
    }

    By home_path_1 = By.xpath("//p[.='Home']");

    public By Our_Collection_path_2(){
        return By.xpath("//span[.='OUR COLLECTION']");
    }

    public void check_Our_Collection_text(){
        new ElementActions(driver)
                .click(home_path_1);
    }
}
