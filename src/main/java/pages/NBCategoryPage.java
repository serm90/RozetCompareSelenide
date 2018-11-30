package pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class NBCategoryPage {

    public NBMarketPage goToNBMarketPage(){
        $(".pab-table").find(byText("Ноутбуки с SSD")).click();
        return new NBMarketPage();
    }
}
