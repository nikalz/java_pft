package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("ymnik");
//        double i = 5;
//        double k = i *i;
//        System.out.println(k + i);
        double i = 5;
        System.out.println("Ploshad kvadrata= " + area(i));
        double b = 6;
        System.out.println("Ploshad pryamoyg= " + area(i,b));
    }

    public static void hello (String who) {

        System.out.println("Hi " + who);

    }
    public static double area (double l){
        return l * l;
    }
    public static double area (double l, double h){
        return l * h;
    }
}
