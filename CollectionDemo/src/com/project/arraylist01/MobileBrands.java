package com.project.arraylist01;

public class MobileBrands {
	int Id;
	String Name;
	String Color;
	double Price;
	int ManufacturingYear;
	
	public MobileBrands(int id, String name, String color, double price, int manufacturingYear) {
		super();
		Id = id;
		Name = name;
		Color = color;
		Price = price;
		ManufacturingYear = manufacturingYear;
	}

	@Override
	public String toString() {
		return "MobileBrands [Id=" + Id + ", Name=" + Name + ", Color=" + Color + ", Price=" + Price
				+ ", ManufacturingYear=" + ManufacturingYear + "]";
	}
	
	
	

}
