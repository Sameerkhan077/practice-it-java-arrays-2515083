import java.util.Arrays;

public class App {
  
  public static void main(String[] args) {
    // double[] lotteryNums ={ 45,92,38,33,21};
    // System.out.println(lotteryNums[2]);
    // lotteryNums[2] = 40;
    // System.out.println(lotteryNums[2]);

    int[] arr = new int[] {92,12,38,74};
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
    System.out.println();

    for(int i  = arr.length-1; i>=0; i--){
      System.out.println(arr[i]);
    }
    System.out.println();

    for (int i = arr.length - 1; i >= 0; i=i-2) {
      System.out.println(arr[i]);
    }
    System.out.println();

    for(int item : arr){
      System.out.println(item);
    }
    System.out.println();

    // java streams
    Arrays.stream(arr).forEach(System.out::println);
    //Arrays.stream(arr).filter()
    //Arrays.stream(arr).average()
    //Array.stream(arr).sum()
  }
}