import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import re.netology.services.MoneyService;

public class MoneyServiceTest {
    @Test
    public void mouthForWeekendMain() {
        MoneyService service = new MoneyService();

        int expected = 3;
        int actual = service.MoneyService(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mouthForWeekendBig() {
        MoneyService service = new MoneyService();

        int expected = 2;
        int actual = service.MoneyService(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvFileSource(files ="src/test/resources/count.csv")
    public void mouthForWeekendGrip(int income, int expenses, int threshold, int expected) {
        MoneyService service = new MoneyService();

        int actual = service.MoneyService(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
