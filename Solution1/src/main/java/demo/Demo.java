package demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
	
		//int n = 10;
		//int n = 20;
		//int n = 1000;
		int n = 200000;
		int ret = sumOfPrime(n);
		System.out.println(ret);
	}
	
	public static int sumOfPrime(int n) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i=2;i<n;i++) {
			set.add(i);
		}
		//int mid = (int) Math.floor(Math.sqrt(n));
		for(int i=2;i<n;i++) {
			int maxMul = n/i;
			for(int j=2;j<=maxMul;j++) {
				int num = i*j;
				set.remove(num);
			}
		}
		Iterator it = set.iterator();
		int sum = 0;
		while(it.hasNext()) {
			int num = (Integer) it.next();
			//System.out.println("num "+num);
			sum += num;			
		}
		return sum;
	}
}
