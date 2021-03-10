package int204.model.scanjavaxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import int204.model.componentscan.Detudomscan;
import int204.model.componentscan.Injectionscan;
import int204.model.componentscan.Poonpipatscan;
import int204.model.componentscan.Suvanarawatscann;

public class mainscanConfig {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(scanConfig.class);
		Injectionscan x = (Poonpipatscan) context.getBean("poon");
		System.out.println(x.getHead()+ x.getTail());
		
		Injectionscan y = (Suvanarawatscann) context.getBean("suva");
		System.out.println(y.getHead()+ y.getTail());
		
		Detudomscan z = (Detudomscan) context.getBean("det");
		System.out.println(z.getList());
		
		context.close();
	}
}
