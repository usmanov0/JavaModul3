package AutoSale;

import java.util.Scanner;

public class Application {

    static AutoSalon[] autosalons = new AutoSalon[3];
    static AutoSalon autoSalon;
    public static void main(String[] args){
        autosalons[0]=new AutoSalon("Orient Motors","Yashnobod",120_000_000);
        int command = -1;
        Scanner scanner = new Scanner(System.in);
        while(command!=0){
            System.out.println("1-> Choose Autosalon; 0-> Exit");
            command  = scanner.nextInt();
            if(command-1<0) break;
            autoSalon = autosalons[command-1];
            autoSalon.info();
            while(command!=0){
                System.out.println("1-> Add Auto; 2-> View auto; 3-> Shell auto; 0-> Exit");
                command=scanner.nextInt();
                switch(command){
                    case 1:
                        autoSalon.addAuto(scanner);
                    case 2:
                        autoSalon.viewAuto();
                }
            }
            command=-1;
        }
    }
    public static void viewAuto(){
        for(int i = 0; i < autosalons.length; i++){
            if(autosalons[i]!=null){
                System.out.println((i+1)+") "+autosalons[i].name);
            }
        }
    }
}
