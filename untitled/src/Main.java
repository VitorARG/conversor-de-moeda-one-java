import com.google.gson.*;

import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {


        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        SeletorMoeda moeda = new SeletorMoeda();

        while (opcao != 11 ) {
            System.out.println("*******************************");

            System.out.println("1)  Dólar ==>> Peso Argentino");
            System.out.println("2)  Peso argentino ==>> Dólar");
            System.out.println("3)  Dólar ==>> Real Brasileiro");
            System.out.println("4)  Real brasileiro >> Dólar");
            System.out.println("5)  Dólar ==>> peso colombiano");
            System.out.println("6)  Peso colombiano ==>> Dólar");
            System.out.println("7)  Dólar ==>> Boliviano boliviano ");
            System.out.println("8)  Boliviano boliviano ==>> Dólar ");
            System.out.println("9)  Dólar ==>> Peso chileno");
            System.out.println("10) Peso chileno ==>> Dólar");
            System.out.println("11) Sair");

            System.out.println("*******************************");

            System.out.println("Digite uma opção valida");
            opcao = scanner.nextInt();
            if (opcao == 11){
                break;
            }
            System.out.println("Digite um valor");

            int valor = scanner.nextInt();


            if (opcao == 1 || opcao == 3
                    || opcao == 5 || opcao == 7
                    || opcao == 9) {

                if (opcao == 1){

                    double base = moeda.cambio("ARS");
                    double resultado = valor * base;
                    System.out.println("O valor de "+ valor + " USD corresponde ao valor" +
                            " final de " + resultado + " ARS");

                } else if (opcao == 3){

                    double base = moeda.cambio("BRL");
                    double resultado = valor * base;
                    System.out.println("O valor de "+ valor + " USD corresponde ao valor" +
                            " final de " + resultado + " BRL");

                }else if (opcao == 5){

                    double base = moeda.cambio("COP");
                    double resultado = valor * base;
                    System.out.println("O valor de "+ valor + " USD corresponde ao valor" +
                            " final de " + resultado + " COP");


                } else if (opcao == 7) {

                    double base = moeda.cambio("BOB");
                    double resultado = valor * base;
                    System.out.println("O valor de "+ valor + " USD corresponde ao valor" +
                            " final de " + resultado + " BOB");

                }else {

                    double base = moeda.cambio("CLP");
                    double resultado = valor * base;
                    System.out.println("O valor de "+ valor + " USD corresponde ao valor" +
                            " final de " + resultado + " CLP");
                }


            } else if (opcao == 2 ) {

                double base = moeda.cambio("ARS");
                double resultado = valor / base;
                System.out.println("O valor de "+ valor + " ARS corresponde ao valor" +
                        " final de " + resultado + " USD");

            } else if (opcao ==4 ) {

                double base = moeda.cambio("BRL");
                double resultado = valor / base;
                System.out.println("O valor de "+ valor + " BRL corresponde ao valor" +
                        " final de " + resultado + " USD");




            } else if (opcao == 6 ) {

                double base = moeda.cambio("COP");
                double resultado = valor / base;
                System.out.println("O valor de "+ valor + " COP corresponde ao valor" +
                        " final de " + resultado + " USD");



            } else if (opcao == 8) {

                double base = moeda.cambio("BOB");
                double resultado = valor / base;
                System.out.println("O valor de "+ valor + " BOB corresponde ao valor" +
                        " final de " + resultado + " BOB");


            }else if (opcao == 10) {
                double base = moeda.cambio("CLP");
                double resultado = valor / base;
                System.out.println("O valor de "+ valor + " CLP corresponde ao valor" +
                        " final de " + resultado + " BOB");
            }

        }




    }
}