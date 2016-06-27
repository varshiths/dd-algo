class Frame{

	boolean mpu;
	public int upperBound;
	public int lowerBound;

	public Frame(int index, boolean isMpu, int upBound, int lrBound, int levels){
		if(!isMpu){

			upperBound =  upBound + index*((lrBound-upBound)/levels);
			lowerBound =  upBound + (index+1)*((lrBound-upBound)/levels);

		}
		else{

			lowerBound =  lrBound - (index+2)*((lrBound-upBound)/levels);
			upperBound =  lrBound - (index+1)*((lrBound-upBound)/levels);

		}

		if(index == 8){
			if(isMpu){
				lowerBound = upBound;
				upperBound = lrBound;
			}
			else{
				upperBound = upBound;
				lowerBound = lrBound;				
			}
		}
		
	}

	public void pushLimits(int []d){
		d[0] = upperBound;
		d[1] = lowerBound;
	}

	public void print(){
		System.out.print(upperBound);
		System.out.print(' ');
		System.out.println(lowerBound);
	}
}