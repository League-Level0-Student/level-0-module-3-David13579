
void setup() {
 
  // set the size of your sketch
size(400,400);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for (int i=0;i<200;i++){
    ellipse(200,200,200-i,200-i);
    if (i % 40 ==0){
    fill(#FF0000);
    }
    else if (i % 20 ==0){
      fill(#000000);
    }
    
  }
  
  
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
