package practica6;
//version guardada
public class Coche {
	public static final String EL_COCHE_CON_MATRICULA = "El coche con matricula ";
	CocheData data = new CocheData();

	public Coche() {
		data.setMatricula("");
		data.setCombustible("");
		data.setModelo("");
		data.setFabricante("");
	}

	public Coche(String m, String c, String mo, String f) {
		data.setMatricula(m);
		data.setCombustible(c);
		data.setModelo(mo);
		data.setFabricante(f);
	}

	public String metodo1() {
		String resultado = "";

		if (data.getCombustible() == "Gasolina") {
			resultado += EL_COCHE_CON_MATRICULA + data.getMatricula() + " ";
			resultado += metodoA(data.getModelo(), data.getFabricante());
		} else if (data.getCombustible() == "Diesel") {
			resultado += EL_COCHE_CON_MATRICULA + data.getMatricula() + " ";
			resultado += metodoB(data.getModelo(), data.getFabricante());
		} else if (data.getCombustible() == "Híbrido") {
			resultado += EL_COCHE_CON_MATRICULA + data.getMatricula() + " ";
			resultado += metodoC(data.getModelo(), data.getFabricante());
		} else {
			resultado += EL_COCHE_CON_MATRICULA + data.getMatricula() + " ";
			resultado += "no dispone de información";
		}
		String definicion_Coche = resultado;
		return definicion_Coche;
	}

	private String metodoA(String modelo, String fabricante) {
		String devuelve ="es un "+modelo+" "+fabricante+" y gasta 1,337 por litro.";
		return devuelve;
	}

	private String metodoB(String modelo, String fabricante) {
		String devuelve ="es un "+modelo+" "+fabricante+" y gasta 1,052 por litro.";
		return devuelve;
	}

	private String metodoC(String modelo, String fabricante) {
		String devuelve ="es un "+modelo+" "+fabricante+" y no necesita combustible.";
		return devuelve;
	}
}
 