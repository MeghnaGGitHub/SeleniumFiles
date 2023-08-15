package ObjectStorageInArray;

import java.util.Objects;

public class Books implements Comparable<Object>{
	String bname;
	int bid;
	public Books(String bname, int bid) {
		this.bname = bname;
		this.bid = bid;
										}

	public String toString() {
	return "Book name:"+bname+"\nBook id:"+bid+"\n";
							 }
	public boolean equals(Object o) {
		Books b1=(Books)o;
		return this.bname.equals(b1.bname)&& this.bid==b1.bid;
									}
	public int hashCode() {
		return Objects.hash(bname,bid);
						  }
	public int compareTo(Object o) {
		Books b1=(Books)o;
		return this.bname.compareTo(b1.bname);
	}
	

}
