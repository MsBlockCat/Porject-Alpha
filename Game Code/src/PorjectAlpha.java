public class PorjectAlpha
{
	public static void Changelog()
	{
		if (Stuff.QuickMenus == false)
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
		}
		
		Stuff.HitEnter(50);
		ASCII.ChangelogWindow5();
		Stuff.HitEnter(1);
		ASCII.ChangelogTitle();
		Stuff.Divider();
		
		if (Stuff.QuickMenus == true)
		{
			Stuff.TempInstantText = true;
		}
		
		Stuff.TypeLine("0.1.0a (5/25/2020)");
		Stuff.TypeLine(" More story and ASCII, game intro and studio animations, lots of bugfixes, a new About menu, and lots more!");
		Stuff.Divider();
		Stuff.TypeLine("0.0.4a (2/14/2020)");
		Stuff.TypeLine(" Even more advanced text displaying, tpyo fixes, more ASCII art and more!");
		Stuff.Divider();
		Stuff.TypeLine("0.0.3a (2/14/2020)");
		Stuff.TypeLine(" Settings menu and the beginnings of ASCII art!");
		Stuff.Divider();
		Stuff.TypeLine("0.0.2a (2/14/2020)");
		Stuff.TypeLine(" Working credits and save files, and this changelog!");
		Stuff.Divider();
		Stuff.TypeLine("0.0.1a (2/13/2020)");
		Stuff.TypeLine(" Initial version, with working save codes, a basic storyline, and a mostly functional main menu!");
		
		if (Stuff.QuickMenus == true)
		{
			Stuff.TempInstantText = false;
		}
	}
	
	public static void main(String[] args)
	{
		//Loads save data quietly
		Stuff.LoadSaveFile(true);
		
		//Calibration Screen, with first time directions if needed
		Stuff.ScreenSizeRecommendation();
		
		if (Stuff.GameBeginning == true)
		{
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
			if (Stuff.QuickMenus == true)
			{
				Stuff.TempInstantText = true;
			}
			
			Stuff.HitEnter(50);
			ASCII.TitleTimeinator();
			Stuff.HitEnter(3);
			ASCII.MainTitle();
			Stuff.HitEnter(1);
			System.out.println("                                                    © " + Stuff.CopyrightYear);
			Stuff.HitEnter(3);
			Stuff.Wait(500);
			
			if (Stuff.CurrentBranchNumber != 0)
			{
				Stuff.TypeLine("(Continue) Continue on your adventure!");
			}
			Stuff.TypeLine("(New) Start a new game!");
			Stuff.TypeLine("(Save) Makes a save file you can copy and load later!");
			Stuff.TypeLine("(Load) Load from a save file!");
			Stuff.TypeLine("(Debug) Start a new game with the Debug Menu enabled");
			Stuff.TypeLine("(Calibrate) Shows the window calibration screen");
			Stuff.TypeLine("(Settings) Lets you change stuff like typing speed");
			Stuff.TypeLine("(About) Shows Porject Alpha's version number, credits, and more");
			Stuff.HitEnter(1);
			
			if (Stuff.QuickMenus == true)
			{
				Stuff.TempInstantText = false;
			}
			
			TitleScreenPlayerChoice = Stuff.AwesomeScanner.nextLine().toLowerCase();
			
			switch (TitleScreenPlayerChoice)
			{
				case "continue":
					if (Stuff.CurrentBranchNumber != 0)
					{
						Stuff.TempInstantText = true;
						StayOnTitleScreen = false;
						switch (Stuff.CurrentBranchNumber)
						{
							case 1:
								ModernBranch.GoToModernBranch(Stuff.CurrentLocationNumber + "");
								break;
							case 2:
								SpaceBranch.GoToSpaceBranch(Stuff.CurrentLocationNumber + "");
								break;
							case 3:
								GoatBranch.GoToGoatBranch(Stuff.CurrentLocationNumber + "");
								break;
							case 4:
								OldTimeBranch.GoToOldTimeBranch(Stuff.CurrentLocationNumber + "");
								break;
						}
					}
					break;
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
						Stuff.HitEnter(1);
						if (Stuff.AwesomeScanner.nextLine().equals("Yes"))
						{
							Stuff.ResetSave();
							
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
				case "save":
					Stuff.SaveGame();
					break;
				case "load":
					Stuff.TypeLine("Are you sure you wanna load a save file? This'll erase any current unsaved progress!");
					Stuff.TypeLine("(Yes) Delete any currently unsaved progress and load a save file. This is caps sensitive!");
					Stuff.TypeLine("(Anything else) Keep your progress, don't load a code, and go back to the main menu");
					Stuff.HitEnter(1);
					if (Stuff.AwesomeScanner.nextLine().equals("Yes"))
					{
						if (Stuff.LoadSaveFile() == true)
						{
							Stuff.TypeLine("(Enter) Successfully loaded!");
							Stuff.HitEnter(1);
							Stuff.AwesomeScanner.nextLine();
							switch (Stuff.CurrentBranchNumber)
							{
								case 0:
									break;
								case 1:
									StayOnTitleScreen = false;
									Stuff.TempInstantText = true;
									ModernBranch.GoToModernBranch(Stuff.CurrentLocationNumber + "");
									break;
								case 2:
									StayOnTitleScreen = false;
									Stuff.TempInstantText = true;
									SpaceBranch.GoToSpaceBranch(Stuff.CurrentLocationNumber + "");
									break;
								case 3:
									StayOnTitleScreen = false;
									Stuff.TempInstantText = true;
									GoatBranch.GoToGoatBranch(Stuff.CurrentLocationNumber + "");
									break;
								case 4:
									StayOnTitleScreen = false;
									Stuff.TempInstantText = true;
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
					Stuff.ScreenSizeRecommendation();
					break;
				case "settings":
					Stuff.SettingsMenu();
					break;
				case "about":
					Stuff.AboutMenu();
					break;
			}
		}
		while (StayOnTitleScreen == true);
	}
}