import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SearchTests {
    @Test
    void selenideSearchTest(){
        //открыть google
        open("https://www.google.ru/");
        //набрать в поле поиска selenide
        $("[name=q]").setValue("selenide").pressEnter();
        //проверить что "selenide.org" появилось в результатах поиска
        $("#search").shouldHave(Condition.text("selenide.org"));
        sleep(5000);
    }
}
