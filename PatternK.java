
public class PatternK {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(j==n/2||(i==j||i+j==n+1)&& j>=n/2)
				//if(j==0||(i==j||i+j==n-1)&& j<=n/2)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}

