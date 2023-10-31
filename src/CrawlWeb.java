import javax.swing.text.Document;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * Role of this class is to Crawl through the sites provided and gather predefined set of data to be compared.
 * @author Anoop Manikanta Subramani
 * */
public class CrawlWeb {
    private void crawl() {
        Document document = Jsoup.
    }


    /**
    * This function crawls through the website given and returns the data gathered.
    * @return Map<String,String> - Map containing a dictionary of data scrapped from the website.
    * */
    public Map<String, String> getDataFrom(URI uri) {
        return new HashMap<>();
    }

    /**
     * Main method is used for test purposes only.
     * */
    public static void main(String[] args) {
        CrawlWeb crawlWeb = new CrawlWeb();
    }
}
