package youstache;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Controller for the image display.
 * Basically detects click + click coordinates
 * @author David
 *
 */
public class ImageController implements MouseListener, KeyListener {

	Model modl;
	
	public ImageController(Model m) {
		this.modl = m;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		this.modl.pinMoustache(e.getPoint());
	}
	
	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		this.modl.removeMoustache();
	}

	@Override
	public void keyReleased(KeyEvent e) {}

}
