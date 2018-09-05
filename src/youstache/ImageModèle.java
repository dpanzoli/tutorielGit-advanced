package youstache;

import java.awt.Point;
import java.io.Serializable;

public class ImageModèle implements Serializable {

	private static final long serialVersionUID = 1L;

	String fichier;

	Point moustache; 
	
	public ImageModèle(String f) {
		this.fichier = f;
		this.moustache = null;
	}

}
