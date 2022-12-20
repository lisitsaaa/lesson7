package Task3.Document;

import java.util.Date;

public class DocumentAboutFinance extends Document {
    private final double totalAmountForTheMonth;
    private final int departmentCode;

    public DocumentAboutFinance() {
        super();
        this.totalAmountForTheMonth = 521.79;
        this.departmentCode = 101;
    }

    public DocumentAboutFinance(int documentNumber, Date documentDate,
                                double totalAmountForTheMonth, int departmentCode) {
        super(documentNumber, documentDate);
        this.totalAmountForTheMonth = totalAmountForTheMonth;
        this.departmentCode = departmentCode;
    }

    @Override
    public void giveInformation() {
        System.out.println("information about finance" +
                "\ndocument number: " + getDocumentNumber() +
                "\ndocument date: " + getDocumentDate() +
                "\ntotal amount for the month: " + totalAmountForTheMonth +
                "\ndepartment code: " + departmentCode);
    }

}
