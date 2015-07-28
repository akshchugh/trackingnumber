import static org.junit.Assert.*;

import org.junit.Test;

public class TrackingTableTest {

	@Test
	public void insertTest() {
		TrackingTable objectfortesting = new TrackingTable();
		objectfortesting.insert(new TrackingRow(1, 10000, 1, 1));
		for (TrackingRow tr : objectfortesting.table) {
			if (tr.notDeleted)
				assertEquals("Correct", tr.r.getHi(), 10000);
		}
	}

	@Test
	public void insertTest1() {
		TrackingTable objectfortesting = new TrackingTable();
		objectfortesting.insert(new TrackingRow(1, 10000, 1, 1));
		for (TrackingRow tr : objectfortesting.table) {
			if (tr.notDeleted) {
				assertEquals("Correct", tr.r.getLo(), 1);
			}
		}

	}

}