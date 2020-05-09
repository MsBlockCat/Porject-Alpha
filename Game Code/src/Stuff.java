import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Stuff
{
	//Scanners
	public static Scanner AwesomeScanner = new Scanner(System.in);
	
	//Variables
	public static final String GameVersion = "0.0.4a";
	public static final int CopyrightYear = 2020;
	public static final int SaveVersion = 3;
	public static boolean DebugMode = false;
	public static int FancyTypingSpeed = 1;
	public static int TurnCount = 0;
	public static boolean GameBeginning = true;
	public static boolean StoryBeginning = true;
	public static int CurrentBranchNumber = 0;
	//The branch is the different classes, or story branches (ie. SpaceBranch), and the location is the area within the story branch (ie. Launchpad)
	public static int CurrentLocationNumber = 0;
	public static boolean HasLuckyGauntlet = false;
	
	//Miscellaneous weirdness
	Desktop AwesomeDesktop = Desktop.getDesktop();
	
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
		//That's 110 dashes, so 55 characters gives you the middle
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	}
	
	public static void PotentialDebugMenu()
	{
		if (DebugMode == true)
		{
			Divider();
			TypeLine("Debug Menu");
			HitEnter(3);
			TypeLine("GameVersion: " + GameVersion);
			TypeLine("HasGauntlet: " + HasLuckyGauntlet);
			TypeLine("TurnCount: " + TurnCount);
			TypeLine("CurrentBranchNumber: " + CurrentBranchNumber);
			TypeLine("CurrentLocationNumber: " + CurrentLocationNumber);
			HitEnter(2);
		}
	}
	
	public static void ScreenSizeRecommendation(boolean FirstTime)
	{
		//50 enters standard as a buffer
		HitEnter(50);
		//40 lines on screen
		Divider();
		HitEnter(4);
		ASCII.CalibrationScreen();
		HitEnter(5);
		System.out.println("Please resize your window so the dashes below are just visible, and there's one extra line above the top.");
		System.out.println("                                                   --------");
		System.out.println("                                                   | Cen  |");
		System.out.println("                                                   |  ter |");
		System.out.println("                                                   --------");
		HitEnter(6);
		if (FirstTime == true)
		{
			System.out.println("When options on the left in () are on screen, you can type them and hit enter to choose them.");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("  \\./");
		}
		else
		{
			Stuff.HitEnter(4);
		}
		TypeLine("(Enter) Go to the main menu of Porject Alpha");
		HitEnter(6);
		System.out.print("--------------------------------------------------------------------------------------------------------------");
		AwesomeScanner.nextLine();
	}
	
	public static void SettingsMenu()
	{
		String Input = "";
		do
		{
			HitEnter(50);
			ASCII.SettingsGear2();
			HitEnter(22);
			Wait(1000);
			
			HitEnter(50);
			ASCII.SettingsGear1();
			HitEnter(17);
			Wait(350);
			
			HitEnter(50);
			ASCII.SettingsGear2();
			HitEnter(12);
			Wait(350);
			
			HitEnter(50);
			ASCII.SettingsGear1();
			HitEnter(7);
			Wait(350);
			
			HitEnter(50);
			ASCII.SettingsGear2();
			HitEnter(1);
			ASCII.SettingsTitle();
			Divider();
			
			TypeLine("To change a setting, type the setting's name plus the new setting you wanna change it to.");
			TypeLine("For example, \"Text Speed 2\" would change the speed all the text is written on screen.");
			Divider();
			HitEnter(1);
			TypeLine("Text Speed: 0, 1, 2, or 3 (Currently " + FancyTypingSpeed + ")");
			TypeLine(" This is how fast text shows up on screen. 0 makes it instant, 3 is slowest.");
			TypeLine("(Enter) Leave the settings menu.");
			
			Input = AwesomeScanner.nextLine().toLowerCase();
			
			//FancyTypingSpeed
			if (Input.length() == 12 && Input.startsWith("text speed "))
			{
				if (!(Input.charAt(11) == '0' || Input.charAt(11) == '1' || Input.charAt(11) == '2' || Input.charAt(11) == '3'))
				{
					TypeLine("(Enter) Text Speed can be set to 0, 1, 2, or 3.");
					AwesomeScanner.nextLine();
				}
				else
				{
					Type("(Enter) Your Text Speed went from " + FancyTypingSpeed);
					FancyTypingSpeed = StringToInt(Input.charAt(11) + "");
					TypeLine(" to " + FancyTypingSpeed + ".");
					AwesomeScanner.nextLine();
				}
			}
		}
		while (Input.length() != 0);
	}
	
	public static void Credits()
	{
		HitEnter(50);
		
		Scanner CreditsScanner = null;
		
		try {
			CreditsScanner = new Scanner(new File("Credits.txt"));
		} catch (FileNotFoundException NoFileException) {
			System.out.println("Error 6: Looks like the \"Game Code/Credits.txt\" file isn't in the game code, but it should be!");
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
	
	public static void SaveGame()
	{
		File SaveFile = new File("Saves/Save.txt");
		  
		try
		{
			//Creates or locks into the save file
			if (SaveFile.createNewFile())
			{
			    System.out.println("A new save file was created! You can find it at \"Game Code/Saves/Save.txt\".");
			}
			else
			{
			    System.out.println("A save file already exists, saving to it...");
			}
			 
			//Saves to the save file
			FileWriter SaveFileWriter = new FileWriter(SaveFile, false);
			SaveFileWriter.write(SaveVersion + "\n" + BooleanToInt(DebugMode) + "\n" + FancyTypingSpeed + "\n" + TurnCount + "\n" + BooleanToInt(GameBeginning) + "\n" + BooleanToInt(StoryBeginning) + "\n" + CurrentBranchNumber + "\n" + CurrentLocationNumber + "\n" + BooleanToInt(HasLuckyGauntlet));
			SaveFileWriter.close();
			TypeLine("(Enter) Save successful! Hit enter and we'll open the folder for you to copy your save file if you'd like.");
			AwesomeScanner.nextLine();
			
			Desktop AwesomeDesktop = Desktop.getDesktop();
			File FolderToOpen = null;
			try
			{
				FolderToOpen = new File("Saves");
				AwesomeDesktop.open(FolderToOpen);
			}
			catch (IllegalArgumentException IAE)
			{
				System.out.println("Error 8: The save file's folder (at \"Game Code/Saves\") wasn't found!");
			}
		}
		catch (IOException IOException)
		{
			System.out.println("Error 7: There was an IOException when saving your game.");
			IOException.printStackTrace();
		}
	}
	
	public static void ResetSave()
	{
		File SaveFile = new File("Saves/Save.txt");
		File DefaultSaveFile = new File("Default Save.txt");
		
		try
		{
			FileWriter SaveFileWriter = new FileWriter(SaveFile, false);
			
			try
			{
				Scanner DefaultSaveFileScanner = new Scanner(DefaultSaveFile);
				while (DefaultSaveFileScanner.hasNextLine())
				{
					SaveFileWriter.write(DefaultSaveFileScanner.nextLine() + "\n");
				}
				DefaultSaveFileScanner.close();
			}
			catch (FileNotFoundException NoDefaultSaveFileException)
			{
				TypeLine("Something went wrong: There's no default save file (at \"Game Code/Default Save.txt\") to load!");
			}
			
			SaveFileWriter.close();
		}
		catch (IOException NoSaveFileException)
		{
			TypeLine("Sorry, but there's no save file (at \"Game Code/Saves/Save.txt\") to reset!)");
		}
		
	}
	
	public static boolean LoadSaveFile()
	{
		return LoadSaveFile(false);
	}
	
	public static boolean LoadSaveFile(boolean BeQuiet)
	{
		File SaveFile = new File("Saves/Save.txt");
		
		try
		{
			Scanner AwesomeFile = new Scanner(SaveFile);
			
			int FileSaveVersion = StringToInt(AwesomeFile.nextLine());
			
			if (FileSaveVersion < 3)
			{
				if (BeQuiet == false)
				{
					TypeLine("(Enter) Sorry, either that's not a save file or it got corrupted!");
					AwesomeScanner.nextLine();
				}
				AwesomeFile.close();
				return false;
			}
			else
			{
				if (FileSaveVersion > SaveVersion)
				{
					if (BeQuiet == false)
					{
						TypeLine("(Enter) Sorry, this save file uses version " + FileSaveVersion + ", while we can load at the newest version " + SaveVersion + ". Please update your game!");
						AwesomeScanner.nextLine();
					}
					AwesomeFile.close();
					return false;
				}
				else
				{
					DebugMode = IntToBoolean(StringToInt(AwesomeFile.nextLine()));
					FancyTypingSpeed = StringToInt(AwesomeFile.nextLine());
					TurnCount = StringToInt(AwesomeFile.nextLine());
					GameBeginning = IntToBoolean(StringToInt(AwesomeFile.nextLine()));
					StoryBeginning = IntToBoolean(StringToInt(AwesomeFile.nextLine()));
					CurrentBranchNumber = StringToInt(AwesomeFile.nextLine());
					HasLuckyGauntlet = IntToBoolean(StringToInt(AwesomeFile.nextLine()));
					
					if ((SaveVersion > FileSaveVersion) && (BeQuiet == false))
					{
						TypeLine("(Enter) Just so you know, your save file was from an older version of this game, so some stuff was added or may have been reset.");
						AwesomeScanner.nextLine();
					}

					AwesomeFile.close();
					return true;
				}
			}
		}
		catch (FileNotFoundException NoSaveFileException)
		{
			if (BeQuiet == false)
			{
				TypeLine("You tried to load a save, but there's no save file (at \"Game Code/Saves/Save.txt\") to load!)");
			}
			return false;
		}
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
					Type("Your choices seem to be ");
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
		if (FancyTypingSpeed != 0)
		{
			for (int Counter = 0; Counter < Phrase.length(); Counter++)
			{
				System.out.print(Phrase.charAt(Counter));
				if (Phrase.charAt(Counter) == '!' || Phrase.charAt(Counter) == '.' || Phrase.charAt(Counter) == '?' || Phrase.charAt(Counter) == ';' || Phrase.charAt(Counter) == ':')
				{
					boolean Gloss = false;
					
					if (Phrase.charAt(Counter) == '.' && !(Counter == Phrase.length() - 1))
					{
						if (Phrase.charAt(Counter + 1) != ' ')
						{
							Gloss = true;
						}
						
						if (!(Counter == 0 || Counter == 1 || Counter == 2))
						{
							if ((Phrase.substring(Counter - 2, Counter).toLowerCase().equals("mr")) || (Phrase.substring(Counter - 2, Counter).toLowerCase().equals("ms")) || (Phrase.substring(Counter - 2, Counter).toLowerCase().equals("dr")))
							{
								Gloss = true;
							}
						}
						
						if (!(Counter == 0 || Counter == 1 || Counter == 2 || Counter == 3))
						{
							if ((Phrase.substring(Counter - 2, Counter).toLowerCase().equals("mrs")))
							{
								Gloss = true;
							}
						}
					}
					
					if (!(Gloss))
					{
						Wait(95 + (FancyTypingSpeed * 60));
					}
				}
				
				if (Phrase.charAt(Counter) == ',')
				{
					Wait(30 + (FancyTypingSpeed * 30));
				}
				
				Wait(5 + (FancyTypingSpeed * 15));
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
		catch (InterruptedException Exception)
		{
			Exception.printStackTrace();
		}
	}
}