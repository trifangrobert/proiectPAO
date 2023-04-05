package vehicles;

public class Brand implements Comparable<Brand> {
    protected String brandName;
    protected String founderName;
    protected String ceoName;
    protected int revenue;
    public Brand(String brandName, String founderName, String ceoName, int revenue) {
        this.brandName = brandName;
        this.founderName = founderName;
        this.ceoName = ceoName;
        this.revenue = revenue;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getFounderName() {
        return founderName;
    }

    public void setFounderName(String founderName) {
        this.founderName = founderName;
    }

    public String getCeoName() {
        return ceoName;
    }

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandName='" + brandName + '\'' +
                ", founderName='" + founderName + '\'' +
                ", ceoName='" + ceoName + '\'' +
                ", revenue=" + revenue +
                '}';
    }

    @Override
    public int compareTo(Brand o) {
        return this.revenue - o.revenue;
    }
}
