
public class StatChecker {
	public static void main (String [] args) {
//		double[] arr1 = {5.0, 8.0, 7.0};
//		double[] arr2 = {1.0, 2.0};
//		double[] arr3 = {1.0, 2.0, 3.0};
//		double[] arr4 = {1.0, 3.0, 1.0, 7.0, 1.0, 4.0};
//		double[] data = {-5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88.9, 109.5, -90, 88.9};
//		
//		Stat s1 = new Stat(arr1);
//		Stat s2 = new Stat(arr2);
//		Stat s3 = new Stat(arr3);
//		Stat s4 = new Stat(arr4);
//		
//		
//		System.out.println(s2.equals(s3));
//		
//		System.out.println("s1 = " + s1.toString());
//		System.out.println("s1 min = " + s1.min());
//		System.out.println("s1 max = " + s1.max());
//		System.out.println("s1 average = " + s1.average());
//		System.out.println("s4 mode = " + s1.mode());
		
//		double[] data = {-5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88.9, 109.5, -90, 88.9};
//		double[] data2 = {100.34, 50.01, 50.01, -8};
//		Stat stat1 = new Stat();
//		System.out.println("stat1 data = " + stat1.toString());
//		stat1 = new Stat(data);
//		System.out.println("stat1 has been altered.");
//		System.out.println("stat1 data = " + stat1.toString());
//		System.out.println("stat1 min = " + stat1.min());
//		System.out.println("stat1 max = " + stat1.max());
//		System.out.println("stat1 average = " + stat1.average());
//		System.out.println("stat1 mode = " + stat1.mode() + "\n");
//		Stat stat2 = new Stat();
//		stat2.setData(data2);
//		Stat stat3 = new Stat(stat1.getData());
//		System.out.println("stat2 data = " + stat2.toString());
//		System.out.println("stat3 data = " + stat3.toString());
//		System.out.println();
//		System.out.println("stat1 is equal to stat2 using \"equals()\"? " +
//		stat1.equals(stat2));
//		System.out.println("stat1 is equal to stat3 using \"equals()\"? " +
//		stat1.equals(stat3));
//		System.out.println("stat1 is equal to stat3 using \"==\"? " + (stat1 == stat3));
		
//		double[] data = {10.0, 20.0, 30.0};
//		Stat stat1 = new Stat(data);
//		data[0] = 100.0;
//		data[1] = 200.0;
//		data[2] = 300.0;
//		Stat stat2 = new Stat(data);
//		System.out.println("stat1 data = " + stat1.toString());
//		System.out.println("stat2 data = " + stat2.toString());
//		System.out.println("The two arrays should be different");
		
//		double[] data1 = {10.0, 20.0, 30.0};
//		Stat stat1 = new Stat(data1);
//		double[] data2 = stat1.getData();
//		System.out.println("The arrays are identical: " + (data1 == data2));
		
//		double[] data1 = {10.0, 20.0, 30.0};
//		Stat stat1 = new Stat();
//		stat1.setData(data1);
//		Stat stat2 = new Stat(data1);
//		double[] data2 = stat1.getData();
//		System.out.println("The arrays are identical: " + (data1 == data2));
//		System.out.println("stat2 equals stat1: " +
//		stat2.equals(stat1));
//		System.out.println("stat1 equals stat2: " + stat2.equals(stat1));
		
//		Stat stat1 = new Stat();
//		System.out.println("stat1 data = " + stat1.toString());
//		System.out.println("stat1 min = " + stat1.min());
//		System.out.println("stat1 max = " + stat1.max());
//		System.out.println("stat1 average = " + stat1.average());
//		System.out.println("stat1 mode = " + stat1.mode());
//		System.out.println("stat1 data = " + stat1.toString());
		
		
		
		double[] data = {1,2,2,3,3,4};
		Stat stat1 = new Stat(data);
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 data = " + stat1.toString());
	}
}
