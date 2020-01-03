package microservicios.latam.practicakafka.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pedido {

	@JsonProperty("pedido_id")
	private long pedidoId;
	@JsonProperty("cliente_id")
	private long clienteId;
	@JsonProperty("direccion_entrega")
	private String direccionEntrega;
	@JsonProperty("detalles_pedido")
	private DetallePedido[] detallesPedido;
	
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getPedidoId() {
		return pedidoId;
	}
	public void setPedidoId(long pedidoId) {
		this.pedidoId = pedidoId;
	}
	public long getClienteId() {
		return clienteId;
	}
	public void setClienteId(long clienteId) {
		this.clienteId = clienteId;
	}
	public String getDireccionEntrega() {
		return direccionEntrega;
	}
	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}
	public DetallePedido[] getDetallesPedido() {
		return detallesPedido;
	}
	public void setDetallesPedido(DetallePedido[] detallesPedido) {
		this.detallesPedido = detallesPedido;
	}
}
