package Views;

/**
 * @author Vilmos Ioo
 */
public class ModernView extends AbstractView {
	protected final MainController controller = MainController.Current();

	public ModernView() {
		super("JOGL - Modern");

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				addComponents();
			}
		});
	}

	public void addComponents() {

	}

	@Override
	public void modelPropertyChange(final PropertyChangeEvent evt) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				if (evt.getPropertyName().equals(MainController.ELEMENT_DEMO_PROPERTY)) {
					// TODO Do something with this event
				} 
				validate();
				repaint();
			}
		});
	}
}
