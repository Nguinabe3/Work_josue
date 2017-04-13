
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUINABE JOSUE
 */
public class Reservation {
    public static void main(String[] args){
boolean[][] occupee =
{{false,true,true,true,false,true,true,false,true,true,false},
{false,true,true,true,false,true,true,false,true,false,true},
{false,false,true,true,false,false,true,true,false,true,false},
{true,true,false,true,false,true,true,false,true,true,true},
{false,true,false,true,true,false,true,true,false,false,false}};
// question 1
Scanner clavier=new Scanner(System.in);
System.out.println("lundi");
for (int plage=0;plage<11;plage++){
if (occupee[0][plage]){
System.out.println(" reservée de " + (plage+8) + "H00 à ");
System.out.println((plage+9) + "H00");
}
}
System.out.println("mardi");
for (int plage=0;plage<11;plage++){
if (occupee[1][plage]){
System.out.println(" reservée de " + (plage+8) + "H00 à ");
System.out.println((plage+9) + "H00");
}
}
System.out.println("mercredi");
for (int plage=0;plage<11;plage++){
if (occupee[2][plage]){
System.out.println(" reservée de " + (plage+8) + "H00 à ");
System.out.println((plage+9) + "H00");
}
}
System.out.println("jeudi");
for (int plage=0;plage<11;plage++){
if (occupee[3][plage]){
    System.out.println(" reservée de " + (plage+8) + "H00 à ");
System.out.println((plage+9) + "H00");
}
}
System.out.println("vendredi");
for (int plage=0;plage<11;plage++){
if (occupee[4][plage]){
System.out.println(" reservée de " + (plage+8) + "H00 à ");
System.out.println((plage+9) + "H00");
}
}
// question 2
int nbocc = 0;
for (int jour=0; jour<5; jour++){
for (int plage=0;plage<11;plage++){
if (occupee[jour][plage]){
nbocc++;
}
}
}
System.out.println("Taux d’occupation: " +
(nbocc *100)/55);
// question 3
int jour;
String rep;
System.out.println("Entrez le jour de la réservation (lundi: 0,etc) ");
jour = clavier.nextInt();
int plage;
System.out.println("Entrez l’heure de début de la réservation ");
System.out.println(" (ex: 8 pour 8H00) ");
plage = clavier.nextInt() -8;
if (occupee[jour][plage]){
System.out.println("Desole, la salle n’est pas disponible");
}else{
occupee[jour][plage]=true;
System.out.println("reservation enregistree");
}
}
}
