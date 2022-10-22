package Projects;

public class Project2Task4 {
    public static void main(String[] args) {

        RemoteWebDriver[] objs = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (RemoteWebDriver obj : objs) {
            obj.open();
            obj.navigate();
            obj.getTitle();
            obj.close();

        }


    }
}

interface WebDriver {
    void open();

    void close();

    String getTitle();
}

interface RemoteWebDriver extends WebDriver {
    void navigate();
}

interface TakeScreenshot extends RemoteWebDriver {
    void takeScreenshot();
}

class ChromeDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("open Chrome browser.");
    }

    @Override
    public void close() {
        System.out.println("close Chrome browser.");
    }

    @Override
    public String getTitle() {
        String title = "Chrome page Title";
        System.out.println(title);
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("navigate to  Chrome browser.");
    }
}

class FirefoxDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("open Firefox browser.");
    }

    @Override
    public void close() {
        System.out.println("close Firefox browser.");
    }

    @Override
    public String getTitle() {
        String title = "Firefox page Title";
        System.out.println(title);
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("navigate to Firefox browser.");
    }
}

class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("open Safari browser.");
    }

    @Override
    public void close() {
        System.out.println("close Safari browser.");
    }

    @Override
    public String getTitle() {
        String title = "Safari page Title";
        System.out.println(title);
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("navigate to Safari browser.");
    }
}