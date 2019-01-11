import java.util.Random;
import java.util.Scanner;

/***
 * 
 * @author Ben House-Kelly
 *
 */
public class monty_hall 
{

	public static void main(String[] args) 
	{
		int pans2;
		int win = 0, lose = 0;
		Random rand = new Random();
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter a number between 10 and 10,000:");
		int pans = Integer.parseInt(key.nextLine());
		while(pans>10000 || pans <10)
		{
			System.out.println("Enter a number between 10 and 10,000:");
			pans = Integer.parseInt(key.nextLine());
		}
		System.out.println("Should the player always change or stay:");
		String ans2 = key.nextLine();
		ans2 = ans2.toLowerCase();
			{
				if(ans2.equals("change"))
				{
					for(int i = 0; i < pans; i++)
					{
						int door = rand.nextInt(3);
						int player = rand.nextInt(3) + 1;
						if(door != player)
						{
							win++;
						}
						else
						{
							lose++;
						}
					}
				}
					else if(ans2.equals("stay"))
					{
						for(int i = 0; i < pans; i++)
						{
							int door = rand.nextInt(3);
							int player = rand.nextInt(3) + 1;
							if(door == player)
							{
								win++;
							}
							else
							{
								lose++;
							}
						}
				}
			}
			System.out.println("wins " + win);
			System.out.println("lose " + lose);
			double percent = (double)win/pans * 100;
			System.out.println("you won " + win + "/" + pans + " rounds " + percent + "%");
			}
			}
