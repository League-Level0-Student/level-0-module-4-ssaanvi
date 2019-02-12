void setup(){
  size(699,656);

PImage face = loadImage("Stuart.png");
    face.resize(699,656);
    background(face);

}


void draw() {
ellipse(400,151,188,188);
  if (mousePressed){
     println (mouseX+ " " + mouseY);
}
}