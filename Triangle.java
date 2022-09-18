package sample;

public class Triangle {
    private double size1;
    private double size2;
    private double size3;

    public Triangle(double size1, double size2, double size3){
        super();
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }
    public Triangle(){
        super();
    }

    public double getSize1(){
        return size1;
    }

    public double getSize2(){
        return size2;
    }

    public double getSize3(){
        return size3;
    }

    public void setSize1(double size1){
        this.size1 = size1;
    }

    public void setSize2(double size2){
        this.size2 = size2;
    }

    public void setSize3(double size3){
        this.size3 = size3;
    }

    public double getAnswer() {
        double p = (size1+size2+size3)/2;
        double answer = Math.sqrt(p*(p-size1)*(p-size2)*(p-size3));
        return answer;
    }

    public String getString(){
        return "Triangle - [" + "1 - " + size1 + " 2 - " + size2 + " 3 - " + size3 + "]";
    }
}
