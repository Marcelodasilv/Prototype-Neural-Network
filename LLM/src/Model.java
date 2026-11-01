import java.util.*;

public final class Model {

    public final void NeuralNetwork(Scanner scanner) {

        var random = new Random();
        ArrayList<Double> values = new ArrayList<>();

        System.out.print("Write your text: ");
        String scanTxt = scanner.nextLine();

        double[] x = {0.10, 0.50, 0.90, 0.20, 0.95};

        try {

            for (int i = 0; i < scanTxt.length(); i++) {
                char character = scanTxt.charAt(i);
                values.add((double) character);
            }

            for (int i = 0; i < values.size(); i++) {
                System.out.println(String.valueOf(values.get(i)));
            }

            double rate = 0.001;

            String collection = "";

            for (int p = 0; p < values.size(); p++) {

                collection = collection;

                double w1 = random.nextDouble() * 0.40;
                double w2 = random.nextDouble() * 0.04;
                double w3 = random.nextDouble() * 0.10;
                double w4 = random.nextDouble() * 0.90;
                double w5 = random.nextDouble() * 0.50;

                for (int e = 1; e <= 3000; e++) {

                    double weighted = (x[0] * w1) + (x[1] * w2) + (x[2] * w3) + (x[3] * w4) + (x[4] * w5);

                    double error = weighted - values.get(p);

                    if (e % 500 == 0 || e == 1) {
                        System.out.println(e + " | Guess: " + weighted + " | Error: " + error + "\n");
                    }

                    if (Math.abs(error) < 0.0001) {
                        System.out.println("-> AI converged before the attempt limit!");
                        break;
                    }

                    w1 = w1 - (rate * error * x[0]);
                    w2 = w2 - (rate * error * x[1]);
                    w3 = w3 - (rate * error * x[2]);
                    w4 = w4 - (rate * error * x[3]);
                    w5 = w5 - (rate * error * x[4]);
                }

                double finalResult = (x[0] * w1) + (x[1] * w2) + (x[2] * w3) + (x[3] * w4) + (x[4] * w5);

                char letter = (char) Math.round(finalResult);

                String valueTrue = String.valueOf(letter);

                collection = collection + valueTrue;
                System.out.println(collection + "\n");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage() + " ===== " + e.getCause());
        }
    }
}