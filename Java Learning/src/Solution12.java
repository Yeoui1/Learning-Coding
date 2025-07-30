import java.io.*;

//Write your code here
class Add {
    void add(int... numbers) {
        int finalRes = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            result.append(num);
            finalRes = Math.addExact(finalRes, num);
            if (i != numbers.length - 1) {
                result.append(" + ");
            } else {
                result.append(" = ");
            } 
        }
        result.append(finalRes);
        System.out.println(result.toString().trim());
    }
}

public class Solution12 {
    public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			int n6=Integer.parseInt(br.readLine());

			Add ob = new Add();
			ob.add(n1,n2);
			ob.add(n1,n2,n3);
			ob.add(n1,n2,n3,n4,n5);	
			ob.add(n1,n2,n3,n4,n5,n6);
		}
}
