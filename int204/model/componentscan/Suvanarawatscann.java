package int204.model.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("suva")
@Scope("singleton")
public class Suvanarawatscann implements Injectionscan{
	
	@Autowired @Qualifier("poon") Poonpipatscan p;
	
	
	
	public Suvanarawatscann() {
		
	}

	public Suvanarawatscann(Poonpipatscan p) {
		
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
