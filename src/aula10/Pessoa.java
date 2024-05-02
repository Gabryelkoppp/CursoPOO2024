package aula10;

public class Pessoa {

	private String nome;
	private String dataNascimento;
	private String sexo;
	private String email;
	private String estadoCivil;
	private Endereco endereco;

	public Pessoa(String nome, String dataNascimento, String sexo, String email, String estadoCivil,
			Endereco endereco) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.estadoCivil = estadoCivil;
		this.endereco = endereco;
	}
	public void imprimirDados() {
		System.out.println("=====Imprimindo dados...=====");
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de nascimento: " + this.dataNascimento);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Email: " + this.email);
		System.out.println("Estado civil: " + this.estadoCivil);
		if (this.endereco != null) {
			System.out.println("-----Endereço-----");
			this.endereco.imprimirDadosEndereco();
			System.out.println("-----Endereço-----");
		} else {
			System.out.println("-----Endereço-----");
			System.out.println("Esta pessoa mindigu");
			System.out.println("-----Endereço-----");
		}
		System.out.println("=============================");
	}
}
