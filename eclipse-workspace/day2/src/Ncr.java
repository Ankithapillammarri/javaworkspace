
public class Ncr {
public static void main(String[] args) {
	
	int n=5;
	int r=2;
	
	int nf=1;
	int rf=1;
	int nrf=1;
	//n!
	for(int i=1;i<=n;i++) {
		nf=nf*i;
	}
	//r!
	for(int i=1;i<=r;i++) {
		rf=rf*i;
	}
	//(n-r)!
	for(int i=1;i<=n-r;i++) {
		nrf=nrf*i;
		
	}
	nrf=nf/(nrf*rf);
	System.out.println(nrf);
	}
}

