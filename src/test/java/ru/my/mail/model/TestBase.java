package ru.my.mail.model;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.my.mail.appmanager.ApplicationManager;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
