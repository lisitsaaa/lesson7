package Task3.Document;

import java.util.Calendar;
import java.util.Date;

public abstract class Document implements Method{
    private final int documentNumber;
    private final Date documentDate;

    public Document(){
        this.documentNumber = 1;
        this.documentDate = new Date(122, Calendar.JANUARY,1);
    }

    public Document(int documentNumber, Date documentDate){
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }

    public int getDocumentNumber() {return documentNumber;}

    public Date getDocumentDate() {
        return documentDate;
    }

}
