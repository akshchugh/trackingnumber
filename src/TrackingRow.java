
public class TrackingRow implements Comparable <TrackingRow>{
	public Range r;
	int s;
	int t;
	boolean notDeleted;
	
	TrackingRow (int start, int end, int s, int t) {
		this.r = new Range (start, end);
		this.s = s;
		this.t = t;
		notDeleted = true;
	}
	
	public String toString() {
		return " " + this.r.getLo()+ " "+ this.r.getHi()+ " " + this.s+ " " + this.t;
	}
	
	public boolean isValid() {
		return this.r.isValid();
	}
	
	public void delete() {
		this.notDeleted = false;
	}

	@Override
	public int compareTo(TrackingRow tr) {
		return Integer.valueOf(this.r.getLo()).compareTo(tr.r.getLo());
	}

	boolean isOverlapping( TrackingRow row ) {
		return this.r.isOverlapping( row.r );
	}
}

