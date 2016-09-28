package ru.my.mail.tests.messege;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 21.09.16.
 */
public class MassegeListCheck extends TestBase {

    @Test

    public void testMassegeListCheck(){
        app.getNavigationHelper().goToMassegePage();
        Assert.assertTrue(app.getMessengerHelper().checkSearchInputForm());
        Assert.assertTrue(app.getMessengerHelper().checkFirstMassegeDialog());
        Assert.assertTrue(app.getMessengerHelper().checkShowMoreButtom());
        Assert.assertTrue(app.getMessengerHelper().checkDataInfo());
    }
}
