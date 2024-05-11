import ru.netology.stats.StatsService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        long [] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        System.out.println(service.minSales(sales) + " Номер месяца с минимальной продажей");
        System.out.println(service.maxSales(sales) + " Номер месяца с максимальной продажей");
        System.out.println(service.CalculateAllSum(sales) + " Сумма всех продаж");
        System.out.println(service.midSales(sales) + " Средняя сумма всех продаж");
        System.out.println(service.summaryAboveMonth(sales) + " Количество месяцев, в которых продажи были ниже среднего");
        System.out.println(service.summaryBelowMonth(sales) + " Количество месяцев, в которых продажи были выше среднего");

    }

}
