package com.example.project;
public class Triangle {
  // array of Point objects
  private Point[] vertices;
 
  // Constructor: initializes the vertices array
  // to contain the three Point objects
  public Triangle(Point p1, Point p2, Point p3) {
    vertices = new Point[3];
      vertices[0] = p1;
      vertices[1] = p2;
      vertices[2] = p3;
  }
 
  // Returns the perimeter of the Triangle
  // HINT: use the distanceTo method that you wrote in the Point class
  public double perimeter() {
       double perimeter = 0;
       perimeter += vertices[0].distanceTo(vertices[1]);
       perimeter += vertices[1].distanceTo(vertices[2]);;
       perimeter += vertices[2].distanceTo(vertices[0]);
       return perimeter;
}

public Point[] getVertices()
{
  return vertices;
}

public Point getp1()
{
  return vertices[0];
}

public Point getp2()
{
  return vertices[1];
}

public Point getp3()
{
  return vertices[2];
}



// Returns a String with the three vertices that make up the Triangle;
// if the vertices are the points (6, 10), (11, 15), and (18, 7),
// this method should return: "[(6, 10), (11, 15), (18, 7)]"
public String triangleInfo() {
  String str = "[";
 
  // iterate through all elements, EXCEPT the last one (which we will
  // append after the loop); so terminate loop when i < numList - 1
  for (int i = 0; i < vertices.length - 1; i++) {
    str += vertices[i].pointInfo();
    str += ", ";
  }
  int lastIndex = vertices.length - 1;
  str += vertices[lastIndex].pointInfo();
  str += "]";
 
  return str;
}
}
