# LLM - Java Neural Network From Scratch

This is an experimental project that implements an Artificial Neural Network (ANN) in pure Java, without relying on any external Machine Learning libraries. The system utilizes the concepts of weighted sum, error calculation, and Gradient Descent to fine-tune mathematical weights and reconstruct a user-defined text character by character.

## How It Works

1. Data Input: The user types a text string into the console.
2. ASCII Mapping: The system breaks the text down into individual characters and converts each one into its corresponding decimal value from the ASCII table (e.g., 'A' becomes 65.0).
3. Training and Weight Adjustment: For each character, the network generates 5 random weights and starts a cycle of up to 3,000 epochs. In each iteration:
   * It calculates the weighted sum of the inputs (x) by the weights (w).
   * It measures the distance between the current guess and the actual character value (Error).
   * It applies Gradient Descent using a specific learning rate to optimize and correct the weights.
4. Convergence: As soon as the error approaches zero or the epoch limit is reached, the final value is rounded and cast back into its original character form, dynamically rebuilding the string.

## Technologies Used

* Language: Java 17+
* Recommended IDE: IntelliJ IDEA

## Project Structure

```text
LLM/
├── .gitignore         # File to ignore local folders (out, .idea)
├── LLM.iml            # IntelliJ module configuration file
└── src/
    ├── Main.java      # Application entry point and Scanner initialization
    └── Model.java     # Core neural network and gradient descent logic
```

## How to Run the Project

1. Make sure you have JDK 17 or higher installed on your machine.
2. Clone this repository:
   ```bash
   git clone https://github.com
   ```
3. Open the project folder in your preferred IDE (e.g., IntelliJ IDEA).
4. Run the Main.java class.
5. Type any text into the terminal and watch the AI converge to the correct characters in real time.
