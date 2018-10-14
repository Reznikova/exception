package triangle.lenght;

import triangle.exception.NotTriangle;

public class Triangle{
private int a, b, c;
private double p, s;
public Triangle (int a, int b, int c) {
    this.a=a;
    this.b=b;
    this.c=c;
}
public void PrintTriangle () throws NotTriangle {
    if ((a+b)>c&(a+c)>b&(c+b)>a) {
        System.out.println("Сторона a "+a+ " Сторона b "+b+  " Cторона c" + c);}
        else throw new NotTriangle();
    }
public void Perimetr ()  {
    {p = (a + b + c) / 2;
        System.out.println(p);
    }
}
public void Square () {
    s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    System.out.println(s);
}

}
