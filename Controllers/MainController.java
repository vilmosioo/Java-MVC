package Controllers;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;
import java.util.List;

import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLProfile;
import javax.swing.SwingUtilities;

import Data.Patch;
import Data.Point;
import Models.MainModel;
import Utilities.ConfigFile;
import Utilities.FileReader;
import Utilities.IRepository;
import Utilities.Log;
import Utilities.MainCanvas;
import Utilities.ModelManipulation;
import Utilities.Repository;
import Views.ModernView;

/**
 * @author Vilmos Ioo
 */
public class MainController extends AbstractController {

	public static final String ELEMENT_DEMO_PROPERTY = "Demo";
	private IRepository repository;
	private static MainController controller = null;


	/*
	* Singleton pattern to ensure a single controller
	*/
	public static synchronized MainController Current() {
		if (controller == null) {
			controller = new MainController();
		}
		return controller;
	}

	private MainController() {
		initialise();
	}

	public void initialise() {
		this.addModel(new MainModel());
		final ModernView view = new ModernView();
		this.addView(view);

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				view.setVisible(true);
			}
		});
	}

	/*
	* Example method to change a model property
	*/
	public void demo(String newText) {
		this.setModelProperty(ELEMENT_DEMO_PROPERTY, newText);
	}

}
