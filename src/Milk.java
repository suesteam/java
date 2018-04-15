
import java.util.Date;

/**
 *  牛奶对象
 */
public class Milk {
    //品牌
    private String brand;

    // 产地
    private String originPlace;


    // 杀菌方式
    private String disfection;


    // 脂肪含量
    private int fat;


    // 净含量
    private int netWeight;


    // 生产日期
    private Date mfDate;


    // 保质日期
    private Date expDate;

    // 包装种类；
    private String bottle;

    // 适饮人群
    private String customer;

    // 口味
    private String flavor;


    /**
     * 品牌写入
     */
    public void setBrand(String brand){
        this.brand = brand;
    }


    /**
     * 品牌读取
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * 产地写入
     */
    public void setOriginPlace(String originPlace){
        this.originPlace = originPlace;
    }


    /**
     * 产地读取
     */
    public String getOriginPlace(){
        return this.originPlace;
    }

    /**
     * 杀菌方式写入
     */
     public void setDisfection(String disfection){
         this.disfection = disfection;
     }


    /**
     * 杀菌方式读取
     */
     public String getDisfection(){
         return this.disfection;
     }

    /**
     * 脂肪含量写入
     */
     public void setFat(int fat){
         this.fat = fat;
     }


    /**
     * 脂肪含量读取
     */
    public int getFat() {
        return this.fat;
    }


    /**
     * 净含量写入
     */
     public void setNetWeight(int netWeight){
         this.netWeight = netWeight;
     }


    /**
     * 净含量读取
     */
    public int getNetWeight() {
        return this.netWeight;
    }


    /**
     * 生产日期写入
     */
    public void setMfDate(Date mfDate) {
        this.mfDate = mfDate;
    }

    /**
     * 生产日期读取
     */
    public Date getMfDate() {
        return this.mfDate;
    }


    /**
     * 保质日期写入
     */
    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }


    /**
     * 保质日期读取
     */
    public Date getExpDate() {
        return this.expDate;
    }


    /**
     * 瓶身包装写入
     */
    public void setBottle(String bottle) {
        this.bottle = bottle;
    }


    /**
     * 瓶身包装读取
     */
    public String getBottle() {
        return this.bottle;
    }


    /**
     * 适饮人群写入
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }


    /**
     * 适饮人群读取
     */
    public String getCustomer() {
        return this.customer;
    }


    /**
     * 口味写入
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }


    /**
     * 口味读取
     */
    public String getFlavor() {
        return this.flavor;
    }


}
