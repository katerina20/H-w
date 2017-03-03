public class Triangle extends Shape {

  private double a;
  private double b;
  private double c;
  
  public static boolean checkTriangleRule(double a, double b, double c){

   if ((Math.abs(a)<(Math.abs(b)+Math.abs(c))) && (Math.abs(b)<(Math.abs(a)+Math.abs(c))) && (Math.abs(c)<(Math.abs(a)+Math.abs(b)))) {
  return true;
  }

 else 
   return null;

public static Triangle createTriangle(double a, double b, double c)
if (checkTriangleRule(a,b,c)) {

 return new Triangle (Math.abs(a), Math.abs(b), Math.abs(c));
 }
  else 
 return null;
}


}

  public Triangle() {
   this.a=1;
   this.b=1;
   this.c=1;
}

  private Triangle(double a, double b, double c) {
   this.a=a;
   this.b=b;
   this.c=c;
}

  public double getA() {
   return this.a;
}

  public double getB() {
   return this.b;
}

  public double getC() {
   return this.c;
}

 public double getPerimeter() {
  return this.a + this.b + this.c:
}

public double getArea {
  double p = getPerimeter(1/2);
  return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
}

public boolean equals(Triangle t); {
  if ((this.a == t.a) && (this.b == t.b) && (this.c == t.c))
   return true;
  else if ((this.a == t.b) && (this.b == t.a) && (this.c == t.b))
   return true;
  else if ((this.a == t.b) && (this.b == t.c) && (this.c == t.a))
   return true;
  else if ((this.a == t.a) && (this.b == t.c) && (this.c == t.b))
   return true;
  else if ((this.a == t.c) && (this.b == t.b) && (this.c == t.a))
   return true;
  else if ((this.a == t.c) && (this.b == t.a) && (this.c == t.c))
   return true;
  else 
   return false;
 }

public String toString() {
  return "Triangle(" + this.a + ", " + this.b + ", " + this.c + ")";
}