import java.util.Random;
import java.util.Scanner;

public class AdivinheCodigo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); // Inicializa os objetos random e scanner que serão usados futuramente no código;

        String jogarNovamente; // declara fora do loop a variável que irá recomeça-lo caso necessário
        do {
            int resposta = (random.nextInt(99) + 1);
            int numeroRespondido; // Declara a variável numeroRespondido que colherá a resposta do usuário e inicializei a variável resposta que sorteia um número aleatório de 1 a 100

            do {
                System.out.println("Tente adivinhar o número");
                numeroRespondido = scanner.nextInt();

                if (numeroRespondido == resposta) {
                    System.out.println("Parabéns, você acertou!!!");
                } else if (numeroRespondido < resposta) {
                    System.out.println("Poxa, não foi dessa vez, tente um número um pouco maior");
                } else if (numeroRespondido > resposta) {
                    System.out.println("Poxa, não foi dessa vez, tente um número um pouco menor");
                }
            } while (resposta != numeroRespondido); // O loop continua até o usuário acertar

            System.out.print("Você quer jogar novamente? (sim/não): "); // aqui definirá se o jogo continuará ou não
             jogarNovamente = scanner.next();

        } while (jogarNovamente.equalsIgnoreCase("sim"));

        scanner.close(); // Fecha o scanner para evitar vazamentos de recursos
    }
}
