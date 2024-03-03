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
 * @brief Class Ex14
 */
public class Ex14 {

    public static void main(String[] args) {
        
        int tPrimo = 0; //total de numeros primos

        System.out.println("Números primos de 1 a 1000:");
        //laço de repetição dos 1000 numeros
        for (int i = 2; i <= 1000; i++) {
            //se o valor primo retornar um numero primo
            if (primo(i)) {
                //caso retorne um valor primo verdadeiro, tPrimo++ e imprima o número primo
                tPrimo++;
                System.out.println(i + " ");
            }
        }
        //vai imprimir o valor de tPrimo que resulta da quantidade de vezes que retornou um valor positivo dentro da expressão booleana ''primo''
        System.out.println("Quantidade de números primos de 1 a 1000: " + tPrimo);
    }

    //o que é um numero primo? --> numero primo divisivel por 1 ou ele mesmo
    //função boleana = retorna 1 ou 0 no caso verdadeiro ou falso
    //função publica(podendo ser chamada de qualquer lugar dentro do pacote/pasta para verificar se é primo ou não
    //função recebe um valor inteiro que vai ser convertido para num para se encaixar dentro da função
    public static boolean primo(int num) {
        //se ele é igual a um, não é um numero primo
        if (num <= 1) {
            return false;
        }
        //inicia i = 2 já que foi descartado o número 1 na expressão anterior
        //se o
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
