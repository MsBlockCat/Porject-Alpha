import java.util.Scanner;

public class Stuff
{
	//Scanners
	public static Scanner AwesomeScanner = new Scanner(System.in);
	
	//Variables
	public static final String GameVersion = "0.0.0a";
	public static final int CopyrightYear = 2020;
	public static boolean DebugMode = false;
	public static boolean HasLuckyGauntlet = false;
	public static int TurnCount = 0;
	
	//Methods
	public static void HitEnter(int NumberOfEnters)
	{
		for (int Counter = 0; Counter != NumberOfEnters; Counter++)
		{
			System.out.println();
		}
	}
	
	public static void ScreenSizeRecommendation()
	{
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		HitEnter(14);
		TypeLine("Please resize your window so the dashes above are just visible, and there's one extra line below the bottom.");
		System.out.println("                                                   --------");
		System.out.println("                                                   |Center|");
		System.out.println("                                                   --------");
		TypeLine("When options on the left in () are on screen, you can type them and hit enter to choose them.");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("  \\./");
		TypeLine("(Enter) Go to the main menu of Porject Alpha");
		HitEnter(9);
		System.out.print("--------------------------------------------------------------------------------------------------------------");
		AwesomeScanner.nextLine();
	}
	
	public static int StringToInt(String Number)
	{
		switch (Number)
		{
			case "0":
				return 0;
			case "1":
				return 1;
			case "2":
				return 2;
			case "3":
				return 3;
			case "4":
				return 4;
			case "5":
				return 5;
			case "6":
				return 6;
			case "7":
				return 7;
			case "8":
				return 8;
			case "9":
				return 9;
			default:
				System.out.println("Error 1: Sorry, something went wrong, StringToInt was given " + Number + ", while the accepted values are 0-9.");
				return 0;
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
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		if (Choice1 == null)
		{
			System.out.println("Error 2: Sorry, something went wrong, we almost just tried to give you a choice with no options!");
			return null;
		}
		else
		{
			switch (RandomInt(1,4))
			{
				case 1:
					Type("You can choose ");
					break;
				case 2:
					Type("You can decide between ");
					break;
				case 3:
					Type("You can choose ");
					break;
				case 4:
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
			HitEnter(1);
			
			String Choice;
			do
			{
				PotentialDebugMenu();
				Choice = AwesomeScanner.nextLine().toLowerCase();
			}
			while (Choice != Choice1.toLowerCase() && Choice != Choice2.toLowerCase() && Choice != Choice3.toLowerCase() && Choice != Choice4.toLowerCase());
			return Choice;
		}
	}
	
	public static void PotentialDebugMenu()
	{
		if (DebugMode == true)
		{
			System.out.println("--------------------------------------------------------------------------------------------------------------");
			TypeLine("Debug Menu");
			HitEnter(5);
			TypeLine("GameVersion: " + GameVersion);
			TypeLine("HasGauntlet: " + HasLuckyGauntlet);
			TypeLine("TurnCount: " + TurnCount);
			HitEnter(5);
		}
	}
	public static void TypeLine(String Phrase)
	{
	    Type(Phrase);
	    System.out.println();
	}
	
	public static void Type(String Phrase)
	{
		for (int Counter = 0; Counter < Phrase.length(); Counter++)
		{
			System.out.print(Phrase.charAt(Counter));
			if (Phrase.charAt(Counter) == '!' || Phrase.charAt(Counter) == '.' || Phrase.charAt(Counter) == '?' || Phrase.charAt(Counter) == ';' || Phrase.charAt(Counter) == ':')
			{
			Wait(215);
			}
			
			if (Phrase.charAt(Counter) == ',')
			{
				Wait(90);
			}
			
			Wait(35);
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