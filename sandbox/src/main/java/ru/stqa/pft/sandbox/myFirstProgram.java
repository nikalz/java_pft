package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("ymnik");
//        double i = 5;
//        double k = i *i;
//        System.out.println(k + i);
        Square s = new Square(5);

        System.out.println("Ploshad kvadrata= " + s.area());
        
        Rectangle r = new Rectangle(6,2);

        System.out.println("Ploshad pryamoyg= " + r.area());
    }

    public static void hello (String who) {

        System.out.println("Hi " + who);

    }


}
