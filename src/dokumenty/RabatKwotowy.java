package dokumenty;

import konfiguracja.Konfiguracja;
import rabaty.IRabat;

public class RabatKwotowy implements IRabat {

	@Override
	public double obliczCenePoRabacie(double cena) {

		return cena - Konfiguracja.getInstance().getKwotaRabatu();
	}

}
