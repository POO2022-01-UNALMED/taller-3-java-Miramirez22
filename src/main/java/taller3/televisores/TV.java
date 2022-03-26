package taller3.televisores;

public class TV {
	private int precio=500;
	public static int canal=1;
	public static boolean estado;
	public static int volumen=1;
	private static Marca marca;
	public static int numTV;
	
	public TV (Marca marca, boolean estado) {
		this.marca= marca;
		this.estado = estado;
	}
	
	public void setPrecio(int precio) {
		this.precio= precio;
	}
	
	public static void setCanal(int canal) {
		TV.canal=canal;
		if (canal>120) {
			return;
		}
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
		if(volumen>7) {
			return;
		}
	}
	
	
	public int getVolumen() {
		return volumen;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void agregarTv() {
		TV.numTV++;
	}

}
