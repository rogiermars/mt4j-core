package processing.opengl;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PGraphics;
import processing.core.PImage;

public class BlurExample1 extends PApplet {
	/**
	 * Blur Filter
	 *
	 * Change the default shader to apply a simple, custom blur filter.
	 *
	 * Press the mouse to switch between the custom and default shader.
	 */
	PShader blur;
	PImage img;

	public void setup() {
		size(1920, 1080, P2D);

		img = loadImage("C:\\Workspace\\Tango Teach\\themes\\Teach\\backgrounds\\sand.jpg");
		blur = loadShader("C:\\Workspace\\Tango Teach\\processing-2.2.1\\processing\\opengl\\Blur1.glsl");

		stroke(255, 0, 0);
		rectMode(CENTER);
	}

	public void draw() {
		image(img, 0, 0);
		filter(blur);
		rect(mouseX, mouseY, 150, 150);
		ellipse(mouseX, mouseY, 100, 100);
	}
}