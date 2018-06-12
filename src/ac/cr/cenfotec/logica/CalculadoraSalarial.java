package ac.cr.cenfotec.logica;

public class CalculadoraSalarial {

	/*
	 * El salario = 1000e si el empleado es de tipo Vendedor, y de 1500e si es
	 * Encargado. Sume un bono de 100e ventasMes es mayor o igual que 1000e, y de
	 * 200e si es al menos de 1500e. Cada hora extra se pagará a 20e. Si tipo es
	 * null, o ventasMes es negativo o horasExtra es negativo el método lanzará un
	 * new Exception
	 */
	public float calculaSalarioBruto(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		float salario = 0.0f;
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

	public boolean ifTipoIsNull(TipoEmpleado tipo) {
		boolean bandera = true;
		if (tipo == null) {
			bandera = false;
		}
		return bandera;
	}

}
