package weather.api.natnael.Transformer;


public class Current {
    private double temp_c;
    private Condition condition;
    private double uv;


    public Current(double temp_c, Condition condition) {
        this.temp_c = temp_c;
        this.condition = condition;
    }

    public Current() {
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

    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }
}
