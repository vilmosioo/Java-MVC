package Views;

import java.awt.Dimension;
import java.beans.PropertyChangeEvent;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * @author Vilmos Ioo
 */
public abstract class AbstractView extends JFrame {

	public AbstractView(String title) {
    // TODO Set some default proprieties
		super(title);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public abstract void modelPropertyChange(PropertyChangeEvent evt);
}
