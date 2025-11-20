package circle.opps;

class CreateCircle {
	float pi = 3.14f;
	float radius;	
	void setRadius(float r) {
		radius = r;
	}
	float calculateArea() {
		float area = pi * radius * radius;
		return (area);
	}
}


public class AreaOfCircle{
	public static void main (String []args) {
		float area;
		CreateCircle obj = new CreateCircle();
		obj.setRadius(3.0f);
		area = obj.calculateArea();
		System.out.println("area of radius = "+area);
	}
}