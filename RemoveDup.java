package strings;

public class RemoveDup {

	public static void main(String[] args) {
		String[] a = new String[] {"one","two","three","eight","one"};
		String[] b = new String[] {"five","four","two","five","eight","six","seven"};
		int l1 = a.length;
		int l2 = b.length;
		int k=0,flag=0,l,m;
		String[] c = new String[l1+l2];

		for(int i=0;i<l1;i++) {
			for(l=0;l<i;l++) {
				if(a[i]==a[l])
					break;
			}
			if(l==i)
				c[k++] = a[i];
		}
		
		for(int i=0;i<l2;i++) {
			for(int j=0;j<l1;j++) {
				if(b[i]==a[j]) {
					flag=1;
					break;
				}
			}
			if(flag==0){
				for(m=0;m<i;m++) {
					if(b[i]==b[m])
						break;
				}
				if(m==i)
					c[k++]=b[i];
			}
			flag=0;
		}
		for(int i=0;i<k;i++)
			System.out.println(c[i]);
	}
}