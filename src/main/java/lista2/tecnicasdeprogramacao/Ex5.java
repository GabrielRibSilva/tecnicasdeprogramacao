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
 * @brief Class Ex5
 */
import java.util.*;

public class Ex5 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int v;
        int d;
        int t;

        System.out.println("Insira a velocidade em Km/h: ");
        v = ler.nextInt();

        System.out.println("Insira o tempo em horas: ");
        t = ler.nextInt();

        d = (v * t);

        System.out.print("Distância percorrida: " + d + "Km.");
    }

}
