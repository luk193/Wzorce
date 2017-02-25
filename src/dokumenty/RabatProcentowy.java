package dokumenty;

import rabaty.IRabat;

public class RabatProcentowy implements IRabat {

	@Override
	public double obliczCenePoRabacie(double cena) {
		
		return cena*0.9;
	}

}
