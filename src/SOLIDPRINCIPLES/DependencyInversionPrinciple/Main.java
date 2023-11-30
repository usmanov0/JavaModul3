package SOLIDPRINCIPLES.DependencyInversionPrinciple;

public class Main {
    public static void main(String[] args) {
        Shahargi shahargi = new Shahargi();
        Moto moto = new Moto("Yamaha","Yo'l tanlamas",shahargi);
        YolTanlamas yolTanlamas = new YolTanlamas();
        moto.setMotomodel(yolTanlamas.toString());
        ToqGi toqGi = new ToqGi();
        moto.setMotomodel(toqGi.toString());
        System.out.println();
    }
}
