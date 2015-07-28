import static org.junit.Assert.*;

import org.junit.Test;

public class TrackingTableTest {

	@Test
	public void insertTest() {
		TrackingTable objectfortesting = new TrackingTable();
		objectfortesting.insert(new TrackingRow(1, 10000, 1, 1));
		for(TrackingRow tr:objectfortesting.table) {
			if(tr.notDeleted) 
				assertEquals("Correct",tr.r.getHi(),10000);	
		}
	}
	@Test
	public void insertTest1() {
		TrackingTable objectfortesting = new TrackingTable();
		objectfortesting.insert(new TrackingRow(1, 10000, 1, 1));
		for(TrackingRow tr:objectfortesting.table) {
			if(tr.notDeleted) {
				assertEquals("Correct",tr.r.getLo(),1);	
			}
		}
	}
	int lo;
	int hi;
	@Test
	public void insertTest2includingmerging() {
		int loopruntimes = 0;
		TrackingTable objectfortesting = new TrackingTable();
		objectfortesting.insert(new TrackingRow(1, 10000, 1, 1));
		objectfortesting.insert(new TrackingRow(1, 500, 1, 2));
		for(TrackingRow tr:objectfortesting.table) {
			if(tr.notDeleted) {
				hi=tr.r.getHi();
				lo=tr.r.getLo();
				loopruntimes++;
				
			}
		}
		assertEquals("Correct",loopruntimes,2);		
		assertEquals("Correct",hi,10000);
		assertEquals("Correct",lo,501);
		
	}

}