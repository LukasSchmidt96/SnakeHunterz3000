

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
		
		}		
					
					
								
				
				
				
				
				

			
			
			

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		/*	public class 
			
				
				String [][] Koordinaten = new String[6];
			

				
				for(int i = 0; i < Koordinaten.length; i++) {
					for(int j = 0; j < Koordinaten[i].length; j++) {
						
					}
				
				}*/

			

			


