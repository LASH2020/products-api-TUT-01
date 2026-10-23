package uk.ac.westminster.products_api;

public class DigitalProduct extends Product {
    private String downlaodUrl;
    private double fileSizedMB;


    DigitalProduct() {

    }




    DigitalProduct(Long id, String name, Double price, String downloadUrl, Double fileSizedMB) {
        super(id, name, price);
        this.downlaodUrl = downloadUrl;
        this.fileSizedMB = fileSizedMB;


    }
    public String getDownlaodUrl() {
        return downlaodUrl;
    }

    public double getFileSizedMB() {
        return fileSizedMB;
    }


}



