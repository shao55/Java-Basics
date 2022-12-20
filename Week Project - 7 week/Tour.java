public class Tour {
    // переменные для Tour
    private Node start;

    // nested class Node
    private class Node {
        private Point p;
        private Node next;
    }

    // пустой конструктор
    public Tour() {
        start = null;
    }

    // creates the 4 point tour a-b-c-d-a (for debugging)
    // конструктор для 4 точек
    public Tour(Point a, Point b, Point c, Point d) {
        start = new Node();
        start.p = a;
        Node second = new Node();
        second.p = b;
        Node third = new Node();
        third.p = c;
        Node fourth = new Node();
        fourth.p = d;
        start.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = start;
    }

    // returns the number of points in the tour
    public int size() {
        Node current = start;
        if (start == null) return 0;
        int count = 0;
        do {
            count++;
            current = current.next;
        } while (!current.equals(start));
        return count;
    }

    // returns the length of this tour
    public double length() {
        Node current = start;
        double length = 0.0;
        if (start == null) return length;
        do {
            length += current.p.distanceTo(current.next.p);
            current = current.next;
        } while (!current.equals(start));
        return length;
    }

    // returns a string representation of this tour
    public String toString() {
        StringBuilder t = new StringBuilder();
        Node current = start;
        if (start == null) return "";
        else {
            do {
                t.append(current.p);
                t.append("\n");
                current = current.next;
            } while (!current.equals(start));
            return t.toString();
        }
    }

    // draws this tour to standard drawing
    public void draw() {
        Node current = start;
        if (start != null) {
            do {
                current.p.drawTo(current.next.p);
                current = current.next;
            } while (!current.equals(start));
        }
    }


    // inserts p using the nearest neighbor heuristic
    public void insertNearest(Point p) {
        if (start == null) {
            Node newP = new Node();
            newP.p = p;
            newP.next = newP;
            start = newP;
        }
        else {
            double min = p.distanceTo(start.p);
            Node current = start;
            Node best = start;
            do {
                double distance = p.distanceTo(current.p);
                if (distance < min) {
                    min = distance;
                    best = current;
                }
                current = current.next;
            } while (!current.equals(start));
            Node newPoint = new Node();
            newPoint.p = p;
            newPoint.next = best.next;
            best.next = newPoint;
        }

    }

    // inserts p using the smallest increase heuristic
    public void insertSmallest(Point p) {
        if (start == null) {
            Node newP = new Node();
            newP.p = p;
            newP.next = newP;
            start = newP;
        }
        else {
            Node newP = new Node();
            newP.p = p;
            Node current = start;
            Node best = start;
            newP.next = start.next;
            start.next = newP;
            double initial = start.p.distanceTo(start.next.next.p);
            double newL = start.p.distanceTo(start.next.p) + start.next.p
                    .distanceTo(start.next.next.p);
            double deltaL = newL - initial;
            do {
                // StdOut.println(deltaL);
                current.next = current.next.next;
                current = current.next;
                newP.next = current.next;
                current.next = newP;
                initial = current.p.distanceTo(current.next.next.p);
                newL = current.p.distanceTo(current.next.p) + current.next.p
                        .distanceTo(current.next.next.p);
                double newDelta = newL - initial;
                if (newDelta < deltaL) {
                    deltaL = newDelta;
                    best = current;
                }
            } while (!current.equals(start));
            current.next = current.next.next;
            newP.next = best.next;
            best.next = newP;
        }
    }

    public static void main(String[] args) {

        // define 4 points, corners of a square
        Point a = new Point(1.0, 1.0);
        Point b = new Point(1.0, 4.0);
        Point c = new Point(4.0, 4.0);
        Point d = new Point(4.0, 1.0);

        // create the tour a -> b -> c -> d -> a
        Tour squareTour = new Tour(a, b, c, d);

        // create an empty tour
        Tour emptyTour = new Tour();

        // print the size to standard output
        int size = squareTour.size();
        StdOut.println("# of points = " + size);

        // print the tour length to standard output
        double length = squareTour.length();
        StdOut.println("Tour length = " + length);

        // System.out.println(p);

        // print square and empty tour to standard output
        StdOut.println(squareTour);

        // определяем размеры
        StdDraw.setXscale(0, 6);
        StdDraw.setYscale(0, 6);
        squareTour.draw();
        emptyTour.draw();


        // тестирование insertNearest
        StdDraw.setXscale(0, 6);
        StdDraw.setYscale(0, 6);
        Point e = new Point(5.0, 6.0);
        squareTour.insertNearest(e);
        squareTour.draw();
        emptyTour.insertNearest(e);
        emptyTour.draw();
        StdOut.println(squareTour);
        StdOut.println(emptyTour);

    }

}
