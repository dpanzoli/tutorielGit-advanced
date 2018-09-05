package youstache;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;

public class AWT_AfficheurImage extends Canvas implements Observer {

	Modèle modl;
	
	Image img = null;
	Point moustache = null;

	static Image moustachePNG = null;
	
	static Point moustachePNG_offset = new Point(85,15);
	
	public AWT_AfficheurImage(Modèle m) {
		super();
		this.modl = m;
		m.addObserver(this);
		this.setPreferredSize(new Dimension(450,600));
		try {
			moustachePNG = ImageIO.read(new File("moustache.png"));
		} catch (IOException e) {
			throw new RuntimeException("L'image de la moustache est introuvable");
		}
	}

	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
		
		if (this.moustache != null)
			g.drawImage(	moustachePNG, 
							this.moustache.x-this.moustachePNG_offset.x, 
							this.moustache.y-this.moustachePNG_offset.y, 
							null);
	}

	@Override
	public void update(Observable o, Object arg) {
		ImageModèle im = this.modl.images.get(this.modl.indexImageSelectionnée);
		try {
			this.img = ImageIO.read(new File("images/"+im.fichier+".jpg"));
			this.moustache = im.moustache;
		} catch (IOException e) {
			throw new RuntimeException("L'image images/"+im.fichier+".jpg est introuvable");
		}
		repaint();
	}
}
