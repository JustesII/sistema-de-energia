package br.com.ifsc.SistemaDeEnergia;

public class UC extends Fatura {

	private int ucid;
	private Cliente cliente;
	private int leituraAnterior;
	private int leituraAtual;
	private Endereco endereco;
	
	@Override
	public String toString() {
		return "UC [ucid=" + ucid + ", cliente=" + cliente.toString() + ", leituraAnterior=" + leituraAnterior + ", leituraAtual="
				+ leituraAtual + ", endereco=" + endereco.toString() + "]";
	}

	public int getUcid() {
		return ucid;
	}

	public void setUcid(int ucid) {
		this.ucid = ucid;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getLeituraAnterior() {
		return leituraAnterior;
	}

	public void setLeituraAnterior(int leituraAnterior) {
		this.leituraAnterior = leituraAnterior;
	}

	public int getLeituraAtual() {
		return leituraAtual;
	}

	public void setLeituraAtual(int leituraAtual) {
		this.leituraAtual = leituraAtual;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public int faturar(int leitura) {
		return Fatura;
	}
	
	public int pegarConsumo() {
		return consumo;
	}
	

}