package br.com.zup.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
	
	/**
	 * Faça um programa que solicite ao usuário para digitar 
	 * valores numéricos inteiros positivos. 
	 * Encerre a entrada de dados quando for digitado um número negativo ou zero.
	 * Calcule a média dos números positivos digitados. 
	 * 
	 **/
	public static void main(String[] args) {
		
		// Entrada de dados
		List<Integer> listaValores;
		double mediaNumeros;
		int quantidadeNumero = quantidadeNumeros();
		
		// Processamento de dados
		listaValores = receberNumeros(quantidadeNumero);
		
		// Saída de dados
		mediaNumeros = calcularMedia(listaValores);
		System.out.println(mediaNumeros);
	}
	
	public static Scanner retornarScanner() {
		Scanner entrada = new Scanner(System.in);
		return entrada;
	}
	
	public static int quantidadeNumeros() {

		// Entrada de dados
		Scanner scan = retornarScanner();
		int quantidade;
		
		System.out.println("Qual a quantidade de números a digitar: ");
		quantidade = scan.nextInt();
		
		return quantidade;
	}
	
	public static List<Integer> receberNumeros(int quantidade) {
		
		// Entrada de Dados
		Scanner scan = retornarScanner();
		List<Integer> lista = new ArrayList<Integer>();
		int valor;
		
		for (int i = 1; i <= quantidade; i++) {
			
			// Entrada de dados
			int opcao;
			
			System.out.println("Digite um número inteiro e positivo: ");
			valor = scan.nextInt();
			
//			Scanner scan = retornarScanner();
			
			if (valor > 0) {
				lista.add(valor);
			} else {
				System.out.println("O número informado não pode ser adicionado");
			}
			
			System.out.println("Deseja continuar? 1-Sim ou 0-Para não");
			opcao = scan.nextInt();
			
			if (opcao <= 0) {
				i += quantidade;
			}
		}
		
		return lista;
	}
	
	public static double calcularMedia(List<Integer> lista) {
		
		// Entrada de Dados
		double media;
		int soma = 0;
		
		// Processamento de dados
		for (int i = 0; i < lista.size(); i++) {
			soma += lista.get(i);
		}
		
		media = (soma / lista.size());
		
		// Saída de dados
		return media;
	}
	
//	public static boolean verificaNumero(int valor) {
//		if (valor > 0) {
//			return true;
//		} else {
//			return false;
//		}
//	}
}
