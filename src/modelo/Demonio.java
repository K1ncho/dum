package modelo;

public abstract class Demonio {
	
	protected int hp;

	public int getHP() {
		return hp;
	}

	public void serAtacadoPor(Marine marine, int distanciaAlDemonio) {
		marine.getArmaSeleccionada().disparar(this,distanciaAlDemonio);
	}

	public void bajarHP(int danio) {
		hp -= danio;
	}
	
	public Boolean estoyMuerto() {
		return hp<=0;
	}

}
