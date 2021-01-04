package Code;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {	
		
		// Das Spielfeld wird ausgegeben, (Als �bersicht)
		System.out.println("\n        Vier Gewinnt\n");		
		String feld [][]= {   	 // [][1]  [][2]    [][3]   [][4]   [][5]   [][6]  [][7] 
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
		boolean Spieler1 = false; 
		boolean Spieler2 = false; 
		//Gameloop
		Scanner in = new Scanner(System.in);		
		//Counter f�r 42 Felder 
		int count = 0;
		while(count <= 42) {		
			// Spieler 1 ist an der Reihe !
			if (count % 2 == 0) {				
				System.out.println("\nSpieler 1 ist an der Reihe \nBitte geben Sie eine Spalte an : ");
				//Wert von Spieler 1 wird eingelesen
				int a = in.nextInt();				
				//While schleife durchl�uft die Spalte "a" von unten nach oben, und schaut, wo der n�chste freie Platz ist !!													
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
				
				
				
				
				//Gewinnanalyse
				
				
					int win1 = 1; // vertikal
					int win2 = 1; // horizontal
				    
					if  (a < 7) {
						
					for (int rechts = 1; rechts <= 4; rechts++) {
						
					
						if (feld[Zeile1][a+rechts] == " x |" &&  (a+rechts) < 7 ) {
							win1++; 
							}
						
						else {
							break; 
						}
						}
					}
				
					
					for (int links = 1; links <= 4; links ++) {
						if (feld[Zeile1][a-links] == " x |" && (a-links) > 0) {
							win1++; 
							}
						
						else {
							break; 
						}
					}
					 
					
				
	                if (Zeile1 < 5 ) {
	                	
	                
					for (int oben = 1; oben <= 4; oben++) {
						if (feld[Zeile1+oben][a] == " x |" && (Zeile1+oben) < 6) {
							win2++; 
							}
					
						else {
							break; 
						}
					}}
					
					for (int unten = 1; unten <= 4; unten++) {
						if (feld[Zeile1-unten][a] == " x |" && (Zeile1-unten) >=  0) {
							win2++; 
							}
						else {
							break; 
						}
					}
					
					
	                
					//Kontrolle ob jemand gewonnen hat
					if (win1 == 4 || win2 == 3) {
						System.out.println ("Spieler1 hat gewonnen"); 
						Spieler1 = true; 
						break; 
					}
					else {
						continue; 
					}
			}
			
			
			
			
			
			// Das gleiche nochmal f�r Spieler 2																
			// Spieler 2 ist an der Reihe !	
			if (count % 2 != 0) { 
				System.out.println("\nSpieler 2 ist an der Reihe \nBitte geben Sie eine Spalte an : ");
				//Wert von Spieler 2 wird eingelesen
				int b = in.nextInt();
				//While schleife durchl�uft die Spalte "a" von unten nach oben, und schaut, wo der n�chste freie Platz ist !!
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
				
				
				
				//Gewinnanalyse Spieler 2
				
				
				
				int win1 = 1; // vertikal
				int win2 = 1; // horizontal
			    
				if (b < 7) {
					
				for (int rechts = 1; rechts <= 4; rechts++) {
					
				
					if (feld[Zeile2][b+rechts] == " o |" &&  (b+rechts) < 7 ) {
						win1++; 
						}
					
					else {
						break; 
					}
					}
				}
			
				
		
				
				
				for (int links = 1; links <= 4; links++) {
					if (feld[Zeile2][b-links] == " o |" && (b-links) > 0) {
						win1++; 
						}
					
					else {
						break; 
					}
				}
				 
				
			
                if (Zeile2 < 5 ) {
                	
                
				for (int oben = 1; oben <= 4; oben++) {
					if (feld[Zeile2+oben][b] == " o |" && (Zeile2+oben) < 6) {
						win2++; 
						}
				
					else {
						break; 
					}
				}}
				
				for (int unten = 1; unten <= 4; unten++) {
					if (feld[Zeile2-unten][b] == " o |" && (Zeile2-unten) >=  0) {
						win2++; 
						}
					else {
						break; 
					}
				} 
				
				
				
				//Kontrolle ob jemand gewonnen hat
				if (win1 == 4 || win2 == 3) {
					System.out.println ("Spieler2 hat gewonnen"); 
					Spieler2 = true; 
					break; 
				}
				else {
					continue; 
				}
			}
			
		}if (Spieler1 == false && Spieler2 ==  false) {
			System.out.println("Unentschieden, was k�nnt ihr eigentlich!");			
		}
	}		
}		
			
			
						
		