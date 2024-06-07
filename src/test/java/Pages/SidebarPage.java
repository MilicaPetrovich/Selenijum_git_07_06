package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SidebarPage {
    // trazenje lokatora

    WebDriver driver;

    WebElement practiceButton;

    public SidebarPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement getPracticeButton() {
        return driver.findElement(By.id("menu-item-20"));
    }

    //-----------------------------------
    // akcije nad lokatorima

    public void clickOnPracticeButton(){
        getPracticeButton().click();
    }

}
