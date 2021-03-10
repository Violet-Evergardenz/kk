package int204.model;

public class Suvanarawat implements Injection{
	Poonpipat p;
	
	
	
	public Suvanarawat() {
		
	}

	public Suvanarawat(Poonpipat p) {
		
		this.p = p;
	}

	
	@Override
	public String getHead() {
		// TODO Auto-generated method stub
		return this.p.getHead();
	}

	@Override
	public int getTail() {
		// TODO Auto-generated method stub
		return this.p.getHead().length();
	}

}
