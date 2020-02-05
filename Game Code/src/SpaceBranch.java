public class SpaceBranch
{
	public static void GoToSpaceBranch(String StartingPosition)
	{
		Stuff.CurrentBranchNumber = 2;
		switch (StartingPosition)
		{
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
		
		if (Stuff.StoryBeginning == true)
		{
			Stuff.TypeLine("You travel to the year 2030.");
			Stuff.TypeLine("You are nearby a massive launchpad with a rocket preparing to launch on it.");
			Stuff.TypeLine("You see Elon Musk watching over its feuling.");
			Stuff.TypeLine("Walking up to him, he greets you first.");
			Stuff.TypeLine("\"Oh, hello! I expected you'd travel here about now.\"");
			Stuff.TypeLine("\"What, you thought I didn't invent a time machine? I'm Elon Musk!\"");
			Stuff.TypeLine("\"Anyway, you can be an astronaut on this Falcon X spaceship if you'd like.\"");
			switch (Stuff.PlayerChoice("be an astronaut", "don't"))
			{
				case "be an astronaut":
					Stuff.StoryBeginning = false;
					Launchpad();
					break;
				case "don't":
					Stuff.TypeLine("\"Very well then, if that's your choice.\"");
					Stuff.TypeLine("\"Oh right, I almost forgot: I believe your Timinator broke when you traveled here.\"");
					Stuff.TypeLine("\"You can borrow one of my time machines to get back to your lab.\"");
					Stuff.TypeLine("\"Seeing no other choices, you thank him, take the time machine, and replace it with the broken one on your wrist.\"");
					Stuff.TypeLine("\"You set it for Dr. Doofenschmirtz's labratory, and head back.\"");
					Stuff.StoryBeginning = false;
					PorjectAlpha.Lab1();
					break;
			}
		}
		
		Stuff.TypeLine("You could launch Elon's rocket, with you in it.");
		Stuff.TypeLine("Alternatively, if you've changed your mind, it's still not too late to abort the launch!");
		switch (Stuff.PlayerChoice("launch rocket", "abort launch"))
		{
			case "launch rocket":
				break;
			case "abort launch":
				break;
		}
	}
}