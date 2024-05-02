package exercicio_aula11;

public class Cliente {

	private int id;
	private String nome;
	private String dataNascimento;
	private EstadoCivil estado;

	public Cliente(int id, String nome, String dataNascimento, EstadoCivil estado) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.estado = estado;
	}
	
	public Cliente(int id, String nome, String dataNascimento) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.estado = EstadoCivil.SOLTEIRO;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", estado=" + estado
				+ "]";
	}
	
}
