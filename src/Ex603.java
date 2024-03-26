
public class Ex603 {

	public static void main(String[] args) {
		
		//1차원 배열
		double[] myGrades = new double[] {
				89.1, 95.0, 87.7, 88.3, 100.0
		};
		double sum = 0.0;
		double avg = 0.0;
		
		//2차원 배열
		double[][] myClassGrades = new double[][] {
				{89.1, 88.1, 87.1, 85.2, 81.4},
				{95.0, 94.2, 98.4, 93.5, 91.1},
				{87.7, 85.7, 83.1, 86.4, 84.3},
				{88.3, 52.4, 46.6, 27.8, 39.9},
				{100.0, 41.4, 37.8, 85.7, 100.0}
		};
		String[] myClasses = new String[] {
				"국어","수학","영어","사회","체육"
		};
		
		for (int i = 0; i <myClasses.length; i++) {
			System.out.println(myClasses[i] + ": ");
			for (int j = 0; j<5; j++) {
				System.out.println(myClassGrades[i][j]);
			}
			System.out.println();
		}
		
		/*
		for (double g: myGrades) {
			sum += g;
		}
		avg = sum / myGrades.length;
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
*/
	}

}
