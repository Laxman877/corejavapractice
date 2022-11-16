package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class JavaStremExample {
	public static void main(String[] args) {
		List<Product> products=new ArrayList<Product>();
		products.add(new Product(1, "HP laptop", 25000f));
		products.add(new Product(2, "Dell laptop", 30000f));
		products.add(new Product(1, "Lenovo laptop", 28000f));
		products.add(new Product(1, "Sony laptop", 28000f));
		products.add(new Product(1, "Apple laptop", 90000f));
		//withouy stream
		List<Float> productsPrice=new ArrayList<Float>();
		for(Product product:products) {
			if(product.price<30000) {
				productsPrice.add(product.price);
			}
		}
		System.out.println(productsPrice);
		//using stream filter
		List<Float> proList=products.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
		System.out.println(proList);
		//filtering and iterating collection
		products.stream()
		.filter(product->product.price==30000)
		.forEach(product->System.out.println(product.name));
	}
}
