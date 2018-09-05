package youstache;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControleurImage implements MouseListener {

	Modèle modl;
	
	public ControleurImage(Modèle m) {
		this.modl = m;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		this.modl.ajoutMoustache(e.getPoint());
	}
	
	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

}
