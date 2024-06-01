class ForEachDemoMat{
	public static void main(String ar[]){
		int x[][]={{1,2,3,4},{2,3,4,5},{3,4,6,7}};
		for(int p[]:x){
			for(int q:p){
				System.out.print(q);
			}
			System.out.println();
		}
	}
}