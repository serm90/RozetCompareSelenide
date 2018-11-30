package pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ComparisonPage {

    public void checkDiffersCount() {
        $(By.xpath(".//*[@href='#only-different']")).click();
        $$(By.xpath(".//*[@class='comparison-t-row']")).shouldHaveSize(countDiffersManually());
    }

    private int countDiffersManually() {
        int counter = 0;
        List<String> firstItem = new ArrayList<>();
        List<String> secondItem = new ArrayList<>();
        ElementsCollection elements = $$(".comparison-t-row");
        elements.forEach(p -> {
            firstItem.add(p.findAll(".comparison-t-cell").first().getText());
            secondItem.add(p.findAll(".comparison-t-cell").last().getText());
        });

        for (int i = 0; i < elements.size(); i++) {
            if (!firstItem.get(i).equals(secondItem.get(i))) {
                counter++;
            }
        }
        return counter;
    }
}
