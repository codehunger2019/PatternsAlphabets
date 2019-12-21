
public class PatternG {
public static void main(String[] args) {
	//int n=7;
	for(int i=0;i<=5;i++) {
		for(int j=0;j<=6;j++) {
			if(j==0||(j==4 && (i!=1 && j!=2))|| ((i==0 || i==6) && (j>0 && j<4)) || (j==3 && (j==3 || j==5)))
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
