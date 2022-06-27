package test;
public class Produto {

    private String name;
    private Double value;
    private Integer type;

    public Produto(String name, Double value, Integer type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getValue() {
        return value;
    }
    public void setValue(Double value) {
        this.value = value;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }


}
