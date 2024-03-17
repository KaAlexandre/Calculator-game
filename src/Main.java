import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random numeros = new Random();
        System.out.println("Bem vindo ao calculator");
        boolean calculator_open = true;
        int score = 0;
        do {


            System.out.println("Você deseja resolver adições (a), subtrações(s), multiplicações(m) ou divisões(d)?");
            String resp = scan.nextLine();
            switch (resp) {
                case "a": {
                    System.out.println("Quantos cálculos você quer resolver?");
                    int qtd_calculos=scan.nextInt();
                    for (int i = 0; i < qtd_calculos; i++) {
                        int numero_aleatorio1 = numeros.nextInt(100);
                        int numero_aleatorio2 = numeros.nextInt(100);
                        int soma_valores = numero_aleatorio1 + numero_aleatorio2;
                        System.out.println("Qual é o valor de " + numero_aleatorio1 + "+" + numero_aleatorio2 + "?");
                        int resposta = scan.nextInt();
                        if (resposta == soma_valores) {
                            System.out.println("Parabéns, você acertou!");
                            score++;
                        } else {
                            System.out.println("Infelizmente você errou :(");
                        }
                        if (i == qtd_calculos-1) {
                            System.out.println("você ainda quer usar o calculator? [S/N]");
                            scan.nextLine();
                            String validacao = scan.nextLine();
                            calculator_open = validacao.equalsIgnoreCase("S");
                            if (!calculator_open) {
                                System.out.println("fechando o programa....");
                            }
                        }
                    }
                }break;
                case "s" : {
                    System.out.println("Quantos cálculos você quer resolver?");
                    int qtd_calculos=scan.nextInt();
                    for (int i = 0; i < qtd_calculos; i++) {
                        int numero_aleatorio1 = numeros.nextInt(100);
                        int numero_aleatorio2 = numeros.nextInt(100);
                        int subtracao_valores = numero_aleatorio1 - numero_aleatorio2; // Correção aqui
                        System.out.println("Qual é o valor de " + numero_aleatorio1 + "-" + numero_aleatorio2 + "?");
                        int resposta = scan.nextInt();
                        if (resposta == subtracao_valores) {
                            System.out.println("Parabéns, você acertou!");
                            score++;
                        } else {
                            System.out.println("Infelizmente você errou :(");
                        }
                        if (i == qtd_calculos-1) {
                            System.out.println("você ainda quer usar o calculator? [S/N]");
                            scan.nextLine();
                            String validacao = scan.nextLine();
                            calculator_open = validacao.equalsIgnoreCase("S");
                            if (!calculator_open) {
                                System.out.println("fechando o programa....");
                            }

                        }
                    }
                }break;
                case "m" : {
                    System.out.println("Quantos cálculos você quer resolver?");
                    int qtd_calculos=scan.nextInt();
                    for (int i = 0; i < qtd_calculos; i++) {
                        int numero_aleatorio1 = numeros.nextInt(10);
                        int numero_aleatorio2 = numeros.nextInt(10);
                        int multi_valores = numero_aleatorio1 * numero_aleatorio2;
                        System.out.println("Qual é o valor de " + numero_aleatorio1 + "*" + numero_aleatorio2 + "?");
                        int resposta = scan.nextInt();
                        if (resposta == multi_valores) {
                            System.out.println("Parabéns, você acertou!");
                            score++;
                        } else {
                            System.out.println("Infelizmente você errou :(");
                        }
                        if (i == qtd_calculos-1) {
                            System.out.println("você ainda quer usar o calculator? [S/N]");
                            scan.nextLine();
                            String validacao = scan.nextLine();
                            calculator_open = validacao.equalsIgnoreCase("S");
                            if (!calculator_open) {
                                System.out.println("fechando o programa....");
                            }

                        }
                    }
                }break;
                case "d" : {
                    System.out.println("Quantos cálculos você quer resolver?");
                    int qtd_calculos=scan.nextInt();
                    for (int i = 0; i < qtd_calculos; i++) {
                        int numero_aleatorio1 = numeros.nextInt(16);
                        int numero_aleatorio2 = numeros.nextInt(16);
                        if (numero_aleatorio2 != 0 && numero_aleatorio1 % numero_aleatorio2 == 0) {
                            int divisao_valores = numero_aleatorio1 / numero_aleatorio2;

                            System.out.println("Qual é o valor de " + numero_aleatorio1 + "÷" + numero_aleatorio2 + "?");
                            int resposta = scan.nextInt();
                            if (resposta == divisao_valores) {
                                System.out.println("Parabéns, você acertou!");
                                score++;
                            } else {
                                System.out.println("Infelizmente você errou :(");
                            }
                        } else {
                            i--;
                        }
                        if (i == qtd_calculos-1) {
                            System.out.println("você ainda quer usar o calculator? [S/N]");
                            scan.nextLine();
                            String validacao = scan.nextLine();
                            calculator_open = validacao.equalsIgnoreCase("S");
                            if (!calculator_open) {
                                System.out.println("fechando o programa....");
                            }
                        }
                    }
                }break;
                default:{System.out.println("Nenhuma das opções escolhidas, fechando o programa...");
                }

            }
            }while (calculator_open);

            System.out.println("você acertou um total de " + score + " vezes!");

            scan.close();
        }
    }
