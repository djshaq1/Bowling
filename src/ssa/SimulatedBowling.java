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

			System.out.printf("Frames       1   2   3   4   5   6   7   8   9  10  Total\n");
	for(int game = 0; game < 3; game++) {
		System.out.printf("Game %2d   ", game+1);
		for (int frame = 0; frame < 10; frame++) {
			//bowlingScores[game][frame] = bowlOneFrame();
			System.out.printf("%4d", bowlingScores[game][frame]);
			gameTotal += bowlingScores[game][frame];
		}
		System.out.printf("    %3d", gameTotal);
		Total += gameTotal;
		gameTotal = 0;
		System.out.printf("\n");
	}
	System.out.printf("Total Series                                          %d\n", Total);
		
}
}


		

