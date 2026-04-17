package arrays;

import java.util.Arrays;
import java.util.Collections;

public class arrays_sort {
    public static void main(String[] args) {

        System.out.println(); //PULAR LINHA

        int[] num = {2, 5, 10, 25, 30, 78, 87, 54, 6, 1, 0, 3, 225, 2, 25, 2, 30};

        System.out.println("----- Array da variável num sem ORDENAÇÃO (ORIGINAL) -----");
        for (int i = 0; i < num.length; i++) {
            System.out.printf("%d, ", num[i]);
        }

        System.out.println(); //PULAR LINHA
        System.out.println(); //PULAR LINHA

        Arrays.sort(num);
        System.out.println("----- Array da variável num ORDENADOS (ORDEM CRESCENTE) -----");
        for (int i = 0; i < num.length; i++) {

            System.out.printf("%d, ", num[i]);

        }

        System.out.println(); //PULAR LINHA
        System.out.println(); //PULAR LINHA

        Arrays.sort(num);
        System.out.println("----- Array da variável num ORDENADOS (ORDEM DECRESCENTE) -----");
        for (int i = num.length -1 ; i >= 0; i--) {

            System.out.printf("%d, ", num[i]);

        }

        System.out.println(); //PULAR LINHA
        System.out.println(); //PULAR LINHA
        String[] nomes = {"Vinicius", "Isa", "Ana", "Vinicius", "William", "Joao"};



        System.out.println("----- Nomes em ordem aleatória (ORIGINAL)");
        for (int i=0; i< nomes.length; i++){
            System.out.println("" + nomes[i]);
        }

        System.out.println(); //PULAR LINHA
        System.out.println(); //PULAR LINHA

        System.out.println("----- Nomes em ordem alfabética (A-Z) -----");
        Arrays.sort(nomes);

        for (int i=0; i< nomes.length; i++){
            System.out.println("" + nomes[i]);
        }

        System.out.println(); //PULAR LINHA
        System.out.println(); //PULAR LINHA

        System.out.println("----- Nomes em ordem alfabética (Z-A) -----");
        Arrays.sort(nomes);

        for (int i= nomes.length-1; i>= 0; i--){
            System.out.println("" + nomes[i]);
        }


    }
}
