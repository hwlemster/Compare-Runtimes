
public class TimeMeasure {

	public static void main(String[] args) {
		for (int x=0; x<10; x++) {
			long startTime = System.nanoTime();
			String s = "";
			Integer k = 0;
			for (int i=0; i<1000; i++) {
				for (int j=0; j<1000; j++) {
					k++;
					s +=".";
				}
			}
			k=s.length();
			long stopTime = System.nanoTime();
			long diff = (stopTime-startTime);
			System.out.println(String.format("%,d", diff));
		}
	}

}
