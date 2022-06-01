package br.com.ifsc.SistemaDeEnergia;

public class Endereco {
	
	private String rua;
	private int numero;
	private String cep;
	private String cidade;
	private String estado;
	
	public String toString() {
		String texto = "";
		texto = "cidade: " +cidade;
		return texto;
		
	}
}
