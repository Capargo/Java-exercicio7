import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crie um programa para que receba do usuário o idade,
        //altura e peso e exiba no console;

        Scanner scn = new Scanner(System.in);
        int idade;
        double altura;

        System.out.print("informe sua idade\n");
        idade = scn.nextInt();

        System.out.print("informe sua altura\n");
        altura = scn.nextDouble();

        System.out.println(idade);
        System.out.println(altura);


    }
}
