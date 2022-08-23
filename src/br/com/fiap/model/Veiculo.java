package br.com.fiap.model;
import java.util.List;
import java.util.Vector;

/**
 * 
 * Classe que que armazena os m�todos e atributos de um Veiculo
 * @author Thiago Ribeiro, RM 92800
 *
 */

public class Veiculo {
	private int anoFabricacao;
	private String modelo;
	private float valor;
	private String montadora;
	Vector<Acessorio> acessorios = new Vector<Acessorio>(3);
	
	
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getMontadora() {
		return montadora;
	}
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}
	public List<Acessorio> getAcessorios() {
		return acessorios;
	}
	public void setAcessorios(Vector<Acessorio> acessorios) {
		this.acessorios = acessorios;
	}
	
	/**
	 * M�todo que adiciona Acess�rio a lista do atributo acessorio de um objeto da classe Ve�culo
	 * @param a
	 */
	public void addAcessorios(Acessorio a) {
		this.acessorios.add(a);
		
	
		
	}
	@Override
	public String toString() {
		return "[Ano de Fabrica��o: " + this.anoFabricacao + " - Modelo: " + this.modelo + " - Valor: " + this.valor + " - Montadora: " + this.montadora + " - Acess�rios: " + this.acessorios + "]"; 
	}



}


