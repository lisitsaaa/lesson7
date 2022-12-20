package Task3.Main;

import Task3.Document.Document;
import Task3.Document.DocumentAboutEmployee;
import Task3.Document.DocumentAboutFinance;
import Task3.Document.DocumentAboutProduct;
import Task3.Register.Register;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Register r1 = new Register();

        Document d1 = new DocumentAboutProduct();
        r1.saveDocument1(d1);

        Document d2 = new DocumentAboutEmployee();
        r1.saveDocument1(d2);

        Document d3 = new DocumentAboutFinance();
        r1.saveDocument1(d3);

        Document d4 = new DocumentAboutProduct(4, new Date(122, Calendar.SEPTEMBER, 3),
                "Car", 3);
        r1.saveDocument1(d4);

        Document d5 = new DocumentAboutEmployee(5, new Date(116, Calendar.OCTOBER, 17),
                new Date(121, Calendar.MARCH, 23), "Maksim");
        r1.saveDocument1(d5);

        Document d6 = new DocumentAboutFinance(6,new Date(122, Calendar.NOVEMBER, 31),
                1071.1, 102);
        r1.saveDocument1(d6);


    }
}
