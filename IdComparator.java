package collectionFrameworks.CustomizedComparison;

import java.util.Comparator;

public class IdComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		
		return o1.getId() - o2.getId();
	}
	
	

}
