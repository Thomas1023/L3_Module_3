package abstract_classes;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
		
	}

	
	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		return population* growthRate + (.5 * population);
	}

}
