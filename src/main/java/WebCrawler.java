import org.apache.commons.validator.routines.UrlValidator;

/**
 * Created by sjoshi on 10-04-2019.
 */
public class WebCrawler {


    public static void main(String[] args) {

        // timeout connection after 500 miliseconds
        System.setProperty("sun.net.client.defaultConnectTimeout", "500");
        System.setProperty("sun.net.client.defaultReadTimeout",    "1000");

        if(args.length < 1) {
            System.err.println("Provide an URL as argument to the WebCrawler class.");
            System.out.println("USAGE : java -cp web-crawler-1.0.jar com.web.crawler.WebCrawler");
            return;
        }

        String inputURL = args[0];
        //Check the URL is valid
        UrlValidator defaultValidator = new UrlValidator();
        if (!defaultValidator.isValid(inputURL)) {
            System.err.println("Provide a valid URL as argument to the WebCrawler class.");
        }
        Crawler baseCrawler = new Crawler(inputURL);
        baseCrawler.crawl();
    }
}
