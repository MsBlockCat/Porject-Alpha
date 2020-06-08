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
			case "7":
			case "Castle2":
				Castle2();
				break;
			case "8":
			case "Bazar2":
				Bazar2();
				break;
			case "9":
			case "Castle3":
				Castle3();
				break;
			case "10":
			case "Castle":
				Castle();
				break;
			case "11":
			case "Run":
				Run();
				break;
			case "12":
			case "TigerCage":
				TigerCage();
				break;
			case "13":
			case "TigerEvent":
				TigerEvent();
				break;
			case "14":
			case "ChoiceRoom2":
				ChoiceRoom2();
				break;
			case "15":
			case "Barracks2":
				Barracks2();
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
		}
		Stuff.TypeLine("It seems you are in the middle of a bazar. There are women and children begging for food,");
		Stuff.TypeLine(" others yelling out prices for food and goods (much lower than modern day you notice),");
		Stuff.TypeLine(" and some old man who seems to be dead?");
		Stuff.Wait(3000);
		Stuff.TypeLine("Ooap, never mind he just coughed up a small bone, probably his lunch.");
		Stuff.TypeLine("While walking through the streets, you stumble upon a wanted poster of a criminal,");
		Stuff.TypeLine(" one who had attempted to assassinate the king of this land. The prize, Porject Alpha.");
		Stuff.TypeLine("Dr. Heinz Doofenshmirtz mentioned that a couple times, not that you were paying attention.");
		Stuff.TypeLine("You take the poster off the wall and behind it is a map of the kingdom.");
		Stuff.HitEnter(1);
		ASCII.OldTimeMapBazar();
		Stuff.HitEnter(2);
		Stuff.Wait(2000);
		Stuff.TypeLine("\"Where will you begin your search?\" You hear a passerby ask.");
		switch (Stuff.PlayerChoice("explore the bazar", "check out barracks", "search the castle"))
		{
			case "explore the bazar":
				Stuff.StoryBeginning = false;
				RoulletteShop();
				break;
			case "check out the barracks":
				Stuff.StoryBeginning = false;
				Barracks2();
				break;
			case "search the castle":
				Stuff.StoryBeginning = false;
				Castle();
				break;
		}
	}
	
	public static void RoulletteShop()
	{
		Stuff.CurrentLocationNumber = 2;
		
		Stuff.TypeLine("Whilst perusing the shops, some infinity gauntlet esque glove catches your eye.");
		Stuff.HitEnter(1);
		ASCII.LuckyGauntlet();
		Stuff.HitEnter(1);
		Stuff.Wait(1000);
		Stuff.TypeLine("Engraved in it is three symbols. A rocket ship, the head of a goat, and a sword.");
		Stuff.TypeLine("\"You like what you're seeing? Even I don't know how it got here or what that turnip shaped thing is");
		Stuff.TypeLine(" but I found it right outside my farm a couple o' years ago, no clue how long it's been there.\"");
		Stuff.TypeLine("\"Care to play a little roullette? I spin this wheel, it has 1 through 6, and if the arrow lands on, what say you, the number 5,");
		Stuff.TypeLine(" you get the \"Lucky Gauntlet\", sound fair? Well it doesn't matter because I make the rules!\"");
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
						Stuff.TypeLine("As you wish each other goodbye, you still marvel at the sword in all its beautiful splendor.");
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
						Stuff.TypeLine("\"Oh not your lucky day is it. Well move along now, nothing else you can do here, well besides taking this sword for your troubles.");
						Stuff.TypeLine("You are gonna need it on your quest for that assassin! Yes word spreads fast doesn't it.\"");
						Stuff.TypeLine("The sword is made of emeralds which gives it a magnificent green glow in the sun.");
						Stuff.TypeLine("As you marvel at the sword, you walk away to start your search of the assassin.");
						Stuff.HasEmeraldSword = true;
						Bazar();
						break;
				}
				break;
				
			case "don't spin":
				Stuff.TypeLine("\"Well then, here take this sword, it's made of emeralds and will help you on your journey.");
				Stuff.TypeLine("Most people around here know about it and boy are we thankful. Our king is a good one so I don't know why anyone would attempt to murder him.");
				Stuff.TypeLine("Good luck traveler.\" With these words you leave the shop and continue your search.");
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
		Stuff.HitEnter(1);
		ASCII.OldTimeMapBazar();
		Stuff.HitEnter(2);
		switch (Stuff.PlayerChoice("check out barracks", "search the castle"))
		{
			case "check out barracks":
				Barracks();
				break;
			case "search the castle":
				Castle();
				break;
		}
	}
	
	public static void Barracks()
	{
		Stuff.CurrentLocationNumber = 4;
		
		Stuff.TypeLine("After the walk you took, you sit in the shade of a tree and hear something...");
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
					Stuff.HitEnter(2);
					ASCII.CartographyRoom();
					Stuff.HitEnter(2);
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
						Stuff.TypeLine("\"Good luck and may the best fighter win!\" he states looking confident in himself, but you feel more confident.");
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
						Stuff.HitEnter(2);
						ASCII.CartographyRoom();
						Stuff.HitEnter(2);
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
						Stuff.TypeLine("\"It seems as if I have won. That was indeed a good match. You were able to hold me off even without a weapon.");
						Stuff.TypeLine("Come, join us, it is almost dinner and our little scurmish has made me hungry.\"");
						Stuff.TypeLine("You realize that you are hungry too. That chocolate bar, although not filling, did taste good.");
						Stuff.TypeLine("After dinner and some wandering, you come across a dimly lit room.");
						Stuff.HitEnter(2);
						ASCII.CartographyRoom();
						Stuff.HitEnter(2);
						Stuff.TypeLine("You see a cartographer making maps. Which makes sense but the one he is making looks similar.");
						Stuff.Wait(100);
						Stuff.TypeLine("But with an addition");
						Stuff.TypeLine("You ask him what he is adding and he says something about runes, in the middle of the kingdom at that.");
						Stuff.TypeLine("\"Hey show me your map and I'll add it for you.\"");
						Stuff.TypeLine("He makes a quick sketch and boom, a new location has been added in your search. What joy.");
						Stuff.TypeLine("Maybe there will be something good there.");
						ChoiceRoom();
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
				if (Stuff.HasLuckyGauntlet = true)
				{
					Stuff.TypeLine("They take the gauntlet from your hand, rendering you unlucky.");
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
					Stuff.TypeLine("The Unlucky Ending");
					Stuff.Wait(500);
					Stuff.HitEnter(5);
					Stuff.StoryEnding();
				}
				else
				{
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
					Stuff.TypeLine("Cut Short Ending");
					Stuff.Wait(500);
					Stuff.HitEnter(5);
					Stuff.StoryEnding();
				}
				break;
		}
	}
	
	public static void ChoiceRoom()
	{
		Stuff.CurrentLocationNumber = 5;
		
		Stuff.TypeLine("It seems like the Timeinator is running out of Porject Alpha.");
		Stuff.TypeLine("You can travel to one more location before going back home.");
		Stuff.HitEnter(2);
		ASCII.OldTimeMapBarracksR();
		Stuff.HitEnter(2);
		switch (Stuff.PlayerChoice("go to the castle", "go to the ruins"))
		{
			case "go to the castle":
				Castle2();
				break;
			case "go to the ruins":
				Ruins();
				break;
		}
	}
	
	public static void Ruins()
	{
		Stuff.CurrentLocationNumber = 6;
		
		Stuff.TypeLine("You follow the map to the place the cartophapher added and believe it or not, there is indeed a large ruins that resemble a pyramid.");
		Stuff.TypeLine("There are also two crumbling pillars on either side of the massive entrance.");
		Stuff.TypeLine("When you enter there is a fork in the long sandy hallway.");
		Stuff.TypeLine("Do you want to go left or right?");
		switch (Stuff.PlayerChoice("left", "right"))
		{
			case "left":
				Stuff.TypeLine("You feel weird, almost like you are moving but standing still.");
				Stuff.TypeLine("It truly is a peculiar sensation.");
				Stuff.TypeLine("You feel a rush of wind and your body starts contorting.");
				Stuff.TypeLine("You are definitely moving.");
				Stuff.TypeLine("Oh it seems like you stopped, but you are not in the same place, rather, a modern building.");
				SpaceBranch.GoToSpaceBranch("RightBuilding");
				break;
			case "right":
				Stuff.TypeLine("As you walk further in to the ruins, the temperature starts to drop and a faint purple glow starts to appear.");
				Stuff.TypeLine("As the glow gets brighter, the hallway starts to widen and finally it opens into a massive room with one thing in the middle.");
				Stuff.TypeLine("The glow was coming from an object on a stand.");
				Stuff.TypeLine("There are some runes on the stand and you try to decipher them.");
				if (Stuff.HasLuckyGauntlet = true)
				{
					Stuff.TypeLine("Luckily you have the Lucky Gauntlet.");
					Stuff.TypeLine("You know what the runes say.");
					Stuff.TypeLine("Porject Alpha.");
					Stuff.TypeLine("This is the stuff that Doof talks about and this was the reward for capturing the assassin.");
					Stuff.TypeLine("You dont know its value but you have no time to think.");
					Stuff.TypeLine("The Timeinator starts to beep. It is the end of the road.");
					Stuff.TypeLine("You never caught the assassin.");
					Stuff.TypeLine("But you accomplished your mission.");
					Stuff.TypeLine("You grab the Porject Alpha and in an instant, you make it home.");
					Stuff.TypeLine("Back to the lab.");
					Stuff.Wait(1000);
					Stuff.HitEnter(2);
					Stuff.TypeLine("Mission Success Ending");
					Stuff.Wait(500);
					Stuff.HitEnter(5);
					Stuff.StoryEnding();
				}
				else
				{
					if(Stuff.HasEmeraldSword = true)
					{
						Stuff.TypeLine("It takes you a while to understand it but you finally get it.");
						Stuff.TypeLine("You think.");
						Stuff.TypeLine("You have no idea. You hear a clink behind you and you swing around with your sword.");
						Stuff.TypeLine("It hits another. One exactly the same.");
						Stuff.Wait(500);
						Stuff.TypeLine("It's you. You are staring right at yourself. Just older. They looks exactly like the person on the wanted poster.");
						Stuff.TypeLine("You both lower your swords at the same time, creating an orange glow as the purple interacts with the green.");
						Stuff.TypeLine("He shows you a broken Timeinator and now you understand why he is here.");
						Stuff.TypeLine("He walks over to the substance and inserts it into your Timeinator giving it more life.");
						Stuff.TypeLine("The substance is Porject Alpha.");
						Stuff.TypeLine("He clicks a button on your Timeinator and after an array of colors and bursts of wind you are home.");
						Stuff.TypeLine("You leave knowing that the kingdom is safe under your watch.");
						Stuff.Wait(1000);
						Stuff.HitEnter(2);
						Stuff.TypeLine("Seeing Double Ending");
						Stuff.Wait(500);
						Stuff.HitEnter(5);
						Stuff.StoryEnding();
					}
					else
					{
						Stuff.TypeLine("As you walk down the hall you see a faint purple glow.");
						Stuff.TypeLine("You start to run towards the glow but slip on some wetness on the ground.");
						Stuff.TypeLine("You hear a beep coming from the Timeinator. you must have clicked a button.");
						Stuff.TypeLine("You feel a rush of wind, see a purple glow, and your body starts to swirl.");
						Stuff.TypeLine("What is this weird feeling?");
						Stuff.TypeLine("As you start to reappear you feel different.");
						Stuff.TypeLine("You are still you, but not at the same time.");
						Stuff.TypeLine("Hair, four legs, horns?");
						Stuff.TypeLine("Yes yes you have traveled to rural Australia and you are now a human thinking goat.");
						GoatBranch.GoToGoatBranch("RuralAustralia1");
					}
				}
				break;
		}
	}
	public static void Castle2()
	{
		Stuff.CurrentLocationNumber = 7;
		
		Stuff.TypeLine("The walk to the castle was long, but it wasn't since a traveling circus picked you up and brought you to the castle gates.");
		Stuff.TypeLine("The only problem is that the drawbridge is up.");
		Stuff.TypeLine("You just stand there and wait.");
		Stuff.Wait(500);
		Stuff.TypeLine("Wait.");
		Stuff.Wait(500);
		Stuff.TypeLine("Ok finally someone is at the other end of the drawbridge.");
		Stuff.TypeLine("But they aren't bringing it up.");
		Stuff.TypeLine("It looks like you don't have many more options left.");
		switch (Stuff.PlayerChoice("sit and wait", "give up"))
		{
			case "sit and wait":
				//Add something here please Digo
				break;
			case "give up":
				if(Stuff.HasLuckyGauntlet = true)
				{
					Stuff.TypeLine("Luckily all is not lost.");
					Stuff.TypeLine("You hear some cranking and chains moving.");
					Stuff.TypeLine("You turn around and the drawbridge is now open, inviting you to enter the grand castle.");
					Stuff.TypeLine("Maybe this gauntlet actually does bring luck.");
					Castle3();
				}
				else
				{
					Stuff.TypeLine("Looks like there is nothing else you can do.");
					Stuff.TypeLine("You start to walk in a direction. None of any importance because no matter where you are, the Timeinator will take you back to the same place.");
					Stuff.TypeLine("In the distance you see a crowd.");
					Stuff.TypeLine("And even further you see a little town. Looks like. THE BAZAR!");
					Stuff.TypeLine("You start running because the Timeinator is beeping faster now.");
					Stuff.TypeLine("You remember an old friend.");
					Stuff.Wait(1000);
					Bazar2();
				}
				break;
		}
	}
	
	public static void Bazar2()
	{
		Stuff.CurrentLocationNumber = 8;
		
		if (Stuff.HasEmeraldSword = true)
		{
			Stuff.TypeLine("As you run down the crowded aisles of the bazar, you notice one very packed shop.");
			switch (Stuff.PlayerChoice("go to it", "don't"))
			{
				case "go to it":
					Stuff.TypeLine("You push through the people and right in front of you is the roullette man. ");
					Stuff.TypeLine("The one that helped you on the start of your mission.");
					Stuff.TypeLine("You run up to him and return the emerald sword.");
					Stuff.TypeLine("You recognize some of the knights, they were at the barracks when you sparred with Harold.");
					Stuff.TypeLine("You run in the opposite direction as to not attract attention. You hear a faint thank you. Must have been the roullette man.");
					Stuff.TypeLine("You hide in an alley and a purple glow starts to emerge from the watch.");
					Stuff.TypeLine("Your body starts to swirl and disappear from this world.");
					Stuff.TypeLine("In an instant, you are back in the lab.");
					Stuff.TypeLine("No Porject Alpha, no caught assassin, but you are still happy.");
					Stuff.Wait(1000);
					Stuff.HitEnter(2);
					Stuff.TypeLine("The Happy Ending");
					Stuff.Wait(500);
					Stuff.HitEnter(5);
					Stuff.StoryEnding();
					break;
				case "don't":
					Stuff.TypeLine("You don't think there is enough time.");
					Stuff.TypeLine("There is a small break in the crowd, you two lock eyes.");
					Stuff.TypeLine("He waves and you wave back.");
					Stuff.TypeLine("It seems like the roullette man has become rather popular since he made you that sword.");
					Stuff.TypeLine("Looks like you are going to keep it as a memento of the man that began your adventure.");
					Stuff.TypeLine("The Timeinator activates.");
					Stuff.TypeLine("Your body starts to swirl and disappear from this world.");
					Stuff.TypeLine("In an instant, you are back in the lab.");
					Stuff.Wait(1000);
					Stuff.HitEnter(2);
					Stuff.TypeLine("The Touching Ending");
					Stuff.Wait(500);
					Stuff.HitEnter(5);
					Stuff.StoryEnding();
					break;
			}
		}
		else
		{
			Stuff.TypeLine("");
		}
	}
	
	public static void Castle3()
	{
		Stuff.CurrentLocationNumber = 9;
		
		if (Stuff.MetHarold = true)
		{
			Stuff.TypeLine("What was even luckier was seeing who opened the drawbridge.");
			Stuff.TypeLine("The man you sparred.");
			Stuff.TypeLine("The knight Harold.");
			Stuff.TypeLine("\"Hello! What brings you here?\"");
			Stuff.TypeLine("You tell him that your search of the assassin took you here and that you don't have much more time.");
			Stuff.TypeLine("\"Well I'll help you search. Let us split up to cover more ground.\"");
			Stuff.TypeLine("After about 15 minutes of searching, you hear yelling. It sounds like Harold.");
			Stuff.TypeLine("You run after the sound and find him chasing the hooded assassin.");
			Stuff.TypeLine("You and Harold corner him in an alley and call out for reinforcements.");
			Stuff.TypeLine("The assassin whips out its sword and goes on the attack.");
			Stuff.TypeLine("Luckily a flower pot lands on his head and knocks him out.");
			switch (Stuff.PlayerChoice("look up", "don't look up"))
			{
				case "look up":
					if (Stuff.Criminal = true)
					{
						Stuff.TypeLine("You look up and see a grumpy old lady.");
						Stuff.TypeLine("\"QUIET DOWN!! IM TRYING TO PLANT MY PETUNIAS!!\"");
						Stuff.TypeLine("Harold gives you a surprised look and you give one back.");
						Stuff.TypeLine("The reinforcements you called just arrived.");
						Stuff.TypeLine("Without hesitation, they roughly pushed the assassin into a prison cart and promptly rolled him away.");
						Stuff.TypeLine("Some of the knights yell \"Grab Him!\"");
						Stuff.TypeLine("This was directed at you.");
						Stuff.TypeLine("Mainly because of the events that took place last time you were at the castle.");
						Stuff.TypeLine("Harold seems surprised and even vouches for you.");
						Stuff.TypeLine("At this point, everyone is surprised.");
						Stuff.TypeLine("One voice speaks out amongst the rest.");
						Stuff.TypeLine("The assassin says that he was the hooded figure.");
						Stuff.TypeLine("The one that falsely exposed you of being the assassin.");
						Stuff.TypeLine("And getting you into that whole tiger mess.");
						Stuff.TypeLine("Before you can ask him a question he is rolled away, never to be seen again.");
						Stuff.TypeLine("The two of you are escorted to the main hall where you meet the King.");
						Stuff.TypeLine("Harold gets a new sword. It is so shiny that it reflects some of the incoming light and scorches the royal rug.");
						Stuff.TypeLine("You on the other hand get some Porject Alpha.");
						Stuff.TypeLine("You take a break in the \"royal potty\" and activate the Timeinator.");
						Stuff.TypeLine("As a purple glow emerges from the device, you feel a gust of wind and your body starts to swirl.");
						Stuff.TypeLine("In an instant, you make it back to the lab.");
						Stuff.TypeLine("You caught the assassin and even acquired the Porject Alpha that Doof wanted.");
						Stuff.Wait(1000);
						Stuff.HitEnter(2);
						Stuff.TypeLine("The False Criminal Ending");
						Stuff.Wait(500);
						Stuff.HitEnter(5);
						Stuff.StoryEnding();
					}
					else
					{
						Stuff.TypeLine("You look up and see a grumpy old lady.");
						Stuff.TypeLine("\"QUIET DOWN!! IM TRYING TO PLANT MY PETUNIAS!!\"");
						Stuff.TypeLine("Harold gives you a surprised look and you give one back.");
						Stuff.TypeLine("The reinforcements you called just arrived.");
						Stuff.TypeLine("Without hesitation, they roughly pushed the assassin into a prison cart and promptly rolled him away.");
						Stuff.TypeLine("The two of you are escorted to the main hall where you meet the King.");
						Stuff.TypeLine("Harold gets a new sword. It is so shiny that it reflects some of the incoming light and scorches the royal rug.");
						Stuff.TypeLine("You on the other hand get some Porject Alpha.");
						Stuff.TypeLine("You take a break in the \"royal potty\" and activate the Timeinator.");
						Stuff.TypeLine("As a purple glow emerges from the device, you feel a gust of wind and your body starts to swirl.");
						Stuff.TypeLine("In an instant, you make it back to the lab.");
						Stuff.TypeLine("You caught the assassin and even acquired the Porject Alpha that Doof wanted.");
						Stuff.Wait(1000);
						Stuff.HitEnter(2);
						Stuff.TypeLine("The Flower Pot Ending");
						Stuff.Wait(500);
						Stuff.HitEnter(5);
						Stuff.StoryEnding();
					}
					break;
				case "don't look up":
					if (Stuff.Criminal = true)
					{
						Stuff.TypeLine("To you it doesn't really matter how that hit him, just that you got the assassin.");
						Stuff.TypeLine("You and Harold hand him over to the incoming security knights and where he went from there is unknown to you.");
						Stuff.TypeLine("Probably went to a prison though.");
						Stuff.TypeLine("You also never got to see his face.");
						Stuff.TypeLine("One of the guards grabs a hold on you and Harold pushes him away.");
						Stuff.TypeLine("\"This person is a wanted criminal,\" one of the knights says.");
						Stuff.TypeLine("Harold defends you but it seems like you are going back to the tiger arena.");
						Stuff.TypeLine("From out of nowhere, another knight walks over and whispers something to the one that is pestering you and he lets go.");
						Stuff.TypeLine("\"Seems like you are good to go.");
						Stuff.TypeLine("How strange.");
						Stuff.TypeLine("All that matters is that you got to see your bud Harold.");
						Stuff.TypeLine("And get that sweet sweet Porject Alpha reward.");
						Stuff.TypeLine("You take a break in the \"royal loo\" and activate the Timeinator.");
						Stuff.TypeLine("As a purple glow emerges from the device, you feel a gust of wind and your body starts to swirl.");
						Stuff.TypeLine("In an instant, you make it back to the lab.");
						Stuff.TypeLine("You caught the assassin and even acquired the Porject Alpha that Doof wanted.");
						Stuff.Wait(1000);
						Stuff.HitEnter(2);
						Stuff.TypeLine("The Kingdom Hero Ending");
						Stuff.Wait(500);
						Stuff.HitEnter(5);
						Stuff.StoryEnding();
					}
					else
					{
						Stuff.TypeLine("To you it doesn't really matter how that hit him, just that you got the assassin.");
						Stuff.TypeLine("You and Harold hand him over to the incoming security knights and where he went from there is unknown to you.");
						Stuff.TypeLine("Probably went to a prison though.");
						Stuff.TypeLine("You also never got to see his face.");
						Stuff.TypeLine("All that matters is that you got to see your bud Harold.");
						Stuff.TypeLine("And get that sweet sweet Porject Alpha reward.");
						Stuff.TypeLine("You take a break in the \"royal loo\" and activate the Timeinator.");
						Stuff.TypeLine("As a purple glow emerges from the device, you feel a gust of wind and your body starts to swirl.");
						Stuff.TypeLine("In an instant, you make it back to the lab.");
						Stuff.TypeLine("You caught the assassin and even acquired the Porject Alpha that Doof wanted.");
						Stuff.Wait(1000);
						Stuff.HitEnter(2);
						Stuff.TypeLine("The Hero of the Kingdom Ending");
						Stuff.Wait(500);
						Stuff.HitEnter(5);
						Stuff.StoryEnding();
					}
					break;
			}
		}
		else
		{
			Stuff.TypeLine("");
		}
	}
	
	public static void Castle()
	{
		Stuff.CurrentLocationNumber = 10;
		
		Stuff.TypeLine("As you walk down to the castle, you meet up with a wandering circus.");
		Stuff.TypeLine("They seem friendly so you ask if you can hitch a ride with them.");
		Stuff.TypeLine("They say no.");
		Stuff.HitEnter(2);
		Stuff.TypeLine("You keep on walking and finally you make it to the castle gate.");
		Stuff.TypeLine("The drawbridge is down so that was convenient.");
		Stuff.TypeLine("As you enter you take one last look at the wanted poster with the map on it to remember the man you are hunting for.");
		Stuff.TypeLine("You think they look familiar.");
		Stuff.TypeLine("Either way you want to capture them because of the reward.");
		Stuff.TypeLine("You start to get hungry and want to go to a food shop.");
		Stuff.TypeLine("There are two nearby.");
		switch (Stuff.PlayerChoice("vegetarian", "chicken"))
		{
			case "vegetarian":
				Stuff.TypeLine("At the vegetarian shop, there isn't much on the menu.");
				Stuff.TypeLine("\"Kale.\"");
				Stuff.HitEnter(2);
				Stuff.TypeLine("\"Boiled Kale.\"");
				Stuff.HitEnter(2);
				Stuff.TypeLine("\"Lettuce.\"");
				Stuff.HitEnter(2);
				Stuff.TypeLine("\"Carrot.\"");
				Stuff.HitEnter(2);
				Stuff.TypeLine("It seems like vegetarian cuisine has not yet made its debut.");
				Stuff.TypeLine("You choose to go to the chicken shop instead.");
				Stuff.HitEnter(2);
				Stuff.TypeLine("Wow, there are a lot of different ways to eat chicken here.");
				Stuff.TypeLine("Raw. Sounds disgusting!");
				Stuff.HitEnter(2);
				Stuff.TypeLine("Boiled.");
				Stuff.HitEnter(2);
				Stuff.TypeLine("Grilled with spices. You choose this one.");
				Stuff.HitEnter(2);
				Stuff.TypeLine("Baked.");
				Stuff.HasChicken = true;
				break;
			case "chicken":
				Stuff.TypeLine("Wow, there are a lot of different ways to eat chicken here.");
				Stuff.TypeLine("Raw. Sounds disgusting!");
				Stuff.HitEnter(2);
				Stuff.TypeLine("Boiled.");
				Stuff.HitEnter(2);
				Stuff.TypeLine("Grilled with spices. You choose this one.");
				Stuff.HitEnter(2);
				Stuff.TypeLine("Baked.");
				Stuff.HasChicken = true;
				break;
		}
		Stuff.TypeLine("You eat half of the chicken and save the rest for later in your pocket.");
		Stuff.TypeLine("You are now full and ready to look for this assassin person, until some hooded figure comes and asks for your help.");
		Stuff.TypeLine("You feel obligated to help for no reason.");
		Stuff.TypeLine("\"Come with me.\"");
		Stuff.TypeLine("You follow.");
		Stuff.TypeLine("They lead you to a knight and whisper something into their ear.");
		Run();
	}
	
	public static void Run()
	{
		Stuff.CurrentLocationNumber = 11;
		
		Stuff.TypeLine("The knight starts to chase after you calling for reinforcements.");
		Stuff.Criminal = true;
		switch (Stuff.PlayerChoice("run", "don't run"))
		{
			case "run":
				Stuff.TypeLine("You sprint in a direction, thinking to yourself how dumb you were to trust a hooded man.");
				Stuff.TypeLine("Everywhere you look there are knights emerging from their posts, running after you.");
				Stuff.TypeLine("Even the vegetarian food shop lady is chasing you with some celery in her hand, complaining that you don't \"appreciate fine cuisine\"");
				Stuff.TypeLine("She gets tackled and imprisoned due to her lies.");
				Stuff.TypeLine("It seems that people really don't like vegetarian food.");
				Stuff.TypeLine("Either way you keep running until you trip.");
				Stuff.TypeLine("You get picked up and rolled into a prison cart.");
				Stuff.TypeLine("\"Into the tiger cage you go.\"");
				TigerCage();
				break;
			case "don't run":
				Stuff.TypeLine("Why you don't run, even you are not sure.");
				Stuff.TypeLine("The knight grabs a hold of your arm and drags you into a prison cart.");
				Stuff.TypeLine("\"Into the tiger cage you go.\"");
				Stuff.TypeLine("That sounds everything but good, unless you like tigers.");
				TigerCage();
				break;
		}
	}
	
	public static void TigerCage()
	{
		Stuff.CurrentLocationNumber = 12;
		
		Stuff.TypeLine("How cool, you are in an crowded arena with a large pole in the middle.");
		Stuff.TypeLine("There is a chain on that pole and on the chain is a tiger.");
		Stuff.TypeLine("Fantastic.");
		Stuff.TypeLine("You stand in a line with other criminals although you yourself are not one.");
		Stuff.TypeLine("Your complaints to the guards don't work either.");
		Stuff.TypeLine("Since the mood is grim you come up with some ideas to try and stay positive.");
		switch (Stuff.PlayerChoice("make a joke", "blah blah blah", "revolt"))
		{
			case "make a joke":
				Stuff.TypeLine("You lean up nice and close to one of the big burly men next to you and tell him a joke.");
				Stuff.TypeLine("He did not find it amusing.");
				Stuff.TypeLine("Infact he swung at your head but you dodged right in time.");
				Stuff.TypeLine("\"Hey are you trying to cause a fight here?\"");
				Stuff.TypeLine("The knight said this to the man you told the joke to.");
				Stuff.TypeLine("He then gets pulled away and you stick your tongue at him.");
				Stuff.TypeLine("Who doesn't like a knock knock joke?");
				TigerEvent();
				break;
			case "blah blah blah":
				Stuff.TypeLine("Blah blah blah. You start mocking one of the knights.");
				Stuff.TypeLine("He did not like that. He actually walked over and said that you would be the first one fed to the tiger if you kept it up.");
				Stuff.TypeLine("Seems like a good time to stop mocking him.");
				Stuff.TypeLine("It was fun while it lasted.");
				TigerEvent();
				break;
			case "revolt":
				Stuff.TypeLine("You spread the idea of revolting to the criminals around you and it seems they like it.");
				Stuff.TypeLine("One of them yells \"REVOLT!!\" and the rest jump into action, doing criminal things that is.");
				Stuff.TypeLine("You use this oportunity to try to sneak out during the chaos but you back into a knight and they restrain you.");
				Stuff.TypeLine("All of the criminals are also restrained and put back into line, this time closer to the tiger.");
				Stuff.TypeLine("Looks like this was a pretty bad idea.");
				Stuff.TypeLine("It was worth a try though.");
				TigerEvent();
				break;
		}
	}
	
	public static void TigerEvent()
	{
		Stuff.CurrentLocationNumber = 13;
		
		Stuff.TypeLine("After the failed attempt at lightening the mood, it is time for the main event.");
		Stuff.TypeLine("The tiger is unchained and starts to stalk its prey.");
		Stuff.TypeLine("All of the criminals and yourself run around in circles because there is not much else you can do.");
		if (Stuff.HasChicken = true)
		{
			Stuff.TypeLine("You just remember something.");
			Stuff.TypeLine("You reach into your pocket and take out the other half of the chicken you had for lunch.");
			Stuff.TypeLine("You take a bite and keep running.");
			Stuff.TypeLine("Then you have an idea.");
			Stuff.Wait(200);
			Stuff.TypeLine("You take another bite.");
			Stuff.TypeLine("Then you throw it at the tiger.");
			Stuff.TypeLine("It takes a bite and passes out because it is so spicy.");
			Stuff.TypeLine("There is actual smoke coming out of the tiger's ears and nose.");
			Stuff.TypeLine("Some knights come out to check on the tiger and they leave one of the entrance doors open.");
			Stuff.TypeLine("You and the criminals run out through that door and lock it behind you.");
			Stuff.TypeLine("It also seems like the tiger is starting to regain consiousness.");
			Stuff.TypeLine("Welp now its the knights problem and not yours.");
			Stuff.TypeLine("You keep on running to the castle exit and you finally make it out.");
			Stuff.TypeLine("You have to find some other place to go now.");
			ChoiceRoom2();
		}
		else
		{
			Stuff.TypeLine("The tiger doesn't seem very picky, but it still goes for you.");
			Stuff.TypeLine("You stand still in shock as the tiger approaches. There isn't much you can do at a time like this.");
			Stuff.TypeLine("The feline slows down and looks at you strangely.");
			Stuff.TypeLine("It then walks over and rubs against your legs like a common house cat.");
			Stuff.TypeLine("You must be very nonthreatening to make a tiger like you.");
			Stuff.TypeLine("It then goes under your legs and you end up riding on top of it.");
			Stuff.TypeLine("It leaps through the arena and even knocks down some knights on the way but you make it to the castle gate.");
			Stuff.TypeLine("The drawbridge is being lifted and you try to get the tiger to stop but it seems like it wwants freedom more than you.");
			Stuff.TypeLine("It leaps over the gap between the bridge and the land in front of it.");
			Stuff.TypeLine("You hop off and send it on its way. Maybe it will join the circus, who knows.");
			Stuff.TypeLine("You have to find some other place to go now.");
			ChoiceRoom2();
		}
	}
	
	public static void ChoiceRoom2()
	{
		Stuff.CurrentLocationNumber = 14;
		
		Stuff.TypeLine("You want to keep searching for Porject Alpha.");
		Stuff.TypeLine("Although you are now considered a fugitive, Doof would not be happy if you came back empty handed.");
		ASCII.OldTimeMapCastle();
		Stuff.TypeLine("There are two more places to check out.");
		switch (Stuff.PlayerChoice("check out the barracks", "roam the bazar"))
		{
			case "check out the barracks":
				Barracks();
				break;
			case "roam the bazar":
				RoulletteShop();
				break;
		}
	}
	
	public static void Barracks2()
	{
		Stuff.CurrentLocationNumber = 15;
		
		Stuff.TypeLine("This is a bad place to start.");
		Stuff.TypeLine("You shouldn't start here.");
		Stuff.TypeLine("Choose a different place to start.");
		switch (Stuff.PlayerChoice("explore the bazar", "search the castle"))
		{
			case "explore the bazar":
				Stuff.StoryBeginning = false;
				RoulletteShop();
				break;
			case "search the castle":
				Stuff.StoryBeginning = false;
				Castle();
				break;
		}
	}
}