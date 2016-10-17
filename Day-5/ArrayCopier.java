public class ArrayCopier {

	public void copy(int[] src, int[] dest){
		if (src.length >= dest.length) {
			System.out.print ("The array dest is: ");
			for (int i = 0; i < dest.length; i++) {
				dest[i] = src[i];
				System.out.print (dest[i] + ", ");
			}

		}
		if (src.length < dest.length) {
			System.out.print ("The array dest is: ");
			for (int i = 0; i < src.length; i++) {
				dest[i] = src[i];
				System.out.print (dest[i] + ", ");
			}
			for (int j = src.length; j < dest.length; j++) {
				dest[j] = 0;
				System.out.print (dest[j] + ", ");
			}
		}
	}


	public static void main(String[] args){
		int[] src = {1, 2, 3, 4}, dest = {0, 0, 0, 0, 1, 2};

		ArrayCopier Copier = new ArrayCopier();

		Copier.copy(src, dest);

	}
}