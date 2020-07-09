import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class BarcodeLookup {

    public static void main(String[] args) {
       final String url = "https://www.barcodelookup.com/897034002342";
       final String urlM = "https://www.barcodelookup.com/300230798303";
       try{
            final Document doc = Jsoup.connect(urlM).get();
           Elements info = doc.select("div.col-md-6.product-details");
           //System.out.println(info);
           Elements element = doc.select("div.col-md-6.product-details h4");
           System.out.println(element);
           System.out.println(element.toString());
           System.out.println(element.text());

            //System.out.println(doc.outerHtml());
       }catch (Exception e) {
           e.printStackTrace();
       }
    }
}
