import java.util.*;
class pair implements Comparable<pair>{
	int id, period, initialPeriod;
	pair(int x, int y){
		id = x;
		period = initialPeriod = y;
	}
	public int compareTo(pair x) {
		if(period!=x.period) {
			return period - x.period;
		}else {
			return id - x.id;
		}
	}
	public void setPeriod(int x) {
		period+=x;
	}
	public int getInitialPeriod() {
		return initialPeriod;
	}
	public String toString() {
		return ""+id;
	}
}
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s= sc.next();
	PriorityQueue<pair> operations = new PriorityQueue<pair>();
	while(true) {
		if(s.equals("#")) {
			break;
		}
		pair op= new pair(sc.nextInt(), sc.nextInt());
		operations.offer(op);
		s=sc.next();
	}
	int k = sc.nextInt();
	while(k-->0) {
		pair current = operations.poll();
		current.setPeriod(current.getInitialPeriod());
		operations.add(current);
		System.out.println(current);
	}
}
}
