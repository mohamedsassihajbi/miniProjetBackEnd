package miniprojet.cruds;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan({"miniprojet.cruds.controllers" })
@EnableJpaRepositories("miniprojet.cruds.interfaces")
@EntityScan("miniprojet.entities")
public class MiniProjet1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MiniProjet1Application.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
