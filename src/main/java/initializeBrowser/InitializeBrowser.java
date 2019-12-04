package initializeBrowser;

import com.codeborne.selenide.Configuration;


public class InitializeBrowser {

    public void InitializeBrowserSession () {

        Configuration.browser= "initializeBrowser.ChromeCustomProvider";
        Configuration.startMaximized=true;
        Configuration.screenshots = true;
        Configuration.reportsFolder= "./screenshots/";

        if(System.getProperty("headless").contains("Yes")) {
            Configuration.headless=true;
        }
        if(System.getProperty("remote").contains("Yes")) {
            Configuration.remote = "http://selenium.dev.lwolf.com:4444/wd/hub";
            System.setProperty("chromeoptions.args", "--user-agent=Chrome/77");
        }
        String Env = System.getProperty("Env");
        switch (Env) {
            case("Pre"):
                System.setProperty("baseUrl", "https://td2.transactionDesk.com/legacy");
                break;
            case("Stg"):
                System.setProperty("baseUrl", "https://td2.stg.transactionDesk.com/legacy");
                break;
        }
    }

}
