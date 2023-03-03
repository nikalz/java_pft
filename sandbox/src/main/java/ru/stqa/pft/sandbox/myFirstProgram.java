package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("ymnik");
//        double i = 5;
//        double k = i *i;
//        System.out.println(k + i);
        Square s = new Square(5);

        System.out.println("Ploshad kvadrata= " + area(s));
        
        Rectangle r = new Rectangle(6,2);

        System.out.println("Ploshad pryamoyg= " + area(r));
    }

    public static void hello (String who) {

        System.out.println("Hi " + who);

    }
    public static double area (Square s){
        return s.l * s.l;
    }
    public static double area (Rectangle r){
        return r.a * r.b;
    }
}
