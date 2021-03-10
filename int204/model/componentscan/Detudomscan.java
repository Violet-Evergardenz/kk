package int204.model.componentscan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("det")
@Scope("singleton")
public class Detudomscan {
	@Autowired private List<Injectionscan> myList;
	
	
	
	public Detudomscan() {
		
	}

	public Detudomscan(List<Injectionscan> myList) {
		
		this.myList = myList;
	}

	public List<Injectionscan> getList(){
		return this.myList;
		
	}
}
