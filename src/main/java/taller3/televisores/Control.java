package taller3.televisores;

public class Control {
	private static TV tele;
	public Control() {
	}

	static void enlazar(TV tv) {
		Control.tele=tv;
	}

	public void turnOff() {
		if(TV.estado==true) {
			TV.estado=false;
		}
	}

	public void turnOn() {
		if(TV.estado==false) {
			TV.estado=true;
		}
	}

	public void setCanal(int canal) {
		if(TV.estado==true) {
			TV.setCanal(canal);
		}
		else {
			return;
		}
	}

	public void canalUp() {
		if(TV.estado==true) {
			TV.canal++;
		}
		else {
			return;
		}
	}
	public void canalDown() {
		if(TV.estado==true) {
			TV.canal--;
		}
		else {
			return;
		}
	}
	public void volumenUp() {
		if(TV.estado==true) {
			TV.volumen++;;
		}
		else {
			return;
		}
	}
	public void volumenDown() {
		if(TV.estado==true) {
			TV.volumen--;;
		}
		else {
			return;
		}
	}
}
