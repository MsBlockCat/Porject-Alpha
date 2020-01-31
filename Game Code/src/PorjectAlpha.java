public class PorjectAlpha
{
	public static void main(String[] args)
	{
		//Calibration Screen
		Stuff.ScreenSizeRecommendation();
		
		//Studio Animations
		StudioAnimations.FalconCoLtd();
		Stuff.Wait(1000);
		StudioAnimations.DigoEntertainment();
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
			Stuff.TypeLine("(Load) Load from a save code");
			TitleScreenPlayerChoice = Stuff.AwesomeScanner.nextLine().toLowerCase();
			
			switch (TitleScreenPlayerChoice)
			{
				case "play":
					GoToStartingBranch("Beginning");
					StayOnTitleScreen = false;
					break;
			}
		}
		while (StayOnTitleScreen == true);
	}
	
	public static void GoToStartingBranch(String StartingPosition)
	{
		String PlayerLocation = StartingPosition;
		
		switch (PlayerLocation)
		{
			case "Beginning":
				Stuff.TypeLine("The epic quest begins...");
				Stuff.TypeLine("Yes, it begins under a palm tree.");
				Stuff.TypeLine("As you wake up and your vision clears, you see a village.");
				Stuff.TypeLine("Closer yet, you see a launchpad.");
				SpaceBranch.GoToSpaceBranch("Launchpad");
			default:
				System.out.println("Error 3: The starting area of the story, method GoToStartingBranch, was told to go to " + PlayerLocation + ", which isn't a place!");
		}
	}
}