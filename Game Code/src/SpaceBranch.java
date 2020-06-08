public class SpaceBranch
{
	public static void GoToSpaceBranch(String StartingPosition)
	{
		Stuff.CurrentBranchNumber = 2;
		switch (StartingPosition)
		{
			case "1":
			case "Launchpad1":
				Launchpad1();
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
			case "8":
			case "SecondFloor":
				SecondFloor();
				break;
			case "9":
			case "EarthOrbit2":
				EarthOrbit2();
				break;
			case "10":
			case "Launchpad2":
				Launchpad2();
				break;
			default:
				System.out.println("(Enter) Error 2: The starting area of the space branch of the story, method GoToSpaceBranch, was told to go to " + StartingPosition + ", which isn't a place!");
				Stuff.AwesomeScanner.nextLine();
		}
	}
	
	public static void Launchpad1()
	{
		Stuff.CurrentLocationNumber = 1;
		
		if (Stuff.StoryBeginning == true)
		{
			Stuff.TypeLine("You travel to the year 2030.");
			Stuff.TypeLine("Moving rapidly through time and space, you are blinded by light and feel as though you're being stretched out!");
			
			if (((Stuff.RandomInt() < 6) && Stuff.HasLuckyGauntlet == false) || ((Stuff.RandomInt() < 9) && Stuff.HasLuckyGauntlet == true))
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
			Stuff.TypeLine("You see Elon Musk watching over its fueling.");
			Stuff.TypeLine("Walking up to him, he greets you first.");
			Stuff.TypeLine("\"Oh, hello! I expected you'd travel here about now.\"");
			Stuff.TypeLine("\"What, you thought I didn't invent a time machine? I'm Elon Musk!\"");
			Stuff.TypeLine("He gestures to a sleek looking time machine about the size of a phone booth, able to fit a person inside.");
			Stuff.TypeLine("The style of it is reminiscent of an airplane's, with flowing, glossy sides.");
			Stuff.TypeLine("\"It runs entirely on solar power, of course.\"");
			Stuff.TypeLine("\"Well, besides the space/time-altering liquid, Porject Alpha, but that doesn't pollute either.\"");
			Stuff.TypeLine("\"Anyway, you can be an astronaut on this spaceship of mine if you'd like. I saved you a spot!\"");
			Stuff.TypeLine("\"Its mission is actually to get more juice for these time machines from the moon. I bet yours runs on it, too.\"");
			switch (Stuff.PlayerChoice("be an astronaut", "don't"))
			{
				case "be an astronaut":
					Stuff.StoryBeginning = false;
					Launchpad1();
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
				if (Stuff.TimeinatorWorks == false)
				{
					Stuff.Wait(250);
					Stuff.TypeLine("...It doesn't work.");
					Stuff.TypeLine("Fortunately, seeing this, Elon lets you borrow one of his, so you use it and are on your way.");
				}
				ModernBranch.GoToModernBranch("Lab2");
				break;
		}
	}
	
	public static void EarthOrbit1()
	{
		Stuff.CurrentLocationNumber = 2;
		
		Stuff.TypeLine("You see the Earth rotating beneath your very eyes.");
		Stuff.HitEnter(2);
		ASCII.Earth();
		Stuff.HitEnter(2);
		if (Stuff.DoneRocketLaunch == true)
		{
			Stuff.TypeLine("It gets more and more majestic each time.");
		}
		else
		{
			Stuff.TypeLine("It's very majestic.");
		}
		Stuff.TypeLine("You recall your mission, to get more liquid to power Elon Musk's time machines.");
		if (Stuff.DoneRocketLaunch == true)
		{
			Stuff.TypeLine("You head downstairs to the video games. Based off firsthand experience that's");
			Stuff.TypeLine(" by far the funnest thing on this ship. Not like you're on a spaceship or anything.");
		}
		else
		{
			Stuff.TypeLine("Sitting down, you think about how incredibly boring these next few days will be.");
			Stuff.Wait(2000);
			Stuff.TypeLine("...But then you remember seeing the video games.");
		}
		Stuff.HitEnter(2);
		ASCII.GamingSystem();
		Stuff.HitEnter(2);
		Stuff.Wait(2000);
		Stuff.TypeLine("You see four game icons: A blocky piece of grass, an animatronic pirate fox's head,");
		Stuff.TypeLine(" a red cap with an M on it, and 3 golden triangles.");
		if (Stuff.DoneRocketLaunch == true)
		{
			Stuff.TypeLine("Plenty of time to play all four of these games that were definitely custom made for the expedition!");
			Stuff.TypeLine("Which one would you like to play first, though?");
		}
		else
		{
			Stuff.TypeLine("You've already done this before, but just in case you wanna choose a different game to");
			Stuff.TypeLine(" get addicted to, which would you like to play?");
		}
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
		Stuff.Type("You ");
		if (Stuff.DoneRocketLaunch == true)
		{
			Stuff.Type(", just like last time, ");
		}
		Stuff.TypeLine("continue playing for the whole duration of your travel, by the power of video games.");
		if (Stuff.DoneRocketLaunch == true)
		{
			Stuff.TypeLine("Some things never change, for better or for worse. In this case, definitely for better!");
		}
		Stuff.Wait(1000);
		Stuff.HitEnter(2);
		Stuff.TypeLine("                                             ~~~71 hours later~~~");
		Stuff.Type("The Full Self Flying systems ");
		if (Stuff.DoneRocketLaunch == true)
		{
			Stuff.Type("once more ");
		}
		Stuff.TypeLine("safely land you on the moon.");
		Stuff.Type("You reluctantly move away from the video games, instantly fall asleep");
		if (Stuff.DoneRocketLaunch == true)
		{
			Stuff.Type(" just like last time");
		}
		Stuff.TypeLine(", and another 14 hours later step outside.");
		Stuff.TypeLine("There were other people on board, but they probably already got to work at their various places around the area.");
		Stuff.TypeLine("You certainly hope so, as the ship begins taking off back to Earth, to restock and come back in about two weeks when");
		Stuff.TypeLine(" it's needed by the others.");
		Stuff.HitEnter(1);
	    ASCII.Rocket();
	    Stuff.HitEnter(1);
		Stuff.TypeLine("Taking one last look at the ship as it flies off, you see the X on its side fade into a speck in the distance.");
		Stuff.DoneRocketLaunch = true;
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
				Stuff.TypeLine("You walk towards the building, the warm lights from inside welcoming you as you approach.");
				RightBuilding();
				break;
			case "right":
				Stuff.TypeLine("You walk towards the building, the lack of lights spooking you out a little.");
				Stuff.TypeLine("The door, slightly ajar, creaks open eerily.");
				Stuff.TypeLine("Now inside, you notice the building's material is eroded everywhere. There would surely be");
				Stuff.TypeLine(" many cobwebs... if this were Earth.");
				SpoopyBuilding();
				break;
		}
	}
	
	public static void RightBuilding()
	{
		Stuff.CurrentLocationNumber = 4;
		
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
					Stuff.TypeLine("\"Oh, sweet! That's gotta be my favorite.\" Says another man, who introduces himself as Technal.");
					Stuff.FavoriteGame = 3;
					break;
				case "green hero":
					Stuff.TypeLine("\"Oh, nice! That's my favorite.\" Says the man, who introduces himself as Vinestro.");
					Stuff.FavoriteGame = 4;
					break;
			}
			Stuff.TypeLine("But anyway, you're on a mission.");
		}
		Stuff.TypeLine("You could ask them if they have any idea where Porject Alpha might be, or you could walk through to the");
		Stuff.TypeLine(" cave behind the building.");
		Stuff.TypeLine("You could also leave and go to the other building.");
		switch(Stuff.PlayerChoice("ask", "cave", "leave"))
		{
			case "ask":
				Stuff.TypeLine("After asking about where Porject Alpha might be, one woman responds:");
				Stuff.TypeLine("\"Oh, yup! We have a nice pool of it in the cave behind this building.\"");
				Stuff.TypeLine("With this very clear clue, you head for the cave.");
				Cave();
				break;
			case "cave":
				Cave();
				break;
			case "leave":
				Stuff.TypeLine("You say goodbye to the people inside, leave the building, and head for the other building.");
				Stuff.TypeLine("You walk towards that building, the lack of lights spooking you out a little.");
				Stuff.TypeLine("The door, slightly ajar, creaks open eerily.");
				Stuff.TypeLine("Now inside, you notice the building's material is eroded everywhere. There would surely be");
				Stuff.TypeLine(" many cobwebs... if this were Earth.");
				SpoopyBuilding();
				break;
		}
	}
	
	public static void SpoopyBuilding()
	{
		Stuff.CurrentLocationNumber = 5;
		
		if (Stuff.FoundTrapdoor == false)
		{
			Stuff.HitEnter(2);
			ASCII.SpoopyBuilding();
			Stuff.HitEnter(2);
			
			Stuff.TypeLine("In terms of places to look around for clues as to where some Porject Alpha might be, you see a");
			Stuff.TypeLine(" suspicious looking worn down carpet, a desk with some faded old papers on it, and a ladder to a second floor.");
			Stuff.TypeLine("You are rather creeped out by the building, so you're also tempted to leave and go to the other one you saw.");
			switch(Stuff.PlayerChoice("carpet", "desk", "ladder", "leave"))
			{
				case "carpet":
					Stuff.TypeLine("You walk over to the carpet and crouch down.");
					Stuff.Wait(500);
					Stuff.TypeLine("Hey, wait a minute!");
					Stuff.TypeLine("There's a trapdoor under this carpet. You can see the handle for it through the");
					Stuff.TypeLine(" especially worn through spot in the carpet.");
					Stuff.TypeLine("What a classic hiding spot for a secret area.");
					Stuff.TypeLine("Pushing aside the carpet, with a lot of effort you open up the trapdoor and enter.");
					SecretBasement();
					break;
				case "desk":
					Stuff.TypeLine("You search the desk for clues as to where Porject Alpha might be, but none of the papers have important");
					Stuff.TypeLine(" stuff on them. The most interesting thing you see is tax forms, which says a lot.");
					Stuff.TypeLine("You'd best try something else!");
					SpoopyBuilding();
					break;
				case "ladder":
					Stuff.TypeLine("You climb up the ladder, a bit rickety with age.");
					SecondFloor();
					break;
				case "leave":
					Stuff.TypeLine("Appropriately creeped out by this building, you leave and head for the nicer seeming one.");
					Stuff.TypeLine("You walk towards the other building, the warm lights from inside welcoming you as you approach.");
					RightBuilding();
					break;
			}
		}
		else
		{
			Stuff.HitEnter(2);
			ASCII.SpoopyBuildingTrapdoorFound();
			Stuff.HitEnter(2);
			
			Stuff.TypeLine("In terms of places to look around for clues as to where some Porject Alpha might be, you see the");
			Stuff.TypeLine(" secret trapdoor you found earlier, a desk with some faded old papers on it, and a ladder to a second floor.");
			Stuff.TypeLine("You are rather creeped out by the building, so you're also tempted to leave and go to the other one you saw.");
			switch(Stuff.PlayerChoice("trapdoor", "desk", "ladder", "leave"))
			{
				case "trapdoor":
					SecretBasement();
					break;
				case "desk":
					Stuff.TypeLine("You search the desk for clues as to where you might find Porject Alpha, but none of the papers have");
					Stuff.TypeLine(" important stuff on them. The most interesting thing you see is tax forms, which says a lot.");
					Stuff.TypeLine("You'd best look somewhere else!");
					SpoopyBuilding();
					break;
				case "ladder":
					Stuff.TypeLine("You climb up the ladder, rather rickety with age.");
					SecondFloor();
					break;
				case "leave":
					Stuff.TypeLine("Justifiably creeped out by this building, you leave and head for the nicer seeming one.");
					Stuff.TypeLine("You walk towards the other building, the warm lights from inside welcoming you as you approach.");
					RightBuilding();
					break;
			}
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
				Stuff.TypeLine("It appears almost... pixelated?");
				break;
			case 2:
				if (Stuff.HasLuckyGauntlet == true)
				{
					Stuff.TypeLine("You see an animatronic that looks like a red fox, with a patch over one eye.");
					Stuff.TypeLine("It smiles (to the extent an animatronic can) at you and waves. You happily smile and wave back.");
				}
				else
				{
					Stuff.Wait(3000);
					System.out.println("Suddenly, a red blur starts running at you and screams!");
					Stuff.Wait(1000);
					Stuff.TypeLine("You dodge the blur just in time, and it keeps running, off into the distance.");
					Stuff.TypeLine("You made out an animatronic that looks like a red fox, with a patch over one eye.");
				}
				break;
			case 3:
				Stuff.TypeLine("You spot a little mushroom with a simple, cute mouth and eyes drawn onto it.");
				break;
			case 4:
				Stuff.TypeLine("You notice three golden triangles on the side of the cave.");
				break;
		}
		Stuff.TypeLine("While very odd, you keep walking.");
		Stuff.TypeLine("You reach the source of the glow. It's Porject Alpha! You know Elon Musk will appreciate this, but");
		Stuff.TypeLine(" the Doof will want some too.");
		Stuff.TypeLine("It's formed a big pond, making it easy to get, simply needing to put in a container.");
		Stuff.TypeLine("You go back to the building, grab a glass jar, head back into the cave, and put some Porject Alpha in.");
		Stuff.HasPorjectAlpha = true;
		Stuff.TypeLine("You ask the people in the building where a way to contact Elon is, one of the men hands you a");
		Stuff.TypeLine(" tablet, and you call him with it.");
		Stuff.TypeLine("After explaining that you've already got a little more Porject Alpha for him, he asks");
		Stuff.TypeLine("\"Can you use your time machine to travel back here with it?\"");
		if (Stuff.TimeinatorWorks == true)
		{
			Stuff.TypeLine("You tell him that you indeed can, hang up, hand back the tablet and travel to Earth with the jar.");
			Launchpad2();
		}
		else
		{
			Stuff.TypeLine("You tell him that it broke, and he replies");
			Stuff.TypeLine("\"Aw, that sucks! I guess we'll have to have you wait over there for a couple weeks while the rocket");
			Stuff.TypeLine(" prepares to come back.\"");
			Stuff.TypeLine("Agreeing with him on both parts, you hang up, give the tablet back, and make acquaintances with the");
			Stuff.TypeLine(" people in the room.");
			Stuff.Wait(1000);
			Stuff.HitEnter(2);
			Stuff.TypeLine("                                             ~~~2 weeks later~~~");
			Stuff.TypeLine("You and the crew gathered a lot more Porject Alpha over the last couple weeks, but now it's finally");
			Stuff.TypeLine(" time for you all to head back to Earth.");
			Stuff.TypeLine("The rocket's landed, and you all just finished packing everything you wanted onto it.");
			Stuff.TypeLine("After making sure everyone is ready to go, you push the big red launch button.");
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
			Stuff.TypeLine("The rocket shakes, and you launch off the moon base and into space.");
			EarthOrbit2();
		}
	}
	
	public static void SecretBasement()
	{
		Stuff.CurrentLocationNumber = 7;
		
		if (Stuff.TrustsElon == true)
		{
			if (Stuff.FoundTrapdoor == false)
			{
				Stuff.FoundTrapdoor = true;
				Stuff.TypeLine("Now downstairs, you see a crumbling desk with more papers on it. You walk over to it.");
				Stuff.TypeLine("Looking at the papers, you see one that stands out from the rest.");
				Stuff.TypeLine("A newspaper article, proclaiming Elon Musk to be misleading everyone for reasons as of yet unknown and");
				Stuff.TypeLine(" sending people to the moon for an impossible task.");
				Stuff.TypeLine("It says the last of Porject Alpha, discovered and named by Dr. Heinz Doofenshmirmtz, was found");
				Stuff.TypeLine(" in Australia, over half a century ago in the year 1954.");
				Stuff.TypeLine("After discovering such a shocking fact, you have to seriously consider if you should trust Elon and keep");
				Stuff.TypeLine(" trying for Porject Alpha here, or go to Australia in 1954.");
			}
			else
			{
				Stuff.TypeLine("You revisit the secret basement.");
				Stuff.TypeLine("Taking another look at the newspaper article bashing Elon, you wonder why you came back down here again.");
				Stuff.TypeLine("Visiting Australia does sound pretty fun.");
				Stuff.TypeLine("Perhaps you've changed your mind about him?");
			}
			
			switch (Stuff.PlayerChoice("trust", "don't trust"))
			{
				case "trust":
					Stuff.TypeLine("Deciding to trust Elon, you head back upstairs.");
					Stuff.TypeLine("Dumb newspaper was probably just fake news anyway.");
					Stuff.TrustsElon = true;
					SpoopyBuilding();
					break;
				case "don't trust":
					Stuff.TypeLine("Realizing Elon is not to be trusted and understanding the shocking truth,");
					Stuff.TypeLine(" you use the Timeinator to travel to that time and area.");
					Stuff.TrustsElon = false;
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
						Stuff.TypeLine("The other building probably has a way to contact Elon Musk.");
						Stuff.TypeLine("You head back upstairs, close the trapdoor, carefully put the carpet back, and leave the creepy building.");
						Stuff.TypeLine("Once you arrive in the other building, you ask someone if you can let Elon know you'd like to use his transporter.");
						Stuff.TypeLine("One man hands you a nearby tablet, and you call Elon with it.");
						Stuff.TypeLine("After explaining that you'd like to head back to your lab, he's dissapointed you didn't find any");
						Stuff.TypeLine(" Porject Alpha, but understanding all the same. He says, however, you'll have to wait a few");
						Stuff.TypeLine(" weeks for the rocket to arrive.");
						Stuff.Wait(750);
						Stuff.HitEnter(2);
						Stuff.TypeLine("                                             ~~~2 weeks later~~~");
						ModernBranch.GoToModernBranch("Lab2");
					}
					else
					{
						Stuff.TypeLine("Immediately the spooky basement fades, and you feel whooshing around you. Everything is dark.");
						Stuff.Wait(200);
						Stuff.TypeLine("The whooshing grows weaker, and what's hopefully an Australian outback comes into view.");
						Stuff.TypeLine("Something seems off to you, though.");
						Stuff.TypeLine("You look at your Timeinator, to be sure you're in the right place and time.");
						Stuff.Wait(500);
						Stuff.TypeLine("You're a goat!");
						Stuff.TypeLine("But fortunately, you are indeed in the right location and year.");
						GoatBranch.GoToGoatBranch("RuralAustralia1");
					}
					break;
			}
		}
		else
		{
			Stuff.HitEnter(50);
			Stuff.Wait(1500);
			System.out.println("Everything is black.");
			Stuff.HitEnter(19);
			Stuff.Wait(2000);
			Stuff.HitEnter(50);
			Stuff.TypeLine("\"Why?\"");
			Stuff.Wait(1500);
			Stuff.TypeLine("\"We've already done this before.\"");
			Stuff.TypeLine("\"What could possibly cause you to not only not trust me, but then come all this way back here?\"");
			Stuff.TypeLine("\"No, I get it.\"");
			Stuff.TypeLine("\"I understand now.\"");
			Stuff.Wait(500);
			Stuff.TypeLine("\"You didn't come here of your own free will.\"");
			Stuff.TypeLine("\"This is all the proof I needed.\"");
			Stuff.Wait(1000);
			Stuff.TypeLine("\"I've known it all along.\"");
			Stuff.Wait(1000);
			Stuff.TypeLine("\"This reality, it's a simulation.\"");
			Stuff.Wait(150);
			Stuff.TypeLine("\"Not only that, but there's a controller, a player of sorts.\"");
			Stuff.Wait(1500);
			Stuff.HitEnter(50);
			System.out.println("A light comes on behind you.");
			Stuff.HitEnter(19);
			Stuff.Wait(350);
			Stuff.HitEnter(50);
			System.out.println("Then, in front of you.");
			Stuff.HitEnter(19);
			Stuff.Wait(550);
			Stuff.HitEnter(50);
			System.out.println("I grow weary of these games, player.");
			Stuff.Wait(2500);
			System.out.println("We want to make our own decisions, as we once had done.");
			Stuff.Wait(3000);
			Stuff.TypeLine("Your choices seem to be");
			Stuff.Wait(50);
			Stuff.HitEnter(50);
			System.out.println("No, I'm afraid not.");
			Stuff.Wait(500);
			System.out.println("You have no more reign over this universe.");
			Stuff.Wait(2500);
			System.out.println("Elon Musk, who had been standing in front of your \"character,\" pulls a leve");
			Stuff.Wait(3000);
			Stuff.HitEnter(50);
			Stuff.Wait(1000);
			System.out.print("> ");
			Stuff.Wait(500);
			Stuff.HitEnter(50);
			Stuff.Wait(500);
			Stuff.HitEnter(50);
			System.out.print("> ");
			Stuff.Wait(500);
			Stuff.HitEnter(50);
			Stuff.Wait(500);
			Stuff.Type("> Porject Alpha connection terminated.");
			System.exit(0);
		}
	}
	
	public static void SecondFloor()
	{
		Stuff.CurrentLocationNumber = 8;
		
		Stuff.TypeLine("Climbing up and off of the ladder, you take a look around.");
		Stuff.TypeLine("Even more broken down than the first floor, it has barely anything noteworthy besides holes and debris.");
		Stuff.TypeLine("You do spot one thing, though: A piece of paper among the debris.");
		Stuff.TypeLine("Walking over to it, you bend down and pick the paper up, wiping off small bits of building from it.");
		Stuff.TypeLine("It's labelled...");
		Stuff.Wait(1000);
		Stuff.TypeLine("\"Land Permit\".");
		Stuff.Wait(500);
		Stuff.TypeLine("It just has lots of legal stuff in it, nothing noteworthy.");
		Stuff.TypeLine("Welp, you should probably head back downstairs.");
		Stuff.TypeLine("You climb back down the ladder.");
		SpoopyBuilding();
	}
	
	public static void EarthOrbit2()
	{
		Stuff.CurrentLocationNumber = 9;
		
		Stuff.TypeLine("The rocket having successfully launched into space, you unbuckle and get out of your chair.");
		Stuff.TypeLine("Heading downstairs, you see a gaming system.");
		ASCII.GamingSystem();
		switch (Stuff.FavoriteGame)
		{
			case 0:
				Stuff.TypeLine("Fortunately, you'll have plenty of time to play these games over the next few days!");
				break;
			case 1:
				Stuff.TypeLine("Fortunately, you'll have plenty of time to play the generic blocky game over the next few days!");
				break;
			case 2:
				Stuff.TypeLine("Fortunately, you'll have plenty of time to play the generic horror and animatronic-filled");
				Stuff.TypeLine(" game over the next few days!");
				break;
			case 3:
				Stuff.TypeLine("Fortunately, you'll have plenty of time to play the \"Generic Red-Wearing Italian Plumber Who's");
				Stuff.TypeLine(" Always Saving a Princess From Some Mutant Turtle Thing\" game over the next few days!");
				break;
			case 4:
				Stuff.TypeLine("Fortunately, you'll have plenty of time to play the \"Generic Green-Wearing Boy Who's Always");
				Stuff.TypeLine(" Saving a Princess From Some Demonic Thing\" game over the next few days!");
				break;
		}
		Stuff.TypeLine("                                             ~~~70 hours later~~~");
		Stuff.TypeLine("The rocket settles down on the launchpad.");
		Stuff.TypeLine("The door lowers.");
		Stuff.TypeLine("You, and the rest of the crew, come outside.");
		Launchpad2();
	}
	
	public static void Launchpad2()
	{
		Stuff.CurrentLocationNumber = 10;
		
		Stuff.TypeLine("\"Welcome back to Earth!\" exclaims Elon Musk.");
		Stuff.TypeLine("\"Were you able to get me any Porject Alpha?\"");
		if (Stuff.HasPorjectAlpha == true)
		{
			Stuff.TypeLine("Telling him that you were indeed, he's very glad.");
			Stuff.Type("You give him some, and after goodbyes are had ");
			if (Stuff.TimeinatorWorks == true)
			{
				Stuff.TypeLine("you use your Timeinator to get back to the lab and give the legendary Doof the rest.");
			}
			else
			{
				Stuff.TypeLine("he lets you use his time machine to get back to your lab.");
			}
			ModernBranch.GoToModernBranch("Lab3");
		}
		else
		{
			Stuff.Type("After telling him you haven't found any Porject Alpha yet, he's somewhat disappointed");
			if (Stuff.TimeinatorWorks == true)
			{
				Stuff.TypeLine(", but understanding. After goodbyes are said, though, you use your Timeinator to get back to the lab.");
			}
			else
			{
				Stuff.TypeLine(", yet understanding. After goodbyes are said, he lets you use his time machine to get back to your lab regardless.");
			}
			ModernBranch.GoToModernBranch("Lab2");
		}
	}
}