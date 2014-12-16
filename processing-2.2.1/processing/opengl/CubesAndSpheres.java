package processing.opengl;

import processing.core.PApplet;

public class CubesAndSpheres extends PApplet {
	PShader myShader;
	
	public void setup() {
	  size(640, 360, P2D);
	  noStroke();
	 
	  myShader = loadShader("C:\\testProjects\\Processing-Experiments-master\\2013\\Shaders\\Shadertoy\\CubesAndSpheres\\data\\shader.glsl");
	  myShader.set("resolution", (width), (height));   
	}
	
	public void draw() {
	  background(0);
	  myShader.set("time", millis() / 100);
	
	  shader(myShader);
	  // This kind of effects are entirely implemented in the
	  // fragment shader, they only need a quad covering the  
	  // entire view area so every pixel is pushed through the 
	  // shader.   
	  rect(0, 0, width, height);  
	}
	
	
}

