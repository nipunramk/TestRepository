public class DrawTriangle {
	
	public static void drawTriangle(int N) {
		for (int row = 0; row < N; row++)
		{
			
			for (int col = 0; col < N; col++)
			{
				if (col < row)
					System.out.print("*");
			}
			
		System.out.println("*");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawTriangle(10);
	}
	
	

}
