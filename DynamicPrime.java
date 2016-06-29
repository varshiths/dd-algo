class DynamicPrime{
	public static void main(String [] args){

		int noOfGestures = 1;
		int indx; int [][]array;
		DynamicGesture []a = new DynamicGesture[noOfGestures];
		
		// initialising the 10 gestures
		
		indx=0;
		array = new int[][]
		{
			{ 90, 96, 92, 94, 100, 1942, 16036, -988, 1736, 15926, -528 },
			{ 90, 96, 90, 92, 98, 1100, 16096, -282, 906, 16284, -164 },
			{ 85, 96, 90, 92, 96, 914, 16214, -54, 1274, 16238, -236 } ,
			{ 85, 94, 90, 89, 96, 1328, 16078, -82, 1184, 16408, -256 },
			{ 80, 92, 88, 86, 94, 1004, 16016, -158, 1184, 15968, -346 },
			{ 80, 90, 86, 81, 93, 1262, 15804, -176, 952, 15616, 38 },
			{ 76, 88, 82, 76, 87, 854, 15820, 462, 940, 16080, 434 },
			{ 71, 79, 74, 71, 84, 766, 16722, -90, 536, 16004, 60 },
			{ 66, 73, 69, 65, 75, 922, 15938, 190, 1164, 16170, 210 },
			{ 61, 67, 66, 60, 70, 1498, 16074, 286, 1134, 16042, 566 },
			{ 61, 66, 62, 60, 65, 432, 16230, 766, 432, 16310, 706 },
			{ 57, 62, 60, 55, 63, 916, 16092, 410, 778, 15850, 572 },
			{ 57, 58, 58, 52, 58, 632, 15824, 790, 552, 16034, 872 },
			{ 57, 56, 54, 50, 55, 690, 16208, 1040, 694, 16132, 954 },
			{ 57, 52, 50, 47, 51, 644, 16104, 1136, 848, 15788, 886 },
			{ 52, 49, 48, 44, 48, 900, 15890, 964, 818, 16166, 1006 },
			{ 52, 45, 45, 39, 44, 790, 16286, 828, 894, 16004, 802 },
			{ 47, 39, 40, 34, 41, 816, 15534, 670, 724, 15856, 864 },
			{ 47, 32, 36, 31, 36, 692, 16274, 904, 800, 16146, 688 },
			{ 42, 26, 30, 28, 32, 1204, 16032, 432, 1104, 15924, 382 },
			{ 38, 20, 24, 23, 27, 862, 16080, 594, 308, 16028, 1072 },
			{ 38, 16, 18, 18, 22, -192, 16002, 1148, 268, 15918, 1264 },
			{ 33, 15, 14, 15, 17, 1284, 15888, 976, 1402, 15924, 1044 },
			{ 28, 11, 10, 13, 10, 924, 16046, 1116, 668, 16112, 1078 },
			{ 28, 9, 8, 10, 5, 602, 16180, 1292, 682, 16202, 1216 },
			{ 28, 7, 6, 7, 5, 906, 15948, 442, 1234, 15856, 44 },
			{ 19, 5, 2, 7, 1, 890, 16172, 672, 1072, 16340, 1196 },
			{ 23, 5, 2, 5, 0, 1444, 16062, 1072, 1404, 16024, 490 },
			{ 19, 3, 1, 5, 0, 1458, 15990, 328, 1244, 15848, 564 },
			{ 14, 1, 0, 5, 0, 992, 16100, 1092, 1328, 15836, 1134 },
			{ 14, 1, 0, 2, 0, 1708, 15950, 874, 1552, 15876, 1024 },
			{ 4, 1, 0, 0, 0, 1410, 16110, 1012, 1334, 16220, 926 },
			{ 0, 1, 0, 0, 0, 1814, 16118, 702, 2076, 16140, 674 },
			{ 4, 3, 0, 0, 0, 2062, 16094, 438, 1614, 16294, 406 }
		};
		a[indx] = new DynamicGesture(array.length);
		
		int []cons = new int[11];
		cons = new int[] {1,1,1,1,1,0,0,0,0,1,0};
		a[indx].updateFrame(array,cons);
		a[indx].printData();
		

		/*int [][]array2 = new int[5][11];
		int []cons2 = new int[11];
		for (int i=0; i<5; i++) {
			for (int j=0; j<11; j=j+2) {
				array2[i][j] = i*2;
			}
			for (int j=1; j<11; j=j+2) {
				array2[i][j] = 0;
			}
		}
		cons2 = new int[] {1,1,1,1,1,0,0,0,1,0,0};
		a[1].updateFrame(array2,cons2);
		a[1].printData();*/		


		DynamicQueue q = new DynamicQueue(a);
		Live dynamiclive = new Live();

		q.foremostElement = 0;
		for (int i=0; i<5; i++) {
			dynamiclive.update(i*2);
			q.updateQueue(dynamiclive);
			q.processQueue();
			q.proceedExecution();
			q.print();			
		}
	}
}