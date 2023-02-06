package sda.patterns.structural.proxy;

import java.net.Proxy;
import java.util.List;

public class ProxyDemoApp {
    public static void main(String[] args) {

        CompanyEmployees companyEmployees = new CompanyEmployees();
        List<String> activeEmployees = List.of("Ania", "Marek", "Piotrek", "Michał");
        companyEmployees.setEmployees(activeEmployees);
        CompanyNetwork network = new ProxyCompanyNetwork(companyEmployees);
        network.obtainAccess("Ania");
        network.obtainAccess("Monika");
        network.obtainAccess("Wojtek");
        network.obtainAccess("Piotrek");
        //jak ktoś jest na liście pracowników to private
        //jak kogoś nie ma na liście to public
    }
}
