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
			case "4":
			case "Barracks":
				Barracks();
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
			ASCII.OldTimeMapBazar();
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
		ASCII.LuckyGauntlet();
		Stuff.Wait(1000);
		Stuff.TypeLine("Engraved in it is three symbols. A rocket ship, the head of a goat, and a sword.");
		Stuff.TypeLine("\"You like what you're seeing? Even I don't know how it got here or what that turnip shaped thing is\"");
		Stuff.TypeLine("\" but I found it right outside my farm a couple o' years ago, no clue how long it's been there.\"");
		Stuff.TypeLine("\"Care to play a little roullette? I spin this wheel, it has 1 through 6, and if the arrow lands on, what say you, the number 5\"");
		Stuff.TypeLine("\"You get the \"Lucky Gauntlet\", sounds fair? Well it doesn't matter because I make the rules!\"");
		switch (Stuff.PlayerChoice("spin", "don't spin"))
		{
			case "spin":
				Stuff.RoulletteSpin = true;
				
				switch (Stuff.RandomInt(1, 6))
				{
					case 5:
						Stuff.TypeLine("\"Aren't you lucky! Well a deal is a deal. You best be on your way now, I hear you are chasing down the assassin.\"");
						Stuff.TypeLine("He wishes you good luck and you go on your way.");
						Stuff.HasLuckyGauntlet = true;
						Bazar();
						break;
					case 6:
						Stuff.TypeLine("\"Ohh so close my friend: you got a 6! But no cigar, still, take this.\"");
						Stuff.TypeLine("The shop keeper hands you an emerald sword which reflects the light off it making a fantastic light show under it");
						Stuff.TypeLine("\"Everyone is overjoyed that someone has taken the deed of locating this assasin. Our poor king must have been shook after the attack\"");
						Stuff.TypeLine("As you wish each other good bye, you still marvel at the sword in all its beautiful splendor.");
						Stuff.HasEmeraldSword = true;
						Bazar();
						break;
					case 4:
						Stuff.TypeLine("\"Ohh so close my friend: a 4! But no cigar, still, take this.\"");
						Stuff.TypeLine("The shop keeper hands you an emerald sword which reflects the light off it making a fantastic light show under it");
						Stuff.TypeLine("\"Everyone is overjoyed that someone has taken the deed of locating this assasin. Our poor king must have been shook after the attack\"");
						Stuff.TypeLine("As you wish each other good bye, you still marvel at the sword in all its beautiful splendor.");
						Stuff.HasEmeraldSword = true;
						Bazar();
						break;
					default:
						Stuff.TypeLine("\"Oh not your lucky day is it. Well move along now, nothing else you can do here, well besides taking this sword for your troubles.\"");
						Stuff.TypeLine("\"You are gonna need it on your quest for that assassin! Yes word spreads fast doesnt it.\"");
						Stuff.TypeLine("The sword is made of emeralds which gives it a magnificent green glow in the sun.");
						Stuff.TypeLine("As you marvel at the sword, you walk away to start your search of the assassin.");
						Stuff.HasEmeraldSword = true;
						Bazar();
						break;
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
		
		Stuff.TypeLine("After the pleasant surprise at the roullette shop, you decide to further your search in a different part of the kingdom.");
		Stuff.Wait(500);
		ASCII.OldTimeMapBazar();
		switch (Stuff.PlayerChoice("check out barracks", "visit the harbor", "search the castle"))
		{
			case "check out the barracks":
				Barracks();
				break;
			case "visit the harbor":
				break;
			case "search the castle":
				break;
		}
	}
	
	public static void Barracks()
	{
		Stuff.CurrentLocationNumber = 4;
		
		Stuff.TypeLine("After the walk from the bazar you sit in the shade of a tree and hear something...");
		Stuff.Wait(500);
		Stuff.TypeLine("Something loud... and close...");
		Stuff.Wait(500);
		Stuff.TypeLine("Oh my you are very hungry. You realize that the noise is coming from you. YOUR STOMACH.");
		Stuff.TypeLine("You remember you brought some snacks. Good thing you thought ahead!");
		Stuff.TypeLine("What are you going to eat out of your array of snacks?");
		switch (Stuff.PlayerChoice("chocolate candy bar", "chocolate candy bar", "chocolate candy bar"))
		{
			case "chocolate candy bar":
				Stuff.TypeLine("You realize that you only have one chocolate candy bar and that you said the same thing 3 times!");
				Stuff.TypeLine("You decide to eat it anyway because you are hungry.");
				break;
		}
		
		Stuff.TypeLine("You finaly make it to the barracks. There are knights sparring out side and others taking group baths in the near by lake.");
		Stuff.Wait(200);
		Stuff.TypeLine("Yuck.");
		Stuff.TypeLine("\"Hey yuo want to spar with us?\" One of the knights asked");
		switch (Stuff.PlayerChoice("spar", "don't spar"))
		{
			case "spar":
				break;
			case "don't spar":
				break;
		}
	}
}