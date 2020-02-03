public class OldTimeBranch
{
	public static void GoToOldTimeBranch(String StartingPosition)
	{
		Stuff.CurrentBranchNumber = 4;
		switch (StartingPosition)
		{
			case "OuterVillage1":
			case "1":
				OuterVillage1();
				break;
			default:
				System.out.println("Error 6: The starting area of the old time branch of the story, method GoToOldTimeBranch, was told to go to " + StartingPosition + ", which isn't a place!");
		}
	}
	
	public static void OuterVillage1()
	{
		Stuff.CurrentLocationNumber = 1;
		Stuff.TypeLine("You travel back to the year 1253.");
		switch (Stuff.PlayerChoice("eating the banana", "nuking North Korea", "skiing", "going on the Klondike"))
		{
			case "eating the banana":
				break;
			case "nuking north korea":
				break;
			case "skiing":
				break;
			case "going on the klondike":
				break;
		}
	}
}