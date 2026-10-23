package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product{
    private double weightKg;
    private String dimensions;
    // TODO (a): empty no-arg constructor for Jackson


     PhysicalProduct(){

     }
    // TODO (b): full constructor.



    PhysicalProduct (Long id, String name, double price, double weightKg, String dimensions){
         super(id,name,price);
         this.weightKg =  weightKg;
         this.dimensions =  dimensions;

    }
    // TODO (c): getWeightKg() and getDimensions()
    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

}
