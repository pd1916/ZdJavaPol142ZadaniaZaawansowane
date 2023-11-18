package pl.sdacademy.java.advanced.exercises.day3.nbp;

import java.util.List;
import java.util.Objects;

public class Root {
    private String table;
    private String no;
    private String effectiveDate;
    private List<Rate> rates;

    public Root(String table, String no, String effectiveDate, List<Rate> rates) {
        this.table = table;
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.rates = rates;
    }

    public Root() {
    }

    public String getTable() {
        return table;
    }

    public String getNo() {
        return no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public List<Rate> getRates() {
        return rates;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Root root = (Root) o;
        return Objects.equals(table, root.table) && Objects.equals(no, root.no) && Objects.equals(effectiveDate, root.effectiveDate) && Objects.equals(rates, root.rates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(table, no, effectiveDate, rates);
    }

    @Override
    public String toString() {
        return "Root{" +
                "table='" + table + '\'' +
                ", no='" + no + '\'' +
                ", effectiveDate='" + effectiveDate + '\'' +
                ", rates=" + rates +
                '}';
    }
}
