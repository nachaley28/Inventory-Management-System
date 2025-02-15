//Natalie Jenh Alarcon

import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    InventoryManagementSystem ism = new InventoryManagementSystem();
	    System.out.println("Welcome to Inventory Management System");
	    boolean con = true;
	    
	    while (con){
	        System.out.println();
	        System.out.print("Menu\n1: add Product\n2: display Products\n3: Exit\nChoose option : ");
	        int choice = scan.nextInt();
	        
	        switch(choice){
	            case 1:
	                System.out.print("Enter Product name : ");
	                String name = scan.next();
	                System.out.print("Enter Product prize : ");
	                int prize = scan.nextInt();
	                ism.addProduct(name,prize);
	                break;
	           case 2:
	               ism.displayProducts();
	               break;
	           case 3:
	               System.out.println("GoodBye");
	               con = false;
	               break;
	           default:
	                System.out.println("Invalid option");
	                
	        }
	    }
	}
}

class Product{
    private String name;
    private int prize;
    
    public Product(String name, int prize){
        this.name = name;
        this.prize = prize;
    }
    
    public String getName(){
        return this.name;
    }
    public int getPrize(){
        return this.prize;
    }
}

class InventoryManagementSystem{
    private ArrayList<Product> products;
    
    public InventoryManagementSystem(){
        products = new  ArrayList<>();
    }
    
    public void addProduct(String name, int prize){
        products.add(new Product(name,prize));
        System.out.println("Added product Successfully");
    }
    
    public void displayProducts(){
        if(products.isEmpty()){
            System.out.println("No products are available");
        }
        else{
            for(Product product: products){
                System.out.println("Product name : "+ product.getName() + ", Product prize : "+ product.getPrize());
            }
        }
    }
}
