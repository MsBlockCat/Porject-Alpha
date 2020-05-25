public class SpaceBranch
{
	public static void GoToSpaceBranch(String StartingPosition)
	{
		Stuff.CurrentBranchNumber = 2;
		switch (StartingPosition)
		{
			case "1":
			case "Launchpad":
				Launchpad();
				break;
			case "2":
			case "EarthOrbit1":
				EarthOrbit1();
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
			Stuff.TypeLine("Moving rapidly through time and space, you are blinded by light and feel as though you're being stretched out!");
			Stuff.TypeLine("As time slows back to normal, you notice a little smoke come out of your time machine.");
			Stuff.TypeLine("The smoke stops as soon as it started, but the screen on it seems broken now.");
			Stuff.TimeinatorWorks = false;
			Stuff.TypeLine("A massive launchpad is nearby with a rocket preparing to launch on it, a giant stylized X on both.");
			Stuff.TypeLine("You see Elon Musk watching over its feuling.");
			Stuff.TypeLine("Walking up to him, he greets you first.");
			Stuff.TypeLine("\"Oh, hello! I expected you'd travel here about now.\"");
			Stuff.TypeLine("\"What, you thought I didn't invent a time machine? I'm Elon Musk!\"");
			Stuff.TypeLine("He gestures to a sleek looking time machine about the size of a phone booth, able to fit a person inside.");
			Stuff.TypeLine("The style of it is reminiscent of an airplane's, with flowing, glossy sides.");
			Stuff.TypeLine("\"It runs entirely on solar power, of course.\"");
			Stuff.TypeLine("\"Anyway, you can be an astronaut on this Falcon X spaceship if you'd like. I saved you a spot!\"");
			switch (Stuff.PlayerChoice("be an astronaut", "don't"))
			{
				case "be an astronaut":
					Stuff.StoryBeginning = false;
					Launchpad();
					break;
				case "don't":
					Stuff.TypeLine("\"Very well then, if that's your choice.\"");
					Stuff.TypeLine("\"Oh right, I almost forgot: I believe your Timeinator broke when you traveled here.\"");
					Stuff.TypeLine("\"You can borrow one of my time machines to get back to your lab.\"");
					Stuff.TypeLine("Seeing no other choices, you thank him, take the time machine, and replace the broken one on your wrist with it.");
					Stuff.TypeLine("You set it for Dr. Doofenschmirtz's labratory, and head back.");
					Stuff.StoryBeginning = false;
					ModernBranch.GoToModernBranch("Lab2");
					break;
			}
		}
		
		Stuff.TypeLine("You climb a tall ladder, walk across a metal walkway, and enter the massive spaceship.");
		Stuff.TypeLine("Looking around a little, you then climb up to the cockpit and sit down in the pilot's seat.");
		Stuff.TypeLine("You see a big red button, clearly indicated with text beneath saying \"Launch\".");
		Stuff.TypeLine("You could launch Elon's rocket, with you in it.");
		Stuff.TypeLine("Alternatively, if you've changed your mind, it's still not too late to abort the launch!");
		switch (Stuff.PlayerChoice("launch rocket", "abort launch"))
		{
			case "launch rocket":
				Stuff.TypeLine("You hit the big red launch button, and hear an automated countdown.");
				Stuff.TypeLine("T-minus 1 minute to liftoff.");
				Stuff.Wait(1500);
				Stuff.TypeLine("T-minus ten seconds.");
				Stuff.Wait(100);
				Stuff.TypeLine("Nine.");
				Stuff.Wait(650);
				Stuff.TypeLine("Eight.");
				Stuff.Wait(650);
				Stuff.TypeLine("Seven.");
				Stuff.Wait(650);
				Stuff.TypeLine("Six.");
				Stuff.Wait(650);
				Stuff.TypeLine("Five.");
				Stuff.Wait(650);
				Stuff.TypeLine("Four.");
				Stuff.Wait(650);
				Stuff.TypeLine("Three.");
				Stuff.Wait(650);
				Stuff.TypeLine("Two.");
				Stuff.Wait(650);
				Stuff.TypeLine("One.");
				Stuff.Wait(650);
				Stuff.TypeLine("You feel the rocket shake, and you launch into space.");
				EarthOrbit1();
				break;
			case "abort launch":
				Stuff.TypeLine("You get off the rocket, tell Elon that you're not willing to launch the rocket, and");
				Stuff.TypeLine(" use the time machine to head back to the lab.");
				Stuff.Wait(250);
				Stuff.TypeLine("...It doesn't work.");
				Stuff.TypeLine("Fortunately, seeing this, Elon lets you borrow one of his, so you use it and are on your way.");
				ModernBranch.GoToModernBranch("Lab2");
				break;
		}
	}
	
	public static void EarthOrbit1()
	{
		Stuff.CurrentLocationNumber = 2;
		
		Stuff.TypeLine("You see the Earth rotating beneath your very eyes.");
		ASCII.Earth();
		Stuff.TypeLine("It's very majestic.");
	}
}