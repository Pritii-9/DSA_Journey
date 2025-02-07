import java.util.Arrays;

public class Chunk_Array {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6};
        int size = 3;

        for (int i = 0; i < arr.length; i += size) {
            int[] chunk = new int[Math.min(size, arr.length - i)];
            System.arraycopy(arr, i, chunk, 0, chunk.length);
            System.out.println(Arrays.toString(chunk));
      }

}
   
}
