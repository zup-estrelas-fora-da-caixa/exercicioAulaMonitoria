package br.com.zup.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioTeste {
	public static void main(String[] args) {
		// Lista
		List<String> lista = new ArrayList<String>();
		
		String musica = adicionarMusica();
		System.out.println("Está no main=" + musica);
		
		String livro = adicionarLivro();
		System.out.println("Está no main=" + livro);
	}
	
	//Métodos
	public static Scanner retornarScanner() {
		Scanner entrada = new Scanner(System.in);
		return entrada;
	}
	
	public static String adicionarMusica() {
		
		// Entrada de Dados
		Scanner val = retornarScanner();
		String nomeMusica;
		
		System.out.println("Informe o nome da música: ");
		nomeMusica = val.nextLine();
		
		// Saída de dados
		return nomeMusica;
	}
	
	public static String adicionarLivro() {
		
		// Entrada de Dados
		Scanner val1 = retornarScanner();
		String nomeLivro;
		
		System.out.println("Informe o nome do livro: ");
		nomeLivro = val1.nextLine();
		
		return nomeLivro;
	}
}
