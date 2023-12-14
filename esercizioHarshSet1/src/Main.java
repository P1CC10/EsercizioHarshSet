import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main (String[]args){
       int grandezza = grandezzaGruppo1().size();
        System.out.println("Grandezza ="+grandezza);

        for (String element: grandezzaGruppo1()){
            System.out.println("Gli elementi sono ="+element);
        }
    }
    public static HashSet<String>grandezzaGruppo1(){
        HashSet<String> gruppo1= new HashSet<>();
        gruppo1.add("1");
        gruppo1.add("12");
        gruppo1.add("34");
        return gruppo1;

    }
}
