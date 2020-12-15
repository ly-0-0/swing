package pack;

public class App1 {

    public static void main(String args[]){
   	 long sum=0;
	         for(long i=1;i<=2147483647;i++){
	        	 if(i%2==1) {
	     			sum=sum+i;
	     			}
		       }
	         System.out.println("从1到2147483647的奇数和为:"+sum);
		     }     
}
	
	
