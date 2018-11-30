import com.codeborne.selenide.testng.TextReport;
import com.codeborne.selenide.testng.annotations.Report;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.ComparisonPage;
import pages.MainPage;
import pages.NBCategoryPage;
import pages.NBMarketPage;

@Report
@Listeners(TextReport.class)
public class RozetkaTest extends Settings {

    @Test
    public void rozetkaNotebooksCompareTest() {
        NBCategoryPage nbCategoryPage = new MainPage().goToNBCategoryPage();
        NBMarketPage nbMarketPage = nbCategoryPage.goToNBMarketPage();
        ComparisonPage comparisonPage = nbMarketPage.addItemsToCompare(2);
        comparisonPage.checkDiffersCount();
    }
}
