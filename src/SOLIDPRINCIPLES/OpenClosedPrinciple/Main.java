package SOLIDPRINCIPLES.OpenClosedPrinciple;

public class Main {
    public static void main(String[] args) {
        RailWayService taxiService = new PoytaxtdanViloyatga();
        RailWayService taxiService1 = new ViloyatdanPoytaxtga();
        System.out.println(taxiService);
        System.out.println(taxiService1);
    }
}
