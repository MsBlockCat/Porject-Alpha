public class SpaceBranch
{
	public static void GoToSpaceBranch(String StartingPosition)
	{
		Stuff.CurrentBranchNumber = 2;
		switch (StartingPosition)
		{
			case "Launchpad":
			case "1":
				Launchpad();
				break;
			default:
				System.out.println("Error 4: The starting area of the space branch of the story, method GoToSpaceBranch, was told to go to " + StartingPosition + ", which isn't a place!");
		}
	}
	
	public static void Launchpad()
	{
		Stuff.CurrentLocationNumber = 1;
		Stuff.TypeLine("You travel to the year 2030.");
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