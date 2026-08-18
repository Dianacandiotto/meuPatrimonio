package br.com.senai.patrimonio;

import br.com.senai.patrimonio.model.Empresa;
import br.com.senai.patrimonio.model.Endereco;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatrimonioApplication {

	public static void main(String[] args) {

		SpringApplication.run(PatrimonioApplication.class, args);

		Empresa empresa = new Empresa();
		empresa.setRazaoSocial ("Senai Ltda");
		System.out.println(empresa.getRazaoSocial());

		Endereco endereco= new Endereco();
		endereco.setRua ("Rua noberto martins");
		System.out.println();
		System.out.println(endereco.getRua());

		empresa.setEndereco(endereco);
		System.out.println(empresa.getEndereco().getRua());

		Endereco enderecoComArgumento = new Endereco(  "rod luiz rosso", "85", "na rotula", "morro estevão","criciuma","sc");
		System.out.println(enderecoComArgumento.getBairro());



		}
	}


