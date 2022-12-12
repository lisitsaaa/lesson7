package Task3;

import java.util.Date;

public class FinancialInvoice extends Register {
    private double totalAmountForTheMonth;
    private Date documentDate;
    private int documentID;
    private int departmentCode;

    public FinancialInvoice(double totalAmountForTheMonth, Date documentDate,
                            int documentID, int departmentCode) {
        this.totalAmountForTheMonth = totalAmountForTheMonth;
        this.documentDate = documentDate;
        this.documentID = documentID;
        this.departmentCode = departmentCode;
        saveDocumentInRegister();
        giveInformationAboutDocument();
    }

    @Override
    public void saveDocumentInRegister() {
    }

    @Override
    public void giveInformationAboutDocument() {
        System.out.println("total amount for the month -> " + totalAmountForTheMonth +
                "\ndocument date -> " + documentDate +
                "\ndocument ID" + documentID +
                "\ndepartment code -> " + departmentCode);
    }
}
