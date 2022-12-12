package Task3;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ContractForTheSupplyOfProduct contractProduct1 = new ContractForTheSupplyOfProduct(1,
                "car",2,
                new Date(17, Calendar.FEBRUARY,12));
        contractProduct1.giveInformationAboutDocument();

        System.out.println();

        ContractWithAnEmployee contractEmployee1 = new ContractWithAnEmployee(1,
                new Date(22,Calendar.SEPTEMBER,27),
                new Date(17,Calendar.DECEMBER, 19),
                new Date(23, Calendar.MARCH, 21), "Kate" );
        contractEmployee1.giveInformationAboutDocument();

        System.out.println();

        FinancialInvoice financialInvoice1 = new FinancialInvoice(172.32,
                new Date(22,Calendar.SEPTEMBER,27),
                123, 101);
        financialInvoice1.giveInformationAboutDocument();
    }
}
