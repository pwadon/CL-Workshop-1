package packages.BasicJavaOperations;

// Finding last occurrence of second array in 1st one. if no occurrence than drops -1
public class Game5FindArray {

    public static void main(String[] args) {
        final int[] array = {4, 9, 10,11, 7,9,10,11, 8,3,7,9,10,12,14};
        final int[] subArray = {10,11};

        System.out.println(findArray2(array,subArray));
    }

    public static int findArray2(int[] array, int[] subArray) {
        int index=-1;
        int counter =0;
        if (subArray.length>array.length){
            return index;
        }
        for (int i = 0; i <=array.length-subArray.length ; i++) {

            if (subArray.length==1){
                if (array[i] == subArray[0]){
                    index=i;
                }
            }
            else{
                if(array[i] == subArray[0]){
                    for (int j = 1; j <subArray.length ; j++) {
                        if (subArray[j] != array[i+j]){
                            break;
                        }
                        else counter++;
                    }
                    if (counter==subArray.length-1) {
                        index = i;
                    }
                    counter=0;
                }
            }
        }
        return index;
    }
}