public class MultipleAllocations {
	public void bigAllocation() {
    		int size = 100000000;
		int n;
		int tab[] = size;  		

		for(n = 0; n < tab.length; ++n) {
			tab[i] = n;
		}		

		long t1 = System.nanoTime();
		System.out.println((Sytem.nanoTime() - t1) * 1e-9);
	}

	public void smallAllocation() {
    		int size = 100000000;
		int tab[] = size;
		int i, n;

		for(i=0; i<100000000; ++i) {
    			for(n = 0; n < tab.length; ++n) {
				tab[i] = n;
			}
		}
		long t1 = System.nanoTime();
		System.out.println((Sytem.nanoTime() - t1) * 1e-9);
	}

	public static void main () {
    		bigAllocation();
    		smallAllocation();
	}

}
