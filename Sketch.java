import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(211,211,211);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	smooth();
	noStroke();
	//ground
	fill(99,102,106);
	rect(0, 500, 600, 100);
	
	//window w space
	fill(0);
	rect(100, 100, 400, 200);
	//stars
	fill(255);
	ellipse(120, 120, 5, 5);
	ellipse(137, 132, 3, 3);
	ellipse(150, 130, 4, 4);
	ellipse(190, 120, 2, 2);
	ellipse(240, 150, 4, 4);
	ellipse(350, 270, 5, 5);
	ellipse(320, 150, 5, 5);
	ellipse(420, 169, 3, 3);
	ellipse(150, 170, 5, 5);
	ellipse(187, 162, 3, 3);
	ellipse(350, 230, 4, 4);
	ellipse(290, 170, 2, 2);
	ellipse(430, 200, 4, 4);
	ellipse(450, 270, 5, 5);
	ellipse(420, 150, 5, 5);
	ellipse(420, 320, 3, 3);
	
	//vent
	fill(148,147,147);
	rect(20, 525, 150, 100);
	//vent lines
	strokeWeight(3);
	stroke(75,75,75);
	line(30, 540, 30, 590);
	line(40, 540, 40, 590);
	line(50, 540, 50, 590);
	line(60, 540, 60, 590);
	line(70, 540, 70, 590);
	line(80, 540, 80, 590);
	line(90, 540, 90, 590);
	line(100, 540, 100, 590);
	line(110, 540, 110, 590);
	line(120, 540, 120, 590);
	line(130, 540, 130, 590);
	line(140, 540, 140, 590);
	line(150, 540, 150, 590);
	line(160, 540, 160, 590);
	
		
	//among us #1
	noStroke();
	fill(199,16,18);
	//body
	rect(75, 200, 200, 300);
	//round head
	ellipse(175, 200, 200, 100);
	//legs
	ellipse(114, 500, 75, 100);
	ellipse(236, 500, 75, 100);
	//backpack
	rect(25, 250, 100, 200);
	//mask
	stroke(0);
	strokeWeight(5);
	fill(149,202,220);
	ellipse(250, 275, 150, 100);
	
	//among us #2
	noStroke();
	//body
	fill(0, 0, 255);
	rect(339, 350, 200, 150);
	//legs
	ellipse(378, 500, 75, 100);
	ellipse(500, 500, 75, 100);
	//backpack
	rect(525, 250, 50, 200);
	//bone
	fill(255);
	rect(415, 250, 50, 100);
	ellipse(425,250,50,50);
	ellipse(455,250,50,50);
	
	

	
  }
  
  // define other methods down here.
}