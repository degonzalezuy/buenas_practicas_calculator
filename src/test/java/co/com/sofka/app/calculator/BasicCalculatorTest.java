package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum(){
        //Arrange
        Long number1 = 1L;
        Long number2 = 1L;

        Long expectedValue = 2L;
        //Act
        Long result = basicCalculator.sum(number1, number2);

        //Assert
        assertEquals(expectedValue, result);

    }

    @Test
    @DisplayName("Testing res: 1-1=0")
    public void res(){
        //Arrange
        Long number1 = 1L;
        Long number2 = 1L;

        Long expectedValue = 0L;
        //Act
        Long result = basicCalculator.res(number1, number2);

        //Assert
        assertEquals(expectedValue, result);

    }

    @Test
    @DisplayName("Testing mult: 1*1=2")
    public void mult(){
        //Arrange
        Long number1 = 1L;
        Long number2 = 1L;

        Long expectedValue = 1L;
        //Act
        Long result = basicCalculator.mult(number1, number2);

        //Assert
        assertEquals(expectedValue, result);

    }

    @Test
    @DisplayName("Testing div: 1/1=1")
    public void div(){
        //Arrange
        Long number1 = 1L;
        Long number2 = 1L;

        Long expectedValue = 1L;
        //Act
        Long result = basicCalculator.div(number1, number2);

        //Assert
        assertEquals(expectedValue, result);

    }
}
