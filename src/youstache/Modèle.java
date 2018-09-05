package youstache;

import java.awt.Point;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Observable;

public class Modèle extends Observable { 

	public ArrayList<ImageModèle> images;

	int indexImageSelectionnée = 0;

	public Modèle() {}

	/**
	 * Exploration du répertoire des images
	 * @param dir
	 */
	public void chargerDonnées(String dir) {
		
		File repImages = new File(dir);
		File[] imagesListe = repImages.listFiles();
		this.images = new ArrayList<>();
		for (File file : imagesListe) {
			String nomImage = file.getName().split("\\.")[0];
			this.images.add(new ImageModèle(nomImage));
		}
	}

	public void sélection(int item) {
		this.indexImageSelectionnée = item;
		this.setChanged();
		this.notifyObservers();
	}
	
	public void ajoutMoustache(Point coords) {
		this.images.get(this.indexImageSelectionnée).moustache = coords;
		this.setChanged();
		this.notifyObservers();
	}

}
