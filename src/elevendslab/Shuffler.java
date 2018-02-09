package elevendslab;
import java.util.*;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;
        

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
                System.out.println(arePermutations(values1,values2));
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
            int[] shuffled= new int[values.length];
		int k=0;
                int j=0;
                for(j=0; j<(values.length)/2; j++){
                  shuffled[j]= values[k];
                    k+=2;
                }
                k=1;
                for(int i=(values.length+1)/2 ; i<(values.length); i++ ){
                    shuffled[i]= values[k];
                    k+=2;
                }
            System.arraycopy(shuffled, 0, values, 0, shuffled.length);
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
                Random rand= new Random();
                int k;
                for(k=values.length; k>0; k--){
                     int r= rand.nextInt(values.length);
                     int temp= values[k-1];
                     values[k-1]= values[r];
                     values[r]=temp;
                     
                }
        }
        public static String flip(){
            Random rand= new Random();
            int r= rand.nextInt(2);
            if(r==0||r==1){
                return "heads";
            }else{
                return "tails";
            }
        }
        
        public static boolean arePermutations(int[] array1,int[] array2){
              Arrays.asList(array1);
             
            if(){
                return true;
            }else{
                return false;
            }
        }
}
