package int204.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import int204.model.Detudom;
import int204.model.Injection;
import int204.model.Poonpipat;
import int204.model.Suvanarawat;
import int204.model.componentscan.Detudomscan;
import int204.model.componentscan.Injectionscan;
import int204.model.componentscan.Poonpipatscan;
import int204.model.componentscan.Suvanarawatscann;


public class Lamaiphanscan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext02.xml");
		
		
		Injectionscan x = (Poonpipatscan) context.getBean("poon");
		System.out.println(x.getHead()+ x.getTail());
		
		Injectionscan y = (Suvanarawatscann) context.getBean("suva");
		System.out.println(y.getHead()+ y.getTail());
		
		Detudomscan z = (Detudomscan) context.getBean("det");
		System.out.println(z.getList());
		
		context.close();
	}

}
