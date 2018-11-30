package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class NBMarketPage {

    public ComparisonPage addItemsToCompare(int numberOfItems) {
        $$(By.className("g-i-tile-i-box-desc")).first(numberOfItems).forEach(p -> {
            p.hover().find(".g-compare").hover().click();
            p.find(By.className("incomparison")).shouldBe(Condition.appears);
        });
        $(By.id("comparison")).click();
        $(By.xpath(".//*[@class='btn-link-to-compare']/a")).click();
        return new ComparisonPage();
    }
}
