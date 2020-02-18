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
	public static int TextXCursor = 0;
	public static int TextYCursor = 0;
	public static boolean DebugMode = false;
	public static int FancyTypingSpeed = 1;
	public static int TurnCount = 0;
	public static boolean GameBeginning = true;
	public static boolean StoryBeginning = true;
	public static int CurrentBranchNumber = 0;
	//The branch is the different classes (ie. SpaceBranch), and the location is the area within the branch (ie. Launchpad)
	public static int CurrentLocationNumber = 0;
	public static boolean HasLuckyGauntlet = false;
	
	//Arrays
	public static char[][] Display = new char[150][40];
	
	//Miscellaneous weirdness
	Desktop AwesomeDesktop = Desktop.getDesktop();
	
	//Methods
	public static void HitEnter(int NumberOfEnters)
	{
		for (int Counter = 0; Counter != NumberOfEnters; Counter ++)
		{
			TextYCursor ++;
		    TextXCursor = 0;
		    
		    if (TextYCursor >= 150)
		    {
		    	TextYCursor = 0;
		    	TypeLine(0, "Error 9: TextYCursor got to 150!");
		    }
		}
	}
	
	public static void Divider()
	{
		//That's 110 dashes, so 55 characters gives you the middle
		TypeLine(0, "--------------------------------------------------------------------------------------------------------------");
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
			Stuff.TypeLine("(Enter) Leave the settings menu.");
			
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
			CreditsScanner = new Scanner(new File("Game Code/Credits.txt"));
		} catch (FileNotFoundException NoFileException) {
			TypeLine(0, "Error 6: Looks like the Credits.txt file isn't in the game code, but it should be!");
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
		TypeLine("(Enter) Leave the credits.");
		AwesomeScanner.nextLine();
	}
	
	public static void MakeSaveCode()
	{
		File SaveFile = new File("Game Code/Saves/Save.txt");
		  
		try
		{
			//Creates or locks into the save file
			if (SaveFile.createNewFile())
			{
			    TypeLine(0, "A new save file was created! You can find it at \"Game Code/Saves/Save.txt\".");
			}
			else
			{
			    TypeLine(0, "A save file already exists, saving to it...");
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
				FolderToOpen = new File("Game Code/Saves");
				AwesomeDesktop.open(FolderToOpen);
			}
			catch (IllegalArgumentException IAE)
			{
				TypeLine(0, "Error 8: The save file's folder (at \"Game Code/Saves\") wasn't found!");
			}
		}
		catch (IOException IOException)
		{
			TypeLine(0, "Error 7: There was an IOException when saving your game.");
			IOException.printStackTrace();
		}
	}
	
	public static boolean LoadSaveCode()
	{
		File SaveFile = new File("Game Code/Saves/Save.txt");
		
		try
		{
			Scanner AwesomeFile = new Scanner(SaveFile);
			
			int FileSaveVersion = StringToInt(AwesomeFile.nextLine());
			
			if (FileSaveVersion < 3)
			{
				TypeLine("(Enter) Sorry, either that's not a save code or it got corrupted!");
				AwesomeScanner.nextLine();
				AwesomeFile.close();
				return false;
			}
			else
			{
				if (FileSaveVersion > SaveVersion)
				{
					TypeLine("(Enter) Sorry, this load code uses version " + FileSaveVersion + ", while we can load at the newest version " + SaveVersion + ". Please update your game!");
					AwesomeScanner.nextLine();
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
					
					if (SaveVersion > FileSaveVersion)
					{
						TypeLine("(Enter) Just so you know, your save code was from an older version of the game, so some stuff was added or may have been reset.");
						AwesomeScanner.nextLine();
					}

					AwesomeFile.close();
					return true;
				}
			}
		}
		catch (FileNotFoundException NoSaveFileException)
		{
			TypeLine("You tried to load a save, but there's no save file (at \"Game Code/Saves/Save.txt\") to load!)");
			return false;
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
		TypeLine(0, "Please resize your window so the dashes below are just visible, and there's one extra line above the top.");
		TypeLine(0, "                                                   --------");
		TypeLine(0, "                                                   | Cen  |");
		TypeLine(0, "                                                   |  ter |");
		TypeLine(0, "                                                   --------");
		HitEnter(6);
		if (FirstTime == true)
		{
			TypeLine(0, "When options on the left in () are on screen, you can type them and hit enter to choose them.");
			TypeLine(0, "   |");
			TypeLine(0, "   |");
			TypeLine(0, "  \\./");
		}
		else
		{
			Stuff.HitEnter(4);
		}
		TypeLine("(Enter) Go to the main menu of Porject Alpha");
		HitEnter(6);
		Type(0, "--------------------------------------------------------------------------------------------------------------");
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
				TypeLine(0, "Error 1: Sorry, something went wrong, StringToInt was given " + Number + ", while the accepted value is an integer in the String variable type.");
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
			TypeLine(0, "Error 2: Sorry, something went wrong, we almost just tried to give you a choice with no options!");
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
			
			TypeLine(0, ".");
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
	
	public static void typeln(int ThisTypingSpeed, String Phrase)
	{
		TypeLine(ThisTypingSpeed, Phrase);
	}
	
	public static void typeln(int ThisTypingSpeed, String Phrase, int NewXCursor, int NewYCursor)
	{
		TypeLine(ThisTypingSpeed, Phrase, NewXCursor, NewYCursor);
	}
	
	public static void TypeLine(String Phrase)
	{
	    TypeLine(FancyTypingSpeed, Phrase);
	}
	
	public static void TypeLine(int ThisTypingSpeed, String Phrase)
	{
	    TypeLine(ThisTypingSpeed, Phrase, TextXCursor, TextYCursor);
	}
	
	public static void TypeLine(int ThisTypingSpeed, String Phrase, int NewXCursor, int NewYCursor)
	{
	    Type(ThisTypingSpeed, Phrase, NewXCursor, NewYCursor);
	    HitEnter(1);
	}
	
	public static void type(String Phrase)
	{
		Type(Phrase);
	}
	
	public static void type(int ThisTypingSpeed, String Phrase)
	{
		Type(ThisTypingSpeed, Phrase);
	}
	
	public static void type(int ThisTypingSpeed, String Phrase, int NewXCursor, int NewYCursor)
	{
		Type(ThisTypingSpeed, Phrase, NewXCursor, NewYCursor);
	}
	
	public static void Type(String Phrase)
	{
		Type(FancyTypingSpeed, Phrase);
	}
	
	public static void Type(int ThisTypingSpeed, String Phrase)
	{
		Type(ThisTypingSpeed, Phrase, TextXCursor, TextYCursor);
	}
	
	public static void Type(int ThisTypingSpeed, String Phrase, int NewXCursor, int NewYCursor)
	{
		TextXCursor = NewXCursor;
		TextYCursor = NewYCursor;
		
		for (int Counter = 0; Counter < Phrase.length(); Counter++)
		{
			Display[TextXCursor][TextYCursor] = Phrase.charAt(Counter);
			TextXCursor ++;
			Render();
			
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
				
				if (!(Gloss) && ThisTypingSpeed != 0)
				{
					Wait(95 + (ThisTypingSpeed * 60));
				}
			}
			
			if (Phrase.charAt(Counter) == ',' && ThisTypingSpeed != 0)
			{
				Wait(30 + (ThisTypingSpeed * 30));
			}
			
			if (ThisTypingSpeed != 0)
			{
				Wait(5 + (ThisTypingSpeed * 15));
			}
		}
	}
	
	public static void Render()
	{
		//Clears the console before re-rendering
		for (int Counter = 1; Counter <= 50; Counter ++)
		{
			System.out.println();
		}
		//Test: System.out.flush();
		
		//Renders!
		for (int YCounter = 0; YCounter < 40; YCounter ++)
		{
			for (int XCounter = 0; XCounter < 150; XCounter ++)
			{
				System.out.print(Display[XCounter][YCounter]);
			}
			
			System.out.println();
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