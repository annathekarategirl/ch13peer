public class Ch13Peer {
// Main method
public static void main(String[] args) {
// Create two comparable circles
Circle1 circle1 = new Circle1(5);
Circle1 circle2 = new Circle1(4);
// Display the max circle
Circle1 circle = (Circle1)GeometricObject1.max(circle1, circle2);
System.out.println("The max circle's radius is " +
circle.getRadius());
System.out.println(circle);
}
}
abstract class GeometricObject1 implements Comparable {
// Implement it
    public int compareTo(GeometricObject1 o){
        return 0; //placeholder
    }

}
// Circle.java: The circle class that extends GeometricObject
class Circle1 extends GeometricObject1 {
// Implement it
}