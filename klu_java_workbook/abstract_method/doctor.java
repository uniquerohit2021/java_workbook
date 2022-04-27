package abstract_method;

public abstract class doctor {
    int id;
    String name;
    String spec;

    public doctor(int id, String name, String spec) {
        this.id = id;
        this.name = name;
        this.spec = spec;
    }

    @Override
    public String toString() {
        return "doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", spec='" + spec + '\'' +
                '}';
    }

    public abstract double computeSal();
}
class salariesDoctor extends doctor {
    double basic_pay;
    int noOfOperation;
    salariesDoctor(int id, String name, String spec,double basic_pay, int noOfOperation)
    {

    }
    }


