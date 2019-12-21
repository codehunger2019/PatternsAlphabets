
public class PatternQ {
public static void main(String[] args) {
	int n=20;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if((i==1 && j<n/2)||(i==n/2 && j<n/2)||((j==1||j==n/2) && i<n/2)||(i==j && (j>n/4 && j<3*n/2)))
			//if((i==0||i<=3*n/4) && j<=3*n/4||(j==0||j==3*n/4) && i<=3*n/4||i==j && i>=n/4|| i==j && i>=n/2)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}

