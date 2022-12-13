public class Perceptron {
    // Instance variables
    private int n;
    private double[] weights;

    // Creates a perceptron with n inputs.
    public Perceptron(int n) {
        // новый массив размером n
        weights = new double[n];
    }

    // Returns the number of inputs n.
    public int numberOfInputs() {
        // возврат длинны массива
        return weights.length;
    }

    // Returns the weighted sum of the weight vector and x.
    public double weightedSum(double[] x) {
        double ws = 0;
        for (int i = 0; i < weights.length; i++) {
            // расчет по формуле
            ws += weights[i] * x[i];
        }
        return ws;
    }

    // Predict the label (+1 or -1) of input x.
    public int predict(double[] x) {
        // результат из weightedSum записываем в переменную
        double result = weightedSum(x);
        if (result > 0) {
            return 1;
        }
        else {
            return -1;
        }
    }

    // Trains this perceptron on the labeled (+1 or -1) input x.
    public void train(double[] x, int label) {
        // результат из predict записываем в переменную
        int predRes = predict(x);
        // при условии из predict и label из условия (тестирование)
        if (predRes == 1 && label == -1) {
            for (int i = 0; i < weights.length; i++) {
                // записываем в массив weights каждый элемент результата разницы массива и введенных данных из training
                weights[i] = weights[i] - x[i];
            }
        }
        // обратный результат - сумма
        else if (predRes == -1 && label == 1) {
            for (int i = 0; i < weights.length; i++) {
                weights[i] = weights[i] + x[i];
            }
        }
    }

    // Returns a string representation of this perceptron.
    public String toString() {
        String resString = "";
        for (int i = 0; i < weights.length; i++) {
            // для первого значения
            if (i == 0) {
                resString += weights[i];
            }
            // для остальных значений
            else {
                resString = resString + ", " + weights[i];
            }
        }
        // готовый результат со скобками
        String result = "(" + resString + ")";
        return result;
    }

    // Tests this class by directly calling all instance methods.
    public static void main(String[] args) {
        /* double[] training1 = { 5.0, -4.0, 3.0 };
        // передача значения для тестирования
        int n = 3;
        // создание нового перцептрона с n количеством
        Perceptron x = new Perceptron(n);
        // печать метода, показывающий количество инпутов
        StdOut.println(x.numberOfInputs());
        // тестирование метода toString
        StdOut.println(x);
        StdOut.println(x.weightedSum(training1)); */
        double[] training1 = { 5.0, -4.0, 3.0 }; // yes
        double[] training2 = { 2.0, 3.0, -2.0 }; // no
        double[] training3 = { 4.0, 3.0, 2.0 }; // yes
        double[] training4 = { -6.0, -5.0, 7.0 }; // no
        int n = 3;
        Perceptron perceptron = new Perceptron(n);
        StdOut.println(perceptron);
        perceptron.train(training1, +1);
        StdOut.println(perceptron);
        perceptron.train(training2, -1);
        StdOut.println(perceptron);
        perceptron.train(training3, +1);
        StdOut.println(perceptron);
        perceptron.train(training4, -1);
        StdOut.println(perceptron);
    }
}
