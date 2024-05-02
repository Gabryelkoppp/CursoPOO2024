package aula11;

public class Pedido {
	
	private int id;
	private String data;
	private Status statuspedido;
	
	public Pedido(int id, String data) {
		this.id = id;
		this.data = data;
		this.statuspedido = Status.AGUARDANDO_PAGAMENTO;
	}
	
	public void alterarStatusPedido(Status novoStatus) {
	this.statuspedido = novoStatus;
	System.out.println("Status alterado eba");
	}
	
	public void imprimirPedido() {
		System.out.println("Número: " + this.id);
		System.out.println("Data: "+ this.data);
		System.out.println("Status: "+ this.statuspedido);
	}
}
