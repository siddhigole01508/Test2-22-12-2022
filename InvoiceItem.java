package Test2;

public class InvoiceItem {

	private String id;
	private String desc;
	private int  quantity;
	private double unitPrice;
	
	public InvoiceItem() {
		
	}
	
	public InvoiceItem(String item_id,String des,int item_quantity,double item_unitPrice) {
		this.id=item_id;
		this.desc=des;
		this.quantity=item_quantity;
		this.unitPrice=item_unitPrice;
		
	}
	
	
	public String getId() {
		return this.id;
	}
	
	
	public String getDesc() {
		return this.desc;
	}
	
	
	public int getQty() {
		return this.quantity;
	}
	
	
	public void setQty(int qty) {
		this.quantity=quantity;
	}
	
	
	public double getUnitPrice() {
		return this.unitPrice;
	}
	
	
	public void setUnitPrice(double unitPrice){
	 this.unitPrice=unitPrice;
	}
	
	
	public String toString() {
		return "InvoiceItem Id : "+id+"description : "+desc+"qty : "+quantity+"unitPrice : "+unitPrice;
	}
	
	
	public double getTotal() {
			return unitPrice*quantity;	
	}
	
	
}