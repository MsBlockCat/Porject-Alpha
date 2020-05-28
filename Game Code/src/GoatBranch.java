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
			default:
				System.out.println("Error 5: The starting area of the goat branch of the story, method GoToGoatBranch, was told to go to " + StartingPosition + ", which isn't a place!");
		}
	}
	
	public static void RuralAustralia1()
	{
		Stuff.CurrentLocationNumber = 6;
		
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
			Stuff.StoryBeginning = false;
		
		
			switch (Stuff.PlayerChoice("climb a mountain", "figure out location", "eat something", "investigate"))
			{
			case "climb a mountain":
				Stuff.typeln ("Fortunately for you, there is a mountain nearby.");
				Mountain();
				break;
			case "figure out location":
				Stuff.typeln ("You decide to investigate your location...");
				RuralAustralia2();
				break;
			case "eat something":
				Stuff.typeln ("As one often is after time travel, you are quite hungry. Luckily, as a goat, you can eat things you couldn't as a human.");
				GroceryStore();
				break;
			case "investigate":
				Stuff.typeln ("Being the inquisitive goat that you are, you decide to investigate just how you came to exist.");
				RockOfSelfReflection();
				break;
			}
	}
	
	public static void RuralAustralia2()
	{
			Stuff.typeln ("Exploration time, you suppose.");
			Stuff.Wait(1500);
			Stuff.typeln("After a brief walk, you are able to formulate the following map.");
			Stuff.typeln("It's quite messy, which is owed to your lack of thumbs and fingers.");
			ASCII.Map2();
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
			ASCII.Leaf();
			Stuff.Wait(5000);
			Stuff.typeln("Well... either way, time to climb the mountain I suppose.");
			Stuff.TalkedtoTree = true;
			break;
		}
		
	}
	
	public static void GroceryStore() {
		Stuff.CurrentLocationNumber = 3;
		
		Stuff.typeln ("Welcome to Stop, Shop, and Roll.");
		Stuff.typeln("\"Apu?!\" you exclaim. \"Is that you? The famous cashier from the hit sitcom 'The Simpsons'?\"");
		Stuff.typeln("\"Yes, indeed,\" he replies, \"Please feel free to ask me anything as you shop.\"");
		Stuff.typeln("*shopping*");
		Stuff.Wait(2000);
		Stuff.typeln("So, what do you ask Apu?");
		if (Stuff.TalkedtoTree == true) {
			
		}
		else {
			
		}
		
		
	}
	
	public static void RockOfSelfReflection() {
		Stuff.CurrentLocationNumber = 4;
		
		Stuff.typeln("Lucky for you, there was a sick looking rock nearby that should be good for self-reflection.");
		
	}
	
	public static void Tree() {
		Stuff.CurrentLocationNumber = 5;
		
		Stuff.typeln("A nearby tree provides some shade.");
	}
}