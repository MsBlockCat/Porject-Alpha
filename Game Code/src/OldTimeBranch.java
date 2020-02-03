public class OldTimeBranch {
	public static void GoToOldTimeBranch(String StartingPosition)
	{
		switch (StartingPosition)
		{
			case "Beginning":
				Stuff.TypeLine("You travel back to the year 1850.");
				Stuff.PlayerChoice("eating the banana", "nuking North Korea", "skiing", "going on the Klondike");
				break;
			default:
				System.out.println("Error 5: The starting area of the story, method GoToStartingBranch, was told to go to " + StartingPosition + ", which isn't a place!");
		}
	}
}