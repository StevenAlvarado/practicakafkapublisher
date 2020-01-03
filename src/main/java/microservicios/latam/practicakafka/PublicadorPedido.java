package microservicios.latam.practicakafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

import microservicios.latam.practicakafka.model.Pedido;

@Service
public class PublicadorPedido {

	@Autowired
	private Source source;
	
	public void publish(Pedido pedido) {
		source.output().send(MessageBuilder.withPayload(pedido).build());
	}
	
}
