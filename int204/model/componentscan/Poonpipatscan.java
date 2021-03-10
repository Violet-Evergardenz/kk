package int204.model.componentscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("poon")
@Scope("prototype")
public class Poonpipatscan implements Injectionscan {
	 String suvanarawat;
	 int august;
	
	
	
	public Poonpipatscan() {
		
	}

	public Poonpipatscan(String suvanarawat, int august) {
		
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
