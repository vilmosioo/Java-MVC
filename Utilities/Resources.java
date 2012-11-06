package Utilities;

import java.awt.Color;
import java.awt.Font;
import java.io.File;

/**
 * @author Vilmos Ioo 
 * Static class to store various strings used in the application
 */
public class Resources {

	public static String FILENAME = "fileName";
	public static final Font STANDARD_FONT = new Font("DejaVu Sans", Font.PLAIN, 12);
	public static class Colors {
		public static Color Blue = new Color(0.3f, 0.5f, 1f);
		public static Color Red = new Color(1f, 0.3f, 0.1f);
		public static Color Green = new Color(0.3f, 1f, 0.5f);
		public static Color Black = new Color(33, 33, 33);
	}
}
