package ru.my.mail.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class ApplicationManager {
    FirefoxDriver wd;

    public void init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://m.my.mail.ru/cgi-bin/login");
        login("testqaqa", "Mytesting");
    }

    public void login(String username, String password) {
        wd.findElement(By.name("Login")).click();
        wd.findElement(By.name("Login")).clear();
        wd.findElement(By.name("Login")).sendKeys(username);
        wd.findElement(By.name("Password")).click();
        wd.findElement(By.name("Password")).clear();
        wd.findElement(By.name("Password")).sendKeys(password);
        wd.findElement(By.xpath("//div[@class='heightContent']/form/div[3]/input")).click();
    }

    public void submitPublisherCreation() {
        wd.findElement(By.xpath("//div[@class='menu__list']//span[.='Отпр.']")).click();
    }

    public void fillPublisherForm(String name) {
        wd.findElement(By.name("arg_text")).sendKeys(name);
    }

    public void goToPublisherPage() {
        wd.findElement(By.cssSelector("a.menu__item.m-publish")).click();
    }

    public void stop() {
        wd.quit();
    }

    public void goToFriendPage() {
        wd.findElement(By.linkText("Друзья")).click();
    }
}
