package Storingobjectinarray;

import java.util.Objects;

public class Bank implements Comparable<Object>{
String empname;
int empid;
public Bank(String empname, int empid) {
	this.empname = empname;
	this.empid = empid;
}
public String toString() {
	return "Bank employee name:"+empname+"\nBank employee id:"+empid;
}
public boolean equals(Object o) {
	Bank b1=(Bank)o;
	return this.empname.equals(b1.empname)&&this.empid==b1.empid;
}
public int hashCode() {
	return Objects.hash(empname,empid);
}
public int compareTo(Object o) {
	Bank b1=(Bank)o;
	return this.empname.compareTo(b1.empname);
}

}
