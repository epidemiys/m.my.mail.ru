package ru.my.mail.tests.messege;

import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 21.09.16.
 */
public class MassegeListCheck extends TestBase {

    @Test

    public void testMassegeListCheck(){
        app.getNavigationHelper().goToMassegePage();
        Assert.assertTrue(app.getMassengerHelper().checkSearch);
    }
}
