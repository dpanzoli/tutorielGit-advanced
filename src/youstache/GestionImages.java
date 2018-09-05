package youstache;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GestionImages extends Frame implements WindowListener {

	public static void main(String[] args) {
		new GestionImages("images/");
	}

	Modèle modl;

	public GestionImages(String dir) {

		this.modl = new Modèle();
		this.modl.chargerDonnées(dir);

		ControleurListe ctrlL = new ControleurListe(modl); 
		ControleurImage ctrlI = new ControleurImage(modl);
		
		this.setLayout(new BorderLayout());

		AWT_ListeImages panneauGauche = new AWT_ListeImages(modl, ctrlL);
		this.add(panneauGauche, BorderLayout.WEST);

		AWT_AfficheurImage panneauDroite = new AWT_AfficheurImage(modl);
		this.add(panneauDroite, BorderLayout.EAST);
		panneauDroite.addMouseListener(ctrlI);

		this.addWindowListener(this);
		this.setTitle("Youstache! You put the moustache!");
		this.pack();
		this.setVisible(true);
		
		this.modl.sélection(0);
	}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) { 
		System.exit(0); 
	}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}

}
