import java.util.Date;

/**
 * 跑步机对象
 */

public class Runningmachine {
    // 适用场所
    private String exercisePlace;

    // 品牌
    private String brand;

    // 跑带宽度
    private int trackWidth;

    // 跑带长度
    private int trackLength;

    // 承重
    private int weight;

    // 马达功率；
    private int motorPower;

    // 减震程度
    private String damping;

    // 最大速度
    private int maxSpeed;

    // 最大坡度
    private int maxSlope;

    // 噪音控制（最大噪音）
    private int maxNoise;

    // 屏幕类型
    private String screenType;

    // 屏幕大小
    private int screenSize;

    // 耗电/h
    private int powerConsumption;

    // 上市时间
    private Date marketTime;


    /**
     * 适用场所写入
     */
    public void setExercisePlace(String exercisePlace) {
        this.exercisePlace = exercisePlace;
    }
    /**
     * 适用场所读取
     */
    public String getExercisePlace() {
        return this.exercisePlace;
    }


    /**
     * 品牌写入
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
    /**
     * 品牌读取
     */
    public String getBrand() {
        return this.brand;
    }


    /**
     * 跑道宽度写入
     */
    public void setTrackWidth(int trackWidth) {
        this.trackWidth = trackWidth;
    }
    /**
     * 跑道宽度读取
     */
    public int getTrackWidth() {
        return this.trackWidth;
    }


    /**
     * 跑道长度写入
     */
    public void setTrackLength(int trackLength) {
        this.trackLength = trackLength;
    }
    /**
     * 跑道长度读取
     */
    public int getTrackLength() {
        return this.trackLength;
    }


    /**
     * 承重写入
     */
    public void setWeight(int weight){
        this.weight = weight;
    }
    /**
     * 承重读取
     */
     public int getWeight(){
        return this.weight;
     }

    /**
     * 马达功率写入
     */
    public void setMotorPower(int motorPower) {
        this.motorPower = motorPower;
    }
    /**
     * 马达功率读取
     */
    public int getMotorPower() {
        return this.motorPower;
    }


    /**
     * 减震写入
     */
    public void setDamping(String damping) {
        this.damping = damping;
    }
    /**
     * 减震读取
     */
    public String getDamping() {
        return this.damping;
    }


    /**
     * 最大速度写入
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    /**
     * 最大速度读取
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }


    /**
     * 最大坡度写入
     */
    public void setMaxSlope(int maxSlope) {
        this.maxSlope = maxSlope;
    }
    /**
     * 最大坡度读取
     */
    public int getMaxSlope() {
        return this.maxSlope;
    }


    /**
     * 噪音写入
     */
    public void setMaxNoise(int maxNoise) {
        this.maxNoise = maxNoise;
    }
    /**
     * 噪音读取
     */
    public int getMaxNoise() {
        return this.maxNoise;
    }


    /**
     * 屏幕类型写入
     */
    public void setScreenType(String screenType){
        this.screenType = screenType;
    }
    /**
     * 屏幕类型读取
     */
    public String getScreenType() {
        return this.screenType;
    }


    /**
     * 屏幕尺寸写入
     */
    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
    /**
     * 屏幕尺寸读取
     */
    public int getScreenSize() {
        return this.screenSize;
    }


    /**
     * 耗电/h写入
     */
    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    /**
     * 耗电/h读取
     */
    public int getPowerConsumption() {
        return this.powerConsumption;
    }


    /**
     * 上市时间写入
     */
    public void setMarketTime(Date marketTime) {
        this.marketTime = marketTime;
    }
    /**
     * 上市时间读取
     */
    public Date getMarketTime() {
        return this.marketTime;
    }
}
