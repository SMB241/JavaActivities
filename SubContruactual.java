package studentPackage.Employee;

public class SubContruactual extends SuperEmployee {
    private int contractnum;
    private String designation;

    SubContruactual(int n, String ln, String fn){
        super(n, ln, fn);
    }

    public void setContractNumber(int cn){
        contractnum = cn;
    }

    public void setDesignation(String d){
        designation = d;
    }

    public int getContractNumnber(){
        return contractnum;
    }

    public String getDesignation(){
        return designation;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Contract NUmber: " + getContractNumnber());
        System.out.println("Designation: " + getDesignation());
    }
}
