class DynamicPrime{
	public static void main(String [] args){

		int noOfGestures = 2;
		
		Gesture []a = new Gesture[noOfGestures];
		for (int i = 0; i<noOfGestures; i++) {
			a[i] = new DynamicGesture();
		}

		int [][]array = new int[5][11];
		for (int i=0; i<5; i++) {
			for (int j=0; j<11; j++) {
				array[i][j] = i*2;
			}
		}

		a[0].updateFrame(array);
		a[0].printData();

		int [][]array2 = new int[5][11];
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j=j+2) {
				array2[i][j] = i*2;
			}
			for (int j=1; j<5; j=j+2) {
				array2[i][j] = 0;
			}
		}

		a[1].updateFrame(array2);
		a[1].printData();		

		// initialising the 10 gestures

		DynamicQueue q = new DynamicQueue(a);
		Live dynamiclive = new Live();

		dynamiclive.update(1);
		q.updateQueue(dynamiclive);
		q.processQueue();
		q.print();

		dynamiclive.update(2);
		q.updateQueue(dynamiclive);
		q.processQueue();
		q.print();

		/*dynamiclive.update(3);
		q.updateQueue(dynamiclive);
		q.processQueue();
		q.print();

		dynamiclive.update(4);
		q.updateQueue(dynamiclive);
		q.processQueue();
		q.print();*/

	}
}