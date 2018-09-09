import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {
    public String replace_to_String(int low, int high,int divide,String replace) {
        String repalceResult ="";
        while (low<=high){
            if(low%divide==0){
                repalceResult+=replace+"\n";
                low++;
                continue;
            }
            repalceResult+= String.valueOf(low)+"\n";
            low++;
        }
        return repalceResult;
    }

    public String replace_to_All(int low, int high, int divideFizz, String fizz,int divideBuzz,String buzz ) {
        String replaceBuzz = replace_to_String(low,high,3,"Fizz");
        String[] result = replaceBuzz.split("\n");
        for(int i=0;i<result.length;i++){
            if((i+1)%divideBuzz==0&&(i+1)%divideFizz==0){
                result[i]=fizz+buzz;
                continue;
            }
            if((i+1)%divideBuzz ==0){
                result[i]=buzz;
            }
        }

        return Arrays.asList(result).stream().collect(Collectors.joining("\n"))+"\n";
    }
}
