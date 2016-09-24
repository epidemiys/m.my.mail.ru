package ru.my.mail.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class PublisherHelper extends HelperBase {

    public PublisherHelper(WebDriver wd) {
        super(wd);
    }

    public void submitPublisherCreation() {
        click(By.xpath("//*[@class='menu__button mm-clickable mm-publisherSend mm-count']"));
    }

    public void fillPublisherForm(String text) {
        type(By.name("arg_text"), text);
    }

}
