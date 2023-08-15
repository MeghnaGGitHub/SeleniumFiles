package BookIDsortArray;

import java.util.Objects;

public class Books implements Comparable{
		String bname;
		int bid;
		public Books(String bname, int bid) {
			this.bname = bname;
			this.bid = bid;					}
		public String toString() {
		return "Book name:"+bname+"\nBook id:"+bid;
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
			if(this.bid==b1.bid){
				return 0;
								}
			else if(this.bid>b1.bid){
				return 1;
									}
			else {
				return -1;
				 }
										}
		

											  }


