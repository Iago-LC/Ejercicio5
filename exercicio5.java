package boletín.pkg2;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
        int dia;
        int mes;
        int año;
        int suma = 0;
        int suma2 = 0;
        int cifra;
        int cifra2;
        Scanner sc = new Scanner(System.in);

	System.out.println("En que día naciches?");
        dia = sc.nextInt();
        System.out.println("De que mes?");
        mes = sc.nextInt();
        System.out.println("En que ano?");
        año = sc.nextInt();

	suma = dia + mes + año;

        while (suma > 0) {
            cifra = suma % 10;
            suma2 = suma2 + cifra;
            suma = suma / 10;
        }


