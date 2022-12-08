import java.awt.Color;
/* Luminance.- библиотека для преобразования цвета
        Picture pict = new Picture("name.jpg");// args[0]
        Color curColor = pict.get(x, y)
        Color newColor = Luminance.toGray(curColor);
        pict.put(x,y,Color); */

public class Grayscale {
    public static void main(String[] args) {
        // Принимаем картинку и через класс Picture записываем его данные
        Picture drawing = new Picture(args[0]);
        // Назначаем ширину и высоту изображения
        int width = drawing.width();
        int height = drawing.height();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                // Через класс Color забираем цвет в каждом пикселе по ширине и высоте и записываем в новый объект
                Color curColor = drawing.get(i, j);
                // Через класс Luminance конвертируем curColor в серый и записываем в объект greyColor
                Color greyColor = Luminance.toGray(curColor);
                // Записываем в новые пиксели i, j цвет greyColor
                drawing.set(i, j, greyColor);
            }
        }
        // Показываем объект drawing через метод show
        drawing.show();
    }
}
