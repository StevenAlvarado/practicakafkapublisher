package microservicios.latam.practicakafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

@SpringBootApplication
@EnableBinding(Source.class)
public class PracticaKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticaKafkaApplication.class, args);
	}

}
