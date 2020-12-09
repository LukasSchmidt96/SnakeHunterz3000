

package Game;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {	
		
		// Das Spielfeld wird ausgegeben, (Als Übersicht)
		System.out.println("\n        Vier Gewinnt\n");		
		String feld [][]= {   	 // [][1]  [][2]    [][2]   [][4]   [][5]   [][6]  [][7] 
							{ "|" ," 1 |", " 2 |", " 3 |", " 4 |", " 5 |", " 6 |", " 7 |"},  
							{ "|" ,"   |", "   |", "   |", "   |", "   |", "   |", "   |"},  //[1][]	
							{ "|" ,"   |", "   |", "   |", "   |", "   |", "   |", "   |"},  //[2][]
							{ "|" ,"   |", "   |", "   |", "   |", "   |", "   |", "   |"},  //[3][]
							{ "|" ,"   |", "   |", "   |", "   |", "   |", "   |", "   |"},  //[4][]
							{ "|" ,"   |", "   |", "   |", "   |", "   |", "   |", "   |"},  //[5][]
							{ "|" ,"   |", "   |", "   |", "   |", "   |", "   |", "   |"}   //[6][]
				
        };		
		for(int i = 0; i < feld.length; i++) {
			for(int j = 0; j < feld[i].length; j++) {
			System.out.print(feld[i][j]);
		}System.out.println();
		}					

		//Gameloop
						Scanner in = new Scanner(System.in);		
						//Counter für 42 Felder 
						int count = 0;
						while(count <= 42) {		
							// Spieler 1 ist an der Reihe !
							if (count % 2 == 0) {				
								System.out.println("\nSpieler 1 ist an der Reihe \nBitte geben Sie eine Spalte an : ");
								//Wert von Spieler 1 wird eingelesen
								int a = in.nextInt();				
								//While schleife durchläuft die Spalte "a" von unten nach oben, und schaut, wo der nächste freie Platz ist !!													
								int Zeile1 = 6;
								while(Zeile1 > 0) {
									if(feld[Zeile1][a] == "   |") {
									   feld[Zeile1][a]=" x |";
									   //Wenn gefunden, break--> While schleife wird verlassen!!!
										break;
									}Zeile1 = Zeile1-1; 
									//Wenn nicht, suche weiter, bis du as gefunden hast !!
									if(feld[Zeile1][a] == " x |"||feld[Zeile1][a] == " o |") {																	
										Zeile1 = Zeile1 -1;																		
									}
									//und jetzt druck den ganzen bums aus!
								}for(int i = 0; i < feld.length; i++) {
									for(int j = 0; j < feld[i].length; j++) {
										System.out.print(feld[i][j]);
									}System.out.println();		
								}count += 1;
							}
							// Das gleiche nochmal für Spieler 2																
							// Spieler 2 ist an der Reihe !	
							if (count % 2 != 0) { 
								System.out.println("\nSpieler 2 ist an der Reihe \nBitte geben Sie eine Spalte an : ");
								//Wert von Spieler 2 wird eingelesen
								int b = in.nextInt();
								//While schleife durchläuft die Spalte "a" von unten nach oben, und schaut, wo der nächste freie Platz ist !!
								int Zeile2 = 6;
								while(Zeile2 > 0) {
									if(feld[Zeile2][b] == "   |") {
									   feld[Zeile2][b]=" o |";
									   //Wenn gefunden, break--> While schleife wird verlassen!!!
									   break;
									}Zeile2 = Zeile2-1;
									//Wenn nicht, suche weiter, bis du was gefunden hast !!
									if(feld[Zeile2][b] == " x |"||feld[Zeile2][b] == " o |") {														
										Zeile2 = Zeile2 -1;												
									}
									//und jetzt druck den ganzen bums wieder aus!
								}for(int i = 0; i < feld.length; i++) {
									for(int j = 0; j < feld[i].length; j++) {
										System.out.print(feld[i][j]);
									}System.out.println();		
								}count += 1;
							}
						}System.out.println("Unentschieden, was könnt ihr eigentlich!");			
					}	
		}		
					
					
								
				
				
				
				
				

			
			
			

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		/*	public class 
			
				
				String [][] Koordinaten = new String[6];
			

				
				for(int i = 0; i < Koordinaten.length; i++) {
					for(int j = 0; j < Koordinaten[i].length; j++) {
						
					}
				
				}*/

			

			


