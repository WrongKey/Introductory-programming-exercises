package com.twu.exercises;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class PrimeFactorsExtractorTest {

    private PrimeFactorsExtractor primeFactorsExtractor;

    @Before
    public void setUp() throws Exception {
        primeFactorsExtractor = new PrimeFactorsExtractor();
    }

    @Test
    public void should_throw_illegal_exception_when_given_a_negative_number() {
        try {
            primeFactorsExtractor.generate(-10);
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals(ex.getMessage(), "Number should not be negative.");
        }
    }

    @Test
    public void should_get_empty_list_when_given_1() {
        List<Integer> factors = primeFactorsExtractor.generate(1);
        assertTrue("given 1 will return an empty list", factors.isEmpty());
    }

    @Test
    public void should_get_prime_factors_list_when_given_an_integer_greater_than_1() {
        List<Integer> factorsOfThirty = primeFactorsExtractor.generate(30);
        List<Integer> factorsOfTwentyTwo = primeFactorsExtractor.generate(22);
        List<Integer> factorsOfTen = primeFactorsExtractor.generate(10);
        List<Integer> factorsOfEleven = primeFactorsExtractor.generate(11);

        assertThat(factorsOfThirty, hasItems(2, 3, 5));
        assertThat(factorsOfTwentyTwo, hasItems(2, 11));
        assertThat(factorsOfTen, hasItems(2, 5));
        assertThat(factorsOfEleven, hasItems(11));
    }

    @Test
    public void should_get_ascending_prime_factors_list_when_given_an_integer_greater_than_1() {
        List<Integer> factors = primeFactorsExtractor.generate(1600);

        for(int index =0; index < factors.size() -1; index++) {
            assertTrue(factors.get(index) <= factors.get(index + 1));
        }
    }
}