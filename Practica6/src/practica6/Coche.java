package practica6;
//version guardada
/**
 * 
 * @author MOSQUETEX
 * @version UltimaSupongo
 *
 */
public class Coche {
	public static final String EL_COCHE_CON_MATRICULA = "El coche con matricula ";
	CocheData data = new CocheData();
	
	public Coche() {
		data.setMatricula("");
		data.setCombustible("");
		data.setModelo("");
		data.setFabricante("");
	}
	/**
	 * 
	 * @param m este parametro es la matricula del coche
	 * @param c este parametro es el combustible del coche
	 * @param mo este parametro es el modelo del coche
	 * @param f este parametro es el fabricante del coche
	 */

	public Coche(String m, String c, String mo, String f) {
		data.setMatricula(m);
		data.setCombustible(c);
		data.setModelo(mo);
		data.setFabricante(f);
	}

	/**
	 * 
	 * @return Devuelve el string que define el coche recogido
	 */
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

	/**
	 * 
	 * @param modelo Este es el modelo recogido del actual coche
	 * @param fabricante Este es el fabricante recogido del actual coche
	 * @return Devuelve "es un @param modelo @param fabricante  y gasta 1,337 euros por litro."
	 */
	public String metodoA(String modelo, String fabricante) {
		String devuelve ="es un "+modelo+" "+fabricante+" y gasta 1,337 por litro.";
		return devuelve;
	}

	/**
	 * 
	 * @param modelo Este es el modelo recogido del actual coche
	 * @param fabricante Este es el fabricante recogido del actual coche
	 * @return Devuelve "es un @param modelo @param fabricante  y gasta 1,052 euros por litro."
	 */
	public String metodoB(String modelo, String fabricante) {
		String devuelve ="es un "+modelo+" "+fabricante+" y gasta 1,052 por litro.";
		return devuelve;
	}

	/**
	 * 
	 * @param modelo Este es el modelo recogido del actual coche
	 * @param fabricante Este es el fabricante recogido del actual coche
	 * @return Devuelve "es un @param modelo @param fabricante  y no necesita combustible."
	 */
	public String metodoC(String modelo, String fabricante) {
		String devuelve ="es un "+modelo+" "+fabricante+" y no necesita combustible.";
		return devuelve;
	}
}
 