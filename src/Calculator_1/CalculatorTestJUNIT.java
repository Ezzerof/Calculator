package Calculator_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestJUNIT {
    @Test
    void twoPlusTwoShouldBeFour(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    void fivePlusFiveShouldBeTen(){
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add(5,5));
    }

}