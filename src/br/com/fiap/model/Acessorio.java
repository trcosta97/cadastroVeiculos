package br.com.fiap.model;
/**
 * 
 * Classe que que armazena os métodos e atributos de um Acessório
 * @author Thiago Ribeiro, RM 92800
 *
 */

public class Acessorio {
	private String descricao;
	private double valor;
	
	
	
	public Acessorio(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return (this.descricao +" - R$" + this.valor);
	}
		}