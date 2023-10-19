package codigoDeOtros4;

import java.util.Scanner; //Se importa el Scanner

public class Codigo4 {
	public static void main(String[] args) { //Se agrega clase main


    Scanner scanner = new Scanner(System.in); //Se cambio s por scanner y se ingresa System.in
    
    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    
    String jugador1 = scanner.nextLine(); // j1 por jugador1
    
    System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    Scanner scanner2 = new Scanner(System.in);//Se cambio s2 por scanner2 y se ingresa System.in
    String jugador2 = scanner.nextLine(); // j1 por jugador1
    
    if (jugador1.equals(jugador2)) { //Se eliminó un parentesis
      System.out.println("Empate");
    } else {
    	//Se reemplaza g por gana
    	int gana = 1;
      switch(jugador1) {
        case "piedra":
          if (jugador2.equals("tijeras")) {
            gana = 1;
          }

        case "papel":
          if (jugador2.equals("piedra")) {
            gana = 1;
          }
        case "tijera":
          if (jugador2.equals("papel")) {
            gana = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + gana);
    }
  
  scanner.close();
  scanner2.close(); //Se cierran los scanners
}
}
