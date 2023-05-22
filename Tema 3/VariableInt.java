/*
 * VariableInt.java
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


public class VariableInt {
	
	public static void main (String[] args) {
		int x = 144;
		int y = 999;
		int sum = x+y;
		int res = x-y;
		int mul = x*y;
		double div = y/x;
			System.out.println("El valor de la variable x es " + x);
			System.out.println("El valor de la variable y es " + y);
			System.out.println("La suma de las varibales es: " + sum);
			System.out.println("La resta de las variables es: " + res);
			System.out.println("La multiplicacion de las variables es: " + mul);
			System.out.println("La division de las variables es: " + div);
	}
}

