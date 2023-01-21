import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStatsService {
    @Test
    public void testCalcSalesSum() {
        StatsService service = new StatsService();
        long[] sales = {10, 15, 20, 25, 30, 40, 10, 45, 15, 10, 50, 75};
        long expected = 345;
        long actual = service.calcSalesSum(sales);
        assertEquals(expected, actual);
    }
    @Test
    public void testCalcAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {10, 15, 20, 25, 30, 40, 10, 45, 15, 10, 50, 75};
        long expected = 28;
        long actual = service.calcAverageSales(sales);
        assertEquals(expected, actual);
    }
    @Test
    public void testCalcMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {10, 15, 20, 25, 30, 40, 10, 45, 15, 10, 50, 75};
        long expected = 12;
        long actual = service.calcMaxSales(sales);
        assertEquals(expected, actual);
    }
    @Test
    public void testCalcMinSales() {
        StatsService service = new StatsService();
        long[] sales = {10, 15, 20, 25, 30, 40, 10, 45, 15, 7, 50, 75};
        long expected = 10;
        long actual = service.calcMinSales(sales);
        assertEquals(expected, actual);
    }
    @Test
    public void testCalcLowerThanAverage() {
        StatsService service = new StatsService();
        long[] sales = {10, 15, 20, 25, 30, 40, 10, 45, 15, 7, 50, 75};
        long expected = 7;
        long actual = service.calcLowerThanAverage(sales);
        assertEquals(expected, actual);
    }
    @Test
    public void testCalcHigherThanAverage() {
        StatsService service = new StatsService();
        long[] sales = {10, 15, 20, 25, 30, 40, 10, 45, 15, 7, 50, 75};
        long expected = 5;
        long actual = service.calcHigherThanAverage(sales);
        assertEquals(expected, actual);
    }
}
