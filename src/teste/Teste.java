package teste;

import java.util.List;

import viaCep.ViaCep;

public class Teste {

	public static void main(String[] args) {
		
		String cep = "85814155";
		
		List<String> end = ViaCep.buscarCep(cep);
		
		System.out.println("País: " + end.get(0));
		System.out.println("Estado: " + end.get(1));
		System.out.println("UF: " + end.get(2));
		System.out.println("Cidade: " + end.get(3));
		System.out.println("Bairro: " + end.get(4));
		System.out.println("Rua: " + end.get(5));
		System.out.println("Cep: " + end.get(6));

	}

}
