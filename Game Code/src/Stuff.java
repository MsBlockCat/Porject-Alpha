import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Stuff
{
	//Scanners
	public static Scanner AwesomeScanner = new Scanner(System.in);
	
	//Variables
	public static final String GameVersion = "0.0.1a";
	public static final int CopyrightYear = 2020;
	public static final int SaveVersion = 2;
	public static boolean DebugMode = false;
	public static boolean HasLuckyGauntlet = false;
	public static boolean FancyTyping = true;
	public static int FancyTypingSpeed = 1;
	public static int TurnCount = 0;
	public static boolean GameBeginning = true;
	public static boolean StoryBeginning = true;
	public static int CurrentBranchNumber = 0;
	//The branch is the different classes (ie. SpaceBranch), and the location is the area within the branch (ie. Launchpad)
	public static int CurrentLocationNumber = 0;
	
	//Methods
	public static void HitEnter(int NumberOfEnters)
	{
		for (int Counter = 0; Counter != NumberOfEnters; Counter++)
		{
			System.out.println();
		}
	}
	
	public static void Divider()
	{
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	}
	
	public static void SettingsMenu()
	{
		TypeLine("To change a setting, type the setting's name plus the new setting you wanna change it to.");
		TypeLine("For example, \"Text Speed 2\" would change the speed all the text is written on screen.");
		HitEnter(1);
		Divider();
		Stuff.TypeLine("(Enter) Leave the settings menu.");
		AwesomeScanner.nextLine();
	}
	
	public static void Credits()
	{
		HitEnter(50);
		
		Scanner CreditsScanner = null;
		
		try {
			CreditsScanner = new Scanner(new File("Game Code/Credits.txt"));
		} catch (FileNotFoundException NoFileException) {
			System.out.println("Error 6: Looks like the Credits.txt file isn't in the game code, but it should be!");
			NoFileException.printStackTrace();
		}
		
		while (CreditsScanner.hasNext())
		{
			TypeLine(CreditsScanner.nextLine());
		}
		
		CreditsScanner.close();
		
		Wait(2000);
		HitEnter(1);
		Divider();
		Stuff.TypeLine("(Enter) Leave the credits.");
		AwesomeScanner.nextLine();
	}
	
	public static String MakeSaveCode()
	{
		String FreshSaveCode = "";
		/* Character numbers go in these comments below */
		/* 0 */ FreshSaveCode += SaveVersion;
		/* 1 */ FreshSaveCode += BooleanToInt(DebugMode);
		/* 2 */ FreshSaveCode += BooleanToInt(FancyTyping);
		/* 3 */ FreshSaveCode += BooleanToInt(HasLuckyGauntlet);
		/* 4-6 */ if (TurnCount > 999)
		{
			FreshSaveCode += 999;
		}
		else
		{
			if (TurnCount < 10)
			{
				FreshSaveCode += "00" + TurnCount;
			}
			else
			{
				if (TurnCount < 100)
				{
					FreshSaveCode += "0" + TurnCount;
				}
				else
				FreshSaveCode += TurnCount;
			}
		}
		/* 7 */ FreshSaveCode += CurrentBranchNumber;
		/* 8-10 */ if (CurrentLocationNumber > 999)
		{
			FreshSaveCode += 999;
		}
		else
		{
			if (CurrentLocationNumber < 10)
			{
				FreshSaveCode += "00" + CurrentLocationNumber;
			}
			else
			{
				if (CurrentLocationNumber < 100)
				{
					FreshSaveCode += "0" + CurrentLocationNumber;
				}
				else
				FreshSaveCode += CurrentLocationNumber;
			}
		}
		return FreshSaveCode;
	}
	
	public static boolean LoadSaveCode(String SaveCode)
	{
		if (SaveCode.length() == 0)
		{
			TypeLine("(Enter) Sorry, that's not a save code, it's nothing in fact!");
			AwesomeScanner.nextLine();
			return false;
		}
		else
		{
			if (StringToInt(SaveCode.charAt(0)) == 0)
			{
				TypeLine("(Enter) Sorry, either that's not a save code or it got corrupted!");
				AwesomeScanner.nextLine();
				return false;
			}
			else
			{
				if (StringToInt(SaveCode.charAt(0)) > SaveVersion)
				{
					TypeLine("(Enter) Sorry, this load code uses version " + SaveCode.charAt(0) + ", while we can load at the newest version " + SaveVersion + ". Please update your game!");
					AwesomeScanner.nextLine();
					return false;
				}
				else
				{
					boolean CompatibilityUsed = false;
					
					do
					{
						switch (StringToInt(SaveCode.charAt(0)))
						{
							//Should be reverse compatible with older versions of save codes
							
							//Version 1: 0 = SaveVersion; 1 = DebugMode; 2 = FancyTyping; 3 = HasLuckyGauntlet; 4-6 = TurnCount
							case 1:
								if (SaveCode.length() != 7)
								{
									TypeLine("(Enter) Sorry, either that's not a save code or it got corrupted!");
									AwesomeScanner.nextLine();
									return false;
								}
								else
								{
									SaveCode += "1";
									SaveCode += "001";
									CurrentLocationNumber = 1;
									SaveCode = '2' + SaveCode.substring(1);
									CompatibilityUsed = true;
								}
								break;
							
							//Version 2: 0 = SaveVersion; 1 = DebugMode; 2 = FancyTyping; 3 = HasLuckyGauntlet; 4-6 = TurnCount; 7 = CurrentBranchNumber; 8-10 = CurrentLocationNumber
							case 2:
								if (SaveCode.length() != 11)
								{
									TypeLine("(Enter) Sorry, either that's not a save code or it got corrupted!");
									AwesomeScanner.nextLine();
									return false;
								}
								else
								{
									DebugMode = IntToBoolean(StringToInt(SaveCode.charAt(1)));
									FancyTyping = IntToBoolean(StringToInt(SaveCode.charAt(2)));
									HasLuckyGauntlet = IntToBoolean(StringToInt(SaveCode.charAt(3)));
									TurnCount = StringToInt(SaveCode.substring(4, 7));
									CurrentBranchNumber = StringToInt(SaveCode.charAt(7));
									CurrentLocationNumber = StringToInt(SaveCode.substring(8, 11));
								}
								break;
						}
					}
					while (StringToInt(SaveCode.charAt(0)) != SaveVersion);

					if (CompatibilityUsed)
					{
						TypeLine("Just so you know, your save code was from an older version of the game, so some data was added or may have been reset.");
					}
					
					return true;
				}
			}
		}
	}
	
	public static void ScreenSizeRecommendation(boolean FirstTime)
	{
		HitEnter(50);
		Divider();
		HitEnter(14);
		TypeLine("Please resize your window so the dashes below are just visible, and there's one extra line above the top.");
		System.out.println("                                                   --------");
		System.out.println("                                                   |Center|");
		System.out.println("                                                   --------");
		if (FirstTime == true)
		{
			TypeLine("When options on the left in () are on screen, you can type them and hit enter to choose them.");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("  \\./");
		}
		else
		{
			Stuff.HitEnter(4);
		}
		TypeLine("(Enter) Go to the main menu of Porject Alpha");
		HitEnter(9);
		System.out.print("--------------------------------------------------------------------------------------------------------------");
		AwesomeScanner.nextLine();
	}
	
	public static int StringToInt(char Number)
	{
		return StringToInt(Number + "");
	}
	
	public static int StringToInt(String Number)
	{
		while (Number.length() != 1)
		{
			if (Number.startsWith("0"))
			{
				Number = Number.substring(1);
			}
		}
		
		for (int Cursor = 0; Cursor < Number.length(); Cursor ++)
		{
			if (!Character.isDigit(Number.charAt(Cursor)))
			{
				System.out.println("Error 1: Sorry, something went wrong, StringToInt was given " + Number + ", while the accepted value is an integer in the String variable type.");
				return 0;
			}
		}
		
		return Integer.parseInt(Number);
	}
	
	public static int BooleanToInt(Boolean TheBoolean)
	{
		if (TheBoolean == true)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public static boolean IntToBoolean(int TheBoolean)
	{
		if (TheBoolean == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Can have 1 to 4 options for the player
	public static String PlayerChoice(String Choice1)
	{
		return PlayerChoice(Choice1, null, null, null);
	}
	
	public static String PlayerChoice(String Choice1, String Choice2)
	{
		return PlayerChoice(Choice1, Choice2, null, null);
	}

	public static String PlayerChoice(String Choice1, String Choice2, String Choice3)
	{
		return PlayerChoice(Choice1, Choice2, Choice3, null);
	}
	
	public static String PlayerChoice(String Choice1, String Choice2, String Choice3, String Choice4)
	{
		HitEnter(1);
		Divider();
		if (Choice1 == null)
		{
			System.out.println("Error 2: Sorry, something went wrong, we almost just tried to give you a choice with no options!");
			return null;
		}
		else
		{
			switch (RandomInt(1, 3))
			{
				case 1:
					Type("You can choose ");
					break;
				case 2:
					Type("You can decide between ");
					break;
				case 3:
					Type("Your options seem to be ");
					break;
				default:
					Type("Your options seem to be ");
					break;
			}
			
			Type(Choice1);
			
			if (Choice2 != null)
			{
				if (Choice3 != null)
				{
					Type(", ");
				}
				else
				{
					Type(" or ");
				}
				Type(Choice2);
			}
			
			if (Choice3 != null)
			{
				if (Choice4 != null)
				{
					Type(", ");
				}
				else
				{
					Type(", or ");
				}
				Type(Choice3);
			}
			
			if (Choice4 != null)
			{
				Type(", or " + Choice4);
			}
			
			System.out.println(".");
			if (CurrentBranchNumber == 1 && CurrentLocationNumber == 1)
			{
				TypeLine("(Menu) Also, you can always go to the main menu. You can save your progress there.");
			}
			else
			{
				Type("(Menu) You may also go to the main menu. ");
				
				switch (RandomInt(1,4))
				{
					case 1:
						TypeLine("You can save your progress there.");
						break;
					case 2:
						TypeLine("Legends say it's a good place to save your progress, whatever that means.");
						break;
					case 3:
						TypeLine("That's a good place to save your progress.");
						break;
					case 4:
						TypeLine("You'll find it's a good spot to save your progress.");
						break;
				}
			}
			HitEnter(1);
			
			String Choice;
			if (Choice2 == null)
			{
				do
				{
					PotentialDebugMenu();
					Choice = AwesomeScanner.nextLine().toLowerCase();
				}
				while (!Choice.equals(Choice1.toLowerCase()) && !Choice.equals("menu"));
			}
			else
			{
				if (Choice3 == null)
				{
					do
					{
						PotentialDebugMenu();
						Choice = AwesomeScanner.nextLine().toLowerCase();
					}
					while (!Choice.equals(Choice1.toLowerCase()) && !Choice.equals(Choice2.toLowerCase()) && !Choice.equals("menu"));
				}
				else
				{
					if (Choice4 == null)
					{
						do
						{
							PotentialDebugMenu();
							Choice = AwesomeScanner.nextLine().toLowerCase();
						}
						while (!Choice.equals(Choice1.toLowerCase()) && !Choice.equals(Choice2.toLowerCase()) && !Choice.equals(Choice3.toLowerCase()) && !Choice.equals("menu"));
					}
					else
					{
						do
						{
							PotentialDebugMenu();
							Choice = AwesomeScanner.nextLine().toLowerCase();
						}
						while (!Choice.equals(Choice1.toLowerCase()) && !Choice.equals(Choice2.toLowerCase()) && !Choice.equals(Choice3.toLowerCase()) && !Choice.equals(Choice4.toLowerCase()) && !Choice.equals("menu"));
					}
				}
			}
			
			if (Choice.equals("menu"))
			{
				PorjectAlpha.TitleScreen();
				return Choice;
			}
			else
			{
				switch (RandomInt(1, 3))
				{
					case 1:
						TypeLine(Choice + " it is.");
						break;
					case 2:
						TypeLine("Very well, " + Choice + " it is.");
						break;
					case 3:
						TypeLine("You chose " + Choice + ".");
						break;
				}
				TurnCount ++;
				return Choice;
			}
		}
	}
	
	public static void PotentialDebugMenu()
	{
		if (DebugMode == true)
		{
			Divider();
			TypeLine("Debug Menu");
			HitEnter(5);
			TypeLine("GameVersion: " + GameVersion);
			TypeLine("HasGauntlet: " + HasLuckyGauntlet);
			TypeLine("TurnCount: " + TurnCount);
			HitEnter(5);
		}
	}
	
	public static void typeln(String Phrase)
	{
		TypeLine(Phrase);
	}
	
	public static void TypeLine(String Phrase)
	{
	    Type(Phrase);
	    System.out.println();
	}
	
	public static void type(String Phrase)
	{
		Type(Phrase);
	}
	
	public static void Type(String Phrase)
	{
		if (FancyTyping == true)
		{
			for (int Counter = 0; Counter < Phrase.length(); Counter++)
			{
				System.out.print(Phrase.charAt(Counter));
				if (Phrase.charAt(Counter) == '!' || Phrase.charAt(Counter) == '.' || Phrase.charAt(Counter) == '?' || Phrase.charAt(Counter) == ';' || Phrase.charAt(Counter) == ':')
				{
					Wait(105 + (FancyTypingSpeed * 50));
				}
				
				if (Phrase.charAt(Counter) == ',')
				{
					Wait(40 + (FancyTypingSpeed * 25));
				}
				
				Wait(15 + (FancyTypingSpeed * 10));
			}
		}
		else
		{
			System.out.print(Phrase);
		}
	}
	
	public static int RandomInt()
	{
		return RandomInt(1, 10);
	}
	
	public static int RandomInt(int MinimumInt, int MaximumInt)
	{
		return (((int) (Math.random() * (MaximumInt + MinimumInt))) + 1 - MinimumInt);
	}
	
	public static void Wait(int Milliseconds)
	{
		try
		{
			Thread.sleep(Milliseconds);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}