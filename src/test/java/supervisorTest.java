import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class supervisorTest extends BaseTest {




    @Test
    public void failLoginTest() throws InterruptedException {
        driver.get("https://pocket-qa.dev.finanteq.com/sv/#/login");
        WebElement login = driver.findElement(By.id("login_field"));
        WebElement password = driver.findElement(By.id("password_field"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        login.sendKeys("blabal");
        password.sendKeys("as");
        loginButton.click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id^='profession']").toString().eq

    }


    @Test
    public void loginTest() throws InterruptedException {

        driver.get("https://pocket-qa.dev.finanteq.com/sv/#/login");
        WebElement login = driver.findElement(By.id("login_field"));
        WebElement password = driver.findElement(By.id("password_field"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        //Login
        Assert.assertFalse(loginButton.isEnabled());


        //Wprowadzenie prawidłowych danych
        login.sendKeys("sup_03");
        password.sendKeys("password");
        loginButton.click();
        Thread.sleep(3000);


    }

}
