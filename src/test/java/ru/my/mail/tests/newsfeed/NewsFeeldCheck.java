package ru.my.mail.tests.newsfeed;

import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 21.09.16.
 */
public class NewsFeeldCheck extends TestBase {

    @Test

    public void testNewsFeeldCheck(){
        app.getNavigationHelper().goToNewsFeeld();
    }
}
