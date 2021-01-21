package Game;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Spielanleitung(); 
		String feld [][]= display();
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
				// überprüfe ob auch nur Zahl von 1 bis 7 eingegeben wurde 
				if(a <= 7 && a >=1) {
					//While schleife durchläuft die Spalte "a" von unten nach oben, und schaut, wo der nächste freie Platz ist !!
					int Zeile1 = 6;
					while(Zeile1 > 0) {
				    	if(feld[Zeile1][a] == "   |") {
							feld[Zeile1][a]=" x |";
							//Wenn gefunden, break--> While schleife wird verlassen!!!
							break;
						}Zeile1 = Zeile1-1; 
						//Wenn nicht, suche weiter, bis du was gefunden hast !!
                    	if(feld[Zeile1][a] == " x |"||feld[Zeile1][a] == " o |") {
                    		Zeile1 = Zeile1 -1;														
						}
						if(Zeile1 == 0) {
							System.out.println("Bitte wähle eine andere Spalte!\n");
							count = count - 1;
						}
					}
					//und jetzt druck alles aus!
                	for(int i = 0; i < feld.length; i++) {
                		for(int j = 0; j < feld[i].length; j++) {
							System.out.print(feld[i][j]);
                        }
                        System.out.println();		
                    }
                    count += 1;
				}else { 
					System.out.println("Ungültige Eingabe\n");
					System.out.println("Bitte nur Zahlen von 1 bis 7 eingeben... nur so viele Spalten gibt es!");
				}	
			}
							
			// Kontrolle ob gewonnen !
			int zeilensumme = 0;
			int stopp = 0;
			for (int i = 0; i < feld.length; i++) {								
				for(int j = 0; j < feld[i].length; j++) {
					if(feld[i][j].equals(" x |")) {
						zeilensumme += 1;
						if(zeilensumme == 4) {
							System.out.println("Spieler 1 hat gewonnen!");
							stopp = 1;									
						}
					}
					if(feld[i][j].equals("   |")||feld[i][j].equals(" o |")) {
						zeilensumme = 0;					
					}		
				}								
				zeilensumme = 0;
			}
			if (stopp == 1) {
				break;
			}
			stopp= 0;			
			int spaltenanzahl = feld[0].length;
			int spaltensumme = 0;
			for (int j = 0; j <  spaltenanzahl; j++) {
				for (int i = 0; i < feld.length; i++) {
					if(feld[i][j].equals(" x |")) {
					    spaltensumme += 1;
						if(spaltensumme >= 4) {
							System.out.println("Spieler 1 hat gewonnen!");
							stopp = 1;									  
						}
					}
					if(feld[i][j].equals("   |")||feld[i][j].equals(" o |")) {
						spaltensumme = 0;	
						break; 
					}	
				}
			    spaltensumme = 0;
			}
			if (stopp == 1) {
				break;
			}
			stopp= 0;
			//Diagonale Auswertung rechts-oben --> links-unten
			int diagonalsumme1 = 0; 
			for (int i = 0; i <=  6; i++) {
				for (int j = 7; j >= 0; j--) {
					diagonalsumme1 = 0; 
						if (j-3 >= 0 && i+3 < feld.length) {
						   for (int k = 0; k <= 3; k++) {
							   if (feld[i+k][j-k].equals(" x |")){
								  diagonalsumme1++; 
						       }else if(feld[i+k][j-k].equals("   |")||feld[i+k][j-k].equals(" o |")) {
									diagonalsumme1 = 0;	
									break; 
							   }	
						    }if (diagonalsumme1 == 4) {
								stopp = 1; 
								System.out.println("Spieler 1 hat gewonnen!"); 
								break; 
							}
						}
				}
			}
			if (stopp == 1) {
			   break;
			}
			stopp= 0;
			//Diagonale Auswertung links-oben --> rechts-unten
			int diagonalsumme2 = 0; 
			for (int i = 0; i <=  6; i++) {
				for (int j = 0; j <= 7; j++) {
					diagonalsumme2 = 0; 
					if (j+3 <= 7 && i+3 < feld.length) {
					   for (int k = 0; k <= 3; k++) {
					       if (feld[i+k][j+k].equals(" x |")){
							  diagonalsumme2++; 
					       }else if(feld[i+k][j+k].equals("   |")||feld[i+k][j+k].equals(" o |")) {
								   diagonalsumme2 = 0;	
								   break; 
						   }	
					   }if (diagonalsumme2 == 4) {
						   stopp = 1; 
						   System.out.println("Spieler 1 hat gewonnen!"); 
						   break; 
					   }
					}
				}
			}
			if (stopp == 1) {
			   break;
			}
			stopp= 0;															
			// Spieler 2 ist an der Reihe !	
			if (count % 2 != 0) { 
			   System.out.println("\nSpieler 2 ist an der Reihe \nBitte geben Sie eine Spalte an : ");
			   //Wert von Spieler 2 wird eingelesen
			   int b = in.nextInt();
			   if (b <= 7 && b >= 1) { 
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
					   if(Zeile2 == 0) {
						   System.out.println("Bitte wähle eine andere Spalte!\n");
						   count = count - 1;
					   }
				   }
				   //und jetzt druck den ganzen bums wieder aus!
				   for(int i = 0; i < feld.length; i++) {
					  for(int j = 0; j < feld[i].length; j++) {
						 System.out.print(feld[i][j]);
					  }System.out.println();		
				   }count += 1;
			   }else {
				   System.out.println("Ungültige Eingabe\n");
				   System.out.println("Bitte nur Zahlen von 1 bis 7 eingeben... nur so viele Spalten gibt es!");
				}
			}
			// Kontrolle ob gewonnen !
			int zeilensumme1 = 0;
			int stopp1 = 0;
			for (int i = 0; i < feld.length; i++) {								
				for(int j = 0; j < feld[i].length; j++) {
				   if(feld[i][j].equals(" o |")) {
					 zeilensumme1 += 1;
					 if(zeilensumme1 == 4) {
						System.out.println("Spieler 2 hat gewonnen!");
						stopp1 = 1;									
					 }
				   }
				   if(feld[i][j].equals("   |")||feld[i][j].equals(" x |")) {
					 zeilensumme1 = 0;					
				   }
				}
				zeilensumme1 = 0;
			}
			if (stopp1 == 1) {
				break;
			}
			stopp1= 0;
			int spaltenanzahl1 = feld[0].length;
			int spaltensumme1 = 0;
		    for (int j = 0; j <  spaltenanzahl1; j++) {
				for (int i = 0; i < feld.length; i++) {
					if(feld[i][j].equals(" o |")) {
					  spaltensumme1 += 1;
					  if(spaltensumme1 == 4) {
						System.out.println("Spieler 2 hat gewonnen!");
						stopp1 = 1;									  
					  }
					}
					if(feld[i][j].equals("   |")||feld[i][j].equals(" x |")) {
					  spaltensumme1 = 0;					
					}
				}
				spaltensumme1 = 0;
			}
			if (stopp1 == 1) {
			   break;
			}
			stopp1= 0;
			//Diagonale Auswertung rechts-oben --> links-unten
			int diagonalsumme3 = 0; 
			for (int i = 0; i <=  6; i++) {
				for (int j = 7; j >= 0; j--) {
					diagonalsumme3 = 0; 
					if (j-3 >= 0 && i+3 < feld.length) {
					   for (int k = 0; k <= 3; k++) {
						   if (feld[i+k][j-k].equals(" o |")){
							  diagonalsumme3++; 
						   }
						   else if(feld[i+k][j-k].equals("   |")||feld[i+k][j-k].equals(" x |")) {
								diagonalsumme3 = 0;	
								break; 
						   }	
					   }
					   if (diagonalsumme3 == 4) {
					      stopp = 1; 
					      System.out.println("Spieler 2 hat gewonnen!"); 
					      break; 
					   }
					}
				}
			}
			if (stopp == 1) {
			   break;
			}
			stopp= 0;
			//Diagonale Auswertung links-oben --> rechts-unten			
		    int diagonalsumme4 = 0; 
			for (int i = 0; i <=  6; i++) {
				for (int j = 0; j <= 7; j++) {
					diagonalsumme4 = 0; 
					if (j+3 <= 7 && i+3 < feld.length) {
						for (int k = 0; k <= 3; k++) {
							if (feld[i+k][j+k].equals(" o |")){
								diagonalsumme4++; 
							}
							else if(feld[i+k][j+k].equals("   |")||feld[i+k][j+k].equals(" x |")) {
								   diagonalsumme4 = 0;	
								   break; 
							}	
						}
						if (diagonalsumme4 == 4) {
				    	   stopp = 1; 
				    	   System.out.println("Spieler 2 hat gewonnen!"); 
				    	   break; 
						}
					}
				}
			}
			if (stopp == 1) {
				break;
			}
			stopp= 0;
			if(count >= 42) System.out.println("Unentschieden");								
			}	
	}	
	public static String [][] display (){
		// Das Spielfeld wird ausgegeben, (Als Übersicht)
		System.out.println("\n         Vier Gewinnt\n");		
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
			}System.out.println(  );
		}	
		return feld;
	}
	public static void Spielanleitung () {
		Scanner in = new Scanner(System.in);
		System.out.println("Vier Gewinnt von SnakeHunterz3000 \n"
				           +    "Wenn du möchtest erklären wir dir noch kurz die Spielregeln"); 
		System.out.println("1: Ich brauche eine Spielanleitung \n2: Ich kenne das Spiel bereits und möchte nun loslegen"); 
		int b = in.nextInt(); 
		if (b == 1) {
			System.out.println ("Schaffe es vor deinem Gegner vier Spielsteine\n"
					          + "deiner Farbe in eine waagerechte, senkrechte\n"
					          + "oder diagonale Reihe zu bringen! Dabei werden\n"
					          + "abwechselnd von oben neue Spielchips eingeworfen,\n"
					          + "wobei es nicht nur gilt auf den eigenen Erfolg zu achten,\n"
					          + "sondern auch darauf, dass es eurem Gegenspieler nicht\n"
					          + "gelingt die Reihe zu vollenden.\n"
					          + "Los gehts!");
		}		
   }
}	

