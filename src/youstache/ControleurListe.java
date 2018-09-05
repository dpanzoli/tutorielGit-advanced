package youstache;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ControleurListe implements ItemListener {

	Modèle modl;
	
	public ControleurListe(Modèle m) {
		this.modl = m;
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		this.modl.sélection((Integer)e.getItem());
	}

}
