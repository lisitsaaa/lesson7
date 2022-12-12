package Task3;

import java.util.Date;

public class ContractWithAnEmployee extends Register {
    private int documentID;
    private Date documentDate;
    private Date contractStartDate;
    private Date contractEndDate;
    private String workerName;

    public ContractWithAnEmployee(int documentID, Date documentDate,
                                  Date contractStartDate, Date contractEndDate,
                                  String workerName) {
        this.documentID = documentID;
        this.documentDate = documentDate;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.workerName = workerName;
        saveDocumentInRegister();
        giveInformationAboutDocument();
    }
    @Override
    public void saveDocumentInRegister() {
    }

    @Override
    public void giveInformationAboutDocument() {
        System.out.println("document ID -> " + documentID +
                "\ndocument date -> " + documentDate +
                "\ncontract start date -> " + contractStartDate +
                "\ncontract end date -> " + contractEndDate +
                "\nworker name -> " + workerName);
    }
}
