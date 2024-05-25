package view;

import java.util.ArrayList;
import java.util.List;

public class Principal{

    // Função hash para determinar a posição no vetor
    public static int hashFunction(int value) {
        return value / 10;
    }

    public static void main(String[] args) {
        // Inicializa o vetor com 10 listas vazias
        List<Integer>[] vetor = new ArrayList[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = new ArrayList<>();
        }

        // Valores de entrada
        int[] entrada = {30, 23, 17, 12, 76, 58, 98, 58, 24, 36, 92, 17, 75, 74, 78, 78, 0, 11, 67, 17};

        // Processa cada valor de entrada e coloca na posição correta do vetor
        for (int valor : entrada) {
            int posicao = hashFunction(valor);
            vetor[posicao].add(valor);
        }

        // Mostra o estado final do vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }
}

