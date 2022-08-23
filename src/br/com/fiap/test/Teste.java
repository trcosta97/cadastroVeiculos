package br.com.fiap.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import br.com.fiap.model.Acessorio;
import br.com.fiap.model.Veiculo;
/**
 * Classe utilizada para execução do código
 * @author Thiago Ribeiro, RM 92800
 *
 *
 */


public class Teste {
	
	/**
	 * Lista que armazena todos os objetos do tipo Vepículo instanciados na classe Teste
	 */
	private static List<Veiculo> veiculos = new ArrayList<>();   
	/**
	 * Atributo que guarda os valores acumulados dos objetos veículos instanciados
	 */
	private static double valorTotal = 0;						 
	/**
	 * Lista com os valores dos objetos veículos instanciados
	 */
	private static List<Double> valores = new ArrayList<>();
	/**
	 * Lista que incrementa + 1 a cada acessório adicionado em algum objeto do tipo Veículo
	 */
	private static int totalAcessorios = 0;
	
	
	
	public static List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public static List<Double> getValores() {
		return valores;
	}

	public static int getTotalAcessorios() {
		return totalAcessorios;
	}
	
	/**
	 * Método que incrementa +1 no atributo totalAcessorios
	 */
	public static void addAcessorio() {
		 totalAcessorios = totalAcessorios + 1;
	}
	
	/**
	 * Método que define os parametros de um objeto veículo baseado na entrada do usuário e que 
	 * adiciona o objeto na lista total de veículos criados e seu valor.
	 * @param v
	 */
	public static void cadastraVeiculo(Veiculo v) {				
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Ano de fabricação do veículo: ");
			v.setAnoFabricacao(sc.nextInt());
				
			System.out.println("Modelo de veiculo: ");
			v.setModelo(sc.next());
			
			
			System.out.println("Valor do veículo (utilize virgula para separar as casas decimais): ");
			v.setValor(sc.nextFloat());
				
			System.out.println("Montadora do veículo: ");
			v.setMontadora(sc.next());
			
			armazenaVeiculo(v);                                  
			valorTotal = valorTotal +  v.getValor();			 
			valores.add(v.getValor());
		}catch(InputMismatchException ex) {
			System.out.println("Entrada inválida.");
		}
	
	}
		
	public static void armazenaVeiculo(Veiculo v) {         
		veiculos.add(v);
	}
	
	public double getValorTotal() {                           
		return valorTotal;
	}
	
	public double getMediaValorTotal() {					 
		return (valorTotal/valores.size());					
	}
	
	/**
	 * Método que retorna o maior valor dentre os inseridos na lista de valores dos objetos
	 * veículos instanciados na classe Teste
	 * @return
	 */
	public Veiculo getMaiorValor() {                         
		double maisCaro = Collections.max(valores);
		int i = valores.indexOf(maisCaro);
		return veiculos.get(i);
	}
	
	/**
	 * Método que adiciona 1 ou mais acessórios no objeto da classe Veículo baseado na entrada
	 * do usuário 
	 * @param teste
	 * Classe em que o método será usado
	 * @param v
	 * Veículo em que os acessorios serão adicionados
	 * @param a1
	 * Objeto 1 da classe Acessório 
	 * @param a2
	 * Objeto 2 da classe Acessório 
	 * @param a3
	 * Objeto 3 da classe Acessório 
	 */
	public void poeAcessorio(Teste teste, Veiculo v, Acessorio a1, Acessorio a2, Acessorio a3) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		while(x<3) {
			System.out.println("Deseja adicionar um Acessório? [0] Sim [1] Não");
			int opcao = sc.nextInt();
			if (opcao == 0){
				System.out.println("Qual acessório?\r\n[0] Ar Condicionado; \r\n[1]Central Multimídia; \r\n[2]Banco de Couro;");
				teste.addAcessorio();
					Scanner sc2 = new Scanner(System.in);
					int opcao2 = sc2.nextInt();
					if (opcao2 == 0) {
						x+=1;
						v.addAcessorios(a1);
					}else if(opcao2 == 1) {
						x+=1;
						v.addAcessorios(a2);
					}else if(opcao2 == 2) {
						x+=1;
						v.addAcessorios(a3);
					}else {
						x-= 1;
						System.out.println("Opção inválida.");
					}
			}
				else if (opcao == 1) {
					System.out.println("Veículo cadastrado com sucesso!");
					x=+3;	
				}else {
					System.out.println("Opção inválida.");
				}
		}
	}
	
	public static void main(String[] args) {
	
		Teste teste = new Teste();
		
		List<Veiculo> veiculos = new ArrayList<>();
		
		Acessorio a1 = new Acessorio("Ar Condicionado", 450.00);
		Acessorio a2 = new Acessorio("Central Multimídia", 1200.00);
		Acessorio a3 = new Acessorio("Banco de Couro", 1850.00);
	
		
		Veiculo v1 = new Veiculo();
		Veiculo v2 = new Veiculo();
		Veiculo v3 = new Veiculo();
		Veiculo v4 = new Veiculo();
		Veiculo v5 = new Veiculo();
		
		Scanner sc = new Scanner(System.in);
		
		
		cadastraVeiculo(v1);
		teste.poeAcessorio(teste,v1,a1,a2,a3);
		cadastraVeiculo(v2);
		teste.poeAcessorio(teste,v2,a1,a2,a3);
		cadastraVeiculo(v3);
		teste.poeAcessorio(teste,v3,a1,a2,a3);
		cadastraVeiculo(v4);
		teste.poeAcessorio(teste,v4,a1,a2,a3);
		cadastraVeiculo(v5);
		teste.poeAcessorio(teste,v5,a1,a2,a3);
		
		
		System.out.println("Valor total dos veículos: " + teste.getValorTotal());
		System.out.println("A média dos valores dos carros é: " + teste.getMediaValorTotal());
		System.out.println("O carro de maior valor: " + teste.getMaiorValor());
		System.out.println("O número total de acessórios é " + teste.getTotalAcessorios());
		

	

		
	}	
}


