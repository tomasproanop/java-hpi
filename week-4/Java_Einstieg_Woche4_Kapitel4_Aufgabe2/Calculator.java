public class Calculator {

	int calculateSum(int[] numbers) {
		// Berechne hier die Summe aller Zahlen mit einer foreach Schleife und gib sie zurück:
		
		int sum2 = 0;
		for (int elems : numbers) {
		    sum2 += elems;
		}
		
        return sum2;
	}  
	

	double calculateMean(int[] numbers) {
		double sum = calculateSum(numbers);
		// Berechne hier das Arithmetische Mittel und gib es zurück:
		
		int n = numbers.length;
		double sum3 = 0;
		double mean = 0;
		
		for (double elems2 : numbers) {
		    
		    sum3 += elems2;
		    mean = sum3 / n;
	}
	return mean;
}   

}
