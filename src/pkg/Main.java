package pkg;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public int solution(int n, int m, int[] arr) {
		int answer = -1;
		
		TreeSet<Integer> tset = new TreeSet<>(Collections.reverseOrder());
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					tset.add(arr[i]+arr[j]+arr[k]);
				}
			}
		}
		int cnt=0;
		for(int x : tset) {
			cnt++;
			if(cnt==m) return x;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(T.solution(n,m,arr));
	}

}
