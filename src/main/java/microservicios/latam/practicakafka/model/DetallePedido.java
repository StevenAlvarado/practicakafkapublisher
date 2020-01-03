package microservicios.latam.practicakafka.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetallePedido {

	@JsonProperty("id")
	private long id;
	@JsonProperty("producto_id")
	private long porductoId;
	@JsonProperty("cantidad")
	private int cantidad;
	
	public DetallePedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getPorductoId() {
		return porductoId;
	}
	public void setPorductoId(long porductoId) {
		this.porductoId = porductoId;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
