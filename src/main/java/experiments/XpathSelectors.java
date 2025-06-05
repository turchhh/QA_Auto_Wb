package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathSelectors {
    WebDriver driver = new ChromeDriver();

    @Test
    public void selectorsRadioButtonPage(){
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        hideBanner();
        hideFooter();
//        WebElement radioButtonYes = driver.findElement(By.cssSelector("label[for='yesRadio"));
        WebElement radioButtonYes = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        radioButtonYes.click();
//        WebElement radioButtonImp = driver.findElement(By.xpath("//input[@id='impressiveRadio']"));
        pause(3);
        WebElement radioButtonImp = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        radioButtonImp.click();
        pause(3);
        driver.quit();
    }

    @Test
    public void selectorsTextBox(){
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        hideBanner();
        hideFooter();
        WebElement inputName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        inputName.sendKeys("Valeriya");
        pause(3);
        WebElement inputEmail = driver.findElement(By.xpath("//input[@type='email']"));
        inputEmail.sendKeys("valeriya.qa@gmail.com");
        pause(3);
        WebElement inputCurAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        inputCurAddress.sendKeys("Raanana");
        pause(3);
        WebElement inputPerAddress = driver.findElement(By.xpath("//div[@id='permanentAddress-wrapper']//textarea"));
        inputPerAddress.sendKeys("Perez 24");
        pause(3);
        WebElement btnSubmit = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        btnSubmit.click();
        pause(3);
        WebElement output = driver.findElement(By.xpath("//div[@id='output']"));
        System.out.println(output.getText());
        driver.quit();
    }

    public void pause(int time){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void hideBanner(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#fixedban').style.display='none'");
    }

    public void hideFooter(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('footer').style.display='none'");
    }
}
