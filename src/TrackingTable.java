import java.util.ArrayList;


public class TrackingTable {
	ArrayList <TrackingRow> table;
	
	public void insert(TrackingRow tr) {
		for(TrackingRow oldRow: table) {
			
		}
	}
	
	public void print() {
		for(TrackingRow tr: table) {
			if(tr.notDeleted) 
				System.out.println(tr);
		}
	}
	
	TrackingTable() {
		table = new ArrayList <TrackingRow>();
	}
	
}
