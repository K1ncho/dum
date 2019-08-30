package modelo;

import java.util.List;

public class Nivel {
	//field variable de instancia
	private List<Demonio> demonios;
	
	//stream es para poder utilizar las collecciones como en smoltok o wollok
	public Demonio demonioMasDuro() {
		Demonio demonioMasDuro = demonios.get(0);
		for (Demonio demonio : demonios) {
			if (demonio.getHP() > demonioMasDuro.getHP()) {
				demonioMasDuro = demonio;
			};
		}	
		return demonioMasDuro;
	}
}