package program;
import java.util.Scanner;
public class leaky{
	public static void main(String args[]) {
		int L,r,x1=0,x=0,lct=0,ta=0,l=0;
		Scanner in=new Scanner(System.in);
		System.out.println("enter bucket size");
		L=in.nextInt();
		System.out.println("enter output rate");
		r=in.nextInt();
		while(true) {
			System.out.println("enter time of arrival");
			ta=in.nextInt();
			if(ta==-1) {
				System.out.println("exit...");
				System.exit(0);
				
			}
			System.out.println("enter packet size");
			l=in.nextInt();
			if(l>L) {
				System.out.println("non conformal packet");
				continue;
			}
			else {
				x1=x-(ta-lct)*r;
				if(x1<0) {
					x1=0;
					x=x1+l;
					lct=ta;
					System.out.println("conformal packet");
				}
				else {
					if(x1+l<=L) {
						x=x1+l;
						lct=ta;
						System.out.println("conformal packet");
					}
					else {
						System.out.println("non conformal packet");
					}
				}
			}
		}
				
	}
}
