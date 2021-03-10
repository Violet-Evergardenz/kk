package int204.main.purejava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import int204.model.purejava.DetudomP;
import int204.model.purejava.PoonpipatP;
import int204.model.purejava.SuvanarawatP;

@Configuration

public class BeanConfig {
@Bean
@Scope("singleton")
public PoonpipatP poon() {
	return new PoonpipatP();
}

@Bean
@Scope("singleton")
public SuvanarawatP suva() {
	return new SuvanarawatP (poon());
}

@Bean
@Scope("singleton")
public DetudomP det() {
	return new DetudomP ();
}
}
