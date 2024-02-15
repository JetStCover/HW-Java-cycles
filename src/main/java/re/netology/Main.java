package re.netology;
import re.netology.services.MoneyService;

import re.netology.services.MoneyService;

public class Main {
    public static void main(String[] args) {
        MoneyService service = new MoneyService();

        System.out.println(service.MoneyService(10_000, 3_000, 20_000));
    }
}