package aula09;

import java.util.Scanner;

public class ContaBancariaTeste {
	
	public static void main(String[] args) {
		ContaBancaria cb1 = new ContaBancaria(111, "Gabryel Kopp");
		cb1.imprimirSaldo();
		
		cb1.depositar(500);
		
		cb1.imprimirSaldo();
		
		cb1.sacar(500.01);
		
		cb1.imprimirSaldo();
		
		cb1.sacar(0);
		
		cb1.imprimirSaldo();
		
		cb1.depositar(-1);
	}	
}
