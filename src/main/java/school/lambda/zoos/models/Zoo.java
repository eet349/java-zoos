package school.lambda.zoos.models;

public class Zoo {
    private long zooid;
    private String zooname;

    public Zoo() {
    }

    public Zoo(long zooid, String zooname) {
        this.zooid = zooid;
        this.zooname = zooname;
    }

    public long getZooid() {
        return zooid;
    }

    public void setZooid(long zooid) {
        this.zooid = zooid;
    }

    public String getZooname() {
        return zooname;
    }

    public void setZooname(String zooname) {
        this.zooname = zooname;
    }
}
