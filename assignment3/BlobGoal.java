package assignment3;

import java.awt.Color;

public class BlobGoal extends Goal{

	public BlobGoal(Color c) {
		super(c);
	}

	@Override
	public int score(Block board) {
		Color[][] unitCells = board.flatten();
		boolean[][] visited = new boolean[unitCells.length][unitCells[0].length];
		int maxBlobSize = 0;

		// Iterate through the board and find the largest connected blob of the target color
		for (int i = 0; i < unitCells.length; i++) {
			for (int j = 0; j < unitCells[0].length; j++) {
				if (unitCells[i][j].equals(targetGoal) && !visited[i][j]) {
					int blobSize = undiscoveredBlobSize(i, j, unitCells, visited);
					maxBlobSize = Math.max(maxBlobSize, blobSize);
				}
			}
		}

		return maxBlobSize;
	}

	@Override
	public String description() {
		return "Create the largest connected blob of " + GameColors.colorToString(targetGoal) 
		+ " blocks, anywhere within the block";
	}


	public int undiscoveredBlobSize(int i, int j, Color[][] unitCells, boolean[][] visited) {
		// Check if the cell is out of bounds, has been visited, or is not the target color
		if (i < 0 || i >= unitCells.length || j < 0 || j >= unitCells[0].length || visited[i][j] || !unitCells[i][j].equals(targetGoal)) {
			return 0;
		}

		// Mark the cell as visited
		visited[i][j] = true;

		// Recursively explore the neighboring cells and count the size of the blob
		return 1
				+ undiscoveredBlobSize(i - 1, j, unitCells, visited)  // Up
				+ undiscoveredBlobSize(i + 1, j, unitCells, visited)  // Down
				+ undiscoveredBlobSize(i, j - 1, unitCells, visited)  // Left
				+ undiscoveredBlobSize(i, j + 1, unitCells, visited); // Right
	}

}
