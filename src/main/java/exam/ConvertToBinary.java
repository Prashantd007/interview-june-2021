package exam;

public class ConvertToBinary {

 public String toBinary(final int n) {
        if(n<0)
            throw new ArithmeticException("Invalid Input");
        int d = n;
        String str = "";
        for(int i=0;d>0;i++){
            str += d%2;
            d=d/2;
        }
        String b = "";
        for(int i=str.length()-1;i>=0;i--)
            b += str.charAt(i);
        return b;
    }

  public static void ain(String args[]){
	Sysyem.out.println(toBinary(2));

}
}
