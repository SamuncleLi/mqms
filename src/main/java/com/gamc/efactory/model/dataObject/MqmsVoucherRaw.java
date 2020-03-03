package com.gamc.efactory.model.dataObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author lizeh
*/
public class MqmsVoucherRaw implements Serializable {

    private static final long serialVersionUID = 1583200472823L;


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

    public void setApplierId(Integer applierId){this.applierId = applierId;}

    public Integer getApplierId(){return this.applierId;}

    public void setApplierName(String applierName){this.applierName = applierName;}

    public String getApplierName(){return this.applierName;}

    public void setApplyTime(String applyTime){this.applyTime = applyTime;}

    public String getApplyTime(){return this.applyTime;}
    @Override
    public String toString() {
        return "MqmsVoucherRaw{" +
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

        private MqmsVoucherRaw set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsVoucherRaw set){
            this.set = set;
            return this;
        }

        public MqmsVoucherRaw getSet(){
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

    public static class QueryBuilder extends MqmsVoucherRaw{
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

        public MqmsVoucherRaw build(){return this;}
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

        private MqmsVoucherRaw obj;

        public Builder(){
            this.obj = new MqmsVoucherRaw();
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
        public MqmsVoucherRaw build(){return obj;}
    }

}
