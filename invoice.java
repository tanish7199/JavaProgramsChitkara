import java.util.Scanner;

class Invoice{
	String partNumber;
	String description;
	int qty;
	double ppi;
	String get_partNumber(){
		return this.part_number;
	}
	String get_description(){
		return this.description;
	}
	int get_qty(){
		return this.qty;	
	}
	double get_ppi(){
		return this.ppi;
	}
	void set_partNumber(String partNumber){
		if(partNumber<0) partNumber =0;
		this.partNumber = partNumber;
	}
	void setDescription(String description){
		this.description = description;
	}
	void setQty(int qty){
		this.qty = qty;
	}
	void setPpi(double ppi){
		if(ppi<0) ppi=0;
		this.ppi = ppi;
	}
	double getInvoiceAmount(){
		double amount = ppi*qty;
		if(amount>0)
		return amount;
		else return 0;
	}
	public static void main(String[] args){
		Invoice ic = new Invoice();
    		}

}