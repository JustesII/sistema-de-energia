package br.com.ifsc.SistemaDeEnergia;

public class PessoaJuridica extends Cliente {
	
	private String cnpj;
	
	public String toString() {
		
			String Cnpj = "";
			cnpj = "Cnpj: " +cnpj;
			return cnpj;
					
		return null;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	

}
