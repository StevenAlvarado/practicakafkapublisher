package microservicios.latam.practicakafka.service;

import java.net.URI;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import microservicios.latam.practicakafka.PublicadorPedido;
import microservicios.latam.practicakafka.model.Pedido;

@RestController
@RequestMapping("/pedidos")
public class PedidosService {

	@Autowired
	private PublicadorPedido publicadorPedido;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> createOrder(@RequestBody Pedido pedido) {
		
		if (pedido != null) {
			pedido.setPedidoId(UUID.randomUUID().getMostSignificantBits());
			URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
					.buildAndExpand(pedido.getPedidoId()).toUri();
			publicadorPedido.publish(pedido);
			return ResponseEntity.created(location).build();
		}

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	}
}
