package PrimaIntercorso2019;

import java.util.ArrayList;

public class SistemaDomotico {

	public SistemaDomotico(double consumo) {
		this.consumoMax = consumo;
		lista = new ArrayList<>();
	}
	
	public void aggiungiDispositivo(DispositivoIoT d) {
		lista.add(d);
	}
	
	public void programmaAccensione(int i, int ora, int minuto) {
		if(i >= lista.size())
			return;
		lista.get(i).accendiDispositivo(ora, minuto);
	}
	
	public void programmaSpegnimento(int i, int ora, int minuto) {
		if(i >= lista.size())
			return;
		lista.get(i).spegniDispositivo(ora, minuto);
	}
	
	public void attivaRisparmioEnergetico(int ora, int minuto) {
		for(DispositivoIoT d: lista) {
			if(d.getOraAccensione() == /*>=*/ ora - 2 && d.getMinutoAccensione() == /*>=*/ minuto) //ERRORE
				d.spegni();
		}
	}
	
	public String toString() {
		String s = "";
		for(DispositivoIoT d: lista)
			s += d.toString() + "\n";
		return s;
	}
	
	public String informazioniDispositiviAccesi() {
		String s = "";
		for(DispositivoIoT d: lista)
			if(d.getStato())
				s += d.toString() + "\n";
		return s;
	}
	
	
	public void accendiDispositivi(int ora, int minuto) {
		for(DispositivoIoT d: lista) {
			if((d.getOraAccensione() - ora) <= 0 && (d.getMinutoAccensione() - minuto) <= 0)
				d.accendi();
		}
	}
	
	public double controllaConsumo(int ora, int minuto) {
		double consumo = 0;
		for(DispositivoIoT d: lista)
			if(d.getStato())
				consumo += d.getConsumo();
		if(consumo <= consumoMax)
			return consumo;
		for(DispositivoIoT d: lista)
			if(d instanceof Climatizzatore) {
				d.spegni();
				consumo -= 0.3;
				if(consumo <= consumoMax)
					return consumo;
			}
		for(DispositivoIoT d: lista)
			if(d instanceof Persiana) {
				d.spegni();
				consumo -= 0.15;
				if(consumo <= consumoMax)
					return consumo;
			}
		for(DispositivoIoT d: lista)
			if(d instanceof LampadinaRGB) {
				d.spegni();
				consumo -= 0.1;
				if(consumo <= consumoMax)
					return consumo;
			}
		return consumo;
	}
	
	private ArrayList<DispositivoIoT> lista;
	private double consumoMax;
}
