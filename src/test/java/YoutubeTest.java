
import org.testng.annotations.Test;

public class YoutubeTest extends BeforeAfterClass{


    @Test()
    public void init(){
        AvtorizationPage avt = new AvtorizationPage(driver,driverWait);
        avt
                .avtorization()
                .findChanel()
                .watch();
    }
}
