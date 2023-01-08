public class MultiPerceptron {
    private int m; // количество классов
    private int n; // количество инпутов
    private Perceptron[] perceptrons;

    // Creates a multi-perceptron object with m classes and n inputs.
    public MultiPerceptron(int m, int n) {
        // стандартное присваивание аргументов
        this.m = m;
        this.n = n;
        this.perceptrons = new Perceptron[m];
        // записываем в созданный массив perceptrons значения Perceptron
        for (int i = 0; i < m; i++) {
            perceptrons[i] = new Perceptron(n);
        }
    }

    // Returns the number of classes m.
    public int numberOfClasses() {
        return m;
    }

    // Returns the number of inputs n (length of the feature vector).
    public int numberOfInputs() {
        return n;
    }

    // Returns the predicted label (between 0 and m-1) for the given input.
    public int predictMulti(double[] x) {
        double[] pm = new double[m];
        for (int i = 0; i < m; i++) {
            pm[i] = perceptrons[i].weightedSum(x);
        }
        int max = 0;
        for (int i = 0; i < pm.length; i++) {
            if (pm[i] > pm[max]) {
                max = i;
            }
        }
        return max;
    }

    // Trains this multi-perceptron on the labeled (between 0 and m-1) input.
    public void trainMulti(double[] x, int label) {
        for (int i = 0; i < m; i++) {
            if (i == label)
                perceptrons[i].train(x, 1);
            else
                perceptrons[i].train(x, -1);
        }
    }

    // perceptrons[label].train(x, +1);
    // perceptrons[AllOtherClasses].train(x, -1);

    // Returns a string representation of this MultiPerceptron.
    public String toString() {
        String s = new String("");
        for (int i = 0; i < m - 1; i++) {
            s += perceptrons[i].toString() + ", ";
        }
        s = s + perceptrons[m - 1];
        return "(" + s + ")";
    }

    // Tests this class by directly calling all instance methods.
    public static void main(String[] args) {
        /* int m = 2;
        int n = 3;
        double[] training1 = { 5.0, -4.0, 3.0 };
        MultiPerceptron perceptron = new MultiPerceptron(m, n);
        StdOut.println(perceptron);
        // perceptron.trainMulti(training1, 1); */
        int m = 2;
        int n = 3;
        double[] training1 = { 5.0, -4.0, 3.0 };
        double[] training2 = { 2.0, 3.0, -2.0 };
        double[] training3 = { 4.0, 3.0, 2.0 };
        double[] training4 = { -6.0, -5.0, 7.0 };
        MultiPerceptron perceptron = new MultiPerceptron(m, n);
        StdOut.println(perceptron);
        perceptron.trainMulti(training1, 1);
        StdOut.println(perceptron);
        perceptron.trainMulti(training2, 0);
        StdOut.println(perceptron);
        perceptron.trainMulti(training3, 1);
        StdOut.println(perceptron);
        perceptron.trainMulti(training4, 0);
        StdOut.println(perceptron);
    }
}
