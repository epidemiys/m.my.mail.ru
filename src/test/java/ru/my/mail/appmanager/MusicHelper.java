package ru.my.mail.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by aleksandr.petrov on 28.09.16.
 */
public class MusicHelper extends HelperBase {

    public MusicHelper(WebDriver wd) {
        super(wd);
    }

    public boolean checkShowMore() {
        return isElementPresent(By.cssSelector(".show-more.mm-clickable.mm-showMore"));
    }

    public boolean checkFirstPlaylist() {
        return isElementPresent(By.cssSelector(".list-item__wrap"));
    }

    public boolean checkFirstFriend() {
        return isElementPresent(By.cssSelector(".list-item__wrap"));
    }

    public boolean checkPlaylistInfo() {
        return isElementPresent(By.cssSelector(".list-item__date"));
    }

    public boolean checkFirstTrack() {
        return isElementPresent(By.cssSelector(".eventContent__audio.mm-clickable.mm-audioPlay"));
    }
}