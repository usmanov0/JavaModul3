package SOLIDPRINCIPLES.DependencyInversionPrinciple;

public class Moto {
    String Motoname;
    String motoyear;
    String Motomodel;

    public Moto(String motoname, String motomodel, Shahargi motoyear) {
        Motoname = motoname;
        Motomodel = motomodel;
        motoyear = motoyear;
    }

    public String getMotoname() {
        return Motoname;
    }

    public void setMotoname(String motoname) {
        this.Motoname = motoname;
    }

    public String getMotomodel() {
        return Motomodel;
    }

    public void setMotomodel(String motomodel) {
        this.Motomodel = motomodel;
    }

    public String getMotoyear() {
        return motoyear;
    }

    public void setMotoyear(String motoyear) {
        this.motoyear = motoyear;
    }
}
