package other;

import com.sun.istack.internal.NotNull;

/**
 * Created by kawrobel on 2016-04-21.
 */
public class Annots {
	public static void main(String[] args){
		@NotNull String s = null;
		System.out.println(s == new String("as"));
	}
}
