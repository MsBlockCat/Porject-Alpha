import java.lang.*;

public class CommonStuff
{
	//Variables
	public static String GameVersion = "0.0.0a";
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
	
	public static void PlayerChoice(String Choice1, String Choice2, String Choice3, String Choice4)
	{
		//Insert code here showing non caps sensitive options you can type
		//And have alternate methods that go to this with nulls, ie. only two inputted strings gives this those and then two nulls
		
		if (DebugMode == true)
		{
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("Debug menu");
			HitEnter(5);
			System.out.println("HasGauntlet: " + HasLuckyGauntlet);
			System.out.println("TurnCount: " + TurnCount);
		}
	}
	
	public static void type(String Phrase)
	{
		for (int Counter = 0; Counter < Phrase.length(); Counter++)
		{
			System.out.print(Phrase.charAt(i));
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
	
	public static void typeln(String Phrase)
	{
	    type(Phrase);
	    System.out.println("");
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