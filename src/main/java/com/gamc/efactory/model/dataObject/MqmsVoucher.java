package com.gamc.efactory.model.dataObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author wangjian
*/
public class MqmsVoucher implements Serializable {

    private static final long serialVersionUID = 1582703407377L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer voucherId;

    /**
    * 质量反馈单号
    * isNullAble:0
    */
    private String qualityFeedbackCode;

    /**
    * 索赔单号
    * isNullAble:1
    */
    private String voucherCode;

    /**
    * 经销商代码
    * isNullAble:1
    */
    private String dealerCode;

    /**
    * 经销商名称
    * isNullAble:1
    */
    private String dealerName;

    /**
    * 经销商简称
    * isNullAble:1
    */
    private String dealerShortName;

    /**
    * 主题
    * isNullAble:1
    */
    private String theme;

    /**
    * vin码
    * isNullAble:1
    */
    private String vinCode;

    /**
    * 车辆类型
    * isNullAble:1
    */
    private String vehicleType;

    /**
    * 零部件名称
    * isNullAble:1
    */
    private String partsName;

    /**
    * 一级名称
    * isNullAble:1
    */
    private String firstLevelName;

    /**
    * 零件简称-具体现象
    * isNullAble:1
    */
    private String partsShortNameSpecPneno;

    /**
    * 生产日期
    * isNullAble:1
    */
    private String manufactureDate;

    /**
    * 销售至故障经过月
    * isNullAble:1
    */
    private String salesFailureTime;

    /**
    * 故障描述
    * isNullAble:1
    */
    private String symptomName;

    /**
    * 诊断过程
    * isNullAble:1
    */
    private String symptomContent;

    /**
    * 工时费
    * isNullAble:1
    */
    private java.math.BigDecimal manCost;

    /**
    * 配件金额
    * isNullAble:1
    */
    private java.math.BigDecimal partsCost;

    /**
    * 配件管理费
    * isNullAble:1
    */
    private java.math.BigDecimal partsManagerCost;

    /**
    * 外出费用
    * isNullAble:1
    */
    private java.math.BigDecimal outgoingCost;

    /**
    * 
    * isNullAble:1
    */
    private java.math.BigDecimal maintainCost;

    /**
    * 其他费用
    * isNullAble:1
    */
    private java.math.BigDecimal otherCost;

    /**
    * 总费用
    * isNullAble:1
    */
    private java.math.BigDecimal totalCost;

    /**
    * 重要级别
    * isNullAble:1
    */
    private String importantLevel;

    /**
    * 变速箱类型
    * isNullAble:1
    */
    private String transmissionType;

    /**
    * 新件绑定编号
    * isNullAble:1
    */
    private String newPartsBlindingNum;

    /**
    * 提交时间
    * isNullAble:1
    */
    private String submitDate;

    /**
    * 发动机号
    * isNullAble:1
    */
    private String engCode;

    /**
    * 发动机生产日期
    * isNullAble:1
    */
    private String engManufactureDate;

    /**
    * 变速箱号
    * isNullAble:1
    */
    private String transmissionCodeRe;

    /**
    * 变速箱生产日期
    * isNullAble:1
    */
    private String transmissionManufacturer;

    /**
    * ENG整理
    * isNullAble:1
    */
    private String engArrange;

    /**
    * 车型
    * isNullAble:1
    */
    private String carModel;

    /**
    * 接收区间
    * isNullAble:1
    */
    private String receiveTime;

    /**
    * 是否计入索赔
    * isNullAble:1
    */
    private String claimCompensation;

    /**
    * 车型短吗
    * isNullAble:1
    */
    private String shortCode;

    /**
    * 故障码分类
    * isNullAble:1
    */
    private String faultCodeClassification;


    public void setVoucherId(Integer voucherId){this.voucherId = voucherId;}

    public Integer getVoucherId(){return this.voucherId;}

    public void setQualityFeedbackCode(String qualityFeedbackCode){this.qualityFeedbackCode = qualityFeedbackCode;}

    public String getQualityFeedbackCode(){return this.qualityFeedbackCode;}

    public void setVoucherCode(String voucherCode){this.voucherCode = voucherCode;}

    public String getVoucherCode(){return this.voucherCode;}

    public void setDealerCode(String dealerCode){this.dealerCode = dealerCode;}

    public String getDealerCode(){return this.dealerCode;}

    public void setDealerName(String dealerName){this.dealerName = dealerName;}

    public String getDealerName(){return this.dealerName;}

    public void setDealerShortName(String dealerShortName){this.dealerShortName = dealerShortName;}

    public String getDealerShortName(){return this.dealerShortName;}

    public void setTheme(String theme){this.theme = theme;}

    public String getTheme(){return this.theme;}

    public void setVinCode(String vinCode){this.vinCode = vinCode;}

    public String getVinCode(){return this.vinCode;}

    public void setVehicleType(String vehicleType){this.vehicleType = vehicleType;}

    public String getVehicleType(){return this.vehicleType;}

    public void setPartsName(String partsName){this.partsName = partsName;}

    public String getPartsName(){return this.partsName;}

    public void setFirstLevelName(String firstLevelName){this.firstLevelName = firstLevelName;}

    public String getFirstLevelName(){return this.firstLevelName;}

    public void setPartsShortNameSpecPneno(String partsShortNameSpecPneno){this.partsShortNameSpecPneno = partsShortNameSpecPneno;}

    public String getPartsShortNameSpecPneno(){return this.partsShortNameSpecPneno;}

    public void setManufactureDate(String manufactureDate){this.manufactureDate = manufactureDate;}

    public String getManufactureDate(){return this.manufactureDate;}

    public void setSalesFailureTime(String salesFailureTime){this.salesFailureTime = salesFailureTime;}

    public String getSalesFailureTime(){return this.salesFailureTime;}

    public void setSymptomName(String symptomName){this.symptomName = symptomName;}

    public String getSymptomName(){return this.symptomName;}

    public void setSymptomContent(String symptomContent){this.symptomContent = symptomContent;}

    public String getSymptomContent(){return this.symptomContent;}

    public void setManCost(java.math.BigDecimal manCost){this.manCost = manCost;}

    public java.math.BigDecimal getManCost(){return this.manCost;}

    public void setPartsCost(java.math.BigDecimal partsCost){this.partsCost = partsCost;}

    public java.math.BigDecimal getPartsCost(){return this.partsCost;}

    public void setPartsManagerCost(java.math.BigDecimal partsManagerCost){this.partsManagerCost = partsManagerCost;}

    public java.math.BigDecimal getPartsManagerCost(){return this.partsManagerCost;}

    public void setOutgoingCost(java.math.BigDecimal outgoingCost){this.outgoingCost = outgoingCost;}

    public java.math.BigDecimal getOutgoingCost(){return this.outgoingCost;}

    public void setMaintainCost(java.math.BigDecimal maintainCost){this.maintainCost = maintainCost;}

    public java.math.BigDecimal getMaintainCost(){return this.maintainCost;}

    public void setOtherCost(java.math.BigDecimal otherCost){this.otherCost = otherCost;}

    public java.math.BigDecimal getOtherCost(){return this.otherCost;}

    public void setTotalCost(java.math.BigDecimal totalCost){this.totalCost = totalCost;}

    public java.math.BigDecimal getTotalCost(){return this.totalCost;}

    public void setImportantLevel(String importantLevel){this.importantLevel = importantLevel;}

    public String getImportantLevel(){return this.importantLevel;}

    public void setTransmissionType(String transmissionType){this.transmissionType = transmissionType;}

    public String getTransmissionType(){return this.transmissionType;}

    public void setNewPartsBlindingNum(String newPartsBlindingNum){this.newPartsBlindingNum = newPartsBlindingNum;}

    public String getNewPartsBlindingNum(){return this.newPartsBlindingNum;}

    public void setSubmitDate(String submitDate){this.submitDate = submitDate;}

    public String getSubmitDate(){return this.submitDate;}

    public void setEngCode(String engCode){this.engCode = engCode;}

    public String getEngCode(){return this.engCode;}

    public void setEngManufactureDate(String engManufactureDate){this.engManufactureDate = engManufactureDate;}

    public String getEngManufactureDate(){return this.engManufactureDate;}

    public void setTransmissionCodeRe(String transmissionCodeRe){this.transmissionCodeRe = transmissionCodeRe;}

    public String getTransmissionCodeRe(){return this.transmissionCodeRe;}

    public void setTransmissionManufacturer(String transmissionManufacturer){this.transmissionManufacturer = transmissionManufacturer;}

    public String getTransmissionManufacturer(){return this.transmissionManufacturer;}

    public void setEngArrange(String engArrange){this.engArrange = engArrange;}

    public String getEngArrange(){return this.engArrange;}

    public void setCarModel(String carModel){this.carModel = carModel;}

    public String getCarModel(){return this.carModel;}

    public void setReceiveTime(String receiveTime){this.receiveTime = receiveTime;}

    public String getReceiveTime(){return this.receiveTime;}

    public void setClaimCompensation(String claimCompensation){this.claimCompensation = claimCompensation;}

    public String getClaimCompensation(){return this.claimCompensation;}

    public void setShortCode(String shortCode){this.shortCode = shortCode;}

    public String getShortCode(){return this.shortCode;}

    public void setFaultCodeClassification(String faultCodeClassification){this.faultCodeClassification = faultCodeClassification;}

    public String getFaultCodeClassification(){return this.faultCodeClassification;}
    @Override
    public String toString() {
        return "MqmsVoucher{" +
                "voucherId='" + voucherId + '\'' +
                "qualityFeedbackCode='" + qualityFeedbackCode + '\'' +
                "voucherCode='" + voucherCode + '\'' +
                "dealerCode='" + dealerCode + '\'' +
                "dealerName='" + dealerName + '\'' +
                "dealerShortName='" + dealerShortName + '\'' +
                "theme='" + theme + '\'' +
                "vinCode='" + vinCode + '\'' +
                "vehicleType='" + vehicleType + '\'' +
                "partsName='" + partsName + '\'' +
                "firstLevelName='" + firstLevelName + '\'' +
                "partsShortNameSpecPneno='" + partsShortNameSpecPneno + '\'' +
                "manufactureDate='" + manufactureDate + '\'' +
                "salesFailureTime='" + salesFailureTime + '\'' +
                "symptomName='" + symptomName + '\'' +
                "symptomContent='" + symptomContent + '\'' +
                "manCost='" + manCost + '\'' +
                "partsCost='" + partsCost + '\'' +
                "partsManagerCost='" + partsManagerCost + '\'' +
                "outgoingCost='" + outgoingCost + '\'' +
                "maintainCost='" + maintainCost + '\'' +
                "otherCost='" + otherCost + '\'' +
                "totalCost='" + totalCost + '\'' +
                "importantLevel='" + importantLevel + '\'' +
                "transmissionType='" + transmissionType + '\'' +
                "newPartsBlindingNum='" + newPartsBlindingNum + '\'' +
                "submitDate='" + submitDate + '\'' +
                "engCode='" + engCode + '\'' +
                "engManufactureDate='" + engManufactureDate + '\'' +
                "transmissionCodeRe='" + transmissionCodeRe + '\'' +
                "transmissionManufacturer='" + transmissionManufacturer + '\'' +
                "engArrange='" + engArrange + '\'' +
                "carModel='" + carModel + '\'' +
                "receiveTime='" + receiveTime + '\'' +
                "claimCompensation='" + claimCompensation + '\'' +
                "shortCode='" + shortCode + '\'' +
                "faultCodeClassification='" + faultCodeClassification + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsVoucher set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsVoucher set){
            this.set = set;
            return this;
        }

        public MqmsVoucher getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends MqmsVoucher{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> voucherIdList;

        public List<Integer> getVoucherIdList(){return this.voucherIdList;}

        private Integer voucherIdSt;

        private Integer voucherIdEd;

        public Integer getVoucherIdSt(){return this.voucherIdSt;}

        public Integer getVoucherIdEd(){return this.voucherIdEd;}

        private List<String> qualityFeedbackCodeList;

        public List<String> getQualityFeedbackCodeList(){return this.qualityFeedbackCodeList;}


        private List<String> fuzzyQualityFeedbackCode;

        public List<String> getFuzzyQualityFeedbackCode(){return this.fuzzyQualityFeedbackCode;}

        private List<String> rightFuzzyQualityFeedbackCode;

        public List<String> getRightFuzzyQualityFeedbackCode(){return this.rightFuzzyQualityFeedbackCode;}
        private List<String> voucherCodeList;

        public List<String> getVoucherCodeList(){return this.voucherCodeList;}


        private List<String> fuzzyVoucherCode;

        public List<String> getFuzzyVoucherCode(){return this.fuzzyVoucherCode;}

        private List<String> rightFuzzyVoucherCode;

        public List<String> getRightFuzzyVoucherCode(){return this.rightFuzzyVoucherCode;}
        private List<String> dealerCodeList;

        public List<String> getDealerCodeList(){return this.dealerCodeList;}


        private List<String> fuzzyDealerCode;

        public List<String> getFuzzyDealerCode(){return this.fuzzyDealerCode;}

        private List<String> rightFuzzyDealerCode;

        public List<String> getRightFuzzyDealerCode(){return this.rightFuzzyDealerCode;}
        private List<String> dealerNameList;

        public List<String> getDealerNameList(){return this.dealerNameList;}


        private List<String> fuzzyDealerName;

        public List<String> getFuzzyDealerName(){return this.fuzzyDealerName;}

        private List<String> rightFuzzyDealerName;

        public List<String> getRightFuzzyDealerName(){return this.rightFuzzyDealerName;}
        private List<String> dealerShortNameList;

        public List<String> getDealerShortNameList(){return this.dealerShortNameList;}


        private List<String> fuzzyDealerShortName;

        public List<String> getFuzzyDealerShortName(){return this.fuzzyDealerShortName;}

        private List<String> rightFuzzyDealerShortName;

        public List<String> getRightFuzzyDealerShortName(){return this.rightFuzzyDealerShortName;}
        private List<String> themeList;

        public List<String> getThemeList(){return this.themeList;}


        private List<String> fuzzyTheme;

        public List<String> getFuzzyTheme(){return this.fuzzyTheme;}

        private List<String> rightFuzzyTheme;

        public List<String> getRightFuzzyTheme(){return this.rightFuzzyTheme;}
        private List<String> vinCodeList;

        public List<String> getVinCodeList(){return this.vinCodeList;}


        private List<String> fuzzyVinCode;

        public List<String> getFuzzyVinCode(){return this.fuzzyVinCode;}

        private List<String> rightFuzzyVinCode;

        public List<String> getRightFuzzyVinCode(){return this.rightFuzzyVinCode;}
        private List<String> vehicleTypeList;

        public List<String> getVehicleTypeList(){return this.vehicleTypeList;}


        private List<String> fuzzyVehicleType;

        public List<String> getFuzzyVehicleType(){return this.fuzzyVehicleType;}

        private List<String> rightFuzzyVehicleType;

        public List<String> getRightFuzzyVehicleType(){return this.rightFuzzyVehicleType;}
        private List<String> partsNameList;

        public List<String> getPartsNameList(){return this.partsNameList;}


        private List<String> fuzzyPartsName;

        public List<String> getFuzzyPartsName(){return this.fuzzyPartsName;}

        private List<String> rightFuzzyPartsName;

        public List<String> getRightFuzzyPartsName(){return this.rightFuzzyPartsName;}
        private List<String> firstLevelNameList;

        public List<String> getFirstLevelNameList(){return this.firstLevelNameList;}


        private List<String> fuzzyFirstLevelName;

        public List<String> getFuzzyFirstLevelName(){return this.fuzzyFirstLevelName;}

        private List<String> rightFuzzyFirstLevelName;

        public List<String> getRightFuzzyFirstLevelName(){return this.rightFuzzyFirstLevelName;}
        private List<String> partsShortNameSpecPnenoList;

        public List<String> getPartsShortNameSpecPnenoList(){return this.partsShortNameSpecPnenoList;}


        private List<String> fuzzyPartsShortNameSpecPneno;

        public List<String> getFuzzyPartsShortNameSpecPneno(){return this.fuzzyPartsShortNameSpecPneno;}

        private List<String> rightFuzzyPartsShortNameSpecPneno;

        public List<String> getRightFuzzyPartsShortNameSpecPneno(){return this.rightFuzzyPartsShortNameSpecPneno;}
        private List<String> manufactureDateList;

        public List<String> getManufactureDateList(){return this.manufactureDateList;}


        private List<String> fuzzyManufactureDate;

        public List<String> getFuzzyManufactureDate(){return this.fuzzyManufactureDate;}

        private List<String> rightFuzzyManufactureDate;

        public List<String> getRightFuzzyManufactureDate(){return this.rightFuzzyManufactureDate;}
        private List<String> salesFailureTimeList;

        public List<String> getSalesFailureTimeList(){return this.salesFailureTimeList;}


        private List<String> fuzzySalesFailureTime;

        public List<String> getFuzzySalesFailureTime(){return this.fuzzySalesFailureTime;}

        private List<String> rightFuzzySalesFailureTime;

        public List<String> getRightFuzzySalesFailureTime(){return this.rightFuzzySalesFailureTime;}
        private List<String> symptomNameList;

        public List<String> getSymptomNameList(){return this.symptomNameList;}


        private List<String> fuzzySymptomName;

        public List<String> getFuzzySymptomName(){return this.fuzzySymptomName;}

        private List<String> rightFuzzySymptomName;

        public List<String> getRightFuzzySymptomName(){return this.rightFuzzySymptomName;}
        private List<String> symptomContentList;

        public List<String> getSymptomContentList(){return this.symptomContentList;}


        private List<String> fuzzySymptomContent;

        public List<String> getFuzzySymptomContent(){return this.fuzzySymptomContent;}

        private List<String> rightFuzzySymptomContent;

        public List<String> getRightFuzzySymptomContent(){return this.rightFuzzySymptomContent;}
        private List<java.math.BigDecimal> manCostList;

        public List<java.math.BigDecimal> getManCostList(){return this.manCostList;}

        private java.math.BigDecimal manCostSt;

        private java.math.BigDecimal manCostEd;

        public java.math.BigDecimal getManCostSt(){return this.manCostSt;}

        public java.math.BigDecimal getManCostEd(){return this.manCostEd;}

        private List<java.math.BigDecimal> partsCostList;

        public List<java.math.BigDecimal> getPartsCostList(){return this.partsCostList;}

        private java.math.BigDecimal partsCostSt;

        private java.math.BigDecimal partsCostEd;

        public java.math.BigDecimal getPartsCostSt(){return this.partsCostSt;}

        public java.math.BigDecimal getPartsCostEd(){return this.partsCostEd;}

        private List<java.math.BigDecimal> partsManagerCostList;

        public List<java.math.BigDecimal> getPartsManagerCostList(){return this.partsManagerCostList;}

        private java.math.BigDecimal partsManagerCostSt;

        private java.math.BigDecimal partsManagerCostEd;

        public java.math.BigDecimal getPartsManagerCostSt(){return this.partsManagerCostSt;}

        public java.math.BigDecimal getPartsManagerCostEd(){return this.partsManagerCostEd;}

        private List<java.math.BigDecimal> outgoingCostList;

        public List<java.math.BigDecimal> getOutgoingCostList(){return this.outgoingCostList;}

        private java.math.BigDecimal outgoingCostSt;

        private java.math.BigDecimal outgoingCostEd;

        public java.math.BigDecimal getOutgoingCostSt(){return this.outgoingCostSt;}

        public java.math.BigDecimal getOutgoingCostEd(){return this.outgoingCostEd;}

        private List<java.math.BigDecimal> maintainCostList;

        public List<java.math.BigDecimal> getMaintainCostList(){return this.maintainCostList;}

        private java.math.BigDecimal maintainCostSt;

        private java.math.BigDecimal maintainCostEd;

        public java.math.BigDecimal getMaintainCostSt(){return this.maintainCostSt;}

        public java.math.BigDecimal getMaintainCostEd(){return this.maintainCostEd;}

        private List<java.math.BigDecimal> otherCostList;

        public List<java.math.BigDecimal> getOtherCostList(){return this.otherCostList;}

        private java.math.BigDecimal otherCostSt;

        private java.math.BigDecimal otherCostEd;

        public java.math.BigDecimal getOtherCostSt(){return this.otherCostSt;}

        public java.math.BigDecimal getOtherCostEd(){return this.otherCostEd;}

        private List<java.math.BigDecimal> totalCostList;

        public List<java.math.BigDecimal> getTotalCostList(){return this.totalCostList;}

        private java.math.BigDecimal totalCostSt;

        private java.math.BigDecimal totalCostEd;

        public java.math.BigDecimal getTotalCostSt(){return this.totalCostSt;}

        public java.math.BigDecimal getTotalCostEd(){return this.totalCostEd;}

        private List<String> importantLevelList;

        public List<String> getImportantLevelList(){return this.importantLevelList;}


        private List<String> fuzzyImportantLevel;

        public List<String> getFuzzyImportantLevel(){return this.fuzzyImportantLevel;}

        private List<String> rightFuzzyImportantLevel;

        public List<String> getRightFuzzyImportantLevel(){return this.rightFuzzyImportantLevel;}
        private List<String> transmissionTypeList;

        public List<String> getTransmissionTypeList(){return this.transmissionTypeList;}


        private List<String> fuzzyTransmissionType;

        public List<String> getFuzzyTransmissionType(){return this.fuzzyTransmissionType;}

        private List<String> rightFuzzyTransmissionType;

        public List<String> getRightFuzzyTransmissionType(){return this.rightFuzzyTransmissionType;}
        private List<String> newPartsBlindingNumList;

        public List<String> getNewPartsBlindingNumList(){return this.newPartsBlindingNumList;}


        private List<String> fuzzyNewPartsBlindingNum;

        public List<String> getFuzzyNewPartsBlindingNum(){return this.fuzzyNewPartsBlindingNum;}

        private List<String> rightFuzzyNewPartsBlindingNum;

        public List<String> getRightFuzzyNewPartsBlindingNum(){return this.rightFuzzyNewPartsBlindingNum;}
        private List<String> submitDateList;

        public List<String> getSubmitDateList(){return this.submitDateList;}


        private List<String> fuzzySubmitDate;

        public List<String> getFuzzySubmitDate(){return this.fuzzySubmitDate;}

        private List<String> rightFuzzySubmitDate;

        public List<String> getRightFuzzySubmitDate(){return this.rightFuzzySubmitDate;}
        private List<String> engCodeList;

        public List<String> getEngCodeList(){return this.engCodeList;}


        private List<String> fuzzyEngCode;

        public List<String> getFuzzyEngCode(){return this.fuzzyEngCode;}

        private List<String> rightFuzzyEngCode;

        public List<String> getRightFuzzyEngCode(){return this.rightFuzzyEngCode;}
        private List<String> engManufactureDateList;

        public List<String> getEngManufactureDateList(){return this.engManufactureDateList;}


        private List<String> fuzzyEngManufactureDate;

        public List<String> getFuzzyEngManufactureDate(){return this.fuzzyEngManufactureDate;}

        private List<String> rightFuzzyEngManufactureDate;

        public List<String> getRightFuzzyEngManufactureDate(){return this.rightFuzzyEngManufactureDate;}
        private List<String> transmissionCodeReList;

        public List<String> getTransmissionCodeReList(){return this.transmissionCodeReList;}


        private List<String> fuzzyTransmissionCodeRe;

        public List<String> getFuzzyTransmissionCodeRe(){return this.fuzzyTransmissionCodeRe;}

        private List<String> rightFuzzyTransmissionCodeRe;

        public List<String> getRightFuzzyTransmissionCodeRe(){return this.rightFuzzyTransmissionCodeRe;}
        private List<String> transmissionManufacturerList;

        public List<String> getTransmissionManufacturerList(){return this.transmissionManufacturerList;}


        private List<String> fuzzyTransmissionManufacturer;

        public List<String> getFuzzyTransmissionManufacturer(){return this.fuzzyTransmissionManufacturer;}

        private List<String> rightFuzzyTransmissionManufacturer;

        public List<String> getRightFuzzyTransmissionManufacturer(){return this.rightFuzzyTransmissionManufacturer;}
        private List<String> engArrangeList;

        public List<String> getEngArrangeList(){return this.engArrangeList;}


        private List<String> fuzzyEngArrange;

        public List<String> getFuzzyEngArrange(){return this.fuzzyEngArrange;}

        private List<String> rightFuzzyEngArrange;

        public List<String> getRightFuzzyEngArrange(){return this.rightFuzzyEngArrange;}
        private List<String> carModelList;

        public List<String> getCarModelList(){return this.carModelList;}


        private List<String> fuzzyCarModel;

        public List<String> getFuzzyCarModel(){return this.fuzzyCarModel;}

        private List<String> rightFuzzyCarModel;

        public List<String> getRightFuzzyCarModel(){return this.rightFuzzyCarModel;}
        private List<String> receiveTimeList;

        public List<String> getReceiveTimeList(){return this.receiveTimeList;}


        private List<String> fuzzyReceiveTime;

        public List<String> getFuzzyReceiveTime(){return this.fuzzyReceiveTime;}

        private List<String> rightFuzzyReceiveTime;

        public List<String> getRightFuzzyReceiveTime(){return this.rightFuzzyReceiveTime;}
        private List<String> claimCompensationList;

        public List<String> getClaimCompensationList(){return this.claimCompensationList;}


        private List<String> fuzzyClaimCompensation;

        public List<String> getFuzzyClaimCompensation(){return this.fuzzyClaimCompensation;}

        private List<String> rightFuzzyClaimCompensation;

        public List<String> getRightFuzzyClaimCompensation(){return this.rightFuzzyClaimCompensation;}
        private List<String> shortCodeList;

        public List<String> getShortCodeList(){return this.shortCodeList;}


        private List<String> fuzzyShortCode;

        public List<String> getFuzzyShortCode(){return this.fuzzyShortCode;}

        private List<String> rightFuzzyShortCode;

        public List<String> getRightFuzzyShortCode(){return this.rightFuzzyShortCode;}
        private List<String> faultCodeClassificationList;

        public List<String> getFaultCodeClassificationList(){return this.faultCodeClassificationList;}


        private List<String> fuzzyFaultCodeClassification;

        public List<String> getFuzzyFaultCodeClassification(){return this.fuzzyFaultCodeClassification;}

        private List<String> rightFuzzyFaultCodeClassification;

        public List<String> getRightFuzzyFaultCodeClassification(){return this.rightFuzzyFaultCodeClassification;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder voucherIdBetWeen(Integer voucherIdSt,Integer voucherIdEd){
            this.voucherIdSt = voucherIdSt;
            this.voucherIdEd = voucherIdEd;
            return this;
        }

        public QueryBuilder voucherIdGreaterEqThan(Integer voucherIdSt){
            this.voucherIdSt = voucherIdSt;
            return this;
        }
        public QueryBuilder voucherIdLessEqThan(Integer voucherIdEd){
            this.voucherIdEd = voucherIdEd;
            return this;
        }


        public QueryBuilder voucherId(Integer voucherId){
            setVoucherId(voucherId);
            return this;
        }

        public QueryBuilder voucherIdList(Integer ... voucherId){
            this.voucherIdList = solveNullList(voucherId);
            return this;
        }

        public QueryBuilder voucherIdList(List<Integer> voucherId){
            this.voucherIdList = voucherId;
            return this;
        }

        public QueryBuilder fetchVoucherId(){
            setFetchFields("fetchFields","voucherId");
            return this;
        }

        public QueryBuilder excludeVoucherId(){
            setFetchFields("excludeFields","voucherId");
            return this;
        }

        public QueryBuilder fuzzyQualityFeedbackCode (List<String> fuzzyQualityFeedbackCode){
            this.fuzzyQualityFeedbackCode = fuzzyQualityFeedbackCode;
            return this;
        }

        public QueryBuilder fuzzyQualityFeedbackCode (String ... fuzzyQualityFeedbackCode){
            this.fuzzyQualityFeedbackCode = solveNullList(fuzzyQualityFeedbackCode);
            return this;
        }

        public QueryBuilder rightFuzzyQualityFeedbackCode (List<String> rightFuzzyQualityFeedbackCode){
            this.rightFuzzyQualityFeedbackCode = rightFuzzyQualityFeedbackCode;
            return this;
        }

        public QueryBuilder rightFuzzyQualityFeedbackCode (String ... rightFuzzyQualityFeedbackCode){
            this.rightFuzzyQualityFeedbackCode = solveNullList(rightFuzzyQualityFeedbackCode);
            return this;
        }

        public QueryBuilder qualityFeedbackCode(String qualityFeedbackCode){
            setQualityFeedbackCode(qualityFeedbackCode);
            return this;
        }

        public QueryBuilder qualityFeedbackCodeList(String ... qualityFeedbackCode){
            this.qualityFeedbackCodeList = solveNullList(qualityFeedbackCode);
            return this;
        }

        public QueryBuilder qualityFeedbackCodeList(List<String> qualityFeedbackCode){
            this.qualityFeedbackCodeList = qualityFeedbackCode;
            return this;
        }

        public QueryBuilder fetchQualityFeedbackCode(){
            setFetchFields("fetchFields","qualityFeedbackCode");
            return this;
        }

        public QueryBuilder excludeQualityFeedbackCode(){
            setFetchFields("excludeFields","qualityFeedbackCode");
            return this;
        }

        public QueryBuilder fuzzyVoucherCode (List<String> fuzzyVoucherCode){
            this.fuzzyVoucherCode = fuzzyVoucherCode;
            return this;
        }

        public QueryBuilder fuzzyVoucherCode (String ... fuzzyVoucherCode){
            this.fuzzyVoucherCode = solveNullList(fuzzyVoucherCode);
            return this;
        }

        public QueryBuilder rightFuzzyVoucherCode (List<String> rightFuzzyVoucherCode){
            this.rightFuzzyVoucherCode = rightFuzzyVoucherCode;
            return this;
        }

        public QueryBuilder rightFuzzyVoucherCode (String ... rightFuzzyVoucherCode){
            this.rightFuzzyVoucherCode = solveNullList(rightFuzzyVoucherCode);
            return this;
        }

        public QueryBuilder voucherCode(String voucherCode){
            setVoucherCode(voucherCode);
            return this;
        }

        public QueryBuilder voucherCodeList(String ... voucherCode){
            this.voucherCodeList = solveNullList(voucherCode);
            return this;
        }

        public QueryBuilder voucherCodeList(List<String> voucherCode){
            this.voucherCodeList = voucherCode;
            return this;
        }

        public QueryBuilder fetchVoucherCode(){
            setFetchFields("fetchFields","voucherCode");
            return this;
        }

        public QueryBuilder excludeVoucherCode(){
            setFetchFields("excludeFields","voucherCode");
            return this;
        }

        public QueryBuilder fuzzyDealerCode (List<String> fuzzyDealerCode){
            this.fuzzyDealerCode = fuzzyDealerCode;
            return this;
        }

        public QueryBuilder fuzzyDealerCode (String ... fuzzyDealerCode){
            this.fuzzyDealerCode = solveNullList(fuzzyDealerCode);
            return this;
        }

        public QueryBuilder rightFuzzyDealerCode (List<String> rightFuzzyDealerCode){
            this.rightFuzzyDealerCode = rightFuzzyDealerCode;
            return this;
        }

        public QueryBuilder rightFuzzyDealerCode (String ... rightFuzzyDealerCode){
            this.rightFuzzyDealerCode = solveNullList(rightFuzzyDealerCode);
            return this;
        }

        public QueryBuilder dealerCode(String dealerCode){
            setDealerCode(dealerCode);
            return this;
        }

        public QueryBuilder dealerCodeList(String ... dealerCode){
            this.dealerCodeList = solveNullList(dealerCode);
            return this;
        }

        public QueryBuilder dealerCodeList(List<String> dealerCode){
            this.dealerCodeList = dealerCode;
            return this;
        }

        public QueryBuilder fetchDealerCode(){
            setFetchFields("fetchFields","dealerCode");
            return this;
        }

        public QueryBuilder excludeDealerCode(){
            setFetchFields("excludeFields","dealerCode");
            return this;
        }

        public QueryBuilder fuzzyDealerName (List<String> fuzzyDealerName){
            this.fuzzyDealerName = fuzzyDealerName;
            return this;
        }

        public QueryBuilder fuzzyDealerName (String ... fuzzyDealerName){
            this.fuzzyDealerName = solveNullList(fuzzyDealerName);
            return this;
        }

        public QueryBuilder rightFuzzyDealerName (List<String> rightFuzzyDealerName){
            this.rightFuzzyDealerName = rightFuzzyDealerName;
            return this;
        }

        public QueryBuilder rightFuzzyDealerName (String ... rightFuzzyDealerName){
            this.rightFuzzyDealerName = solveNullList(rightFuzzyDealerName);
            return this;
        }

        public QueryBuilder dealerName(String dealerName){
            setDealerName(dealerName);
            return this;
        }

        public QueryBuilder dealerNameList(String ... dealerName){
            this.dealerNameList = solveNullList(dealerName);
            return this;
        }

        public QueryBuilder dealerNameList(List<String> dealerName){
            this.dealerNameList = dealerName;
            return this;
        }

        public QueryBuilder fetchDealerName(){
            setFetchFields("fetchFields","dealerName");
            return this;
        }

        public QueryBuilder excludeDealerName(){
            setFetchFields("excludeFields","dealerName");
            return this;
        }

        public QueryBuilder fuzzyDealerShortName (List<String> fuzzyDealerShortName){
            this.fuzzyDealerShortName = fuzzyDealerShortName;
            return this;
        }

        public QueryBuilder fuzzyDealerShortName (String ... fuzzyDealerShortName){
            this.fuzzyDealerShortName = solveNullList(fuzzyDealerShortName);
            return this;
        }

        public QueryBuilder rightFuzzyDealerShortName (List<String> rightFuzzyDealerShortName){
            this.rightFuzzyDealerShortName = rightFuzzyDealerShortName;
            return this;
        }

        public QueryBuilder rightFuzzyDealerShortName (String ... rightFuzzyDealerShortName){
            this.rightFuzzyDealerShortName = solveNullList(rightFuzzyDealerShortName);
            return this;
        }

        public QueryBuilder dealerShortName(String dealerShortName){
            setDealerShortName(dealerShortName);
            return this;
        }

        public QueryBuilder dealerShortNameList(String ... dealerShortName){
            this.dealerShortNameList = solveNullList(dealerShortName);
            return this;
        }

        public QueryBuilder dealerShortNameList(List<String> dealerShortName){
            this.dealerShortNameList = dealerShortName;
            return this;
        }

        public QueryBuilder fetchDealerShortName(){
            setFetchFields("fetchFields","dealerShortName");
            return this;
        }

        public QueryBuilder excludeDealerShortName(){
            setFetchFields("excludeFields","dealerShortName");
            return this;
        }

        public QueryBuilder fuzzyTheme (List<String> fuzzyTheme){
            this.fuzzyTheme = fuzzyTheme;
            return this;
        }

        public QueryBuilder fuzzyTheme (String ... fuzzyTheme){
            this.fuzzyTheme = solveNullList(fuzzyTheme);
            return this;
        }

        public QueryBuilder rightFuzzyTheme (List<String> rightFuzzyTheme){
            this.rightFuzzyTheme = rightFuzzyTheme;
            return this;
        }

        public QueryBuilder rightFuzzyTheme (String ... rightFuzzyTheme){
            this.rightFuzzyTheme = solveNullList(rightFuzzyTheme);
            return this;
        }

        public QueryBuilder theme(String theme){
            setTheme(theme);
            return this;
        }

        public QueryBuilder themeList(String ... theme){
            this.themeList = solveNullList(theme);
            return this;
        }

        public QueryBuilder themeList(List<String> theme){
            this.themeList = theme;
            return this;
        }

        public QueryBuilder fetchTheme(){
            setFetchFields("fetchFields","theme");
            return this;
        }

        public QueryBuilder excludeTheme(){
            setFetchFields("excludeFields","theme");
            return this;
        }

        public QueryBuilder fuzzyVinCode (List<String> fuzzyVinCode){
            this.fuzzyVinCode = fuzzyVinCode;
            return this;
        }

        public QueryBuilder fuzzyVinCode (String ... fuzzyVinCode){
            this.fuzzyVinCode = solveNullList(fuzzyVinCode);
            return this;
        }

        public QueryBuilder rightFuzzyVinCode (List<String> rightFuzzyVinCode){
            this.rightFuzzyVinCode = rightFuzzyVinCode;
            return this;
        }

        public QueryBuilder rightFuzzyVinCode (String ... rightFuzzyVinCode){
            this.rightFuzzyVinCode = solveNullList(rightFuzzyVinCode);
            return this;
        }

        public QueryBuilder vinCode(String vinCode){
            setVinCode(vinCode);
            return this;
        }

        public QueryBuilder vinCodeList(String ... vinCode){
            this.vinCodeList = solveNullList(vinCode);
            return this;
        }

        public QueryBuilder vinCodeList(List<String> vinCode){
            this.vinCodeList = vinCode;
            return this;
        }

        public QueryBuilder fetchVinCode(){
            setFetchFields("fetchFields","vinCode");
            return this;
        }

        public QueryBuilder excludeVinCode(){
            setFetchFields("excludeFields","vinCode");
            return this;
        }

        public QueryBuilder fuzzyVehicleType (List<String> fuzzyVehicleType){
            this.fuzzyVehicleType = fuzzyVehicleType;
            return this;
        }

        public QueryBuilder fuzzyVehicleType (String ... fuzzyVehicleType){
            this.fuzzyVehicleType = solveNullList(fuzzyVehicleType);
            return this;
        }

        public QueryBuilder rightFuzzyVehicleType (List<String> rightFuzzyVehicleType){
            this.rightFuzzyVehicleType = rightFuzzyVehicleType;
            return this;
        }

        public QueryBuilder rightFuzzyVehicleType (String ... rightFuzzyVehicleType){
            this.rightFuzzyVehicleType = solveNullList(rightFuzzyVehicleType);
            return this;
        }

        public QueryBuilder vehicleType(String vehicleType){
            setVehicleType(vehicleType);
            return this;
        }

        public QueryBuilder vehicleTypeList(String ... vehicleType){
            this.vehicleTypeList = solveNullList(vehicleType);
            return this;
        }

        public QueryBuilder vehicleTypeList(List<String> vehicleType){
            this.vehicleTypeList = vehicleType;
            return this;
        }

        public QueryBuilder fetchVehicleType(){
            setFetchFields("fetchFields","vehicleType");
            return this;
        }

        public QueryBuilder excludeVehicleType(){
            setFetchFields("excludeFields","vehicleType");
            return this;
        }

        public QueryBuilder fuzzyPartsName (List<String> fuzzyPartsName){
            this.fuzzyPartsName = fuzzyPartsName;
            return this;
        }

        public QueryBuilder fuzzyPartsName (String ... fuzzyPartsName){
            this.fuzzyPartsName = solveNullList(fuzzyPartsName);
            return this;
        }

        public QueryBuilder rightFuzzyPartsName (List<String> rightFuzzyPartsName){
            this.rightFuzzyPartsName = rightFuzzyPartsName;
            return this;
        }

        public QueryBuilder rightFuzzyPartsName (String ... rightFuzzyPartsName){
            this.rightFuzzyPartsName = solveNullList(rightFuzzyPartsName);
            return this;
        }

        public QueryBuilder partsName(String partsName){
            setPartsName(partsName);
            return this;
        }

        public QueryBuilder partsNameList(String ... partsName){
            this.partsNameList = solveNullList(partsName);
            return this;
        }

        public QueryBuilder partsNameList(List<String> partsName){
            this.partsNameList = partsName;
            return this;
        }

        public QueryBuilder fetchPartsName(){
            setFetchFields("fetchFields","partsName");
            return this;
        }

        public QueryBuilder excludePartsName(){
            setFetchFields("excludeFields","partsName");
            return this;
        }

        public QueryBuilder fuzzyFirstLevelName (List<String> fuzzyFirstLevelName){
            this.fuzzyFirstLevelName = fuzzyFirstLevelName;
            return this;
        }

        public QueryBuilder fuzzyFirstLevelName (String ... fuzzyFirstLevelName){
            this.fuzzyFirstLevelName = solveNullList(fuzzyFirstLevelName);
            return this;
        }

        public QueryBuilder rightFuzzyFirstLevelName (List<String> rightFuzzyFirstLevelName){
            this.rightFuzzyFirstLevelName = rightFuzzyFirstLevelName;
            return this;
        }

        public QueryBuilder rightFuzzyFirstLevelName (String ... rightFuzzyFirstLevelName){
            this.rightFuzzyFirstLevelName = solveNullList(rightFuzzyFirstLevelName);
            return this;
        }

        public QueryBuilder firstLevelName(String firstLevelName){
            setFirstLevelName(firstLevelName);
            return this;
        }

        public QueryBuilder firstLevelNameList(String ... firstLevelName){
            this.firstLevelNameList = solveNullList(firstLevelName);
            return this;
        }

        public QueryBuilder firstLevelNameList(List<String> firstLevelName){
            this.firstLevelNameList = firstLevelName;
            return this;
        }

        public QueryBuilder fetchFirstLevelName(){
            setFetchFields("fetchFields","firstLevelName");
            return this;
        }

        public QueryBuilder excludeFirstLevelName(){
            setFetchFields("excludeFields","firstLevelName");
            return this;
        }

        public QueryBuilder fuzzyPartsShortNameSpecPneno (List<String> fuzzyPartsShortNameSpecPneno){
            this.fuzzyPartsShortNameSpecPneno = fuzzyPartsShortNameSpecPneno;
            return this;
        }

        public QueryBuilder fuzzyPartsShortNameSpecPneno (String ... fuzzyPartsShortNameSpecPneno){
            this.fuzzyPartsShortNameSpecPneno = solveNullList(fuzzyPartsShortNameSpecPneno);
            return this;
        }

        public QueryBuilder rightFuzzyPartsShortNameSpecPneno (List<String> rightFuzzyPartsShortNameSpecPneno){
            this.rightFuzzyPartsShortNameSpecPneno = rightFuzzyPartsShortNameSpecPneno;
            return this;
        }

        public QueryBuilder rightFuzzyPartsShortNameSpecPneno (String ... rightFuzzyPartsShortNameSpecPneno){
            this.rightFuzzyPartsShortNameSpecPneno = solveNullList(rightFuzzyPartsShortNameSpecPneno);
            return this;
        }

        public QueryBuilder partsShortNameSpecPneno(String partsShortNameSpecPneno){
            setPartsShortNameSpecPneno(partsShortNameSpecPneno);
            return this;
        }

        public QueryBuilder partsShortNameSpecPnenoList(String ... partsShortNameSpecPneno){
            this.partsShortNameSpecPnenoList = solveNullList(partsShortNameSpecPneno);
            return this;
        }

        public QueryBuilder partsShortNameSpecPnenoList(List<String> partsShortNameSpecPneno){
            this.partsShortNameSpecPnenoList = partsShortNameSpecPneno;
            return this;
        }

        public QueryBuilder fetchPartsShortNameSpecPneno(){
            setFetchFields("fetchFields","partsShortNameSpecPneno");
            return this;
        }

        public QueryBuilder excludePartsShortNameSpecPneno(){
            setFetchFields("excludeFields","partsShortNameSpecPneno");
            return this;
        }

        public QueryBuilder fuzzyManufactureDate (List<String> fuzzyManufactureDate){
            this.fuzzyManufactureDate = fuzzyManufactureDate;
            return this;
        }

        public QueryBuilder fuzzyManufactureDate (String ... fuzzyManufactureDate){
            this.fuzzyManufactureDate = solveNullList(fuzzyManufactureDate);
            return this;
        }

        public QueryBuilder rightFuzzyManufactureDate (List<String> rightFuzzyManufactureDate){
            this.rightFuzzyManufactureDate = rightFuzzyManufactureDate;
            return this;
        }

        public QueryBuilder rightFuzzyManufactureDate (String ... rightFuzzyManufactureDate){
            this.rightFuzzyManufactureDate = solveNullList(rightFuzzyManufactureDate);
            return this;
        }

        public QueryBuilder manufactureDate(String manufactureDate){
            setManufactureDate(manufactureDate);
            return this;
        }

        public QueryBuilder manufactureDateList(String ... manufactureDate){
            this.manufactureDateList = solveNullList(manufactureDate);
            return this;
        }

        public QueryBuilder manufactureDateList(List<String> manufactureDate){
            this.manufactureDateList = manufactureDate;
            return this;
        }

        public QueryBuilder fetchManufactureDate(){
            setFetchFields("fetchFields","manufactureDate");
            return this;
        }

        public QueryBuilder excludeManufactureDate(){
            setFetchFields("excludeFields","manufactureDate");
            return this;
        }

        public QueryBuilder fuzzySalesFailureTime (List<String> fuzzySalesFailureTime){
            this.fuzzySalesFailureTime = fuzzySalesFailureTime;
            return this;
        }

        public QueryBuilder fuzzySalesFailureTime (String ... fuzzySalesFailureTime){
            this.fuzzySalesFailureTime = solveNullList(fuzzySalesFailureTime);
            return this;
        }

        public QueryBuilder rightFuzzySalesFailureTime (List<String> rightFuzzySalesFailureTime){
            this.rightFuzzySalesFailureTime = rightFuzzySalesFailureTime;
            return this;
        }

        public QueryBuilder rightFuzzySalesFailureTime (String ... rightFuzzySalesFailureTime){
            this.rightFuzzySalesFailureTime = solveNullList(rightFuzzySalesFailureTime);
            return this;
        }

        public QueryBuilder salesFailureTime(String salesFailureTime){
            setSalesFailureTime(salesFailureTime);
            return this;
        }

        public QueryBuilder salesFailureTimeList(String ... salesFailureTime){
            this.salesFailureTimeList = solveNullList(salesFailureTime);
            return this;
        }

        public QueryBuilder salesFailureTimeList(List<String> salesFailureTime){
            this.salesFailureTimeList = salesFailureTime;
            return this;
        }

        public QueryBuilder fetchSalesFailureTime(){
            setFetchFields("fetchFields","salesFailureTime");
            return this;
        }

        public QueryBuilder excludeSalesFailureTime(){
            setFetchFields("excludeFields","salesFailureTime");
            return this;
        }

        public QueryBuilder fuzzySymptomName (List<String> fuzzySymptomName){
            this.fuzzySymptomName = fuzzySymptomName;
            return this;
        }

        public QueryBuilder fuzzySymptomName (String ... fuzzySymptomName){
            this.fuzzySymptomName = solveNullList(fuzzySymptomName);
            return this;
        }

        public QueryBuilder rightFuzzySymptomName (List<String> rightFuzzySymptomName){
            this.rightFuzzySymptomName = rightFuzzySymptomName;
            return this;
        }

        public QueryBuilder rightFuzzySymptomName (String ... rightFuzzySymptomName){
            this.rightFuzzySymptomName = solveNullList(rightFuzzySymptomName);
            return this;
        }

        public QueryBuilder symptomName(String symptomName){
            setSymptomName(symptomName);
            return this;
        }

        public QueryBuilder symptomNameList(String ... symptomName){
            this.symptomNameList = solveNullList(symptomName);
            return this;
        }

        public QueryBuilder symptomNameList(List<String> symptomName){
            this.symptomNameList = symptomName;
            return this;
        }

        public QueryBuilder fetchSymptomName(){
            setFetchFields("fetchFields","symptomName");
            return this;
        }

        public QueryBuilder excludeSymptomName(){
            setFetchFields("excludeFields","symptomName");
            return this;
        }

        public QueryBuilder fuzzySymptomContent (List<String> fuzzySymptomContent){
            this.fuzzySymptomContent = fuzzySymptomContent;
            return this;
        }

        public QueryBuilder fuzzySymptomContent (String ... fuzzySymptomContent){
            this.fuzzySymptomContent = solveNullList(fuzzySymptomContent);
            return this;
        }

        public QueryBuilder rightFuzzySymptomContent (List<String> rightFuzzySymptomContent){
            this.rightFuzzySymptomContent = rightFuzzySymptomContent;
            return this;
        }

        public QueryBuilder rightFuzzySymptomContent (String ... rightFuzzySymptomContent){
            this.rightFuzzySymptomContent = solveNullList(rightFuzzySymptomContent);
            return this;
        }

        public QueryBuilder symptomContent(String symptomContent){
            setSymptomContent(symptomContent);
            return this;
        }

        public QueryBuilder symptomContentList(String ... symptomContent){
            this.symptomContentList = solveNullList(symptomContent);
            return this;
        }

        public QueryBuilder symptomContentList(List<String> symptomContent){
            this.symptomContentList = symptomContent;
            return this;
        }

        public QueryBuilder fetchSymptomContent(){
            setFetchFields("fetchFields","symptomContent");
            return this;
        }

        public QueryBuilder excludeSymptomContent(){
            setFetchFields("excludeFields","symptomContent");
            return this;
        }

        public QueryBuilder manCostBetWeen(java.math.BigDecimal manCostSt,java.math.BigDecimal manCostEd){
            this.manCostSt = manCostSt;
            this.manCostEd = manCostEd;
            return this;
        }

        public QueryBuilder manCostGreaterEqThan(java.math.BigDecimal manCostSt){
            this.manCostSt = manCostSt;
            return this;
        }
        public QueryBuilder manCostLessEqThan(java.math.BigDecimal manCostEd){
            this.manCostEd = manCostEd;
            return this;
        }


        public QueryBuilder manCost(java.math.BigDecimal manCost){
            setManCost(manCost);
            return this;
        }

        public QueryBuilder manCostList(java.math.BigDecimal ... manCost){
            this.manCostList = solveNullList(manCost);
            return this;
        }

        public QueryBuilder manCostList(List<java.math.BigDecimal> manCost){
            this.manCostList = manCost;
            return this;
        }

        public QueryBuilder fetchManCost(){
            setFetchFields("fetchFields","manCost");
            return this;
        }

        public QueryBuilder excludeManCost(){
            setFetchFields("excludeFields","manCost");
            return this;
        }

        public QueryBuilder partsCostBetWeen(java.math.BigDecimal partsCostSt,java.math.BigDecimal partsCostEd){
            this.partsCostSt = partsCostSt;
            this.partsCostEd = partsCostEd;
            return this;
        }

        public QueryBuilder partsCostGreaterEqThan(java.math.BigDecimal partsCostSt){
            this.partsCostSt = partsCostSt;
            return this;
        }
        public QueryBuilder partsCostLessEqThan(java.math.BigDecimal partsCostEd){
            this.partsCostEd = partsCostEd;
            return this;
        }


        public QueryBuilder partsCost(java.math.BigDecimal partsCost){
            setPartsCost(partsCost);
            return this;
        }

        public QueryBuilder partsCostList(java.math.BigDecimal ... partsCost){
            this.partsCostList = solveNullList(partsCost);
            return this;
        }

        public QueryBuilder partsCostList(List<java.math.BigDecimal> partsCost){
            this.partsCostList = partsCost;
            return this;
        }

        public QueryBuilder fetchPartsCost(){
            setFetchFields("fetchFields","partsCost");
            return this;
        }

        public QueryBuilder excludePartsCost(){
            setFetchFields("excludeFields","partsCost");
            return this;
        }

        public QueryBuilder partsManagerCostBetWeen(java.math.BigDecimal partsManagerCostSt,java.math.BigDecimal partsManagerCostEd){
            this.partsManagerCostSt = partsManagerCostSt;
            this.partsManagerCostEd = partsManagerCostEd;
            return this;
        }

        public QueryBuilder partsManagerCostGreaterEqThan(java.math.BigDecimal partsManagerCostSt){
            this.partsManagerCostSt = partsManagerCostSt;
            return this;
        }
        public QueryBuilder partsManagerCostLessEqThan(java.math.BigDecimal partsManagerCostEd){
            this.partsManagerCostEd = partsManagerCostEd;
            return this;
        }


        public QueryBuilder partsManagerCost(java.math.BigDecimal partsManagerCost){
            setPartsManagerCost(partsManagerCost);
            return this;
        }

        public QueryBuilder partsManagerCostList(java.math.BigDecimal ... partsManagerCost){
            this.partsManagerCostList = solveNullList(partsManagerCost);
            return this;
        }

        public QueryBuilder partsManagerCostList(List<java.math.BigDecimal> partsManagerCost){
            this.partsManagerCostList = partsManagerCost;
            return this;
        }

        public QueryBuilder fetchPartsManagerCost(){
            setFetchFields("fetchFields","partsManagerCost");
            return this;
        }

        public QueryBuilder excludePartsManagerCost(){
            setFetchFields("excludeFields","partsManagerCost");
            return this;
        }

        public QueryBuilder outgoingCostBetWeen(java.math.BigDecimal outgoingCostSt,java.math.BigDecimal outgoingCostEd){
            this.outgoingCostSt = outgoingCostSt;
            this.outgoingCostEd = outgoingCostEd;
            return this;
        }

        public QueryBuilder outgoingCostGreaterEqThan(java.math.BigDecimal outgoingCostSt){
            this.outgoingCostSt = outgoingCostSt;
            return this;
        }
        public QueryBuilder outgoingCostLessEqThan(java.math.BigDecimal outgoingCostEd){
            this.outgoingCostEd = outgoingCostEd;
            return this;
        }


        public QueryBuilder outgoingCost(java.math.BigDecimal outgoingCost){
            setOutgoingCost(outgoingCost);
            return this;
        }

        public QueryBuilder outgoingCostList(java.math.BigDecimal ... outgoingCost){
            this.outgoingCostList = solveNullList(outgoingCost);
            return this;
        }

        public QueryBuilder outgoingCostList(List<java.math.BigDecimal> outgoingCost){
            this.outgoingCostList = outgoingCost;
            return this;
        }

        public QueryBuilder fetchOutgoingCost(){
            setFetchFields("fetchFields","outgoingCost");
            return this;
        }

        public QueryBuilder excludeOutgoingCost(){
            setFetchFields("excludeFields","outgoingCost");
            return this;
        }

        public QueryBuilder maintainCostBetWeen(java.math.BigDecimal maintainCostSt,java.math.BigDecimal maintainCostEd){
            this.maintainCostSt = maintainCostSt;
            this.maintainCostEd = maintainCostEd;
            return this;
        }

        public QueryBuilder maintainCostGreaterEqThan(java.math.BigDecimal maintainCostSt){
            this.maintainCostSt = maintainCostSt;
            return this;
        }
        public QueryBuilder maintainCostLessEqThan(java.math.BigDecimal maintainCostEd){
            this.maintainCostEd = maintainCostEd;
            return this;
        }


        public QueryBuilder maintainCost(java.math.BigDecimal maintainCost){
            setMaintainCost(maintainCost);
            return this;
        }

        public QueryBuilder maintainCostList(java.math.BigDecimal ... maintainCost){
            this.maintainCostList = solveNullList(maintainCost);
            return this;
        }

        public QueryBuilder maintainCostList(List<java.math.BigDecimal> maintainCost){
            this.maintainCostList = maintainCost;
            return this;
        }

        public QueryBuilder fetchMaintainCost(){
            setFetchFields("fetchFields","maintainCost");
            return this;
        }

        public QueryBuilder excludeMaintainCost(){
            setFetchFields("excludeFields","maintainCost");
            return this;
        }

        public QueryBuilder otherCostBetWeen(java.math.BigDecimal otherCostSt,java.math.BigDecimal otherCostEd){
            this.otherCostSt = otherCostSt;
            this.otherCostEd = otherCostEd;
            return this;
        }

        public QueryBuilder otherCostGreaterEqThan(java.math.BigDecimal otherCostSt){
            this.otherCostSt = otherCostSt;
            return this;
        }
        public QueryBuilder otherCostLessEqThan(java.math.BigDecimal otherCostEd){
            this.otherCostEd = otherCostEd;
            return this;
        }


        public QueryBuilder otherCost(java.math.BigDecimal otherCost){
            setOtherCost(otherCost);
            return this;
        }

        public QueryBuilder otherCostList(java.math.BigDecimal ... otherCost){
            this.otherCostList = solveNullList(otherCost);
            return this;
        }

        public QueryBuilder otherCostList(List<java.math.BigDecimal> otherCost){
            this.otherCostList = otherCost;
            return this;
        }

        public QueryBuilder fetchOtherCost(){
            setFetchFields("fetchFields","otherCost");
            return this;
        }

        public QueryBuilder excludeOtherCost(){
            setFetchFields("excludeFields","otherCost");
            return this;
        }

        public QueryBuilder totalCostBetWeen(java.math.BigDecimal totalCostSt,java.math.BigDecimal totalCostEd){
            this.totalCostSt = totalCostSt;
            this.totalCostEd = totalCostEd;
            return this;
        }

        public QueryBuilder totalCostGreaterEqThan(java.math.BigDecimal totalCostSt){
            this.totalCostSt = totalCostSt;
            return this;
        }
        public QueryBuilder totalCostLessEqThan(java.math.BigDecimal totalCostEd){
            this.totalCostEd = totalCostEd;
            return this;
        }


        public QueryBuilder totalCost(java.math.BigDecimal totalCost){
            setTotalCost(totalCost);
            return this;
        }

        public QueryBuilder totalCostList(java.math.BigDecimal ... totalCost){
            this.totalCostList = solveNullList(totalCost);
            return this;
        }

        public QueryBuilder totalCostList(List<java.math.BigDecimal> totalCost){
            this.totalCostList = totalCost;
            return this;
        }

        public QueryBuilder fetchTotalCost(){
            setFetchFields("fetchFields","totalCost");
            return this;
        }

        public QueryBuilder excludeTotalCost(){
            setFetchFields("excludeFields","totalCost");
            return this;
        }

        public QueryBuilder fuzzyImportantLevel (List<String> fuzzyImportantLevel){
            this.fuzzyImportantLevel = fuzzyImportantLevel;
            return this;
        }

        public QueryBuilder fuzzyImportantLevel (String ... fuzzyImportantLevel){
            this.fuzzyImportantLevel = solveNullList(fuzzyImportantLevel);
            return this;
        }

        public QueryBuilder rightFuzzyImportantLevel (List<String> rightFuzzyImportantLevel){
            this.rightFuzzyImportantLevel = rightFuzzyImportantLevel;
            return this;
        }

        public QueryBuilder rightFuzzyImportantLevel (String ... rightFuzzyImportantLevel){
            this.rightFuzzyImportantLevel = solveNullList(rightFuzzyImportantLevel);
            return this;
        }

        public QueryBuilder importantLevel(String importantLevel){
            setImportantLevel(importantLevel);
            return this;
        }

        public QueryBuilder importantLevelList(String ... importantLevel){
            this.importantLevelList = solveNullList(importantLevel);
            return this;
        }

        public QueryBuilder importantLevelList(List<String> importantLevel){
            this.importantLevelList = importantLevel;
            return this;
        }

        public QueryBuilder fetchImportantLevel(){
            setFetchFields("fetchFields","importantLevel");
            return this;
        }

        public QueryBuilder excludeImportantLevel(){
            setFetchFields("excludeFields","importantLevel");
            return this;
        }

        public QueryBuilder fuzzyTransmissionType (List<String> fuzzyTransmissionType){
            this.fuzzyTransmissionType = fuzzyTransmissionType;
            return this;
        }

        public QueryBuilder fuzzyTransmissionType (String ... fuzzyTransmissionType){
            this.fuzzyTransmissionType = solveNullList(fuzzyTransmissionType);
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionType (List<String> rightFuzzyTransmissionType){
            this.rightFuzzyTransmissionType = rightFuzzyTransmissionType;
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionType (String ... rightFuzzyTransmissionType){
            this.rightFuzzyTransmissionType = solveNullList(rightFuzzyTransmissionType);
            return this;
        }

        public QueryBuilder transmissionType(String transmissionType){
            setTransmissionType(transmissionType);
            return this;
        }

        public QueryBuilder transmissionTypeList(String ... transmissionType){
            this.transmissionTypeList = solveNullList(transmissionType);
            return this;
        }

        public QueryBuilder transmissionTypeList(List<String> transmissionType){
            this.transmissionTypeList = transmissionType;
            return this;
        }

        public QueryBuilder fetchTransmissionType(){
            setFetchFields("fetchFields","transmissionType");
            return this;
        }

        public QueryBuilder excludeTransmissionType(){
            setFetchFields("excludeFields","transmissionType");
            return this;
        }

        public QueryBuilder fuzzyNewPartsBlindingNum (List<String> fuzzyNewPartsBlindingNum){
            this.fuzzyNewPartsBlindingNum = fuzzyNewPartsBlindingNum;
            return this;
        }

        public QueryBuilder fuzzyNewPartsBlindingNum (String ... fuzzyNewPartsBlindingNum){
            this.fuzzyNewPartsBlindingNum = solveNullList(fuzzyNewPartsBlindingNum);
            return this;
        }

        public QueryBuilder rightFuzzyNewPartsBlindingNum (List<String> rightFuzzyNewPartsBlindingNum){
            this.rightFuzzyNewPartsBlindingNum = rightFuzzyNewPartsBlindingNum;
            return this;
        }

        public QueryBuilder rightFuzzyNewPartsBlindingNum (String ... rightFuzzyNewPartsBlindingNum){
            this.rightFuzzyNewPartsBlindingNum = solveNullList(rightFuzzyNewPartsBlindingNum);
            return this;
        }

        public QueryBuilder newPartsBlindingNum(String newPartsBlindingNum){
            setNewPartsBlindingNum(newPartsBlindingNum);
            return this;
        }

        public QueryBuilder newPartsBlindingNumList(String ... newPartsBlindingNum){
            this.newPartsBlindingNumList = solveNullList(newPartsBlindingNum);
            return this;
        }

        public QueryBuilder newPartsBlindingNumList(List<String> newPartsBlindingNum){
            this.newPartsBlindingNumList = newPartsBlindingNum;
            return this;
        }

        public QueryBuilder fetchNewPartsBlindingNum(){
            setFetchFields("fetchFields","newPartsBlindingNum");
            return this;
        }

        public QueryBuilder excludeNewPartsBlindingNum(){
            setFetchFields("excludeFields","newPartsBlindingNum");
            return this;
        }

        public QueryBuilder fuzzySubmitDate (List<String> fuzzySubmitDate){
            this.fuzzySubmitDate = fuzzySubmitDate;
            return this;
        }

        public QueryBuilder fuzzySubmitDate (String ... fuzzySubmitDate){
            this.fuzzySubmitDate = solveNullList(fuzzySubmitDate);
            return this;
        }

        public QueryBuilder rightFuzzySubmitDate (List<String> rightFuzzySubmitDate){
            this.rightFuzzySubmitDate = rightFuzzySubmitDate;
            return this;
        }

        public QueryBuilder rightFuzzySubmitDate (String ... rightFuzzySubmitDate){
            this.rightFuzzySubmitDate = solveNullList(rightFuzzySubmitDate);
            return this;
        }

        public QueryBuilder submitDate(String submitDate){
            setSubmitDate(submitDate);
            return this;
        }

        public QueryBuilder submitDateList(String ... submitDate){
            this.submitDateList = solveNullList(submitDate);
            return this;
        }

        public QueryBuilder submitDateList(List<String> submitDate){
            this.submitDateList = submitDate;
            return this;
        }

        public QueryBuilder fetchSubmitDate(){
            setFetchFields("fetchFields","submitDate");
            return this;
        }

        public QueryBuilder excludeSubmitDate(){
            setFetchFields("excludeFields","submitDate");
            return this;
        }

        public QueryBuilder fuzzyEngCode (List<String> fuzzyEngCode){
            this.fuzzyEngCode = fuzzyEngCode;
            return this;
        }

        public QueryBuilder fuzzyEngCode (String ... fuzzyEngCode){
            this.fuzzyEngCode = solveNullList(fuzzyEngCode);
            return this;
        }

        public QueryBuilder rightFuzzyEngCode (List<String> rightFuzzyEngCode){
            this.rightFuzzyEngCode = rightFuzzyEngCode;
            return this;
        }

        public QueryBuilder rightFuzzyEngCode (String ... rightFuzzyEngCode){
            this.rightFuzzyEngCode = solveNullList(rightFuzzyEngCode);
            return this;
        }

        public QueryBuilder engCode(String engCode){
            setEngCode(engCode);
            return this;
        }

        public QueryBuilder engCodeList(String ... engCode){
            this.engCodeList = solveNullList(engCode);
            return this;
        }

        public QueryBuilder engCodeList(List<String> engCode){
            this.engCodeList = engCode;
            return this;
        }

        public QueryBuilder fetchEngCode(){
            setFetchFields("fetchFields","engCode");
            return this;
        }

        public QueryBuilder excludeEngCode(){
            setFetchFields("excludeFields","engCode");
            return this;
        }

        public QueryBuilder fuzzyEngManufactureDate (List<String> fuzzyEngManufactureDate){
            this.fuzzyEngManufactureDate = fuzzyEngManufactureDate;
            return this;
        }

        public QueryBuilder fuzzyEngManufactureDate (String ... fuzzyEngManufactureDate){
            this.fuzzyEngManufactureDate = solveNullList(fuzzyEngManufactureDate);
            return this;
        }

        public QueryBuilder rightFuzzyEngManufactureDate (List<String> rightFuzzyEngManufactureDate){
            this.rightFuzzyEngManufactureDate = rightFuzzyEngManufactureDate;
            return this;
        }

        public QueryBuilder rightFuzzyEngManufactureDate (String ... rightFuzzyEngManufactureDate){
            this.rightFuzzyEngManufactureDate = solveNullList(rightFuzzyEngManufactureDate);
            return this;
        }

        public QueryBuilder engManufactureDate(String engManufactureDate){
            setEngManufactureDate(engManufactureDate);
            return this;
        }

        public QueryBuilder engManufactureDateList(String ... engManufactureDate){
            this.engManufactureDateList = solveNullList(engManufactureDate);
            return this;
        }

        public QueryBuilder engManufactureDateList(List<String> engManufactureDate){
            this.engManufactureDateList = engManufactureDate;
            return this;
        }

        public QueryBuilder fetchEngManufactureDate(){
            setFetchFields("fetchFields","engManufactureDate");
            return this;
        }

        public QueryBuilder excludeEngManufactureDate(){
            setFetchFields("excludeFields","engManufactureDate");
            return this;
        }

        public QueryBuilder fuzzyTransmissionCodeRe (List<String> fuzzyTransmissionCodeRe){
            this.fuzzyTransmissionCodeRe = fuzzyTransmissionCodeRe;
            return this;
        }

        public QueryBuilder fuzzyTransmissionCodeRe (String ... fuzzyTransmissionCodeRe){
            this.fuzzyTransmissionCodeRe = solveNullList(fuzzyTransmissionCodeRe);
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionCodeRe (List<String> rightFuzzyTransmissionCodeRe){
            this.rightFuzzyTransmissionCodeRe = rightFuzzyTransmissionCodeRe;
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionCodeRe (String ... rightFuzzyTransmissionCodeRe){
            this.rightFuzzyTransmissionCodeRe = solveNullList(rightFuzzyTransmissionCodeRe);
            return this;
        }

        public QueryBuilder transmissionCodeRe(String transmissionCodeRe){
            setTransmissionCodeRe(transmissionCodeRe);
            return this;
        }

        public QueryBuilder transmissionCodeReList(String ... transmissionCodeRe){
            this.transmissionCodeReList = solveNullList(transmissionCodeRe);
            return this;
        }

        public QueryBuilder transmissionCodeReList(List<String> transmissionCodeRe){
            this.transmissionCodeReList = transmissionCodeRe;
            return this;
        }

        public QueryBuilder fetchTransmissionCodeRe(){
            setFetchFields("fetchFields","transmissionCodeRe");
            return this;
        }

        public QueryBuilder excludeTransmissionCodeRe(){
            setFetchFields("excludeFields","transmissionCodeRe");
            return this;
        }

        public QueryBuilder fuzzyTransmissionManufacturer (List<String> fuzzyTransmissionManufacturer){
            this.fuzzyTransmissionManufacturer = fuzzyTransmissionManufacturer;
            return this;
        }

        public QueryBuilder fuzzyTransmissionManufacturer (String ... fuzzyTransmissionManufacturer){
            this.fuzzyTransmissionManufacturer = solveNullList(fuzzyTransmissionManufacturer);
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionManufacturer (List<String> rightFuzzyTransmissionManufacturer){
            this.rightFuzzyTransmissionManufacturer = rightFuzzyTransmissionManufacturer;
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionManufacturer (String ... rightFuzzyTransmissionManufacturer){
            this.rightFuzzyTransmissionManufacturer = solveNullList(rightFuzzyTransmissionManufacturer);
            return this;
        }

        public QueryBuilder transmissionManufacturer(String transmissionManufacturer){
            setTransmissionManufacturer(transmissionManufacturer);
            return this;
        }

        public QueryBuilder transmissionManufacturerList(String ... transmissionManufacturer){
            this.transmissionManufacturerList = solveNullList(transmissionManufacturer);
            return this;
        }

        public QueryBuilder transmissionManufacturerList(List<String> transmissionManufacturer){
            this.transmissionManufacturerList = transmissionManufacturer;
            return this;
        }

        public QueryBuilder fetchTransmissionManufacturer(){
            setFetchFields("fetchFields","transmissionManufacturer");
            return this;
        }

        public QueryBuilder excludeTransmissionManufacturer(){
            setFetchFields("excludeFields","transmissionManufacturer");
            return this;
        }

        public QueryBuilder fuzzyEngArrange (List<String> fuzzyEngArrange){
            this.fuzzyEngArrange = fuzzyEngArrange;
            return this;
        }

        public QueryBuilder fuzzyEngArrange (String ... fuzzyEngArrange){
            this.fuzzyEngArrange = solveNullList(fuzzyEngArrange);
            return this;
        }

        public QueryBuilder rightFuzzyEngArrange (List<String> rightFuzzyEngArrange){
            this.rightFuzzyEngArrange = rightFuzzyEngArrange;
            return this;
        }

        public QueryBuilder rightFuzzyEngArrange (String ... rightFuzzyEngArrange){
            this.rightFuzzyEngArrange = solveNullList(rightFuzzyEngArrange);
            return this;
        }

        public QueryBuilder engArrange(String engArrange){
            setEngArrange(engArrange);
            return this;
        }

        public QueryBuilder engArrangeList(String ... engArrange){
            this.engArrangeList = solveNullList(engArrange);
            return this;
        }

        public QueryBuilder engArrangeList(List<String> engArrange){
            this.engArrangeList = engArrange;
            return this;
        }

        public QueryBuilder fetchEngArrange(){
            setFetchFields("fetchFields","engArrange");
            return this;
        }

        public QueryBuilder excludeEngArrange(){
            setFetchFields("excludeFields","engArrange");
            return this;
        }

        public QueryBuilder fuzzyCarModel (List<String> fuzzyCarModel){
            this.fuzzyCarModel = fuzzyCarModel;
            return this;
        }

        public QueryBuilder fuzzyCarModel (String ... fuzzyCarModel){
            this.fuzzyCarModel = solveNullList(fuzzyCarModel);
            return this;
        }

        public QueryBuilder rightFuzzyCarModel (List<String> rightFuzzyCarModel){
            this.rightFuzzyCarModel = rightFuzzyCarModel;
            return this;
        }

        public QueryBuilder rightFuzzyCarModel (String ... rightFuzzyCarModel){
            this.rightFuzzyCarModel = solveNullList(rightFuzzyCarModel);
            return this;
        }

        public QueryBuilder carModel(String carModel){
            setCarModel(carModel);
            return this;
        }

        public QueryBuilder carModelList(String ... carModel){
            this.carModelList = solveNullList(carModel);
            return this;
        }

        public QueryBuilder carModelList(List<String> carModel){
            this.carModelList = carModel;
            return this;
        }

        public QueryBuilder fetchCarModel(){
            setFetchFields("fetchFields","carModel");
            return this;
        }

        public QueryBuilder excludeCarModel(){
            setFetchFields("excludeFields","carModel");
            return this;
        }

        public QueryBuilder fuzzyReceiveTime (List<String> fuzzyReceiveTime){
            this.fuzzyReceiveTime = fuzzyReceiveTime;
            return this;
        }

        public QueryBuilder fuzzyReceiveTime (String ... fuzzyReceiveTime){
            this.fuzzyReceiveTime = solveNullList(fuzzyReceiveTime);
            return this;
        }

        public QueryBuilder rightFuzzyReceiveTime (List<String> rightFuzzyReceiveTime){
            this.rightFuzzyReceiveTime = rightFuzzyReceiveTime;
            return this;
        }

        public QueryBuilder rightFuzzyReceiveTime (String ... rightFuzzyReceiveTime){
            this.rightFuzzyReceiveTime = solveNullList(rightFuzzyReceiveTime);
            return this;
        }

        public QueryBuilder receiveTime(String receiveTime){
            setReceiveTime(receiveTime);
            return this;
        }

        public QueryBuilder receiveTimeList(String ... receiveTime){
            this.receiveTimeList = solveNullList(receiveTime);
            return this;
        }

        public QueryBuilder receiveTimeList(List<String> receiveTime){
            this.receiveTimeList = receiveTime;
            return this;
        }

        public QueryBuilder fetchReceiveTime(){
            setFetchFields("fetchFields","receiveTime");
            return this;
        }

        public QueryBuilder excludeReceiveTime(){
            setFetchFields("excludeFields","receiveTime");
            return this;
        }

        public QueryBuilder fuzzyClaimCompensation (List<String> fuzzyClaimCompensation){
            this.fuzzyClaimCompensation = fuzzyClaimCompensation;
            return this;
        }

        public QueryBuilder fuzzyClaimCompensation (String ... fuzzyClaimCompensation){
            this.fuzzyClaimCompensation = solveNullList(fuzzyClaimCompensation);
            return this;
        }

        public QueryBuilder rightFuzzyClaimCompensation (List<String> rightFuzzyClaimCompensation){
            this.rightFuzzyClaimCompensation = rightFuzzyClaimCompensation;
            return this;
        }

        public QueryBuilder rightFuzzyClaimCompensation (String ... rightFuzzyClaimCompensation){
            this.rightFuzzyClaimCompensation = solveNullList(rightFuzzyClaimCompensation);
            return this;
        }

        public QueryBuilder claimCompensation(String claimCompensation){
            setClaimCompensation(claimCompensation);
            return this;
        }

        public QueryBuilder claimCompensationList(String ... claimCompensation){
            this.claimCompensationList = solveNullList(claimCompensation);
            return this;
        }

        public QueryBuilder claimCompensationList(List<String> claimCompensation){
            this.claimCompensationList = claimCompensation;
            return this;
        }

        public QueryBuilder fetchClaimCompensation(){
            setFetchFields("fetchFields","claimCompensation");
            return this;
        }

        public QueryBuilder excludeClaimCompensation(){
            setFetchFields("excludeFields","claimCompensation");
            return this;
        }

        public QueryBuilder fuzzyShortCode (List<String> fuzzyShortCode){
            this.fuzzyShortCode = fuzzyShortCode;
            return this;
        }

        public QueryBuilder fuzzyShortCode (String ... fuzzyShortCode){
            this.fuzzyShortCode = solveNullList(fuzzyShortCode);
            return this;
        }

        public QueryBuilder rightFuzzyShortCode (List<String> rightFuzzyShortCode){
            this.rightFuzzyShortCode = rightFuzzyShortCode;
            return this;
        }

        public QueryBuilder rightFuzzyShortCode (String ... rightFuzzyShortCode){
            this.rightFuzzyShortCode = solveNullList(rightFuzzyShortCode);
            return this;
        }

        public QueryBuilder shortCode(String shortCode){
            setShortCode(shortCode);
            return this;
        }

        public QueryBuilder shortCodeList(String ... shortCode){
            this.shortCodeList = solveNullList(shortCode);
            return this;
        }

        public QueryBuilder shortCodeList(List<String> shortCode){
            this.shortCodeList = shortCode;
            return this;
        }

        public QueryBuilder fetchShortCode(){
            setFetchFields("fetchFields","shortCode");
            return this;
        }

        public QueryBuilder excludeShortCode(){
            setFetchFields("excludeFields","shortCode");
            return this;
        }

        public QueryBuilder fuzzyFaultCodeClassification (List<String> fuzzyFaultCodeClassification){
            this.fuzzyFaultCodeClassification = fuzzyFaultCodeClassification;
            return this;
        }

        public QueryBuilder fuzzyFaultCodeClassification (String ... fuzzyFaultCodeClassification){
            this.fuzzyFaultCodeClassification = solveNullList(fuzzyFaultCodeClassification);
            return this;
        }

        public QueryBuilder rightFuzzyFaultCodeClassification (List<String> rightFuzzyFaultCodeClassification){
            this.rightFuzzyFaultCodeClassification = rightFuzzyFaultCodeClassification;
            return this;
        }

        public QueryBuilder rightFuzzyFaultCodeClassification (String ... rightFuzzyFaultCodeClassification){
            this.rightFuzzyFaultCodeClassification = solveNullList(rightFuzzyFaultCodeClassification);
            return this;
        }

        public QueryBuilder faultCodeClassification(String faultCodeClassification){
            setFaultCodeClassification(faultCodeClassification);
            return this;
        }

        public QueryBuilder faultCodeClassificationList(String ... faultCodeClassification){
            this.faultCodeClassificationList = solveNullList(faultCodeClassification);
            return this;
        }

        public QueryBuilder faultCodeClassificationList(List<String> faultCodeClassification){
            this.faultCodeClassificationList = faultCodeClassification;
            return this;
        }

        public QueryBuilder fetchFaultCodeClassification(){
            setFetchFields("fetchFields","faultCodeClassification");
            return this;
        }

        public QueryBuilder excludeFaultCodeClassification(){
            setFetchFields("excludeFields","faultCodeClassification");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public MqmsVoucher build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> voucherIdList;

        public List<Integer> getVoucherIdList(){return this.voucherIdList;}

        private Integer voucherIdSt;

        private Integer voucherIdEd;

        public Integer getVoucherIdSt(){return this.voucherIdSt;}

        public Integer getVoucherIdEd(){return this.voucherIdEd;}

        private List<String> qualityFeedbackCodeList;

        public List<String> getQualityFeedbackCodeList(){return this.qualityFeedbackCodeList;}


        private List<String> fuzzyQualityFeedbackCode;

        public List<String> getFuzzyQualityFeedbackCode(){return this.fuzzyQualityFeedbackCode;}

        private List<String> rightFuzzyQualityFeedbackCode;

        public List<String> getRightFuzzyQualityFeedbackCode(){return this.rightFuzzyQualityFeedbackCode;}
        private List<String> voucherCodeList;

        public List<String> getVoucherCodeList(){return this.voucherCodeList;}


        private List<String> fuzzyVoucherCode;

        public List<String> getFuzzyVoucherCode(){return this.fuzzyVoucherCode;}

        private List<String> rightFuzzyVoucherCode;

        public List<String> getRightFuzzyVoucherCode(){return this.rightFuzzyVoucherCode;}
        private List<String> dealerCodeList;

        public List<String> getDealerCodeList(){return this.dealerCodeList;}


        private List<String> fuzzyDealerCode;

        public List<String> getFuzzyDealerCode(){return this.fuzzyDealerCode;}

        private List<String> rightFuzzyDealerCode;

        public List<String> getRightFuzzyDealerCode(){return this.rightFuzzyDealerCode;}
        private List<String> dealerNameList;

        public List<String> getDealerNameList(){return this.dealerNameList;}


        private List<String> fuzzyDealerName;

        public List<String> getFuzzyDealerName(){return this.fuzzyDealerName;}

        private List<String> rightFuzzyDealerName;

        public List<String> getRightFuzzyDealerName(){return this.rightFuzzyDealerName;}
        private List<String> dealerShortNameList;

        public List<String> getDealerShortNameList(){return this.dealerShortNameList;}


        private List<String> fuzzyDealerShortName;

        public List<String> getFuzzyDealerShortName(){return this.fuzzyDealerShortName;}

        private List<String> rightFuzzyDealerShortName;

        public List<String> getRightFuzzyDealerShortName(){return this.rightFuzzyDealerShortName;}
        private List<String> themeList;

        public List<String> getThemeList(){return this.themeList;}


        private List<String> fuzzyTheme;

        public List<String> getFuzzyTheme(){return this.fuzzyTheme;}

        private List<String> rightFuzzyTheme;

        public List<String> getRightFuzzyTheme(){return this.rightFuzzyTheme;}
        private List<String> vinCodeList;

        public List<String> getVinCodeList(){return this.vinCodeList;}


        private List<String> fuzzyVinCode;

        public List<String> getFuzzyVinCode(){return this.fuzzyVinCode;}

        private List<String> rightFuzzyVinCode;

        public List<String> getRightFuzzyVinCode(){return this.rightFuzzyVinCode;}
        private List<String> vehicleTypeList;

        public List<String> getVehicleTypeList(){return this.vehicleTypeList;}


        private List<String> fuzzyVehicleType;

        public List<String> getFuzzyVehicleType(){return this.fuzzyVehicleType;}

        private List<String> rightFuzzyVehicleType;

        public List<String> getRightFuzzyVehicleType(){return this.rightFuzzyVehicleType;}
        private List<String> partsNameList;

        public List<String> getPartsNameList(){return this.partsNameList;}


        private List<String> fuzzyPartsName;

        public List<String> getFuzzyPartsName(){return this.fuzzyPartsName;}

        private List<String> rightFuzzyPartsName;

        public List<String> getRightFuzzyPartsName(){return this.rightFuzzyPartsName;}
        private List<String> firstLevelNameList;

        public List<String> getFirstLevelNameList(){return this.firstLevelNameList;}


        private List<String> fuzzyFirstLevelName;

        public List<String> getFuzzyFirstLevelName(){return this.fuzzyFirstLevelName;}

        private List<String> rightFuzzyFirstLevelName;

        public List<String> getRightFuzzyFirstLevelName(){return this.rightFuzzyFirstLevelName;}
        private List<String> partsShortNameSpecPnenoList;

        public List<String> getPartsShortNameSpecPnenoList(){return this.partsShortNameSpecPnenoList;}


        private List<String> fuzzyPartsShortNameSpecPneno;

        public List<String> getFuzzyPartsShortNameSpecPneno(){return this.fuzzyPartsShortNameSpecPneno;}

        private List<String> rightFuzzyPartsShortNameSpecPneno;

        public List<String> getRightFuzzyPartsShortNameSpecPneno(){return this.rightFuzzyPartsShortNameSpecPneno;}
        private List<String> manufactureDateList;

        public List<String> getManufactureDateList(){return this.manufactureDateList;}


        private List<String> fuzzyManufactureDate;

        public List<String> getFuzzyManufactureDate(){return this.fuzzyManufactureDate;}

        private List<String> rightFuzzyManufactureDate;

        public List<String> getRightFuzzyManufactureDate(){return this.rightFuzzyManufactureDate;}
        private List<String> salesFailureTimeList;

        public List<String> getSalesFailureTimeList(){return this.salesFailureTimeList;}


        private List<String> fuzzySalesFailureTime;

        public List<String> getFuzzySalesFailureTime(){return this.fuzzySalesFailureTime;}

        private List<String> rightFuzzySalesFailureTime;

        public List<String> getRightFuzzySalesFailureTime(){return this.rightFuzzySalesFailureTime;}
        private List<String> symptomNameList;

        public List<String> getSymptomNameList(){return this.symptomNameList;}


        private List<String> fuzzySymptomName;

        public List<String> getFuzzySymptomName(){return this.fuzzySymptomName;}

        private List<String> rightFuzzySymptomName;

        public List<String> getRightFuzzySymptomName(){return this.rightFuzzySymptomName;}
        private List<String> symptomContentList;

        public List<String> getSymptomContentList(){return this.symptomContentList;}


        private List<String> fuzzySymptomContent;

        public List<String> getFuzzySymptomContent(){return this.fuzzySymptomContent;}

        private List<String> rightFuzzySymptomContent;

        public List<String> getRightFuzzySymptomContent(){return this.rightFuzzySymptomContent;}
        private List<java.math.BigDecimal> manCostList;

        public List<java.math.BigDecimal> getManCostList(){return this.manCostList;}

        private java.math.BigDecimal manCostSt;

        private java.math.BigDecimal manCostEd;

        public java.math.BigDecimal getManCostSt(){return this.manCostSt;}

        public java.math.BigDecimal getManCostEd(){return this.manCostEd;}

        private List<java.math.BigDecimal> partsCostList;

        public List<java.math.BigDecimal> getPartsCostList(){return this.partsCostList;}

        private java.math.BigDecimal partsCostSt;

        private java.math.BigDecimal partsCostEd;

        public java.math.BigDecimal getPartsCostSt(){return this.partsCostSt;}

        public java.math.BigDecimal getPartsCostEd(){return this.partsCostEd;}

        private List<java.math.BigDecimal> partsManagerCostList;

        public List<java.math.BigDecimal> getPartsManagerCostList(){return this.partsManagerCostList;}

        private java.math.BigDecimal partsManagerCostSt;

        private java.math.BigDecimal partsManagerCostEd;

        public java.math.BigDecimal getPartsManagerCostSt(){return this.partsManagerCostSt;}

        public java.math.BigDecimal getPartsManagerCostEd(){return this.partsManagerCostEd;}

        private List<java.math.BigDecimal> outgoingCostList;

        public List<java.math.BigDecimal> getOutgoingCostList(){return this.outgoingCostList;}

        private java.math.BigDecimal outgoingCostSt;

        private java.math.BigDecimal outgoingCostEd;

        public java.math.BigDecimal getOutgoingCostSt(){return this.outgoingCostSt;}

        public java.math.BigDecimal getOutgoingCostEd(){return this.outgoingCostEd;}

        private List<java.math.BigDecimal> maintainCostList;

        public List<java.math.BigDecimal> getMaintainCostList(){return this.maintainCostList;}

        private java.math.BigDecimal maintainCostSt;

        private java.math.BigDecimal maintainCostEd;

        public java.math.BigDecimal getMaintainCostSt(){return this.maintainCostSt;}

        public java.math.BigDecimal getMaintainCostEd(){return this.maintainCostEd;}

        private List<java.math.BigDecimal> otherCostList;

        public List<java.math.BigDecimal> getOtherCostList(){return this.otherCostList;}

        private java.math.BigDecimal otherCostSt;

        private java.math.BigDecimal otherCostEd;

        public java.math.BigDecimal getOtherCostSt(){return this.otherCostSt;}

        public java.math.BigDecimal getOtherCostEd(){return this.otherCostEd;}

        private List<java.math.BigDecimal> totalCostList;

        public List<java.math.BigDecimal> getTotalCostList(){return this.totalCostList;}

        private java.math.BigDecimal totalCostSt;

        private java.math.BigDecimal totalCostEd;

        public java.math.BigDecimal getTotalCostSt(){return this.totalCostSt;}

        public java.math.BigDecimal getTotalCostEd(){return this.totalCostEd;}

        private List<String> importantLevelList;

        public List<String> getImportantLevelList(){return this.importantLevelList;}


        private List<String> fuzzyImportantLevel;

        public List<String> getFuzzyImportantLevel(){return this.fuzzyImportantLevel;}

        private List<String> rightFuzzyImportantLevel;

        public List<String> getRightFuzzyImportantLevel(){return this.rightFuzzyImportantLevel;}
        private List<String> transmissionTypeList;

        public List<String> getTransmissionTypeList(){return this.transmissionTypeList;}


        private List<String> fuzzyTransmissionType;

        public List<String> getFuzzyTransmissionType(){return this.fuzzyTransmissionType;}

        private List<String> rightFuzzyTransmissionType;

        public List<String> getRightFuzzyTransmissionType(){return this.rightFuzzyTransmissionType;}
        private List<String> newPartsBlindingNumList;

        public List<String> getNewPartsBlindingNumList(){return this.newPartsBlindingNumList;}


        private List<String> fuzzyNewPartsBlindingNum;

        public List<String> getFuzzyNewPartsBlindingNum(){return this.fuzzyNewPartsBlindingNum;}

        private List<String> rightFuzzyNewPartsBlindingNum;

        public List<String> getRightFuzzyNewPartsBlindingNum(){return this.rightFuzzyNewPartsBlindingNum;}
        private List<String> submitDateList;

        public List<String> getSubmitDateList(){return this.submitDateList;}


        private List<String> fuzzySubmitDate;

        public List<String> getFuzzySubmitDate(){return this.fuzzySubmitDate;}

        private List<String> rightFuzzySubmitDate;

        public List<String> getRightFuzzySubmitDate(){return this.rightFuzzySubmitDate;}
        private List<String> engCodeList;

        public List<String> getEngCodeList(){return this.engCodeList;}


        private List<String> fuzzyEngCode;

        public List<String> getFuzzyEngCode(){return this.fuzzyEngCode;}

        private List<String> rightFuzzyEngCode;

        public List<String> getRightFuzzyEngCode(){return this.rightFuzzyEngCode;}
        private List<String> engManufactureDateList;

        public List<String> getEngManufactureDateList(){return this.engManufactureDateList;}


        private List<String> fuzzyEngManufactureDate;

        public List<String> getFuzzyEngManufactureDate(){return this.fuzzyEngManufactureDate;}

        private List<String> rightFuzzyEngManufactureDate;

        public List<String> getRightFuzzyEngManufactureDate(){return this.rightFuzzyEngManufactureDate;}
        private List<String> transmissionCodeReList;

        public List<String> getTransmissionCodeReList(){return this.transmissionCodeReList;}


        private List<String> fuzzyTransmissionCodeRe;

        public List<String> getFuzzyTransmissionCodeRe(){return this.fuzzyTransmissionCodeRe;}

        private List<String> rightFuzzyTransmissionCodeRe;

        public List<String> getRightFuzzyTransmissionCodeRe(){return this.rightFuzzyTransmissionCodeRe;}
        private List<String> transmissionManufacturerList;

        public List<String> getTransmissionManufacturerList(){return this.transmissionManufacturerList;}


        private List<String> fuzzyTransmissionManufacturer;

        public List<String> getFuzzyTransmissionManufacturer(){return this.fuzzyTransmissionManufacturer;}

        private List<String> rightFuzzyTransmissionManufacturer;

        public List<String> getRightFuzzyTransmissionManufacturer(){return this.rightFuzzyTransmissionManufacturer;}
        private List<String> engArrangeList;

        public List<String> getEngArrangeList(){return this.engArrangeList;}


        private List<String> fuzzyEngArrange;

        public List<String> getFuzzyEngArrange(){return this.fuzzyEngArrange;}

        private List<String> rightFuzzyEngArrange;

        public List<String> getRightFuzzyEngArrange(){return this.rightFuzzyEngArrange;}
        private List<String> carModelList;

        public List<String> getCarModelList(){return this.carModelList;}


        private List<String> fuzzyCarModel;

        public List<String> getFuzzyCarModel(){return this.fuzzyCarModel;}

        private List<String> rightFuzzyCarModel;

        public List<String> getRightFuzzyCarModel(){return this.rightFuzzyCarModel;}
        private List<String> receiveTimeList;

        public List<String> getReceiveTimeList(){return this.receiveTimeList;}


        private List<String> fuzzyReceiveTime;

        public List<String> getFuzzyReceiveTime(){return this.fuzzyReceiveTime;}

        private List<String> rightFuzzyReceiveTime;

        public List<String> getRightFuzzyReceiveTime(){return this.rightFuzzyReceiveTime;}
        private List<String> claimCompensationList;

        public List<String> getClaimCompensationList(){return this.claimCompensationList;}


        private List<String> fuzzyClaimCompensation;

        public List<String> getFuzzyClaimCompensation(){return this.fuzzyClaimCompensation;}

        private List<String> rightFuzzyClaimCompensation;

        public List<String> getRightFuzzyClaimCompensation(){return this.rightFuzzyClaimCompensation;}
        private List<String> shortCodeList;

        public List<String> getShortCodeList(){return this.shortCodeList;}


        private List<String> fuzzyShortCode;

        public List<String> getFuzzyShortCode(){return this.fuzzyShortCode;}

        private List<String> rightFuzzyShortCode;

        public List<String> getRightFuzzyShortCode(){return this.rightFuzzyShortCode;}
        private List<String> faultCodeClassificationList;

        public List<String> getFaultCodeClassificationList(){return this.faultCodeClassificationList;}


        private List<String> fuzzyFaultCodeClassification;

        public List<String> getFuzzyFaultCodeClassification(){return this.fuzzyFaultCodeClassification;}

        private List<String> rightFuzzyFaultCodeClassification;

        public List<String> getRightFuzzyFaultCodeClassification(){return this.rightFuzzyFaultCodeClassification;}

        public ConditionBuilder voucherIdBetWeen(Integer voucherIdSt,Integer voucherIdEd){
            this.voucherIdSt = voucherIdSt;
            this.voucherIdEd = voucherIdEd;
            return this;
        }

        public ConditionBuilder voucherIdGreaterEqThan(Integer voucherIdSt){
            this.voucherIdSt = voucherIdSt;
            return this;
        }
        public ConditionBuilder voucherIdLessEqThan(Integer voucherIdEd){
            this.voucherIdEd = voucherIdEd;
            return this;
        }


        public ConditionBuilder voucherIdList(Integer ... voucherId){
            this.voucherIdList = solveNullList(voucherId);
            return this;
        }

        public ConditionBuilder voucherIdList(List<Integer> voucherId){
            this.voucherIdList = voucherId;
            return this;
        }

        public ConditionBuilder fuzzyQualityFeedbackCode (List<String> fuzzyQualityFeedbackCode){
            this.fuzzyQualityFeedbackCode = fuzzyQualityFeedbackCode;
            return this;
        }

        public ConditionBuilder fuzzyQualityFeedbackCode (String ... fuzzyQualityFeedbackCode){
            this.fuzzyQualityFeedbackCode = solveNullList(fuzzyQualityFeedbackCode);
            return this;
        }

        public ConditionBuilder rightFuzzyQualityFeedbackCode (List<String> rightFuzzyQualityFeedbackCode){
            this.rightFuzzyQualityFeedbackCode = rightFuzzyQualityFeedbackCode;
            return this;
        }

        public ConditionBuilder rightFuzzyQualityFeedbackCode (String ... rightFuzzyQualityFeedbackCode){
            this.rightFuzzyQualityFeedbackCode = solveNullList(rightFuzzyQualityFeedbackCode);
            return this;
        }

        public ConditionBuilder qualityFeedbackCodeList(String ... qualityFeedbackCode){
            this.qualityFeedbackCodeList = solveNullList(qualityFeedbackCode);
            return this;
        }

        public ConditionBuilder qualityFeedbackCodeList(List<String> qualityFeedbackCode){
            this.qualityFeedbackCodeList = qualityFeedbackCode;
            return this;
        }

        public ConditionBuilder fuzzyVoucherCode (List<String> fuzzyVoucherCode){
            this.fuzzyVoucherCode = fuzzyVoucherCode;
            return this;
        }

        public ConditionBuilder fuzzyVoucherCode (String ... fuzzyVoucherCode){
            this.fuzzyVoucherCode = solveNullList(fuzzyVoucherCode);
            return this;
        }

        public ConditionBuilder rightFuzzyVoucherCode (List<String> rightFuzzyVoucherCode){
            this.rightFuzzyVoucherCode = rightFuzzyVoucherCode;
            return this;
        }

        public ConditionBuilder rightFuzzyVoucherCode (String ... rightFuzzyVoucherCode){
            this.rightFuzzyVoucherCode = solveNullList(rightFuzzyVoucherCode);
            return this;
        }

        public ConditionBuilder voucherCodeList(String ... voucherCode){
            this.voucherCodeList = solveNullList(voucherCode);
            return this;
        }

        public ConditionBuilder voucherCodeList(List<String> voucherCode){
            this.voucherCodeList = voucherCode;
            return this;
        }

        public ConditionBuilder fuzzyDealerCode (List<String> fuzzyDealerCode){
            this.fuzzyDealerCode = fuzzyDealerCode;
            return this;
        }

        public ConditionBuilder fuzzyDealerCode (String ... fuzzyDealerCode){
            this.fuzzyDealerCode = solveNullList(fuzzyDealerCode);
            return this;
        }

        public ConditionBuilder rightFuzzyDealerCode (List<String> rightFuzzyDealerCode){
            this.rightFuzzyDealerCode = rightFuzzyDealerCode;
            return this;
        }

        public ConditionBuilder rightFuzzyDealerCode (String ... rightFuzzyDealerCode){
            this.rightFuzzyDealerCode = solveNullList(rightFuzzyDealerCode);
            return this;
        }

        public ConditionBuilder dealerCodeList(String ... dealerCode){
            this.dealerCodeList = solveNullList(dealerCode);
            return this;
        }

        public ConditionBuilder dealerCodeList(List<String> dealerCode){
            this.dealerCodeList = dealerCode;
            return this;
        }

        public ConditionBuilder fuzzyDealerName (List<String> fuzzyDealerName){
            this.fuzzyDealerName = fuzzyDealerName;
            return this;
        }

        public ConditionBuilder fuzzyDealerName (String ... fuzzyDealerName){
            this.fuzzyDealerName = solveNullList(fuzzyDealerName);
            return this;
        }

        public ConditionBuilder rightFuzzyDealerName (List<String> rightFuzzyDealerName){
            this.rightFuzzyDealerName = rightFuzzyDealerName;
            return this;
        }

        public ConditionBuilder rightFuzzyDealerName (String ... rightFuzzyDealerName){
            this.rightFuzzyDealerName = solveNullList(rightFuzzyDealerName);
            return this;
        }

        public ConditionBuilder dealerNameList(String ... dealerName){
            this.dealerNameList = solveNullList(dealerName);
            return this;
        }

        public ConditionBuilder dealerNameList(List<String> dealerName){
            this.dealerNameList = dealerName;
            return this;
        }

        public ConditionBuilder fuzzyDealerShortName (List<String> fuzzyDealerShortName){
            this.fuzzyDealerShortName = fuzzyDealerShortName;
            return this;
        }

        public ConditionBuilder fuzzyDealerShortName (String ... fuzzyDealerShortName){
            this.fuzzyDealerShortName = solveNullList(fuzzyDealerShortName);
            return this;
        }

        public ConditionBuilder rightFuzzyDealerShortName (List<String> rightFuzzyDealerShortName){
            this.rightFuzzyDealerShortName = rightFuzzyDealerShortName;
            return this;
        }

        public ConditionBuilder rightFuzzyDealerShortName (String ... rightFuzzyDealerShortName){
            this.rightFuzzyDealerShortName = solveNullList(rightFuzzyDealerShortName);
            return this;
        }

        public ConditionBuilder dealerShortNameList(String ... dealerShortName){
            this.dealerShortNameList = solveNullList(dealerShortName);
            return this;
        }

        public ConditionBuilder dealerShortNameList(List<String> dealerShortName){
            this.dealerShortNameList = dealerShortName;
            return this;
        }

        public ConditionBuilder fuzzyTheme (List<String> fuzzyTheme){
            this.fuzzyTheme = fuzzyTheme;
            return this;
        }

        public ConditionBuilder fuzzyTheme (String ... fuzzyTheme){
            this.fuzzyTheme = solveNullList(fuzzyTheme);
            return this;
        }

        public ConditionBuilder rightFuzzyTheme (List<String> rightFuzzyTheme){
            this.rightFuzzyTheme = rightFuzzyTheme;
            return this;
        }

        public ConditionBuilder rightFuzzyTheme (String ... rightFuzzyTheme){
            this.rightFuzzyTheme = solveNullList(rightFuzzyTheme);
            return this;
        }

        public ConditionBuilder themeList(String ... theme){
            this.themeList = solveNullList(theme);
            return this;
        }

        public ConditionBuilder themeList(List<String> theme){
            this.themeList = theme;
            return this;
        }

        public ConditionBuilder fuzzyVinCode (List<String> fuzzyVinCode){
            this.fuzzyVinCode = fuzzyVinCode;
            return this;
        }

        public ConditionBuilder fuzzyVinCode (String ... fuzzyVinCode){
            this.fuzzyVinCode = solveNullList(fuzzyVinCode);
            return this;
        }

        public ConditionBuilder rightFuzzyVinCode (List<String> rightFuzzyVinCode){
            this.rightFuzzyVinCode = rightFuzzyVinCode;
            return this;
        }

        public ConditionBuilder rightFuzzyVinCode (String ... rightFuzzyVinCode){
            this.rightFuzzyVinCode = solveNullList(rightFuzzyVinCode);
            return this;
        }

        public ConditionBuilder vinCodeList(String ... vinCode){
            this.vinCodeList = solveNullList(vinCode);
            return this;
        }

        public ConditionBuilder vinCodeList(List<String> vinCode){
            this.vinCodeList = vinCode;
            return this;
        }

        public ConditionBuilder fuzzyVehicleType (List<String> fuzzyVehicleType){
            this.fuzzyVehicleType = fuzzyVehicleType;
            return this;
        }

        public ConditionBuilder fuzzyVehicleType (String ... fuzzyVehicleType){
            this.fuzzyVehicleType = solveNullList(fuzzyVehicleType);
            return this;
        }

        public ConditionBuilder rightFuzzyVehicleType (List<String> rightFuzzyVehicleType){
            this.rightFuzzyVehicleType = rightFuzzyVehicleType;
            return this;
        }

        public ConditionBuilder rightFuzzyVehicleType (String ... rightFuzzyVehicleType){
            this.rightFuzzyVehicleType = solveNullList(rightFuzzyVehicleType);
            return this;
        }

        public ConditionBuilder vehicleTypeList(String ... vehicleType){
            this.vehicleTypeList = solveNullList(vehicleType);
            return this;
        }

        public ConditionBuilder vehicleTypeList(List<String> vehicleType){
            this.vehicleTypeList = vehicleType;
            return this;
        }

        public ConditionBuilder fuzzyPartsName (List<String> fuzzyPartsName){
            this.fuzzyPartsName = fuzzyPartsName;
            return this;
        }

        public ConditionBuilder fuzzyPartsName (String ... fuzzyPartsName){
            this.fuzzyPartsName = solveNullList(fuzzyPartsName);
            return this;
        }

        public ConditionBuilder rightFuzzyPartsName (List<String> rightFuzzyPartsName){
            this.rightFuzzyPartsName = rightFuzzyPartsName;
            return this;
        }

        public ConditionBuilder rightFuzzyPartsName (String ... rightFuzzyPartsName){
            this.rightFuzzyPartsName = solveNullList(rightFuzzyPartsName);
            return this;
        }

        public ConditionBuilder partsNameList(String ... partsName){
            this.partsNameList = solveNullList(partsName);
            return this;
        }

        public ConditionBuilder partsNameList(List<String> partsName){
            this.partsNameList = partsName;
            return this;
        }

        public ConditionBuilder fuzzyFirstLevelName (List<String> fuzzyFirstLevelName){
            this.fuzzyFirstLevelName = fuzzyFirstLevelName;
            return this;
        }

        public ConditionBuilder fuzzyFirstLevelName (String ... fuzzyFirstLevelName){
            this.fuzzyFirstLevelName = solveNullList(fuzzyFirstLevelName);
            return this;
        }

        public ConditionBuilder rightFuzzyFirstLevelName (List<String> rightFuzzyFirstLevelName){
            this.rightFuzzyFirstLevelName = rightFuzzyFirstLevelName;
            return this;
        }

        public ConditionBuilder rightFuzzyFirstLevelName (String ... rightFuzzyFirstLevelName){
            this.rightFuzzyFirstLevelName = solveNullList(rightFuzzyFirstLevelName);
            return this;
        }

        public ConditionBuilder firstLevelNameList(String ... firstLevelName){
            this.firstLevelNameList = solveNullList(firstLevelName);
            return this;
        }

        public ConditionBuilder firstLevelNameList(List<String> firstLevelName){
            this.firstLevelNameList = firstLevelName;
            return this;
        }

        public ConditionBuilder fuzzyPartsShortNameSpecPneno (List<String> fuzzyPartsShortNameSpecPneno){
            this.fuzzyPartsShortNameSpecPneno = fuzzyPartsShortNameSpecPneno;
            return this;
        }

        public ConditionBuilder fuzzyPartsShortNameSpecPneno (String ... fuzzyPartsShortNameSpecPneno){
            this.fuzzyPartsShortNameSpecPneno = solveNullList(fuzzyPartsShortNameSpecPneno);
            return this;
        }

        public ConditionBuilder rightFuzzyPartsShortNameSpecPneno (List<String> rightFuzzyPartsShortNameSpecPneno){
            this.rightFuzzyPartsShortNameSpecPneno = rightFuzzyPartsShortNameSpecPneno;
            return this;
        }

        public ConditionBuilder rightFuzzyPartsShortNameSpecPneno (String ... rightFuzzyPartsShortNameSpecPneno){
            this.rightFuzzyPartsShortNameSpecPneno = solveNullList(rightFuzzyPartsShortNameSpecPneno);
            return this;
        }

        public ConditionBuilder partsShortNameSpecPnenoList(String ... partsShortNameSpecPneno){
            this.partsShortNameSpecPnenoList = solveNullList(partsShortNameSpecPneno);
            return this;
        }

        public ConditionBuilder partsShortNameSpecPnenoList(List<String> partsShortNameSpecPneno){
            this.partsShortNameSpecPnenoList = partsShortNameSpecPneno;
            return this;
        }

        public ConditionBuilder fuzzyManufactureDate (List<String> fuzzyManufactureDate){
            this.fuzzyManufactureDate = fuzzyManufactureDate;
            return this;
        }

        public ConditionBuilder fuzzyManufactureDate (String ... fuzzyManufactureDate){
            this.fuzzyManufactureDate = solveNullList(fuzzyManufactureDate);
            return this;
        }

        public ConditionBuilder rightFuzzyManufactureDate (List<String> rightFuzzyManufactureDate){
            this.rightFuzzyManufactureDate = rightFuzzyManufactureDate;
            return this;
        }

        public ConditionBuilder rightFuzzyManufactureDate (String ... rightFuzzyManufactureDate){
            this.rightFuzzyManufactureDate = solveNullList(rightFuzzyManufactureDate);
            return this;
        }

        public ConditionBuilder manufactureDateList(String ... manufactureDate){
            this.manufactureDateList = solveNullList(manufactureDate);
            return this;
        }

        public ConditionBuilder manufactureDateList(List<String> manufactureDate){
            this.manufactureDateList = manufactureDate;
            return this;
        }

        public ConditionBuilder fuzzySalesFailureTime (List<String> fuzzySalesFailureTime){
            this.fuzzySalesFailureTime = fuzzySalesFailureTime;
            return this;
        }

        public ConditionBuilder fuzzySalesFailureTime (String ... fuzzySalesFailureTime){
            this.fuzzySalesFailureTime = solveNullList(fuzzySalesFailureTime);
            return this;
        }

        public ConditionBuilder rightFuzzySalesFailureTime (List<String> rightFuzzySalesFailureTime){
            this.rightFuzzySalesFailureTime = rightFuzzySalesFailureTime;
            return this;
        }

        public ConditionBuilder rightFuzzySalesFailureTime (String ... rightFuzzySalesFailureTime){
            this.rightFuzzySalesFailureTime = solveNullList(rightFuzzySalesFailureTime);
            return this;
        }

        public ConditionBuilder salesFailureTimeList(String ... salesFailureTime){
            this.salesFailureTimeList = solveNullList(salesFailureTime);
            return this;
        }

        public ConditionBuilder salesFailureTimeList(List<String> salesFailureTime){
            this.salesFailureTimeList = salesFailureTime;
            return this;
        }

        public ConditionBuilder fuzzySymptomName (List<String> fuzzySymptomName){
            this.fuzzySymptomName = fuzzySymptomName;
            return this;
        }

        public ConditionBuilder fuzzySymptomName (String ... fuzzySymptomName){
            this.fuzzySymptomName = solveNullList(fuzzySymptomName);
            return this;
        }

        public ConditionBuilder rightFuzzySymptomName (List<String> rightFuzzySymptomName){
            this.rightFuzzySymptomName = rightFuzzySymptomName;
            return this;
        }

        public ConditionBuilder rightFuzzySymptomName (String ... rightFuzzySymptomName){
            this.rightFuzzySymptomName = solveNullList(rightFuzzySymptomName);
            return this;
        }

        public ConditionBuilder symptomNameList(String ... symptomName){
            this.symptomNameList = solveNullList(symptomName);
            return this;
        }

        public ConditionBuilder symptomNameList(List<String> symptomName){
            this.symptomNameList = symptomName;
            return this;
        }

        public ConditionBuilder fuzzySymptomContent (List<String> fuzzySymptomContent){
            this.fuzzySymptomContent = fuzzySymptomContent;
            return this;
        }

        public ConditionBuilder fuzzySymptomContent (String ... fuzzySymptomContent){
            this.fuzzySymptomContent = solveNullList(fuzzySymptomContent);
            return this;
        }

        public ConditionBuilder rightFuzzySymptomContent (List<String> rightFuzzySymptomContent){
            this.rightFuzzySymptomContent = rightFuzzySymptomContent;
            return this;
        }

        public ConditionBuilder rightFuzzySymptomContent (String ... rightFuzzySymptomContent){
            this.rightFuzzySymptomContent = solveNullList(rightFuzzySymptomContent);
            return this;
        }

        public ConditionBuilder symptomContentList(String ... symptomContent){
            this.symptomContentList = solveNullList(symptomContent);
            return this;
        }

        public ConditionBuilder symptomContentList(List<String> symptomContent){
            this.symptomContentList = symptomContent;
            return this;
        }

        public ConditionBuilder manCostBetWeen(java.math.BigDecimal manCostSt,java.math.BigDecimal manCostEd){
            this.manCostSt = manCostSt;
            this.manCostEd = manCostEd;
            return this;
        }

        public ConditionBuilder manCostGreaterEqThan(java.math.BigDecimal manCostSt){
            this.manCostSt = manCostSt;
            return this;
        }
        public ConditionBuilder manCostLessEqThan(java.math.BigDecimal manCostEd){
            this.manCostEd = manCostEd;
            return this;
        }


        public ConditionBuilder manCostList(java.math.BigDecimal ... manCost){
            this.manCostList = solveNullList(manCost);
            return this;
        }

        public ConditionBuilder manCostList(List<java.math.BigDecimal> manCost){
            this.manCostList = manCost;
            return this;
        }

        public ConditionBuilder partsCostBetWeen(java.math.BigDecimal partsCostSt,java.math.BigDecimal partsCostEd){
            this.partsCostSt = partsCostSt;
            this.partsCostEd = partsCostEd;
            return this;
        }

        public ConditionBuilder partsCostGreaterEqThan(java.math.BigDecimal partsCostSt){
            this.partsCostSt = partsCostSt;
            return this;
        }
        public ConditionBuilder partsCostLessEqThan(java.math.BigDecimal partsCostEd){
            this.partsCostEd = partsCostEd;
            return this;
        }


        public ConditionBuilder partsCostList(java.math.BigDecimal ... partsCost){
            this.partsCostList = solveNullList(partsCost);
            return this;
        }

        public ConditionBuilder partsCostList(List<java.math.BigDecimal> partsCost){
            this.partsCostList = partsCost;
            return this;
        }

        public ConditionBuilder partsManagerCostBetWeen(java.math.BigDecimal partsManagerCostSt,java.math.BigDecimal partsManagerCostEd){
            this.partsManagerCostSt = partsManagerCostSt;
            this.partsManagerCostEd = partsManagerCostEd;
            return this;
        }

        public ConditionBuilder partsManagerCostGreaterEqThan(java.math.BigDecimal partsManagerCostSt){
            this.partsManagerCostSt = partsManagerCostSt;
            return this;
        }
        public ConditionBuilder partsManagerCostLessEqThan(java.math.BigDecimal partsManagerCostEd){
            this.partsManagerCostEd = partsManagerCostEd;
            return this;
        }


        public ConditionBuilder partsManagerCostList(java.math.BigDecimal ... partsManagerCost){
            this.partsManagerCostList = solveNullList(partsManagerCost);
            return this;
        }

        public ConditionBuilder partsManagerCostList(List<java.math.BigDecimal> partsManagerCost){
            this.partsManagerCostList = partsManagerCost;
            return this;
        }

        public ConditionBuilder outgoingCostBetWeen(java.math.BigDecimal outgoingCostSt,java.math.BigDecimal outgoingCostEd){
            this.outgoingCostSt = outgoingCostSt;
            this.outgoingCostEd = outgoingCostEd;
            return this;
        }

        public ConditionBuilder outgoingCostGreaterEqThan(java.math.BigDecimal outgoingCostSt){
            this.outgoingCostSt = outgoingCostSt;
            return this;
        }
        public ConditionBuilder outgoingCostLessEqThan(java.math.BigDecimal outgoingCostEd){
            this.outgoingCostEd = outgoingCostEd;
            return this;
        }


        public ConditionBuilder outgoingCostList(java.math.BigDecimal ... outgoingCost){
            this.outgoingCostList = solveNullList(outgoingCost);
            return this;
        }

        public ConditionBuilder outgoingCostList(List<java.math.BigDecimal> outgoingCost){
            this.outgoingCostList = outgoingCost;
            return this;
        }

        public ConditionBuilder maintainCostBetWeen(java.math.BigDecimal maintainCostSt,java.math.BigDecimal maintainCostEd){
            this.maintainCostSt = maintainCostSt;
            this.maintainCostEd = maintainCostEd;
            return this;
        }

        public ConditionBuilder maintainCostGreaterEqThan(java.math.BigDecimal maintainCostSt){
            this.maintainCostSt = maintainCostSt;
            return this;
        }
        public ConditionBuilder maintainCostLessEqThan(java.math.BigDecimal maintainCostEd){
            this.maintainCostEd = maintainCostEd;
            return this;
        }


        public ConditionBuilder maintainCostList(java.math.BigDecimal ... maintainCost){
            this.maintainCostList = solveNullList(maintainCost);
            return this;
        }

        public ConditionBuilder maintainCostList(List<java.math.BigDecimal> maintainCost){
            this.maintainCostList = maintainCost;
            return this;
        }

        public ConditionBuilder otherCostBetWeen(java.math.BigDecimal otherCostSt,java.math.BigDecimal otherCostEd){
            this.otherCostSt = otherCostSt;
            this.otherCostEd = otherCostEd;
            return this;
        }

        public ConditionBuilder otherCostGreaterEqThan(java.math.BigDecimal otherCostSt){
            this.otherCostSt = otherCostSt;
            return this;
        }
        public ConditionBuilder otherCostLessEqThan(java.math.BigDecimal otherCostEd){
            this.otherCostEd = otherCostEd;
            return this;
        }


        public ConditionBuilder otherCostList(java.math.BigDecimal ... otherCost){
            this.otherCostList = solveNullList(otherCost);
            return this;
        }

        public ConditionBuilder otherCostList(List<java.math.BigDecimal> otherCost){
            this.otherCostList = otherCost;
            return this;
        }

        public ConditionBuilder totalCostBetWeen(java.math.BigDecimal totalCostSt,java.math.BigDecimal totalCostEd){
            this.totalCostSt = totalCostSt;
            this.totalCostEd = totalCostEd;
            return this;
        }

        public ConditionBuilder totalCostGreaterEqThan(java.math.BigDecimal totalCostSt){
            this.totalCostSt = totalCostSt;
            return this;
        }
        public ConditionBuilder totalCostLessEqThan(java.math.BigDecimal totalCostEd){
            this.totalCostEd = totalCostEd;
            return this;
        }


        public ConditionBuilder totalCostList(java.math.BigDecimal ... totalCost){
            this.totalCostList = solveNullList(totalCost);
            return this;
        }

        public ConditionBuilder totalCostList(List<java.math.BigDecimal> totalCost){
            this.totalCostList = totalCost;
            return this;
        }

        public ConditionBuilder fuzzyImportantLevel (List<String> fuzzyImportantLevel){
            this.fuzzyImportantLevel = fuzzyImportantLevel;
            return this;
        }

        public ConditionBuilder fuzzyImportantLevel (String ... fuzzyImportantLevel){
            this.fuzzyImportantLevel = solveNullList(fuzzyImportantLevel);
            return this;
        }

        public ConditionBuilder rightFuzzyImportantLevel (List<String> rightFuzzyImportantLevel){
            this.rightFuzzyImportantLevel = rightFuzzyImportantLevel;
            return this;
        }

        public ConditionBuilder rightFuzzyImportantLevel (String ... rightFuzzyImportantLevel){
            this.rightFuzzyImportantLevel = solveNullList(rightFuzzyImportantLevel);
            return this;
        }

        public ConditionBuilder importantLevelList(String ... importantLevel){
            this.importantLevelList = solveNullList(importantLevel);
            return this;
        }

        public ConditionBuilder importantLevelList(List<String> importantLevel){
            this.importantLevelList = importantLevel;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionType (List<String> fuzzyTransmissionType){
            this.fuzzyTransmissionType = fuzzyTransmissionType;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionType (String ... fuzzyTransmissionType){
            this.fuzzyTransmissionType = solveNullList(fuzzyTransmissionType);
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionType (List<String> rightFuzzyTransmissionType){
            this.rightFuzzyTransmissionType = rightFuzzyTransmissionType;
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionType (String ... rightFuzzyTransmissionType){
            this.rightFuzzyTransmissionType = solveNullList(rightFuzzyTransmissionType);
            return this;
        }

        public ConditionBuilder transmissionTypeList(String ... transmissionType){
            this.transmissionTypeList = solveNullList(transmissionType);
            return this;
        }

        public ConditionBuilder transmissionTypeList(List<String> transmissionType){
            this.transmissionTypeList = transmissionType;
            return this;
        }

        public ConditionBuilder fuzzyNewPartsBlindingNum (List<String> fuzzyNewPartsBlindingNum){
            this.fuzzyNewPartsBlindingNum = fuzzyNewPartsBlindingNum;
            return this;
        }

        public ConditionBuilder fuzzyNewPartsBlindingNum (String ... fuzzyNewPartsBlindingNum){
            this.fuzzyNewPartsBlindingNum = solveNullList(fuzzyNewPartsBlindingNum);
            return this;
        }

        public ConditionBuilder rightFuzzyNewPartsBlindingNum (List<String> rightFuzzyNewPartsBlindingNum){
            this.rightFuzzyNewPartsBlindingNum = rightFuzzyNewPartsBlindingNum;
            return this;
        }

        public ConditionBuilder rightFuzzyNewPartsBlindingNum (String ... rightFuzzyNewPartsBlindingNum){
            this.rightFuzzyNewPartsBlindingNum = solveNullList(rightFuzzyNewPartsBlindingNum);
            return this;
        }

        public ConditionBuilder newPartsBlindingNumList(String ... newPartsBlindingNum){
            this.newPartsBlindingNumList = solveNullList(newPartsBlindingNum);
            return this;
        }

        public ConditionBuilder newPartsBlindingNumList(List<String> newPartsBlindingNum){
            this.newPartsBlindingNumList = newPartsBlindingNum;
            return this;
        }

        public ConditionBuilder fuzzySubmitDate (List<String> fuzzySubmitDate){
            this.fuzzySubmitDate = fuzzySubmitDate;
            return this;
        }

        public ConditionBuilder fuzzySubmitDate (String ... fuzzySubmitDate){
            this.fuzzySubmitDate = solveNullList(fuzzySubmitDate);
            return this;
        }

        public ConditionBuilder rightFuzzySubmitDate (List<String> rightFuzzySubmitDate){
            this.rightFuzzySubmitDate = rightFuzzySubmitDate;
            return this;
        }

        public ConditionBuilder rightFuzzySubmitDate (String ... rightFuzzySubmitDate){
            this.rightFuzzySubmitDate = solveNullList(rightFuzzySubmitDate);
            return this;
        }

        public ConditionBuilder submitDateList(String ... submitDate){
            this.submitDateList = solveNullList(submitDate);
            return this;
        }

        public ConditionBuilder submitDateList(List<String> submitDate){
            this.submitDateList = submitDate;
            return this;
        }

        public ConditionBuilder fuzzyEngCode (List<String> fuzzyEngCode){
            this.fuzzyEngCode = fuzzyEngCode;
            return this;
        }

        public ConditionBuilder fuzzyEngCode (String ... fuzzyEngCode){
            this.fuzzyEngCode = solveNullList(fuzzyEngCode);
            return this;
        }

        public ConditionBuilder rightFuzzyEngCode (List<String> rightFuzzyEngCode){
            this.rightFuzzyEngCode = rightFuzzyEngCode;
            return this;
        }

        public ConditionBuilder rightFuzzyEngCode (String ... rightFuzzyEngCode){
            this.rightFuzzyEngCode = solveNullList(rightFuzzyEngCode);
            return this;
        }

        public ConditionBuilder engCodeList(String ... engCode){
            this.engCodeList = solveNullList(engCode);
            return this;
        }

        public ConditionBuilder engCodeList(List<String> engCode){
            this.engCodeList = engCode;
            return this;
        }

        public ConditionBuilder fuzzyEngManufactureDate (List<String> fuzzyEngManufactureDate){
            this.fuzzyEngManufactureDate = fuzzyEngManufactureDate;
            return this;
        }

        public ConditionBuilder fuzzyEngManufactureDate (String ... fuzzyEngManufactureDate){
            this.fuzzyEngManufactureDate = solveNullList(fuzzyEngManufactureDate);
            return this;
        }

        public ConditionBuilder rightFuzzyEngManufactureDate (List<String> rightFuzzyEngManufactureDate){
            this.rightFuzzyEngManufactureDate = rightFuzzyEngManufactureDate;
            return this;
        }

        public ConditionBuilder rightFuzzyEngManufactureDate (String ... rightFuzzyEngManufactureDate){
            this.rightFuzzyEngManufactureDate = solveNullList(rightFuzzyEngManufactureDate);
            return this;
        }

        public ConditionBuilder engManufactureDateList(String ... engManufactureDate){
            this.engManufactureDateList = solveNullList(engManufactureDate);
            return this;
        }

        public ConditionBuilder engManufactureDateList(List<String> engManufactureDate){
            this.engManufactureDateList = engManufactureDate;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionCodeRe (List<String> fuzzyTransmissionCodeRe){
            this.fuzzyTransmissionCodeRe = fuzzyTransmissionCodeRe;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionCodeRe (String ... fuzzyTransmissionCodeRe){
            this.fuzzyTransmissionCodeRe = solveNullList(fuzzyTransmissionCodeRe);
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionCodeRe (List<String> rightFuzzyTransmissionCodeRe){
            this.rightFuzzyTransmissionCodeRe = rightFuzzyTransmissionCodeRe;
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionCodeRe (String ... rightFuzzyTransmissionCodeRe){
            this.rightFuzzyTransmissionCodeRe = solveNullList(rightFuzzyTransmissionCodeRe);
            return this;
        }

        public ConditionBuilder transmissionCodeReList(String ... transmissionCodeRe){
            this.transmissionCodeReList = solveNullList(transmissionCodeRe);
            return this;
        }

        public ConditionBuilder transmissionCodeReList(List<String> transmissionCodeRe){
            this.transmissionCodeReList = transmissionCodeRe;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionManufacturer (List<String> fuzzyTransmissionManufacturer){
            this.fuzzyTransmissionManufacturer = fuzzyTransmissionManufacturer;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionManufacturer (String ... fuzzyTransmissionManufacturer){
            this.fuzzyTransmissionManufacturer = solveNullList(fuzzyTransmissionManufacturer);
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionManufacturer (List<String> rightFuzzyTransmissionManufacturer){
            this.rightFuzzyTransmissionManufacturer = rightFuzzyTransmissionManufacturer;
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionManufacturer (String ... rightFuzzyTransmissionManufacturer){
            this.rightFuzzyTransmissionManufacturer = solveNullList(rightFuzzyTransmissionManufacturer);
            return this;
        }

        public ConditionBuilder transmissionManufacturerList(String ... transmissionManufacturer){
            this.transmissionManufacturerList = solveNullList(transmissionManufacturer);
            return this;
        }

        public ConditionBuilder transmissionManufacturerList(List<String> transmissionManufacturer){
            this.transmissionManufacturerList = transmissionManufacturer;
            return this;
        }

        public ConditionBuilder fuzzyEngArrange (List<String> fuzzyEngArrange){
            this.fuzzyEngArrange = fuzzyEngArrange;
            return this;
        }

        public ConditionBuilder fuzzyEngArrange (String ... fuzzyEngArrange){
            this.fuzzyEngArrange = solveNullList(fuzzyEngArrange);
            return this;
        }

        public ConditionBuilder rightFuzzyEngArrange (List<String> rightFuzzyEngArrange){
            this.rightFuzzyEngArrange = rightFuzzyEngArrange;
            return this;
        }

        public ConditionBuilder rightFuzzyEngArrange (String ... rightFuzzyEngArrange){
            this.rightFuzzyEngArrange = solveNullList(rightFuzzyEngArrange);
            return this;
        }

        public ConditionBuilder engArrangeList(String ... engArrange){
            this.engArrangeList = solveNullList(engArrange);
            return this;
        }

        public ConditionBuilder engArrangeList(List<String> engArrange){
            this.engArrangeList = engArrange;
            return this;
        }

        public ConditionBuilder fuzzyCarModel (List<String> fuzzyCarModel){
            this.fuzzyCarModel = fuzzyCarModel;
            return this;
        }

        public ConditionBuilder fuzzyCarModel (String ... fuzzyCarModel){
            this.fuzzyCarModel = solveNullList(fuzzyCarModel);
            return this;
        }

        public ConditionBuilder rightFuzzyCarModel (List<String> rightFuzzyCarModel){
            this.rightFuzzyCarModel = rightFuzzyCarModel;
            return this;
        }

        public ConditionBuilder rightFuzzyCarModel (String ... rightFuzzyCarModel){
            this.rightFuzzyCarModel = solveNullList(rightFuzzyCarModel);
            return this;
        }

        public ConditionBuilder carModelList(String ... carModel){
            this.carModelList = solveNullList(carModel);
            return this;
        }

        public ConditionBuilder carModelList(List<String> carModel){
            this.carModelList = carModel;
            return this;
        }

        public ConditionBuilder fuzzyReceiveTime (List<String> fuzzyReceiveTime){
            this.fuzzyReceiveTime = fuzzyReceiveTime;
            return this;
        }

        public ConditionBuilder fuzzyReceiveTime (String ... fuzzyReceiveTime){
            this.fuzzyReceiveTime = solveNullList(fuzzyReceiveTime);
            return this;
        }

        public ConditionBuilder rightFuzzyReceiveTime (List<String> rightFuzzyReceiveTime){
            this.rightFuzzyReceiveTime = rightFuzzyReceiveTime;
            return this;
        }

        public ConditionBuilder rightFuzzyReceiveTime (String ... rightFuzzyReceiveTime){
            this.rightFuzzyReceiveTime = solveNullList(rightFuzzyReceiveTime);
            return this;
        }

        public ConditionBuilder receiveTimeList(String ... receiveTime){
            this.receiveTimeList = solveNullList(receiveTime);
            return this;
        }

        public ConditionBuilder receiveTimeList(List<String> receiveTime){
            this.receiveTimeList = receiveTime;
            return this;
        }

        public ConditionBuilder fuzzyClaimCompensation (List<String> fuzzyClaimCompensation){
            this.fuzzyClaimCompensation = fuzzyClaimCompensation;
            return this;
        }

        public ConditionBuilder fuzzyClaimCompensation (String ... fuzzyClaimCompensation){
            this.fuzzyClaimCompensation = solveNullList(fuzzyClaimCompensation);
            return this;
        }

        public ConditionBuilder rightFuzzyClaimCompensation (List<String> rightFuzzyClaimCompensation){
            this.rightFuzzyClaimCompensation = rightFuzzyClaimCompensation;
            return this;
        }

        public ConditionBuilder rightFuzzyClaimCompensation (String ... rightFuzzyClaimCompensation){
            this.rightFuzzyClaimCompensation = solveNullList(rightFuzzyClaimCompensation);
            return this;
        }

        public ConditionBuilder claimCompensationList(String ... claimCompensation){
            this.claimCompensationList = solveNullList(claimCompensation);
            return this;
        }

        public ConditionBuilder claimCompensationList(List<String> claimCompensation){
            this.claimCompensationList = claimCompensation;
            return this;
        }

        public ConditionBuilder fuzzyShortCode (List<String> fuzzyShortCode){
            this.fuzzyShortCode = fuzzyShortCode;
            return this;
        }

        public ConditionBuilder fuzzyShortCode (String ... fuzzyShortCode){
            this.fuzzyShortCode = solveNullList(fuzzyShortCode);
            return this;
        }

        public ConditionBuilder rightFuzzyShortCode (List<String> rightFuzzyShortCode){
            this.rightFuzzyShortCode = rightFuzzyShortCode;
            return this;
        }

        public ConditionBuilder rightFuzzyShortCode (String ... rightFuzzyShortCode){
            this.rightFuzzyShortCode = solveNullList(rightFuzzyShortCode);
            return this;
        }

        public ConditionBuilder shortCodeList(String ... shortCode){
            this.shortCodeList = solveNullList(shortCode);
            return this;
        }

        public ConditionBuilder shortCodeList(List<String> shortCode){
            this.shortCodeList = shortCode;
            return this;
        }

        public ConditionBuilder fuzzyFaultCodeClassification (List<String> fuzzyFaultCodeClassification){
            this.fuzzyFaultCodeClassification = fuzzyFaultCodeClassification;
            return this;
        }

        public ConditionBuilder fuzzyFaultCodeClassification (String ... fuzzyFaultCodeClassification){
            this.fuzzyFaultCodeClassification = solveNullList(fuzzyFaultCodeClassification);
            return this;
        }

        public ConditionBuilder rightFuzzyFaultCodeClassification (List<String> rightFuzzyFaultCodeClassification){
            this.rightFuzzyFaultCodeClassification = rightFuzzyFaultCodeClassification;
            return this;
        }

        public ConditionBuilder rightFuzzyFaultCodeClassification (String ... rightFuzzyFaultCodeClassification){
            this.rightFuzzyFaultCodeClassification = solveNullList(rightFuzzyFaultCodeClassification);
            return this;
        }

        public ConditionBuilder faultCodeClassificationList(String ... faultCodeClassification){
            this.faultCodeClassificationList = solveNullList(faultCodeClassification);
            return this;
        }

        public ConditionBuilder faultCodeClassificationList(List<String> faultCodeClassification){
            this.faultCodeClassificationList = faultCodeClassification;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private MqmsVoucher obj;

        public Builder(){
            this.obj = new MqmsVoucher();
        }

        public Builder voucherId(Integer voucherId){
            this.obj.setVoucherId(voucherId);
            return this;
        }
        public Builder qualityFeedbackCode(String qualityFeedbackCode){
            this.obj.setQualityFeedbackCode(qualityFeedbackCode);
            return this;
        }
        public Builder voucherCode(String voucherCode){
            this.obj.setVoucherCode(voucherCode);
            return this;
        }
        public Builder dealerCode(String dealerCode){
            this.obj.setDealerCode(dealerCode);
            return this;
        }
        public Builder dealerName(String dealerName){
            this.obj.setDealerName(dealerName);
            return this;
        }
        public Builder dealerShortName(String dealerShortName){
            this.obj.setDealerShortName(dealerShortName);
            return this;
        }
        public Builder theme(String theme){
            this.obj.setTheme(theme);
            return this;
        }
        public Builder vinCode(String vinCode){
            this.obj.setVinCode(vinCode);
            return this;
        }
        public Builder vehicleType(String vehicleType){
            this.obj.setVehicleType(vehicleType);
            return this;
        }
        public Builder partsName(String partsName){
            this.obj.setPartsName(partsName);
            return this;
        }
        public Builder firstLevelName(String firstLevelName){
            this.obj.setFirstLevelName(firstLevelName);
            return this;
        }
        public Builder partsShortNameSpecPneno(String partsShortNameSpecPneno){
            this.obj.setPartsShortNameSpecPneno(partsShortNameSpecPneno);
            return this;
        }
        public Builder manufactureDate(String manufactureDate){
            this.obj.setManufactureDate(manufactureDate);
            return this;
        }
        public Builder salesFailureTime(String salesFailureTime){
            this.obj.setSalesFailureTime(salesFailureTime);
            return this;
        }
        public Builder symptomName(String symptomName){
            this.obj.setSymptomName(symptomName);
            return this;
        }
        public Builder symptomContent(String symptomContent){
            this.obj.setSymptomContent(symptomContent);
            return this;
        }
        public Builder manCost(java.math.BigDecimal manCost){
            this.obj.setManCost(manCost);
            return this;
        }
        public Builder partsCost(java.math.BigDecimal partsCost){
            this.obj.setPartsCost(partsCost);
            return this;
        }
        public Builder partsManagerCost(java.math.BigDecimal partsManagerCost){
            this.obj.setPartsManagerCost(partsManagerCost);
            return this;
        }
        public Builder outgoingCost(java.math.BigDecimal outgoingCost){
            this.obj.setOutgoingCost(outgoingCost);
            return this;
        }
        public Builder maintainCost(java.math.BigDecimal maintainCost){
            this.obj.setMaintainCost(maintainCost);
            return this;
        }
        public Builder otherCost(java.math.BigDecimal otherCost){
            this.obj.setOtherCost(otherCost);
            return this;
        }
        public Builder totalCost(java.math.BigDecimal totalCost){
            this.obj.setTotalCost(totalCost);
            return this;
        }
        public Builder importantLevel(String importantLevel){
            this.obj.setImportantLevel(importantLevel);
            return this;
        }
        public Builder transmissionType(String transmissionType){
            this.obj.setTransmissionType(transmissionType);
            return this;
        }
        public Builder newPartsBlindingNum(String newPartsBlindingNum){
            this.obj.setNewPartsBlindingNum(newPartsBlindingNum);
            return this;
        }
        public Builder submitDate(String submitDate){
            this.obj.setSubmitDate(submitDate);
            return this;
        }
        public Builder engCode(String engCode){
            this.obj.setEngCode(engCode);
            return this;
        }
        public Builder engManufactureDate(String engManufactureDate){
            this.obj.setEngManufactureDate(engManufactureDate);
            return this;
        }
        public Builder transmissionCodeRe(String transmissionCodeRe){
            this.obj.setTransmissionCodeRe(transmissionCodeRe);
            return this;
        }
        public Builder transmissionManufacturer(String transmissionManufacturer){
            this.obj.setTransmissionManufacturer(transmissionManufacturer);
            return this;
        }
        public Builder engArrange(String engArrange){
            this.obj.setEngArrange(engArrange);
            return this;
        }
        public Builder carModel(String carModel){
            this.obj.setCarModel(carModel);
            return this;
        }
        public Builder receiveTime(String receiveTime){
            this.obj.setReceiveTime(receiveTime);
            return this;
        }
        public Builder claimCompensation(String claimCompensation){
            this.obj.setClaimCompensation(claimCompensation);
            return this;
        }
        public Builder shortCode(String shortCode){
            this.obj.setShortCode(shortCode);
            return this;
        }
        public Builder faultCodeClassification(String faultCodeClassification){
            this.obj.setFaultCodeClassification(faultCodeClassification);
            return this;
        }
        public MqmsVoucher build(){return obj;}
    }

}
