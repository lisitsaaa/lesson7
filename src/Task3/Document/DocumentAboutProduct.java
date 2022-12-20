package Task3.Document;

import java.util.Date;

public class DocumentAboutProduct extends Document {
    private final String productType;
    private final int productItems;

    public DocumentAboutProduct() {
        super();
        this.productType = "clothes";
        this.productItems = 15;
    }

    public DocumentAboutProduct(int documentNumber, Date documentDate,
                                String productType, int productItems) {
        super(documentNumber, documentDate);
        this.productType = productType;
        this.productItems = productItems;
    }

    @Override
    public void giveInformation() {
        System.out.println("information about product" +
                "\ndocument number: " + getDocumentNumber() +
                "\ndocument date: " + getDocumentDate() +
                "\nproduct type: " + productType +
                "\nproductItems: " + productItems);
    }
}
