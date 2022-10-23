package ru.netology.bonus;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {
    @CsvFileSource(resources = "/data.csv")
    @ParameterizedTest
    @DisplayName("Calculation of bonuses")
    void shouldCalculateVariants(String reg, String limit, long amount, boolean registered, long expected) {
        BonusService service = new BonusService();

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический результаты):
        assertEquals(expected, actual);
    }
}