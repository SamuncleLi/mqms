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

    private static final long serialVersionUID = 1583292377737L;


    /**
    * 主键
    * 系统id号
    * isNullAble:0
    */
    private Integer voucherId;

    /**
    * 单据编号
    * isNullAble:0
    */
    private String voucherCode;

    /**
    * 索赔单号
    * isNullAble:1
    */
    private String claimCode;

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
    * vin
    * isNullAble:1
    */
    private String vinCode;

    /**
    * 车型
    * isNullAble:1
    */
    private String vehicleType;

    /**
    * 产品编号
    * isNullAble:1
    */
    private String productionCode;

    /**
    * 零部件编号
    * isNullAble:1
    */
    private String partsCode;

    /**
    * 零部件名称
    * isNullAble:1
    */
    private String partsName;

    /**
    * 一级名称
    * isNullAble:1
    */
    private String divisionLevel1;

    /**
    * 二级名称
    * isNullAble:1
    */
    private String divisionLevel2;

    /**
    * 三级名称
    * isNullAble:1
    */
    private String divisionLevel3;

    /**
    * 零件简称-具体现象
    * isNullAble:1
    */
    private String partsAndSymptom;

    /**
    * 生产日期
    * isNullAble:1
    */
    private String offlineDate;

    /**
    * 销售日期
    * isNullAble:1
    */
    private String salesDate;

    /**
    * 故障日期
    * isNullAble:1
    */
    private String failureDate;

    /**
    * 里程
    * isNullAble:1
    */
    private Integer mileage;

    /**
    * 确认时间
    * isNullAble:1
    */
    private String confirmDate;

    /**
    * 车辆出库时间
    * isNullAble:1
    */
    private String warehousingDate;

    /**
    * 车辆发运时间
    * isNullAble:1
    */
    private String transportDate;

    /**
    * 车辆到店时间
    * isNullAble:1
    */
    private String shopArrivalDate;

    /**
    * 销售至故障经过月
    * isNullAble:1
    */
    private Integer salesFailureTime;

    /**
    * 故障描述
    * isNullAble:1
    */
    private String failureDesc;

    /**
    * 诊断过程
    * isNullAble:1
    */
    private String diagnosticResult;

    /**
    * 工时金额
    * isNullAble:1
    */
    private java.math.BigDecimal manCost;

    /**
    * 配件金额
    * isNullAble:1
    */
    private java.math.BigDecimal materialCost;

    /**
    * 配件管理费用
    * isNullAble:1
    */
    private java.math.BigDecimal materialManagementCost;

    /**
    * 外出费用
    * isNullAble:1
    */
    private java.math.BigDecimal goOutCost;

    /**
    * 保养费用
    * isNullAble:1
    */
    private java.math.BigDecimal maintainingCost;

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
    * 重要度
    * isNullAble:1
    */
    private String importantLevel;

    /**
    * 变速箱类型
    * isNullAble:1
    */
    private String transmissionType;

    /**
    * 新件绑定号
    * isNullAble:1
    */
    private String newPartsBond;

    /**
    * 提交时间
    * isNullAble:1
    */
    private String submitDate;

    /**
    * 发动机号
    * isNullAble:1
    */
    private String egtypeCode;

    /**
    * 变速箱号
    * isNullAble:1
    */
    private String transmissionCode;

    /**
    * eng整理（故障分类）
    * isNullAble:1
    */
    private String engArrange;

    /**
    * 车型
    * isNullAble:1
    */
    private String carModel;

    /**
    * 发动机机型
    * isNullAble:1
    */
    private String engType;

    /**
    * 变速箱机型
    * isNullAble:1
    */
    private String transmissionCodeRe;

    /**
    * 变速箱机型（详细）
    * isNullAble:1
    */
    private String tranTypeDetail;

    /**
    * 变速箱生产厂家
    * isNullAble:1
    */
    private String transmissionManufacturer;

    /**
    * 接收区间
    * isNullAble:1
    */
    private String receiveTime;

    /**
    * 是否算入索赔率统计
    * isNullAble:1
    */
    private String claimCompensation;

    /**
    * 备注1
    * isNullAble:1
    */
    private String productionRawDescription;

    /**
    * PDI
    * isNullAble:1
    */
    private String PDI;

    /**
    * 下线至确认经过月
    * isNullAble:1
    */
    private Integer offlineFailureTime;

    /**
    * 变速箱使用至确认经过月
    * isNullAble:1
    */
    private String transmissionComfirmTime;

    /**
    * 发动机或变速箱
    * isNullAble:1
    */
    private String engOrTran;

    /**
    * 短码
    * isNullAble:1
    */
    private String shortCode;

    /**
    * 故障码分类
    * isNullAble:1
    */
    private String faultCodeClassification;

    /**
    * 变速箱生产日期
    * isNullAble:1
    */
    private String transmissionProductionData;

    /**
    * 故障年
    * isNullAble:1
    */
    private String failureYear;

    /**
    * 故障月
    * isNullAble:1
    */
    private String failureMonth;

    /**
    * 变速箱短码
    * isNullAble:1,defaultVal:
    */
    private String transmissionShortCode;

    /**
    * 里程分布
    * isNullAble:1
    */
    private String mileageDistribution;

    /**
    * 开启不良追踪者
    * isNullAble:1
    */
    private String trackBeginer;

    /**
    * 不良追踪开启时间
    * isNullAble:1
    */
    private String trackBeginTime;

    /**
    * 快递负责人
    * isNullAble:1
    */
    private String deliveryPerson;

    /**
    * 
    * isNullAble:1
    */
    private String deliveryDeadline;

    /**
    * 
    * isNullAble:1
    */
    private String deliveryReceivedDate;

    /**
    * 
    * isNullAble:1
    */
    private Integer failureTrackId;

    /**
    * 
    * isNullAble:1
    */
    private Integer applierId;

    /**
    * 
    * isNullAble:1
    */
    private String applierName;

    /**
    * 
    * isNullAble:1
    */
    private String applyTime;


    public void setVoucherId(Integer voucherId){this.voucherId = voucherId;}

    public Integer getVoucherId(){return this.voucherId;}

    public void setVoucherCode(String voucherCode){this.voucherCode = voucherCode;}

    public String getVoucherCode(){return this.voucherCode;}

    public void setClaimCode(String claimCode){this.claimCode = claimCode;}

    public String getClaimCode(){return this.claimCode;}

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

    public void setProductionCode(String productionCode){this.productionCode = productionCode;}

    public String getProductionCode(){return this.productionCode;}

    public void setPartsCode(String partsCode){this.partsCode = partsCode;}

    public String getPartsCode(){return this.partsCode;}

    public void setPartsName(String partsName){this.partsName = partsName;}

    public String getPartsName(){return this.partsName;}

    public void setDivisionLevel1(String divisionLevel1){this.divisionLevel1 = divisionLevel1;}

    public String getDivisionLevel1(){return this.divisionLevel1;}

    public void setDivisionLevel2(String divisionLevel2){this.divisionLevel2 = divisionLevel2;}

    public String getDivisionLevel2(){return this.divisionLevel2;}

    public void setDivisionLevel3(String divisionLevel3){this.divisionLevel3 = divisionLevel3;}

    public String getDivisionLevel3(){return this.divisionLevel3;}

    public void setPartsAndSymptom(String partsAndSymptom){this.partsAndSymptom = partsAndSymptom;}

    public String getPartsAndSymptom(){return this.partsAndSymptom;}

    public void setOfflineDate(String offlineDate){this.offlineDate = offlineDate;}

    public String getOfflineDate(){return this.offlineDate;}

    public void setSalesDate(String salesDate){this.salesDate = salesDate;}

    public String getSalesDate(){return this.salesDate;}

    public void setFailureDate(String failureDate){this.failureDate = failureDate;}

    public String getFailureDate(){return this.failureDate;}

    public void setMileage(Integer mileage){this.mileage = mileage;}

    public Integer getMileage(){return this.mileage;}

    public void setConfirmDate(String confirmDate){this.confirmDate = confirmDate;}

    public String getConfirmDate(){return this.confirmDate;}

    public void setWarehousingDate(String warehousingDate){this.warehousingDate = warehousingDate;}

    public String getWarehousingDate(){return this.warehousingDate;}

    public void setTransportDate(String transportDate){this.transportDate = transportDate;}

    public String getTransportDate(){return this.transportDate;}

    public void setShopArrivalDate(String shopArrivalDate){this.shopArrivalDate = shopArrivalDate;}

    public String getShopArrivalDate(){return this.shopArrivalDate;}

    public void setSalesFailureTime(Integer salesFailureTime){this.salesFailureTime = salesFailureTime;}

    public Integer getSalesFailureTime(){return this.salesFailureTime;}

    public void setFailureDesc(String failureDesc){this.failureDesc = failureDesc;}

    public String getFailureDesc(){return this.failureDesc;}

    public void setDiagnosticResult(String diagnosticResult){this.diagnosticResult = diagnosticResult;}

    public String getDiagnosticResult(){return this.diagnosticResult;}

    public void setManCost(java.math.BigDecimal manCost){this.manCost = manCost;}

    public java.math.BigDecimal getManCost(){return this.manCost;}

    public void setMaterialCost(java.math.BigDecimal materialCost){this.materialCost = materialCost;}

    public java.math.BigDecimal getMaterialCost(){return this.materialCost;}

    public void setMaterialManagementCost(java.math.BigDecimal materialManagementCost){this.materialManagementCost = materialManagementCost;}

    public java.math.BigDecimal getMaterialManagementCost(){return this.materialManagementCost;}

    public void setGoOutCost(java.math.BigDecimal goOutCost){this.goOutCost = goOutCost;}

    public java.math.BigDecimal getGoOutCost(){return this.goOutCost;}

    public void setMaintainingCost(java.math.BigDecimal maintainingCost){this.maintainingCost = maintainingCost;}

    public java.math.BigDecimal getMaintainingCost(){return this.maintainingCost;}

    public void setOtherCost(java.math.BigDecimal otherCost){this.otherCost = otherCost;}

    public java.math.BigDecimal getOtherCost(){return this.otherCost;}

    public void setTotalCost(java.math.BigDecimal totalCost){this.totalCost = totalCost;}

    public java.math.BigDecimal getTotalCost(){return this.totalCost;}

    public void setImportantLevel(String importantLevel){this.importantLevel = importantLevel;}

    public String getImportantLevel(){return this.importantLevel;}

    public void setTransmissionType(String transmissionType){this.transmissionType = transmissionType;}

    public String getTransmissionType(){return this.transmissionType;}

    public void setNewPartsBond(String newPartsBond){this.newPartsBond = newPartsBond;}

    public String getNewPartsBond(){return this.newPartsBond;}

    public void setSubmitDate(String submitDate){this.submitDate = submitDate;}

    public String getSubmitDate(){return this.submitDate;}

    public void setEgtypeCode(String egtypeCode){this.egtypeCode = egtypeCode;}

    public String getEgtypeCode(){return this.egtypeCode;}

    public void setTransmissionCode(String transmissionCode){this.transmissionCode = transmissionCode;}

    public String getTransmissionCode(){return this.transmissionCode;}

    public void setEngArrange(String engArrange){this.engArrange = engArrange;}

    public String getEngArrange(){return this.engArrange;}

    public void setCarModel(String carModel){this.carModel = carModel;}

    public String getCarModel(){return this.carModel;}

    public void setEngType(String engType){this.engType = engType;}

    public String getEngType(){return this.engType;}

    public void setTransmissionCodeRe(String transmissionCodeRe){this.transmissionCodeRe = transmissionCodeRe;}

    public String getTransmissionCodeRe(){return this.transmissionCodeRe;}

    public void setTranTypeDetail(String tranTypeDetail){this.tranTypeDetail = tranTypeDetail;}

    public String getTranTypeDetail(){return this.tranTypeDetail;}

    public void setTransmissionManufacturer(String transmissionManufacturer){this.transmissionManufacturer = transmissionManufacturer;}

    public String getTransmissionManufacturer(){return this.transmissionManufacturer;}

    public void setReceiveTime(String receiveTime){this.receiveTime = receiveTime;}

    public String getReceiveTime(){return this.receiveTime;}

    public void setClaimCompensation(String claimCompensation){this.claimCompensation = claimCompensation;}

    public String getClaimCompensation(){return this.claimCompensation;}

    public void setProductionRawDescription(String productionRawDescription){this.productionRawDescription = productionRawDescription;}

    public String getProductionRawDescription(){return this.productionRawDescription;}

    public void setPDI(String PDI){this.PDI = PDI;}

    public String getPDI(){return this.PDI;}

    public void setOfflineFailureTime(Integer offlineFailureTime){this.offlineFailureTime = offlineFailureTime;}

    public Integer getOfflineFailureTime(){return this.offlineFailureTime;}

    public void setTransmissionComfirmTime(String transmissionComfirmTime){this.transmissionComfirmTime = transmissionComfirmTime;}

    public String getTransmissionComfirmTime(){return this.transmissionComfirmTime;}

    public void setEngOrTran(String engOrTran){this.engOrTran = engOrTran;}

    public String getEngOrTran(){return this.engOrTran;}

    public void setShortCode(String shortCode){this.shortCode = shortCode;}

    public String getShortCode(){return this.shortCode;}

    public void setFaultCodeClassification(String faultCodeClassification){this.faultCodeClassification = faultCodeClassification;}

    public String getFaultCodeClassification(){return this.faultCodeClassification;}

    public void setTransmissionProductionData(String transmissionProductionData){this.transmissionProductionData = transmissionProductionData;}

    public String getTransmissionProductionData(){return this.transmissionProductionData;}

    public void setFailureYear(String failureYear){this.failureYear = failureYear;}

    public String getFailureYear(){return this.failureYear;}

    public void setFailureMonth(String failureMonth){this.failureMonth = failureMonth;}

    public String getFailureMonth(){return this.failureMonth;}

    public void setTransmissionShortCode(String transmissionShortCode){this.transmissionShortCode = transmissionShortCode;}

    public String getTransmissionShortCode(){return this.transmissionShortCode;}

    public void setMileageDistribution(String mileageDistribution){this.mileageDistribution = mileageDistribution;}

    public String getMileageDistribution(){return this.mileageDistribution;}

    public void setTrackBeginer(String trackBeginer){this.trackBeginer = trackBeginer;}

    public String getTrackBeginer(){return this.trackBeginer;}

    public void setTrackBeginTime(String trackBeginTime){this.trackBeginTime = trackBeginTime;}

    public String getTrackBeginTime(){return this.trackBeginTime;}

    public void setDeliveryPerson(String deliveryPerson){this.deliveryPerson = deliveryPerson;}

    public String getDeliveryPerson(){return this.deliveryPerson;}

    public void setDeliveryDeadline(String deliveryDeadline){this.deliveryDeadline = deliveryDeadline;}

    public String getDeliveryDeadline(){return this.deliveryDeadline;}

    public void setDeliveryReceivedDate(String deliveryReceivedDate){this.deliveryReceivedDate = deliveryReceivedDate;}

    public String getDeliveryReceivedDate(){return this.deliveryReceivedDate;}

    public void setFailureTrackId(Integer failureTrackId){this.failureTrackId = failureTrackId;}

    public Integer getFailureTrackId(){return this.failureTrackId;}

    public void setApplierId(Integer applierId){this.applierId = applierId;}

    public Integer getApplierId(){return this.applierId;}

    public void setApplierName(String applierName){this.applierName = applierName;}

    public String getApplierName(){return this.applierName;}

    public void setApplyTime(String applyTime){this.applyTime = applyTime;}

    public String getApplyTime(){return this.applyTime;}
    @Override
    public String toString() {
        return "MqmsVoucher{" +
                "voucherId='" + voucherId + '\'' +
                "voucherCode='" + voucherCode + '\'' +
                "claimCode='" + claimCode + '\'' +
                "dealerCode='" + dealerCode + '\'' +
                "dealerName='" + dealerName + '\'' +
                "dealerShortName='" + dealerShortName + '\'' +
                "theme='" + theme + '\'' +
                "vinCode='" + vinCode + '\'' +
                "vehicleType='" + vehicleType + '\'' +
                "productionCode='" + productionCode + '\'' +
                "partsCode='" + partsCode + '\'' +
                "partsName='" + partsName + '\'' +
                "divisionLevel1='" + divisionLevel1 + '\'' +
                "divisionLevel2='" + divisionLevel2 + '\'' +
                "divisionLevel3='" + divisionLevel3 + '\'' +
                "partsAndSymptom='" + partsAndSymptom + '\'' +
                "offlineDate='" + offlineDate + '\'' +
                "salesDate='" + salesDate + '\'' +
                "failureDate='" + failureDate + '\'' +
                "mileage='" + mileage + '\'' +
                "confirmDate='" + confirmDate + '\'' +
                "warehousingDate='" + warehousingDate + '\'' +
                "transportDate='" + transportDate + '\'' +
                "shopArrivalDate='" + shopArrivalDate + '\'' +
                "salesFailureTime='" + salesFailureTime + '\'' +
                "failureDesc='" + failureDesc + '\'' +
                "diagnosticResult='" + diagnosticResult + '\'' +
                "manCost='" + manCost + '\'' +
                "materialCost='" + materialCost + '\'' +
                "materialManagementCost='" + materialManagementCost + '\'' +
                "goOutCost='" + goOutCost + '\'' +
                "maintainingCost='" + maintainingCost + '\'' +
                "otherCost='" + otherCost + '\'' +
                "totalCost='" + totalCost + '\'' +
                "importantLevel='" + importantLevel + '\'' +
                "transmissionType='" + transmissionType + '\'' +
                "newPartsBond='" + newPartsBond + '\'' +
                "submitDate='" + submitDate + '\'' +
                "egtypeCode='" + egtypeCode + '\'' +
                "transmissionCode='" + transmissionCode + '\'' +
                "engArrange='" + engArrange + '\'' +
                "carModel='" + carModel + '\'' +
                "engType='" + engType + '\'' +
                "transmissionCodeRe='" + transmissionCodeRe + '\'' +
                "tranTypeDetail='" + tranTypeDetail + '\'' +
                "transmissionManufacturer='" + transmissionManufacturer + '\'' +
                "receiveTime='" + receiveTime + '\'' +
                "claimCompensation='" + claimCompensation + '\'' +
                "productionRawDescription='" + productionRawDescription + '\'' +
                "PDI='" + PDI + '\'' +
                "offlineFailureTime='" + offlineFailureTime + '\'' +
                "transmissionComfirmTime='" + transmissionComfirmTime + '\'' +
                "engOrTran='" + engOrTran + '\'' +
                "shortCode='" + shortCode + '\'' +
                "faultCodeClassification='" + faultCodeClassification + '\'' +
                "transmissionProductionData='" + transmissionProductionData + '\'' +
                "failureYear='" + failureYear + '\'' +
                "failureMonth='" + failureMonth + '\'' +
                "transmissionShortCode='" + transmissionShortCode + '\'' +
                "mileageDistribution='" + mileageDistribution + '\'' +
                "trackBeginer='" + trackBeginer + '\'' +
                "trackBeginTime='" + trackBeginTime + '\'' +
                "deliveryPerson='" + deliveryPerson + '\'' +
                "deliveryDeadline='" + deliveryDeadline + '\'' +
                "deliveryReceivedDate='" + deliveryReceivedDate + '\'' +
                "failureTrackId='" + failureTrackId + '\'' +
                "applierId='" + applierId + '\'' +
                "applierName='" + applierName + '\'' +
                "applyTime='" + applyTime + '\'' +
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

        private List<String> voucherCodeList;

        public List<String> getVoucherCodeList(){return this.voucherCodeList;}


        private List<String> fuzzyVoucherCode;

        public List<String> getFuzzyVoucherCode(){return this.fuzzyVoucherCode;}

        private List<String> rightFuzzyVoucherCode;

        public List<String> getRightFuzzyVoucherCode(){return this.rightFuzzyVoucherCode;}
        private List<String> claimCodeList;

        public List<String> getClaimCodeList(){return this.claimCodeList;}


        private List<String> fuzzyClaimCode;

        public List<String> getFuzzyClaimCode(){return this.fuzzyClaimCode;}

        private List<String> rightFuzzyClaimCode;

        public List<String> getRightFuzzyClaimCode(){return this.rightFuzzyClaimCode;}
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
        private List<String> productionCodeList;

        public List<String> getProductionCodeList(){return this.productionCodeList;}


        private List<String> fuzzyProductionCode;

        public List<String> getFuzzyProductionCode(){return this.fuzzyProductionCode;}

        private List<String> rightFuzzyProductionCode;

        public List<String> getRightFuzzyProductionCode(){return this.rightFuzzyProductionCode;}
        private List<String> partsCodeList;

        public List<String> getPartsCodeList(){return this.partsCodeList;}


        private List<String> fuzzyPartsCode;

        public List<String> getFuzzyPartsCode(){return this.fuzzyPartsCode;}

        private List<String> rightFuzzyPartsCode;

        public List<String> getRightFuzzyPartsCode(){return this.rightFuzzyPartsCode;}
        private List<String> partsNameList;

        public List<String> getPartsNameList(){return this.partsNameList;}


        private List<String> fuzzyPartsName;

        public List<String> getFuzzyPartsName(){return this.fuzzyPartsName;}

        private List<String> rightFuzzyPartsName;

        public List<String> getRightFuzzyPartsName(){return this.rightFuzzyPartsName;}
        private List<String> divisionLevel1List;

        public List<String> getDivisionLevel1List(){return this.divisionLevel1List;}


        private List<String> fuzzyDivisionLevel1;

        public List<String> getFuzzyDivisionLevel1(){return this.fuzzyDivisionLevel1;}

        private List<String> rightFuzzyDivisionLevel1;

        public List<String> getRightFuzzyDivisionLevel1(){return this.rightFuzzyDivisionLevel1;}
        private List<String> divisionLevel2List;

        public List<String> getDivisionLevel2List(){return this.divisionLevel2List;}


        private List<String> fuzzyDivisionLevel2;

        public List<String> getFuzzyDivisionLevel2(){return this.fuzzyDivisionLevel2;}

        private List<String> rightFuzzyDivisionLevel2;

        public List<String> getRightFuzzyDivisionLevel2(){return this.rightFuzzyDivisionLevel2;}
        private List<String> divisionLevel3List;

        public List<String> getDivisionLevel3List(){return this.divisionLevel3List;}


        private List<String> fuzzyDivisionLevel3;

        public List<String> getFuzzyDivisionLevel3(){return this.fuzzyDivisionLevel3;}

        private List<String> rightFuzzyDivisionLevel3;

        public List<String> getRightFuzzyDivisionLevel3(){return this.rightFuzzyDivisionLevel3;}
        private List<String> partsAndSymptomList;

        public List<String> getPartsAndSymptomList(){return this.partsAndSymptomList;}


        private List<String> fuzzyPartsAndSymptom;

        public List<String> getFuzzyPartsAndSymptom(){return this.fuzzyPartsAndSymptom;}

        private List<String> rightFuzzyPartsAndSymptom;

        public List<String> getRightFuzzyPartsAndSymptom(){return this.rightFuzzyPartsAndSymptom;}
        private List<String> offlineDateList;

        public List<String> getOfflineDateList(){return this.offlineDateList;}


        private List<String> fuzzyOfflineDate;

        public List<String> getFuzzyOfflineDate(){return this.fuzzyOfflineDate;}

        private List<String> rightFuzzyOfflineDate;

        public List<String> getRightFuzzyOfflineDate(){return this.rightFuzzyOfflineDate;}
        private List<String> salesDateList;

        public List<String> getSalesDateList(){return this.salesDateList;}


        private List<String> fuzzySalesDate;

        public List<String> getFuzzySalesDate(){return this.fuzzySalesDate;}

        private List<String> rightFuzzySalesDate;

        public List<String> getRightFuzzySalesDate(){return this.rightFuzzySalesDate;}
        private List<String> failureDateList;

        public List<String> getFailureDateList(){return this.failureDateList;}


        private List<String> fuzzyFailureDate;

        public List<String> getFuzzyFailureDate(){return this.fuzzyFailureDate;}

        private List<String> rightFuzzyFailureDate;

        public List<String> getRightFuzzyFailureDate(){return this.rightFuzzyFailureDate;}
        private List<Integer> mileageList;

        public List<Integer> getMileageList(){return this.mileageList;}

        private Integer mileageSt;

        private Integer mileageEd;

        public Integer getMileageSt(){return this.mileageSt;}

        public Integer getMileageEd(){return this.mileageEd;}

        private List<String> confirmDateList;

        public List<String> getConfirmDateList(){return this.confirmDateList;}


        private List<String> fuzzyConfirmDate;

        public List<String> getFuzzyConfirmDate(){return this.fuzzyConfirmDate;}

        private List<String> rightFuzzyConfirmDate;

        public List<String> getRightFuzzyConfirmDate(){return this.rightFuzzyConfirmDate;}
        private List<String> warehousingDateList;

        public List<String> getWarehousingDateList(){return this.warehousingDateList;}


        private List<String> fuzzyWarehousingDate;

        public List<String> getFuzzyWarehousingDate(){return this.fuzzyWarehousingDate;}

        private List<String> rightFuzzyWarehousingDate;

        public List<String> getRightFuzzyWarehousingDate(){return this.rightFuzzyWarehousingDate;}
        private List<String> transportDateList;

        public List<String> getTransportDateList(){return this.transportDateList;}


        private List<String> fuzzyTransportDate;

        public List<String> getFuzzyTransportDate(){return this.fuzzyTransportDate;}

        private List<String> rightFuzzyTransportDate;

        public List<String> getRightFuzzyTransportDate(){return this.rightFuzzyTransportDate;}
        private List<String> shopArrivalDateList;

        public List<String> getShopArrivalDateList(){return this.shopArrivalDateList;}


        private List<String> fuzzyShopArrivalDate;

        public List<String> getFuzzyShopArrivalDate(){return this.fuzzyShopArrivalDate;}

        private List<String> rightFuzzyShopArrivalDate;

        public List<String> getRightFuzzyShopArrivalDate(){return this.rightFuzzyShopArrivalDate;}
        private List<Integer> salesFailureTimeList;

        public List<Integer> getSalesFailureTimeList(){return this.salesFailureTimeList;}

        private Integer salesFailureTimeSt;

        private Integer salesFailureTimeEd;

        public Integer getSalesFailureTimeSt(){return this.salesFailureTimeSt;}

        public Integer getSalesFailureTimeEd(){return this.salesFailureTimeEd;}

        private List<String> failureDescList;

        public List<String> getFailureDescList(){return this.failureDescList;}


        private List<String> fuzzyFailureDesc;

        public List<String> getFuzzyFailureDesc(){return this.fuzzyFailureDesc;}

        private List<String> rightFuzzyFailureDesc;

        public List<String> getRightFuzzyFailureDesc(){return this.rightFuzzyFailureDesc;}
        private List<String> diagnosticResultList;

        public List<String> getDiagnosticResultList(){return this.diagnosticResultList;}


        private List<String> fuzzyDiagnosticResult;

        public List<String> getFuzzyDiagnosticResult(){return this.fuzzyDiagnosticResult;}

        private List<String> rightFuzzyDiagnosticResult;

        public List<String> getRightFuzzyDiagnosticResult(){return this.rightFuzzyDiagnosticResult;}
        private List<java.math.BigDecimal> manCostList;

        public List<java.math.BigDecimal> getManCostList(){return this.manCostList;}

        private java.math.BigDecimal manCostSt;

        private java.math.BigDecimal manCostEd;

        public java.math.BigDecimal getManCostSt(){return this.manCostSt;}

        public java.math.BigDecimal getManCostEd(){return this.manCostEd;}

        private List<java.math.BigDecimal> materialCostList;

        public List<java.math.BigDecimal> getMaterialCostList(){return this.materialCostList;}

        private java.math.BigDecimal materialCostSt;

        private java.math.BigDecimal materialCostEd;

        public java.math.BigDecimal getMaterialCostSt(){return this.materialCostSt;}

        public java.math.BigDecimal getMaterialCostEd(){return this.materialCostEd;}

        private List<java.math.BigDecimal> materialManagementCostList;

        public List<java.math.BigDecimal> getMaterialManagementCostList(){return this.materialManagementCostList;}

        private java.math.BigDecimal materialManagementCostSt;

        private java.math.BigDecimal materialManagementCostEd;

        public java.math.BigDecimal getMaterialManagementCostSt(){return this.materialManagementCostSt;}

        public java.math.BigDecimal getMaterialManagementCostEd(){return this.materialManagementCostEd;}

        private List<java.math.BigDecimal> goOutCostList;

        public List<java.math.BigDecimal> getGoOutCostList(){return this.goOutCostList;}

        private java.math.BigDecimal goOutCostSt;

        private java.math.BigDecimal goOutCostEd;

        public java.math.BigDecimal getGoOutCostSt(){return this.goOutCostSt;}

        public java.math.BigDecimal getGoOutCostEd(){return this.goOutCostEd;}

        private List<java.math.BigDecimal> maintainingCostList;

        public List<java.math.BigDecimal> getMaintainingCostList(){return this.maintainingCostList;}

        private java.math.BigDecimal maintainingCostSt;

        private java.math.BigDecimal maintainingCostEd;

        public java.math.BigDecimal getMaintainingCostSt(){return this.maintainingCostSt;}

        public java.math.BigDecimal getMaintainingCostEd(){return this.maintainingCostEd;}

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
        private List<String> newPartsBondList;

        public List<String> getNewPartsBondList(){return this.newPartsBondList;}


        private List<String> fuzzyNewPartsBond;

        public List<String> getFuzzyNewPartsBond(){return this.fuzzyNewPartsBond;}

        private List<String> rightFuzzyNewPartsBond;

        public List<String> getRightFuzzyNewPartsBond(){return this.rightFuzzyNewPartsBond;}
        private List<String> submitDateList;

        public List<String> getSubmitDateList(){return this.submitDateList;}


        private List<String> fuzzySubmitDate;

        public List<String> getFuzzySubmitDate(){return this.fuzzySubmitDate;}

        private List<String> rightFuzzySubmitDate;

        public List<String> getRightFuzzySubmitDate(){return this.rightFuzzySubmitDate;}
        private List<String> egtypeCodeList;

        public List<String> getEgtypeCodeList(){return this.egtypeCodeList;}


        private List<String> fuzzyEgtypeCode;

        public List<String> getFuzzyEgtypeCode(){return this.fuzzyEgtypeCode;}

        private List<String> rightFuzzyEgtypeCode;

        public List<String> getRightFuzzyEgtypeCode(){return this.rightFuzzyEgtypeCode;}
        private List<String> transmissionCodeList;

        public List<String> getTransmissionCodeList(){return this.transmissionCodeList;}


        private List<String> fuzzyTransmissionCode;

        public List<String> getFuzzyTransmissionCode(){return this.fuzzyTransmissionCode;}

        private List<String> rightFuzzyTransmissionCode;

        public List<String> getRightFuzzyTransmissionCode(){return this.rightFuzzyTransmissionCode;}
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
        private List<String> engTypeList;

        public List<String> getEngTypeList(){return this.engTypeList;}


        private List<String> fuzzyEngType;

        public List<String> getFuzzyEngType(){return this.fuzzyEngType;}

        private List<String> rightFuzzyEngType;

        public List<String> getRightFuzzyEngType(){return this.rightFuzzyEngType;}
        private List<String> transmissionCodeReList;

        public List<String> getTransmissionCodeReList(){return this.transmissionCodeReList;}


        private List<String> fuzzyTransmissionCodeRe;

        public List<String> getFuzzyTransmissionCodeRe(){return this.fuzzyTransmissionCodeRe;}

        private List<String> rightFuzzyTransmissionCodeRe;

        public List<String> getRightFuzzyTransmissionCodeRe(){return this.rightFuzzyTransmissionCodeRe;}
        private List<String> tranTypeDetailList;

        public List<String> getTranTypeDetailList(){return this.tranTypeDetailList;}


        private List<String> fuzzyTranTypeDetail;

        public List<String> getFuzzyTranTypeDetail(){return this.fuzzyTranTypeDetail;}

        private List<String> rightFuzzyTranTypeDetail;

        public List<String> getRightFuzzyTranTypeDetail(){return this.rightFuzzyTranTypeDetail;}
        private List<String> transmissionManufacturerList;

        public List<String> getTransmissionManufacturerList(){return this.transmissionManufacturerList;}


        private List<String> fuzzyTransmissionManufacturer;

        public List<String> getFuzzyTransmissionManufacturer(){return this.fuzzyTransmissionManufacturer;}

        private List<String> rightFuzzyTransmissionManufacturer;

        public List<String> getRightFuzzyTransmissionManufacturer(){return this.rightFuzzyTransmissionManufacturer;}
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
        private List<String> productionRawDescriptionList;

        public List<String> getProductionRawDescriptionList(){return this.productionRawDescriptionList;}


        private List<String> fuzzyProductionRawDescription;

        public List<String> getFuzzyProductionRawDescription(){return this.fuzzyProductionRawDescription;}

        private List<String> rightFuzzyProductionRawDescription;

        public List<String> getRightFuzzyProductionRawDescription(){return this.rightFuzzyProductionRawDescription;}
        private List<String> PDIList;

        public List<String> getPDIList(){return this.PDIList;}


        private List<String> fuzzyPDI;

        public List<String> getFuzzyPDI(){return this.fuzzyPDI;}

        private List<String> rightFuzzyPDI;

        public List<String> getRightFuzzyPDI(){return this.rightFuzzyPDI;}
        private List<Integer> offlineFailureTimeList;

        public List<Integer> getOfflineFailureTimeList(){return this.offlineFailureTimeList;}

        private Integer offlineFailureTimeSt;

        private Integer offlineFailureTimeEd;

        public Integer getOfflineFailureTimeSt(){return this.offlineFailureTimeSt;}

        public Integer getOfflineFailureTimeEd(){return this.offlineFailureTimeEd;}

        private List<String> transmissionComfirmTimeList;

        public List<String> getTransmissionComfirmTimeList(){return this.transmissionComfirmTimeList;}


        private List<String> fuzzyTransmissionComfirmTime;

        public List<String> getFuzzyTransmissionComfirmTime(){return this.fuzzyTransmissionComfirmTime;}

        private List<String> rightFuzzyTransmissionComfirmTime;

        public List<String> getRightFuzzyTransmissionComfirmTime(){return this.rightFuzzyTransmissionComfirmTime;}
        private List<String> engOrTranList;

        public List<String> getEngOrTranList(){return this.engOrTranList;}


        private List<String> fuzzyEngOrTran;

        public List<String> getFuzzyEngOrTran(){return this.fuzzyEngOrTran;}

        private List<String> rightFuzzyEngOrTran;

        public List<String> getRightFuzzyEngOrTran(){return this.rightFuzzyEngOrTran;}
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
        private List<String> transmissionProductionDataList;

        public List<String> getTransmissionProductionDataList(){return this.transmissionProductionDataList;}


        private List<String> fuzzyTransmissionProductionData;

        public List<String> getFuzzyTransmissionProductionData(){return this.fuzzyTransmissionProductionData;}

        private List<String> rightFuzzyTransmissionProductionData;

        public List<String> getRightFuzzyTransmissionProductionData(){return this.rightFuzzyTransmissionProductionData;}
        private List<String> failureYearList;

        public List<String> getFailureYearList(){return this.failureYearList;}


        private List<String> fuzzyFailureYear;

        public List<String> getFuzzyFailureYear(){return this.fuzzyFailureYear;}

        private List<String> rightFuzzyFailureYear;

        public List<String> getRightFuzzyFailureYear(){return this.rightFuzzyFailureYear;}
        private List<String> failureMonthList;

        public List<String> getFailureMonthList(){return this.failureMonthList;}


        private List<String> fuzzyFailureMonth;

        public List<String> getFuzzyFailureMonth(){return this.fuzzyFailureMonth;}

        private List<String> rightFuzzyFailureMonth;

        public List<String> getRightFuzzyFailureMonth(){return this.rightFuzzyFailureMonth;}
        private List<String> transmissionShortCodeList;

        public List<String> getTransmissionShortCodeList(){return this.transmissionShortCodeList;}


        private List<String> fuzzyTransmissionShortCode;

        public List<String> getFuzzyTransmissionShortCode(){return this.fuzzyTransmissionShortCode;}

        private List<String> rightFuzzyTransmissionShortCode;

        public List<String> getRightFuzzyTransmissionShortCode(){return this.rightFuzzyTransmissionShortCode;}
        private List<String> mileageDistributionList;

        public List<String> getMileageDistributionList(){return this.mileageDistributionList;}


        private List<String> fuzzyMileageDistribution;

        public List<String> getFuzzyMileageDistribution(){return this.fuzzyMileageDistribution;}

        private List<String> rightFuzzyMileageDistribution;

        public List<String> getRightFuzzyMileageDistribution(){return this.rightFuzzyMileageDistribution;}
        private List<String> trackBeginerList;

        public List<String> getTrackBeginerList(){return this.trackBeginerList;}


        private List<String> fuzzyTrackBeginer;

        public List<String> getFuzzyTrackBeginer(){return this.fuzzyTrackBeginer;}

        private List<String> rightFuzzyTrackBeginer;

        public List<String> getRightFuzzyTrackBeginer(){return this.rightFuzzyTrackBeginer;}
        private List<String> trackBeginTimeList;

        public List<String> getTrackBeginTimeList(){return this.trackBeginTimeList;}


        private List<String> fuzzyTrackBeginTime;

        public List<String> getFuzzyTrackBeginTime(){return this.fuzzyTrackBeginTime;}

        private List<String> rightFuzzyTrackBeginTime;

        public List<String> getRightFuzzyTrackBeginTime(){return this.rightFuzzyTrackBeginTime;}
        private List<String> deliveryPersonList;

        public List<String> getDeliveryPersonList(){return this.deliveryPersonList;}


        private List<String> fuzzyDeliveryPerson;

        public List<String> getFuzzyDeliveryPerson(){return this.fuzzyDeliveryPerson;}

        private List<String> rightFuzzyDeliveryPerson;

        public List<String> getRightFuzzyDeliveryPerson(){return this.rightFuzzyDeliveryPerson;}
        private List<String> deliveryDeadlineList;

        public List<String> getDeliveryDeadlineList(){return this.deliveryDeadlineList;}


        private List<String> fuzzyDeliveryDeadline;

        public List<String> getFuzzyDeliveryDeadline(){return this.fuzzyDeliveryDeadline;}

        private List<String> rightFuzzyDeliveryDeadline;

        public List<String> getRightFuzzyDeliveryDeadline(){return this.rightFuzzyDeliveryDeadline;}
        private List<String> deliveryReceivedDateList;

        public List<String> getDeliveryReceivedDateList(){return this.deliveryReceivedDateList;}


        private List<String> fuzzyDeliveryReceivedDate;

        public List<String> getFuzzyDeliveryReceivedDate(){return this.fuzzyDeliveryReceivedDate;}

        private List<String> rightFuzzyDeliveryReceivedDate;

        public List<String> getRightFuzzyDeliveryReceivedDate(){return this.rightFuzzyDeliveryReceivedDate;}
        private List<Integer> failureTrackIdList;

        public List<Integer> getFailureTrackIdList(){return this.failureTrackIdList;}

        private Integer failureTrackIdSt;

        private Integer failureTrackIdEd;

        public Integer getFailureTrackIdSt(){return this.failureTrackIdSt;}

        public Integer getFailureTrackIdEd(){return this.failureTrackIdEd;}

        private List<Integer> applierIdList;

        public List<Integer> getApplierIdList(){return this.applierIdList;}

        private Integer applierIdSt;

        private Integer applierIdEd;

        public Integer getApplierIdSt(){return this.applierIdSt;}

        public Integer getApplierIdEd(){return this.applierIdEd;}

        private List<String> applierNameList;

        public List<String> getApplierNameList(){return this.applierNameList;}


        private List<String> fuzzyApplierName;

        public List<String> getFuzzyApplierName(){return this.fuzzyApplierName;}

        private List<String> rightFuzzyApplierName;

        public List<String> getRightFuzzyApplierName(){return this.rightFuzzyApplierName;}
        private List<String> applyTimeList;

        public List<String> getApplyTimeList(){return this.applyTimeList;}


        private List<String> fuzzyApplyTime;

        public List<String> getFuzzyApplyTime(){return this.fuzzyApplyTime;}

        private List<String> rightFuzzyApplyTime;

        public List<String> getRightFuzzyApplyTime(){return this.rightFuzzyApplyTime;}
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

        public QueryBuilder fuzzyClaimCode (List<String> fuzzyClaimCode){
            this.fuzzyClaimCode = fuzzyClaimCode;
            return this;
        }

        public QueryBuilder fuzzyClaimCode (String ... fuzzyClaimCode){
            this.fuzzyClaimCode = solveNullList(fuzzyClaimCode);
            return this;
        }

        public QueryBuilder rightFuzzyClaimCode (List<String> rightFuzzyClaimCode){
            this.rightFuzzyClaimCode = rightFuzzyClaimCode;
            return this;
        }

        public QueryBuilder rightFuzzyClaimCode (String ... rightFuzzyClaimCode){
            this.rightFuzzyClaimCode = solveNullList(rightFuzzyClaimCode);
            return this;
        }

        public QueryBuilder claimCode(String claimCode){
            setClaimCode(claimCode);
            return this;
        }

        public QueryBuilder claimCodeList(String ... claimCode){
            this.claimCodeList = solveNullList(claimCode);
            return this;
        }

        public QueryBuilder claimCodeList(List<String> claimCode){
            this.claimCodeList = claimCode;
            return this;
        }

        public QueryBuilder fetchClaimCode(){
            setFetchFields("fetchFields","claimCode");
            return this;
        }

        public QueryBuilder excludeClaimCode(){
            setFetchFields("excludeFields","claimCode");
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

        public QueryBuilder fuzzyProductionCode (List<String> fuzzyProductionCode){
            this.fuzzyProductionCode = fuzzyProductionCode;
            return this;
        }

        public QueryBuilder fuzzyProductionCode (String ... fuzzyProductionCode){
            this.fuzzyProductionCode = solveNullList(fuzzyProductionCode);
            return this;
        }

        public QueryBuilder rightFuzzyProductionCode (List<String> rightFuzzyProductionCode){
            this.rightFuzzyProductionCode = rightFuzzyProductionCode;
            return this;
        }

        public QueryBuilder rightFuzzyProductionCode (String ... rightFuzzyProductionCode){
            this.rightFuzzyProductionCode = solveNullList(rightFuzzyProductionCode);
            return this;
        }

        public QueryBuilder productionCode(String productionCode){
            setProductionCode(productionCode);
            return this;
        }

        public QueryBuilder productionCodeList(String ... productionCode){
            this.productionCodeList = solveNullList(productionCode);
            return this;
        }

        public QueryBuilder productionCodeList(List<String> productionCode){
            this.productionCodeList = productionCode;
            return this;
        }

        public QueryBuilder fetchProductionCode(){
            setFetchFields("fetchFields","productionCode");
            return this;
        }

        public QueryBuilder excludeProductionCode(){
            setFetchFields("excludeFields","productionCode");
            return this;
        }

        public QueryBuilder fuzzyPartsCode (List<String> fuzzyPartsCode){
            this.fuzzyPartsCode = fuzzyPartsCode;
            return this;
        }

        public QueryBuilder fuzzyPartsCode (String ... fuzzyPartsCode){
            this.fuzzyPartsCode = solveNullList(fuzzyPartsCode);
            return this;
        }

        public QueryBuilder rightFuzzyPartsCode (List<String> rightFuzzyPartsCode){
            this.rightFuzzyPartsCode = rightFuzzyPartsCode;
            return this;
        }

        public QueryBuilder rightFuzzyPartsCode (String ... rightFuzzyPartsCode){
            this.rightFuzzyPartsCode = solveNullList(rightFuzzyPartsCode);
            return this;
        }

        public QueryBuilder partsCode(String partsCode){
            setPartsCode(partsCode);
            return this;
        }

        public QueryBuilder partsCodeList(String ... partsCode){
            this.partsCodeList = solveNullList(partsCode);
            return this;
        }

        public QueryBuilder partsCodeList(List<String> partsCode){
            this.partsCodeList = partsCode;
            return this;
        }

        public QueryBuilder fetchPartsCode(){
            setFetchFields("fetchFields","partsCode");
            return this;
        }

        public QueryBuilder excludePartsCode(){
            setFetchFields("excludeFields","partsCode");
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

        public QueryBuilder fuzzyDivisionLevel1 (List<String> fuzzyDivisionLevel1){
            this.fuzzyDivisionLevel1 = fuzzyDivisionLevel1;
            return this;
        }

        public QueryBuilder fuzzyDivisionLevel1 (String ... fuzzyDivisionLevel1){
            this.fuzzyDivisionLevel1 = solveNullList(fuzzyDivisionLevel1);
            return this;
        }

        public QueryBuilder rightFuzzyDivisionLevel1 (List<String> rightFuzzyDivisionLevel1){
            this.rightFuzzyDivisionLevel1 = rightFuzzyDivisionLevel1;
            return this;
        }

        public QueryBuilder rightFuzzyDivisionLevel1 (String ... rightFuzzyDivisionLevel1){
            this.rightFuzzyDivisionLevel1 = solveNullList(rightFuzzyDivisionLevel1);
            return this;
        }

        public QueryBuilder divisionLevel1(String divisionLevel1){
            setDivisionLevel1(divisionLevel1);
            return this;
        }

        public QueryBuilder divisionLevel1List(String ... divisionLevel1){
            this.divisionLevel1List = solveNullList(divisionLevel1);
            return this;
        }

        public QueryBuilder divisionLevel1List(List<String> divisionLevel1){
            this.divisionLevel1List = divisionLevel1;
            return this;
        }

        public QueryBuilder fetchDivisionLevel1(){
            setFetchFields("fetchFields","divisionLevel1");
            return this;
        }

        public QueryBuilder excludeDivisionLevel1(){
            setFetchFields("excludeFields","divisionLevel1");
            return this;
        }

        public QueryBuilder fuzzyDivisionLevel2 (List<String> fuzzyDivisionLevel2){
            this.fuzzyDivisionLevel2 = fuzzyDivisionLevel2;
            return this;
        }

        public QueryBuilder fuzzyDivisionLevel2 (String ... fuzzyDivisionLevel2){
            this.fuzzyDivisionLevel2 = solveNullList(fuzzyDivisionLevel2);
            return this;
        }

        public QueryBuilder rightFuzzyDivisionLevel2 (List<String> rightFuzzyDivisionLevel2){
            this.rightFuzzyDivisionLevel2 = rightFuzzyDivisionLevel2;
            return this;
        }

        public QueryBuilder rightFuzzyDivisionLevel2 (String ... rightFuzzyDivisionLevel2){
            this.rightFuzzyDivisionLevel2 = solveNullList(rightFuzzyDivisionLevel2);
            return this;
        }

        public QueryBuilder divisionLevel2(String divisionLevel2){
            setDivisionLevel2(divisionLevel2);
            return this;
        }

        public QueryBuilder divisionLevel2List(String ... divisionLevel2){
            this.divisionLevel2List = solveNullList(divisionLevel2);
            return this;
        }

        public QueryBuilder divisionLevel2List(List<String> divisionLevel2){
            this.divisionLevel2List = divisionLevel2;
            return this;
        }

        public QueryBuilder fetchDivisionLevel2(){
            setFetchFields("fetchFields","divisionLevel2");
            return this;
        }

        public QueryBuilder excludeDivisionLevel2(){
            setFetchFields("excludeFields","divisionLevel2");
            return this;
        }

        public QueryBuilder fuzzyDivisionLevel3 (List<String> fuzzyDivisionLevel3){
            this.fuzzyDivisionLevel3 = fuzzyDivisionLevel3;
            return this;
        }

        public QueryBuilder fuzzyDivisionLevel3 (String ... fuzzyDivisionLevel3){
            this.fuzzyDivisionLevel3 = solveNullList(fuzzyDivisionLevel3);
            return this;
        }

        public QueryBuilder rightFuzzyDivisionLevel3 (List<String> rightFuzzyDivisionLevel3){
            this.rightFuzzyDivisionLevel3 = rightFuzzyDivisionLevel3;
            return this;
        }

        public QueryBuilder rightFuzzyDivisionLevel3 (String ... rightFuzzyDivisionLevel3){
            this.rightFuzzyDivisionLevel3 = solveNullList(rightFuzzyDivisionLevel3);
            return this;
        }

        public QueryBuilder divisionLevel3(String divisionLevel3){
            setDivisionLevel3(divisionLevel3);
            return this;
        }

        public QueryBuilder divisionLevel3List(String ... divisionLevel3){
            this.divisionLevel3List = solveNullList(divisionLevel3);
            return this;
        }

        public QueryBuilder divisionLevel3List(List<String> divisionLevel3){
            this.divisionLevel3List = divisionLevel3;
            return this;
        }

        public QueryBuilder fetchDivisionLevel3(){
            setFetchFields("fetchFields","divisionLevel3");
            return this;
        }

        public QueryBuilder excludeDivisionLevel3(){
            setFetchFields("excludeFields","divisionLevel3");
            return this;
        }

        public QueryBuilder fuzzyPartsAndSymptom (List<String> fuzzyPartsAndSymptom){
            this.fuzzyPartsAndSymptom = fuzzyPartsAndSymptom;
            return this;
        }

        public QueryBuilder fuzzyPartsAndSymptom (String ... fuzzyPartsAndSymptom){
            this.fuzzyPartsAndSymptom = solveNullList(fuzzyPartsAndSymptom);
            return this;
        }

        public QueryBuilder rightFuzzyPartsAndSymptom (List<String> rightFuzzyPartsAndSymptom){
            this.rightFuzzyPartsAndSymptom = rightFuzzyPartsAndSymptom;
            return this;
        }

        public QueryBuilder rightFuzzyPartsAndSymptom (String ... rightFuzzyPartsAndSymptom){
            this.rightFuzzyPartsAndSymptom = solveNullList(rightFuzzyPartsAndSymptom);
            return this;
        }

        public QueryBuilder partsAndSymptom(String partsAndSymptom){
            setPartsAndSymptom(partsAndSymptom);
            return this;
        }

        public QueryBuilder partsAndSymptomList(String ... partsAndSymptom){
            this.partsAndSymptomList = solveNullList(partsAndSymptom);
            return this;
        }

        public QueryBuilder partsAndSymptomList(List<String> partsAndSymptom){
            this.partsAndSymptomList = partsAndSymptom;
            return this;
        }

        public QueryBuilder fetchPartsAndSymptom(){
            setFetchFields("fetchFields","partsAndSymptom");
            return this;
        }

        public QueryBuilder excludePartsAndSymptom(){
            setFetchFields("excludeFields","partsAndSymptom");
            return this;
        }

        public QueryBuilder fuzzyOfflineDate (List<String> fuzzyOfflineDate){
            this.fuzzyOfflineDate = fuzzyOfflineDate;
            return this;
        }

        public QueryBuilder fuzzyOfflineDate (String ... fuzzyOfflineDate){
            this.fuzzyOfflineDate = solveNullList(fuzzyOfflineDate);
            return this;
        }

        public QueryBuilder rightFuzzyOfflineDate (List<String> rightFuzzyOfflineDate){
            this.rightFuzzyOfflineDate = rightFuzzyOfflineDate;
            return this;
        }

        public QueryBuilder rightFuzzyOfflineDate (String ... rightFuzzyOfflineDate){
            this.rightFuzzyOfflineDate = solveNullList(rightFuzzyOfflineDate);
            return this;
        }

        public QueryBuilder offlineDate(String offlineDate){
            setOfflineDate(offlineDate);
            return this;
        }

        public QueryBuilder offlineDateList(String ... offlineDate){
            this.offlineDateList = solveNullList(offlineDate);
            return this;
        }

        public QueryBuilder offlineDateList(List<String> offlineDate){
            this.offlineDateList = offlineDate;
            return this;
        }

        public QueryBuilder fetchOfflineDate(){
            setFetchFields("fetchFields","offlineDate");
            return this;
        }

        public QueryBuilder excludeOfflineDate(){
            setFetchFields("excludeFields","offlineDate");
            return this;
        }

        public QueryBuilder fuzzySalesDate (List<String> fuzzySalesDate){
            this.fuzzySalesDate = fuzzySalesDate;
            return this;
        }

        public QueryBuilder fuzzySalesDate (String ... fuzzySalesDate){
            this.fuzzySalesDate = solveNullList(fuzzySalesDate);
            return this;
        }

        public QueryBuilder rightFuzzySalesDate (List<String> rightFuzzySalesDate){
            this.rightFuzzySalesDate = rightFuzzySalesDate;
            return this;
        }

        public QueryBuilder rightFuzzySalesDate (String ... rightFuzzySalesDate){
            this.rightFuzzySalesDate = solveNullList(rightFuzzySalesDate);
            return this;
        }

        public QueryBuilder salesDate(String salesDate){
            setSalesDate(salesDate);
            return this;
        }

        public QueryBuilder salesDateList(String ... salesDate){
            this.salesDateList = solveNullList(salesDate);
            return this;
        }

        public QueryBuilder salesDateList(List<String> salesDate){
            this.salesDateList = salesDate;
            return this;
        }

        public QueryBuilder fetchSalesDate(){
            setFetchFields("fetchFields","salesDate");
            return this;
        }

        public QueryBuilder excludeSalesDate(){
            setFetchFields("excludeFields","salesDate");
            return this;
        }

        public QueryBuilder fuzzyFailureDate (List<String> fuzzyFailureDate){
            this.fuzzyFailureDate = fuzzyFailureDate;
            return this;
        }

        public QueryBuilder fuzzyFailureDate (String ... fuzzyFailureDate){
            this.fuzzyFailureDate = solveNullList(fuzzyFailureDate);
            return this;
        }

        public QueryBuilder rightFuzzyFailureDate (List<String> rightFuzzyFailureDate){
            this.rightFuzzyFailureDate = rightFuzzyFailureDate;
            return this;
        }

        public QueryBuilder rightFuzzyFailureDate (String ... rightFuzzyFailureDate){
            this.rightFuzzyFailureDate = solveNullList(rightFuzzyFailureDate);
            return this;
        }

        public QueryBuilder failureDate(String failureDate){
            setFailureDate(failureDate);
            return this;
        }

        public QueryBuilder failureDateList(String ... failureDate){
            this.failureDateList = solveNullList(failureDate);
            return this;
        }

        public QueryBuilder failureDateList(List<String> failureDate){
            this.failureDateList = failureDate;
            return this;
        }

        public QueryBuilder fetchFailureDate(){
            setFetchFields("fetchFields","failureDate");
            return this;
        }

        public QueryBuilder excludeFailureDate(){
            setFetchFields("excludeFields","failureDate");
            return this;
        }

        public QueryBuilder mileageBetWeen(Integer mileageSt,Integer mileageEd){
            this.mileageSt = mileageSt;
            this.mileageEd = mileageEd;
            return this;
        }

        public QueryBuilder mileageGreaterEqThan(Integer mileageSt){
            this.mileageSt = mileageSt;
            return this;
        }
        public QueryBuilder mileageLessEqThan(Integer mileageEd){
            this.mileageEd = mileageEd;
            return this;
        }


        public QueryBuilder mileage(Integer mileage){
            setMileage(mileage);
            return this;
        }

        public QueryBuilder mileageList(Integer ... mileage){
            this.mileageList = solveNullList(mileage);
            return this;
        }

        public QueryBuilder mileageList(List<Integer> mileage){
            this.mileageList = mileage;
            return this;
        }

        public QueryBuilder fetchMileage(){
            setFetchFields("fetchFields","mileage");
            return this;
        }

        public QueryBuilder excludeMileage(){
            setFetchFields("excludeFields","mileage");
            return this;
        }

        public QueryBuilder fuzzyConfirmDate (List<String> fuzzyConfirmDate){
            this.fuzzyConfirmDate = fuzzyConfirmDate;
            return this;
        }

        public QueryBuilder fuzzyConfirmDate (String ... fuzzyConfirmDate){
            this.fuzzyConfirmDate = solveNullList(fuzzyConfirmDate);
            return this;
        }

        public QueryBuilder rightFuzzyConfirmDate (List<String> rightFuzzyConfirmDate){
            this.rightFuzzyConfirmDate = rightFuzzyConfirmDate;
            return this;
        }

        public QueryBuilder rightFuzzyConfirmDate (String ... rightFuzzyConfirmDate){
            this.rightFuzzyConfirmDate = solveNullList(rightFuzzyConfirmDate);
            return this;
        }

        public QueryBuilder confirmDate(String confirmDate){
            setConfirmDate(confirmDate);
            return this;
        }

        public QueryBuilder confirmDateList(String ... confirmDate){
            this.confirmDateList = solveNullList(confirmDate);
            return this;
        }

        public QueryBuilder confirmDateList(List<String> confirmDate){
            this.confirmDateList = confirmDate;
            return this;
        }

        public QueryBuilder fetchConfirmDate(){
            setFetchFields("fetchFields","confirmDate");
            return this;
        }

        public QueryBuilder excludeConfirmDate(){
            setFetchFields("excludeFields","confirmDate");
            return this;
        }

        public QueryBuilder fuzzyWarehousingDate (List<String> fuzzyWarehousingDate){
            this.fuzzyWarehousingDate = fuzzyWarehousingDate;
            return this;
        }

        public QueryBuilder fuzzyWarehousingDate (String ... fuzzyWarehousingDate){
            this.fuzzyWarehousingDate = solveNullList(fuzzyWarehousingDate);
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingDate (List<String> rightFuzzyWarehousingDate){
            this.rightFuzzyWarehousingDate = rightFuzzyWarehousingDate;
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingDate (String ... rightFuzzyWarehousingDate){
            this.rightFuzzyWarehousingDate = solveNullList(rightFuzzyWarehousingDate);
            return this;
        }

        public QueryBuilder warehousingDate(String warehousingDate){
            setWarehousingDate(warehousingDate);
            return this;
        }

        public QueryBuilder warehousingDateList(String ... warehousingDate){
            this.warehousingDateList = solveNullList(warehousingDate);
            return this;
        }

        public QueryBuilder warehousingDateList(List<String> warehousingDate){
            this.warehousingDateList = warehousingDate;
            return this;
        }

        public QueryBuilder fetchWarehousingDate(){
            setFetchFields("fetchFields","warehousingDate");
            return this;
        }

        public QueryBuilder excludeWarehousingDate(){
            setFetchFields("excludeFields","warehousingDate");
            return this;
        }

        public QueryBuilder fuzzyTransportDate (List<String> fuzzyTransportDate){
            this.fuzzyTransportDate = fuzzyTransportDate;
            return this;
        }

        public QueryBuilder fuzzyTransportDate (String ... fuzzyTransportDate){
            this.fuzzyTransportDate = solveNullList(fuzzyTransportDate);
            return this;
        }

        public QueryBuilder rightFuzzyTransportDate (List<String> rightFuzzyTransportDate){
            this.rightFuzzyTransportDate = rightFuzzyTransportDate;
            return this;
        }

        public QueryBuilder rightFuzzyTransportDate (String ... rightFuzzyTransportDate){
            this.rightFuzzyTransportDate = solveNullList(rightFuzzyTransportDate);
            return this;
        }

        public QueryBuilder transportDate(String transportDate){
            setTransportDate(transportDate);
            return this;
        }

        public QueryBuilder transportDateList(String ... transportDate){
            this.transportDateList = solveNullList(transportDate);
            return this;
        }

        public QueryBuilder transportDateList(List<String> transportDate){
            this.transportDateList = transportDate;
            return this;
        }

        public QueryBuilder fetchTransportDate(){
            setFetchFields("fetchFields","transportDate");
            return this;
        }

        public QueryBuilder excludeTransportDate(){
            setFetchFields("excludeFields","transportDate");
            return this;
        }

        public QueryBuilder fuzzyShopArrivalDate (List<String> fuzzyShopArrivalDate){
            this.fuzzyShopArrivalDate = fuzzyShopArrivalDate;
            return this;
        }

        public QueryBuilder fuzzyShopArrivalDate (String ... fuzzyShopArrivalDate){
            this.fuzzyShopArrivalDate = solveNullList(fuzzyShopArrivalDate);
            return this;
        }

        public QueryBuilder rightFuzzyShopArrivalDate (List<String> rightFuzzyShopArrivalDate){
            this.rightFuzzyShopArrivalDate = rightFuzzyShopArrivalDate;
            return this;
        }

        public QueryBuilder rightFuzzyShopArrivalDate (String ... rightFuzzyShopArrivalDate){
            this.rightFuzzyShopArrivalDate = solveNullList(rightFuzzyShopArrivalDate);
            return this;
        }

        public QueryBuilder shopArrivalDate(String shopArrivalDate){
            setShopArrivalDate(shopArrivalDate);
            return this;
        }

        public QueryBuilder shopArrivalDateList(String ... shopArrivalDate){
            this.shopArrivalDateList = solveNullList(shopArrivalDate);
            return this;
        }

        public QueryBuilder shopArrivalDateList(List<String> shopArrivalDate){
            this.shopArrivalDateList = shopArrivalDate;
            return this;
        }

        public QueryBuilder fetchShopArrivalDate(){
            setFetchFields("fetchFields","shopArrivalDate");
            return this;
        }

        public QueryBuilder excludeShopArrivalDate(){
            setFetchFields("excludeFields","shopArrivalDate");
            return this;
        }

        public QueryBuilder salesFailureTimeBetWeen(Integer salesFailureTimeSt,Integer salesFailureTimeEd){
            this.salesFailureTimeSt = salesFailureTimeSt;
            this.salesFailureTimeEd = salesFailureTimeEd;
            return this;
        }

        public QueryBuilder salesFailureTimeGreaterEqThan(Integer salesFailureTimeSt){
            this.salesFailureTimeSt = salesFailureTimeSt;
            return this;
        }
        public QueryBuilder salesFailureTimeLessEqThan(Integer salesFailureTimeEd){
            this.salesFailureTimeEd = salesFailureTimeEd;
            return this;
        }


        public QueryBuilder salesFailureTime(Integer salesFailureTime){
            setSalesFailureTime(salesFailureTime);
            return this;
        }

        public QueryBuilder salesFailureTimeList(Integer ... salesFailureTime){
            this.salesFailureTimeList = solveNullList(salesFailureTime);
            return this;
        }

        public QueryBuilder salesFailureTimeList(List<Integer> salesFailureTime){
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

        public QueryBuilder fuzzyFailureDesc (List<String> fuzzyFailureDesc){
            this.fuzzyFailureDesc = fuzzyFailureDesc;
            return this;
        }

        public QueryBuilder fuzzyFailureDesc (String ... fuzzyFailureDesc){
            this.fuzzyFailureDesc = solveNullList(fuzzyFailureDesc);
            return this;
        }

        public QueryBuilder rightFuzzyFailureDesc (List<String> rightFuzzyFailureDesc){
            this.rightFuzzyFailureDesc = rightFuzzyFailureDesc;
            return this;
        }

        public QueryBuilder rightFuzzyFailureDesc (String ... rightFuzzyFailureDesc){
            this.rightFuzzyFailureDesc = solveNullList(rightFuzzyFailureDesc);
            return this;
        }

        public QueryBuilder failureDesc(String failureDesc){
            setFailureDesc(failureDesc);
            return this;
        }

        public QueryBuilder failureDescList(String ... failureDesc){
            this.failureDescList = solveNullList(failureDesc);
            return this;
        }

        public QueryBuilder failureDescList(List<String> failureDesc){
            this.failureDescList = failureDesc;
            return this;
        }

        public QueryBuilder fetchFailureDesc(){
            setFetchFields("fetchFields","failureDesc");
            return this;
        }

        public QueryBuilder excludeFailureDesc(){
            setFetchFields("excludeFields","failureDesc");
            return this;
        }

        public QueryBuilder fuzzyDiagnosticResult (List<String> fuzzyDiagnosticResult){
            this.fuzzyDiagnosticResult = fuzzyDiagnosticResult;
            return this;
        }

        public QueryBuilder fuzzyDiagnosticResult (String ... fuzzyDiagnosticResult){
            this.fuzzyDiagnosticResult = solveNullList(fuzzyDiagnosticResult);
            return this;
        }

        public QueryBuilder rightFuzzyDiagnosticResult (List<String> rightFuzzyDiagnosticResult){
            this.rightFuzzyDiagnosticResult = rightFuzzyDiagnosticResult;
            return this;
        }

        public QueryBuilder rightFuzzyDiagnosticResult (String ... rightFuzzyDiagnosticResult){
            this.rightFuzzyDiagnosticResult = solveNullList(rightFuzzyDiagnosticResult);
            return this;
        }

        public QueryBuilder diagnosticResult(String diagnosticResult){
            setDiagnosticResult(diagnosticResult);
            return this;
        }

        public QueryBuilder diagnosticResultList(String ... diagnosticResult){
            this.diagnosticResultList = solveNullList(diagnosticResult);
            return this;
        }

        public QueryBuilder diagnosticResultList(List<String> diagnosticResult){
            this.diagnosticResultList = diagnosticResult;
            return this;
        }

        public QueryBuilder fetchDiagnosticResult(){
            setFetchFields("fetchFields","diagnosticResult");
            return this;
        }

        public QueryBuilder excludeDiagnosticResult(){
            setFetchFields("excludeFields","diagnosticResult");
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

        public QueryBuilder materialCostBetWeen(java.math.BigDecimal materialCostSt,java.math.BigDecimal materialCostEd){
            this.materialCostSt = materialCostSt;
            this.materialCostEd = materialCostEd;
            return this;
        }

        public QueryBuilder materialCostGreaterEqThan(java.math.BigDecimal materialCostSt){
            this.materialCostSt = materialCostSt;
            return this;
        }
        public QueryBuilder materialCostLessEqThan(java.math.BigDecimal materialCostEd){
            this.materialCostEd = materialCostEd;
            return this;
        }


        public QueryBuilder materialCost(java.math.BigDecimal materialCost){
            setMaterialCost(materialCost);
            return this;
        }

        public QueryBuilder materialCostList(java.math.BigDecimal ... materialCost){
            this.materialCostList = solveNullList(materialCost);
            return this;
        }

        public QueryBuilder materialCostList(List<java.math.BigDecimal> materialCost){
            this.materialCostList = materialCost;
            return this;
        }

        public QueryBuilder fetchMaterialCost(){
            setFetchFields("fetchFields","materialCost");
            return this;
        }

        public QueryBuilder excludeMaterialCost(){
            setFetchFields("excludeFields","materialCost");
            return this;
        }

        public QueryBuilder materialManagementCostBetWeen(java.math.BigDecimal materialManagementCostSt,java.math.BigDecimal materialManagementCostEd){
            this.materialManagementCostSt = materialManagementCostSt;
            this.materialManagementCostEd = materialManagementCostEd;
            return this;
        }

        public QueryBuilder materialManagementCostGreaterEqThan(java.math.BigDecimal materialManagementCostSt){
            this.materialManagementCostSt = materialManagementCostSt;
            return this;
        }
        public QueryBuilder materialManagementCostLessEqThan(java.math.BigDecimal materialManagementCostEd){
            this.materialManagementCostEd = materialManagementCostEd;
            return this;
        }


        public QueryBuilder materialManagementCost(java.math.BigDecimal materialManagementCost){
            setMaterialManagementCost(materialManagementCost);
            return this;
        }

        public QueryBuilder materialManagementCostList(java.math.BigDecimal ... materialManagementCost){
            this.materialManagementCostList = solveNullList(materialManagementCost);
            return this;
        }

        public QueryBuilder materialManagementCostList(List<java.math.BigDecimal> materialManagementCost){
            this.materialManagementCostList = materialManagementCost;
            return this;
        }

        public QueryBuilder fetchMaterialManagementCost(){
            setFetchFields("fetchFields","materialManagementCost");
            return this;
        }

        public QueryBuilder excludeMaterialManagementCost(){
            setFetchFields("excludeFields","materialManagementCost");
            return this;
        }

        public QueryBuilder goOutCostBetWeen(java.math.BigDecimal goOutCostSt,java.math.BigDecimal goOutCostEd){
            this.goOutCostSt = goOutCostSt;
            this.goOutCostEd = goOutCostEd;
            return this;
        }

        public QueryBuilder goOutCostGreaterEqThan(java.math.BigDecimal goOutCostSt){
            this.goOutCostSt = goOutCostSt;
            return this;
        }
        public QueryBuilder goOutCostLessEqThan(java.math.BigDecimal goOutCostEd){
            this.goOutCostEd = goOutCostEd;
            return this;
        }


        public QueryBuilder goOutCost(java.math.BigDecimal goOutCost){
            setGoOutCost(goOutCost);
            return this;
        }

        public QueryBuilder goOutCostList(java.math.BigDecimal ... goOutCost){
            this.goOutCostList = solveNullList(goOutCost);
            return this;
        }

        public QueryBuilder goOutCostList(List<java.math.BigDecimal> goOutCost){
            this.goOutCostList = goOutCost;
            return this;
        }

        public QueryBuilder fetchGoOutCost(){
            setFetchFields("fetchFields","goOutCost");
            return this;
        }

        public QueryBuilder excludeGoOutCost(){
            setFetchFields("excludeFields","goOutCost");
            return this;
        }

        public QueryBuilder maintainingCostBetWeen(java.math.BigDecimal maintainingCostSt,java.math.BigDecimal maintainingCostEd){
            this.maintainingCostSt = maintainingCostSt;
            this.maintainingCostEd = maintainingCostEd;
            return this;
        }

        public QueryBuilder maintainingCostGreaterEqThan(java.math.BigDecimal maintainingCostSt){
            this.maintainingCostSt = maintainingCostSt;
            return this;
        }
        public QueryBuilder maintainingCostLessEqThan(java.math.BigDecimal maintainingCostEd){
            this.maintainingCostEd = maintainingCostEd;
            return this;
        }


        public QueryBuilder maintainingCost(java.math.BigDecimal maintainingCost){
            setMaintainingCost(maintainingCost);
            return this;
        }

        public QueryBuilder maintainingCostList(java.math.BigDecimal ... maintainingCost){
            this.maintainingCostList = solveNullList(maintainingCost);
            return this;
        }

        public QueryBuilder maintainingCostList(List<java.math.BigDecimal> maintainingCost){
            this.maintainingCostList = maintainingCost;
            return this;
        }

        public QueryBuilder fetchMaintainingCost(){
            setFetchFields("fetchFields","maintainingCost");
            return this;
        }

        public QueryBuilder excludeMaintainingCost(){
            setFetchFields("excludeFields","maintainingCost");
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

        public QueryBuilder fuzzyNewPartsBond (List<String> fuzzyNewPartsBond){
            this.fuzzyNewPartsBond = fuzzyNewPartsBond;
            return this;
        }

        public QueryBuilder fuzzyNewPartsBond (String ... fuzzyNewPartsBond){
            this.fuzzyNewPartsBond = solveNullList(fuzzyNewPartsBond);
            return this;
        }

        public QueryBuilder rightFuzzyNewPartsBond (List<String> rightFuzzyNewPartsBond){
            this.rightFuzzyNewPartsBond = rightFuzzyNewPartsBond;
            return this;
        }

        public QueryBuilder rightFuzzyNewPartsBond (String ... rightFuzzyNewPartsBond){
            this.rightFuzzyNewPartsBond = solveNullList(rightFuzzyNewPartsBond);
            return this;
        }

        public QueryBuilder newPartsBond(String newPartsBond){
            setNewPartsBond(newPartsBond);
            return this;
        }

        public QueryBuilder newPartsBondList(String ... newPartsBond){
            this.newPartsBondList = solveNullList(newPartsBond);
            return this;
        }

        public QueryBuilder newPartsBondList(List<String> newPartsBond){
            this.newPartsBondList = newPartsBond;
            return this;
        }

        public QueryBuilder fetchNewPartsBond(){
            setFetchFields("fetchFields","newPartsBond");
            return this;
        }

        public QueryBuilder excludeNewPartsBond(){
            setFetchFields("excludeFields","newPartsBond");
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

        public QueryBuilder fuzzyEgtypeCode (List<String> fuzzyEgtypeCode){
            this.fuzzyEgtypeCode = fuzzyEgtypeCode;
            return this;
        }

        public QueryBuilder fuzzyEgtypeCode (String ... fuzzyEgtypeCode){
            this.fuzzyEgtypeCode = solveNullList(fuzzyEgtypeCode);
            return this;
        }

        public QueryBuilder rightFuzzyEgtypeCode (List<String> rightFuzzyEgtypeCode){
            this.rightFuzzyEgtypeCode = rightFuzzyEgtypeCode;
            return this;
        }

        public QueryBuilder rightFuzzyEgtypeCode (String ... rightFuzzyEgtypeCode){
            this.rightFuzzyEgtypeCode = solveNullList(rightFuzzyEgtypeCode);
            return this;
        }

        public QueryBuilder egtypeCode(String egtypeCode){
            setEgtypeCode(egtypeCode);
            return this;
        }

        public QueryBuilder egtypeCodeList(String ... egtypeCode){
            this.egtypeCodeList = solveNullList(egtypeCode);
            return this;
        }

        public QueryBuilder egtypeCodeList(List<String> egtypeCode){
            this.egtypeCodeList = egtypeCode;
            return this;
        }

        public QueryBuilder fetchEgtypeCode(){
            setFetchFields("fetchFields","egtypeCode");
            return this;
        }

        public QueryBuilder excludeEgtypeCode(){
            setFetchFields("excludeFields","egtypeCode");
            return this;
        }

        public QueryBuilder fuzzyTransmissionCode (List<String> fuzzyTransmissionCode){
            this.fuzzyTransmissionCode = fuzzyTransmissionCode;
            return this;
        }

        public QueryBuilder fuzzyTransmissionCode (String ... fuzzyTransmissionCode){
            this.fuzzyTransmissionCode = solveNullList(fuzzyTransmissionCode);
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionCode (List<String> rightFuzzyTransmissionCode){
            this.rightFuzzyTransmissionCode = rightFuzzyTransmissionCode;
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionCode (String ... rightFuzzyTransmissionCode){
            this.rightFuzzyTransmissionCode = solveNullList(rightFuzzyTransmissionCode);
            return this;
        }

        public QueryBuilder transmissionCode(String transmissionCode){
            setTransmissionCode(transmissionCode);
            return this;
        }

        public QueryBuilder transmissionCodeList(String ... transmissionCode){
            this.transmissionCodeList = solveNullList(transmissionCode);
            return this;
        }

        public QueryBuilder transmissionCodeList(List<String> transmissionCode){
            this.transmissionCodeList = transmissionCode;
            return this;
        }

        public QueryBuilder fetchTransmissionCode(){
            setFetchFields("fetchFields","transmissionCode");
            return this;
        }

        public QueryBuilder excludeTransmissionCode(){
            setFetchFields("excludeFields","transmissionCode");
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

        public QueryBuilder fuzzyEngType (List<String> fuzzyEngType){
            this.fuzzyEngType = fuzzyEngType;
            return this;
        }

        public QueryBuilder fuzzyEngType (String ... fuzzyEngType){
            this.fuzzyEngType = solveNullList(fuzzyEngType);
            return this;
        }

        public QueryBuilder rightFuzzyEngType (List<String> rightFuzzyEngType){
            this.rightFuzzyEngType = rightFuzzyEngType;
            return this;
        }

        public QueryBuilder rightFuzzyEngType (String ... rightFuzzyEngType){
            this.rightFuzzyEngType = solveNullList(rightFuzzyEngType);
            return this;
        }

        public QueryBuilder engType(String engType){
            setEngType(engType);
            return this;
        }

        public QueryBuilder engTypeList(String ... engType){
            this.engTypeList = solveNullList(engType);
            return this;
        }

        public QueryBuilder engTypeList(List<String> engType){
            this.engTypeList = engType;
            return this;
        }

        public QueryBuilder fetchEngType(){
            setFetchFields("fetchFields","engType");
            return this;
        }

        public QueryBuilder excludeEngType(){
            setFetchFields("excludeFields","engType");
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

        public QueryBuilder fuzzyTranTypeDetail (List<String> fuzzyTranTypeDetail){
            this.fuzzyTranTypeDetail = fuzzyTranTypeDetail;
            return this;
        }

        public QueryBuilder fuzzyTranTypeDetail (String ... fuzzyTranTypeDetail){
            this.fuzzyTranTypeDetail = solveNullList(fuzzyTranTypeDetail);
            return this;
        }

        public QueryBuilder rightFuzzyTranTypeDetail (List<String> rightFuzzyTranTypeDetail){
            this.rightFuzzyTranTypeDetail = rightFuzzyTranTypeDetail;
            return this;
        }

        public QueryBuilder rightFuzzyTranTypeDetail (String ... rightFuzzyTranTypeDetail){
            this.rightFuzzyTranTypeDetail = solveNullList(rightFuzzyTranTypeDetail);
            return this;
        }

        public QueryBuilder tranTypeDetail(String tranTypeDetail){
            setTranTypeDetail(tranTypeDetail);
            return this;
        }

        public QueryBuilder tranTypeDetailList(String ... tranTypeDetail){
            this.tranTypeDetailList = solveNullList(tranTypeDetail);
            return this;
        }

        public QueryBuilder tranTypeDetailList(List<String> tranTypeDetail){
            this.tranTypeDetailList = tranTypeDetail;
            return this;
        }

        public QueryBuilder fetchTranTypeDetail(){
            setFetchFields("fetchFields","tranTypeDetail");
            return this;
        }

        public QueryBuilder excludeTranTypeDetail(){
            setFetchFields("excludeFields","tranTypeDetail");
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

        public QueryBuilder fuzzyProductionRawDescription (List<String> fuzzyProductionRawDescription){
            this.fuzzyProductionRawDescription = fuzzyProductionRawDescription;
            return this;
        }

        public QueryBuilder fuzzyProductionRawDescription (String ... fuzzyProductionRawDescription){
            this.fuzzyProductionRawDescription = solveNullList(fuzzyProductionRawDescription);
            return this;
        }

        public QueryBuilder rightFuzzyProductionRawDescription (List<String> rightFuzzyProductionRawDescription){
            this.rightFuzzyProductionRawDescription = rightFuzzyProductionRawDescription;
            return this;
        }

        public QueryBuilder rightFuzzyProductionRawDescription (String ... rightFuzzyProductionRawDescription){
            this.rightFuzzyProductionRawDescription = solveNullList(rightFuzzyProductionRawDescription);
            return this;
        }

        public QueryBuilder productionRawDescription(String productionRawDescription){
            setProductionRawDescription(productionRawDescription);
            return this;
        }

        public QueryBuilder productionRawDescriptionList(String ... productionRawDescription){
            this.productionRawDescriptionList = solveNullList(productionRawDescription);
            return this;
        }

        public QueryBuilder productionRawDescriptionList(List<String> productionRawDescription){
            this.productionRawDescriptionList = productionRawDescription;
            return this;
        }

        public QueryBuilder fetchProductionRawDescription(){
            setFetchFields("fetchFields","productionRawDescription");
            return this;
        }

        public QueryBuilder excludeProductionRawDescription(){
            setFetchFields("excludeFields","productionRawDescription");
            return this;
        }

        public QueryBuilder fuzzyPDI (List<String> fuzzyPDI){
            this.fuzzyPDI = fuzzyPDI;
            return this;
        }

        public QueryBuilder fuzzyPDI (String ... fuzzyPDI){
            this.fuzzyPDI = solveNullList(fuzzyPDI);
            return this;
        }

        public QueryBuilder rightFuzzyPDI (List<String> rightFuzzyPDI){
            this.rightFuzzyPDI = rightFuzzyPDI;
            return this;
        }

        public QueryBuilder rightFuzzyPDI (String ... rightFuzzyPDI){
            this.rightFuzzyPDI = solveNullList(rightFuzzyPDI);
            return this;
        }

        public QueryBuilder PDI(String PDI){
            setPDI(PDI);
            return this;
        }

        public QueryBuilder PDIList(String ... PDI){
            this.PDIList = solveNullList(PDI);
            return this;
        }

        public QueryBuilder PDIList(List<String> PDI){
            this.PDIList = PDI;
            return this;
        }

        public QueryBuilder fetchPDI(){
            setFetchFields("fetchFields","PDI");
            return this;
        }

        public QueryBuilder excludePDI(){
            setFetchFields("excludeFields","PDI");
            return this;
        }

        public QueryBuilder offlineFailureTimeBetWeen(Integer offlineFailureTimeSt,Integer offlineFailureTimeEd){
            this.offlineFailureTimeSt = offlineFailureTimeSt;
            this.offlineFailureTimeEd = offlineFailureTimeEd;
            return this;
        }

        public QueryBuilder offlineFailureTimeGreaterEqThan(Integer offlineFailureTimeSt){
            this.offlineFailureTimeSt = offlineFailureTimeSt;
            return this;
        }
        public QueryBuilder offlineFailureTimeLessEqThan(Integer offlineFailureTimeEd){
            this.offlineFailureTimeEd = offlineFailureTimeEd;
            return this;
        }


        public QueryBuilder offlineFailureTime(Integer offlineFailureTime){
            setOfflineFailureTime(offlineFailureTime);
            return this;
        }

        public QueryBuilder offlineFailureTimeList(Integer ... offlineFailureTime){
            this.offlineFailureTimeList = solveNullList(offlineFailureTime);
            return this;
        }

        public QueryBuilder offlineFailureTimeList(List<Integer> offlineFailureTime){
            this.offlineFailureTimeList = offlineFailureTime;
            return this;
        }

        public QueryBuilder fetchOfflineFailureTime(){
            setFetchFields("fetchFields","offlineFailureTime");
            return this;
        }

        public QueryBuilder excludeOfflineFailureTime(){
            setFetchFields("excludeFields","offlineFailureTime");
            return this;
        }

        public QueryBuilder fuzzyTransmissionComfirmTime (List<String> fuzzyTransmissionComfirmTime){
            this.fuzzyTransmissionComfirmTime = fuzzyTransmissionComfirmTime;
            return this;
        }

        public QueryBuilder fuzzyTransmissionComfirmTime (String ... fuzzyTransmissionComfirmTime){
            this.fuzzyTransmissionComfirmTime = solveNullList(fuzzyTransmissionComfirmTime);
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionComfirmTime (List<String> rightFuzzyTransmissionComfirmTime){
            this.rightFuzzyTransmissionComfirmTime = rightFuzzyTransmissionComfirmTime;
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionComfirmTime (String ... rightFuzzyTransmissionComfirmTime){
            this.rightFuzzyTransmissionComfirmTime = solveNullList(rightFuzzyTransmissionComfirmTime);
            return this;
        }

        public QueryBuilder transmissionComfirmTime(String transmissionComfirmTime){
            setTransmissionComfirmTime(transmissionComfirmTime);
            return this;
        }

        public QueryBuilder transmissionComfirmTimeList(String ... transmissionComfirmTime){
            this.transmissionComfirmTimeList = solveNullList(transmissionComfirmTime);
            return this;
        }

        public QueryBuilder transmissionComfirmTimeList(List<String> transmissionComfirmTime){
            this.transmissionComfirmTimeList = transmissionComfirmTime;
            return this;
        }

        public QueryBuilder fetchTransmissionComfirmTime(){
            setFetchFields("fetchFields","transmissionComfirmTime");
            return this;
        }

        public QueryBuilder excludeTransmissionComfirmTime(){
            setFetchFields("excludeFields","transmissionComfirmTime");
            return this;
        }

        public QueryBuilder fuzzyEngOrTran (List<String> fuzzyEngOrTran){
            this.fuzzyEngOrTran = fuzzyEngOrTran;
            return this;
        }

        public QueryBuilder fuzzyEngOrTran (String ... fuzzyEngOrTran){
            this.fuzzyEngOrTran = solveNullList(fuzzyEngOrTran);
            return this;
        }

        public QueryBuilder rightFuzzyEngOrTran (List<String> rightFuzzyEngOrTran){
            this.rightFuzzyEngOrTran = rightFuzzyEngOrTran;
            return this;
        }

        public QueryBuilder rightFuzzyEngOrTran (String ... rightFuzzyEngOrTran){
            this.rightFuzzyEngOrTran = solveNullList(rightFuzzyEngOrTran);
            return this;
        }

        public QueryBuilder engOrTran(String engOrTran){
            setEngOrTran(engOrTran);
            return this;
        }

        public QueryBuilder engOrTranList(String ... engOrTran){
            this.engOrTranList = solveNullList(engOrTran);
            return this;
        }

        public QueryBuilder engOrTranList(List<String> engOrTran){
            this.engOrTranList = engOrTran;
            return this;
        }

        public QueryBuilder fetchEngOrTran(){
            setFetchFields("fetchFields","engOrTran");
            return this;
        }

        public QueryBuilder excludeEngOrTran(){
            setFetchFields("excludeFields","engOrTran");
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

        public QueryBuilder fuzzyTransmissionProductionData (List<String> fuzzyTransmissionProductionData){
            this.fuzzyTransmissionProductionData = fuzzyTransmissionProductionData;
            return this;
        }

        public QueryBuilder fuzzyTransmissionProductionData (String ... fuzzyTransmissionProductionData){
            this.fuzzyTransmissionProductionData = solveNullList(fuzzyTransmissionProductionData);
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionProductionData (List<String> rightFuzzyTransmissionProductionData){
            this.rightFuzzyTransmissionProductionData = rightFuzzyTransmissionProductionData;
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionProductionData (String ... rightFuzzyTransmissionProductionData){
            this.rightFuzzyTransmissionProductionData = solveNullList(rightFuzzyTransmissionProductionData);
            return this;
        }

        public QueryBuilder transmissionProductionData(String transmissionProductionData){
            setTransmissionProductionData(transmissionProductionData);
            return this;
        }

        public QueryBuilder transmissionProductionDataList(String ... transmissionProductionData){
            this.transmissionProductionDataList = solveNullList(transmissionProductionData);
            return this;
        }

        public QueryBuilder transmissionProductionDataList(List<String> transmissionProductionData){
            this.transmissionProductionDataList = transmissionProductionData;
            return this;
        }

        public QueryBuilder fetchTransmissionProductionData(){
            setFetchFields("fetchFields","transmissionProductionData");
            return this;
        }

        public QueryBuilder excludeTransmissionProductionData(){
            setFetchFields("excludeFields","transmissionProductionData");
            return this;
        }

        public QueryBuilder fuzzyFailureYear (List<String> fuzzyFailureYear){
            this.fuzzyFailureYear = fuzzyFailureYear;
            return this;
        }

        public QueryBuilder fuzzyFailureYear (String ... fuzzyFailureYear){
            this.fuzzyFailureYear = solveNullList(fuzzyFailureYear);
            return this;
        }

        public QueryBuilder rightFuzzyFailureYear (List<String> rightFuzzyFailureYear){
            this.rightFuzzyFailureYear = rightFuzzyFailureYear;
            return this;
        }

        public QueryBuilder rightFuzzyFailureYear (String ... rightFuzzyFailureYear){
            this.rightFuzzyFailureYear = solveNullList(rightFuzzyFailureYear);
            return this;
        }

        public QueryBuilder failureYear(String failureYear){
            setFailureYear(failureYear);
            return this;
        }

        public QueryBuilder failureYearList(String ... failureYear){
            this.failureYearList = solveNullList(failureYear);
            return this;
        }

        public QueryBuilder failureYearList(List<String> failureYear){
            this.failureYearList = failureYear;
            return this;
        }

        public QueryBuilder fetchFailureYear(){
            setFetchFields("fetchFields","failureYear");
            return this;
        }

        public QueryBuilder excludeFailureYear(){
            setFetchFields("excludeFields","failureYear");
            return this;
        }

        public QueryBuilder fuzzyFailureMonth (List<String> fuzzyFailureMonth){
            this.fuzzyFailureMonth = fuzzyFailureMonth;
            return this;
        }

        public QueryBuilder fuzzyFailureMonth (String ... fuzzyFailureMonth){
            this.fuzzyFailureMonth = solveNullList(fuzzyFailureMonth);
            return this;
        }

        public QueryBuilder rightFuzzyFailureMonth (List<String> rightFuzzyFailureMonth){
            this.rightFuzzyFailureMonth = rightFuzzyFailureMonth;
            return this;
        }

        public QueryBuilder rightFuzzyFailureMonth (String ... rightFuzzyFailureMonth){
            this.rightFuzzyFailureMonth = solveNullList(rightFuzzyFailureMonth);
            return this;
        }

        public QueryBuilder failureMonth(String failureMonth){
            setFailureMonth(failureMonth);
            return this;
        }

        public QueryBuilder failureMonthList(String ... failureMonth){
            this.failureMonthList = solveNullList(failureMonth);
            return this;
        }

        public QueryBuilder failureMonthList(List<String> failureMonth){
            this.failureMonthList = failureMonth;
            return this;
        }

        public QueryBuilder fetchFailureMonth(){
            setFetchFields("fetchFields","failureMonth");
            return this;
        }

        public QueryBuilder excludeFailureMonth(){
            setFetchFields("excludeFields","failureMonth");
            return this;
        }

        public QueryBuilder fuzzyTransmissionShortCode (List<String> fuzzyTransmissionShortCode){
            this.fuzzyTransmissionShortCode = fuzzyTransmissionShortCode;
            return this;
        }

        public QueryBuilder fuzzyTransmissionShortCode (String ... fuzzyTransmissionShortCode){
            this.fuzzyTransmissionShortCode = solveNullList(fuzzyTransmissionShortCode);
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionShortCode (List<String> rightFuzzyTransmissionShortCode){
            this.rightFuzzyTransmissionShortCode = rightFuzzyTransmissionShortCode;
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionShortCode (String ... rightFuzzyTransmissionShortCode){
            this.rightFuzzyTransmissionShortCode = solveNullList(rightFuzzyTransmissionShortCode);
            return this;
        }

        public QueryBuilder transmissionShortCode(String transmissionShortCode){
            setTransmissionShortCode(transmissionShortCode);
            return this;
        }

        public QueryBuilder transmissionShortCodeList(String ... transmissionShortCode){
            this.transmissionShortCodeList = solveNullList(transmissionShortCode);
            return this;
        }

        public QueryBuilder transmissionShortCodeList(List<String> transmissionShortCode){
            this.transmissionShortCodeList = transmissionShortCode;
            return this;
        }

        public QueryBuilder fetchTransmissionShortCode(){
            setFetchFields("fetchFields","transmissionShortCode");
            return this;
        }

        public QueryBuilder excludeTransmissionShortCode(){
            setFetchFields("excludeFields","transmissionShortCode");
            return this;
        }

        public QueryBuilder fuzzyMileageDistribution (List<String> fuzzyMileageDistribution){
            this.fuzzyMileageDistribution = fuzzyMileageDistribution;
            return this;
        }

        public QueryBuilder fuzzyMileageDistribution (String ... fuzzyMileageDistribution){
            this.fuzzyMileageDistribution = solveNullList(fuzzyMileageDistribution);
            return this;
        }

        public QueryBuilder rightFuzzyMileageDistribution (List<String> rightFuzzyMileageDistribution){
            this.rightFuzzyMileageDistribution = rightFuzzyMileageDistribution;
            return this;
        }

        public QueryBuilder rightFuzzyMileageDistribution (String ... rightFuzzyMileageDistribution){
            this.rightFuzzyMileageDistribution = solveNullList(rightFuzzyMileageDistribution);
            return this;
        }

        public QueryBuilder mileageDistribution(String mileageDistribution){
            setMileageDistribution(mileageDistribution);
            return this;
        }

        public QueryBuilder mileageDistributionList(String ... mileageDistribution){
            this.mileageDistributionList = solveNullList(mileageDistribution);
            return this;
        }

        public QueryBuilder mileageDistributionList(List<String> mileageDistribution){
            this.mileageDistributionList = mileageDistribution;
            return this;
        }

        public QueryBuilder fetchMileageDistribution(){
            setFetchFields("fetchFields","mileageDistribution");
            return this;
        }

        public QueryBuilder excludeMileageDistribution(){
            setFetchFields("excludeFields","mileageDistribution");
            return this;
        }

        public QueryBuilder fuzzyTrackBeginer (List<String> fuzzyTrackBeginer){
            this.fuzzyTrackBeginer = fuzzyTrackBeginer;
            return this;
        }

        public QueryBuilder fuzzyTrackBeginer (String ... fuzzyTrackBeginer){
            this.fuzzyTrackBeginer = solveNullList(fuzzyTrackBeginer);
            return this;
        }

        public QueryBuilder rightFuzzyTrackBeginer (List<String> rightFuzzyTrackBeginer){
            this.rightFuzzyTrackBeginer = rightFuzzyTrackBeginer;
            return this;
        }

        public QueryBuilder rightFuzzyTrackBeginer (String ... rightFuzzyTrackBeginer){
            this.rightFuzzyTrackBeginer = solveNullList(rightFuzzyTrackBeginer);
            return this;
        }

        public QueryBuilder trackBeginer(String trackBeginer){
            setTrackBeginer(trackBeginer);
            return this;
        }

        public QueryBuilder trackBeginerList(String ... trackBeginer){
            this.trackBeginerList = solveNullList(trackBeginer);
            return this;
        }

        public QueryBuilder trackBeginerList(List<String> trackBeginer){
            this.trackBeginerList = trackBeginer;
            return this;
        }

        public QueryBuilder fetchTrackBeginer(){
            setFetchFields("fetchFields","trackBeginer");
            return this;
        }

        public QueryBuilder excludeTrackBeginer(){
            setFetchFields("excludeFields","trackBeginer");
            return this;
        }

        public QueryBuilder fuzzyTrackBeginTime (List<String> fuzzyTrackBeginTime){
            this.fuzzyTrackBeginTime = fuzzyTrackBeginTime;
            return this;
        }

        public QueryBuilder fuzzyTrackBeginTime (String ... fuzzyTrackBeginTime){
            this.fuzzyTrackBeginTime = solveNullList(fuzzyTrackBeginTime);
            return this;
        }

        public QueryBuilder rightFuzzyTrackBeginTime (List<String> rightFuzzyTrackBeginTime){
            this.rightFuzzyTrackBeginTime = rightFuzzyTrackBeginTime;
            return this;
        }

        public QueryBuilder rightFuzzyTrackBeginTime (String ... rightFuzzyTrackBeginTime){
            this.rightFuzzyTrackBeginTime = solveNullList(rightFuzzyTrackBeginTime);
            return this;
        }

        public QueryBuilder trackBeginTime(String trackBeginTime){
            setTrackBeginTime(trackBeginTime);
            return this;
        }

        public QueryBuilder trackBeginTimeList(String ... trackBeginTime){
            this.trackBeginTimeList = solveNullList(trackBeginTime);
            return this;
        }

        public QueryBuilder trackBeginTimeList(List<String> trackBeginTime){
            this.trackBeginTimeList = trackBeginTime;
            return this;
        }

        public QueryBuilder fetchTrackBeginTime(){
            setFetchFields("fetchFields","trackBeginTime");
            return this;
        }

        public QueryBuilder excludeTrackBeginTime(){
            setFetchFields("excludeFields","trackBeginTime");
            return this;
        }

        public QueryBuilder fuzzyDeliveryPerson (List<String> fuzzyDeliveryPerson){
            this.fuzzyDeliveryPerson = fuzzyDeliveryPerson;
            return this;
        }

        public QueryBuilder fuzzyDeliveryPerson (String ... fuzzyDeliveryPerson){
            this.fuzzyDeliveryPerson = solveNullList(fuzzyDeliveryPerson);
            return this;
        }

        public QueryBuilder rightFuzzyDeliveryPerson (List<String> rightFuzzyDeliveryPerson){
            this.rightFuzzyDeliveryPerson = rightFuzzyDeliveryPerson;
            return this;
        }

        public QueryBuilder rightFuzzyDeliveryPerson (String ... rightFuzzyDeliveryPerson){
            this.rightFuzzyDeliveryPerson = solveNullList(rightFuzzyDeliveryPerson);
            return this;
        }

        public QueryBuilder deliveryPerson(String deliveryPerson){
            setDeliveryPerson(deliveryPerson);
            return this;
        }

        public QueryBuilder deliveryPersonList(String ... deliveryPerson){
            this.deliveryPersonList = solveNullList(deliveryPerson);
            return this;
        }

        public QueryBuilder deliveryPersonList(List<String> deliveryPerson){
            this.deliveryPersonList = deliveryPerson;
            return this;
        }

        public QueryBuilder fetchDeliveryPerson(){
            setFetchFields("fetchFields","deliveryPerson");
            return this;
        }

        public QueryBuilder excludeDeliveryPerson(){
            setFetchFields("excludeFields","deliveryPerson");
            return this;
        }

        public QueryBuilder fuzzyDeliveryDeadline (List<String> fuzzyDeliveryDeadline){
            this.fuzzyDeliveryDeadline = fuzzyDeliveryDeadline;
            return this;
        }

        public QueryBuilder fuzzyDeliveryDeadline (String ... fuzzyDeliveryDeadline){
            this.fuzzyDeliveryDeadline = solveNullList(fuzzyDeliveryDeadline);
            return this;
        }

        public QueryBuilder rightFuzzyDeliveryDeadline (List<String> rightFuzzyDeliveryDeadline){
            this.rightFuzzyDeliveryDeadline = rightFuzzyDeliveryDeadline;
            return this;
        }

        public QueryBuilder rightFuzzyDeliveryDeadline (String ... rightFuzzyDeliveryDeadline){
            this.rightFuzzyDeliveryDeadline = solveNullList(rightFuzzyDeliveryDeadline);
            return this;
        }

        public QueryBuilder deliveryDeadline(String deliveryDeadline){
            setDeliveryDeadline(deliveryDeadline);
            return this;
        }

        public QueryBuilder deliveryDeadlineList(String ... deliveryDeadline){
            this.deliveryDeadlineList = solveNullList(deliveryDeadline);
            return this;
        }

        public QueryBuilder deliveryDeadlineList(List<String> deliveryDeadline){
            this.deliveryDeadlineList = deliveryDeadline;
            return this;
        }

        public QueryBuilder fetchDeliveryDeadline(){
            setFetchFields("fetchFields","deliveryDeadline");
            return this;
        }

        public QueryBuilder excludeDeliveryDeadline(){
            setFetchFields("excludeFields","deliveryDeadline");
            return this;
        }

        public QueryBuilder fuzzyDeliveryReceivedDate (List<String> fuzzyDeliveryReceivedDate){
            this.fuzzyDeliveryReceivedDate = fuzzyDeliveryReceivedDate;
            return this;
        }

        public QueryBuilder fuzzyDeliveryReceivedDate (String ... fuzzyDeliveryReceivedDate){
            this.fuzzyDeliveryReceivedDate = solveNullList(fuzzyDeliveryReceivedDate);
            return this;
        }

        public QueryBuilder rightFuzzyDeliveryReceivedDate (List<String> rightFuzzyDeliveryReceivedDate){
            this.rightFuzzyDeliveryReceivedDate = rightFuzzyDeliveryReceivedDate;
            return this;
        }

        public QueryBuilder rightFuzzyDeliveryReceivedDate (String ... rightFuzzyDeliveryReceivedDate){
            this.rightFuzzyDeliveryReceivedDate = solveNullList(rightFuzzyDeliveryReceivedDate);
            return this;
        }

        public QueryBuilder deliveryReceivedDate(String deliveryReceivedDate){
            setDeliveryReceivedDate(deliveryReceivedDate);
            return this;
        }

        public QueryBuilder deliveryReceivedDateList(String ... deliveryReceivedDate){
            this.deliveryReceivedDateList = solveNullList(deliveryReceivedDate);
            return this;
        }

        public QueryBuilder deliveryReceivedDateList(List<String> deliveryReceivedDate){
            this.deliveryReceivedDateList = deliveryReceivedDate;
            return this;
        }

        public QueryBuilder fetchDeliveryReceivedDate(){
            setFetchFields("fetchFields","deliveryReceivedDate");
            return this;
        }

        public QueryBuilder excludeDeliveryReceivedDate(){
            setFetchFields("excludeFields","deliveryReceivedDate");
            return this;
        }

        public QueryBuilder failureTrackIdBetWeen(Integer failureTrackIdSt,Integer failureTrackIdEd){
            this.failureTrackIdSt = failureTrackIdSt;
            this.failureTrackIdEd = failureTrackIdEd;
            return this;
        }

        public QueryBuilder failureTrackIdGreaterEqThan(Integer failureTrackIdSt){
            this.failureTrackIdSt = failureTrackIdSt;
            return this;
        }
        public QueryBuilder failureTrackIdLessEqThan(Integer failureTrackIdEd){
            this.failureTrackIdEd = failureTrackIdEd;
            return this;
        }


        public QueryBuilder failureTrackId(Integer failureTrackId){
            setFailureTrackId(failureTrackId);
            return this;
        }

        public QueryBuilder failureTrackIdList(Integer ... failureTrackId){
            this.failureTrackIdList = solveNullList(failureTrackId);
            return this;
        }

        public QueryBuilder failureTrackIdList(List<Integer> failureTrackId){
            this.failureTrackIdList = failureTrackId;
            return this;
        }

        public QueryBuilder fetchFailureTrackId(){
            setFetchFields("fetchFields","failureTrackId");
            return this;
        }

        public QueryBuilder excludeFailureTrackId(){
            setFetchFields("excludeFields","failureTrackId");
            return this;
        }

        public QueryBuilder applierIdBetWeen(Integer applierIdSt,Integer applierIdEd){
            this.applierIdSt = applierIdSt;
            this.applierIdEd = applierIdEd;
            return this;
        }

        public QueryBuilder applierIdGreaterEqThan(Integer applierIdSt){
            this.applierIdSt = applierIdSt;
            return this;
        }
        public QueryBuilder applierIdLessEqThan(Integer applierIdEd){
            this.applierIdEd = applierIdEd;
            return this;
        }


        public QueryBuilder applierId(Integer applierId){
            setApplierId(applierId);
            return this;
        }

        public QueryBuilder applierIdList(Integer ... applierId){
            this.applierIdList = solveNullList(applierId);
            return this;
        }

        public QueryBuilder applierIdList(List<Integer> applierId){
            this.applierIdList = applierId;
            return this;
        }

        public QueryBuilder fetchApplierId(){
            setFetchFields("fetchFields","applierId");
            return this;
        }

        public QueryBuilder excludeApplierId(){
            setFetchFields("excludeFields","applierId");
            return this;
        }

        public QueryBuilder fuzzyApplierName (List<String> fuzzyApplierName){
            this.fuzzyApplierName = fuzzyApplierName;
            return this;
        }

        public QueryBuilder fuzzyApplierName (String ... fuzzyApplierName){
            this.fuzzyApplierName = solveNullList(fuzzyApplierName);
            return this;
        }

        public QueryBuilder rightFuzzyApplierName (List<String> rightFuzzyApplierName){
            this.rightFuzzyApplierName = rightFuzzyApplierName;
            return this;
        }

        public QueryBuilder rightFuzzyApplierName (String ... rightFuzzyApplierName){
            this.rightFuzzyApplierName = solveNullList(rightFuzzyApplierName);
            return this;
        }

        public QueryBuilder applierName(String applierName){
            setApplierName(applierName);
            return this;
        }

        public QueryBuilder applierNameList(String ... applierName){
            this.applierNameList = solveNullList(applierName);
            return this;
        }

        public QueryBuilder applierNameList(List<String> applierName){
            this.applierNameList = applierName;
            return this;
        }

        public QueryBuilder fetchApplierName(){
            setFetchFields("fetchFields","applierName");
            return this;
        }

        public QueryBuilder excludeApplierName(){
            setFetchFields("excludeFields","applierName");
            return this;
        }

        public QueryBuilder fuzzyApplyTime (List<String> fuzzyApplyTime){
            this.fuzzyApplyTime = fuzzyApplyTime;
            return this;
        }

        public QueryBuilder fuzzyApplyTime (String ... fuzzyApplyTime){
            this.fuzzyApplyTime = solveNullList(fuzzyApplyTime);
            return this;
        }

        public QueryBuilder rightFuzzyApplyTime (List<String> rightFuzzyApplyTime){
            this.rightFuzzyApplyTime = rightFuzzyApplyTime;
            return this;
        }

        public QueryBuilder rightFuzzyApplyTime (String ... rightFuzzyApplyTime){
            this.rightFuzzyApplyTime = solveNullList(rightFuzzyApplyTime);
            return this;
        }

        public QueryBuilder applyTime(String applyTime){
            setApplyTime(applyTime);
            return this;
        }

        public QueryBuilder applyTimeList(String ... applyTime){
            this.applyTimeList = solveNullList(applyTime);
            return this;
        }

        public QueryBuilder applyTimeList(List<String> applyTime){
            this.applyTimeList = applyTime;
            return this;
        }

        public QueryBuilder fetchApplyTime(){
            setFetchFields("fetchFields","applyTime");
            return this;
        }

        public QueryBuilder excludeApplyTime(){
            setFetchFields("excludeFields","applyTime");
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

        private List<String> voucherCodeList;

        public List<String> getVoucherCodeList(){return this.voucherCodeList;}


        private List<String> fuzzyVoucherCode;

        public List<String> getFuzzyVoucherCode(){return this.fuzzyVoucherCode;}

        private List<String> rightFuzzyVoucherCode;

        public List<String> getRightFuzzyVoucherCode(){return this.rightFuzzyVoucherCode;}
        private List<String> claimCodeList;

        public List<String> getClaimCodeList(){return this.claimCodeList;}


        private List<String> fuzzyClaimCode;

        public List<String> getFuzzyClaimCode(){return this.fuzzyClaimCode;}

        private List<String> rightFuzzyClaimCode;

        public List<String> getRightFuzzyClaimCode(){return this.rightFuzzyClaimCode;}
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
        private List<String> productionCodeList;

        public List<String> getProductionCodeList(){return this.productionCodeList;}


        private List<String> fuzzyProductionCode;

        public List<String> getFuzzyProductionCode(){return this.fuzzyProductionCode;}

        private List<String> rightFuzzyProductionCode;

        public List<String> getRightFuzzyProductionCode(){return this.rightFuzzyProductionCode;}
        private List<String> partsCodeList;

        public List<String> getPartsCodeList(){return this.partsCodeList;}


        private List<String> fuzzyPartsCode;

        public List<String> getFuzzyPartsCode(){return this.fuzzyPartsCode;}

        private List<String> rightFuzzyPartsCode;

        public List<String> getRightFuzzyPartsCode(){return this.rightFuzzyPartsCode;}
        private List<String> partsNameList;

        public List<String> getPartsNameList(){return this.partsNameList;}


        private List<String> fuzzyPartsName;

        public List<String> getFuzzyPartsName(){return this.fuzzyPartsName;}

        private List<String> rightFuzzyPartsName;

        public List<String> getRightFuzzyPartsName(){return this.rightFuzzyPartsName;}
        private List<String> divisionLevel1List;

        public List<String> getDivisionLevel1List(){return this.divisionLevel1List;}


        private List<String> fuzzyDivisionLevel1;

        public List<String> getFuzzyDivisionLevel1(){return this.fuzzyDivisionLevel1;}

        private List<String> rightFuzzyDivisionLevel1;

        public List<String> getRightFuzzyDivisionLevel1(){return this.rightFuzzyDivisionLevel1;}
        private List<String> divisionLevel2List;

        public List<String> getDivisionLevel2List(){return this.divisionLevel2List;}


        private List<String> fuzzyDivisionLevel2;

        public List<String> getFuzzyDivisionLevel2(){return this.fuzzyDivisionLevel2;}

        private List<String> rightFuzzyDivisionLevel2;

        public List<String> getRightFuzzyDivisionLevel2(){return this.rightFuzzyDivisionLevel2;}
        private List<String> divisionLevel3List;

        public List<String> getDivisionLevel3List(){return this.divisionLevel3List;}


        private List<String> fuzzyDivisionLevel3;

        public List<String> getFuzzyDivisionLevel3(){return this.fuzzyDivisionLevel3;}

        private List<String> rightFuzzyDivisionLevel3;

        public List<String> getRightFuzzyDivisionLevel3(){return this.rightFuzzyDivisionLevel3;}
        private List<String> partsAndSymptomList;

        public List<String> getPartsAndSymptomList(){return this.partsAndSymptomList;}


        private List<String> fuzzyPartsAndSymptom;

        public List<String> getFuzzyPartsAndSymptom(){return this.fuzzyPartsAndSymptom;}

        private List<String> rightFuzzyPartsAndSymptom;

        public List<String> getRightFuzzyPartsAndSymptom(){return this.rightFuzzyPartsAndSymptom;}
        private List<String> offlineDateList;

        public List<String> getOfflineDateList(){return this.offlineDateList;}


        private List<String> fuzzyOfflineDate;

        public List<String> getFuzzyOfflineDate(){return this.fuzzyOfflineDate;}

        private List<String> rightFuzzyOfflineDate;

        public List<String> getRightFuzzyOfflineDate(){return this.rightFuzzyOfflineDate;}
        private List<String> salesDateList;

        public List<String> getSalesDateList(){return this.salesDateList;}


        private List<String> fuzzySalesDate;

        public List<String> getFuzzySalesDate(){return this.fuzzySalesDate;}

        private List<String> rightFuzzySalesDate;

        public List<String> getRightFuzzySalesDate(){return this.rightFuzzySalesDate;}
        private List<String> failureDateList;

        public List<String> getFailureDateList(){return this.failureDateList;}


        private List<String> fuzzyFailureDate;

        public List<String> getFuzzyFailureDate(){return this.fuzzyFailureDate;}

        private List<String> rightFuzzyFailureDate;

        public List<String> getRightFuzzyFailureDate(){return this.rightFuzzyFailureDate;}
        private List<Integer> mileageList;

        public List<Integer> getMileageList(){return this.mileageList;}

        private Integer mileageSt;

        private Integer mileageEd;

        public Integer getMileageSt(){return this.mileageSt;}

        public Integer getMileageEd(){return this.mileageEd;}

        private List<String> confirmDateList;

        public List<String> getConfirmDateList(){return this.confirmDateList;}


        private List<String> fuzzyConfirmDate;

        public List<String> getFuzzyConfirmDate(){return this.fuzzyConfirmDate;}

        private List<String> rightFuzzyConfirmDate;

        public List<String> getRightFuzzyConfirmDate(){return this.rightFuzzyConfirmDate;}
        private List<String> warehousingDateList;

        public List<String> getWarehousingDateList(){return this.warehousingDateList;}


        private List<String> fuzzyWarehousingDate;

        public List<String> getFuzzyWarehousingDate(){return this.fuzzyWarehousingDate;}

        private List<String> rightFuzzyWarehousingDate;

        public List<String> getRightFuzzyWarehousingDate(){return this.rightFuzzyWarehousingDate;}
        private List<String> transportDateList;

        public List<String> getTransportDateList(){return this.transportDateList;}


        private List<String> fuzzyTransportDate;

        public List<String> getFuzzyTransportDate(){return this.fuzzyTransportDate;}

        private List<String> rightFuzzyTransportDate;

        public List<String> getRightFuzzyTransportDate(){return this.rightFuzzyTransportDate;}
        private List<String> shopArrivalDateList;

        public List<String> getShopArrivalDateList(){return this.shopArrivalDateList;}


        private List<String> fuzzyShopArrivalDate;

        public List<String> getFuzzyShopArrivalDate(){return this.fuzzyShopArrivalDate;}

        private List<String> rightFuzzyShopArrivalDate;

        public List<String> getRightFuzzyShopArrivalDate(){return this.rightFuzzyShopArrivalDate;}
        private List<Integer> salesFailureTimeList;

        public List<Integer> getSalesFailureTimeList(){return this.salesFailureTimeList;}

        private Integer salesFailureTimeSt;

        private Integer salesFailureTimeEd;

        public Integer getSalesFailureTimeSt(){return this.salesFailureTimeSt;}

        public Integer getSalesFailureTimeEd(){return this.salesFailureTimeEd;}

        private List<String> failureDescList;

        public List<String> getFailureDescList(){return this.failureDescList;}


        private List<String> fuzzyFailureDesc;

        public List<String> getFuzzyFailureDesc(){return this.fuzzyFailureDesc;}

        private List<String> rightFuzzyFailureDesc;

        public List<String> getRightFuzzyFailureDesc(){return this.rightFuzzyFailureDesc;}
        private List<String> diagnosticResultList;

        public List<String> getDiagnosticResultList(){return this.diagnosticResultList;}


        private List<String> fuzzyDiagnosticResult;

        public List<String> getFuzzyDiagnosticResult(){return this.fuzzyDiagnosticResult;}

        private List<String> rightFuzzyDiagnosticResult;

        public List<String> getRightFuzzyDiagnosticResult(){return this.rightFuzzyDiagnosticResult;}
        private List<java.math.BigDecimal> manCostList;

        public List<java.math.BigDecimal> getManCostList(){return this.manCostList;}

        private java.math.BigDecimal manCostSt;

        private java.math.BigDecimal manCostEd;

        public java.math.BigDecimal getManCostSt(){return this.manCostSt;}

        public java.math.BigDecimal getManCostEd(){return this.manCostEd;}

        private List<java.math.BigDecimal> materialCostList;

        public List<java.math.BigDecimal> getMaterialCostList(){return this.materialCostList;}

        private java.math.BigDecimal materialCostSt;

        private java.math.BigDecimal materialCostEd;

        public java.math.BigDecimal getMaterialCostSt(){return this.materialCostSt;}

        public java.math.BigDecimal getMaterialCostEd(){return this.materialCostEd;}

        private List<java.math.BigDecimal> materialManagementCostList;

        public List<java.math.BigDecimal> getMaterialManagementCostList(){return this.materialManagementCostList;}

        private java.math.BigDecimal materialManagementCostSt;

        private java.math.BigDecimal materialManagementCostEd;

        public java.math.BigDecimal getMaterialManagementCostSt(){return this.materialManagementCostSt;}

        public java.math.BigDecimal getMaterialManagementCostEd(){return this.materialManagementCostEd;}

        private List<java.math.BigDecimal> goOutCostList;

        public List<java.math.BigDecimal> getGoOutCostList(){return this.goOutCostList;}

        private java.math.BigDecimal goOutCostSt;

        private java.math.BigDecimal goOutCostEd;

        public java.math.BigDecimal getGoOutCostSt(){return this.goOutCostSt;}

        public java.math.BigDecimal getGoOutCostEd(){return this.goOutCostEd;}

        private List<java.math.BigDecimal> maintainingCostList;

        public List<java.math.BigDecimal> getMaintainingCostList(){return this.maintainingCostList;}

        private java.math.BigDecimal maintainingCostSt;

        private java.math.BigDecimal maintainingCostEd;

        public java.math.BigDecimal getMaintainingCostSt(){return this.maintainingCostSt;}

        public java.math.BigDecimal getMaintainingCostEd(){return this.maintainingCostEd;}

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
        private List<String> newPartsBondList;

        public List<String> getNewPartsBondList(){return this.newPartsBondList;}


        private List<String> fuzzyNewPartsBond;

        public List<String> getFuzzyNewPartsBond(){return this.fuzzyNewPartsBond;}

        private List<String> rightFuzzyNewPartsBond;

        public List<String> getRightFuzzyNewPartsBond(){return this.rightFuzzyNewPartsBond;}
        private List<String> submitDateList;

        public List<String> getSubmitDateList(){return this.submitDateList;}


        private List<String> fuzzySubmitDate;

        public List<String> getFuzzySubmitDate(){return this.fuzzySubmitDate;}

        private List<String> rightFuzzySubmitDate;

        public List<String> getRightFuzzySubmitDate(){return this.rightFuzzySubmitDate;}
        private List<String> egtypeCodeList;

        public List<String> getEgtypeCodeList(){return this.egtypeCodeList;}


        private List<String> fuzzyEgtypeCode;

        public List<String> getFuzzyEgtypeCode(){return this.fuzzyEgtypeCode;}

        private List<String> rightFuzzyEgtypeCode;

        public List<String> getRightFuzzyEgtypeCode(){return this.rightFuzzyEgtypeCode;}
        private List<String> transmissionCodeList;

        public List<String> getTransmissionCodeList(){return this.transmissionCodeList;}


        private List<String> fuzzyTransmissionCode;

        public List<String> getFuzzyTransmissionCode(){return this.fuzzyTransmissionCode;}

        private List<String> rightFuzzyTransmissionCode;

        public List<String> getRightFuzzyTransmissionCode(){return this.rightFuzzyTransmissionCode;}
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
        private List<String> engTypeList;

        public List<String> getEngTypeList(){return this.engTypeList;}


        private List<String> fuzzyEngType;

        public List<String> getFuzzyEngType(){return this.fuzzyEngType;}

        private List<String> rightFuzzyEngType;

        public List<String> getRightFuzzyEngType(){return this.rightFuzzyEngType;}
        private List<String> transmissionCodeReList;

        public List<String> getTransmissionCodeReList(){return this.transmissionCodeReList;}


        private List<String> fuzzyTransmissionCodeRe;

        public List<String> getFuzzyTransmissionCodeRe(){return this.fuzzyTransmissionCodeRe;}

        private List<String> rightFuzzyTransmissionCodeRe;

        public List<String> getRightFuzzyTransmissionCodeRe(){return this.rightFuzzyTransmissionCodeRe;}
        private List<String> tranTypeDetailList;

        public List<String> getTranTypeDetailList(){return this.tranTypeDetailList;}


        private List<String> fuzzyTranTypeDetail;

        public List<String> getFuzzyTranTypeDetail(){return this.fuzzyTranTypeDetail;}

        private List<String> rightFuzzyTranTypeDetail;

        public List<String> getRightFuzzyTranTypeDetail(){return this.rightFuzzyTranTypeDetail;}
        private List<String> transmissionManufacturerList;

        public List<String> getTransmissionManufacturerList(){return this.transmissionManufacturerList;}


        private List<String> fuzzyTransmissionManufacturer;

        public List<String> getFuzzyTransmissionManufacturer(){return this.fuzzyTransmissionManufacturer;}

        private List<String> rightFuzzyTransmissionManufacturer;

        public List<String> getRightFuzzyTransmissionManufacturer(){return this.rightFuzzyTransmissionManufacturer;}
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
        private List<String> productionRawDescriptionList;

        public List<String> getProductionRawDescriptionList(){return this.productionRawDescriptionList;}


        private List<String> fuzzyProductionRawDescription;

        public List<String> getFuzzyProductionRawDescription(){return this.fuzzyProductionRawDescription;}

        private List<String> rightFuzzyProductionRawDescription;

        public List<String> getRightFuzzyProductionRawDescription(){return this.rightFuzzyProductionRawDescription;}
        private List<String> PDIList;

        public List<String> getPDIList(){return this.PDIList;}


        private List<String> fuzzyPDI;

        public List<String> getFuzzyPDI(){return this.fuzzyPDI;}

        private List<String> rightFuzzyPDI;

        public List<String> getRightFuzzyPDI(){return this.rightFuzzyPDI;}
        private List<Integer> offlineFailureTimeList;

        public List<Integer> getOfflineFailureTimeList(){return this.offlineFailureTimeList;}

        private Integer offlineFailureTimeSt;

        private Integer offlineFailureTimeEd;

        public Integer getOfflineFailureTimeSt(){return this.offlineFailureTimeSt;}

        public Integer getOfflineFailureTimeEd(){return this.offlineFailureTimeEd;}

        private List<String> transmissionComfirmTimeList;

        public List<String> getTransmissionComfirmTimeList(){return this.transmissionComfirmTimeList;}


        private List<String> fuzzyTransmissionComfirmTime;

        public List<String> getFuzzyTransmissionComfirmTime(){return this.fuzzyTransmissionComfirmTime;}

        private List<String> rightFuzzyTransmissionComfirmTime;

        public List<String> getRightFuzzyTransmissionComfirmTime(){return this.rightFuzzyTransmissionComfirmTime;}
        private List<String> engOrTranList;

        public List<String> getEngOrTranList(){return this.engOrTranList;}


        private List<String> fuzzyEngOrTran;

        public List<String> getFuzzyEngOrTran(){return this.fuzzyEngOrTran;}

        private List<String> rightFuzzyEngOrTran;

        public List<String> getRightFuzzyEngOrTran(){return this.rightFuzzyEngOrTran;}
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
        private List<String> transmissionProductionDataList;

        public List<String> getTransmissionProductionDataList(){return this.transmissionProductionDataList;}


        private List<String> fuzzyTransmissionProductionData;

        public List<String> getFuzzyTransmissionProductionData(){return this.fuzzyTransmissionProductionData;}

        private List<String> rightFuzzyTransmissionProductionData;

        public List<String> getRightFuzzyTransmissionProductionData(){return this.rightFuzzyTransmissionProductionData;}
        private List<String> failureYearList;

        public List<String> getFailureYearList(){return this.failureYearList;}


        private List<String> fuzzyFailureYear;

        public List<String> getFuzzyFailureYear(){return this.fuzzyFailureYear;}

        private List<String> rightFuzzyFailureYear;

        public List<String> getRightFuzzyFailureYear(){return this.rightFuzzyFailureYear;}
        private List<String> failureMonthList;

        public List<String> getFailureMonthList(){return this.failureMonthList;}


        private List<String> fuzzyFailureMonth;

        public List<String> getFuzzyFailureMonth(){return this.fuzzyFailureMonth;}

        private List<String> rightFuzzyFailureMonth;

        public List<String> getRightFuzzyFailureMonth(){return this.rightFuzzyFailureMonth;}
        private List<String> transmissionShortCodeList;

        public List<String> getTransmissionShortCodeList(){return this.transmissionShortCodeList;}


        private List<String> fuzzyTransmissionShortCode;

        public List<String> getFuzzyTransmissionShortCode(){return this.fuzzyTransmissionShortCode;}

        private List<String> rightFuzzyTransmissionShortCode;

        public List<String> getRightFuzzyTransmissionShortCode(){return this.rightFuzzyTransmissionShortCode;}
        private List<String> mileageDistributionList;

        public List<String> getMileageDistributionList(){return this.mileageDistributionList;}


        private List<String> fuzzyMileageDistribution;

        public List<String> getFuzzyMileageDistribution(){return this.fuzzyMileageDistribution;}

        private List<String> rightFuzzyMileageDistribution;

        public List<String> getRightFuzzyMileageDistribution(){return this.rightFuzzyMileageDistribution;}
        private List<String> trackBeginerList;

        public List<String> getTrackBeginerList(){return this.trackBeginerList;}


        private List<String> fuzzyTrackBeginer;

        public List<String> getFuzzyTrackBeginer(){return this.fuzzyTrackBeginer;}

        private List<String> rightFuzzyTrackBeginer;

        public List<String> getRightFuzzyTrackBeginer(){return this.rightFuzzyTrackBeginer;}
        private List<String> trackBeginTimeList;

        public List<String> getTrackBeginTimeList(){return this.trackBeginTimeList;}


        private List<String> fuzzyTrackBeginTime;

        public List<String> getFuzzyTrackBeginTime(){return this.fuzzyTrackBeginTime;}

        private List<String> rightFuzzyTrackBeginTime;

        public List<String> getRightFuzzyTrackBeginTime(){return this.rightFuzzyTrackBeginTime;}
        private List<String> deliveryPersonList;

        public List<String> getDeliveryPersonList(){return this.deliveryPersonList;}


        private List<String> fuzzyDeliveryPerson;

        public List<String> getFuzzyDeliveryPerson(){return this.fuzzyDeliveryPerson;}

        private List<String> rightFuzzyDeliveryPerson;

        public List<String> getRightFuzzyDeliveryPerson(){return this.rightFuzzyDeliveryPerson;}
        private List<String> deliveryDeadlineList;

        public List<String> getDeliveryDeadlineList(){return this.deliveryDeadlineList;}


        private List<String> fuzzyDeliveryDeadline;

        public List<String> getFuzzyDeliveryDeadline(){return this.fuzzyDeliveryDeadline;}

        private List<String> rightFuzzyDeliveryDeadline;

        public List<String> getRightFuzzyDeliveryDeadline(){return this.rightFuzzyDeliveryDeadline;}
        private List<String> deliveryReceivedDateList;

        public List<String> getDeliveryReceivedDateList(){return this.deliveryReceivedDateList;}


        private List<String> fuzzyDeliveryReceivedDate;

        public List<String> getFuzzyDeliveryReceivedDate(){return this.fuzzyDeliveryReceivedDate;}

        private List<String> rightFuzzyDeliveryReceivedDate;

        public List<String> getRightFuzzyDeliveryReceivedDate(){return this.rightFuzzyDeliveryReceivedDate;}
        private List<Integer> failureTrackIdList;

        public List<Integer> getFailureTrackIdList(){return this.failureTrackIdList;}

        private Integer failureTrackIdSt;

        private Integer failureTrackIdEd;

        public Integer getFailureTrackIdSt(){return this.failureTrackIdSt;}

        public Integer getFailureTrackIdEd(){return this.failureTrackIdEd;}

        private List<Integer> applierIdList;

        public List<Integer> getApplierIdList(){return this.applierIdList;}

        private Integer applierIdSt;

        private Integer applierIdEd;

        public Integer getApplierIdSt(){return this.applierIdSt;}

        public Integer getApplierIdEd(){return this.applierIdEd;}

        private List<String> applierNameList;

        public List<String> getApplierNameList(){return this.applierNameList;}


        private List<String> fuzzyApplierName;

        public List<String> getFuzzyApplierName(){return this.fuzzyApplierName;}

        private List<String> rightFuzzyApplierName;

        public List<String> getRightFuzzyApplierName(){return this.rightFuzzyApplierName;}
        private List<String> applyTimeList;

        public List<String> getApplyTimeList(){return this.applyTimeList;}


        private List<String> fuzzyApplyTime;

        public List<String> getFuzzyApplyTime(){return this.fuzzyApplyTime;}

        private List<String> rightFuzzyApplyTime;

        public List<String> getRightFuzzyApplyTime(){return this.rightFuzzyApplyTime;}

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

        public ConditionBuilder fuzzyClaimCode (List<String> fuzzyClaimCode){
            this.fuzzyClaimCode = fuzzyClaimCode;
            return this;
        }

        public ConditionBuilder fuzzyClaimCode (String ... fuzzyClaimCode){
            this.fuzzyClaimCode = solveNullList(fuzzyClaimCode);
            return this;
        }

        public ConditionBuilder rightFuzzyClaimCode (List<String> rightFuzzyClaimCode){
            this.rightFuzzyClaimCode = rightFuzzyClaimCode;
            return this;
        }

        public ConditionBuilder rightFuzzyClaimCode (String ... rightFuzzyClaimCode){
            this.rightFuzzyClaimCode = solveNullList(rightFuzzyClaimCode);
            return this;
        }

        public ConditionBuilder claimCodeList(String ... claimCode){
            this.claimCodeList = solveNullList(claimCode);
            return this;
        }

        public ConditionBuilder claimCodeList(List<String> claimCode){
            this.claimCodeList = claimCode;
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

        public ConditionBuilder fuzzyProductionCode (List<String> fuzzyProductionCode){
            this.fuzzyProductionCode = fuzzyProductionCode;
            return this;
        }

        public ConditionBuilder fuzzyProductionCode (String ... fuzzyProductionCode){
            this.fuzzyProductionCode = solveNullList(fuzzyProductionCode);
            return this;
        }

        public ConditionBuilder rightFuzzyProductionCode (List<String> rightFuzzyProductionCode){
            this.rightFuzzyProductionCode = rightFuzzyProductionCode;
            return this;
        }

        public ConditionBuilder rightFuzzyProductionCode (String ... rightFuzzyProductionCode){
            this.rightFuzzyProductionCode = solveNullList(rightFuzzyProductionCode);
            return this;
        }

        public ConditionBuilder productionCodeList(String ... productionCode){
            this.productionCodeList = solveNullList(productionCode);
            return this;
        }

        public ConditionBuilder productionCodeList(List<String> productionCode){
            this.productionCodeList = productionCode;
            return this;
        }

        public ConditionBuilder fuzzyPartsCode (List<String> fuzzyPartsCode){
            this.fuzzyPartsCode = fuzzyPartsCode;
            return this;
        }

        public ConditionBuilder fuzzyPartsCode (String ... fuzzyPartsCode){
            this.fuzzyPartsCode = solveNullList(fuzzyPartsCode);
            return this;
        }

        public ConditionBuilder rightFuzzyPartsCode (List<String> rightFuzzyPartsCode){
            this.rightFuzzyPartsCode = rightFuzzyPartsCode;
            return this;
        }

        public ConditionBuilder rightFuzzyPartsCode (String ... rightFuzzyPartsCode){
            this.rightFuzzyPartsCode = solveNullList(rightFuzzyPartsCode);
            return this;
        }

        public ConditionBuilder partsCodeList(String ... partsCode){
            this.partsCodeList = solveNullList(partsCode);
            return this;
        }

        public ConditionBuilder partsCodeList(List<String> partsCode){
            this.partsCodeList = partsCode;
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

        public ConditionBuilder fuzzyDivisionLevel1 (List<String> fuzzyDivisionLevel1){
            this.fuzzyDivisionLevel1 = fuzzyDivisionLevel1;
            return this;
        }

        public ConditionBuilder fuzzyDivisionLevel1 (String ... fuzzyDivisionLevel1){
            this.fuzzyDivisionLevel1 = solveNullList(fuzzyDivisionLevel1);
            return this;
        }

        public ConditionBuilder rightFuzzyDivisionLevel1 (List<String> rightFuzzyDivisionLevel1){
            this.rightFuzzyDivisionLevel1 = rightFuzzyDivisionLevel1;
            return this;
        }

        public ConditionBuilder rightFuzzyDivisionLevel1 (String ... rightFuzzyDivisionLevel1){
            this.rightFuzzyDivisionLevel1 = solveNullList(rightFuzzyDivisionLevel1);
            return this;
        }

        public ConditionBuilder divisionLevel1List(String ... divisionLevel1){
            this.divisionLevel1List = solveNullList(divisionLevel1);
            return this;
        }

        public ConditionBuilder divisionLevel1List(List<String> divisionLevel1){
            this.divisionLevel1List = divisionLevel1;
            return this;
        }

        public ConditionBuilder fuzzyDivisionLevel2 (List<String> fuzzyDivisionLevel2){
            this.fuzzyDivisionLevel2 = fuzzyDivisionLevel2;
            return this;
        }

        public ConditionBuilder fuzzyDivisionLevel2 (String ... fuzzyDivisionLevel2){
            this.fuzzyDivisionLevel2 = solveNullList(fuzzyDivisionLevel2);
            return this;
        }

        public ConditionBuilder rightFuzzyDivisionLevel2 (List<String> rightFuzzyDivisionLevel2){
            this.rightFuzzyDivisionLevel2 = rightFuzzyDivisionLevel2;
            return this;
        }

        public ConditionBuilder rightFuzzyDivisionLevel2 (String ... rightFuzzyDivisionLevel2){
            this.rightFuzzyDivisionLevel2 = solveNullList(rightFuzzyDivisionLevel2);
            return this;
        }

        public ConditionBuilder divisionLevel2List(String ... divisionLevel2){
            this.divisionLevel2List = solveNullList(divisionLevel2);
            return this;
        }

        public ConditionBuilder divisionLevel2List(List<String> divisionLevel2){
            this.divisionLevel2List = divisionLevel2;
            return this;
        }

        public ConditionBuilder fuzzyDivisionLevel3 (List<String> fuzzyDivisionLevel3){
            this.fuzzyDivisionLevel3 = fuzzyDivisionLevel3;
            return this;
        }

        public ConditionBuilder fuzzyDivisionLevel3 (String ... fuzzyDivisionLevel3){
            this.fuzzyDivisionLevel3 = solveNullList(fuzzyDivisionLevel3);
            return this;
        }

        public ConditionBuilder rightFuzzyDivisionLevel3 (List<String> rightFuzzyDivisionLevel3){
            this.rightFuzzyDivisionLevel3 = rightFuzzyDivisionLevel3;
            return this;
        }

        public ConditionBuilder rightFuzzyDivisionLevel3 (String ... rightFuzzyDivisionLevel3){
            this.rightFuzzyDivisionLevel3 = solveNullList(rightFuzzyDivisionLevel3);
            return this;
        }

        public ConditionBuilder divisionLevel3List(String ... divisionLevel3){
            this.divisionLevel3List = solveNullList(divisionLevel3);
            return this;
        }

        public ConditionBuilder divisionLevel3List(List<String> divisionLevel3){
            this.divisionLevel3List = divisionLevel3;
            return this;
        }

        public ConditionBuilder fuzzyPartsAndSymptom (List<String> fuzzyPartsAndSymptom){
            this.fuzzyPartsAndSymptom = fuzzyPartsAndSymptom;
            return this;
        }

        public ConditionBuilder fuzzyPartsAndSymptom (String ... fuzzyPartsAndSymptom){
            this.fuzzyPartsAndSymptom = solveNullList(fuzzyPartsAndSymptom);
            return this;
        }

        public ConditionBuilder rightFuzzyPartsAndSymptom (List<String> rightFuzzyPartsAndSymptom){
            this.rightFuzzyPartsAndSymptom = rightFuzzyPartsAndSymptom;
            return this;
        }

        public ConditionBuilder rightFuzzyPartsAndSymptom (String ... rightFuzzyPartsAndSymptom){
            this.rightFuzzyPartsAndSymptom = solveNullList(rightFuzzyPartsAndSymptom);
            return this;
        }

        public ConditionBuilder partsAndSymptomList(String ... partsAndSymptom){
            this.partsAndSymptomList = solveNullList(partsAndSymptom);
            return this;
        }

        public ConditionBuilder partsAndSymptomList(List<String> partsAndSymptom){
            this.partsAndSymptomList = partsAndSymptom;
            return this;
        }

        public ConditionBuilder fuzzyOfflineDate (List<String> fuzzyOfflineDate){
            this.fuzzyOfflineDate = fuzzyOfflineDate;
            return this;
        }

        public ConditionBuilder fuzzyOfflineDate (String ... fuzzyOfflineDate){
            this.fuzzyOfflineDate = solveNullList(fuzzyOfflineDate);
            return this;
        }

        public ConditionBuilder rightFuzzyOfflineDate (List<String> rightFuzzyOfflineDate){
            this.rightFuzzyOfflineDate = rightFuzzyOfflineDate;
            return this;
        }

        public ConditionBuilder rightFuzzyOfflineDate (String ... rightFuzzyOfflineDate){
            this.rightFuzzyOfflineDate = solveNullList(rightFuzzyOfflineDate);
            return this;
        }

        public ConditionBuilder offlineDateList(String ... offlineDate){
            this.offlineDateList = solveNullList(offlineDate);
            return this;
        }

        public ConditionBuilder offlineDateList(List<String> offlineDate){
            this.offlineDateList = offlineDate;
            return this;
        }

        public ConditionBuilder fuzzySalesDate (List<String> fuzzySalesDate){
            this.fuzzySalesDate = fuzzySalesDate;
            return this;
        }

        public ConditionBuilder fuzzySalesDate (String ... fuzzySalesDate){
            this.fuzzySalesDate = solveNullList(fuzzySalesDate);
            return this;
        }

        public ConditionBuilder rightFuzzySalesDate (List<String> rightFuzzySalesDate){
            this.rightFuzzySalesDate = rightFuzzySalesDate;
            return this;
        }

        public ConditionBuilder rightFuzzySalesDate (String ... rightFuzzySalesDate){
            this.rightFuzzySalesDate = solveNullList(rightFuzzySalesDate);
            return this;
        }

        public ConditionBuilder salesDateList(String ... salesDate){
            this.salesDateList = solveNullList(salesDate);
            return this;
        }

        public ConditionBuilder salesDateList(List<String> salesDate){
            this.salesDateList = salesDate;
            return this;
        }

        public ConditionBuilder fuzzyFailureDate (List<String> fuzzyFailureDate){
            this.fuzzyFailureDate = fuzzyFailureDate;
            return this;
        }

        public ConditionBuilder fuzzyFailureDate (String ... fuzzyFailureDate){
            this.fuzzyFailureDate = solveNullList(fuzzyFailureDate);
            return this;
        }

        public ConditionBuilder rightFuzzyFailureDate (List<String> rightFuzzyFailureDate){
            this.rightFuzzyFailureDate = rightFuzzyFailureDate;
            return this;
        }

        public ConditionBuilder rightFuzzyFailureDate (String ... rightFuzzyFailureDate){
            this.rightFuzzyFailureDate = solveNullList(rightFuzzyFailureDate);
            return this;
        }

        public ConditionBuilder failureDateList(String ... failureDate){
            this.failureDateList = solveNullList(failureDate);
            return this;
        }

        public ConditionBuilder failureDateList(List<String> failureDate){
            this.failureDateList = failureDate;
            return this;
        }

        public ConditionBuilder mileageBetWeen(Integer mileageSt,Integer mileageEd){
            this.mileageSt = mileageSt;
            this.mileageEd = mileageEd;
            return this;
        }

        public ConditionBuilder mileageGreaterEqThan(Integer mileageSt){
            this.mileageSt = mileageSt;
            return this;
        }
        public ConditionBuilder mileageLessEqThan(Integer mileageEd){
            this.mileageEd = mileageEd;
            return this;
        }


        public ConditionBuilder mileageList(Integer ... mileage){
            this.mileageList = solveNullList(mileage);
            return this;
        }

        public ConditionBuilder mileageList(List<Integer> mileage){
            this.mileageList = mileage;
            return this;
        }

        public ConditionBuilder fuzzyConfirmDate (List<String> fuzzyConfirmDate){
            this.fuzzyConfirmDate = fuzzyConfirmDate;
            return this;
        }

        public ConditionBuilder fuzzyConfirmDate (String ... fuzzyConfirmDate){
            this.fuzzyConfirmDate = solveNullList(fuzzyConfirmDate);
            return this;
        }

        public ConditionBuilder rightFuzzyConfirmDate (List<String> rightFuzzyConfirmDate){
            this.rightFuzzyConfirmDate = rightFuzzyConfirmDate;
            return this;
        }

        public ConditionBuilder rightFuzzyConfirmDate (String ... rightFuzzyConfirmDate){
            this.rightFuzzyConfirmDate = solveNullList(rightFuzzyConfirmDate);
            return this;
        }

        public ConditionBuilder confirmDateList(String ... confirmDate){
            this.confirmDateList = solveNullList(confirmDate);
            return this;
        }

        public ConditionBuilder confirmDateList(List<String> confirmDate){
            this.confirmDateList = confirmDate;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingDate (List<String> fuzzyWarehousingDate){
            this.fuzzyWarehousingDate = fuzzyWarehousingDate;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingDate (String ... fuzzyWarehousingDate){
            this.fuzzyWarehousingDate = solveNullList(fuzzyWarehousingDate);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingDate (List<String> rightFuzzyWarehousingDate){
            this.rightFuzzyWarehousingDate = rightFuzzyWarehousingDate;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingDate (String ... rightFuzzyWarehousingDate){
            this.rightFuzzyWarehousingDate = solveNullList(rightFuzzyWarehousingDate);
            return this;
        }

        public ConditionBuilder warehousingDateList(String ... warehousingDate){
            this.warehousingDateList = solveNullList(warehousingDate);
            return this;
        }

        public ConditionBuilder warehousingDateList(List<String> warehousingDate){
            this.warehousingDateList = warehousingDate;
            return this;
        }

        public ConditionBuilder fuzzyTransportDate (List<String> fuzzyTransportDate){
            this.fuzzyTransportDate = fuzzyTransportDate;
            return this;
        }

        public ConditionBuilder fuzzyTransportDate (String ... fuzzyTransportDate){
            this.fuzzyTransportDate = solveNullList(fuzzyTransportDate);
            return this;
        }

        public ConditionBuilder rightFuzzyTransportDate (List<String> rightFuzzyTransportDate){
            this.rightFuzzyTransportDate = rightFuzzyTransportDate;
            return this;
        }

        public ConditionBuilder rightFuzzyTransportDate (String ... rightFuzzyTransportDate){
            this.rightFuzzyTransportDate = solveNullList(rightFuzzyTransportDate);
            return this;
        }

        public ConditionBuilder transportDateList(String ... transportDate){
            this.transportDateList = solveNullList(transportDate);
            return this;
        }

        public ConditionBuilder transportDateList(List<String> transportDate){
            this.transportDateList = transportDate;
            return this;
        }

        public ConditionBuilder fuzzyShopArrivalDate (List<String> fuzzyShopArrivalDate){
            this.fuzzyShopArrivalDate = fuzzyShopArrivalDate;
            return this;
        }

        public ConditionBuilder fuzzyShopArrivalDate (String ... fuzzyShopArrivalDate){
            this.fuzzyShopArrivalDate = solveNullList(fuzzyShopArrivalDate);
            return this;
        }

        public ConditionBuilder rightFuzzyShopArrivalDate (List<String> rightFuzzyShopArrivalDate){
            this.rightFuzzyShopArrivalDate = rightFuzzyShopArrivalDate;
            return this;
        }

        public ConditionBuilder rightFuzzyShopArrivalDate (String ... rightFuzzyShopArrivalDate){
            this.rightFuzzyShopArrivalDate = solveNullList(rightFuzzyShopArrivalDate);
            return this;
        }

        public ConditionBuilder shopArrivalDateList(String ... shopArrivalDate){
            this.shopArrivalDateList = solveNullList(shopArrivalDate);
            return this;
        }

        public ConditionBuilder shopArrivalDateList(List<String> shopArrivalDate){
            this.shopArrivalDateList = shopArrivalDate;
            return this;
        }

        public ConditionBuilder salesFailureTimeBetWeen(Integer salesFailureTimeSt,Integer salesFailureTimeEd){
            this.salesFailureTimeSt = salesFailureTimeSt;
            this.salesFailureTimeEd = salesFailureTimeEd;
            return this;
        }

        public ConditionBuilder salesFailureTimeGreaterEqThan(Integer salesFailureTimeSt){
            this.salesFailureTimeSt = salesFailureTimeSt;
            return this;
        }
        public ConditionBuilder salesFailureTimeLessEqThan(Integer salesFailureTimeEd){
            this.salesFailureTimeEd = salesFailureTimeEd;
            return this;
        }


        public ConditionBuilder salesFailureTimeList(Integer ... salesFailureTime){
            this.salesFailureTimeList = solveNullList(salesFailureTime);
            return this;
        }

        public ConditionBuilder salesFailureTimeList(List<Integer> salesFailureTime){
            this.salesFailureTimeList = salesFailureTime;
            return this;
        }

        public ConditionBuilder fuzzyFailureDesc (List<String> fuzzyFailureDesc){
            this.fuzzyFailureDesc = fuzzyFailureDesc;
            return this;
        }

        public ConditionBuilder fuzzyFailureDesc (String ... fuzzyFailureDesc){
            this.fuzzyFailureDesc = solveNullList(fuzzyFailureDesc);
            return this;
        }

        public ConditionBuilder rightFuzzyFailureDesc (List<String> rightFuzzyFailureDesc){
            this.rightFuzzyFailureDesc = rightFuzzyFailureDesc;
            return this;
        }

        public ConditionBuilder rightFuzzyFailureDesc (String ... rightFuzzyFailureDesc){
            this.rightFuzzyFailureDesc = solveNullList(rightFuzzyFailureDesc);
            return this;
        }

        public ConditionBuilder failureDescList(String ... failureDesc){
            this.failureDescList = solveNullList(failureDesc);
            return this;
        }

        public ConditionBuilder failureDescList(List<String> failureDesc){
            this.failureDescList = failureDesc;
            return this;
        }

        public ConditionBuilder fuzzyDiagnosticResult (List<String> fuzzyDiagnosticResult){
            this.fuzzyDiagnosticResult = fuzzyDiagnosticResult;
            return this;
        }

        public ConditionBuilder fuzzyDiagnosticResult (String ... fuzzyDiagnosticResult){
            this.fuzzyDiagnosticResult = solveNullList(fuzzyDiagnosticResult);
            return this;
        }

        public ConditionBuilder rightFuzzyDiagnosticResult (List<String> rightFuzzyDiagnosticResult){
            this.rightFuzzyDiagnosticResult = rightFuzzyDiagnosticResult;
            return this;
        }

        public ConditionBuilder rightFuzzyDiagnosticResult (String ... rightFuzzyDiagnosticResult){
            this.rightFuzzyDiagnosticResult = solveNullList(rightFuzzyDiagnosticResult);
            return this;
        }

        public ConditionBuilder diagnosticResultList(String ... diagnosticResult){
            this.diagnosticResultList = solveNullList(diagnosticResult);
            return this;
        }

        public ConditionBuilder diagnosticResultList(List<String> diagnosticResult){
            this.diagnosticResultList = diagnosticResult;
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

        public ConditionBuilder materialCostBetWeen(java.math.BigDecimal materialCostSt,java.math.BigDecimal materialCostEd){
            this.materialCostSt = materialCostSt;
            this.materialCostEd = materialCostEd;
            return this;
        }

        public ConditionBuilder materialCostGreaterEqThan(java.math.BigDecimal materialCostSt){
            this.materialCostSt = materialCostSt;
            return this;
        }
        public ConditionBuilder materialCostLessEqThan(java.math.BigDecimal materialCostEd){
            this.materialCostEd = materialCostEd;
            return this;
        }


        public ConditionBuilder materialCostList(java.math.BigDecimal ... materialCost){
            this.materialCostList = solveNullList(materialCost);
            return this;
        }

        public ConditionBuilder materialCostList(List<java.math.BigDecimal> materialCost){
            this.materialCostList = materialCost;
            return this;
        }

        public ConditionBuilder materialManagementCostBetWeen(java.math.BigDecimal materialManagementCostSt,java.math.BigDecimal materialManagementCostEd){
            this.materialManagementCostSt = materialManagementCostSt;
            this.materialManagementCostEd = materialManagementCostEd;
            return this;
        }

        public ConditionBuilder materialManagementCostGreaterEqThan(java.math.BigDecimal materialManagementCostSt){
            this.materialManagementCostSt = materialManagementCostSt;
            return this;
        }
        public ConditionBuilder materialManagementCostLessEqThan(java.math.BigDecimal materialManagementCostEd){
            this.materialManagementCostEd = materialManagementCostEd;
            return this;
        }


        public ConditionBuilder materialManagementCostList(java.math.BigDecimal ... materialManagementCost){
            this.materialManagementCostList = solveNullList(materialManagementCost);
            return this;
        }

        public ConditionBuilder materialManagementCostList(List<java.math.BigDecimal> materialManagementCost){
            this.materialManagementCostList = materialManagementCost;
            return this;
        }

        public ConditionBuilder goOutCostBetWeen(java.math.BigDecimal goOutCostSt,java.math.BigDecimal goOutCostEd){
            this.goOutCostSt = goOutCostSt;
            this.goOutCostEd = goOutCostEd;
            return this;
        }

        public ConditionBuilder goOutCostGreaterEqThan(java.math.BigDecimal goOutCostSt){
            this.goOutCostSt = goOutCostSt;
            return this;
        }
        public ConditionBuilder goOutCostLessEqThan(java.math.BigDecimal goOutCostEd){
            this.goOutCostEd = goOutCostEd;
            return this;
        }


        public ConditionBuilder goOutCostList(java.math.BigDecimal ... goOutCost){
            this.goOutCostList = solveNullList(goOutCost);
            return this;
        }

        public ConditionBuilder goOutCostList(List<java.math.BigDecimal> goOutCost){
            this.goOutCostList = goOutCost;
            return this;
        }

        public ConditionBuilder maintainingCostBetWeen(java.math.BigDecimal maintainingCostSt,java.math.BigDecimal maintainingCostEd){
            this.maintainingCostSt = maintainingCostSt;
            this.maintainingCostEd = maintainingCostEd;
            return this;
        }

        public ConditionBuilder maintainingCostGreaterEqThan(java.math.BigDecimal maintainingCostSt){
            this.maintainingCostSt = maintainingCostSt;
            return this;
        }
        public ConditionBuilder maintainingCostLessEqThan(java.math.BigDecimal maintainingCostEd){
            this.maintainingCostEd = maintainingCostEd;
            return this;
        }


        public ConditionBuilder maintainingCostList(java.math.BigDecimal ... maintainingCost){
            this.maintainingCostList = solveNullList(maintainingCost);
            return this;
        }

        public ConditionBuilder maintainingCostList(List<java.math.BigDecimal> maintainingCost){
            this.maintainingCostList = maintainingCost;
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

        public ConditionBuilder fuzzyNewPartsBond (List<String> fuzzyNewPartsBond){
            this.fuzzyNewPartsBond = fuzzyNewPartsBond;
            return this;
        }

        public ConditionBuilder fuzzyNewPartsBond (String ... fuzzyNewPartsBond){
            this.fuzzyNewPartsBond = solveNullList(fuzzyNewPartsBond);
            return this;
        }

        public ConditionBuilder rightFuzzyNewPartsBond (List<String> rightFuzzyNewPartsBond){
            this.rightFuzzyNewPartsBond = rightFuzzyNewPartsBond;
            return this;
        }

        public ConditionBuilder rightFuzzyNewPartsBond (String ... rightFuzzyNewPartsBond){
            this.rightFuzzyNewPartsBond = solveNullList(rightFuzzyNewPartsBond);
            return this;
        }

        public ConditionBuilder newPartsBondList(String ... newPartsBond){
            this.newPartsBondList = solveNullList(newPartsBond);
            return this;
        }

        public ConditionBuilder newPartsBondList(List<String> newPartsBond){
            this.newPartsBondList = newPartsBond;
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

        public ConditionBuilder fuzzyEgtypeCode (List<String> fuzzyEgtypeCode){
            this.fuzzyEgtypeCode = fuzzyEgtypeCode;
            return this;
        }

        public ConditionBuilder fuzzyEgtypeCode (String ... fuzzyEgtypeCode){
            this.fuzzyEgtypeCode = solveNullList(fuzzyEgtypeCode);
            return this;
        }

        public ConditionBuilder rightFuzzyEgtypeCode (List<String> rightFuzzyEgtypeCode){
            this.rightFuzzyEgtypeCode = rightFuzzyEgtypeCode;
            return this;
        }

        public ConditionBuilder rightFuzzyEgtypeCode (String ... rightFuzzyEgtypeCode){
            this.rightFuzzyEgtypeCode = solveNullList(rightFuzzyEgtypeCode);
            return this;
        }

        public ConditionBuilder egtypeCodeList(String ... egtypeCode){
            this.egtypeCodeList = solveNullList(egtypeCode);
            return this;
        }

        public ConditionBuilder egtypeCodeList(List<String> egtypeCode){
            this.egtypeCodeList = egtypeCode;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionCode (List<String> fuzzyTransmissionCode){
            this.fuzzyTransmissionCode = fuzzyTransmissionCode;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionCode (String ... fuzzyTransmissionCode){
            this.fuzzyTransmissionCode = solveNullList(fuzzyTransmissionCode);
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionCode (List<String> rightFuzzyTransmissionCode){
            this.rightFuzzyTransmissionCode = rightFuzzyTransmissionCode;
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionCode (String ... rightFuzzyTransmissionCode){
            this.rightFuzzyTransmissionCode = solveNullList(rightFuzzyTransmissionCode);
            return this;
        }

        public ConditionBuilder transmissionCodeList(String ... transmissionCode){
            this.transmissionCodeList = solveNullList(transmissionCode);
            return this;
        }

        public ConditionBuilder transmissionCodeList(List<String> transmissionCode){
            this.transmissionCodeList = transmissionCode;
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

        public ConditionBuilder fuzzyEngType (List<String> fuzzyEngType){
            this.fuzzyEngType = fuzzyEngType;
            return this;
        }

        public ConditionBuilder fuzzyEngType (String ... fuzzyEngType){
            this.fuzzyEngType = solveNullList(fuzzyEngType);
            return this;
        }

        public ConditionBuilder rightFuzzyEngType (List<String> rightFuzzyEngType){
            this.rightFuzzyEngType = rightFuzzyEngType;
            return this;
        }

        public ConditionBuilder rightFuzzyEngType (String ... rightFuzzyEngType){
            this.rightFuzzyEngType = solveNullList(rightFuzzyEngType);
            return this;
        }

        public ConditionBuilder engTypeList(String ... engType){
            this.engTypeList = solveNullList(engType);
            return this;
        }

        public ConditionBuilder engTypeList(List<String> engType){
            this.engTypeList = engType;
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

        public ConditionBuilder fuzzyTranTypeDetail (List<String> fuzzyTranTypeDetail){
            this.fuzzyTranTypeDetail = fuzzyTranTypeDetail;
            return this;
        }

        public ConditionBuilder fuzzyTranTypeDetail (String ... fuzzyTranTypeDetail){
            this.fuzzyTranTypeDetail = solveNullList(fuzzyTranTypeDetail);
            return this;
        }

        public ConditionBuilder rightFuzzyTranTypeDetail (List<String> rightFuzzyTranTypeDetail){
            this.rightFuzzyTranTypeDetail = rightFuzzyTranTypeDetail;
            return this;
        }

        public ConditionBuilder rightFuzzyTranTypeDetail (String ... rightFuzzyTranTypeDetail){
            this.rightFuzzyTranTypeDetail = solveNullList(rightFuzzyTranTypeDetail);
            return this;
        }

        public ConditionBuilder tranTypeDetailList(String ... tranTypeDetail){
            this.tranTypeDetailList = solveNullList(tranTypeDetail);
            return this;
        }

        public ConditionBuilder tranTypeDetailList(List<String> tranTypeDetail){
            this.tranTypeDetailList = tranTypeDetail;
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

        public ConditionBuilder fuzzyProductionRawDescription (List<String> fuzzyProductionRawDescription){
            this.fuzzyProductionRawDescription = fuzzyProductionRawDescription;
            return this;
        }

        public ConditionBuilder fuzzyProductionRawDescription (String ... fuzzyProductionRawDescription){
            this.fuzzyProductionRawDescription = solveNullList(fuzzyProductionRawDescription);
            return this;
        }

        public ConditionBuilder rightFuzzyProductionRawDescription (List<String> rightFuzzyProductionRawDescription){
            this.rightFuzzyProductionRawDescription = rightFuzzyProductionRawDescription;
            return this;
        }

        public ConditionBuilder rightFuzzyProductionRawDescription (String ... rightFuzzyProductionRawDescription){
            this.rightFuzzyProductionRawDescription = solveNullList(rightFuzzyProductionRawDescription);
            return this;
        }

        public ConditionBuilder productionRawDescriptionList(String ... productionRawDescription){
            this.productionRawDescriptionList = solveNullList(productionRawDescription);
            return this;
        }

        public ConditionBuilder productionRawDescriptionList(List<String> productionRawDescription){
            this.productionRawDescriptionList = productionRawDescription;
            return this;
        }

        public ConditionBuilder fuzzyPDI (List<String> fuzzyPDI){
            this.fuzzyPDI = fuzzyPDI;
            return this;
        }

        public ConditionBuilder fuzzyPDI (String ... fuzzyPDI){
            this.fuzzyPDI = solveNullList(fuzzyPDI);
            return this;
        }

        public ConditionBuilder rightFuzzyPDI (List<String> rightFuzzyPDI){
            this.rightFuzzyPDI = rightFuzzyPDI;
            return this;
        }

        public ConditionBuilder rightFuzzyPDI (String ... rightFuzzyPDI){
            this.rightFuzzyPDI = solveNullList(rightFuzzyPDI);
            return this;
        }

        public ConditionBuilder PDIList(String ... PDI){
            this.PDIList = solveNullList(PDI);
            return this;
        }

        public ConditionBuilder PDIList(List<String> PDI){
            this.PDIList = PDI;
            return this;
        }

        public ConditionBuilder offlineFailureTimeBetWeen(Integer offlineFailureTimeSt,Integer offlineFailureTimeEd){
            this.offlineFailureTimeSt = offlineFailureTimeSt;
            this.offlineFailureTimeEd = offlineFailureTimeEd;
            return this;
        }

        public ConditionBuilder offlineFailureTimeGreaterEqThan(Integer offlineFailureTimeSt){
            this.offlineFailureTimeSt = offlineFailureTimeSt;
            return this;
        }
        public ConditionBuilder offlineFailureTimeLessEqThan(Integer offlineFailureTimeEd){
            this.offlineFailureTimeEd = offlineFailureTimeEd;
            return this;
        }


        public ConditionBuilder offlineFailureTimeList(Integer ... offlineFailureTime){
            this.offlineFailureTimeList = solveNullList(offlineFailureTime);
            return this;
        }

        public ConditionBuilder offlineFailureTimeList(List<Integer> offlineFailureTime){
            this.offlineFailureTimeList = offlineFailureTime;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionComfirmTime (List<String> fuzzyTransmissionComfirmTime){
            this.fuzzyTransmissionComfirmTime = fuzzyTransmissionComfirmTime;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionComfirmTime (String ... fuzzyTransmissionComfirmTime){
            this.fuzzyTransmissionComfirmTime = solveNullList(fuzzyTransmissionComfirmTime);
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionComfirmTime (List<String> rightFuzzyTransmissionComfirmTime){
            this.rightFuzzyTransmissionComfirmTime = rightFuzzyTransmissionComfirmTime;
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionComfirmTime (String ... rightFuzzyTransmissionComfirmTime){
            this.rightFuzzyTransmissionComfirmTime = solveNullList(rightFuzzyTransmissionComfirmTime);
            return this;
        }

        public ConditionBuilder transmissionComfirmTimeList(String ... transmissionComfirmTime){
            this.transmissionComfirmTimeList = solveNullList(transmissionComfirmTime);
            return this;
        }

        public ConditionBuilder transmissionComfirmTimeList(List<String> transmissionComfirmTime){
            this.transmissionComfirmTimeList = transmissionComfirmTime;
            return this;
        }

        public ConditionBuilder fuzzyEngOrTran (List<String> fuzzyEngOrTran){
            this.fuzzyEngOrTran = fuzzyEngOrTran;
            return this;
        }

        public ConditionBuilder fuzzyEngOrTran (String ... fuzzyEngOrTran){
            this.fuzzyEngOrTran = solveNullList(fuzzyEngOrTran);
            return this;
        }

        public ConditionBuilder rightFuzzyEngOrTran (List<String> rightFuzzyEngOrTran){
            this.rightFuzzyEngOrTran = rightFuzzyEngOrTran;
            return this;
        }

        public ConditionBuilder rightFuzzyEngOrTran (String ... rightFuzzyEngOrTran){
            this.rightFuzzyEngOrTran = solveNullList(rightFuzzyEngOrTran);
            return this;
        }

        public ConditionBuilder engOrTranList(String ... engOrTran){
            this.engOrTranList = solveNullList(engOrTran);
            return this;
        }

        public ConditionBuilder engOrTranList(List<String> engOrTran){
            this.engOrTranList = engOrTran;
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

        public ConditionBuilder fuzzyTransmissionProductionData (List<String> fuzzyTransmissionProductionData){
            this.fuzzyTransmissionProductionData = fuzzyTransmissionProductionData;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionProductionData (String ... fuzzyTransmissionProductionData){
            this.fuzzyTransmissionProductionData = solveNullList(fuzzyTransmissionProductionData);
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionProductionData (List<String> rightFuzzyTransmissionProductionData){
            this.rightFuzzyTransmissionProductionData = rightFuzzyTransmissionProductionData;
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionProductionData (String ... rightFuzzyTransmissionProductionData){
            this.rightFuzzyTransmissionProductionData = solveNullList(rightFuzzyTransmissionProductionData);
            return this;
        }

        public ConditionBuilder transmissionProductionDataList(String ... transmissionProductionData){
            this.transmissionProductionDataList = solveNullList(transmissionProductionData);
            return this;
        }

        public ConditionBuilder transmissionProductionDataList(List<String> transmissionProductionData){
            this.transmissionProductionDataList = transmissionProductionData;
            return this;
        }

        public ConditionBuilder fuzzyFailureYear (List<String> fuzzyFailureYear){
            this.fuzzyFailureYear = fuzzyFailureYear;
            return this;
        }

        public ConditionBuilder fuzzyFailureYear (String ... fuzzyFailureYear){
            this.fuzzyFailureYear = solveNullList(fuzzyFailureYear);
            return this;
        }

        public ConditionBuilder rightFuzzyFailureYear (List<String> rightFuzzyFailureYear){
            this.rightFuzzyFailureYear = rightFuzzyFailureYear;
            return this;
        }

        public ConditionBuilder rightFuzzyFailureYear (String ... rightFuzzyFailureYear){
            this.rightFuzzyFailureYear = solveNullList(rightFuzzyFailureYear);
            return this;
        }

        public ConditionBuilder failureYearList(String ... failureYear){
            this.failureYearList = solveNullList(failureYear);
            return this;
        }

        public ConditionBuilder failureYearList(List<String> failureYear){
            this.failureYearList = failureYear;
            return this;
        }

        public ConditionBuilder fuzzyFailureMonth (List<String> fuzzyFailureMonth){
            this.fuzzyFailureMonth = fuzzyFailureMonth;
            return this;
        }

        public ConditionBuilder fuzzyFailureMonth (String ... fuzzyFailureMonth){
            this.fuzzyFailureMonth = solveNullList(fuzzyFailureMonth);
            return this;
        }

        public ConditionBuilder rightFuzzyFailureMonth (List<String> rightFuzzyFailureMonth){
            this.rightFuzzyFailureMonth = rightFuzzyFailureMonth;
            return this;
        }

        public ConditionBuilder rightFuzzyFailureMonth (String ... rightFuzzyFailureMonth){
            this.rightFuzzyFailureMonth = solveNullList(rightFuzzyFailureMonth);
            return this;
        }

        public ConditionBuilder failureMonthList(String ... failureMonth){
            this.failureMonthList = solveNullList(failureMonth);
            return this;
        }

        public ConditionBuilder failureMonthList(List<String> failureMonth){
            this.failureMonthList = failureMonth;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionShortCode (List<String> fuzzyTransmissionShortCode){
            this.fuzzyTransmissionShortCode = fuzzyTransmissionShortCode;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionShortCode (String ... fuzzyTransmissionShortCode){
            this.fuzzyTransmissionShortCode = solveNullList(fuzzyTransmissionShortCode);
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionShortCode (List<String> rightFuzzyTransmissionShortCode){
            this.rightFuzzyTransmissionShortCode = rightFuzzyTransmissionShortCode;
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionShortCode (String ... rightFuzzyTransmissionShortCode){
            this.rightFuzzyTransmissionShortCode = solveNullList(rightFuzzyTransmissionShortCode);
            return this;
        }

        public ConditionBuilder transmissionShortCodeList(String ... transmissionShortCode){
            this.transmissionShortCodeList = solveNullList(transmissionShortCode);
            return this;
        }

        public ConditionBuilder transmissionShortCodeList(List<String> transmissionShortCode){
            this.transmissionShortCodeList = transmissionShortCode;
            return this;
        }

        public ConditionBuilder fuzzyMileageDistribution (List<String> fuzzyMileageDistribution){
            this.fuzzyMileageDistribution = fuzzyMileageDistribution;
            return this;
        }

        public ConditionBuilder fuzzyMileageDistribution (String ... fuzzyMileageDistribution){
            this.fuzzyMileageDistribution = solveNullList(fuzzyMileageDistribution);
            return this;
        }

        public ConditionBuilder rightFuzzyMileageDistribution (List<String> rightFuzzyMileageDistribution){
            this.rightFuzzyMileageDistribution = rightFuzzyMileageDistribution;
            return this;
        }

        public ConditionBuilder rightFuzzyMileageDistribution (String ... rightFuzzyMileageDistribution){
            this.rightFuzzyMileageDistribution = solveNullList(rightFuzzyMileageDistribution);
            return this;
        }

        public ConditionBuilder mileageDistributionList(String ... mileageDistribution){
            this.mileageDistributionList = solveNullList(mileageDistribution);
            return this;
        }

        public ConditionBuilder mileageDistributionList(List<String> mileageDistribution){
            this.mileageDistributionList = mileageDistribution;
            return this;
        }

        public ConditionBuilder fuzzyTrackBeginer (List<String> fuzzyTrackBeginer){
            this.fuzzyTrackBeginer = fuzzyTrackBeginer;
            return this;
        }

        public ConditionBuilder fuzzyTrackBeginer (String ... fuzzyTrackBeginer){
            this.fuzzyTrackBeginer = solveNullList(fuzzyTrackBeginer);
            return this;
        }

        public ConditionBuilder rightFuzzyTrackBeginer (List<String> rightFuzzyTrackBeginer){
            this.rightFuzzyTrackBeginer = rightFuzzyTrackBeginer;
            return this;
        }

        public ConditionBuilder rightFuzzyTrackBeginer (String ... rightFuzzyTrackBeginer){
            this.rightFuzzyTrackBeginer = solveNullList(rightFuzzyTrackBeginer);
            return this;
        }

        public ConditionBuilder trackBeginerList(String ... trackBeginer){
            this.trackBeginerList = solveNullList(trackBeginer);
            return this;
        }

        public ConditionBuilder trackBeginerList(List<String> trackBeginer){
            this.trackBeginerList = trackBeginer;
            return this;
        }

        public ConditionBuilder fuzzyTrackBeginTime (List<String> fuzzyTrackBeginTime){
            this.fuzzyTrackBeginTime = fuzzyTrackBeginTime;
            return this;
        }

        public ConditionBuilder fuzzyTrackBeginTime (String ... fuzzyTrackBeginTime){
            this.fuzzyTrackBeginTime = solveNullList(fuzzyTrackBeginTime);
            return this;
        }

        public ConditionBuilder rightFuzzyTrackBeginTime (List<String> rightFuzzyTrackBeginTime){
            this.rightFuzzyTrackBeginTime = rightFuzzyTrackBeginTime;
            return this;
        }

        public ConditionBuilder rightFuzzyTrackBeginTime (String ... rightFuzzyTrackBeginTime){
            this.rightFuzzyTrackBeginTime = solveNullList(rightFuzzyTrackBeginTime);
            return this;
        }

        public ConditionBuilder trackBeginTimeList(String ... trackBeginTime){
            this.trackBeginTimeList = solveNullList(trackBeginTime);
            return this;
        }

        public ConditionBuilder trackBeginTimeList(List<String> trackBeginTime){
            this.trackBeginTimeList = trackBeginTime;
            return this;
        }

        public ConditionBuilder fuzzyDeliveryPerson (List<String> fuzzyDeliveryPerson){
            this.fuzzyDeliveryPerson = fuzzyDeliveryPerson;
            return this;
        }

        public ConditionBuilder fuzzyDeliveryPerson (String ... fuzzyDeliveryPerson){
            this.fuzzyDeliveryPerson = solveNullList(fuzzyDeliveryPerson);
            return this;
        }

        public ConditionBuilder rightFuzzyDeliveryPerson (List<String> rightFuzzyDeliveryPerson){
            this.rightFuzzyDeliveryPerson = rightFuzzyDeliveryPerson;
            return this;
        }

        public ConditionBuilder rightFuzzyDeliveryPerson (String ... rightFuzzyDeliveryPerson){
            this.rightFuzzyDeliveryPerson = solveNullList(rightFuzzyDeliveryPerson);
            return this;
        }

        public ConditionBuilder deliveryPersonList(String ... deliveryPerson){
            this.deliveryPersonList = solveNullList(deliveryPerson);
            return this;
        }

        public ConditionBuilder deliveryPersonList(List<String> deliveryPerson){
            this.deliveryPersonList = deliveryPerson;
            return this;
        }

        public ConditionBuilder fuzzyDeliveryDeadline (List<String> fuzzyDeliveryDeadline){
            this.fuzzyDeliveryDeadline = fuzzyDeliveryDeadline;
            return this;
        }

        public ConditionBuilder fuzzyDeliveryDeadline (String ... fuzzyDeliveryDeadline){
            this.fuzzyDeliveryDeadline = solveNullList(fuzzyDeliveryDeadline);
            return this;
        }

        public ConditionBuilder rightFuzzyDeliveryDeadline (List<String> rightFuzzyDeliveryDeadline){
            this.rightFuzzyDeliveryDeadline = rightFuzzyDeliveryDeadline;
            return this;
        }

        public ConditionBuilder rightFuzzyDeliveryDeadline (String ... rightFuzzyDeliveryDeadline){
            this.rightFuzzyDeliveryDeadline = solveNullList(rightFuzzyDeliveryDeadline);
            return this;
        }

        public ConditionBuilder deliveryDeadlineList(String ... deliveryDeadline){
            this.deliveryDeadlineList = solveNullList(deliveryDeadline);
            return this;
        }

        public ConditionBuilder deliveryDeadlineList(List<String> deliveryDeadline){
            this.deliveryDeadlineList = deliveryDeadline;
            return this;
        }

        public ConditionBuilder fuzzyDeliveryReceivedDate (List<String> fuzzyDeliveryReceivedDate){
            this.fuzzyDeliveryReceivedDate = fuzzyDeliveryReceivedDate;
            return this;
        }

        public ConditionBuilder fuzzyDeliveryReceivedDate (String ... fuzzyDeliveryReceivedDate){
            this.fuzzyDeliveryReceivedDate = solveNullList(fuzzyDeliveryReceivedDate);
            return this;
        }

        public ConditionBuilder rightFuzzyDeliveryReceivedDate (List<String> rightFuzzyDeliveryReceivedDate){
            this.rightFuzzyDeliveryReceivedDate = rightFuzzyDeliveryReceivedDate;
            return this;
        }

        public ConditionBuilder rightFuzzyDeliveryReceivedDate (String ... rightFuzzyDeliveryReceivedDate){
            this.rightFuzzyDeliveryReceivedDate = solveNullList(rightFuzzyDeliveryReceivedDate);
            return this;
        }

        public ConditionBuilder deliveryReceivedDateList(String ... deliveryReceivedDate){
            this.deliveryReceivedDateList = solveNullList(deliveryReceivedDate);
            return this;
        }

        public ConditionBuilder deliveryReceivedDateList(List<String> deliveryReceivedDate){
            this.deliveryReceivedDateList = deliveryReceivedDate;
            return this;
        }

        public ConditionBuilder failureTrackIdBetWeen(Integer failureTrackIdSt,Integer failureTrackIdEd){
            this.failureTrackIdSt = failureTrackIdSt;
            this.failureTrackIdEd = failureTrackIdEd;
            return this;
        }

        public ConditionBuilder failureTrackIdGreaterEqThan(Integer failureTrackIdSt){
            this.failureTrackIdSt = failureTrackIdSt;
            return this;
        }
        public ConditionBuilder failureTrackIdLessEqThan(Integer failureTrackIdEd){
            this.failureTrackIdEd = failureTrackIdEd;
            return this;
        }


        public ConditionBuilder failureTrackIdList(Integer ... failureTrackId){
            this.failureTrackIdList = solveNullList(failureTrackId);
            return this;
        }

        public ConditionBuilder failureTrackIdList(List<Integer> failureTrackId){
            this.failureTrackIdList = failureTrackId;
            return this;
        }

        public ConditionBuilder applierIdBetWeen(Integer applierIdSt,Integer applierIdEd){
            this.applierIdSt = applierIdSt;
            this.applierIdEd = applierIdEd;
            return this;
        }

        public ConditionBuilder applierIdGreaterEqThan(Integer applierIdSt){
            this.applierIdSt = applierIdSt;
            return this;
        }
        public ConditionBuilder applierIdLessEqThan(Integer applierIdEd){
            this.applierIdEd = applierIdEd;
            return this;
        }


        public ConditionBuilder applierIdList(Integer ... applierId){
            this.applierIdList = solveNullList(applierId);
            return this;
        }

        public ConditionBuilder applierIdList(List<Integer> applierId){
            this.applierIdList = applierId;
            return this;
        }

        public ConditionBuilder fuzzyApplierName (List<String> fuzzyApplierName){
            this.fuzzyApplierName = fuzzyApplierName;
            return this;
        }

        public ConditionBuilder fuzzyApplierName (String ... fuzzyApplierName){
            this.fuzzyApplierName = solveNullList(fuzzyApplierName);
            return this;
        }

        public ConditionBuilder rightFuzzyApplierName (List<String> rightFuzzyApplierName){
            this.rightFuzzyApplierName = rightFuzzyApplierName;
            return this;
        }

        public ConditionBuilder rightFuzzyApplierName (String ... rightFuzzyApplierName){
            this.rightFuzzyApplierName = solveNullList(rightFuzzyApplierName);
            return this;
        }

        public ConditionBuilder applierNameList(String ... applierName){
            this.applierNameList = solveNullList(applierName);
            return this;
        }

        public ConditionBuilder applierNameList(List<String> applierName){
            this.applierNameList = applierName;
            return this;
        }

        public ConditionBuilder fuzzyApplyTime (List<String> fuzzyApplyTime){
            this.fuzzyApplyTime = fuzzyApplyTime;
            return this;
        }

        public ConditionBuilder fuzzyApplyTime (String ... fuzzyApplyTime){
            this.fuzzyApplyTime = solveNullList(fuzzyApplyTime);
            return this;
        }

        public ConditionBuilder rightFuzzyApplyTime (List<String> rightFuzzyApplyTime){
            this.rightFuzzyApplyTime = rightFuzzyApplyTime;
            return this;
        }

        public ConditionBuilder rightFuzzyApplyTime (String ... rightFuzzyApplyTime){
            this.rightFuzzyApplyTime = solveNullList(rightFuzzyApplyTime);
            return this;
        }

        public ConditionBuilder applyTimeList(String ... applyTime){
            this.applyTimeList = solveNullList(applyTime);
            return this;
        }

        public ConditionBuilder applyTimeList(List<String> applyTime){
            this.applyTimeList = applyTime;
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
        public Builder voucherCode(String voucherCode){
            this.obj.setVoucherCode(voucherCode);
            return this;
        }
        public Builder claimCode(String claimCode){
            this.obj.setClaimCode(claimCode);
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
        public Builder productionCode(String productionCode){
            this.obj.setProductionCode(productionCode);
            return this;
        }
        public Builder partsCode(String partsCode){
            this.obj.setPartsCode(partsCode);
            return this;
        }
        public Builder partsName(String partsName){
            this.obj.setPartsName(partsName);
            return this;
        }
        public Builder divisionLevel1(String divisionLevel1){
            this.obj.setDivisionLevel1(divisionLevel1);
            return this;
        }
        public Builder divisionLevel2(String divisionLevel2){
            this.obj.setDivisionLevel2(divisionLevel2);
            return this;
        }
        public Builder divisionLevel3(String divisionLevel3){
            this.obj.setDivisionLevel3(divisionLevel3);
            return this;
        }
        public Builder partsAndSymptom(String partsAndSymptom){
            this.obj.setPartsAndSymptom(partsAndSymptom);
            return this;
        }
        public Builder offlineDate(String offlineDate){
            this.obj.setOfflineDate(offlineDate);
            return this;
        }
        public Builder salesDate(String salesDate){
            this.obj.setSalesDate(salesDate);
            return this;
        }
        public Builder failureDate(String failureDate){
            this.obj.setFailureDate(failureDate);
            return this;
        }
        public Builder mileage(Integer mileage){
            this.obj.setMileage(mileage);
            return this;
        }
        public Builder confirmDate(String confirmDate){
            this.obj.setConfirmDate(confirmDate);
            return this;
        }
        public Builder warehousingDate(String warehousingDate){
            this.obj.setWarehousingDate(warehousingDate);
            return this;
        }
        public Builder transportDate(String transportDate){
            this.obj.setTransportDate(transportDate);
            return this;
        }
        public Builder shopArrivalDate(String shopArrivalDate){
            this.obj.setShopArrivalDate(shopArrivalDate);
            return this;
        }
        public Builder salesFailureTime(Integer salesFailureTime){
            this.obj.setSalesFailureTime(salesFailureTime);
            return this;
        }
        public Builder failureDesc(String failureDesc){
            this.obj.setFailureDesc(failureDesc);
            return this;
        }
        public Builder diagnosticResult(String diagnosticResult){
            this.obj.setDiagnosticResult(diagnosticResult);
            return this;
        }
        public Builder manCost(java.math.BigDecimal manCost){
            this.obj.setManCost(manCost);
            return this;
        }
        public Builder materialCost(java.math.BigDecimal materialCost){
            this.obj.setMaterialCost(materialCost);
            return this;
        }
        public Builder materialManagementCost(java.math.BigDecimal materialManagementCost){
            this.obj.setMaterialManagementCost(materialManagementCost);
            return this;
        }
        public Builder goOutCost(java.math.BigDecimal goOutCost){
            this.obj.setGoOutCost(goOutCost);
            return this;
        }
        public Builder maintainingCost(java.math.BigDecimal maintainingCost){
            this.obj.setMaintainingCost(maintainingCost);
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
        public Builder newPartsBond(String newPartsBond){
            this.obj.setNewPartsBond(newPartsBond);
            return this;
        }
        public Builder submitDate(String submitDate){
            this.obj.setSubmitDate(submitDate);
            return this;
        }
        public Builder egtypeCode(String egtypeCode){
            this.obj.setEgtypeCode(egtypeCode);
            return this;
        }
        public Builder transmissionCode(String transmissionCode){
            this.obj.setTransmissionCode(transmissionCode);
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
        public Builder engType(String engType){
            this.obj.setEngType(engType);
            return this;
        }
        public Builder transmissionCodeRe(String transmissionCodeRe){
            this.obj.setTransmissionCodeRe(transmissionCodeRe);
            return this;
        }
        public Builder tranTypeDetail(String tranTypeDetail){
            this.obj.setTranTypeDetail(tranTypeDetail);
            return this;
        }
        public Builder transmissionManufacturer(String transmissionManufacturer){
            this.obj.setTransmissionManufacturer(transmissionManufacturer);
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
        public Builder productionRawDescription(String productionRawDescription){
            this.obj.setProductionRawDescription(productionRawDescription);
            return this;
        }
        public Builder PDI(String PDI){
            this.obj.setPDI(PDI);
            return this;
        }
        public Builder offlineFailureTime(Integer offlineFailureTime){
            this.obj.setOfflineFailureTime(offlineFailureTime);
            return this;
        }
        public Builder transmissionComfirmTime(String transmissionComfirmTime){
            this.obj.setTransmissionComfirmTime(transmissionComfirmTime);
            return this;
        }
        public Builder engOrTran(String engOrTran){
            this.obj.setEngOrTran(engOrTran);
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
        public Builder transmissionProductionData(String transmissionProductionData){
            this.obj.setTransmissionProductionData(transmissionProductionData);
            return this;
        }
        public Builder failureYear(String failureYear){
            this.obj.setFailureYear(failureYear);
            return this;
        }
        public Builder failureMonth(String failureMonth){
            this.obj.setFailureMonth(failureMonth);
            return this;
        }
        public Builder transmissionShortCode(String transmissionShortCode){
            this.obj.setTransmissionShortCode(transmissionShortCode);
            return this;
        }
        public Builder mileageDistribution(String mileageDistribution){
            this.obj.setMileageDistribution(mileageDistribution);
            return this;
        }
        public Builder trackBeginer(String trackBeginer){
            this.obj.setTrackBeginer(trackBeginer);
            return this;
        }
        public Builder trackBeginTime(String trackBeginTime){
            this.obj.setTrackBeginTime(trackBeginTime);
            return this;
        }
        public Builder deliveryPerson(String deliveryPerson){
            this.obj.setDeliveryPerson(deliveryPerson);
            return this;
        }
        public Builder deliveryDeadline(String deliveryDeadline){
            this.obj.setDeliveryDeadline(deliveryDeadline);
            return this;
        }
        public Builder deliveryReceivedDate(String deliveryReceivedDate){
            this.obj.setDeliveryReceivedDate(deliveryReceivedDate);
            return this;
        }
        public Builder failureTrackId(Integer failureTrackId){
            this.obj.setFailureTrackId(failureTrackId);
            return this;
        }
        public Builder applierId(Integer applierId){
            this.obj.setApplierId(applierId);
            return this;
        }
        public Builder applierName(String applierName){
            this.obj.setApplierName(applierName);
            return this;
        }
        public Builder applyTime(String applyTime){
            this.obj.setApplyTime(applyTime);
            return this;
        }
        public MqmsVoucher build(){return obj;}
    }

}
