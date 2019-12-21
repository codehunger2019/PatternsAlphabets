
public class PatternY {
public static void main(String[] args) {
	int n=10;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			//if(((i==j||i+j==n+1)&& i<=n/2)||(j==n/2 && i>n/2))
				if((i==j && i<=n/2)||i+j==n)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}


