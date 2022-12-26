package Test2;

public class TestInvoiceItem {

		public static void main(String[] args) {
			
			InvoiceItem i1=new InvoiceItem();
			
	        InvoiceItem i2=new InvoiceItem("01","MacBook",1,1500000);
	        
	        InvoiceItem i3=new InvoiceItem("02","Acer",3,65000);
	        
	        System.out.println(i2);
	        
	        System.out.println("\nDisplaying details of i2 object : ");
	        System.out.println("\nId : "+i2.getId());
	        System.out.println("Description : "+i2.getDesc());
	        System.out.println("quantity : "+i2.getQty());
	        System.out.println("UnitPrice : "+i2.getUnitPrice());
	        System.out.println("Total "+i2.getTotal());
	        
	        System.out.println("\nsetting and displaying details of i3 object : ");
	        i3.setQty(10);
	        i3.setUnitPrice(70000.0);
	        System.out.println("quantity : "+i3.getQty());
	        System.out.println("unitPrice : "+i3.getUnitPrice());
	        
	        
		}

	}