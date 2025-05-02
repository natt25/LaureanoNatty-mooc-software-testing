package tudelft.mirror;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MirrorTest {

    @Test
    public void testBasicMirror() {
        Mirror mirror = new Mirror();
        assertEquals("ab", mirror.mirrorEnds("abXYZba"));
    }

    @Test
    public void testSingleCharMirror() {
        Mirror mirror = new Mirror();
        assertEquals("a", mirror.mirrorEnds("abca"));
    }

    @Test
    public void testFullMirrorOddLength() {
        Mirror mirror = new Mirror();
        assertEquals("aba", mirror.mirrorEnds("aba"));
    }

    @Test
    public void testFullMirrorEvenLength() {
        Mirror mirror = new Mirror();
        assertEquals("abba", mirror.mirrorEnds("abba"));
    }

    @Test
    public void testNoMirror() {
        Mirror mirror = new Mirror();
        assertEquals("", mirror.mirrorEnds("xyz"));
    }

    @Test
    public void testEmptyString() {
        Mirror mirror = new Mirror();
        assertEquals("", mirror.mirrorEnds(""));
    }

    @Test
    public void testSingleCharacter() {
        Mirror mirror = new Mirror();
        assertEquals("x", mirror.mirrorEnds("x"));
    }
}
