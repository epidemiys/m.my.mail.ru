package ru.my.mail.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void goToPublisherPage() {
        click(By.cssSelector("a.menu__item.m-publish"));
    }

    public void goToFriendPage() {
        click(By.xpath("//*[@class='leftmenu__pic m-friends']"));

    }

    public void goToMyProfilePage() {
        click(By.xpath("//*[@class='leftmenu__pic m-avatar']"));
    }

    public void goToGroupPage() {
        click(By.xpath("//*[@class='leftmenu__pic m-friends']"));
    }

    public void goToMyMusicPage() {
        click(By.xpath("//*[@class='leftmenu__pic m-music']"));
    }

    public void goToMyMusicCatalog() {
        click(By.xpath("//*[@class='tabs']/div[1]"));
    }

    public void goToMyMusicMyMusicPage() {
        click(By.xpath("//*[@class='tabs']/div[2]"));
    }

    public void goToMyMusicMyMusicPlaylistCheck() {
        //Необходимо оптимизировать xpath
        click(By.xpath("//*[@id='wrap']/div[5]/div[3]/div[2]/a"));
    }

    public void goToMyMusicFriends() {
        click(By.xpath("//*[@class='tabs']/div[3]"));
    }

    public void goToMyMusicMyReccomendationPage() {
        click(By.xpath("//*[@class='tabs']/div[4]"));
    }

    public void goToGuestPage() {
        click(By.xpath("//*[@class='leftmenu__pic m-guests']"));
    }

    public void goToMassegePage() {
        click(By.xpath("//*[@class='menu__item m-discussion']"));
    }

    public void goToNewsFeeld() {
        click(By.xpath("//*[@class='leftmenu__pic m-feed']"));
    }

    public void goToNotificationPage() {
        click(By.xpath("//*[@class='menu__item m-notify']"));
    }

    public void goToMyVideoPage() {
        click(By.xpath("//*[@class='leftmenu__pic m-videotop']"));
    }
}
