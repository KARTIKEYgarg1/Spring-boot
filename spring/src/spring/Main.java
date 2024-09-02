package spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
public static void main(String args[] ){
//	Greet g=new Greet();
	ApplicationContext ctx= new ClassPathXmlApplicationContext("bean.xml");
	System.out.println(ctx.getBean("greet"));
}
}
