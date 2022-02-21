package com.spartaglobal.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgramTests {


    private Program sut;
    @BeforeEach
    void setUp(){
        sut = new Program();
    }

    @Test
    @DisplayName("Given a time of 21, greeting returns Good Evening")
    public void givenATimeOf21GreetingReturnsGoodEvening(){
        // Arrange
        var time = 21;
        var expectedGreeting = "Good Evening";
        // Act
        var result = sut.greeting(time);
        // Assert
        assertEquals(expectedGreeting, result);
    }


    @ParameterizedTest
    @CsvSource({"12,Good Morning",
            "13,Good Afternoon"})
    @DisplayName("Given the times 12 and 13, I expect the appropriate greeting gets returned")
    public void givenTheTimes12And13ReturnAppropriateGreeting(int time, String expectedResult){
        // Arrange


        // Act

        // Assert
        assertEquals(expectedResult, sut.greeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {5,8,12})
    @DisplayName("Given times between 5 and 12, I expect the appropriate greeting gets returned")
    public void givenATimeBetween5And12GreetingReturnsGoodMorning(int time){
        // Arrange


        // Act

        // Assert
        assertEquals("Good Morning", sut.greeting(time));
    }
}
