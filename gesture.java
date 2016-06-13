class Gesture{
	public int dataPoints;
	public int sensors;
	public int [][][] eFrame;
	public int levels = 2;
	public int up = 60;
	public int lr = 200;

	public Gesture(int numberOfSensors, int points){
		dataPoints = points; sensors = numberOfSensors;
		eFrame = new int [sensors] [][];
		for (int i=0; i<sensors; i++) {
			eFrame[i] = new int [dataPoints][];
			for (int j=0; j<dataPoints; j++) {
				eFrame[i][j] = new int [2];
				/*for (int k=0; k<2; k++) {
					eFrame[i][j][k] = new int();
				}*/
			}
		}
	}

	public void printData(){
		for (int i=0; i<sensors; i++) {
			for (int j=0; j<dataPoints; j++) {
					System.out.print(eFrame[i][j][0]);
					System.out.print(eFrame[i][j][1] + " ");
			}
			System.out.print('\n');
		}
	}

	public void updateFrame(int [][][] sensorLimits){
		System.out.println("Updating frame...");
	}

	public void updateFrame(int []fing){
		System.out.println("Updating frame...");
	}

	public boolean isInFrame(Live live){
		for (int i=0; i<sensors; i++) {
			if(!((eFrame[i][0][0]<live.reading[i]) && (live.reading[i]<eFrame[i][0][1]))){
				return false;
			} 
		}
		return true;
	}

	public void execute(int gest){
		// perform system function
		System.out.println(gest);
		//System.console().readLine();
	}
}