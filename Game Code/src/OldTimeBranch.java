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
			case "5":
			case "ChoiceRoom":
				ChoiceRoom();
				break;
			case "6":
			case "Ruins":
				Ruins();
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
			switch (Stuff.PlayerChoice("explore the bazar", "check out barracks", "search the castle"))
			{
				case "explore the bazar":
					Stuff.StoryBeginning = false;
					RoulletteShop();
					break;
				case "check out the barracks":
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
		Stuff.TypeLine("\"Care to play a little roullette? I spin this wheel, it has 1 through 6, and if the arrow lands on, what say you, the number 5,\"");
		Stuff.TypeLine("\" you get the \"Lucky Gauntlet\", sounds fair? Well it doesn't matter because I make the rules!\"");
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
						Stuff.TypeLine("The shop keeper hands you an emerald sword which reflects the light off it making a fantastic light show under it.");
						Stuff.TypeLine("\"Everyone is overjoyed that someone has taken the deed of locating this assassin. Our poor king must have been shook after the attack!\"");
						Stuff.TypeLine("As you wish each other good bye, you still marvel at the sword in all its beautiful splendor.");
						Stuff.HasEmeraldSword = true;
						Bazar();
						break;
					case 4:
						Stuff.TypeLine("\"Ohh so close my friend: a 4! But no cigar, still, take this.\"");
						Stuff.TypeLine("The shop keeper hands you an emerald sword which reflects the light off it making a fantastic light show under it.");
						Stuff.TypeLine("\"Everyone is overjoyed that someone has taken the deed of locating this assassin. Our poor king must have been shook after the attack!\"");
						Stuff.TypeLine("As you wish each other goodbye, you still marvel at the sword in all its beautiful splendor.");
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
		
		Stuff.TypeLine("You finally make it to the barracks. There are knights sparring outside and others taking group baths in the nearby lake.");
		Stuff.Wait(200);
		Stuff.TypeLine("Yuck.");
		Stuff.TypeLine("\"Hey you want to spar with us?\" One of the knights asked.");
		switch (Stuff.PlayerChoice("spar", "don't spar"))
		{
			case "spar":
				if (Stuff.HasEmeraldSword = true)
				{
					Stuff.TypeLine("Some knight named Harold walked out of the crowd and all the others made a big ring around the two of you.");
					Stuff.MetHarold = true;
					Stuff.TypeLine("There was no commentary, only silence and the clashing of swords.");
					Stuff.Wait(200);
					Stuff.TypeLine("and the occasional grunt.");
					Stuff.TypeLine("The battle went on for so long that even some of the other soldiers left.");
					Stuff.TypeLine("Even Harold seemed to be getting tired but looks can be deceiving.");
					Stuff.TypeLine("With one final slash, your sword was knocked out of your hand, implanting itself a couple feet from you.");
					Stuff.TypeLine("\"Wow you gave me a good fight!\" Harold stated stretching out a hand. You grab it and he pulls you up.");
					Stuff.TypeLine("He also gets your sword for you. What a nice guy.");
					Stuff.TypeLine("As you are being escorted into the barracks,");
					Stuff.TypeLine("All the knights start to talk to you asking questions like \"Where are you from?\" \"Where did you get that sword?\"");
					Stuff.TypeLine("You tell them that you got it from an old man who runs a roullette shop in the bazar.");
					Stuff.HelpingHand = true;
					ASCII.CartographyRoom();
					Stuff.TypeLine("Inside the barracks you see a cartographer making maps. Which makes sense but the one he is making looks similar");
					Stuff.Wait(100);
					Stuff.TypeLine("But with an addition");
					Stuff.TypeLine("You ask him what he is adding and he says something about runes, in the middle of the kingdom at that.");
					Stuff.TypeLine("\"Hey show me your map and I'll add it for you.\"");
					Stuff.TypeLine("He makes a quick sketch and boom, a new location has been added in your search. What joy.");
					Stuff.TypeLine("Maybe there will be something good there.");
					Stuff.TypeLine("After having a feast with the knights, you leave to search elsewhere. Well you take a healthy 9 hour slumber on some hay first.");
					ChoiceRoom();
				}
				else 
				{
					if (Stuff.HasLuckyGauntlet = true)
					{
						Stuff.TypeLine("Although you do not have a sword, you still feel like you are going to win against whoever you spar against.");
						Stuff.TypeLine("One of the knights (whose name is Harold you hear someone murmur in the silence) approaches you from within the crowd.");
						Stuff.MetHarold = true;
						Stuff.TypeLine("\'Good luck and may the best fighter win!\" he states looking confident in himself, but you feel more confident.");
						Stuff.TypeLine("One of the other knights starts to count down.");
						Stuff.TypeLine("Five.");
						Stuff.Wait(650);
						Stuff.TypeLine("Some of the other knights join in");
						Stuff.TypeLine("Four.");
						Stuff.Wait(650);
						Stuff.TypeLine("even more");
						Stuff.TypeLine("Three!");
						Stuff.Wait(650);
						Stuff.TypeLine("more");
						Stuff.TypeLine("Two!!");
						Stuff.Wait(650);
						Stuff.TypeLine("One!!!");
						Stuff.TypeLine("As Harold lunges toward you, you slip and fall back, kicking a pebble forward.");
						Stuff.TypeLine("He steps on the pebble and flies back.");
						Stuff.TypeLine("You land on some grass, he lands on some gravel.");
						Stuff.TypeLine("You stand up and rush over to help him up. You stretch out your hand to help him up and surprisingly he takes it,");
						Stuff.TypeLine(" flashes a smile, and beckons you inside the barracks for a feast with the other knights.");
						ASCII.CartographyRoom();
						Stuff.TypeLine("Inside the barracks you see a cartographer making maps. Which makes sense but the one he is making looks similar to yours...");
						Stuff.Wait(100);
						Stuff.TypeLine("But with an addition.");
						Stuff.TypeLine("You ask him what he is adding and he says something about runes, in the middle of the kingdom at that.");
						Stuff.TypeLine("\"Hey show me your map and I'll add it for you.\"");
						Stuff.TypeLine("He makes a quick sketch and boom, a new location has been added in your search. What joy.");
						Stuff.TypeLine("Maybe there will be something good there.");
						Stuff.TypeLine("After having a feast with the knights, you leave to search elsewhere. Well you take a healthy 9 hour slumber on some hay first.");
						ChoiceRoom();
					}	
					else
					{
						Stuff.TypeLine("One of the soldiers approaches you and the rest form a ring for the duel. The man introduces himself as Harold. What a cool name!");
						Stuff.MetHarold = true;
						Stuff.TypeLine("One of the knights starts to count down.");
						Stuff.TypeLine("Five.");
						Stuff.Wait(650);
						Stuff.TypeLine("Since you dont have a sword to combat Harold, you look around for something to use.");
						Stuff.TypeLine("Some of the other knights join in");
						Stuff.TypeLine("Four.");
						Stuff.Wait(650);
						Stuff.TypeLine("even more");
						Stuff.TypeLine("Three!");
						Stuff.Wait(650);
						Stuff.TypeLine("You find a rock.");
						Stuff.TypeLine("more");
						Stuff.TypeLine("Two!!");
						Stuff.Wait(650);
						Stuff.TypeLine("You stand in your ready position with a rock and some blades of grass.");
						Stuff.TypeLine("One!!!");
						Stuff.TypeLine("You run at Harold and he runs back at you.");
						Stuff.TypeLine("You throw the blades of grass at his face and it blinds him. But only for a little bit of time.");
						Stuff.TypeLine("He quickly runs at you, eyes crying and reddened because of the itchyness and takes a swing,");
						Stuff.TypeLine(" but misses because of his clowdy vision. You throw the rock at his arm and he drops the sword.");
						Stuff.TypeLine("You run to pick it up but he grabs it in time and points it at your stomach.");
						Stuff.TypeLine("\"It seems as if I have won. That was indeed a good match. You were able to hold me off even without a weapon.\"");
						Stuff.TypeLine("\"Come, join us, it is almost dinner and our little scurmish has made me hungry.\"");
						Stuff.TypeLine("You realize that you are hungry too. That chocolate bar, although not filling, did taste good.");
						Stuff.TypeLine("After dinner and some wandering, you come across a dimly lit room.");
						ASCII.CartographyRoom();
						Stuff.TypeLine("You see a cartographer making maps. Which makes sense but the one he is making looks similar.");
						Stuff.Wait(100);
						Stuff.TypeLine("But with an addition");
						Stuff.TypeLine("You ask him what he is adding and he says something about runes, in the middle of the kingdom at that.");
						Stuff.TypeLine("\"Hey show me your map and I'll add it for you.\"");
						Stuff.TypeLine("He makes a quick sketch and boom, a new location has been added in your search. What joy.");
						Stuff.TypeLine("Maybe there will be something good there.");
						Ruins();
					}
				}
				break;
			case "don't spar":
				Stuff.TypeLine("\"You don't want to spar?\" It seems like you took them by surprise. Maybe sparring is normal around here.");
				Stuff.TypeLine("\"Hey who are you anyway? You don't look like you are from around here.\"");
				Stuff.TypeLine("Another knight pipes in \"Hey you look like that assassin. All of us were warned about him!\"");
				Stuff.TypeLine("You claim to not be the assassin and you pull out your wanted poster with the map on it and show it to the knights.");
				Stuff.TypeLine("Now that you see it, the assassin does look like you. Just... older.");
				Stuff.TypeLine("\"You are coming with us!\"");
				Stuff.TypeLine("You get swarmed by the knights and they take you in to the barracks.");
				Stuff.TypeLine("You are led down some musty and mold covered stairs and into a prison room.");
				Stuff.TypeLine("As you are shoved into a cage, you ask how long you are going to be locked down there for.");
				Stuff.TypeLine("\"You won't ever be getting out of there.\"");
				Stuff.TypeLine("You aren't scared though, you can just leave with the Timeinato-");
				Stuff.Wait(300);
				Stuff.TypeLine(".");
				Stuff.Wait(300);
				Stuff.TypeLine("..");
				Stuff.Wait(300);
				Stuff.TypeLine("...");
				Stuff.Wait(300);
				Stuff.HitEnter(2);
				ASCII.TimeinatorBroken();
				Stuff.Wait(1000);
				Stuff.HitEnter(2);
				Stuff.TypeLine("The Broken Watch Ending");
				Stuff.Wait(500);
				Stuff.HitEnter(5);
				Stuff.StoryEnding();
				break;
		}
	}
	
	public static void ChoiceRoom()
	{
		Stuff.CurrentLocationNumber = 5;
		
		Stuff.TypeLine("It seems like the timenator is running out of Porject Alpha.");
		Stuff.TypeLine("You can travel to one more location before going back home.");
	}
	
	public static void Ruins()
	{
		Stuff.CurrentLocationNumber = 6;
		
	}
}