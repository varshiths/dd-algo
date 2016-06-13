class Prime{
	public static void main(String [] args){
		
		Gesture []a = new Gesture[8];
		for (int i = 0; i<8; i++) {
			a[i] = new StaticGesture(5,50);
		}

		int []fing = {0,0,0,0,0}; int q=0;

		q=0; fing = new int [] {0,0,0,0,0};
		// neutral
		a[q].updateFrame(fing);

		q=1; fing = new int [] {1,1,0,0,0};
		// voice search
		a[q].updateFrame(fing);

		q=2; fing = new int [] {1,0,1,1,1};
		// tap
		a[q].updateFrame(fing);

		q=3; fing = new int [] {0,1,1,1,0};
		// call
		a[q].updateFrame(fing);

		q=4; fing = new int [] {0,0,1,1,1};
		// cam open
		a[q].updateFrame(fing);

		q=5; fing = new int [] {0,0,0,1,1};
		// cam click
		a[q].updateFrame(fing);

		q=6; fing = new int [] {1,0,1,1,0};
		// music open
		a[q].updateFrame(fing);

		q=7; fing = new int [] {0,0,1,1,0};
		// music play
		a[q].updateFrame(fing);

		for (int i=0; i<8; i++) {
			System.out.println(i);
			a[i].printData();
		}
		
		
	}
}