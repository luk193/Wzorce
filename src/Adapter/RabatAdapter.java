package Adapter;

import rabatlosowy.LosowyRabat;
import rabaty.IRabat;

public class RabatAdapter implements IRabat {

	@Override
	public double obliczCenePoRabacie(double cena) {
		double rabat = new LosowyRabat().losujRabat();

		return cena - cena * rabat;
	}

}
