package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ChocolateBagsTest {
    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    @CsvSource({ "1,1,5,0", "1,1,6,1", "1,1,7,-1", "1,1,8,-1" })
    public void totalIsTooBig(int small, int big, int total, int expectedResult) {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    @CsvSource({ "4,0,10,-1", "4,1,10,-1", "5,2,10,0", "5,3,10,0" })
    public void onlyBigBars(int small, int big, int total, int expectedResult) {
        int result = new ChocolateBags().calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    @CsvSource({
        "0,3,17,-1", "1,3,17,-1", "2,3,17,2", "3,3,17,2",
        "0,3,12,-1", "1,3,12,-1", "2,3,12,2", "3,3,12,2"})
    public void bigAndSmallBars(int small, int big, int total, int expectedResult) {
        int result = new ChocolateBags().calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    @CsvSource({ "4,2,3,3", "3,2,3,3", "2,2,3,-1", "1,2,3,-1" })
    public void onlySmallBars(int small, int big, int total, int expectedResult) {
        int result = new ChocolateBags().calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }

//    EJERCICIO 1: Dos pruebas más:
//    PRUEBA 1: partición "necesidad de barras grandes y pequeñas"
    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    @CsvSource({
            "3,1,8,3",    // 1 big (5) + 3 small (3) = 8
            "2,2,12,2",   // 2 big (10) + 2 small (2) = 12
            "4,2,14,4",   // 2 big (10) + 4 small (4) = 14
            "1,2,11,1"    // 2 big (10) + 1 small (1) = 11
    })
    public void needBigAndSmallBars(int small, int big, int total, int expectedResult) {
        int result = new ChocolateBags().calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }

//    PRUEBA 2: partición "solo barras pequeñas"
    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    @CsvSource({
            "3,0,3,3",    // 3 small (3) = 3
            "2,0,2,2",    // 2 small (2) = 2
            "4,0,4,4",    // 4 small (4) = 4
            "1,0,1,1"     // 1 small (1) = 1
    })
    public void needOnlySmallBars(int small, int big, int total, int expectedResult) {
        int result = new ChocolateBags().calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }
}
