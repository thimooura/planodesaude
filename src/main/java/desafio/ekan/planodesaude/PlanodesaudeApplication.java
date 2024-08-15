package desafio.ekan.planodesaude;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PlanodesaudeApplication {

	@GetMapping
	public String testeHome(){
		return "teste home plano de saude";
	}

	public static void main(String[] args) {
		SpringApplication.run(PlanodesaudeApplication.class, args);
	}

}
