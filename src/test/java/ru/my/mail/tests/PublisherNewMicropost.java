package ru.my.mail.tests;

import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class PublisherNewMicropost extends TestBase {

    @Test
    public void testPublisherNewMicropost() {
        app.goToPublisherPage();
        app.fillPublisherForm("test");
        app.submitPublisherCreation();
    }

}
