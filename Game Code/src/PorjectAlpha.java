public class PorjectAlpha
{
	public static void main(String[] args)
	{
		//Calibration Screen
		Stuff.ScreenSizeRecommendation();
		
		//Studio Animations
		StudioAnimations.FalconCoLtd();
		Stuff.Wait(1000);
		StudioAnimations.RodrigoStudio();
		Stuff.Wait(1000);
		StudioAnimations.MattEntertainment();
		Stuff.Wait(1000);
		StudioAnimations.JosephEntertainment();
		Stuff.Wait(1000);
		
		//Game Intro Animation
		GameIntro.DaGameIntro();
		TitleScreen();
	}
	
	public static void TitleScreen()
	{
		boolean StayOnTitleScreen = true;
		String TitleScreenPlayerChoice = null;
		do
		{
			Stuff.HitEnter(32);
			Stuff.TypeLine("(Play) Start a new game!");
			Stuff.TypeLine("(Save) Makes a save code you can copy and load later!");
			Stuff.TypeLine("(Load) Load from a save code!");
			Stuff.TypeLine("(Debug) Start a new game with the Debug Menu enabled");
			Stuff.TypeLine("(Changelog) Release notes of versions of this game");
			Stuff.TypeLine("(Credits) Shows the credits");
			TitleScreenPlayerChoice = Stuff.AwesomeScanner.nextLine().toLowerCase();
			
			switch (TitleScreenPlayerChoice)
			{
				case "play":
					StayOnTitleScreen = false;
					GoToLabBranch("Beginning");
					break;
				case "save":
					Stuff.TypeLine("Here's your save code: " + Stuff.MakeSaveCode());
					Stuff.AwesomeScanner.nextLine();
					break;
				case "load":
					Stuff.TypeLine("Please enter a save code below (Game save code version " + Stuff.SaveVersion + "):");
					if (Stuff.LoadSaveCode(Stuff.AwesomeScanner.nextLine()) == true)
					{
						StayOnTitleScreen = false;
						switch (Stuff.CurrentBranchNumber)
						{
							case 1:
								GoToLabBranch(Stuff.CurrentLocationNumber + "");
								break;
							case 2:
								SpaceBranch.GoToSpaceBranch(Stuff.CurrentLocationNumber + "");
								break;
							case 3:
								MattBranch.GoToMattBranch(Stuff.CurrentLocationNumber + "");
								break;
							case 4:
								OldTimeBranch.GoToOldTimeBranch(Stuff.CurrentLocationNumber + "");
								break;
						}
					}
					break;
				case "debug":
					Stuff.DebugMode = true;
					StayOnTitleScreen = false;
					GoToLabBranch("Beginning");
					break;
			}
		}
		while (StayOnTitleScreen == true);
	}
	
	public static void GoToLabBranch(String StartingPosition)
	{
		Stuff.CurrentBranchNumber = 1;
		String PlayerLocation = StartingPosition;
		
		switch (PlayerLocation)
		{
			case "Beginning":
			case "1":
				Stuff.TypeLine("The epic quest begins...");
				Stuff.TypeLine("Yes, it begins under the harsh light of a labratory.");
				Stuff.TypeLine("You're the assistant to Dr. Heinz Doofenshmirtz, a genius in time travel and teleportation.");
				Stuff.TypeLine("After two decades, Doofenshmirtz finally had a breakthrough with the Timeinator.");
				Stuff.TypeLine("A rat was tested with it and mostly survived.");
				Stuff.TypeLine("As Dr. Doofenshmirtz's assistant, you get to be the first human to test the time machine.");
				Stuff.TypeLine("You pick up the surprisingly small device and place it on your left wrist. It is similar in appearance to a smartwatch.");
				Stuff.TypeLine("Would you like to go back to the old times in the year 1253, in rural Australia in the year 1954, or to space in the year 2030?");
				switch (Stuff.PlayerChoice("1253", "1954", "2030"))
				{
					case "1253":
						OldTimeBranch.GoToOldTimeBranch("OuterVillage1");
					case "1954":
						MattBranch.GoToMattBranch("RuralAustralia1");
					case "2030":
						SpaceBranch.GoToSpaceBranch("Launchpad");
				}
			default:
				System.out.println("Error 3: The starting area of the story, method GoToStartingBranch, was told to go to " + PlayerLocation + ", which isn't a place!");
		}
	}
}