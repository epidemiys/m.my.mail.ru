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
        login("testqaqa", "Mytesting");
    }

    private void login(String username, String password) {
        wd.findElement(By.name("Login")).click();
        wd.findElement(By.name("Login")).clear();
        wd.findElement(By.name("Login")).sendKeys(username);
        wd.findElement(By.name("Password")).click();
        wd.findElement(By.name("Password")).clear();
        wd.findElement(By.name("Password")).sendKeys(password);
        wd.findElement(By.xpath("//div[@class='heightContent']/form/div[3]/input")).click();
    }

    @Test
    public void testPublisherNewMicropost() {
        goToPublisherPage();
        fillPublisherForm("test");
        submitPublisherCreation();
    }

    private void submitPublisherCreation() {
        wd.findElement(By.xpath("//div[@class='menu__list']//span[.='Отпр.']")).click();
    }

    private void fillPublisherForm(String name) {
        wd.findElement(By.name("arg_text")).sendKeys(name);
    }

    private void goToPublisherPage() {
        wd.findElement(By.cssSelector("a.menu__item.m-publish")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
}
