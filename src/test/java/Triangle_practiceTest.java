import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Triangle_practiceTest {
    Triangle_practice triangle_practice = new Triangle_practice();
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    @Before
    public void setup(){
        System.setOut(new PrintStream(output));
    }
    @Test
    public void should_be_return_one_star(){
        triangle_practice.print_star();
        assertThat(output.toString(),is("*"));
    }
}