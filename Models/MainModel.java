package Models;

/**
 * @author Vilmos Ioo
 */
public class MainModel extends AbstractModel {

	private String Demo;

	public void setDemo(String value) {
		if (!RecentCases.equals(value)) {
			firePropertyChange(MainController.ELEMENT_DEMO_PROPERTY,
					Demo, value);
			Demo = value;
		}
	}

	public String getDemo() {
		return Demo;
	}
}
