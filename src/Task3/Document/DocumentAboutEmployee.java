package Task3.Document;

import java.util.Calendar;
import java.util.Date;

public class DocumentAboutEmployee extends Document {
    private final Date lastDay;
    private final String name;

    public DocumentAboutEmployee() {
        super();
        this.lastDay = new Date(122, Calendar.DECEMBER, 31);
        this.name = "Stanislav";
    }

    public DocumentAboutEmployee(int documentNumber, Date documentDate,
                                 Date lastDay, String name) {
        super(documentNumber, documentDate);
        this.lastDay = lastDay;
        this.name = name;
    }

    @Override
    public void giveInformation() {
        System.out.println("information about employee" +
                "\ndocument number: " + getDocumentNumber() +
                "\ndocument date: " + getDocumentDate() +
                "\nlast working day: " + lastDay +
                "\nemployee name: " + name);
    }
}
