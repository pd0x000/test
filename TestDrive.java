import java.util.Scanner;

public class TestDrive {
public static void main(String[] args){
    boolean flag = true;
    while (flag) {
        Avion a1 = new Avion();
        Scanner citire = new Scanner(System.in);
        System.out.println();
        System.out.println("Inserati modelul Avionului :");
        System.out.println("Ex: Boeing 747, AN-2, Airbus A300, MIG-21, F-16, SU-27, RQ-4, Helios");
        a1.Model = citire.nextLine();
        if (a1.Model.isEmpty()){
            break;
        }
        a1.verModel();
        a1.verSistemDePropulsie();
        System.out.println("Avionul de model " + a1.Model + " este cu destinatie " + a1.Destinatie + " cu sistemul de propulsie " + a1.SistemDePropulsie);
    }
}
}
