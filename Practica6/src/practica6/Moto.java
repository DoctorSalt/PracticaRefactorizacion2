package practica6;
//Esta clase solo tien metodos get y set, y no posee de ninguna otra funcionalidad
public class Moto {
	String matricula;
	int cilindrada;

	//Esta clase verdaderamente no sirve más que para ser inicializada verdaderamente no hace nada
	public Moto() {
		matricula = "";
		cilindrada = 0;
	}

	public Moto(String m, int c) {
		matricula = m;
		cilindrada = c;
	}

	public String getMatricula() {
		return matricula;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setMatricula(String m) {
		matricula = m;
	}

	public void setCilindrada(int c) {
		cilindrada = c;
	}
}
