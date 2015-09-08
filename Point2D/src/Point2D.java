
public class Point2D{
		public int x;
		public int y;
		public Point2D(){
			this.x = 0;
			this.y = 0;
		}
		public Point2D(int x, int y){
			this.x = x;
			this.y = y;
		}
		public Point2D add(int dx, int dy){
			return new Point2D(this.x + dx, this.y + dy);
		}
		public void translate(Point2D p){
			this.x = x + p.x;
			this.y = y + p.y;
		}
		public double distance(int x, int y){
			double distance = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2)); 
			return distance;
		}
		public String toString(){
			String coordinates = new String("(" + this.x + ", " + this.y + ")");
			return coordinates;
		}
	
	public static void main(String[] args) {
		Point2D p = new Point2D(0, 5);
		System.out.println(p.toString());
		return;
	}

}
