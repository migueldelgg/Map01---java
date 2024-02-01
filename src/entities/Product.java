package entities;

import java.util.Objects;

public class Product {
    private String productName;
    private Double productValue;

    public Product(String productName, Double productValue) {
        this.productName = productName;
        this.productValue = productValue;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductValue() {
        return productValue;
    }

    public void setProductValue(Double productValue) {
        this.productValue = productValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName) && Objects.equals(productValue, product.productValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productValue);
    }
}
