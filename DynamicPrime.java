class DynamicPrime{

	public static void lineDraw(int [][]array, int start, int value, int count, int sensor, boolean incr){
		
		if (incr) {
			for (int i=0; i<count; i++) {
				array[start + i][sensor] = value + i;
			}			
		}
		else{
			for (int i=0; i<count; i++) {
				array[start + i][sensor] = value - i;
			}
		}
	}

	public static void setValue(int [][]array, int value, int sensor, int length){
		for (int i=0; i<length; i++) {
			array[i][sensor] = value;
		}
	}

	public static void main(String [] args){

		int noOfGestures = 12;
		int indx; int [][]array;
		int []cons;
		DynamicGesture []a = new DynamicGesture[noOfGestures];
		// initialising the 11 gestures
		
		indx=0;
		array = new int[101][11];
	
		lineDraw(array, 0, 0, 101, 0, true);
		lineDraw(array, 0, 0, 101, 1, true);
		lineDraw(array, 0, 0, 101, 2, true);
		lineDraw(array, 0, 0, 101, 3, true);
		lineDraw(array, 0, 0, 101, 4, true);
		setValue(array,35,9,101);

		a[indx] = new DynamicGesture(array.length);
		
		cons = new int[] {1,1,1,1,1,0,0,0,0,1,0};
		a[indx].updateFrame(array,cons);
		a[indx].printData();


		indx=1;
		array = new int[201][11];
	
		setValue(array,20,0,201);
		setValue(array,90,1,201);
		setValue(array,90,2,201);
		setValue(array,90,3,201);
		setValue(array,90,4,201);
		lineDraw(array, 0, 0, 51, 5, false); lineDraw(array, 50, -50, 101, 5, true); lineDraw(array, 150, 50, 51, 5, false);
		setValue(array,0,8,201);
		setValue(array,0,9,201);
	
		a[indx] = new DynamicGesture(array.length);

		cons = new int[] {1,1,1,1,1,1,0,0,1,1,0};
		a[indx].updateFrame(array,cons);
		a[indx].printData();


		indx=2;
		array = new int[51][11];

		lineDraw(array, 0, 0, 51, 0, true);
		lineDraw(array, 0, 0, 51, 1, true);
		lineDraw(array, 0, 0, 51, 2, true);
		setValue(array, 0, 8, 51);
		setValue(array, 0, 9, 51);
		
		a[indx] = new DynamicGesture(array.length);
		
		cons = new int[] {1,1,1,1,1,0,0,0,1,1,0};
		a[indx].updateFrame(array,cons);
		a[indx].printData();


		indx=3;
		array = new int[101][11];
		
		lineDraw(array, 0, 0, 101, 0, true);
		setValue(array,0,1,101);
		setValue(array,0,2,101);
		setValue(array,0,3,101);
		setValue(array,0,4,101);
		setValue(array,35,9,101);

		a[indx] = new DynamicGesture(array.length);
		
		cons = new int[] {1,1,1,1,1,0,0,0,0,1,0};
		a[indx].updateFrame(array,cons);
		a[indx].printData();


		indx=4;
		array = new int[101][11];
		
		lineDraw(array, 0, 0, 101, 0, true);
		setValue(array,0,1,101);
		setValue(array,0,2,101);
		setValue(array,0,3,101);
		lineDraw(array, 0, 0, 101, 4, true);
		setValue(array,35,9,101);		

		a[indx] = new DynamicGesture(array.length);
		
		cons = new int[] {1,1,1,1,1,0,0,0,0,1,0};
		a[indx].updateFrame(array,cons);
		a[indx].printData();


		indx=5;
		array = new int[101][11];
		
		setValue(array,100,0,101);
		setValue(array,0,1,101);
		setValue(array,0,2,101);
		lineDraw(array, 0, 0, 101, 3, true);
		setValue(array,100,4,101);
		setValue(array,-35,8,101);
		setValue(array,0,9,101);

		a[indx] = new DynamicGesture(array.length);
		
		cons = new int[] {1,1,1,1,1,0,0,0,1,1,0};
		a[indx].updateFrame(array,cons);
		a[indx].printData();


		indx=6;
		array = new int[201][11];

		setValue(array,100,0,201);
		setValue(array,0,1,201);
		setValue(array,0,2,201);
		setValue(array,0,3,201);
		setValue(array,100,4,201);
		lineDraw(array, 0, 0, 51, 5, false); lineDraw(array, 50, -50, 101, 5, true); lineDraw(array, 150, 50, 51, 5, false);
		setValue(array,-35,8,201);
		setValue(array,0,9,201);

		
		a[indx] = new DynamicGesture(array.length);
		
		cons = new int[] {1,1,1,1,1,1,0,0,1,1,0};
		a[indx].updateFrame(array,cons);
		a[indx].printData();


		indx=7;
		array = new int[201][11];
		
		setValue(array,100,0,201);
		setValue(array,0,1,201);
		setValue(array,0,2,201);
		setValue(array,0,3,201);
		setValue(array,100,4,201);
		lineDraw(array, 0, 0, 51, 5, true); lineDraw(array, 50, 50, 101, 5, false); lineDraw(array, 150, -50, 51, 5, true);
		setValue(array,-35,8,201);
		setValue(array,0,9,201);

		a[indx] = new DynamicGesture(array.length);
		
		cons = new int[] {1,1,1,1,1,1,0,0,1,1,0};
		a[indx].updateFrame(array,cons);
		a[indx].printData();

		
		indx=8;
		array = new int[101][11];
		
		lineDraw(array, 0, 0, 101, 0, true);
		lineDraw(array, 0, 0, 101, 1, true);
		setValue(array,0,2,101);
		setValue(array,0,3,101);
		setValue(array,0,4,101);
		setValue(array,35,9,101);

		a[indx] = new DynamicGesture(array.length);
		
		cons = new int[] {1,1,1,1,1,0,0,0,0,1,0};
		a[indx].updateFrame(array,cons);
		a[indx].printData();


		indx=9;
		array = new int[101][11];

		lineDraw(array, 0, 100, 101, 0, false);
		lineDraw(array, 0, 100, 101, 1, false);
		setValue(array,100,2,101);
		setValue(array,100,3,101);
		setValue(array,100,4,101);
		setValue(array,35,9,101);
		
		a[indx] = new DynamicGesture(array.length);
		
		cons = new int[] {1,1,1,1,1,0,0,0,0,1,0};
		a[indx].updateFrame(array,cons);
		a[indx].printData();


		indx=10;
		array = new int[201][11];
		
		a[indx] = new DynamicGesture(array.length);

		setValue(array,0,0,201);
		lineDraw(array, 0, 0, 101, 1, true); lineDraw(array, 100, 100, 101, 1, false);
		setValue(array,100,2,201);
		setValue(array,100,3,201);
		setValue(array,100,4,201);
		setValue(array,35,9,201);
		
		cons = new int[] {1,1,1,1,1,0,0,0,0,1,0};
		a[indx].updateFrame(array,cons);
		a[indx].printData();


		indx=11;
		array = new int[101][11];

		lineDraw(array, 0, 0, 101, 0, true);
		lineDraw(array, 0, 0, 101, 1, true);
		setValue(array,100,2,101);
		setValue(array,100,3,101);
		setValue(array,100,4,101);
		setValue(array,35,9,101);
		
		a[indx] = new DynamicGesture(array.length);
		
		cons = new int[] {1,1,1,1,1,0,0,0,0,1,0};
		a[indx].updateFrame(array,cons);
		a[indx].printData();




 		
 		// Done initialising
		DynamicQueue q = new DynamicQueue(a);
		Live dynamiclive = new Live();

		/*q.foremostElement = 0;
		for (int i=0; i<5; i++) {
			dynamiclive.update(i*2);
			q.updateQueue(dynamiclive);
			q.processQueue();
			q.proceedExecution();
			//q.print();			
		}*/
	}
}