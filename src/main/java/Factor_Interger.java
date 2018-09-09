import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Factor_Interger {

    public List<Integer> getFactorList(Integer n) {
        List<Integer> factors = new ArrayList<>();
        factors = getFactor(n,2,factors);
        return factors;

    }
    public List<Integer> getFactor(Integer n,Integer factor,List<Integer> factors){
        if(n%factor==0) {
            factors.add(factor);
            n=n/factor;
        }
        if(n<2){
            return factors;
        }
        return getFactor(n,factor+1,factors);
    }
}
