package com.twu.exercises;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class AsteriskPatternTest {
    private AsteriskPattern asteriskPattern;

    @Before
    public void setUp() throws Exception {
        asteriskPattern = new AsteriskPattern();
    }

    @Test
    public void should_generate_an_asterisk_when_given_asterisk() {
        assertThat(asteriskPattern.genOnePattern('*'), is("*"));
    }

    @Test
    public void should_generate_vertical_pattern_when_given_an_number() {
        String expected = "*" + System.lineSeparator() + "*" + System.lineSeparator()
                + "*" + System.lineSeparator() + "*" + System.lineSeparator()
                + "*" + System.lineSeparator();
        assertThat(asteriskPattern.genVerticalPattern(5), is(expected));
    }

    @Test
    public void should_generate_horizontal_pattern_when_given_an_number() {
        String expected = "*****";
        assertThat(asteriskPattern.genHorizontalPattern(5), is(expected));
    }

    @Test
    public void should_generate_right_triangle_pattern_when_given_an_number() {
        String expected = "*" + System.lineSeparator() + "**" + System.lineSeparator()
                + "***" + System.lineSeparator() + "****" + System.lineSeparator()
                + "*****" + System.lineSeparator();
        assertThat(asteriskPattern.genRightTrianglePattern(5), is(expected));
    }

    @Test
    public void should_generate_isosceles_triangle_pattern_when_given_an_number() {
        String expected = "  *" + System.lineSeparator()
                + " ***" + System.lineSeparator()
                + "*****" + System.lineSeparator();
        assertThat(asteriskPattern.genIsoscelesTrianglePattern(3), is(expected));
    }

    @Test
    public void should_generate_diamond_pattern_when_given_an_number() {
        String expected = "  *" + System.lineSeparator()
                + " ***" + System.lineSeparator()
                + "*****" + System.lineSeparator()
                + " ***" + System.lineSeparator()
                + "  *" + System.lineSeparator();
        assertThat(asteriskPattern.genDiamondPattern(3), is(expected));
    }

    @Test
    public void should_generate_diamond_pattern_with_name_when_given_an_number_and_string() {
        String expected = "  *" + System.lineSeparator()
                + " ***" + System.lineSeparator()
                + "hukai" + System.lineSeparator()
                + " ***" + System.lineSeparator()
                + "  *" + System.lineSeparator();
        assertThat(asteriskPattern.genDiamondPatternWithName(3, "hukai"), is(expected));
    }
}