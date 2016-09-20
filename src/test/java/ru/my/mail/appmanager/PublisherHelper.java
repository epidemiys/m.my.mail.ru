package ru.my.mail.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class PublisherHelper {
    private FirefoxDriver wd;

    public PublisherHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void submitPublisherCreation() {
        wd.findElement(By.xpath("//div[@class='menu__list']//span[.='Отпр.']")).click();
    }

    public void fillPublisherForm(String name) {
        wd.findElement(By.name("arg_text")).sendKeys(name);
    }
}
