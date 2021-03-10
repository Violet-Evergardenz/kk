package int204.model.purejava;

import org.springframework.beans.factory.annotation.Autowired;

public class SuvanarawatP implements InjectionP{
	
	 PoonpipatP p;
	
	
	
	public SuvanarawatP() {
		
	}

	public SuvanarawatP(@Autowired PoonpipatP p) {
		
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
