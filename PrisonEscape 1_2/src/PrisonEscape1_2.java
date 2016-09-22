import java.util.Scanner;

/**
 * Program is a classic text based adventure game.
 * Version 1_0 : Use of booleans and a switch statement
 * Version 2_0 : Input handling
 * Version 3_0 : optimization
 * 
 */

/**
 * @author rowbottomn
 *
 */
public class PrisonEscape1_2 {



	/**
	 * 
	 */
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		//booleans
		boolean paperClipBent = false, doorUnlocked = false, paperClip = false, cellUnlocked = false, guardKnockedOut = false, guardClothesOn = false, idBadge = false;
		
		int location = 0; //0 cell, 1 hall, 2 stairs, 3 lose, 4 win
		String input;
		//while (location < 3)
		while (location < 3){
			//switch (location)
			switch (location){
				//print location text
				case 0: 
					System.out.println("In cell");
					if (paperClip == false){
						System.out.println("u can get a paper clip");
					}
					if (cellUnlocked == false){
						System.out.println("u can see a mirror");
					}
					else if (cellUnlocked == false && paperClip ==false){
						System.out.println("u can see an attractive person, oh wait that\'s a mirror");
					}
					else if (cellUnlocked == false && paperClipBent ==false){
						System.out.println("u might be able to use the mirror to open the lock outside the cell if you had the right tool");
					}
					else {
						System.out.println("Why are you still hanging around here? Escape already!");
					}
					break;
				case 1:	
					System.out.println("In hall");
					
					break;
				case 2:	
					System.out.println("In stairway");
					break;
			}
			//if elseif (booleans)

				//list commands
			//get input
			input = s.nextLine();
			switch (location){
			//print location text
			case 0: 
				//possible actions in cell: get clip, bent clip, drop clip, unlock door, look mirror, look guard, hit guard, hall
				if (input.contains("clip")){
					if (input.contains("get")){
						if (paperClip==false){
							System.out.println("u got a paper clip");
							paperClip = true;
						}
						else {
							System.out.println("u already got a paper clip");	
						}
					}
					else if (input.contains("bend")){
						if (paperClipBent==false){
							System.out.println("u bent the paper clip into a perfect shape for picking a lock");
							paperClip = true;
						}
						else {
							System.out.println("u already bent the paper clip, try looking for a way to see the look on the door!");
						}
					}
				}
				else if ((input.contains("unlock")) && (paperClipBent == true)){
					System.out.println("u use the mirrorand the bent paper clip to pick the cell lock");
					cellUnlocked = true;
				}
				
				if ((input.contains("mirror")) && paperClip ==false){
					System.out.println("u can see an attractive person");
				}
				if (cellUnlocked == false && paperClipBent ==false){
					System.out.println("u might be able to use the mirror to open the lock outside the cell if you had the right tool");
				}
				
				break;
			case 1:	
				System.out.println("In hall");
				
				break;
			case 2:	
				System.out.println("In stairway");
				break;
		}
			//if elseif (booleans)
				//change locations and booleans
			//else 
				//print "I can do that!"
			}
		//if location == 3
			//print "you got nabbed!"
		//else if location == 4
			//print "you won!"
		//else
			//"What went wrong?"
				
			
		
		
		
	}

}
