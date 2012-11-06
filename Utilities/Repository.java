package Utilities;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Controllers.MainController;
import Data.Face;
import Data.Patch;
import Data.Point;

/**
 * @author Vilmos Ioo
 */
public class Repository implements IRepository {

	private MainController controller = MainController.Current();

	public Repository() {

	}

	
	public void connect() {
		// TODO Connect to a database
	}
}
