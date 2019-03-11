package packages.BasicJavaOperations;

// Finding last occurrence of second array in 1st one. if no occurrence than drops -1
public class FindArray {

    public static void main(String[] args) {
        final int[] array = {4, 9, 10,11, 7,9,10,11, 8,3,7,9,10,12,14};
        final int[] subArray = {10,11};
        FindArray game5FindArray = new FindArray();

        System.out.println(game5FindArray.findArray2(array,subArray));
    }

    protected int findArray2(int[] array, int[] subArray) throws ArrayIndexOutOfBoundsException {

        if(array.length==0 || subArray.length == 0){
            throw new ArrayIndexOutOfBoundsException("given array is empty");
        }
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