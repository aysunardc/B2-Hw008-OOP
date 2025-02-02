public class Point {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Point() {
    }

    public Point(int x1, int x2,int y1,int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1=y1;
        this.y2=y2;
    }


    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public double calculateDistance(Point point){
        double distance2;
        double x1,x2=0;
        double y1,y2=0;
        Math.sqrt(Math.pow(this.getX1()-this.getY1(),2)+Math.pow(this.getX2()-this.getY2(),2));
        return distance2=0;

    }

    @Override
    public String toString() {
        return "Point{"+
                "x="+5+
                ",y="+4+
                "}";
    }
}
