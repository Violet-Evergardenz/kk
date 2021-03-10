package int204.main.purejava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import int204.model.Detudom;
import int204.model.Injection;
import int204.model.Poonpipat;
import int204.model.Suvanarawat;
import int204.model.componentscan.Detudomscan;
import int204.model.componentscan.Injectionscan;
import int204.model.componentscan.Poonpipatscan;
import int204.model.componentscan.Suvanarawatscann;
import int204.model.purejava.DetudomP;
import int204.model.purejava.InjectionP;
import int204.model.purejava.PoonpipatP;
import int204.model.purejava.SuvanarawatP;


public class Lamaiphanscanpure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(BeanConfig.class);
				
		
		
		InjectionP x = (PoonpipatP) context.getBean("poon");
		System.out.println(x.getHead()+ x.getTail());
		
		
		InjectionP y = (SuvanarawatP) context.getBean("suva");
		System.out.println(y.getHead()+ y.getTail());
		
		DetudomP z = (DetudomP) context.getBean("det");
		System.out.println(z.getList());
		System.out.println(z.getList().get(0));
		System.out.println(z.getList().get(1));
		
		context.close();
	}

}
