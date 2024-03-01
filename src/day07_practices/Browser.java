package day07_practices;

public class Browser {
    public static void main(String[] args) {

        String browserName = "firefox"; // assuming it will always be lowercase

        String browser = " browser is selected";

        if (browserName == "chrome" || browserName == "firefox" || browserName == "opera"
                || browserName == "safari" || browserName == "edge") {
            if (browserName == "chrome"){
                browser = browserName + browser;
            } else if (browserName == "firefox") {
                browser = browserName + browser;
            } else if (browserName == "opera") {
                browser = browserName + browser;
            } else if (browserName == "safari") {
                browser = browserName + browser;
            } else {
                browser = browserName + browser;
            }
        } else {
            browser = "invalid browser";
        }

        System.out.println(browser);
    }
}
