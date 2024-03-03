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
 * @brief Class Ex12
 */
import java.util.*;

public class Ex12 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        //criando e definindo a variavel num2
        int num, num2 = 1;
        
        System.out.println("Escreva qual o numero para fazer seu fatorial");
        num = ler.nextInt();
        
        for (int i = 1; i <= num; i++) {
            //num2 vezes i resultará no novo valor do num2
            num2 *= i;
        }
        System.out.println(num2);
    }
}
