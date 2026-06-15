package com.github.saopimbapow.apiestudos;
import com.github.saopimbapow.apiestudos.Repository.ProdutoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Scanner;
@SpringBootApplication
@RestController
public class ApiestudosApplication {
	//@GetExchange("/hellow-world")
	//public String helloworld(){
			//return "thung thung sahurrr";
	//}
	//@GetExchange("/soma-numeros")
	//public String somaNumeros(@RequestParam Integer a, @RequestParam Integer b) {
		//int somaTotal = a + b;
		//return "Resultado: " + somaTotal;
	//}




	public static void main(String[] args) {
		SpringApplication.run(ApiestudosApplication.class, args);


	}

}
