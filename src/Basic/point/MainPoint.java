package point;
public class MainPoint {
	public static void main(String[] args) {
		Point a = new Point(3, 4);
        Point b = new Point(6, 8);
//        Point c = b.clone();
        Point d = new Point();
        
        
        System.out.println("distance :"+d.distance(a)); 

        System.out.println("a:" + a);
//        System.out.println("c:" + c);
        System.out.println("d:" + d);

//        c.setX(42);

        System.out.println("b:" + b);
//        System.out.println("c:" + c);
		
	}
}
