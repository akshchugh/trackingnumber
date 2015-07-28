import java.util.SortedSet;
import java.util.TreeSet;


public class TrackingTable {
	SortedSet <TrackingRow> table;
	public void insert(TrackingRow tr) {
		TreeSet <TrackingRow> newTable = new TreeSet <TrackingRow> ();
		for(TrackingRow oldRow: table) {
			if (oldRow.r.isOverlapping(tr.r)) {
				TrackingRow beforeIntersection = new TrackingRow (oldRow.r.getLo(), tr.r.getLo() - 1, oldRow.s, oldRow.t);
				TrackingRow afterIntersection = new TrackingRow (tr.r.getHi() + 1, oldRow.r.getHi(), oldRow.s, oldRow.t);
				if(beforeIntersection.isValid())
					newTable.add(beforeIntersection);
				if(afterIntersection.isValid())
					newTable.add(afterIntersection);					
			}
			else
				newTable.add(oldRow);
		}
		newTable.add(tr);
		table = newTable;	
	}
	
	public void print() {
		for(TrackingRow tr: table) {
			if(tr.notDeleted) 
				System.out.println(tr);
		}
	}
	
	TrackingTable() {
		table = new TreeSet<TrackingRow> ();
	}
	
	public static void main (String[] args) {
		TrackingTable tt = new TrackingTable();
		tt.insert(new TrackingRow(1, 10000, 1, 1));
		tt.insert(new TrackingRow(50000, 100000, 1, 1));
		tt.insert(new TrackingRow(500, 10000, 1, 1));
		tt.insert(new TrackingRow(250, 10000, 2, 1));
		tt.insert(new TrackingRow(260, 270, 1, 1));
		tt.print();
	}
}
