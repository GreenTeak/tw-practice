import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Factor_IntergerTest {
    @Test
    public void should_be_return_factor() {
        Factor_Interger factor_interger = new Factor_Interger();
        List<Integer> list = factor_interger.getFactorList(30);
        assertThat(list, is(Arrays.asList(2,3,5)));
    }

}