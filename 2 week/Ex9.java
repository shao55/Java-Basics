public class Ex9 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3 };
        int b[] = { 1, 2, 3 };

        // boolean x = (a == b);
        System.out.println(a == b);
        //    Строка 7 возвращает булево значение, т.к. оператор == сравниванит адреса массивов,
        //    а не их значения!
    }
}
