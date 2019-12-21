
public class PatternM {
public static void main(String[] args) {
	int n=10;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(j==1||j==n||i==j && (j>1 && j<n/2 )|| i+j==n+1 && (j>n/2 && j<n))
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}

