/**
 * Created by sjoshi on 10-04-2019.
 */
public class URLValidator {

    public static boolean isUrlValidToCrawl(String nextUrl, String domainUrl) {

        if (!nextUrl.startsWith(domainUrl)) {
            return false;
        }
        if (nextUrl.startsWith("javascript:")) {
            return false;
        }
        if (nextUrl.contains("mailto:")) {
            return false;
        }
        if (nextUrl.startsWith("#")) {
            return false;
        }
        if (nextUrl.endsWith(".swf")) {
            return false;
        }
        if (nextUrl.endsWith(".pdf")) {
            return false;
        }
        if (nextUrl.endsWith(".png")) {
            return false;
        }
        if (nextUrl.endsWith(".gif")) {
            return false;
        }
        if (nextUrl.endsWith(".jpg")) {
            return false;
        }
        if (nextUrl.endsWith(".jpeg")) {
            return false;
        }
        return true;
    }
}
