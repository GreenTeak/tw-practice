import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void should_be_return_Fizz_when_divide_three() {
        FizzBuzz fizzBuzz=new FizzBuzz();
       String result= fizzBuzz.replace_to_String(1,10,3,"Fizz");
       assertThat(result,is("1\n2\nFizz\n4\n5\nFizz\n7\n8\nFizz\n10\n"));
    }
    @Test
    public void should_be_return_Buzz_when_divide_five(){
        FizzBuzz fizzBuzz=new FizzBuzz();
        String result= fizzBuzz.replace_to_String(1,10,5,"Buzz");
        assertThat(result,is("1\n2\n3\n4\nBuzz\n6\n7\n8\n9\nBuzz\n"));
    }
    @Test
    public void should_be_return_FizzBuzz_divide_five_and_three(){
        FizzBuzz fizzBuzz=new FizzBuzz();
        String result= fizzBuzz.replace_to_String(1,15,15,"FizzBuzz");
        assertThat(result,is("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\nFizzBuzz\n"));
    }
    @Test
    public void should_be_return_Fizz_Buzz_FizzBuzz(){
        FizzBuzz fizzBuzz=new FizzBuzz();
        String result= fizzBuzz.replace_to_All(1,15,3,"Fizz",5,"Buzz");
        assertThat(result,is("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n"));
    }
}