package hw1;

public class countPrime {

	public int countPrime(long a, long b)
	{

		int sqrt = (int) Math.sqrt(b);
		boolean[] isP = new boolean[sqrt + 1];

		int l = (int) (b-a+1);
		boolean[] numP = new boolean[l];

		for (int i = 2; i <= sqrt; i++) {
			if (!isP[i]) {

				for (int j = i; j <= sqrt/i; j++) {
					isP[i*j] = true;
				}

				if (a > sqrt) {
					if (a % i == 0) {
						for (long k = a; k <= b; k = k + i) {
							numP[(int) (k - a)] = true;
						}
					} else {
						for (long k = a + i - a % i; k <= b; k = k + i) {
							numP[(int) (k - a)] = true;
						}
					}
				} 
				else {
					for (int j = i * i; j <= b; j = j + i) {
						if (j >= a)
							numP[(int) (j - a)] = true;
					}
				}
			}
		}
		
		int count = 0;
		for (int i = 0; i < numP.length; i++) {
			if (!numP[i]) {
				count++;
			}
		}
		return count;
	}


}
