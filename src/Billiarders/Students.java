package Billiarders;

public class Students {
    int Id;
    String Fullname;

    public Students(int id, String fullname) {
        Id = id;
        Fullname = fullname;
    }
    public void printl(){
        System.out.println("Id-> "+Id + " Fullname "+Fullname+";");
    }
    public static void main(String[] args){
        Students stud = new Students( 1,"Abdurahmon Jabbaorov");
        Students stud1 = new Students( 2,"Ibrohim Ismoilov");
        Students stud2 = new Students( 3,"Fayoz Nabiyev");
        Students stud3 = new Students( 4,"Asliddin Jabbarov");
        stud.printl();
        stud1.printl();
        stud2.printl();
        stud3.printl();

    }
}
