package ssa;

public class SimulatedBowling {

	int bowlingScores[][] = new int[3][10];

	
	static java.util.Random rnd = new java.util.Random((new java.util.Date()).getTime());
		
	
	private int bowlOneFrame() {
		int firstBall = rollOneBall(11);
		int secondBall = 0;
		if(firstBall < 10) {
			secondBall = rollOneBall(11-firstBall);
			
		}
		int total = firstBall + secondBall;
		return total;
			
		
	}
	private int rollOneBall(int intRange) {
		return rnd.nextInt(intRange);
	}
	
	
	
	void bowl() {
			for(int game = 0; game < 3; game++)
		for (int frame = 0; frame < 10; frame++) {
			bowlingScores[game][frame] = bowlOneFrame();
			
		}
			
			
	int Total = 0;
	int gameTotal = 0;

			System.out.printf("Frames   1    \t 2    \t 3    \t 4    \t 5    \t 6    \t 7    \t 8    \t 9   \t 10    Total\n");
	for(int game = 0; game < 3; game++) {
		System.out.printf("Game %d   ", game+1);
		for (int frame = 0; frame < 10; frame++) {
			//bowlingScores[game][frame] = bowlOneFrame();
			System.out.printf(bowlingScores[game][frame] +  " \t ");
			gameTotal += bowlingScores[game][frame];
		}
		System.out.printf("%d", gameTotal);
		Total += gameTotal;
		gameTotal = 0;
		System.out.printf("\n");
	}
	System.out.printf("Total Series  \t  \t  \t  \t  \t  \t  \t  \t \t \t %d\n", Total);
		
}
}


		

