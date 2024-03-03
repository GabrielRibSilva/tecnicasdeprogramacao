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
 * @brief Class Ex7
 */
import java.util.*;

public class Ex7 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int a, b;
        System.out.println("Informe o primeiro valor:");
        a = ler.nextInt();
        System.out.println("Informe o segundo valor:");
        b = ler.nextInt();
        //If funcionado da seguinte maneira: Se a condição for verdadeira, faça:
        //Condição é o que está dentro do parenteses, A > B faça
        if (a > b) {
            System.out.println("Valor de A:" + a);
            System.out.println("Valor de B:" + b);
            System.out.println("Maior:" + a);
        //Else funciona da seguinte maneira: Se a condição do IF for falsa, resolva o Else
        //Se A > B for falsa, faça:
        } else {
            System.out.println("Valor de A:" + a);
            System.out.println("Valor de B:" + b);
            System.out.println("Maior:" + b);
        }
    }

}
