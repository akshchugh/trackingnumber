
public class TrackingRow {
	Range r;
	int s;
	int t;
	boolean notDeleted;
	
	TrackingRow (int start, int end, int s, int t) {
		this.r = new Range (start, end);
		this.s = s;
		this.t = t;
		notDeleted = true;
	}
	
	

}
