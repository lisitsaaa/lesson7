package Task3;

import java.util.Date;

public class ContractForTheSupplyOfProduct extends Register {
    private int documentID;
    private String productType;
    private int quantityOfProduct;
    private Date documentDate;

    public ContractForTheSupplyOfProduct(int documentID, String productType,
                                         int quantityOfProduct, Date documentDate){
        this.documentID = documentID;
        this.productType = productType;
        this.quantityOfProduct = quantityOfProduct;
        this.documentDate = documentDate;
        saveDocumentInRegister();
        giveInformationAboutDocument();
    }

    public int getDocumentID() {
        return documentID;
    }

    public void setDocumentID(int documentID) {
        this.documentID = documentID;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public void setQuantityOfProduct(int quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }

    @Override
    public void saveDocumentInRegister() {
    }

    @Override
    public void giveInformationAboutDocument() {
        System.out.println("document ID -> " + documentID +
                "\nproduct type -> " + productType +
                "\nquantity of product -> " + quantityOfProduct +
                "\ndocument date" + documentDate);
    }
}
