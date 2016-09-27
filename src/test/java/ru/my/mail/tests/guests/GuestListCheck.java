package ru.my.mail.tests.guests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 21.09.16.
 */
public class GuestListCheck extends TestBase {

    @Test

    public void testGuestListCheck(){
        app.getNavigationHelper().goToGuestPage();
        Assert.assertTrue(app.getGuestHelper().checkFirstGuest());
        Assert.assertTrue(app.getGuestHelper().checkLastVisitInfo());
        Assert.assertTrue(app.getGuestHelper().checkMoreFriendsButtom());
    }
}
