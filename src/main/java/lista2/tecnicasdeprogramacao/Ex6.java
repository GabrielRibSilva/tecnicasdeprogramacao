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
 * @brief Class Ex6
 */
import java.util.*;

public class Ex6 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o valor de x1: ");
        int x1 = ler.nextInt();
        System.out.println("Qual o valor de y1: ");
        int y1 = ler.nextInt();

        System.out.println("Qual o valor de x2: ");
        int x2 = ler.nextInt();
        System.out.println("Qual o valor de y2: ");
        int y2 = ler.nextInt();

        double d;
        //Função já existente no java Math.Pow serve para elevar um valor a outro valor.
        //Math.pow (numero (virgula) , valor que deseja elevar o numero)
        d = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);

        System.out.println("A distância entre os pontos é: " + d);

    }
}
