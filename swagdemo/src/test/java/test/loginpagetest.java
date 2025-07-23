package test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.basepage;
import page.DataProviderClass;

public class loginpagetest extends basepage {
	


    @Test(dataProvider = "loginData", dataProviderClass = DataProviderClass.class)
    public void testLogin(String username, String password, boolean isValid) throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        
        Thread.sleep(2000); // Wait for the page to load
        
        if (isValid) {
            // Assert that the login is successful
            Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"), "Login failed for " + username);
        } else {
            // Assert that an error message is displayed
            Assert.assertTrue(driver.getCurrentUrl().contains("saucedemo.com"), "Error message not displayed for " + username);
        }
        
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        
        // Go to cart
        driver.findElement(By.className("shopping_cart_link")).click();
        // Click checkout
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(3000);
        
        // Fill checkout form
        driver.findElement(By.id("first-name")).sendKeys("kayal");
        driver.findElement(By.id("last-name")).sendKeys("R");
        driver.findElement(By.id("postal-code")).sendKeys("638183");
        Thread.sleep(3000);
        
        
        // Continue to overview
        driver.findElement(By.id("continue")).click();
        Thread.sleep(3000);
        
        
        // Finish order
        driver.findElement(By.id("finish")).click();
        Thread.sleep(3000);
        
        
        // Go back to home
        driver.findElement(By.id("back-to-products")).click();
        Thread.sleep(3000);
        
        // Open menu and logout
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(3000);
        // Wait briefly for menu to appear
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("logout_sidebar_link")).click();
        // Assert logout success
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("saucedemo.com"), "Logout failed or incorrect redirection.");
        
        
        
    }
}

