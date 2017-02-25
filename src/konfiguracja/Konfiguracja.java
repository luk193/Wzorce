package konfiguracja;

import dokumenty.RabatKwotowy;
import rabaty.IRabat;

public class Konfiguracja {

	private static Konfiguracja instance;

	private Konfiguracja() {
	}

	public static Konfiguracja getInstance() {

		if (instance == null)
			instance = new Konfiguracja();
		return instance;
	}

	public int getKwotaRabatu(){
		return 20;
		
	}

	public double getProcentRabatu(){
		
		return 0.05;
	}

	public IRabat getActualRabat() {
		return new RabatKwotowy();
	}

}
