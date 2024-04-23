import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random numeros = new Random();
        System.out.println("Bem-vindo ao calculator");
        boolean calculator_open = true;
        int score = 0;
        do {
            System.out.println("Você deseja resolver adições (a), subtrações(s), multiplicações(m) ou divisões(d)?");
            String resp = scan.nextLine();
            score += resolveOperacao(resp, numeros, scan);
            calculator_open = continuar(scan);
        } while (calculator_open);
        System.out.println("Você acertou um total de " + score + " vezes!");
        scan.close();
    }

    public static int resolveOperacao(String operacao, Random numeros, Scanner scan) {
        int score = 0;
        System.out.println("Quantos cálculos você quer resolver?");
        int qtd_calculos = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < qtd_calculos; i++) {
            int numero_aleatorio1 = numeros.nextInt(100);
            int numero_aleatorio2 = numeros.nextInt(100);
            int resultado = 0;
            char operador = ' ';

            switch (operacao) {
                case "a":
                    resultado = numero_aleatorio1 + numero_aleatorio2;
                    operador = '+';
                    break;
                case "s":
                    resultado = numero_aleatorio1 - numero_aleatorio2;
                    operador = '-';
                    break;
                case "m":
                    resultado = numero_aleatorio1 * numero_aleatorio2;
                    operador = '*';
                    break;
                case "d":
                    if (numero_aleatorio2 != 0 && numero_aleatorio1 % numero_aleatorio2 == 0) {
                        resultado = numero_aleatorio1 / numero_aleatorio2;
                        operador = '÷';
                    } else {
                        i--;
                        continue;
                    }
                    break;
            }

            System.out.println("Qual é o valor de " + numero_aleatorio1 + " " + operador + " " + numero_aleatorio2 + "?");
            int resposta = scan.nextInt();
            if (resposta == resultado) {
                System.out.println("Parabéns, você acertou!");
                score++;
            } else {
                System.out.println("Infelizmente você errou :(");
            }
        }
        return score;
    }

    public static boolean continuar(Scanner scan) {
        System.out.println("____________________");
        System.out.println("Você ainda quer usar o calculator? [S/N]");
        scan.nextLine();
        String validacao = scan.nextLine();
        if (validacao.equalsIgnoreCase("S")) {
            return true;
        } else {
            System.out.println("Fechando o programa....");
            return false;
        }
    }
}
