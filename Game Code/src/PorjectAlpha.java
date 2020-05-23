public class PorjectAlpha
{
	public static void Changelog()
	{
		Stuff.HitEnter(50);
		ASCII.ChangelogWindow1();
		Stuff.HitEnter(22);
		Stuff.Wait(1000);
		
		Stuff.HitEnter(50);
		ASCII.ChangelogWindow2();
		Stuff.HitEnter(17);
		Stuff.Wait(350);
		
		Stuff.HitEnter(50);
		ASCII.ChangelogWindow3();
		Stuff.HitEnter(12);
		Stuff.Wait(350);
		
		Stuff.HitEnter(50);
		ASCII.ChangelogWindow4();
		Stuff.HitEnter(7);
		Stuff.Wait(350);
		
		Stuff.HitEnter(50);
		ASCII.ChangelogWindow5();
		Stuff.HitEnter(1);
		ASCII.ChangelogTitle();
		Stuff.Divider();
		
		Stuff.TypeLine("0.0.4a");
		Stuff.TypeLine(" Even more advanced text displaying, tpyo fixes, more ASCII art and more!");
		Stuff.Divider();
		Stuff.TypeLine("0.0.3a");
		Stuff.TypeLine(" Settings menu and the beginnings of ASCII art!");
		Stuff.Divider();
		Stuff.TypeLine("0.0.2a");
		Stuff.TypeLine(" Working credits and save files, and this changelog!");
		Stuff.Divider();
		Stuff.TypeLine("0.0.1a");
		Stuff.TypeLine(" Initial version, with working save codes, a basic storyline, and a mostly functional main menu!");
	}
	
	public static void main(String[] args)
	{
		//Loads save data quietly
		Stuff.LoadSaveFile(true);
		
		if (Stuff.GameBeginning == true)
		{
			//Calibration Screen with first time explanation
			Stuff.ScreenSizeRecommendation(true);
			
			//Initial Settings Menu
			Stuff.SettingsMenu();
			
			//Studio Animations
			StudioAnimations.FalconCoLtd();
			Stuff.Wait(1000);
			StudioAnimations.DigoSonNCo();
			Stuff.Wait(1000);
			StudioAnimations.MattEntertainment();
			Stuff.Wait(1000);
		}
		else
		{
			//Normal Calibration Screen
			Stuff.ScreenSizeRecommendation(false);
		}
		
		//Game Intro Animation
		GameIntro.DaGameIntro();
		Stuff.Wait(1000);
		
		//Title Screen
		Stuff.GameBeginning = false;
		TitleScreen();
	}
	
	public static void TitleScreen()
	{
		boolean StayOnTitleScreen = true;
		String TitleScreenPlayerChoice = null;
		do
		{
			Stuff.HitEnter(50);
			ASCII.TitleTimeinator();
			Stuff.HitEnter(3);
			ASCII.MainTitle();
			Stuff.HitEnter(5);
			Stuff.TypeLine("(New) Start a new game!");
			Stuff.TypeLine("(Save) Makes a save file you can copy and load later!");
			Stuff.TypeLine("(Load) Load from a save file!");
			Stuff.TypeLine("(Debug) Start a new game with the Debug Menu enabled");
			Stuff.TypeLine("(Calibrate) Shows the window calibration screen");
			Stuff.TypeLine("(Settings) Lets you change stuff like typing speed");
			Stuff.TypeLine("(Changelog) Release notes of versions of this game");
			Stuff.TypeLine("(Credits) Shows the credits");
			TitleScreenPlayerChoice = Stuff.AwesomeScanner.nextLine().toLowerCase();
			
			switch (TitleScreenPlayerChoice)
			{
				case "new":
					if (Stuff.CurrentBranchNumber == 0)
					{
						StayOnTitleScreen = false;
						ModernBranch.GoToModernBranch("Lab1");
					}
					else
					{
						Stuff.TypeLine("Are you sure you want to start a new game? All unsaved progress in your current one'll be lost!");
						Stuff.TypeLine("(Yes) Delete unsaved progress and make a new game. This is caps sensitive!");
						Stuff.TypeLine("(Anything else) Keep your progress, don't make a new game, and go back to the main menu");
						if (Stuff.AwesomeScanner.nextLine().equals("Yes"))
						{
							Stuff.ResetSave();
						}
					}
					break;
				case "save":
					Stuff.SaveGame();
					break;
				case "load":
					Stuff.TypeLine("Are you sure you wanna load a save file? This'll erase any current unsaved progress!");
					Stuff.TypeLine("(Yes) Delete any currently unsaved progress and load a save file. This is caps sensitive!");
					Stuff.TypeLine("(Anything else) Keep your progress, don't load a code, and go back to the main menu");
					if (Stuff.AwesomeScanner.nextLine().equals("Yes"))
					{
						if (Stuff.LoadSaveFile() == true)
						{
							Stuff.TypeLine("(Enter) Successfully loaded!");
							Stuff.AwesomeScanner.nextLine();
							switch (Stuff.CurrentBranchNumber)
							{
								case 0:
									break;
								case 1:
									StayOnTitleScreen = false;
									ModernBranch.GoToModernBranch(Stuff.CurrentLocationNumber + "");
									break;
								case 2:
									StayOnTitleScreen = false;
									SpaceBranch.GoToSpaceBranch(Stuff.CurrentLocationNumber + "");
									break;
								case 3:
									StayOnTitleScreen = false;
									GoatBranch.GoToGoatBranch(Stuff.CurrentLocationNumber + "");
									break;
								case 4:
									StayOnTitleScreen = false;
									OldTimeBranch.GoToOldTimeBranch(Stuff.CurrentLocationNumber + "");
									break;
							}
						}
					}
					break;
				case "debug":
					Stuff.DebugMode = true;
					StayOnTitleScreen = false;
					ModernBranch.GoToModernBranch("Lab1");
					break;
				case "calibrate":
					Stuff.ScreenSizeRecommendation(false);
					break;
				case "settings":
					Stuff.SettingsMenu();
					break;
				case "changelog":
					Changelog();
					Stuff.HitEnter(1);
					Stuff.Divider();
					Stuff.TypeLine("(Enter) Return to the main menu");
					Stuff.AwesomeScanner.nextLine();
					break;
				case "credits":
					Stuff.Credits();
					break;
			}
		}
		while (StayOnTitleScreen == true);
	}
}