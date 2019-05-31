package practica6;
//Esta clase solo tien metodos get y set, y no posee de ninguna otra funcionalidad
public class Moto {
	MotoData data = new MotoData();

	//Esta clase verdaderamente no sirve más que para ser inicializada verdaderamente no hace nada
	public Moto() {
		data.setMatricula("");
		data.setCilindrada(0);
	}

	/**
	 * 
	 * @param m Esta es la matricula de la moto
	 * @param c Esta es la cilindrada de la moto
	 */
	public Moto(String m, int c) {
		data.setMatricula(m);
		data.setCilindrada(c);
	}

	public String getMatricula() {
		return data.getMatricula();
	}

	public int getCilindrada() {
		return data.getCilindrada();
	}

	public void setMatricula(String m) {
		data.setMatricula(m);
	}

	public void setCilindrada(int c) {
		data.setCilindrada(c);
	}
}
