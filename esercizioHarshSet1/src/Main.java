import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main (String[]args){
        Set<String> gruppo1 = new HashSet<String>(Arrays.asList("4","7","8"));
        System.out.println("gruppo1="+gruppo1);
        for (String element: gruppo1){
            System.out.println("Gli elementi sono ="+element);
        }
    }
}
