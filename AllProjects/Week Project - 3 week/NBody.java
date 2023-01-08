public class NBody {
    public static void main(String[] args) {
        // Включаем двойную буферизацию и поддержку анимации
        StdDraw.enableDoubleBuffering();
        // Принимаем 2 аргумента
        double tau = Double.parseDouble(args[0]);
        double delta = Double.parseDouble(args[1]);
        int n = StdIn.readInt(); // Количество небесных тел
        double radius = StdIn.readDouble(); // Радиус вселенной
        // Сразу определяем размер вселенной
        StdDraw.setXscale(-radius, radius);
        StdDraw.setYscale(-radius, radius);
        // Создаем массивы для каждого вида входящей информации
        double[] xp = new double[n];
        double[] yp = new double[n];
        double[] xv = new double[n];
        double[] yv = new double[n];
        double[] bodyMasses = new double[n];
        String[] imgName = new String[n];
        // Через цикл присваиваем значения в массивы по видам
        for (int i = 0; i < n; i++) {
            xp[i] = StdIn.readDouble();
            yp[i] = StdIn.readDouble();
            xv[i] = StdIn.readDouble();
            yv[i] = StdIn.readDouble();
            bodyMasses[i] = StdIn.readDouble();
            imgName[i] = StdIn.readString();
        }
        StdAudio.playInBackground("2001.wav"); // Добавляем фоновый звук
        double G = 6.67e-11;
        for (double t = 0.0; t < tau; t = t + delta) {
            double[] fx = new double[n];
            double[] fy = new double[n];
            for (int i = 0; i < n; i++) {
                fx[i] = 0;
                fy[i] = 0;
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        double dx = xp[j] - xp[i];
                        double dy = yp[j] - yp[i];
                        double r = Math.sqrt((dx * dx) + (dy * dy));
                        double f = (G * bodyMasses[i] * bodyMasses[j]) / (r * r);
                        fx[i] += f * (dx / r);
                        fy[i] += f * (dy / r);
                    }
                }
            }
            // System.out.println("t = " + t);
            StdDraw.picture(0, 0, "starfield.jpg");
            for (int i = 0; i < n; i++) {
                double ax = fx[i] / bodyMasses[i];
                double ay = fy[i] / bodyMasses[i];
                xv[i] += ax * delta;
                yv[i] += ay * delta;
                xp[i] += xv[i] * delta;
                yp[i] += yv[i] * delta;
                StdDraw.picture(xp[i], yp[i], imgName[i]);
            }
            StdDraw.show();
            StdDraw.pause(20);
        }
        // Печатаем полученные значения
        StdOut.printf("%d\n", n);
        StdOut.printf("%.2e\n", radius);
        for (int i = 0; i < n; i++) {
            StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
                          xp[i], yp[i], xv[i], yv[i], bodyMasses[i], imgName[i]);
        }
    }
}
