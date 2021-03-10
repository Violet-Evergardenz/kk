package int204.model;

public class Poonpipat implements Injection {
	String suvanarawat;
	int august;
	
	
	
	public Poonpipat() {
		
	}

	public Poonpipat(String suvanarawat, int august) {
		
		this.suvanarawat = suvanarawat;
		this.august = august;
	}

	public void setSuvanarawat(String suvanarawat) {
		this.suvanarawat = suvanarawat;
	}

	public void setAugust(int august) {
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
