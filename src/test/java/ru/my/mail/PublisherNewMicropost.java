package ru.my.mail;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PublisherNewMicropost {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://m.my.mail.ru/cgi-bin/login");
        wd.findElement(By.name("Login")).click();
        wd.findElement(By.name("Login")).sendKeys("\\undefined");
        wd.findElement(By.name("Password")).click();
        wd.findElement(By.name("Password")).sendKeys("\\undefined");
        wd.findElement(By.name("Login")).click();
        wd.findElement(By.name("Login")).clear();
        wd.findElement(By.name("Login")).sendKeys("testqaqa");
        wd.findElement(By.name("Password")).click();
        wd.findElement(By.name("Password")).clear();
        wd.findElement(By.name("Password")).sendKeys("Mytesting");
        wd.findElement(By.xpath("//div[@class='heightContent']/form/div[3]/input")).click();
    }
    
    @Test
    public void testPublisherNewMicropost() {
        wd.findElement(By.cssSelector("a.menu__item.m-publish")).click();
        wd.findElement(By.name("arg_text")).click();
        wd.findElement(By.name("arg_text")).clear();
        wd.findElement(By.name("arg_text")).sendKeys("test");
        wd.findElement(By.xpath("//div[@class='menu__list']//span[.='Отпр.']")).click();
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
}
