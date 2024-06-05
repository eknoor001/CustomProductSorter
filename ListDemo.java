package collectionFrameworks.CustomizedComparison;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ListDemo {

	static void display(ArrayList<Product> list) {
		Iterator<Product> it = list.iterator();
		while (it.hasNext()) {
			Product temp = it.next();
			System.out.println(temp.getId() + "  " + temp.getName() + "  " + temp.getPrice());
		}
	}

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Product p1 = new Product(1, "laptop", 50000);
		Product p2 = new Product(2, "mobile", 20000);
		Product p3 = new Product(3, "charger", 300);
		Product p4 = new Product(4, "speaker", 500);

		ArrayList<Product> list = new ArrayList<>();

		list.add(p4);
		list.add(p2);
		list.add(p3);
		list.add(p1);

		System.out.println("menu::");
		System.out.println("1. sort by id \n2.sort by name\n3.sort by price");
		int key = 0;
		try {
			key = Character.getNumericValue(br.read());
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		Comparator<Product> obj = ComparatorFactory.getObj(key);
		System.out.println(obj.getClass());
		Collections.sort(list, obj);
		display(list);

	}
}
