package experiments;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Css_selectors {
    WebDriver driver = new ChromeDriver();
    @Test
    public void selectorsHomePage(){
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        hideBanner();
        hideFooter();
        pause(2);
        WebElement footer = driver.findElement(By.tagName("footer"));
        WebElement imgTools = driver.findElement(By.cssSelector("img[src='/images/Toolsqa.jpg']"));
        System.out.println(imgTools.getTagName());
        System.out.println(imgTools.getAttribute("src"));
        pause(2);
        WebElement divElements = driver.findElement(By.cssSelector(".card-up"));
        divElements.click();
        pause(2);
        WebElement radioButton = driver.findElement(By.id("item-2"));
        radioButton.click();
        pause(2);
        WebElement radioButtonYes = driver.findElement(By.cssSelector("label[for='yesRadio"));
        radioButtonYes.click();
        pause(2);
        driver.navigate().back();
        pause(2);
        driver.navigate().back();
        pause(2);
        hideFooter();
        pause(2);
        WebElement bookStore = driver.findElement(By.cssSelector("div[class='category-cards'] div[class='card mt-4 top-card']:last-child"));
        bookStore.click();
        pause(2);
        driver.navigate().back();











        pause(3);
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
