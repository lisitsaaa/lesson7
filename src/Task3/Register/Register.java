package Task3.Register;

import Task3.Document.Document;

import java.util.Arrays;

public class Register {
    private int counter = 0;
    private final Document[] documents = new Document[10];

    public void saveDocument1(Document document) {
        if (counter < documents.length) {
            documents[counter] = document;
            counter++;
            System.out.println(Arrays.toString(documents));
            printInfo(document);
        }
    }

    private void printInfo(Document document) {
        document.giveInformation();
        System.out.println();
    }
}
