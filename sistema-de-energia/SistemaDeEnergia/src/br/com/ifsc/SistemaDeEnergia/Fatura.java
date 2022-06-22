package br.com.ifsc.SistemaDeEnergia;

public class Fatura extends Cliente {

	private int faturaId;
	private int mesAno;
	private UC unidadeConsumidora;
	private int consumo;
	private boolean pago;

	public int getFaturaId() {
		return faturaId;
	}

	public void setFaturaId(int faturaId) {
		this.faturaId = faturaId;
	}

	public int getMesAno() {
		return mesAno;
	}

	public void setMesAno(int mesAno) {
		this.mesAno = mesAno;
	}

	public UC getUnidadeConsumidora() {
		return unidadeConsumidora;
	}

	public void setUnidadeConsumidora(UC unidadeConsumidora) {
		this.unidadeConsumidora = unidadeConsumidoraa;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

}
