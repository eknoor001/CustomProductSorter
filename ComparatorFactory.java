package collectionFrameworks.CustomizedComparison;

import java.util.Comparator;

public class ComparatorFactory {
	
	static Comparator<Product> obj;
	
	static Comparator<Product> getObj(int key) {
		if(key==1)
		{
			obj = new IdComparator();		}
		else
			if(key==2)
			{
				obj = new NameComparator();
			}
			else
				if(key==3)
				{
					obj = new PriceComparator();
				}
				else
				{
					obj = null;
				}
				
		return obj;
	}

}
