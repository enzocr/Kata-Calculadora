package ac.cr.cenfotec.logica;

public class CalculadoraSalarial {

	public float calculaSalarioBruto(TipoEmpleado tipo, float ventasMes, float horasExtra) throws Exception {
		float salario = 0.0f;

		if (horasExtraNegativas(horasExtra) || ventasMesNegativas(ventasMes) || tipoIsNull(tipo)) {
			return 0;
		} else {

			salario = calcularSalario(tipo, ventasMes, horasExtra);

		}

		return salario;

	}

	private float calcularSalario(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		float salario = 0;
		if (tipo.equals(TipoEmpleado.VENDEDOR)) {
			salario = 1000;
		}
		if (tipo.equals(TipoEmpleado.ENCARGADO)) {
			salario = 1500;
		}
		if (ventasMes >= 1500) {
			salario += 200;
		} else if (ventasMes >= 1000) {
			salario += 100;
		}
		salario += (horasExtra * 20);
		return salario;
	}

	public boolean horasExtraNegativas(float horasExtra) throws Exception {
		boolean bandera = false;
		if (horasExtra < 0) {
			bandera = true;
			throw new Exception("Horas extra negativas");
		}

		return bandera;
	}

	public boolean ventasMesNegativas(float ventasMes) throws Exception {
		boolean bandera = false;
		if (ventasMes < 0) {
			bandera = true;
			throw new Exception("Ventas del mes negativas");
		}

		return bandera;
	}

	public boolean tipoIsNull(TipoEmpleado tipo) throws Exception {
		boolean bandera = false;
		if (tipo == null) {
			bandera = true;
			throw new Exception("Tipo de Empleado es nulo");
		}
		return bandera;
	}

}
