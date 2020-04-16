
void setup() {
 
  // set the size of your sketch
size(400,400);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for (int i=0;i<200;i+=33){
    if (i % 2 ==0){
    fill(#FF1A00);
    }
    else if (i % 2 ==1){
      fill(#000000);
    }
    ellipse(200,200,200-i,200-i);
  }
  
  
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
