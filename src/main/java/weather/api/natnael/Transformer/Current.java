package weather.api.natnael.Transformer;


public class Current {
    private double temp_c;
    private Condition condition;
    private double uv;
    private double gust_mph;
    private double gust_kph;
    public Current(double temp_c, Condition condition) {
        this.temp_c = temp_c;
        this.condition = condition;
    }

    public Current(double temp_c, Condition condition, double uv, double gust_mph, double gust_kph) {
        this.temp_c = temp_c;
        this.condition = condition;
        this.uv = uv;
        this.gust_mph = gust_mph;
        this.gust_kph = gust_kph;
    }

    public double getGust_mph() {

        return gust_mph;
    }

    public void setGust_mph(double gust_mph) {
        this.gust_mph = gust_mph;
    }

    public double getGust_kph() {
        return gust_kph;
    }

    public void setGust_kph(double gust_kph) {
        this.gust_kph = gust_kph;
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
