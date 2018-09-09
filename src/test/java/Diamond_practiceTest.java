import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Diamond_practiceTest {
    Diamond_practice diamond_practice = new Diamond_practice();
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    @Before
    public void setup(){
        System.setOut(new PrintStream(output));
    }
    @Test
    public void should_be_return_isosceles_triangle_when_input_3(){
        diamond_practice.print_isosceles_triangle(3);
        assertThat(output.toString(),is("  *  \n *** \n*****\n"));
    }
    @Test
    public void should_be_return_diamond_when_input_3(){
        diamond_practice.print_diamond(3);
        assertThat(output.toString(),is("  *  \n *** \n*****\n *** \n  *  \n"));
    }
    @Test
    public void should_be_return_dimond_middle_is_Bill(){
        diamond_practice.print_diamond_middle_Bill(3);
        assertThat(output.toString(),is("  *  \n *** \nBill\n *** \n  *  \n"));
    }

}