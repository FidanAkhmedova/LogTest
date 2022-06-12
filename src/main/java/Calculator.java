public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int[] arrTest(int arr[]) throws RuntimeException{
        int  count = 0;
        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[arr.length - 1] == 4 )  throw new RuntimeException("Last number equals 4");
            if (arr[j] == 4) {
                int arrNew[] = new int[count];
                System.arraycopy(arr, j+1, arrNew, 0, count);
                return arrNew;
            }
            count++;
        }
        return arr;
    }
    public boolean containsNumbers(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 4)
                return true;
        }
        return false;
    }
}

