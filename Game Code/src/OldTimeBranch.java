public class OldTimeBranch
{
	public static void GoToOldTimeBranch(String StartingPosition)
	{
		Stuff.CurrentBranchNumber = 4;
		switch (StartingPosition)
		{
			case "1":
			case "OuterVillage1":
				OuterVillage1();
				break;
			default:
				System.out.println("Error 6: The starting area of the old time branch of the story, method GoToOldTimeBranch, was told to go to " + StartingPosition + ", which isn't a place!");
		}
	}
	
	public static void OuterVillage1()
	{
		Stuff.CurrentLocationNumber = 1;
		
		if (Stuff.StoryBeginning == true)
		{
			Stuff.TypeLine("You travel back to the year 1253.");
			Stuff.TypeLine("It seems you are in the middle of a Bazar. There are women and children begging for food,");
			Stuff.TypeLine("Others yelling out prices for food and goods (much lower than modern day you notice),");
			Stuff.TypeLine("And some old man who seems to be dead?");
			Stuff.Wait(3000);
			Stuff.TypeLine("Ooap, never mind he just coughed up a small bone, probably his lunch.");
			Stuff.TypeLine("While walking the lanes, you stumble appon a wanted poster of a criminal,");
			Stuff.TypeLine("One who had attempted to assasinate the king of this land. The prize, porject alpha.");
			Stuff.TypeLine("Dr. Heinz Doofenshmirtz mentioned that a couple times, not that you were paying attention.");
			Stuff.TypeLine("You take the poster off the wall and behind it is a map of the kingdom.");
			ASCII.Map1();
			Stuff.TypeLine("\"Where will you begin your search?\" an passer by asked.");
			switch (Stuff.PlayerChoice("eating the banana", "Sunday church with Grandma", "going on the Klondike"))
			{
				case "eating the banana":
					Stuff.StoryBeginning = false;
					break;
				case "Sunday church with Grandma":
					Stuff.StoryBeginning = false;
					break;
				case "going on the klondike":
					Stuff.StoryBeginning = false;
					break;
			}
		}
		else
		{
			//Digo if you ever wanna add stuff to do when you go to this location and the story's already begun (when Stuff.StoryBeginning == false), this'd be where you do it
		}
	}
}