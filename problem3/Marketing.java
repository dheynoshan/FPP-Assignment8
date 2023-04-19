package problem3;

public class Marketing {
    private String employeeName;
    private String productName;
    private double salesAmount;
    public Marketing(String employeeName, String productName, double salesAmount){
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }
    @Override
    public String toString(){
        return "[Employee Name: " + employeeName + " || Product Name: " +productName + " || Sales Amount: " +salesAmount +"]\n";
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalesAmount() {
        return salesAmount;
    }
    @Override
    public boolean equals(Object obj){
        if(obj==null) return false;
        if(obj.getClass()!=this.getClass()) return false;
        Marketing temp = (Marketing)obj;
        return (temp.getSalesAmount()==this.getSalesAmount());
    }
}
