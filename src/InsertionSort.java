public class InsertionSort {
    static int[] list = {9, 3, 2, 5, 4, 7};

    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++){
            int currentElement = list[i];
            int k;
            for(k = i - 1; k >=0 && list[k] > currentElement; k--){
                list[k+1] = list[k];
            }
            list[k+1] = currentElement;

            for (int x: list) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        for (int x: list) {
            System.out.print(x + "\t");
        }
        System.out.println("--------------Mang ban dau------------");
        System.out.println();
        insertionSort(list);
        for (int x: list) {
            System.out.print(x + "\t");
        }
    }
}
