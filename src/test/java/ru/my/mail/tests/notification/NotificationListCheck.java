package ru.my.mail.tests.notification;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 21.09.16.
 */
public class NotificationListCheck extends TestBase {

    @Test

    public void testNotificationListCheck(){
        app.getNavigationHelper().goToNotificationPage();
        Assert.assertTrue(app.getNotificationHelper().checkFirstGuest());
        Assert.assertTrue(app.getNotificationHelper().checkGuestDataInfo());
    }
}
