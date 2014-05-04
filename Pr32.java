import java.util.Scanner;


class isPrimeClass { //Метод чрез, който определяме дали дадено число е просто или не
	boolean isPrime(int hnumber) {
		int maxDivider = (int)Math.sqrt(hnumber);
		for (int i = 2; i <= maxDivider; i++ ) {
			if (hnumber % i == 0) {
				return false;
			}
		}
		return true;
	}
}


class inputNumberClass {
	Scanner s = new Scanner(System.in);
	int inNumber = 0;
	int inputNumber() { //Метод чрез, който въвеждаме цяло положително четно число по-голямо от 2
	do {
		System.out.print("Въведете цяло ЧЕТНО число по-голямо от 2:"); //$NON-NLS-1$
		while (!s.hasNextInt()){
			
		System.out.print("Това не е число. Опитайте отново:"); //$NON-NLS-1$
		s.next();
		}
		inNumber = s.nextInt();
	}
	while ((inNumber <= 2) || (inNumber % 2 != 0));
	s.close();
	return inNumber;
	}
}


class goldbachClass {
	void goldbach(int n) {
		isPrimeClass prime = new isPrimeClass();
		for (int i = 0; i < n-1; i++) {
			if (prime.isPrime(n - i) && prime.isPrime(n + i))  {
				System.out.println(" [ " + (n - i) + " ] [ " + (n + i) + " ] "); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				
			}
		}
	}
}


public class Pr32 {
	public static void main(String[] args) {
		
		inputNumberClass inn = new inputNumberClass();
		int n = inn.inputNumber();
		System.out.println("Въведено е цяло четно число: " + n +", което може да се представи, като сбор от следните прости числа: "); //$NON-NLS-1$ //$NON-NLS-2$
		
		n = n/2;  
		goldbachClass g = new goldbachClass();
			
		g.goldbach(n);
	
	}
}
