package br.com.ifsc.SistemaDeEnergia;

public class Cliente extends Endereco {
	
	private int clienteId;
	private String nome;
	private Endereco endereco;
	
	public String toString() {
		String texto = "";
		texto = "nome: " +nome;
		return texto;
	}

}
