package com.spartaglobal.bdd;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorStepDefs {

    private Calculator calc;
    private double actual;

//    @Before
//    public void beforeScenario(){
//        System.out.println("Running before steps");
//    }

//    @After
//    public void afterScenario(){
//        System.out.println(actual);
//    }

    @AfterAll
    public static void afterAll(){
        System.out.println("All done..");
    }

    @Given("I have a calculator")
    public void iHaveACalculator() {
        calc = new Calculator();
    }

    @And("I enter {int} and {int} into the calculator")
    public void iEnterAndIntoTheCalculator(int num1, int num2) {
        calc.setNum1(num1);
        calc.setNum2(num2);
    }

    @When("I press add")
    public void iPressAdd() {
        actual = calc.add();
    }
    @When("I press subtract")
    public void iPressSubtract() {
        actual = calc.subtract();
    }
    @When("I press multiply")
    public void iPressMultiply() {
        actual = calc.multiply();
    }
    @When("I press divide")
    public void iPressDivide() {
        actual = calc.divide();
    }
    @Then("the results should be {int}")
    public void theResultsShouldBe(int expected) {
        assertEquals(expected, actual);
    }



}
