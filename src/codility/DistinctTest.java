package codility;

/**
 * Created by kawrobel on 2015-08-18.
 */
public class DistinctTest {
	
	@org.junit.Before
	public void setUp() throws Exception {

	}

	@org.junit.After
	public void tearDown() throws Exception {
		int[] A = {2, 1, 1, 2, 3, 1};
		Distinct distinct = new Distinct();
		distinct.devideList(A);
	}
}