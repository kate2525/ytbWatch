import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AvtorizationPage extends AbstractPage {

    @FindBy(xpath = "//*[@id='buttons']/ytd-button-renderer/a")
    private WebElement avtorizButton;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//div[@id='identifierNext']")
    private WebElement buttonNext;

    @FindBy(xpath = "//div[@id='passwordNext']")
    private WebElement buttonNext2;

    private String email = "gluschenko.katja@gmail.com";
    private String password = "172301rfnz";

    public AvtorizationPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public YoutubePage avtorization(){
        avtorizButton.click();
        inputEmail.sendKeys(email);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        buttonNext.click();
        WebElement inputPassword = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        inputPassword.sendKeys(password);
        buttonNext2.click();

        return new YoutubePage(driver,driverWait);
    }
}
