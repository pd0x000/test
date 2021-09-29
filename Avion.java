import java.util.Arrays;

public class Avion {
    String Modele[] = {"Boeing 747", "AN-2", "Airbus A300", "MIG-21", "F-16", "SU-27", "RQ-4", "Helios" };
    String Model;
    String Destinatie;
    String SistemeDePropulsie[] = {"Reactie", "Elice"};
    String SistemDePropulsie;
    int mod;
    void verModel(){
        int i = Arrays.asList(Modele).indexOf(Model);
        mod = i;
        if (i <= 2){
               Destinatie = "Civila";
           }else if ((2 < i) && (i <= 5 )){
               Destinatie = "Militara";
           }else if ((5 < i) && (i <= 7)){
               Destinatie = "Speciala";
           }else {
               Destinatie = "Nu este gasit !";
           }
        }
    void verSistemDePropulsie(){
        if ((mod == 0) || (mod == 3) || (mod == 4)){
            SistemDePropulsie = SistemeDePropulsie[0];
        }else {
            SistemDePropulsie = SistemeDePropulsie[1];
        }
    }

}
