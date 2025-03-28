package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @Test
    public void noGs() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xxyyzz");
        Assertions.assertTrue(result);
    }

    @Test
    public void singleG() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xxgxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void twoGs() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void multipleGs() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("ggxxggyygg");
        Assertions.assertTrue(result);
    }

    @Test
    public void unhappyGStart() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("gxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void unhappyGEnd() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xxg");
        Assertions.assertFalse(result);
    }

    @Test
    public void happyGStart() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("ggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void happyGEnd() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xxgg");
        Assertions.assertTrue(result);
    }

    @Test
    public void mixedGs() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xxggyygxx");
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource({
            "'', true",           // string vacio
            "g, false",           // Solo una g
            "gg, true",           // 2 gs
            "ggg, true",         // 3 gs
            "xggx, true",        // gs felices al medio
            "xgx, false",        // g sola al medio
            "gxxg, false"        // gs solas
    })
    public void parameterizedTests(String input, boolean expected) {
        GHappy happy = new GHappy();
        Assertions.assertEquals(expected, happy.gHappy(input));
    }
}
