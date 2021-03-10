package int204.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import int204.model.Detudom;
import int204.model.Injection;
import int204.model.Poonpipat;
import int204.model.Suvanarawat;


public class Lamaiphan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Injection x = (Poonpipat) context.getBean("me");
		System.out.println("Bean id = me : "+x.getHead()+" "+x.getTail());
		System.out.println(x);
		Injection y = (Suvanarawat) context.getBean("mine");
		System.out.println("Bean id = mine : "+y.getHead()+" "+y.getTail());
		System.out.println(y);
		Detudom z = (Detudom) context.getBean("listBean");
		System.out.println(z.getList());
		System.out.println("1st element equal as "+(z.getList().get(0) == x));
		System.out.println("2nd element is the same as y: "+(z.getList().get(1) == y));
		context.close();
	}

}
