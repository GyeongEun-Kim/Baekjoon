
public class No4673_셀프넘버 {
	static int addNumber (int n) {
		int dn=n;
		int i=1;
		while (n!=0) {
			dn+=n%(10*i);
			n=n/10;
		}
		return dn;
	}

	public static void main(String[] args) {
		int arr[] = new int[11106];
		for (int i=1;i<10001;i++) {
			arr[addNumber(i)]=1;
		}
		
		for (int i=1;i<10001;i++) {
			if (arr[i]==0)
				System.out.println(i);
		}
		// TODO Auto-generated method stub

	}

}
