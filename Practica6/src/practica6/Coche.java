package practica6;
//version guardada
public class Coche {
	String matricula;
	String atrib;
	String modelo;
	String fabricante;

	//Esta clase verdaderamente no sirve más que para ser inicializada verdaderametne no hace nada
	public Coche() {
		matricula = "";
		atrib = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		//atrib es un poco ambiguo como nombre
		atrib = c;
		modelo = mo;
		fabricante = f;
	}

	public String metodo1() {
		String resultado = "";
		//Demasiados if y else anidados y encima con el mismo atributo atrib
		//añadir a resultado "El coche con matricula " + matricula + " "; se repite en toda la estructura
		//se utilizan constatemente los atributos cuando se podrían hacer metodos get para recogerlos
		//se podría tener mejor seters y geters para atrib, modelo y fabricante
		if (atrib == "Gasolina") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoA(modelo, fabricante);
		} else if (atrib == "Diesel") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoB(modelo, fabricante);
		} else if (atrib == "Híbrido") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoC(modelo, fabricante);
		} else {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += "no dispone de información";
		}
		return resultado;
	}
}
