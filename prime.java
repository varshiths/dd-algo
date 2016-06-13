import java.util.Scanner;

class Live{
	int reading[];
	int sensors = 5 ;

	public Live(){
		reading = new int [sensors];
	}

	public Live(Live live){
		reading = new int [live.sensors];
		for (int i=0; i<sensors; i++) {
			reading[i] = live.reading[i];
		}
	}

	public void update(){
		for (int i=0; i<sensors; i++) {
			reading[i] = 100;
		}
	}

	public void updateConsole(){
		Scanner scan = new Scanner(System.in).useDelimiter("\\s");
		for (int i=0; i<sensors; i++) {
			reading[i] = scan.nextInt();
		}
	}

	public void print(){
		for (int i=0; i<sensors; i++) {
			System.out.print(reading[i] + " ");
		}
		System.out.print('\n');
	}

}

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

		/*for (int i=0; i<8; i++) {
			System.out.println(i);
			a[i].printData();
		}*/
		
		Live live = new Live();
		int no = 2;
		//live.print();
		int count = 0;
		int gestActive = -1; boolean stay = true;
				
		while(stay){

			if(count == no){
				a[gestActive].execute(gestActive);
				count = 0;
				gestActive = -1;
				System.out.print("Continue? ");
				Scanner contd = new Scanner(System.in);
				String str = contd.next();
				if( str.equals("n") ) { stay = false; break; }
			}

			if(count<no){
				live.updateConsole();
			}

			for (int i=0; i<8; i++) {
				if(a[i].isInFrame(live)){
					if(gestActive == i){
						count++; continue;
					}
					else{
						gestActive = i; count = 1; continue;
					}
				}
			}

		}
		

	}
}