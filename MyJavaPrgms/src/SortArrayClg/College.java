package SortArrayClg;

import java.util.Objects;

public class College implements Comparable<Object>{
String cname;
int cid;
	public College(String cname, int cid) {
	this.cname = cname;
	this.cid = cid;
										  }
		public String toString() {
			return "College name:"+cname+"\n College id:"+cid;
							     }
			public boolean equals(Object o) {
				College c1=(College)o;//Down casting.
				return this.cname.equals(c1.cname)&& this.cid==c1.cid;
											}
			public int hashCode() {
				return Objects.hash(cname,cid);
								  }
					public int compareTo(Object o) {
						College c1=(College)o;
						if(this.cid==c1.cid){
							return 0;
											}
							else if(this.cid>c1.cid){
								return 2;
												}
								else {
									return -1;
									 }
													}


}
