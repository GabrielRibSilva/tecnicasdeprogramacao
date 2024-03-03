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
 * @brief Class Ex9
 */
import java.util.*;

public class Ex9 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a, b, c;
        System.out.println("primeiro lado");
        a = ler.nextInt();
        System.out.println("segundo lado");
        b = ler.nextInt();
        System.out.println("terceiro lado");
        c = ler.nextInt();
        //If comando que executa se a condição for verdadeira
        //condição: A igual B e tambem, A igual C e tambem, B igual C
        if (a == b && a == c && b == c) {
            System.out.println("equilátero");
        //Else comando que executa se a condição for falsa
        } else {
            //condição: A diferente de B e tambem, A diferente de C e tambem, B diferente de C
            if (a != b && a != c && b != c) {
                System.out.println("escaleno");
            //caso não seja nenhuma das demais
            } else {
                System.out.println("isócelos");
            }
        }

    }

}
