import java.util.Random;
import java.util.Scanner;

public class AdivinheCodigo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int resposta = (random.nextInt(11) + 1);
        int numeroRespondido;

        do {
            System.out.println("Tente adivinhar o número");
            numeroRespondido = scanner.nextInt();

            if (numeroRespondido == resposta) {
                System.out.println("Parabens você acertou!!!");
            } else if (numeroRespondido < resposta) {
                System.out.println("poxa não foi dessa vez, tente um numero um pouco maior");
            } else if (numeroRespondido > resposta) {
                System.out.println("poxa não foi dessa vez, tente um numero um pouco menor");
            }
        }while (resposta!=numeroRespondido);

        }

    }
