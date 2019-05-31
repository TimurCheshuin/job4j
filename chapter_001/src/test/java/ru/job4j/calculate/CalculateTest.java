package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author Timur Cheshuin
 * @since 28.05.19
 * @version 1
*/

public class CalculateTest {
 /**
 * Test echo.
 */
 
 @Test
 public void whenTakeNameThenThreeEchoPlusName() {
    String input = "Timur Cheshuin";
    String expect = "Echo, echo, echo : Timur Cheshuin"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
 }

}