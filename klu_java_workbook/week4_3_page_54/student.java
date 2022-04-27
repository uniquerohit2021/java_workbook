package week4_3_page_54;

public class student {
    int id;
    String name;
    int m1, m2, m3;
    student(String name, int id,  int m1, int m2, int m3)
    {
        this.name = name;
        this.id = id;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public int getTotal()
    {
        return (m1+m2+m3);
    }

    public int getAvg()
    {
        return ((m1+m2+m3)/3);
    }

    public String toString() {
        String str2 = String.format("Student id: %d\n Student Name: %s\n Subject 1 marks: %d\n   Subject 2 marks: %d\n Subject 3 marks: %d\n Total marks %d\n Avg. Marks %d",id,name, m1, m2,m3,getTotal(), getAvg());
        return str2;
    }
}
