package ru.my.mail.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class ApplicationManager {

    WebDriver wd;

    private NavigationHelper navigationHelper;
    private ProfileHelper profileHelper;
    private PublisherHelper publisherHelper;
    private SessionHelper sessionHelper;
    private NewsHelper newsHelper;
    private VideoHelper videoHelper;
    private GroupHelper groupHelper;
    private GuestHelper guestHelper;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser.equals(BrowserType.CHROME)){
            wd = new ChromeDriver();
        } else if (browser.equals(BrowserType.SAFARI)) {
            wd = new ChromeDriver();
        } else if (browser.equals(BrowserType.FIREFOX)) {
            wd = new FirefoxDriver();
        }

        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get("http://m.my.mail.ru/cgi-bin/login");
        profileHelper = new ProfileHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        publisherHelper = new PublisherHelper(wd);
        sessionHelper = new SessionHelper(wd);
        newsHelper = new NewsHelper(wd);
        videoHelper = new VideoHelper(wd);
        groupHelper = new GroupHelper(wd);
        guestHelper = new GuestHelper(wd);
        sessionHelper.login("testqaqa", "Mytesting");
    }

    public void stop() {
        wd.quit();
    }

    public ProfileHelper getProfileHelper() {
        return profileHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public PublisherHelper getPublisherHelper() {
        return publisherHelper;
    }

    public NewsHelper getNewsHelper(){
        return newsHelper;
    }

    public VideoHelper getVideoHelper(){
        return videoHelper;
    }

    public GroupHelper getGroupHelper(){
        return groupHelper;
    }

    public GroupHelper getGuestHelper(){
        return groupHelper;
    }
}

