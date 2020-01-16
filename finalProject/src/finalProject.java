import java.util.Scanner;
public class finalProject {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to your: Personal Enviormental Impact Quiz");
		System.out.println("(A): Start the quiz");
		System.out.println("(B): Look at my sources");
		System.out.println("(C): Disclaimers");
		
		String start;
		start = keyboard.nextLine(); 
		
		String[] questions = 
		{ 
				"How often do you eat animal-based products? (meat, dairy, eggs, etc)", 
				"How often do shop at “fast fashion” stores (Forver 21, Zara, Uniqlo, H&M,)",	
				"What is your main mode of transportation during the week?",
				"How often do you bring your own bags when shopping?",
				"How often do you vote?(locally or nationally)?",
				"How often do you turn off the lights when leaving a room?",
				"How often do you unplug appliances/chargers that you are not using?",
				"How often do you conserve water? (cutting showers short, turning off the water while brushing teeth/shaving)"
		};
		String[] inputs =
			{
				" 1. Never  2. Rarely  3. Somewhat Often  4. Often ",
				" 1. Never 2. Rarely  3. Somewhat Often 4. Often ",
				" 1. Biking/Walking  2. Bus 3. Train 4. Car ",
				" 1. Always  2. Sometimes  3. Never ",
				" 1. Often 2. Somewhat Often 3. Rarely 4. Never ",
				" 1. Always 2. Sometimes 3. Never ",
				" 1. Always 2. Sometimes 3. Never ",
				" 1. Always 2. Somwtimes 3. Never "
				
			};
		
		int[] userAnswers = new int[questions.length];
		
		
		if(start.equalsIgnoreCase("A"))
		{
			AskQuestions(questions,inputs,userAnswers);
			
			
		}
		
		else if(start.equalsIgnoreCase("B"))
		{
			System.out.println("Beuret, Nicholas BeuretNicholas, et al. “Emissions Inequality-a Gulf between Global Rich and Poor – Nicholas Beuret.” Social Europe, 3 May 2019, www.socialeurope.eu/emissions-inequality.\n");
			System.out.println("Black, Lucy. “What Does Computer Science Have To Do With Climate Change?” i, www.i-programmer.info/news/99-professional/13128-what-does-computer-science-have-to-do-with-climate-change.html.\n");
			System.out.println("Boom, Daniel Van. “Climate Change: 9 Ways You Can Make a Difference.” CNET, www.cnet.com/news/climate-change-9-ways-you-can-make-a-difference/.\n");
			System.out.println("Claudio, Luz. “Waste Couture: Environmental Impact of the Clothing Industry.” Environmental Health Perspectives, vol. 115, no. 9, 2007, doi:10.1289/ehp.115-a449..\n");
			System.out.println("Djekic, Ilija. “Environmental Impact of Meat Industry – Current Status and Future Perspectives.” Procedia Food Science, vol. 5, 2015, pp. 61–64., doi:10.1016/j.profoo.2015.09.025.\n");
			System.out.println("Mims, Christopher. “How Coders Can Help Fight Climate Change.” MIT Technology Review, MIT Technology Review, 22 Oct. 2012, www.technologyreview.com/s/420595/how-coders-can-help-fight-climate-change/.\n");
			System.out.println("Ogino, Akifumi, et al. “Evaluating Environmental Impacts of the Japanese Beef Cow?Calf System by the Life Cycle Assessment Method.” Animal Science Journal, vol. 78, no. 4, 2007, pp. 424–432., doi:10.1111/j.1740-0929.2007.00457.x.\n");
			System.out.println("Sisson, Patrick, et al. “101 Ways to Fight Climate Change.” Curbed, Curbed, 9 Oct. 2019, www.curbed.com/2017/6/7/15749900/how-to-stop-climate-change-actions.\n");
			System.out.println("Institute of Physics, Science X. “The Most Effective Individual Steps to Tackle Climate Change Aren't Being Discussed.” Phys.org, Phys.org, 11 July 2017, phys.org/news/2017-07-effective-individual-tackle-climate-discussed.html.\n");
		}
		else
		{
			System.out.println("With my quiz I tried to choose acsessible ways that anyone regardless of race, class, or socio-economic staus could contribute to.\n");
			System.out.println("One of the best ways to be sustainable is finding out how much carbon corporations you frequent are contributing to the atmosphere.\n ");
			System.out.println("Individual steps can go so far, at some point we must hold the wealthiest accountable for their actions.\n");
		}
		

		System.out.println("Fight apathy. Coded by Brenna C\n\n\n");
	}
	
	 static public void AskQuestions(String[] prompts, String[] answers, int[] replies)
	  {
		 Scanner keyboard = new Scanner(System.in);
		 	int score = 0;//score counter
			
		 	for (int i = 0; i < prompts.length ; i++)
			{
				System.out.printf("\nQuestion #%d: %s", i+1, prompts[i]);
				System.out.printf("\nEnter number: %s", answers[i]);
				replies[i] = Integer.parseInt(keyboard.nextLine());

				score += replies[i];
				
			}
		 	
		 	System.out.println("\nScore: " + score);
		 	
		 	if(score >= 8 && score <= 13)
		 	{
		 		System.out.println("Your enviormental impact is: Low");
		 		System.out.println("Good job!\n");
		 		System.out.println("If you are financially able remember that shopping local is a great way to decrease your overall 'food miles' and lower your carbon footprint even more!\n");
		 		System.out.println("Fun fact: living car free saves 2.4 tonnes of CO2 equivalent per year and a plant based diet saves 0.8 tonnes of CO2 equivalent a year\n");
		 		System.out.println("To find more ways to positively impact the enviorment, look at my sources!\n");
		 	}
		 	else if(score >= 14 && score <= 19)
		 	{
		 		System.out.println("Your enviormental impact is: Medium\n");
		 		System.out.println("You are on the right track, although more can most likely be done.\n"); 
		 		System.out.println("Have you ever tried washing your clothes in cold water?\n");
		 		System.out.println("You can reduce the emsissions of washing clothes by 75% according to the New York times.\n");
		 		System.out.println("Ater washing try hang drying your clothes instead of a drying machine.\n");
		 		System.out.println("If you are able, try walking to places close to you.\n");
		 		System.out.println("If you are financially able remember that shopping local is a great way to decrease your overall 'food miles' and lower your carbon footprint even more!\n");
		 		System.out.println("Fun fact: living car free saves 2.4 tonnes of CO2 equivalent per year and a plant based diet saves 0.8 tonnes of CO2 equivalent a year\n");
		 		System.out.println("To find more ways to positively impact the enviorment, look at my sources!\n");
		 		System.out.println("It really is the little things!\n");
		 		
		 	}
		 	else
		 	{
		 		System.out.println("Your enviormental impact is: High\n");
		 		System.out.println("Don't worry! You can improve\n"); 
		 		System.out.println("Try and and be mindful about what you're eating, could you be vegan or vegetarian one day a week?\n");
		 		System.out.println("Studies done by Carnegie Miellon have shown that by not eating red-meat one day a week can lower your Green House Gas emissions by 150%\n");
		 		System.out.println("Consider taking the bus, carpooling, or taking the train\n");
		 		System.out.println("Communter transit has significantly less Green House Emissions than personal cars\n");
		 		System.out.println("Try talking to your energy provider on ways to lower your daily consumption\n");
		 		System.out.println("This will also save you money!\n");
		 		System.out.println("If you are financially able remember that shopping local is a great way to decrease your overall 'food miles' and lower your carbon footprint even more!\n");
		 		System.out.println("Fun fact: living car free saves 2.4 tonnes of CO2 equivalent per year and a plant based diet saves 0.8 tonnes of CO2 equivalent a year\n");
		 		System.out.println("To find more ways to positively impact the enviorment, look at my sources!\n");
		 
		 	}
	  }
	 
	 
	 
	 

}