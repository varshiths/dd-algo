public class Frame{
	private int upperbound;
	private int lowerbound;

	public Frame(int up, int lr){
		upperbound = up; 
		lowerbound = lr;
	}

	public void pushLimits(int []d){
		d[0] = upperbound;
		d[1] = lowerbound;
	}

	public void print(){
		System.out.print(upperbound);
		System.out.print(' ');
		System.out.println(lowerbound);
	}
}

class StaticGesture extends Gesture {

	public StaticGesture(int snsrs, int pts){
		super(snsrs,pts);
	}

	public void updateFrame(int [][][] sensorLimits){
		//super.updateFrame(sensorLimits);
		for (int i=0; i<sensors; i++) {
			for (int j=0; j<dataPoints; j++) {
				for (int k=0; k<2; k++) {
					eFrame[i][j][k] = sensorLimits[i][j][k];
				}
			}
		}
	}

	public void updateFrame(int []fing){

		Frame []f = new Frame[levels];

		for (int i=0; i<levels; i++) {
			f[i] = new Frame(up + i*((lr-up)/levels),up + (i+1)*((lr-up)/levels));
			//f[i].print();
		}
		int [][][]data = new int [sensors][dataPoints][2];
		//int q; int []fing = {0,0,0,0,0};
		//fing = new int[] {0,0,0,0,0};
		// data[q] : data for neutral
		for (int j=0; j<dataPoints; j++) {
			for (int i=0; i<sensors; i++) {
				f[fing[i]].pushLimits(data[i][j]);
			}
		}

		this.updateFrame(data);
	}

	public void printData(){
		for (int i=0; i<sensors; i++) {
	//		for (int j=0; j<dataPoints; j++) {
					System.out.print(eFrame[i][0][0] + " ");
					System.out.print(eFrame[i][0][1]);
	//		}
			System.out.print('\n');
		}
	}
}