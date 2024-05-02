package aula09;

public class ContaBancaria {

	int numeroConta;
	String titular;
	double saldo;

	public ContaBancaria(int numeroConta, String titular) {

		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0.00;

	}

	public void sacar(double valor) {
		if (valor == 0) {
			System.out.println("Impossível sacar uma quantia nula!");
		}
		 else if (this.saldo < valor) {
			System.out.println("Saldo insuficiente!");
		}
		else if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso!");
		}
	}

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("Depósito realizado com sucesso!");
		} else {
			System.out.println("Impossível depositar valores nulos ou menores do que zero.");
		}
	}

	public void imprimirSaldo() {
		System.out.println("=====================");
		System.out.println("Número da conta: " + this.numeroConta);
		System.out.println("Nome do titular: " + this.titular);
		System.out.println("Saldo: R$ " + this.saldo);
		System.out.println("=====================");
	}

	public void calcularRendimento() {
		this.saldo *= 1.10;
	}
}
