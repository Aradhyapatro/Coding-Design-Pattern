package CreationalDesignPattern.ProtoTypePattern;

import java.util.Objects;

public class NetworkConnect implements Cloneable {
    private String ip;
    private String data;

    public String getIp() {
        return ip;
    }

    public String getData() {
        return data;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void getImportantData() throws InterruptedException {
        System.out.println("Obtaining important data");
        Thread.sleep(5000);
        this.data="ip is valid";
    }

    @Override
    public NetworkConnect clone() {
        try {
            NetworkConnect clone = (NetworkConnect) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "NetworkConnect{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NetworkConnect that = (NetworkConnect) o;
        return Objects.equals(ip, that.ip) && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, data);
    }
}
