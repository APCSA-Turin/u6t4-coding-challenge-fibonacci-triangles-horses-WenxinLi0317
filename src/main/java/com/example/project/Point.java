package com.example.project;
public class Point {
  private int x;
  private int y;
 
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void setX(int num)
  {
    x = num;
  }

  public int getX()
  {
    return x;
  }

  public int getY()
  {
    return y;
  }
  public void setY(int num)
  {
    y= num;
  }
 
  // Returns distance between this Point object and another Point object
  public double distanceTo(Point other) {
    return Math.pow(Math.pow(x-other.x,2)+Math.pow(y-other.y, 2),0.5);
  }
   // Returns a string in the format: (x, y)
  public String pointInfo() {
   String str = "(" + x + ", " + y + ")";
 return str;
  }
}
