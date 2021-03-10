package int204.model;

import java.util.List;

public class Detudom {
	private List<Injection> myList;
	
	
	
	public Detudom() {
		
	}

	public Detudom(List<Injection> myList) {
		
		this.myList = myList;
	}

	public List<Injection> getList(){
		return this.myList;
		
	}
}
