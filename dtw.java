import java.util.Scanner;

class DTW{
	public int m; public int n;
	public int [][]distance; public int [][]minAccDist;

	public void arrayInput(int []arr1, int []arr2){
		System.out.println("Inherited.");
	}

	public void arrayInput(int [][]arr1, int [][]arr2){
		System.out.println("Inherited.");
	}

	public void consoleInput(){
		System.out.println("Inherited.");	
	}

	public double distance(int p, int q){
		System.out.println("Inherited.");
		return 0;
	}	
	
	public void distanceProcess(){
		distance = new int[m][n];
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				distance[i][j] = (int) distance(i,j);
			}
		}

	}
	
	public void minAccDistProcess(){

		distanceProcess();
		
		minAccDist = new int[m][n];

		minAccDist[0][0] = distance[0][0];

		int w = 65536; // set window here
		w=Math.max(w,Math.abs(m-n));

		for (int i=1; i<Math.min(m,w); i++) {
			minAccDist[i][0] = distance[i][0] + minAccDist[i-1][0];
		}
		for (int j=1; j<Math.min(n,w); j++) {
			minAccDist[0][j] = distance[0][j] + minAccDist[0][j-1];
		}

		for (int i=1; i<m; i++) {
			for (int j=Math.max(1,i-w); j<Math.min(n,i+w); j++) {
				minAccDist[i][j] = distance[i][j] + Math.min( minAccDist[i-1][j-1], Math.min( minAccDist[i-1][j], minAccDist[i][j-1] ) );
			}
		}
	}

	public int dtwDistance(){
		
		minAccDistProcess();
		
		return minAccDist[m][n];
	}

	public int sdtwDistance(){

		return 0;

	}

	public void arrayPrint(int [][]array){
		System.out.print('\n');
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				String text = String.format("%03d", array[i][j]);
				boolean done = false;
				if(array[i][j]!=0){
					for (int k=0; k<text.length(); k++) {
						if(text.charAt(k)=='0' && !done) System.out.print(" ");
						else { System.out.print(text.charAt(k)); done = true; }
					}
				}
				else{
					for (int k=0; k<text.length()-1; k++) {
						System.out.print(" ");
					}
					System.out.print(0);
				}
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}

class DTWoneD extends DTW {
	public int []a; public int []b;

	public void arrayInput(int []arr1, int []arr2){
		a = arr1.clone(); b = arr2.clone();
		m = a.length; n = b.length;
	}

	public void consoleInput(){
		Scanner scan = new Scanner(System.in);
		m = scan.nextInt();
		n = scan.nextInt();

		scan = new Scanner(System.in);
		
		a = new int[m];
		for (int i=0; i<m; i++) {
			a[i] = scan.nextInt();																					
		}

		scan = new Scanner(System.in);

		b = new int[n];
		for (int i=0; i<n; i++) {
			b[i] = scan.nextInt();
		}

		//minAccDistProcess();
	}

	public double distance(int p, int q){
		return Math.abs(a[p] - b[q]);
	}

}

class DTWtwoD extends DTW {

	public int [][]a; public int [][]b;
	public int dimSize = 0;

	public void arrayInput(int [][]arr1, int [][]arr2){
		a = arr1.clone(); b = arr2.clone();
		m = a.length; n = b.length;
		dimSize = a[0].length;
	}

	public double distance(int p, int q){
		double totalSquared = 0;

		for (int i=0; i<dimSize; i++) {
			totalSquared += Math.pow(a[p][i] - b[q][i],2);
		}

		return Math.sqrt(totalSquared);
	}

	public int sdtwDistance(){

		minAccDistProcess();

		int mini = 65536;
		for (int i=0; i<a.length; i++) {
			mini = Math.min(mini,minAccDist[i][n-1]);
		}

		//arrayPrint(minAccDist);

		return mini;

	}

}