public class MattBranch
{
	public static void GoToMattBranch(String StartingPosition)
	{
		Stuff.CurrentBranchNumber = 3;
		switch (StartingPosition)
		{
			case "RuralAustralia1":
			case "1":
				RuralAustralia1();
				break;
			default:
				System.out.println("Error 5: The starting area of the Matt branch of the story, method GoToMattBranch, was told to go to " + StartingPosition + ", which isn't a place!");
		}
	}
	
	public static void RuralAustralia1()
	{
		Stuff.CurrentLocationNumber = 1;
		Stuff.TypeLine("You travel back to the year 1954.");
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