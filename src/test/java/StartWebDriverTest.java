import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class StartWebDriverTest {

    @Test
    public void justStart() {
        open();
        System.out.println();
    }
}
