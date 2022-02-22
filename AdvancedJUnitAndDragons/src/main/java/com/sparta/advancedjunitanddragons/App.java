package com.sparta.advancedjunitanddragons;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.util.Optional;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        Faker faker = new Faker();
//
//        Spartan newSpartan = new Spartan(Integer.parseInt(faker.number().digit()), faker.name().firstName() + " " + faker.name().lastName(), faker.job().title(), LocalDate.now());
//
//        System.out.println(newSpartan);

        Spartan natasha = new Spartan(1, "Natasha Reilly",
                "Java SDET", LocalDate.of(2022, 2, 21));
        System.out.println(natasha);
        SpartanRepository.addSpartan(natasha);
        Optional<Spartan> result = SpartanRepository.findSpartan(1);
        result.ifPresent(System.out::println);
        SpartanRepository.addSpartan(new Spartan(2, "Sajad Gulzar", "Java SDET",
                LocalDate.of(2022, 2, 22)));
        System.out.println(SpartanRepository.getAllSpartans());
        SpartanRepository.removeSpartan(1);
        System.out.println("Just Sajad\n" + SpartanRepository.getAllSpartans());

    }
}
