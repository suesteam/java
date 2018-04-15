import java.util.Date;


public class Water {

    /* 品牌 */
    private String brand;

    // 净含量
    private int netWeight;

    // 瓶身包装
    private String container;

    // 产地
    private String originPlace;

    // 水的类别
    private String category;

    // 生产日期
    private Date mfDate;


    /**
     * 品牌写入
     */
    public void setBrand(String brand){
        this.brand = brand;
    }

    /**
     * 品牌读取
     */
    public String getBrand(){
        return this.brand;
    }


    /**
     *净含量写入
     */

    public void setNetWeight(int netWeight){
        this.netWeight = netWeight;
    }


    /**
     * 净含量读取
     */

    public int getNetWeight(){
        return this.netWeight;
    }


    /**
     * 瓶身包装写入
     */

    public void setContainer(String container){
        this.container = container;
    }

    /**
     * 瓶身包装读取
     */

    public String getContainer(){
        return this.container;
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
     * 类别写入
     */
    public void setCategory(String category){
        this.category = category;
    }


    /**
     * 类别读取
     */

    public String getCategory(){
        return this.category;
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
}

