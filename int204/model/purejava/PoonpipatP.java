package int204.model.purejava;

import org.springframework.beans.factory.annotation.Value;

public class PoonpipatP implements InjectionP {
	String suvanarawat;
	int august;
	
	
	
	 public PoonpipatP() {
		
	}

	public PoonpipatP(String suvanarawat, int august) {
		
		this.suvanarawat = suvanarawat;
		this.august = august;
	}

	@Value("Boss") public void setSuvanarawat(String suvanarawat) {
		this.suvanarawat = suvanarawat;
	}

	@Value("130") public void setAugust(int august) {
		this.august = august;
	}

	@Override
	public String getHead() {
		// TODO Auto-generated method stub
		return this.suvanarawat;
	}

	@Override
	public int getTail() {
		// TODO Auto-generated method stub
		return this.august;
	}

}
