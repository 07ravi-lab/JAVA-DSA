package Array.PRACTICE;

public class Doublet {
    public static void main(String[] args) {
        int [] arr = {2,4,5,8,9,7};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] + arr[j] == 10 ){
                    System.out.println(arr[i]+" "+arr[j]);
                    break;
                }
            }
        }
    }
}
