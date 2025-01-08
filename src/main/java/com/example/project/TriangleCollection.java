package com.example.project;
public class TriangleCollection {


  // array of Triangles
  private Triangle[] collection;
   // Constructor: initialize collection array with the number of
  // Triangle objects specified by numTriangles, with the first
  // Triangle in the collection having vertices at Points:
  // (-startx, 0), (0, startY), (startX, 0)
//
// Then, each subsequent Triangle object in the collection (up to
// numTriangles) should be created with same first and second vertices,
// (-startX, 0) and (0, startY), but with a different third vertex located
// at (startX - i, 0), where i is the index in the collections array where
// the Triangle object is located
//
// For example, creating a TriangleCollection with numTriangles = 6,
// startX = 4, and startY = 7 would yield a collections array containing
// 6 Triangles with the following vertices:
// Triangle 0: (-4, 0), (0, 7), (4, 0)
// Triangle 1: (-4, 0), (0, 7), (3, 0)
// Triangle 2: (-4, 0), (0, 7), (2, 0)
// Triangle 3: (-4, 0), (0, 7), (1, 0)
// Triangle 3: (-4, 0), (0, 7), (0, 0)
// Triangle 3: (-4, 0), (0, 7), (-1, 0)


// PRECONDITION: numTriangles >= 2


/*
 *  this.sequence = new int[seqLen];
     this.sequence[0] = 0;
     this.sequence[1] = 1;
     for (int i = 2; i < seqLen; i++) {
         this.sequence[i] = this.sequence[i - 1] + this.sequence[i - 2];
     }
 * /
 */
public TriangleCollection(int numTriangles, int startX, int startY)
{
  this.collection= new Triangle[numTriangles];
  
  for (int i = 0; i < numTriangles; i++)
  { Point p1 = new Point (-startX,0);
    Point p2 = new Point (0, startY);
    Point p3 = new Point(startX-i, 0);
    collection[i]= new Triangle(p1,p2,p3);
  }
}


// Calculate and return the sum of the perimeters of
// all Triangles in the collection
public double totalPerimeter() {
  double sum = 0;
  for (Triangle tri : collection)
  {
    sum+=tri.perimeter();
  }
  return sum;
}


// adds increment to both the x and y coordinates of each of the
// three Points in every Triangle in the collections array
// ADD GETTER AND SETTER METHODS TO OTHER CLASSES AS NECESSARY


public void shiftTriangles(int increment) {
  for (Triangle triangle : this.collection) {
    
    Point p1 = triangle.getp1();
    Point p2 = triangle.getp2();
    Point p3 = triangle.getp3();
    p1.setX(p1.getX() + increment);  
    p1.setY(p1.getY() + increment); 

    p2.setX(p2.getX() + increment); 
    p2.setY(p2.getY() + increment); 

    p3.setX(p3.getX() + increment);  
    p3.setY(p3.getY() + increment); 
  }
}




// returns a String that contains each Triangle in the
// collection on a new line; for example, the string
// representing a collection containing three
// Triangles should look like this when printed:
//
// "[(1, 5), (5, 12), (9, 5)]
//  [(1, 5), (5, 12), (8, 5)]
//  [(1, 5), (5, 12), (7, 5)]"
public String triangleCollectionInfo() {
  String str = "";
  for (int i = 0; i < collection.length; i++)
  {
    str += "[" + collection[i].getp1().pointInfo();
    str += ", ";
    str += collection[i].getp2().pointInfo();
    str += ", ";
    str += collection[i].getp3().pointInfo();
    str += "]\n";
  }
  return str;
}
}
