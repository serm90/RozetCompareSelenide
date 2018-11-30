package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    public NBCategoryPage goToNBCategoryPage(){
        $(byText("Ноутбуки и компьютеры")).hover();
        $$(".f-menu-pop-l-i").find(Condition.exactText("Ноутбуки")).click();
        return new NBCategoryPage();
    }
}
