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
			case "3":
			case "MoonLanding":
				MoonLanding();
				break;
			case "4":
			case "RightBuilding":
				RightBuilding();
				break;
			case "5":
			case "SpoopyBuilding":
				SpoopyBuilding();
				break;
			case "6":
			case "Cave":
				Cave();
				break;
			case "7":
			case "SecretBasement":
				SecretBasement();
				break;
			default:
				System.out.println("(Enter) Error 2: The starting area of the space branch of the story, method GoToSpaceBranch, was told to go to " + StartingPosition + ", which isn't a place!");
				Stuff.AwesomeScanner.nextLine();
		}
	}
	
	public static void Launchpad()
	{
		Stuff.CurrentLocationNumber = 1;
		
		if (Stuff.StoryBeginning == true)
		{
			Stuff.TypeLine("You travel to the year 2030.");
			Stuff.TypeLine("Moving rapidly through time and space, you are blinded by light and feel as though you're being stretched out!");
			if (Stuff.RandomInt() < 6)
			{
				Stuff.TypeLine("As time slows back to normal, you notice a little smoke come out of your time machine.");
				Stuff.TypeLine("The smoke stops as soon as it started, but the screen on it seems broken now.");
				Stuff.TimeinatorWorks = false;
			}
			else
			{
				Stuff.TypeLine("Time slows back down to normal, and details of your surroundings come into view.");
			}
			Stuff.TypeLine("A massive launchpad is nearby with a rocket preparing to launch on it, a giant stylized X on both.");
			Stuff.TypeLine("You see Elon Musk watching over its feuling.");
			Stuff.TypeLine("Walking up to him, he greets you first.");
			Stuff.TypeLine("\"Oh, hello! I expected you'd travel here about now.\"");
			Stuff.TypeLine("\"What, you thought I didn't invent a time machine? I'm Elon Musk!\"");
			Stuff.TypeLine("He gestures to a sleek looking time machine about the size of a phone booth, able to fit a person inside.");
			Stuff.TypeLine("The style of it is reminiscent of an airplane's, with flowing, glossy sides.");
			Stuff.TypeLine("\"It runs entirely on solar power, of course.\"");
			Stuff.TypeLine("\"Well, besides the space/time-altering liquid, but that doesn't pollute either.\"");
			Stuff.TypeLine("\"Anyway, you can be an astronaut on this Falcon X spaceship if you'd like. I saved you a spot!\"");
			Stuff.TypeLine("\"Its mission is actually to get more juice for these time machines from the moon. I bet yours runs on it, too.\"");
			switch (Stuff.PlayerChoice("be an astronaut", "don't"))
			{
				case "be an astronaut":
					Stuff.StoryBeginning = false;
					Launchpad();
					break;
				case "don't":
					Stuff.TypeLine("\"Very well then, if that's your choice.\"");
					if (Stuff.TimeinatorWorks == false)
					{
						Stuff.TypeLine("\"Oh right, I almost forgot: I believe your Timeinator broke when you traveled here.\"");
						Stuff.TypeLine("\"You can borrow one of my time machines to get back to your lab.\"");
						Stuff.TypeLine("Seeing no other choices, you thank him, take the time machine, and replace the broken one on your wrist with it.");
						Stuff.TypeLine("You set it for Dr. Doofenschmirtz's labratory, and head back.");
					}
					else
					{
						Stuff.TypeLine("You use your Timeinator and head back to the lab.");
					}
					Stuff.StoryBeginning = false;
					ModernBranch.GoToModernBranch("Lab2");
					break;
			}
		}
		
		Stuff.TypeLine("You climb a tall ladder, walk across a metal walkway, and enter the massive spaceship.");
		Stuff.TypeLine("Looking around a little, you notice a console with your favorite video games on it.");
		Stuff.TypeLine("You then climb up the ladder to the cockpit and sit down in the pilot's seat.");
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
				Stuff.Wait(200);
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
		Stuff.TypeLine("You recall your mission, to get more liquid to power Elon Musk's time machines.");
		Stuff.TypeLine("Sitting down, you think about how incredibly boring these next 24 hours will be.");
		Stuff.Wait(2000);
		Stuff.TypeLine("...But then you remember seeing the video games.");
		ASCII.GamingSystem();
		Stuff.Wait(2000);
		Stuff.TypeLine("You see four game icons: A blocky piece of grass, an animatronic pirate fox's head,");
		Stuff.TypeLine(" a red cap with an M on it, and 3 golden triangles.");
		Stuff.TypeLine("Plenty of time to play all four of these games that were definitely custom made for the expedition!");
		Stuff.TypeLine("Which one would you like to play first, though?");
		switch(Stuff.PlayerChoice("grass", "fox", "cap", "triangles"))
		{
			case "grass":
				Stuff.FavoriteGame = 1;
				break;
			case "fox":
				Stuff.FavoriteGame = 2;
				break;
			case "cap":
				Stuff.FavoriteGame = 3;
				break;
			case "triangles":
				Stuff.FavoriteGame = 4;
				break;
		}
		Stuff.TypeLine("You continue playing the whole duration of your travel, by the power of video games.");
		Stuff.Wait(1000);
		Stuff.HitEnter(2);
		Stuff.TypeLine("                                             ~~~72 hours later~~~");
		Stuff.TypeLine("The Full Self Flying systems safely land you on the moon.");
		Stuff.TypeLine("You reluctantly move away from the video games, instantly fall asleep, and another 14 hours later step outside.");
		Stuff.TypeLine("There were other people on board, but they probably already got to work at their various places around the area.");
		Stuff.TypeLine("You certainly hope so, as the ship begins taking off back to Earth, to restock and come back in about two weeks when");
		Stuff.TypeLine(" it's needed by the others.");
		Stuff.TypeLine("Taking one last look at the ship as it flies off, you see the X on its side fade into a speck in the distance.");
		MoonLanding();
	}
	
	public static void MoonLanding()
	{
		Stuff.CurrentLocationNumber = 3;
		
		Stuff.TypeLine("You take a look around you.");
		Stuff.TypeLine("From where you are you spot a cave towards your left, with a small building with some lights on blocking the path to it.");
		Stuff.TypeLine("You also see another small building, this one on your right. This one has no lights on.");
		Stuff.TypeLine("You wonder which might lead you to the Porject Alpha that Elon wants...");
		switch(Stuff.PlayerChoice("left", "right"))
		{
			case "left":
				RightBuilding();
				break;
			case "right":
				SpoopyBuilding();
				break;
		}
	}
	
	public static void RightBuilding()
	{
		Stuff.CurrentLocationNumber = 4;
		
		Stuff.TypeLine("You walk towards the building, the warm lights from inside welcoming you as you approach.");
		Stuff.TypeLine("It almost looks like a home, except that its surroundings are rather bleak and desolate still.");
		Stuff.TypeLine("Entering the building, a few friendly people greet you.");
		if (Stuff.FavoriteGame == 0)
		{
			Stuff.TypeLine("\"Oh, hey!\" says one man.");
			Stuff.TypeLine("\"We were just talking about what the best video game is.\"");
			Stuff.TypeLine("\"We've narrowed it down to four games now.\"");
			Stuff.TypeLine("\"They're so commonly known I'm sure I don't have to tell you their names, but");
			Stuff.TypeLine(" there's the game with animatronic animals, the one made of pixelates blocks,");
			Stuff.TypeLine(" the one with an Italian plumber who loves to wear red, and");
			Stuff.TypeLine(" the one where a green-clad hero saves a princess from some weird demonic thing.\"");
			Stuff.TypeLine("\"Maybe you could help us figure out the winner! Which of those do you think is the best?\"");
			switch (Stuff.PlayerChoice("animatronics", "blocks", "plumber", "green hero"))
			{
				case "animatronics":
					Stuff.TypeLine("\"That's a good one! My personal favorite. Lots of spooks.\" Says one woman.");
					Stuff.FavoriteGame = 2;
					break;
				case "blocks":
					Stuff.TypeLine("\"Yes! That was my choice too.\" Says a woman.");
					Stuff.FavoriteGame = 1;
					break;
				case "plumber":
					Stuff.TypeLine("\"Oh, sweet! That's gotta be my favorite.\" Says another man.");
					Stuff.FavoriteGame = 3;
					break;
				case "green hero":
					Stuff.TypeLine("\"Oh, nice! That's my favorite.\" Says the man.");
					Stuff.FavoriteGame = 4;
					break;
			}
			Stuff.TypeLine("But anyway, you're on a mission.");
		}
		Stuff.TypeLine("You could ask them if they have any idea where Porject Alpha might be, or you could walk through to the");
		Stuff.TypeLine(" cave behind the building.");
		Stuff.TypeLine("You could also leave and go to the other house.");
		switch(Stuff.PlayerChoice("ask", "cave", "leave"))
		{
			case "ask":
				break;
			case "cave":
				Cave();
				break;
			case "leave":
				SpoopyBuilding();
				break;
		}
	}
	
	public static void SpoopyBuilding()
	{
		Stuff.CurrentLocationNumber = 5;
		
		Stuff.TypeLine("You walk towards the building, the lack of lights spooking you out a little.");
		Stuff.TypeLine("The door, slightly ajar, creaks open eerily.");
		Stuff.TypeLine("Now inside, you notice the building's material is eroded everywhere. There would surely be");
		Stuff.TypeLine(" many cobwebs... if this were Earth.");
		Stuff.TypeLine("In terms of places to look around for clues as to where some Porject Alpha might be, you see a");
		Stuff.TypeLine(" suspicious looking worn down carpet, a desk with some faded old papers on it, and a ladder to a second floor.");
		Stuff.TypeLine("You are rather creeped out by the building, so you're also tempted to leave and go to the other one you saw.");
		switch(Stuff.PlayerChoice("carpet", "desk", "ladder", "leave"))
		{
			case "carpet":
				SecretBasement();
				break;
			case "desk":
				break;
			case "ladder":
				break;
			case "leave":
				RightBuilding();
				break;
		}
	}
	
	public static void Cave()
	{
		Stuff.CurrentLocationNumber = 6;
		
		Stuff.TypeLine("You approach the cave.");
		Stuff.TypeLine("Upon entering, you wish you had a flashlight... It's very dark.");
		Stuff.TypeLine("Braving the darkness, you keep walking forward, and soon see a glow.");
		switch (Stuff.FavoriteGame)
		{
			case 1:
				Stuff.TypeLine("You see a random giant grassy block on the side of the cave.");
				break;
			case 2:
				Stuff.Wait(3000);
				System.out.print("Suddenly, a red blur starts running at you!");
				Stuff.Wait(750);
				Stuff.TypeLine("You dodge the blur just in time, and it keeps running, off into the distance.");
				Stuff.TypeLine("You made out an animatronic that looks like a red fox, with a patch over one eye.");
				break;
			case 3:
				Stuff.TypeLine("You see a random giant grassy block on the side of the cave.");
				break;
			case 4:
				Stuff.TypeLine("You notice three golden triangles on the side of the cave.");
				break;
		}
		Stuff.TypeLine("While very odd, you keep walking.");
	}
	
	public static void SecretBasement()
	{
		Stuff.CurrentLocationNumber = 7;
		
		//Add stuff about finding a newspaper in a secret basement beneath the carpet detailing that Elon is misleading everyone and the last known Porject Alpha was in Austrraaaalia in 1954
		
		Stuff.TypeLine("Realizing this and understanding the shocking truth, you use the Timeinator to travel to that time and area.");
		if (Stuff.TimeinatorWorks == false)
		{
			Stuff.Wait(1000);
			Stuff.Type(".");
			Stuff.Wait(500);
			Stuff.Type(".");
			Stuff.Wait(500);
			Stuff.Type(".");
			Stuff.Wait(1000);
			Stuff.TypeLine("It doesn't work.");
			Stuff.TypeLine("Remembering now that it broke earlier, you realize you'll have to contact Elon Musk and ask him for");
			Stuff.TypeLine(" completely unrelated reasons to let you use his time machine to teleport back to the lab.");
			Stuff.TypeLine("The other building probably has a way to contact Elon.");
		}
		else
		{
			Stuff.TypeLine("Immediately the spooky basement fades, and you feel whooshing around you. Everything is dark.");
			Stuff.TypeLine("The whooshing grows weaker, and what's hopefully an Australian outback comes into view.");
			Stuff.TypeLine("Something seems off to you, though.");
			Stuff.TypeLine("You look at your Timeinator, to be sure you're in the right place and time.");
			Stuff.Wait(500);
			Stuff.TypeLine("You're a goat!");
			Stuff.TypeLine("But fortunately, you are indeed in the right location and year.");
			GoatBranch.GoToGoatBranch("RuralAustralia1");
		}
	}
}