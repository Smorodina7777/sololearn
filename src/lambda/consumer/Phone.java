package lambda.consumer;

public class Phone {
    String model;
    int weght;

    public Phone(String model, int weght) {
        this.model = model;
        this.weght = weght;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeght() {
        return weght;
    }

    public void setWeght(int weght) {
        this.weght = weght;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", weght=" + weght +
                '}';
    }
}
