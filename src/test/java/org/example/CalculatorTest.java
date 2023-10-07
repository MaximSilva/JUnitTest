package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
@Test
    void twoPlusTwoShouldEqualFour(){
    var calculator = new Calculator();
    calculator.add(2, 2);

}
}