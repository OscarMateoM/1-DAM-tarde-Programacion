/*
 * EurosAPesetas.java
 * 
 * AUTOR: OSCAR MATEO MARTIN
 * 
 * Copyright 2022 oski0 <oski0@LAPTOP-9H8ODA6N>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner;
public class EurosAPesetas {
	
	public static void main (String[] args) {
		int num;
		double pes = 166.38; // Este es el valor en pesetas de 1 euro
		
		Scanner leer=new Scanner(System.in);
			System.out.print("Introduzca un numero de euros para convertirlos en pesetas: ");
			num=leer.nextInt();
		double conversor = num * pes; // Esta es la operacion necesaria para convertir de euros a pesetas
			System.out.println(num + " euros equivale a " + conversor + " pesetas ");
			
	}
}

