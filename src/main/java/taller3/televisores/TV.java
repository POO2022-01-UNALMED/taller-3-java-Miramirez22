package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int volumen;
	private int precio;
	private boolean estado;
	private static int numTV=0;
	public Control controltv;
	
	public TV (Marca marca, boolean estado) {
		this.marca= marca;
		this.estado = estado;
		precio = 500;
		canal = 1;
		volumen = 1;
		TV.numTV = TV.numTV+1;
	}
	
	public void setPrecio(int precio) {
		this.precio= precio;
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
	
	public void setControl(Control control) {
		this.controltv=control;
	}
	
	public Control getControl() {
		return controltv;
	}
	public void setMarca(Marca marcatv) {
		this.marca=marcatv;
	}
	public Marca getMarca() {
		return marca;
	}
	
	public void setCanal(int canal) {
		if(estado==true) {
			if(canal<120) {
				this.canal=canal;
				}
		}
		else {
			return;
		}
	}

	public void turnOff() {
		estado=false;
	}

	public void turnOn() {
		estado=true;
	}
	
	public void canalUp() {
		if(estado==true) {
			canal++;
		}
		else {
			return;
		}
	}
	public void canalDown() {
		if(estado==true) {
			canal--;
		}
		else {
			return;
		}
	}
	public void volumenUp() {
		if(estado==true) {
			volumen++;;
		}
		else {
			return;
		}
	}
	public void volumenDown() {
		if(estado==true) {
			volumen--;;
		}
		else {
			return;
		}
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public static void setNumTV(int num) {
		TV.numTV=num;
	}
	public static int getNumTV() {
		return TV.numTV;
	}


}
