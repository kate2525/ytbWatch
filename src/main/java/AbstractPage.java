import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {

        protected WebDriver driver;
        protected WebDriverWait driverWait;

        public AbstractPage(WebDriver driver, WebDriverWait driverWait) {
            this.driver = driver;
            this.driverWait = driverWait;
            PageFactory.initElements(driver, this);
        }
}
