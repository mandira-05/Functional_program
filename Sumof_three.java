public class Sumof_three {
    public static void main(String[] args) {
        int arr [] = {0, -1, 4, -3, 1};

        int triple_count=0;

        for (int i=0;i<arr.length-2;i++) {
            for (int j=i+1;j< arr.length-1;j++) {
                for (int k=j+1;k<arr.length;k++) {
                    if (arr[i] + arr[j] + arr[k]==0) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        triple_count++;
                    }

                }
            }
        }
        System.out.println("No. of distinct triplets " +triple_count);
    }
}
