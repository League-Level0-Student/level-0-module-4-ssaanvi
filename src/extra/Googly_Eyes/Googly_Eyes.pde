PImage face;

void setup(){
  size(699,656);
  face = loadImage("Stuart.png");
  face.resize(699,656);
    background(face);

}


void draw() {
fill(#FCFFFE);
  ellipse(400,151,188,188);
fill(#0D0909);
ellipse (mouseX,mouseY,77,77);

  if (mousePressed){
     println (mouseX+ " " + mouseY);
}
background(face);
}