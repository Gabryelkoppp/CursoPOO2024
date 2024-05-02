package aula10;

public class PessoaTeste {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("eba",20,"jardim carvalho","pg","PR");
		Pessoa pessoa1 = new Pessoa("Gabryel","17/06/2002","Masc","gabryel.com","Amanda",endereco1);
		pessoa1.imprimirDados();
	}

}
