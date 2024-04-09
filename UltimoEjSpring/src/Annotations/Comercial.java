package Annotations;

import org.springframework.stereotype.Component;

@Component("comercial")
public class Comercial implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vendiendo...";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Generar Informe...";
	}

}
