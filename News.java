import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class News {
    public static void news(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try{
            List<WebElement> news;

            driver.get("https://www.bbc.com");
            news = driver.findElements(By.xpath("//h3[@class = 'gs-c-promo-heading_title gel-pica-bold nw-o-link-splite_text']"));
//        news = driver.findElements(By.id("comp-pattern-library-5"));
        int i;
        for(i = 0;i<=news.size();i++){
            String data =  news.get(i).getText();
            System.out.println(news);
            driver.navigate().to("http://localhost/mytest/indexttt.php");
            WebElement text = driver.findElement(By.id("text"));
            text.sendKeys(data);

        }


        }catch(Exception e){

        }
        //searchbox.clear();
        driver.close();
    }
    public static void main(String[] args) {
        News news = new News();
        news.news();



    }
}
