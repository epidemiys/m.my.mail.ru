package ru.my.mail.tests.publisher;

import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class PublisherNewMicropost extends TestBase {

    @Test
    public void testPublisherNewMicropost() {
        app.getNavigationHelper().goToPublisherPage();
        app.getPublisherHelper().fillPublisherForm("test");
        app.getPublisherHelper().submitPublisherCreation();
    }

}
