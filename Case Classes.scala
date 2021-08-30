import math.{ sqrt, pow }

object Main extends App{
  var point_1 = Point(100,10)
  var point_2 = Point(50,40)

  println("Point 1: " + point_1)
  
  println("Point 2: " + point_2)
  
  print("Adding the 2 points: ")
  println(point_1 + point_2)
  
  println("Moving Point 1 by 10 units and 20 units in x and y directions respectively: "+ point_1.move(10,20))
  
  println("Distance between the points: "+ point_1.distance(point_2))
  
  println("Inverting Point 2: "+ point_2.invert)
}

case class Point(p:Int, q:Int){
  def x: Int = p;
  def y: Int = q;

  def + (that:Point)= Point(this.x + that.x , this.y+that.y)

  def move(dx:Int, dy:Int) = Point(this.x+dx , this.y+dy)

  def distance (that:Point) = sqrt(pow((that.x-this.x),2) + pow((that.y-this.y),2))

  def invert:Point = {
    Point(y,x)
  }
  
  override def toString = "("+x+","+y+")"
  
}