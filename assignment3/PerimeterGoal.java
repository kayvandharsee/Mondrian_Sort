package assignment3;

import java.awt.Color;

public class PerimeterGoal extends Goal{

	public PerimeterGoal(Color c) {
		super(c);
	}

	@Override
	public int score(Block board) {
		if (board.getMaxDepth() == 0) {
			return 2;
		}

		Color[][] colors = board.flatten();
		int score = 0;

		// Check the first and last row
		for (int j = 0; j < colors[0].length; j++) {
			if (colors[0][j].equals(targetGoal)) {
				score += (j == 0 || j == colors[0].length - 1) ? 2 : 1;
			}
			if (colors[colors.length - 1][j].equals(targetGoal)) {
				score += (j == 0 || j == colors[0].length - 1) ? 2 : 1;
			}
		}

		// Check the first and last column (excluding first and last row)
		for (int i = 1; i < colors.length - 1; i++) {
			if (colors[i][0].equals(targetGoal)) {
				score++;
			}
			if (colors[i][colors[0].length - 1].equals(targetGoal)) {
				score++;
			}
		}

		return score;
	}

	@Override
	public String description() {
		return "Place the highest number of " + GameColors.colorToString(targetGoal) 
		+ " unit cells along the outer perimeter of the board. Corner cell count twice toward the final score!";
	}

}
