import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sjoshi on 10-04-2019.
 */
public class Crawler {
    protected Set<String> crawledUrls = new HashSet<String>();
    protected String domainUrl = null;

    public Crawler(String domainUrl) {
        this.domainUrl = domainUrl;
    }

    public void crawl() {

        long startTime = System.currentTimeMillis();

        this.retrieveLinks(domainUrl);

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.println("URL's crawled: " + this.crawledUrls.size() + " in " + totalTime + " ms (avg: " + totalTime / this.crawledUrls.size() + ")");
    }

    protected void retrieveLinks(String URL) {

        //valid URL check
        if (!URLValidator.isUrlValidToCrawl(URL, domainUrl)) return; // skip this URL.
        if (!crawledUrls.contains(URL)) {
            try {
                if (crawledUrls.add(URL)) {
                    System.out.println(URL);
                }
                Document document = Jsoup.connect(URL).get();
                Elements linksOnCurrentPage = document.select("a[href]");
                for (Element page : linksOnCurrentPage) {
                    retrieveLinks(page.attr("abs:href"));
                }
            } catch (IOException e) {
                System.err.println("For '" + URL + "': " + e.getMessage());
            }
        }
    }
}
