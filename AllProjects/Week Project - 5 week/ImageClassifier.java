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
                // int getttedColor = 0;
                // getttedColor = color.getRed();
                // System.out.println(getttedColor);
                x[k] = color.getRed();
                // Color gray = Luminance.toGray(color);
                // picture.set(col, row, gray);
                k++;
            }
        }
        // печать для проверки элементов массива
        // for (int i = 0; i < x.length; i++) {
        //     System.out.println(x[i]);
        // }
        // picture.show();
        return x;
    }

    public static void main(String[] args) {
        In training0 = new In(args[0]);
        // Считывание данных из txt документа - первые 3 значения
        int m0 = training0.readInt();
        int width0 = training0.readInt();
        int height0 = training0.readInt();
        // System.out.println(m);
        // System.out.println(width);
        // System.out.println(height);
        MultiPerceptron im0 = new MultiPerceptron(m0, width0 * height0);
        String filename0 = "";
        int label0 = 0;
        // Считывать данные пока документ не пустой
        while (!training0.isEmpty()) {
            // Считывание остальных данных до конца из txt документа
            filename0 = training0.readString();
            label0 = training0.readInt();
            // Проверка
            // System.out.println(filename);
            // System.out.println(label);
            Picture p0 = new Picture(filename0);
            // p0.show();
            double[] x0 = extractFeatures(new Picture(p0));
            im0.trainMulti(x0, label0);
        }

        In training1 = new In(args[1]);
        int m1 = training1.readInt();
        int width1 = training1.readInt();
        int height1 = training1.readInt();
        // System.out.println(m);
        // System.out.println(width);
        // System.out.println(height);
        MultiPerceptron im1 = new MultiPerceptron(m1, width1 * height1);
        double count = 0;
        double corrects = 0;
        String filename1 = "";
        int label1 = 0;
        // double total = count + corrects;
        while (!training1.isEmpty()) {
            filename1 = training1.readString();
            label1 = training1.readInt();
            // System.out.println(filename);
            // System.out.println(label);
            Picture p1 = new Picture(filename1);
            // p1.show();
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
