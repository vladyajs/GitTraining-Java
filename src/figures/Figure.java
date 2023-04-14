package figures;

abstract public class Figure {
    private String name;
    private int AnglesAmount;
    private int SumCorners;

    public String getName() {
        return name;
    }

    public int getAnglesAmount() {
        return AnglesAmount;
    }

    public int getSumCorners() {
        return SumCorners;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnglesAmount(int anglesAmount) {
        AnglesAmount = anglesAmount;
    }

    public void setSumCorners(int sumCorners) {
        SumCorners = sumCorners;
    }
}
