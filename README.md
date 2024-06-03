# Mondrian Sort

<img width="1470" alt="250 A3 Game" src="https://github.com/kayvandharsee/Mini-Mips_CPU_Project/assets/135669229/e452d561-6f65-49fd-aa60-6eba2ef782e6">

### Overview
This game is a visual interactive assignment designed for the COMP 250 course at McGill University, focusing on modeling hierarchical data using trees and implementing recursive methods. The game board is a Mondrian-esque grid of colored squares, with each player striving to achieve their unique goals by manipulating blocks through rotations, reflections, and smashing. Out of respect for the course, I will not be sharing my code publicly. Please message me to request to see the source code

### Instructions to Play
- Download the assignment3 package.
- Ensure Java is installed on your machine.
- Open the assignment3 package and open the file titled BlockGame.java.
- Run BlockGame.java to start the game.

### Game Rules
- Each player has a goal, either a "Blob Goal" or a "Perimeter Goal", related to the colors on the board.
- Players can rotate, reflect, or smash blocks on the board to score points towards their goal.
- The game continues for a fixed number of turns.
- The highest score at the end wins.

### Project Structure
The core of the project lies within three main classes:

- **Block.java**: Represents the game board. A block can either be a solid color square or subdivided into four smaller blocks, forming a recursive structure.
- **PerimeterGoal.java and BlobGoal.java**: Define two types of game goals. One aims to maximize the perimeter covered by a specific color, and the other seeks to form the largest connected area ("blob") of a color.

### Implementation Highlights
- **Quad-Tree Data Structure**: Used to represent the game board in a hierarchical manner, enabling efficient operations such as rotations, reflections, and smash (subdividing a block into four new random blocks).
- **Recursive Methods**: To navigate and manipulate the quad-tree structure, illustrating the power of recursion in handling complex data structures.
- **Dynamic Gameplay**: Players can interact with the board through a GUI, selecting blocks to rotate, reflect, or smash, with the goal of maximizing their score according to their assigned objective.
- **Scoring System**: Implements algorithms to calculate scores based on the game's objectives, taking into account the board's recursive structure.

### Challenges and Learnings
- The primary challenge was managing the recursive nature of the quad-tree structure, especially when implementing the game's rules and ensuring that all manipulations maintain the integrity of the board.
- Learned the importance of designing flexible data structures and the practical application of recursive algorithms in creating interactive applications.
- Gained a deeper understanding of Java's inheritance and how it can be used to streamline code through shared functionality and polymorphism.
