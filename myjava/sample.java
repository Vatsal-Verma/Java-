class sample{
	public static void main(String ar[]){
		int x[]=new int[10];
		int y[]={1,2,3,4,5,6};
		for(int i=0;i<y.length;i++){
			x[y[i]]++;
		}
		for(int i=0;i<y.length;i++){
			System.out.println(x[i]+" ,");
		}
	}
}