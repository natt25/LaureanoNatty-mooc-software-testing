package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarShiftCipherTest {

        @Test
        public void testSimpleShift() {
            CaesarShiftCipher cipher = new CaesarShiftCipher();
            assertEquals("def", cipher.CaesarShiftCipher("abc", 3));
        }

        @Test
        public void testWrapAround() {
            CaesarShiftCipher cipher = new CaesarShiftCipher();
            assertEquals("abc", cipher.CaesarShiftCipher("xyz", 3));
        }

        @Test
        public void testNegativeShift() {
            CaesarShiftCipher cipher = new CaesarShiftCipher();
            assertEquals("xyz", cipher.CaesarShiftCipher("abc", -3));
        }

        @Test
        public void testZeroShift() {
            CaesarShiftCipher cipher = new CaesarShiftCipher();
            assertEquals("hello world", cipher.CaesarShiftCipher("hello world", 0));
        }

        @Test
        public void testWithSpaces() {
            CaesarShiftCipher cipher = new CaesarShiftCipher();
            assertEquals("ifmmp xpsme", cipher.CaesarShiftCipher("hello world", 1));
        }

        @Test
        public void testInvalidCharacters() {
            CaesarShiftCipher cipher = new CaesarShiftCipher();
            assertEquals("invalid", cipher.CaesarShiftCipher("hello!", 3));
        }

        @Test
        public void testLargePositiveShift() {
            CaesarShiftCipher cipher = new CaesarShiftCipher();
            assertEquals("abc", cipher.CaesarShiftCipher("xyz", 29)); // 29 ≡ 3 mod 26
        }

        @Test
        public void testLargeNegativeShift() {
            CaesarShiftCipher cipher = new CaesarShiftCipher();
            assertEquals("xyz", cipher.CaesarShiftCipher("abc", -29)); // -29 ≡ -3 mod 26
        }

        @Test
        public void testOnlySpaces() {
            CaesarShiftCipher cipher = new CaesarShiftCipher();
            assertEquals("   ", cipher.CaesarShiftCipher("   ", 5));
        }
    }

