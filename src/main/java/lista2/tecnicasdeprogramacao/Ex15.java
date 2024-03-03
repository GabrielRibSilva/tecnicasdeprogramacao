/*
 * Copyright (C) 2024 Gabriel Cândido Ribeiro da Silva <gcrs2018@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package lista2.tecnicasdeprogramacao;

/**
 *
 * @author Gabriel Cândido Ribeiro da Silva <gcrs2018@gmail.com>
 * @date 03/03/2024
 * @brief Class Ex15
 */
import java.util.*;

public class Ex15 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o tamanho da matriz quadrada: ");
        int tam = ler.nextInt();
        //Criação da matriz chamada MATRIZ e o tamanho de linhas i e colunas j
        //por se tratar de uma matriz quadrada, o numero de linhas e colunas são iguais
        int[][] matriz = new int[tam][tam];
        //laço de repetição para preencher a matriz
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                //vai imprimir a posição na qual está preenchendo com o valor informado
                System.out.println("Informe o elemento do número [" + i + "][" + j + "] da matriz.");
                matriz[i][j] = ler.nextInt();
            }
        }
        //Vai reproduzir a matriz e imprimir o valor quando i = j [1][1]
        System.out.println("A diagonal principal dessa matriz é: ");
        for (int i = 0; i < tam; i++) {
            System.out.println(matriz[i][i]);
        }
    }
}
