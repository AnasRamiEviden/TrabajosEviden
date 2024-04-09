package Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		Empleados Anas = contexto.getBean("comercial", Empleados.class);
		
		System.out.println(Anas.getInforme());
		System.out.println(Anas.getTareas());
		contexto.close();
	}

}
