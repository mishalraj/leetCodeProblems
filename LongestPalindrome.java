package tests;

import java.util.Scanner;

public class LongestPalindrome {
	
	  public static String longestPalindrome(String s) {
	        
	        int start=0;
	        int end=0;
	        
	        if(s==null || s.length()<1)
	            return "";
	        
	        if(s.length()==1)
	            return s;
	        
	        
	        for(int i =0;i<s.length();i++)
	        {
	            int l1= expand(s,i,i);
	            int l2= expand(s,i,i+1);
	            int len= Math.max(l1,l2);
	            
	            if(len>end-start)
	            {
	                start = i- ((len-1)/2);
	                end = i+ (len/2);
	            }            
	        }
	        
	          return s.substring(start,end+1);     
	    }
	    
	    public static int expand(String s,int start,int end)
	    {
	        while(s!=null && start>=0 && end< s.length() && s.charAt(start)==s.charAt(end))
	        {
	            start--;
	            end++;
	        }  
	        return end-start-1;
	    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			String s = sc.next();	
			System.out.println(longestPalindrome(s));
	}

}
