package codility;

/**
 * Created by kawrobel on 2015-07-30.
 */
public class Distinct
{
    private static int[] firstHalf = null;
    private static int[] secondHalf = null;

    public static void main(String[] args){
        int[] A = {2, 1, 1, 2, 3};
        int[] X = new int[6];
        devideList(A);
        for(int i : X){
            System.out.println(i);
        }
        for(int i : secondHalf){
            System.out.println(i);
        }
        System.out.println("pauza");
        for(int i : firstHalf){
            System.out.println(i);
        }
        solution(A);
    }

    public static int solution(int[] toSort){
        if(toSort.length > 2){
            devideList(toSort);
            sort(firstHalf, secondHalf);
        }
        return 1;
    }
    private static void sort(int[] first, int[] second){
        if(first.length > 2) {
            devideList(first);
            sort(firstHalf, secondHalf);
        }
        else if(first.length == 2){
            first = sortSmallList(first);
        }
        if(second.length > 2) {
            devideList(second);
            sort(firstHalf, secondHalf);
        }
        else if(second.length == 2){
            second = sortSmallList(second);
        }
        for(int i = 0; i < first.length; i++){

        }
    }

    private static int[] sortSmallList(int[] list) {
        if(list[0] > list[1]){
            int buf = list[0];
            list[0] = list[1];
            list[1] = buf;
        }
        else if(list[0] == list[1]){
            return new int[] {list[0]};
        }
        return list;
    }

    static void devideList(int[] toDevide){
        int lengthOfTheList = toDevide.length;
        int halfOfTheList = lengthOfTheList/2;
        int lengthOfFirstHalf = lengthOfTheList - halfOfTheList;
        int lengthOfSecondHalf = lengthOfTheList - lengthOfFirstHalf;
        firstHalf = new int[lengthOfFirstHalf];
        secondHalf = new int[lengthOfSecondHalf];
        System.arraycopy(toDevide, 0, firstHalf, 0, lengthOfFirstHalf);
        System.arraycopy(toDevide, lengthOfFirstHalf, secondHalf, 0, lengthOfSecondHalf);
    }
}
