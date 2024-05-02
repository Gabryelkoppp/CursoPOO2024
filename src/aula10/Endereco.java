package aula10;

public class Endereco {

	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String uf;

	public Endereco(String logradouro, int numero, String bairro, String cidade, String uf) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}

	public void imprimirDadosEndereco() {
		System.out.println("Logradouro: "+this.logradouro);
		System.out.println("Numero: "+this.numero);
		System.out.println("Bairro: "+this.bairro);
		System.out.println("Cidade: "+this.cidade);
		System.out.println("uf: "+this.uf);
	}
}
