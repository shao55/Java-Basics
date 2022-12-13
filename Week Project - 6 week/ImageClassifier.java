import java.awt.Color;

public class ImageClassifier {
    // Функция для доступа к данным из изображения
    public static double[] extractFeatures(Picture picture) {
        // Новый объект из ранее описанной функции Picture
        Picture pic = new Picture(picture);
        // Считывание данных
        int width = pic.width();
        int height = pic.height();
        // Массив размером с пикселей картинки
        double[] x = new double[width * height];
        int k = 0;
        // convert to grayscale
        // Цикл для доступа к цветам и записи их в переменную
        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height; row++) {
                Color color = pic.get(row, col);
                x[k] = color.getRed();
                k++;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        In training0 = new In(args[0]);
        // Считывание данных из txt документа - первые 3 значения
        int m0 = training0.readInt();
        int width0 = training0.readInt();
        int height0 = training0.readInt();
        MultiPerceptron im0 = new MultiPerceptron(m0, width0 * height0);
        String filename0 = "";
        int label0 = 0;
        // Считывать данные пока документ не пустой
        while (!training0.isEmpty()) {
            // Считывание остальных данных до конца из txt документа
            filename0 = training0.readString();
            label0 = training0.readInt();
            Picture p0 = new Picture(filename0);
            double[] x0 = extractFeatures(new Picture(p0));
            im0.trainMulti(x0, label0);
        }

        In training1 = new In(args[1]);
        int m1 = training1.readInt();
        int width1 = training1.readInt();
        int height1 = training1.readInt();
        double count = 0;
        double corrects = 0;
        String filename1 = "";
        int label1 = 0;
        while (!training1.isEmpty()) {
            filename1 = training1.readString();
            label1 = training1.readInt();
            Picture p1 = new Picture(filename1);
            double[] x1 = extractFeatures(new Picture(p1));
            im0.predictMulti(x1);
            if (im0.predictMulti(x1) != label1) {
                System.out.println(filename1);
                count++;
            }
            else {
                corrects++;
            }
        }
        System.out.println(count / (corrects + count));
    }
}
