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
			case "2":
			case "RoulletteShop":
				RoulletteShop();
				break;
			case "3":
			case "Bazar":
				Bazar();
				break;
			default:
				System.out.println("(Enter) Error 4: The starting area of the old time branch of the story, method GoToOldTimeBranch, was told to go to " + StartingPosition + ", which isn't a place!");
				Stuff.AwesomeScanner.nextLine();
		}
	}
	
	public static void OuterVillage1()
	{
		Stuff.CurrentLocationNumber = 1;
		
		if (Stuff.StoryBeginning == true)
		{
			Stuff.TypeLine("You travel back to the year 1253.");
			Stuff.TypeLine("It seems you are in the middle of a bazar. There are women and children begging for food,");
			Stuff.TypeLine("Others yelling out prices for food and goods (much lower than modern day you notice),");
			Stuff.TypeLine("And some old man who seems to be dead?");
			Stuff.Wait(3000);
			Stuff.TypeLine("Ooap, never mind he just coughed up a small bone, probably his lunch.");
			Stuff.TypeLine("While walking the lanes, you stumble upon a wanted poster of a criminal,");
			Stuff.TypeLine("One who had attempted to assassinate the king of this land. The prize, Porject Alpha.");
			Stuff.TypeLine("Dr. Heinz Doofenshmirtz mentioned that a couple times, not that you were paying attention.");
			Stuff.TypeLine("You take the poster off the wall and behind it is a map of the kingdom.");
			ASCII.OldTimeMap1();
			Stuff.HitEnter(1);
			Stuff.Wait(2000);
			Stuff.TypeLine("\"Where will you begin your search?\" you hear a passerby ask.");
			switch (Stuff.PlayerChoice("explore the bazar", "check out barracks", "visit the harbor", "search the castle"))
			{
				case "explore the bazar":
					Stuff.StoryBeginning = false;
					RoulletteShop();
					break;
				case "check out the barracks":
					Stuff.StoryBeginning = false;
					break;
				case "visit the harbor":
					Stuff.StoryBeginning = false;
					break;
				case "search the castle":
					Stuff.StoryBeginning = false;
					break;
			}
		}
		else
		{
			//Digo if you ever wanna add stuff to do when you go to this location and the story's already begun (when Stuff.StoryBeginning == false), this'd be where you do it
		}	
	}
	
	public static void RoulletteShop()
	{
		Stuff.CurrentLocationNumber = 2;
		
		Stuff.TypeLine("Whilst perusing the shops, some infinity gauntlet esque glove catches your eye.");
		Stuff.TypeLine("Engraved in it is three symbols. A rocket ship, the head of a goat, and a sword.");
		Stuff.TypeLine("\"You like what you're seeing? Even I don't know how it got here or what that turnip shaped thing is\"");
		Stuff.TypeLine("\" but I found it right outside my farm a couple o' years ago, no clue how long it's been there.\"");
		Stuff.TypeLine("\"Care to play a little roullette? I spin this wheel, and if the arrow lands on, what say you, the number 5\"");
		Stuff.TypeLine("\"You get the \"Lucky Gauntlet\", sounds fair? Well it doesn't matter because I make the rules!\"");
		switch (Stuff.PlayerChoice("spin", "don't spin"))
		{
			case "spin":
				Stuff.RoulletteSpin = true;
				
				if (Stuff.RandomInt(1, 6) != 5)
				{
					Stuff.TypeLine("\"Oh not your lucky day is it. Well move along now, nothing else you can do here, well besides taking this sword for your troubles.\"");
					Stuff.TypeLine("\"You are gonna need it on your quest for that assassin!\"");
					Stuff.TypeLine("The sword is made of emeralds which gives it a magnificent green glow in the sun.");
					Stuff.TypeLine("As you marvel at the sword, you walk away to start your search of the assassin.");
					Stuff.HasEmeraldSword = true;
					Bazar();
				}
				
				else
				{
					Stuff.TypeLine("\"Aren't you lucky! Well a deal is a deal. You best be on your way now, I hear you are chasing down the assassin.\"");
					Stuff.TypeLine("He wishes you good luck and you go on your way.");
					Stuff.HasLuckyGauntlet = true;
					Bazar();
				}
				break;
				
			case "don't spin":
				Stuff.TypeLine("\"Well then, here take this sword, it's made of emeralds and will help you on your journey.\"");
				Stuff.TypeLine("\"Most people around here know about it and boy are we thankful. Our king is a good one so I don't know why anyone would attempt to murder him.\"");
				Stuff.TypeLine("\"Good luck traveler.\" With these words you leave the shop and continue your search.");
				Stuff.HasEmeraldSword = true;
				Bazar();
				break;
		}
	}
	
	public static void Bazar()
	{
		Stuff.CurrentLocationNumber = 3;
		
		Stuff.TypeLine("");
	}
}