package weather.api.natnael.Transformer;


public class Condition {

    private double temp_c;
    private Condition condition;

    public Condition(double temp_c, Condition condition) {
        this.temp_c = temp_c;
        this.condition = condition;
    }

    public Condition() {
    }

    public double getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(double temp_c) {
        this.temp_c = temp_c;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
}
