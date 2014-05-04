
class magic_square_class {
	
	boolean magic_square(int[][] a) {
		System.out.println("Мagic square?"); //$NON-NLS-1$
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " "); //$NON-NLS-1$
			}
			System.out.println();
		}
	
		
		int n = a.length*2+2; 
		int[] x = new int[n]; //Масив в който се събира сумата за всеки ред, колона, диагонал в отделна клетка
		for (int i = 0; i < n; i++) { // Запълваме масива с 0, за да извършим събиранията по редове, колони и диагонали
			x[i] = 0;
			}
		
		for (int i = 0; i < a.length; i++) {
			x[(n-2)] += a[i][i]; // В предпоследната клетка от масива х задаваме диагоанал [i][i] (00, 11, 22)
			x[(n-1)] += a[(a.length-1-i)][i]; // В последната клетка от масива х задаваме другия диагонал (20, 11, 02) 
			
			for (int j = 0; j < a[i].length; j++) {
				x[i] += a[i][j];
				x[(a.length + i)] += a[j][i];
			}
		}

	 	for (int i=0; i < n-1; i++) {
	 		if (x[i] != x[i+1]) {
	 			return false;
	 		}
	 	}
	 		 	
	 	return true;
			
	}
}


public class Pr33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int[][] m1 = new int[][]{
					{4,9,2},
					{3,5,7},
					{8,1,6}
			};
			int[][] m2 = new int[][]{
					{4,9,2},
					{3,5,7},
					{8,1,6}
			};
			int[][] m3 = new int[][]{
					{4,9,2},
					{3,5,7},
					{8,1,6}
			};
			
			
						

			magic_square_class msc = new magic_square_class();
			System.out.println(msc.magic_square(m1));
			System.out.println(msc.magic_square(m2));
			System.out.println(msc.magic_square(m3));
	}
}
