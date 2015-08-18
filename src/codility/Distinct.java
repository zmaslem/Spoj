package codility;

/**
 * Created by kawrobel on 2015-07-30.
 */
public class Distinct
{
    private static int[] firstHalf = null;
    private static int[] secondHalf = null;

    public static void main(String[] args){
        int[] A = {2, 1, 1, 2, 3, 1};
        int[] B = new int[4];
        System.arraycopy(A, 2, B, 0, 4);
        for(int i : B){
            System.out.println(i);
        }
        System.out.println(solution(A));
    }

    private static int solution(int[] A){
        sortTheListAndRemoveDuplicates(A);
        return lenOfSortedList(A);
    }

    private static void sortTheListAndRemoveDuplicates(int[] toSort){
        devideList(toSort);
    }

    public static void devideList(int[] toDevide){
        int halfOfTheList = toDevide.length/2;
        int lengthOfTheList = toDevide.length;
        System.arraycopy(toDevide, 0, firstHalf, 0, halfOfTheList);
        System.arraycopy(toDevide, halfOfTheList, secondHalf, 0, halfOfTheList);
    }

    private static int lenOfSortedList(int[] sortedList){
        return sortedList.length;
    }


}
