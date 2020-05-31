public class ModernBranch
{
	public static void GoToModernBranch(String StartingPosition)
	{
		Stuff.CurrentBranchNumber = 1;
		switch (StartingPosition)
		{
			case "1":
			case "Lab1":
				Lab1();
				break;
			case "2":
			case "Lab2":
				Lab2();
				break;
			default:
				System.out.println("(Enter) Error 1: The starting area of the modern day branch of the story, method GoToModernBranch, was told to go to " + StartingPosition + ", which isn't a place!");
				Stuff.AwesomeScanner.nextLine();
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
		Stuff.TypeLine("He would also appreciate it if you could find him some more Porject Alpha on your journey, but");
		Stuff.TypeLine(" never bothered explaining what that meant.");
		Stuff.TypeLine("You pick up the surprisingly small device. It has \"The Timeinator\" engraved on the bottom of it.");
		Stuff.TypeLine("You put the time machine on your left wrist, noting its similarities in appearance to a smartwatch.");
		Stuff.TypeLine("After rambling for 20 minutes straight about his backstory, the legendary Doof gives you a few choices.");
		Stuff.TypeLine("Would you like to go back to the old times in the year 1253,");
		Stuff.TypeLine(" in rural Australia in the year 1954, or to space in the year 2030?");
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
	
	public static void Lab2()
	{
		Stuff.CurrentLocationNumber = 2;
		
		Stuff.TypeLine("\"Back so soon?\"");
		Stuff.TypeLine("Spoken by the one and only Dr. Doofenshmirtz.");
		Stuff.TypeLine("You explain to him what's happened so far.");
		Stuff.Type("\"You can keep testing then!");
		if (Stuff.TimeinatorWorks == true)
		{
			Stuff.TypeLine(" I'm glad to see my Timeinator is working so far! Much more promise than some other recent inators...\"");
		}
		else
		{
			Stuff.TypeLine(" Shame my Timeinator broke, though! Let me fix that for you first...\"");
			Stuff.TypeLine("After giving him the Timeinator, a few minutes later Dr. Doof comes back with a fixed up Timeinator!");
			Stuff.TypeLine("You put it on.");
			Stuff.TimeinatorWorks = true;
		}
		
		Stuff.TypeLine("\"So, then, would you like to go back to the old times in the year 1253, in rural Australia in the year 1954, or to space in the year 2030?\"");
		switch (Stuff.PlayerChoice("1253", "1954", "2030"))
		{
			case "1253":
				OldTimeBranch.GoToOldTimeBranch("OuterVillage1");
				break;
			case "1954":
				GoatBranch.GoToGoatBranch("RuralAustralia1"); //make an if thing for you to go different places depending if apu killed you
				break;
			case "2030":
				SpaceBranch.GoToSpaceBranch("Launchpad");
				break;
		}
	}
}