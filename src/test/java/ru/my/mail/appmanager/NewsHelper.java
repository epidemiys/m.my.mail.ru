package ru.my.mail.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class NewsHelper extends HelperBase {

    public NewsHelper(WebDriver wd) {
        super(wd);
    }

    public boolean checkNewsFeeldEvent() {
       return isElementPresent(By.cssSelector(".event.mm-clickable.mm-goToEvent"));
    }

    public boolean checkNewsFeeldSettingButtom() {
        return isElementPresent(By.cssSelector(".eventControl.mm-clickable.mm-controls"));
    }

    public boolean checkNewsFeeldComment() {
        return isElementPresent(By.cssSelector(".eventButtons__item.eventButtons__comment"));
    }

    public boolean checkNewsFeeldLike() {
        return isElementPresent(By.cssSelector(".b-link.eventButtons__item.eventButtons__like.mm-clickable.mm-like.mm-count"));
    }
}