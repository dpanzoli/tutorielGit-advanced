package youstache;

import java.awt.List;
import java.awt.Panel;

public class AWT_ListeImages extends Panel {
	
	public AWT_ListeImages(Modèle modl, ControleurListe ctrl) {
		
		List listeImages = new List(40);
		for (int i=0; i<modl.images.size(); i++) {
			String im = modl.images.get(i).fichier;
			listeImages.add(im);
		}

		listeImages.addItemListener(ctrl);
		
		this.add(listeImages);
	}

}
