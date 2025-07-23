package page;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class cartpage {
	    WebDriver driver;

	    private By checkoutBtn = By.id("checkout");

	    public cartpage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void clickCheckout() {
	        driver.findElement(checkoutBtn).click();
	    }
	}


