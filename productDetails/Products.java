package productDetails;

public class Products {
    private String category;
    private String prodName;
    private double rate;

    public Products(String category, String prodName, double rate) {
        this.category = category;
        this.prodName = prodName;
        this.rate = rate;
    }

    public String getCategory() {
        return category;
    }

    public String getProdName() {
        return prodName;
    }

    public double getRate() {
        return rate;
    }
}
