import java.io.*;
import java.lang.reflect.*;


public class Solution14 {

	public static void main(String[] args) throws Exception {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine().trim());
			Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private

            //Write your code here
            // Initiate classes
            Solution14.Inner ina = new Solution14.Inner();
            Class<?> privClass = Class.forName("Solution14$Inner$Private");
            
            // Initiate constructor of private class
            Constructor<?> constructor = privClass.getDeclaredConstructor(Solution14.Inner.class);
            constructor.setAccessible(true);
            o = constructor.newInstance(ina);
            
            // Initiate the method inside private class
            Method method = privClass.getDeclaredMethod("powerof2", int.class);
            method.setAccessible(true);
            
            // Initiate the method results inside private class
            String result = (String) method.invoke(o, num);
            System.out.println(result);
            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
	}//end of main

	static class Inner{
		@SuppressWarnings("unused")
                private class Private{
                        @SuppressWarnings("unused")
			private String powerof2(int num){
				return ((num&num-1)==0)?"is a power of 2":"is not a power of 2";
			}
		}
	}//end of Inner
	
}//end of Solution

