package aula11;

public class PedidoTeste {
	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(111,"17/06/2002");
		pedido1.imprimirPedido();
		pedido1.alterarStatusPedido(Status.PROCESSANDO);
		pedido1.imprimirPedido();
	}
}
