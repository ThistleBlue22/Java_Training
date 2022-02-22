package com.sparta.advancedjunitanddragons;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;
import java.util.stream.Stream;

public class SpartanTest {
    private static Spartan testSpartan1;
    private static Spartan testSpartan2;
    private static Spartan testSpartan3;
    private static Spartan testSpartan4;
    private static Spartan testSpartan5;
    private static Spartan testSpartan6;
    private static Spartan testSpartan7;
    private static Spartan testSpartan8;

    @BeforeAll
    public static void setUp() {
        testSpartan1 = new Spartan(3, "Brandon Johnson", "Java SDET",
                LocalDate.of(2022, 2, 23));
        testSpartan2 = new Spartan(9, "Brandon Johnson", "Java SDET",
                LocalDate.of(2022, 2, 23));
        testSpartan3 = new Spartan(20, "Brandon Johnson", "Java SDET",
                LocalDate.of(2022, 2, 23));
        testSpartan4 = new Spartan(312, "Brandon Johnson", "Java SDET",
                LocalDate.of(2022, 2, 23));
        testSpartan5 = new Spartan(222, "Brandon Johnson", "Java SDET",
                LocalDate.of(2022, 2, 23));
        testSpartan6 = new Spartan(0000000001, "Brandon Johnson", "Java SDET",
                LocalDate.of(2022, 2, 23));
        testSpartan7 = new Spartan(1000000000, "Brandon Johnson", "Java SDET",
                LocalDate.of(2022, 2, 23));
        testSpartan8 = new Spartan(1, "Brandon Johnson", "Java SDET",
                LocalDate.of(2022, 2, 23));
    }

    @Test
    // @Disabled("No spartan is available yet")
    @EnabledIf("checkSpartanCreated")
    public void checkName() {
        Assumptions.assumeTrue(testSpartan1 != null);
        Assertions.assertTrue(testSpartan1.getName().equals("Brandon Johnson"));
    }

    private boolean checkSpartanCreated() {
        return testSpartan1 == null;
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 5})
    public void paramTest(int number) {
        Assertions.assertTrue(number < 4);
    }

    @ParameterizedTest
    @CsvSource(value = {"Conor", "Porteous"})
    public void csvTest(String name) {
        Assertions.assertTrue(name.equals("Conor"));
    }

    @ParameterizedTest
    @MethodSource("generateSpartans")
    public void checkSpartans(Spartan spartan, int num) {
        Assertions.assertTrue(num == spartan.getId());
        Assertions.assertTrue(spartan.getCourse().equals("Java SDET"));
    }

    private static Stream<Arguments> generateSpartans() {
        return Stream.of(
                Arguments.arguments(new Spartan(1, "test", "Java SDET",
                        LocalDate.of(2022, 2, 21)), 1),
                Arguments.arguments(new Spartan(2, "test2", "Java SDET",
                        LocalDate.of(2022, 2, 21)), 2),
                Arguments.arguments(new Spartan(3, "test3", "Java SDET",
                        LocalDate.of(2022, 2, 21)), 3),
                Arguments.arguments(new Spartan(4, "test4", "Java Dev",
                        LocalDate.of(2022, 2, 21)), 4)
        );
    }

    @Test
    @DisplayName("A test with the faker framework, returning a random assortment on information")
    public void aTestWithTheFakerFrameworkReturningARandomAssortmentOnInformation(){
        Faker faker = new Faker();
        int idNumber = (int) faker.number().randomNumber();
        String name = faker.name().firstName() + " " + faker.name().lastName();
        String name3 = faker.chuckNorris().fact();
        String course = faker.job().title();
        LocalDate localDate = LocalDate.now();

        String expected = "Spartan{id=" + idNumber +", name='" + name + "', course='" + course + "', startDate=" + localDate +"}";

        Spartan actual = new Spartan(idNumber, name, course, localDate);

        System.out.println(actual);

        Assertions.assertEquals(expected, actual.toString());


    }

    @Test
    @DisplayName("A test with the faker framework, returning a somewhat random assortment on information")
    public void aTestWithTheFakerFrameworkReturningASomewhatRandomAssortmentOnInformation(){
        Faker faker = new Faker();
        int idNumber = (int) faker.number().randomNumber();
        String name = faker.name().firstName() + " " + faker.name().lastName();
        LocalDate localDate = LocalDate.now();

        String expected = "Spartan{id=" + idNumber +", name='" + name + "', course='Java SDET', startDate=" + localDate +"}";

        Spartan actual = new Spartan(idNumber, name, "Java SDET", localDate);

        Assertions.assertEquals(expected, actual.toString());


    }

    @Test
    @DisplayName("A test with the faker framework, returning a random assortment on information and a flat first name")
    public void aTestWithTheFakerFrameworkReturningARandomAssortmentOnInformationAndAFlatFirstName(){
        Faker faker = new Faker();
        int idNumber = (int) faker.number().randomNumber();
        String name = "Clara " + faker.name().lastName();
        String course = faker.job().title();
        LocalDate localDate = LocalDate.now();

        String expected = "Spartan{id=" + idNumber +", name='" + name + "', course='" + course + "', startDate=" + localDate +"}";

        Spartan actual = new Spartan(idNumber, name, course, localDate);

        Assertions.assertEquals(expected, actual.toString());


    }

}
