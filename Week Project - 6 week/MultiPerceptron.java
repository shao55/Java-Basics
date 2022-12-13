public class MultiPerceptron {
    int m;
    int n;
    Perceptron[] perceptrons;

    // Creates a multi-perceptron object with m classes and n inputs.
    public MultiPerceptron(int m, int n)

    // Returns the number of classes m.
    public int numberOfClasses()

    // Returns the number of inputs n (length of the feature vector).
    public int numberOfInputs()

    // Returns the predicted label (between 0 and m-1) for the given input.
    public int predictMulti(double[] x)

    // Trains this multi-perceptron on the labeled (between 0 and m-1) input.
    public void trainMulti(double[] x, int label)

    perceptrons[label].

    train(x, +1);

    perceptrons[AllOtherClasses].

    train(x, -1);

    // Returns a string representation of this MultiPerceptron.
    public String toString()

    // Tests this class by directly calling all instance methods.
    public static void main(String[] args)
}
