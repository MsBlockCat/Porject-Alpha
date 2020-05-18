public class ModernBranch
{
	public static void GoToModernBranch(String StartingPosition)
	{
		Stuff.CurrentBranchNumber = 1;
		String PlayerLocation = StartingPosition;
		
		switch (PlayerLocation)
		{
			case "1":
			case "Lab1":
				Lab1();
				break;
			default:
				System.out.println("Error 3: The starting area of the modern day branch of the story, method GoToModernBranch, was told to go to " + PlayerLocation + ", which isn't a place!");
		}
	}
	
	public static void Lab1()
	{
		Stuff.CurrentLocationNumber = 1;
		
		Stuff.TypeLine("The epic quest begins...");
		ASCII.DoofInc();
		Stuff.Wait(2000);
		Stuff.TypeLine("Yes, it begins under the harsh light of a labratory.");
		Stuff.TypeLine("You're the assistant to Dr. Heinz Doofenshmirtz, a genius in time travel and teleportation.");
		Stuff.TypeLine("After two decades, Doofenshmirtz finally had a breakthrough with the Timeinator.");
		Stuff.TypeLine("A rat was tested with it and mostly survived.");
		Stuff.TypeLine("As Dr. Doofenshmirtz's assistant, you get to be the first human to test the time machine.");
		Stuff.TypeLine("You pick up the surprisingly small device. It has \"Porject Alpha\" engraved on one half of the bottom of it, and \"The Timeinator\" on the other half.");
		Stuff.TypeLine("You're pretty sure Dr. Doofenshmirtz can't spell, but you never dared question his genius.");
		Stuff.TypeLine("You place the time machine on your left wrist, noting its similarities in appearance to a smartwatch.");
		Stuff.TypeLine("Would you like to go back to the old times in the year 1253, in rural Australia in the year 1954, or to space in the year 2030?");
		switch (Stuff.PlayerChoice("1253", "1954", "2030"))
		{
			case "1253":
				OldTimeBranch.GoToOldTimeBranch("OuterVillage1");
				break;
			case "1954":
				GoatBranch.GoToGoatBranch("RuralAustralia1");
				break;
			case "2030":
				SpaceBranch.GoToSpaceBranch("Launchpad");
				break;
		}
	}
}