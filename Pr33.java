
class magic_square_class {
	
	boolean magic_square(int[][] array_square) {
		
		System.out.println("Мagic square?"); //$NON-NLS-1$
		for (int i = 0; i < array_square.length; i++) {
			for (int j = 0; j < array_square[i].length; j++) {
				System.out.print(array_square[i][j] + " "); //$NON-NLS-1$
			}
			System.out.println();
		}
			
		int n = array_square.length*2+2; // n е сумата от броя на редовете + колоните + двата диагонала на даден квадрат 
		int[] n_array = new int[n]; //Масив в който се събира сумата за всеки ред, колона, диагонал в отделна клетка
		
		for (int i = 0; i < n; i++) { // Запълваме масива с 0, за да извършим събиранията по редове, колони и диагонали
			n_array[i] = 0;
			}

		for (int i = 0; i < array_square.length; i++) {
			n_array[(n-2)] += array_square[i][i]; // В предпоследната клетка от масива n_array задаваме диагоанал [i][i] 
			n_array[(n-1)] += array_square[(array_square.length-1-i)][i]; // В последната клетка от масива n_array задаваме другия диагонал 
			
			for (int j = 0; j < array_square[i].length; j++) {
				n_array[i] += array_square[i][j]; // Първата част от масива n_array запълваме със сумата от клетките на даден i ред
				n_array[(array_square[i].length + i)] += array_square[j][i]; // В масива n_array от n_array[a.length+0] запълваме със сумата от клетките на дадена a.length колона
			}
		}

	 	for (int i=0; i < n-1; i++) {
	 		if (n_array[i] != n_array[i+1]) { //Определяме дали е вярно, че дадените стойности образуват магически квадрат
	 			return false;
	 		}
	 	}
	 	return true; // Наистина е магически квадрат
			
	}
}


public class Pr33 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			int[][] m1 = new int[][]{
					{1, 2, 3},
					{4, 5, 6},
					{7, 8, 9}
			};
			int[][] m2 = new int[][]{
					{4, 9, 2},
					{3, 5, 7},
					{8, 1, 6}
			};
			int[][] m3 = new int[][]{
					{7, 12, 1, 14},
					{2, 13, 8, 11},
					{16, 3, 10, 5},
					{9, 6, 15, 4}
			};
			
			int[][] m4 = new int[][]{
					{23, 28, 21},
					{22, 24, 26},
					{27, 20, 25}
			};
			
			int[][] m5 = new int[][]{
					{16, 23, 17},
					{78, 32, 21},
					{17, 16, 15}
			};
			
			magic_square_class msc = new magic_square_class();
			
			System.out.println(msc.magic_square(m1));
			System.out.println(msc.magic_square(m2));
			System.out.println(msc.magic_square(m3));
			System.out.println(msc.magic_square(m4));
			System.out.println(msc.magic_square(m5));

	}
	
}
