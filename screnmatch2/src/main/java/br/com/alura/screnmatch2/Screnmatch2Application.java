package br.com.alura.screnmatch2;

import br.com.alura.screnmatch2.model.DadosSerie;
import br.com.alura.screnmatch2.service.ConsumoApi;
import br.com.alura.screnmatch2.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Screnmatch2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Screnmatch2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("Primeiro Projeto Spring sem Web"); Apenas para mostrar a execução correta do projeto

		var consumoApi = new ConsumoApi(); //buscar os dados da API
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6da2685e"); //Endereço da API para obter os dados
		System.out.println(json); //Exibe os dados que foram importados da API indicada, observa que no endereço já está incluso uma série.
		//json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json"); exemplo para usar uma outra importação
		//System.out.println(json);
		ConverteDados conversor = new ConverteDados(); //Instância para utilizar o converte daddos
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class); //Utilizada para converter os dados da API para o app JAVA as informações Dados Série
		System.out.println(dados); //Exibe os dados da série criados localmente

	}
}
