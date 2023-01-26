import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    //Сумма всех продаж.
    @Test
    public void salesAmount() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMin = 180;
        int actualMin = service.salesAmount(sales);
        Assertions.assertEquals(expectedMin, actualMin);

    }

    //Средняя сумма продаж в месяц.
    @Test
    public void averageSalesAmount() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMin = 15;
        long actualMin = service.averageSalesAmount(sales);
        Assertions.assertEquals(expectedMin, actualMin);

    }

    //Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму.
    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMax = 8;
        long actualMax = service.maxSales(sales);
        Assertions.assertEquals(expectedMax, actualMax);
    }

    //Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму.
    @Test
    public void minSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMin = 9;
        long actualMin = service.minSales(sales);
        Assertions.assertEquals(expectedMin, actualMin);
    }

    //Количество месяцев, в которых продажи были выше среднего.
    @Test
    public void monthsWithAboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMax = 5;
        long actualMax = service.monthsWithAboveAverageSales(sales);
        Assertions.assertEquals(expectedMax, actualMax);
    }

    //Количество месяцев, в которых продажи были ниже среднего.
    @Test
    public void monthsWithBelowAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMin = 5;
        long actualMin = service.monthsWithBelowAverageSales(sales);
        Assertions.assertEquals(expectedMin, actualMin);
    }

}
