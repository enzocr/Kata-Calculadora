package ac.cr.cenfotec.logica;

public class AnnoBisiesto {

	public boolean isBisiesto(int anno) {
		if (!multiploDeCuatro(anno)) {
			return false;
		} else if (multiploDeCien(anno)) {
			return true;
		} else if (multiploDeCuatrocientos(anno)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean multiploDeCuatro(int anio) {
		if (anio % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean multiploDeCien(int anio) {
		if (anio % 100 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean multiploDeCuatrocientos(int anio) {
		if (anio % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
