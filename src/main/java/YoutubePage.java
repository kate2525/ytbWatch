import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class YoutubePage extends AbstractPage{

    private String URL_CHANEL="https://www.youtube.com/channel/UCxRDxMCvxGyhImEM2I7cxFw";
    private String VIDEO ="https://www.youtube.com/watch?v=44s7YM_VzTQ";

    public YoutubePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public YoutubePage findChanel(){

      driver.get(URL_CHANEL);
      WebElement tab = (new WebDriverWait(driver, 20))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tabsContent\"]/paper-tab[2]/div")));
      tab.click();
      return this;
    }

    public void watch(){

        driver.get(VIDEO);
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().refresh();
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
