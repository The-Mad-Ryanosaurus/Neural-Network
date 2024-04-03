package ie.atu.sw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jhealy.aicme4j.NetworkBuilderFactory;
import jhealy.aicme4j.net.Activation;
import jhealy.aicme4j.net.Loss;

// Class for training a neural network to control a ship
public class ShipTrainer {

    public static void main() throws Exception {
        new ShipTrainer().startTraining(); // Instantiate the shipTrainer class and start the training process
        System.out.println("Ship Trainer Main Method"); // Print message indicating main method execution
    }

    // Method to start the training process
    public void startTraining() throws Exception {
        System.out.println("Starting training process"); 
        try {
            double[][] inputData = readFromCSV("../resources/data.csv"); // Read input data from CSV file
            double[][] expectedOutput = readFromCSV("../resources/expected.csv"); // Read expected output data from CSV file

            System.out.println("Expected output length: " + expectedOutput[0].length); // Print length of expected output

            // Build and train the neural network
            var neuralNet = NetworkBuilderFactory.getInstance()
                    .newNetworkBuilder()
                    .inputLayer("Input", 7) // Input layer with 7 neurons
                    .hiddenLayer("Hidden", Activation.TANH, 5) // Hidden layer with 5 neurons and TANH activation function
                    .outputLayer("Output", Activation.TANH, 1) // Output layer with 1 neuron and TANH activation function
                    .train(inputData, expectedOutput, 0.001, 0.93, 50000, 0.00001, Loss.SSE) // Train the network with specified parameters
                    .save("../resources/trainedShipModel.data") // Save the trained model to a file
                    .build(); // Build the neural network

            System.out.println("Trained Neural Network: " + neuralNet); // Print trained neural network

        } catch (Exception e) { // Catch any exceptions
            e.printStackTrace(); // Print stack trace of exception
        }
    }

    // Method to read data from a CSV file
    private double[][] readFromCSV(String filePath) throws IOException {
        List<double[]> dataList = new ArrayList<>(); // Create a list to store data read from CSV file

        // Open CSV file for reading using try-with-resources to ensure it's closed properly
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) { // Read each line from the CSV file
                String[] parts = line.split(","); // Split the line into parts using comma as delimiter
                double[] rowData = new double[parts.length]; // Create an array to store data for the current row
                for (int i = 0; i < parts.length; i++) {
                    rowData[i] = Double.parseDouble(parts[i]); // Parse each part to double and store in the array
                }
                dataList.add(rowData); // Add the array of data to the list
            }
        }
        return dataList.toArray(new double[0][]); // Convert list to a 2D array and return
    }

}