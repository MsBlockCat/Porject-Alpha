public class GoatBranch
{
	public static void GoToGoatBranch(String StartingPosition)
	{
		Stuff.CurrentBranchNumber = 3;
		switch (StartingPosition)
		{
			case "1":
			case "RuralAustralia1":
				RuralAustralia1();
				break;
			case "2":
			case "Mountain":
				Mountain();
				break;
			case "3":
			case "GroceryStore":
				GroceryStore();
				break;
			case "4":
			case "RockOfSelfReflection":
				RockOfSelfReflection();
				break;
			case "5":
			case "Tree":
				Tree();
				break;
			case "6":
			case "RuralAustralia2":
				RuralAustralia2();
				break;
			case "7":
			case "ApuRevenge":
				ApuRevenge();
				break;
			case "8":
			case "TreeHatch":
				TreeHatch();
			case "9":
			case "Town":
				Town();
				break;
			case "10":
			case "Crossroads":
				Crossroads();
				break;
			default:
				System.out.println("(Enter) Error 3: The starting area of the goat branch of the story, method GoToGoatBranch, was told to go to " + StartingPosition + ", which isn't a place!");
				Stuff.AwesomeScanner.nextLine();
		}
	}
	
	public static void RuralAustralia1()
	{
		Stuff.CurrentLocationNumber = 1;
		
			if (Stuff.StoryBeginning == true)
			{
				Stuff.TypeLine("And everything is black.");
				Stuff.Wait(2000);
				Stuff.typeln("For a few seconds, at least.");
				Stuff.typeln("Soon enough, you wake up.");
				Stuff.typeln("It is with great surprise that you find Doof's machine didn't harm you.");
				Stuff.typeln ("Well... except that...");
				Stuff.Wait(1000);
				Stuff.typeln ("You are a goat.");
				Stuff.typeln ("That is, despite having the same human (presumably) brain you had before, you now are a goat.");
				Stuff.typeln ("What fun things shall you do first?");
			}
			else
			{
				Stuff.typeln ("Where to go, what to do?");
			}
		
			switch (Stuff.PlayerChoice("climb a mountain", "figure out location", "eat something", "investigate"))
			{
			case "climb a mountain":
				Stuff.typeln ("Fortunately for you, there is a mountain nearby.");
				Stuff.StoryBeginning = false;
				Mountain();
				break;
			case "figure out location":
				Stuff.typeln ("You decide to investigate your location...");
				Stuff.StoryBeginning = false;
				RuralAustralia2();
				break;
			case "eat something":
				Stuff.typeln ("As one often is after time travel, you are quite hungry. Luckily, as a goat, you can eat things you couldn't as a human.");
				Stuff.StoryBeginning = false;
				GroceryStore();
				break;
			case "investigate":
				Stuff.typeln ("Being the inquisitive goat that you are, you decide to investigate just how you came to exist.");
				Stuff.StoryBeginning = false;
				RockOfSelfReflection();
				break;
			}
	}
	
	public static void RuralAustralia2()
	{
		Stuff.CurrentLocationNumber = 6;
		
			Stuff.typeln ("Exploration time, you suppose.");
			Stuff.Wait(1500);
			Stuff.typeln("After a brief walk, you are able to formulate the following map.");
			Stuff.typeln("It's quite messy, which is owed to your lack of thumbs and fingers.");
			ASCII.GoatMap1();
			Stuff.Wait(5000);
			Stuff.typeln("Where ever shall you go? (so many fun locations!)");
			switch (Stuff.PlayerChoice("mountain", "rock", "grocery store", "nowhere"))
			{
			case "mountain":
				Stuff.typeln ("Good choice. You are a goat, after all.");
				Mountain();
				break;
			case "rock":
				Stuff.typeln ("Yes, perhaps the rock will hold some answers...");
				RockOfSelfReflection();
				break;
			case "grocery store":
				Stuff.typeln ("As one often is after time travel, you are quite hungry. Luckily, as a goat, you can eat things you couldn't as a human.");
				GroceryStore();
				break;
			case "nowhere":
				Stuff.typeln ("Turns out the map was a waste of time. You'd like to stay put.");
				Tree();
				break;
			}
		}
	
	public static void Mountain() {
		Stuff.CurrentLocationNumber = 2;
		
		Stuff.typeln ("\"Welcome to the mountain\" says a nearby tree.");
		Stuff.typeln ("\"Hmm,\" you say to yourself, \"I suppose that the trees are sentient here.\"");
		Stuff.typeln ("Maybe the talking tree will have answers for you. Or maybe you should just begin your climb.");
		switch (Stuff.PlayerChoice("climb", "discuss with tree"))
		{
		case "climb":
			Stuff.typeln ("Good choice. You are a goat, after all.");
			break;
		case "discuss with tree":
			Stuff.typeln("\"Why are you able to talk?\" you ask the tree.");
			Stuff.typeln("\"Mate,\" says the tree, \"I have been through the unthinkable.");
			Stuff.typeln("You're not going to want to hear it.\" ");
			Stuff.typeln("\"Yes I am!\" you protest, but alas. The tree has gone back to sleep, leaving you answerless.");
			Stuff.typeln("Or so you think. Until he drops a leaf.");
			Stuff.Wait(1000);
			Stuff.typeln("You examine it carefully. . .  and find that there is text on it!");
			Stuff.HitEnter(1);
			ASCII.GoatLeaf();
			Stuff.HitEnter(2);
			Stuff.Wait(5000);
			Stuff.typeln("Well... either way, time to climb the mountain I suppose.");
			Stuff.TalkedToTree = true;
			break;
		}
		
	}
	
	public static void GroceryStore() {
		Stuff.CurrentLocationNumber = 3;
		if (Stuff.ApuNerfedYou == false) {
			Stuff.typeln ("\"Welcome to Stop, Shop, and Roll,\" a familiar man says.");
			Stuff.typeln("\"Apu?!\" you exclaim. \"Is that you? The famous cashier from the hit sitcom 'The Simpsons'?\"");
			Stuff.typeln("\"Yes, indeed,\" he replies, \"Please feel free to ask me anything as you shop.\"");
		}
		else {
			Stuff.typeln("\"Now, no more funky business,\" Apu says. \"Shop.\"");
			Stuff.typeln("He returns to the counter.");
			Stuff.ApuNerfedYou = false;
		}
		Stuff.typeln("*shopping*");
		Stuff.Wait(3000);
		Stuff.typeln("So, what do you ask Apu?");
		if (Stuff.TalkedToTree == true) {
			switch (Stuff.PlayerChoice("ask about ned", "ask anything hehe", "ask to leave"))
			{
			case "ask about ned":
				Stuff.typeln("\"Who is Ned?\" you ask politely.");
				Stuff.typeln("Apu looks up, startled, and gives you a horrified look.");
				Stuff.typeln("\"Look, Mr. Goat,\" he says, \"There are things to joke about and Ned is not one of them.");
				Stuff.typeln("\"I'm not joking,\" you tell him, but it's no use.");
				Stuff.typeln("Get out of my store! I won't tolerate ignoring our leader! Our hero! NED!\"");
				Stuff.typeln("You back towards the door.");
				Stuff.typeln("\"Praise Ned! Praise Ned!\"");
				Stuff.typeln("The door shuts behind you and Apu's praise is silenced.");
				Stuff.NedLoreAcquired = true;
				Stuff.typeln("Where to now...");
				Crossroads();
				break;
			case "ask anything hehe":
				Stuff.typeln ("\"Wow, a funny guy, eh.\" Apu draws a gun (NERF of course. NERF or nothing :0), and shoots you in the head.");
				Stuff.typeln("Everything fades to black...");
				Stuff.ApuNerfedYou = true;
				Stuff.Wait(1500);
				ModernBranch.GoToModernBranch("Lab2");
				break;
			case "ask to leave":
				Stuff.typeln("\"Mr. Apu, sir?\" you ask.\"");
				Stuff.typeln("Apu looks up.");
				Stuff.typeln("\"May I leave the store?\"");
				Stuff.typeln("\"Yes,\" he says, \"I suppose you can.\"");
				Stuff.typeln("\"Nice.\" You head for the door, and as you leave, you hear him mutter...");
				Stuff.typeln("\"...Praise Ned. Ned is cool. Prise Ned.\"");
				Stuff.typeln("Now you're intrigued. Maybe you don't want to leave...");
				Stuff.typeln("Or maybe you do. Up to you, really.");
				Stuff.TalkedToTree = true;
				switch (Stuff.PlayerChoice("go back in", "leave"))
				{
				case "go back in":
					Stuff.typeln("You decide that you just need to know what all this is about.");
					Stuff.typeln("Re-enting the store, you approach the checkout counter.");
					Stuff.typeln("\"Who is Ned?\" you ask politely.");
					Stuff.typeln("Apu looks up, startled, and gives you a horrified look.");
					Stuff.typeln("\"Look, Mr. Goat,\" he says, \"There are things to joke about and Ned is not one of them.");
					Stuff.typeln("\"I'm not joking,\" you tell him, but it's no use.");
					Stuff.typeln("Get out of my store! I won't tolerate ignoring our leader! Our hero! NED!\"");
					Stuff.typeln("You back towards the door.");
					Stuff.typeln("\"Praise Ned! Praise Ned!\"");
					Stuff.typeln("The door shuts behind you and Apu's praise is silenced.");
					Stuff.NedLoreAcquired = true;
					Stuff.typeln("Where to now...");
					Crossroads();
					break;
				case "leave":
					Stuff.typeln("I guess what he said wasn't important then.");
					Stuff.typeln("That's fine, I guess. Gotta leave something for the next playthrough, eh?");
					Stuff.Wait(1000);
					Crossroads();
					break;
				}
				break;
			}
		}
		else {
			switch (Stuff.PlayerChoice("ask anything hehe", "ask to leave"))
			{
			case "ask anything hehe":
				Stuff.typeln ("\"Wow, a funny guy, eh.\" Apu draws a gun (NERF of course. NERF or nothing :0), and shoots you in the head.");
				Stuff.typeln("Everything fades to black...");
				Stuff.ApuNerfedYou = true;
				Stuff.Wait(1500);
				ModernBranch.GoToModernBranch("Lab2");
				break;
			case "ask to leave":
				Stuff.typeln("\"Mr. Apu, sir?\" you ask.\"");
				Stuff.typeln("Apu looks up.");
				Stuff.typeln("\"May I leave the store?\"");
				Stuff.typeln("\"Yes,\" he says, \"I suppose you can.\"");
				Stuff.typeln("\"Nice.\" You head for the door, and as you leave, you hear him mutter...");
				Stuff.typeln("\"...Praise Ned. Ned is cool. Praise Ned.\"");
				Stuff.typeln("Now you're intrigued. Maybe you don't want to leave...");
				Stuff.typeln("Or maybe you do. Up to you, really.");
				Stuff.TalkedToTree = true;
				switch (Stuff.PlayerChoice("go back in", "leave"))
				{
				case "go back in":
					Stuff.typeln("You decide that you just need to know what all this is about.");
					Stuff.typeln("Re-enting the store, you approach the checkout counter.");
					Stuff.typeln("\"Who is Ned?\" you ask politely.");
					Stuff.typeln("Apu looks up, startled, and gives you a horrified look.");
					Stuff.typeln("\"Look, Mr. Goat,\" he says, \"There are things to joke about and Ned is not one of them.");
					Stuff.typeln("\"I'm not joking,\" you tell him, but it's no use.");
					Stuff.typeln("\"Get out of my store! I won't tolerate ignoring our leader! Our hero! NED!\"");
					Stuff.typeln("You back towards the door.");
					Stuff.typeln("\"Praise Ned! Praise Ned!\"");
					Stuff.typeln("The door shuts behind you and Apu's praise is silenced.");
					Stuff.NedLoreAcquired = true;
					Stuff.typeln("Where to now...");
					Crossroads();
					break;
				case "leave":
					Stuff.typeln("I guess what he said wasn't important then.");
					Stuff.typeln("That's fine, I guess. Gotta leave something for the next playthrough, eh?");
					Stuff.Wait(1000);
					Crossroads();
					break;
				}
				break;
			}
		}
	}
	
	public static void RockOfSelfReflection() {
		Stuff.CurrentLocationNumber = 4;
		
		Stuff.typeln("Lucky for you, there was a sick looking rock nearby that should be good for self-reflection.");
		
	}
	
	public static void Tree() {
		Stuff.CurrentLocationNumber = 5;
		
		Stuff.typeln("A nearby tree provides some shade.");
		Stuff.typeln("Sitting under it, you notice that its trunk has an acronym inscribed in it.");
		ASCII.TreeMessage();
		Stuff.Wait(3000);
		Stuff.typeln("Odd. Perculiar. Yes, it doesn't really make much sense.");
		Stuff.typeln("What ever could it stand for?");
		Stuff.Wait(500);
		Stuff.type("You also notice that the letters seem to be a part of a panel. What is your next move?");
		switch (Stuff.PlayerChoice("push it", "ignore it"))
		{
		case "push it":
			Stuff.typeln("As you lift up your front hooves and lean your weight onto it, the panel suddenly falls out from under you.");
			Stuff.typeln("The tree starts to make grinding, metallic sounds, and the bark begins to shift.");
			Stuff.typeln("The sounds are defeaning!");
			Stuff.typeln("Apparently they drew the attention of the nearby town, since a man suddenly runs up.");
			Stuff.typeln("He is masked and wears sunglasses, so it's hard to discern his identity, but he looks upset.");
			Stuff.typeln("\"Ay!\" he calls out to someone else you can't see. \"There's a goat here!\"");
			Stuff.typeln("\"Hold on, I'll shoot it. Darned animals always messing with the hatch.\"");
			Stuff.typeln("You probably don't want to stick around for that. But in case you want to:");
			switch (Stuff.PlayerChoice("go in hatch", "stay"))
			{
			case "go in hatch":
				Stuff.typeln("Into the hatch you go.");
				Stuff.typeln("You fall for a while.");
				Stuff.Wait(3000);
				Stuff.typeln("Luckily, you eventually land.");
				TreeHatch();
				break;
			case "stay":
				Stuff.typeln("Not a very bright choice, but a choice nonetheless.");
				Stuff.typeln("A few seconds pass.");
				Stuff.Wait(1000);
				Stuff.typeln("The man returns with another. He is holding a NERF gun (registered trademark, NERF or nothing).");
				Stuff.typeln("\"Bye bye, goat,\" the man says...");
				Stuff.typeln("But you fight back!");
				Stuff.typeln("Pow!");
				Stuff.Wait(500);
				Stuff.typeln("Slam!");
				Stuff.Wait(500);
				Stuff.typeln("Boom!");
				Stuff.Wait(500);
				Stuff.typeln("The NERF gun is no match for your horns.");
				Stuff.typeln("With that out of the way, it's time to go see where they came from...");
				Stuff.Wait(1000);
				Town();
				break;
			}
			break;
		case "ignore it":
			//idk yet
			break;
		}
	}
	
	public static void ApuRevenge() {
		Stuff.CurrentLocationNumber = 7;
		Stuff.typeln("You wake up again...");
		Stuff.typeln("And you are, once again, a goat...");
		Stuff.typeln("And standing above you is Apu.");
		Stuff.typeln("\"Have you learned your lesson, now?\" Apu asks you smugly. You note that he is still twirling the NERF gun (NERF or nothing)");
		switch (Stuff.PlayerChoice("yes", "no way"))
		{
		case "yes":
			Stuff.typeln ("\"Good choice,\" Apu says. \"Well, then...");
			Stuff.typeln ("Back to the store with you.");
			Stuff.Wait(1000);
			GroceryStore();
			break;
		case "no way":
			Stuff.typeln ("\"You're gone, pal.\" Apu takes out the NERF (NERF is a registered trademark of Hasbro) gun and...");
			Stuff.typeln("Pew, bang, boom, etc.");
			Stuff.typeln("Everything fades to black...");
			Stuff.ApuNerfedYou = true;
			Stuff.Wait(1500);
			ModernBranch.GoToModernBranch("Lab2");
			break;
		}
	}
	
	public static void TreeHatch() {
		Stuff.CurrentLocationNumber = 8;
		//make this
	}
	
	public static void Town() {
		Stuff.CurrentLocationNumber = 9;
		Stuff.typeln("You wander into town, trying to act nonchalant.");
		Stuff.typeln("You whistle a tune, but unfortunately that isn't quite as effective in terms of blending in when. . .");
		Stuff.typeln(". . .well, you're a goat.");
		Stuff.typeln("Several odd stares later, you arrive at the town center where you find a bulletin board.");
		ASCII.BulletinBoard();
		Stuff.Wait(7000);
	}
	
	public static void Crossroads() {
		Stuff.CurrentLocationNumber = 10;
		//make this
	}
}