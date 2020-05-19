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
			default:
				System.out.println("Error 5: The starting area of the goat branch of the story, method GoToGoatBranch, was told to go to " + StartingPosition + ", which isn't a place!");
		}
	}
	
	public static void RuralAustralia1()
	{
		Stuff.CurrentLocationNumber = 1;
		
		if (Stuff.StoryBeginning == true)
		{
			Stuff.TypeLine("You travel back to the year 1954.");
			Stuff.typeln ("And also, for some reason, you now embody a goat.");
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
				RuralAustralia1();
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
		else {
			Stuff.typeln ("Investigation time, I suppose.");
		}
	}
	
	public static void Mountain() {
		Stuff.typeln ("\"Welcome to the mountain\" says a nearby tree.");
		
	}
	
	public static void GroceryStore() {
		Stuff.typeln ("Welcome to Stop, Shop, and Roll.");
		
	}
	
	public static void RockOfSelfReflection() {
		Stuff.typeln("Lucky for you, there was a sick looking rock nearby that should be good for self-reflection.");
		
	}
}