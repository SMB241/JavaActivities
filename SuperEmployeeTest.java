package studentPackage.Employee;

public class SuperEmployeeTest {
    public static void main(String[] args){
        SubContruactual carpenter = new SubContruactual(2025, "Dela Cruz", "Juan");

        carpenter.setContractNumber(4001);
        carpenter.setDesignation("Carpenter");

        carpenter.displayInfo();
    }
}
