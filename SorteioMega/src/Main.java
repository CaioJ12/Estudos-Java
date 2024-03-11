import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> conjuntoSet = new HashSet<>();

        int numeros;

        while (conjuntoSet.size() < 10) {
            numeros = random.nextInt(59) + 1;
            conjuntoSet.add(numeros);
        }


        Integer[] numerosArray = conjuntoSet.toArray(new Integer[0]);


        for (int i = 0; i < numerosArray.length; i++) {
            if (numerosArray[i] < 10) {
                System.out.print("0" + numerosArray[i] + " ");
            } else {
                System.out.print(numerosArray[i] + " ");
            }

        }
    }
}
