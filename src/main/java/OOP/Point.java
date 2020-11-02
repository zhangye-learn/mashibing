package OOP;

public class Point {

    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double calcDistance(Point p){

        double distance = Math.sqrt((p.x-x)*(p.x-x)+(p.y-y)*(p.y-y));
        return distance;
    }

    public static void main(String[] args) {
        Point point = new Point(2,3);
        Point p2 = new Point(5,7);
        Double distance = p2.calcDistance(point);
        System.out.println("distance....%s" + distance);

    }
}
