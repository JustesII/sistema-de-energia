package br.com.ifsc.SistemaDeEnergia;

public class Cliente {
	
	private int clienteId;
	private String nome;
	private Endereco endereco;
		
	public String toString() {
		return "c�digo do cliente: " + clienteId 
				+ "\nnome: " + nome 
				+ endereco.toString();
	}
	
	
}
