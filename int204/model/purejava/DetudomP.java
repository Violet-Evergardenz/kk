package int204.model.purejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class DetudomP {
	@Autowired private List<InjectionP> myList;
	
	
	
	public DetudomP() {
		
	}

	public DetudomP(List<InjectionP> myList) {
		
		this.myList = myList;
	}

	public List<InjectionP> getList(){
		return this.myList;
		
	}
}
