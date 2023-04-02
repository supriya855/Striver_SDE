// Something tricky 
// DRY run with multiple examples
import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
		int xor=0,count=0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.size();i++){
			xor^=arr.get(i);
			if(map.get(xor^x)!=null){
				count+=map.get(xor^x);
			}
			if(xor==x)count++;
			if(map.get(xor)!=null){
				map.put(xor,map.get(xor)+1);
			}
			else{
				map.put(xor,1);
			}
		}
		return count;
	}
}
