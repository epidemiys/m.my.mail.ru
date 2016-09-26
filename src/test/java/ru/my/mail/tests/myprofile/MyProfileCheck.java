package ru.my.mail.tests.myprofile;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 21.09.16.
 */
public class MyProfileCheck extends TestBase {

    @Test

    public void testMyProfilePage() {
        app.getNavigationHelper().goToMyProfilePage();
        Assert.assertTrue(app.getProfileHelper().checkProfileAvatar());
    }
}

