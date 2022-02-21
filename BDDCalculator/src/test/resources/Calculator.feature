Feature: Calculator
  Simple Calculator which takes two numbers

  @Add
  Scenario: Addition
    Given I have a calculator
    And I enter 5 and 2 into the calculator
    When I press add
    Then the results should be 7

  @Subtract
  Scenario Outline: Addition
    Given I have a calculator
    And I enter <input1> and <input2> into the calculator
    When I press subtract
    Then the results should be <result>

  Examples:
    |input1|input2|result|
    |1     |1     |0     |
    |0     |1     |-1    |
    |1000  |1     |999   |

    @Multiplication
    Scenario Outline: Multiplication
      Given I have a calculator
      And I enter <input1> and <input2> into the calculator
      When I press multiply
      Then the results should be <result>


    Examples:
      |input1|input2|result|
      |2     |2     |4     |
      |10    |10    |100   |
      |9999  |9     |89991 |

  @Division
  Scenario Outline: Division
    Given I have a calculator
    And I enter <input1> and <input2> into the calculator
    When I press divide
    Then the results should be <result>


    Examples:
      |input1|input2|result|
      |2     |2     |1     |
      |100   |10    |10    |
      |200   |5     |40    |
      |100   |0     |0     |
      |0     |40    |0     |