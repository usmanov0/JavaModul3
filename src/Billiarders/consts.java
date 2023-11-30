package Billiarders;

import java.util.Scanner;
public class consts {
    Scanner scan = new Scanner(System.in);
    String Fullname;
    String balance;
    int Id;


    public consts(String fullName, int id,String balance) {
        this.Fullname = fullName;
        this.balance = balance;
        this.Id = id;
    }
    public void print(){
        System.out.println("Id-> "+Id + "  Fullname-> "+Fullname+"; " +" Balance-> "+balance+";");
    }

    public static void main(String[] args){
        consts con = new consts("Usmonov Azizbek",1,"10000000$" );
        con.print();
    }
}
