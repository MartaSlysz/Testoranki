package test.java;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class Day1 {

    @Test
    public void shouldReturn2Plus2Sum(){
        //given
        int expected = 4;

        //when
        int result = 2+2;

        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnTrueWhenTestorankiWordIncludesALetter(){
        //given
        String testString = "testoranki";

        //when
        boolean result = testString.contains("a");

        //then
        Assert.assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIf25thOfNovemberAt8_30AmIsPast(){
        //given
        LocalDateTime testDateTime = LocalDateTime.of(2020, 11, 25, 8, 30);

        //when
        boolean result = LocalDateTime.now().isAfter(testDateTime);

        //then
        Assert.assertTrue(result);
    }

    @Test
    public void shouldReturn2Plus2sumFluentAssertion(){
        //given
        int expected = 4;

        //when
        int result = 2+2;

        //then
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenTestorankiWordIncludesALetterFluentAssertion(){
        //given
        String testString = "testoranki";

        //when
        boolean result = testString.contains("a");

        //then
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void shouldReturnTrueIf25thOfNovemberAt8_30AmIsPastFluentAssertion(){
        //given
        LocalDateTime testDateTime = LocalDateTime.of(2020, 11, 25, 8, 30);

        //when
        boolean result = LocalDateTime.now().isAfter(testDateTime);

        //then
        Assertions.assertThat(result).isTrue();
    }

}
