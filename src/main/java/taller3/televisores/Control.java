package taller3.televisores;

public class Control {
	private TV tele;
	
	public void enlazar(TV tv) {
		this.tele=tv;
		this.tele.controltv=this;
	}
	
	public void turnOn() {
		tele.turnOn();
	}
	public void turnOff() {
		tele.turnOff();
	}
	public void volumenUp() {
		tele.volumenUp();
	}
	public void volumenDown() {
		tele.volumenDown();
	}
	public void canalUp() {
		tele.canalUp();
	}
	public void canalDown() {
		tele.canalDown();
	}
	public void setCanal(int canal) {
		tele.setCanal(canal);
	}
	public TV getTV() {
		return tele;
	}
	public void setTV(TV tele) {
		this.tele=tele;
	}




}
