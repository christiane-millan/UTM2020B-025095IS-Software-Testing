package mx.mixteco.javatest;

import mx.mixteco.javatest.util.StringUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilsTest {

    @Test
    public void repeat_string_once() {
        assertEquals("hola", StringUtils.repeat("hola", 1));
    }

    @Test
    public void repeat_string_multiple_times() {
        assertEquals("holaholaholaholahola", StringUtils.repeat("hola", 5));
    }

    @Test
    public void repeat_string_zero_times() {
        assertEquals("", StringUtils.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        StringUtils.repeat("hola", -1);
    }

}