package processing.opengl;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PGraphics;
import processing.core.PImage;

public class NebulaExample extends PApplet {
	/**
	 * Nebula.
	 *
	 * From CoffeeBreakStudios.com (CBS) Ported from the webGL version in GLSL
	 * Sandbox: http://glsl.heroku.com/e#3265.2
	 */
	PShader nebula;

	public void setup() {
		size(640, 360, P2D);
		noStroke();
		nebula = loadShader("C:\\Workspace\\Tango Teach\\processing-2.2.1\\processing\\opengl\\Nebula.glsl");
		nebula.set("resolution", (width), (height));
	}

	public void draw() {
		nebula.set("time", millis() / 1);
		shader(nebula);
		// This kind of raymarching effects are entirely implemented in the
		// fragment shader, they only need a quad covering the entire view
		// area so every pixel is pushed through the shader.
		rect(0, 0, width, height);
	}
}