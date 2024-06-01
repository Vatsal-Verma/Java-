import java.util.Scanner;
class rbi{
	void farmrate(){
		System.out.println("fr:5%");
	}
	void homerate(){
		System.out.println("hr:3%");
	}
}
class sbi extends rbi{
	void farmrate(){
		System.out.println("fr:7%");
	}
	void homerate(){
		System.out.println("hr:8%");
	}
}
class pnb extends sbi{
	void farmrate(){
		System.out.println("fr:9%");
	}
	void homerate(){
		System.out.println("hr:30%");
	}
}
class Ctpoly{
	public static void main(String ar[]){
		rbi rr;
		sbi s=new sbi();
		rbi r=new rbi();
		pnb p=new pnb();
		rr=r;
		rr.farmrate();
		rr.homerate();
		rr=s;
		rr.farmrate();
		rr.homerate();
		rr=p;
		rr.farmrate();
		rr.homerate();
		
	}
}