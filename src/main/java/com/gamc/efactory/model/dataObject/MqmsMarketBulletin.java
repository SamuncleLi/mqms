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
public class MqmsMarketBulletin implements Serializable {

    private static final long serialVersionUID = 1586703626510L;


    /**
    * 主键
    * 通报id
    * isNullAble:0
    */
    private Integer marketBulletinId;

    /**
    * 故障时间
    * isNullAble:1
    */
    private String failureDate;

    /**
    * VIN码
    * isNullAble:1
    */
    private String vinCode;

    /**
    * 短码
    * isNullAble:1
    */
    private String shortCode;

    /**
    * 变速箱类别
    * isNullAble:1
    */
    private String transCategory;

    /**
    * 发动机号
    * isNullAble:1
    */
    private String engCode;

    /**
    * 车型
    * isNullAble:1
    */
    private String carModel;

    /**
    * 发动机类型
    * isNullAble:1
    */
    private String engType;

    /**
    * 变速箱类型
    * isNullAble:1
    */
    private String transType;

    /**
    * 生产日期
    * isNullAble:1
    */
    private String manufactureDate;

    /**
    * 信息来源
    * isNullAble:1
    */
    private String inforSource;

    /**
    * 销售日期
    * isNullAble:1
    */
    private String salesDate;

    /**
    * 零件名称
    * isNullAble:1
    */
    private String partsName;

    /**
    * 主题
    * isNullAble:1
    */
    private String theme;

    /**
    * 对策状态
    * isNullAble:1
    */
    private String countermeasureState;

    /**
    * 店名
    * isNullAble:1
    */
    private String dealerName;

    /**
    * 里程
    * isNullAble:1
    */
    private Integer mileage;

    /**
    * 问诊内容
    * isNullAble:1
    */
    private String failureDesc;

    /**
    * 诊断结果
    * isNullAble:1
    */
    private String diagnosticResult;

    /**
    * 维修保养履历
    * isNullAble:1
    */
    private String maintenanceRecord;

    /**
    * 解析及进展
    * isNullAble:1
    */
    private String analyticalProgress;

    /**
    * 是否与ST存在争议
    * isNullAble:1
    */
    private String controversyWithST;

    /**
    * 处理方案
    * isNullAble:1
    */
    private String settleScheme;

    /**
    * 索赔形式
    * isNullAble:1
    */
    private String claimForm;

    /**
    * ST处理方案
    * isNullAble:1
    */
    private String processingSchemeST;

    /**
    * 返回进度
    * isNullAble:1
    */
    private String returnProgress;

    /**
    * 返回方式
    * isNullAble:1
    */
    private String returnMode;

    /**
    * 快递到达时间
    * isNullAble:1
    */
    private String deliveryReceivedDate;

    /**
    * UserID
    * isNullAble:1
    */
    private Integer applierId;

    /**
    * 上传人
    * isNullAble:1
    */
    private String applierName;

    /**
    * 上传时间
    * isNullAble:1
    */
    private String applyTime;


    public void setMarketBulletinId(Integer marketBulletinId){this.marketBulletinId = marketBulletinId;}

    public Integer getMarketBulletinId(){return this.marketBulletinId;}

    public void setFailureDate(String failureDate){this.failureDate = failureDate;}

    public String getFailureDate(){return this.failureDate;}

    public void setVinCode(String vinCode){this.vinCode = vinCode;}

    public String getVinCode(){return this.vinCode;}

    public void setShortCode(String shortCode){this.shortCode = shortCode;}

    public String getShortCode(){return this.shortCode;}

    public void setTransCategory(String transCategory){this.transCategory = transCategory;}

    public String getTransCategory(){return this.transCategory;}

    public void setEngCode(String engCode){this.engCode = engCode;}

    public String getEngCode(){return this.engCode;}

    public void setCarModel(String carModel){this.carModel = carModel;}

    public String getCarModel(){return this.carModel;}

    public void setEngType(String engType){this.engType = engType;}

    public String getEngType(){return this.engType;}

    public void setTransType(String transType){this.transType = transType;}

    public String getTransType(){return this.transType;}

    public void setManufactureDate(String manufactureDate){this.manufactureDate = manufactureDate;}

    public String getManufactureDate(){return this.manufactureDate;}

    public void setInforSource(String inforSource){this.inforSource = inforSource;}

    public String getInforSource(){return this.inforSource;}

    public void setSalesDate(String salesDate){this.salesDate = salesDate;}

    public String getSalesDate(){return this.salesDate;}

    public void setPartsName(String partsName){this.partsName = partsName;}

    public String getPartsName(){return this.partsName;}

    public void setTheme(String theme){this.theme = theme;}

    public String getTheme(){return this.theme;}

    public void setCountermeasureState(String countermeasureState){this.countermeasureState = countermeasureState;}

    public String getCountermeasureState(){return this.countermeasureState;}

    public void setDealerName(String dealerName){this.dealerName = dealerName;}

    public String getDealerName(){return this.dealerName;}

    public void setMileage(Integer mileage){this.mileage = mileage;}

    public Integer getMileage(){return this.mileage;}

    public void setFailureDesc(String failureDesc){this.failureDesc = failureDesc;}

    public String getFailureDesc(){return this.failureDesc;}

    public void setDiagnosticResult(String diagnosticResult){this.diagnosticResult = diagnosticResult;}

    public String getDiagnosticResult(){return this.diagnosticResult;}

    public void setMaintenanceRecord(String maintenanceRecord){this.maintenanceRecord = maintenanceRecord;}

    public String getMaintenanceRecord(){return this.maintenanceRecord;}

    public void setAnalyticalProgress(String analyticalProgress){this.analyticalProgress = analyticalProgress;}

    public String getAnalyticalProgress(){return this.analyticalProgress;}

    public void setControversyWithST(String controversyWithST){this.controversyWithST = controversyWithST;}

    public String getControversyWithST(){return this.controversyWithST;}

    public void setSettleScheme(String settleScheme){this.settleScheme = settleScheme;}

    public String getSettleScheme(){return this.settleScheme;}

    public void setClaimForm(String claimForm){this.claimForm = claimForm;}

    public String getClaimForm(){return this.claimForm;}

    public void setProcessingSchemeST(String processingSchemeST){this.processingSchemeST = processingSchemeST;}

    public String getProcessingSchemeST(){return this.processingSchemeST;}

    public void setReturnProgress(String returnProgress){this.returnProgress = returnProgress;}

    public String getReturnProgress(){return this.returnProgress;}

    public void setReturnMode(String returnMode){this.returnMode = returnMode;}

    public String getReturnMode(){return this.returnMode;}

    public void setDeliveryReceivedDate(String deliveryReceivedDate){this.deliveryReceivedDate = deliveryReceivedDate;}

    public String getDeliveryReceivedDate(){return this.deliveryReceivedDate;}

    public void setApplierId(Integer applierId){this.applierId = applierId;}

    public Integer getApplierId(){return this.applierId;}

    public void setApplierName(String applierName){this.applierName = applierName;}

    public String getApplierName(){return this.applierName;}

    public void setApplyTime(String applyTime){this.applyTime = applyTime;}

    public String getApplyTime(){return this.applyTime;}
    @Override
    public String toString() {
        return "MqmsMarketBulletin{" +
                "marketBulletinId='" + marketBulletinId + '\'' +
                "failureDate='" + failureDate + '\'' +
                "vinCode='" + vinCode + '\'' +
                "shortCode='" + shortCode + '\'' +
                "transCategory='" + transCategory + '\'' +
                "engCode='" + engCode + '\'' +
                "carModel='" + carModel + '\'' +
                "engType='" + engType + '\'' +
                "transType='" + transType + '\'' +
                "manufactureDate='" + manufactureDate + '\'' +
                "inforSource='" + inforSource + '\'' +
                "salesDate='" + salesDate + '\'' +
                "partsName='" + partsName + '\'' +
                "theme='" + theme + '\'' +
                "countermeasureState='" + countermeasureState + '\'' +
                "dealerName='" + dealerName + '\'' +
                "mileage='" + mileage + '\'' +
                "failureDesc='" + failureDesc + '\'' +
                "diagnosticResult='" + diagnosticResult + '\'' +
                "maintenanceRecord='" + maintenanceRecord + '\'' +
                "analyticalProgress='" + analyticalProgress + '\'' +
                "controversyWithST='" + controversyWithST + '\'' +
                "settleScheme='" + settleScheme + '\'' +
                "claimForm='" + claimForm + '\'' +
                "processingSchemeST='" + processingSchemeST + '\'' +
                "returnProgress='" + returnProgress + '\'' +
                "returnMode='" + returnMode + '\'' +
                "deliveryReceivedDate='" + deliveryReceivedDate + '\'' +
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

        private MqmsMarketBulletin set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsMarketBulletin set){
            this.set = set;
            return this;
        }

        public MqmsMarketBulletin getSet(){
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

    public static class QueryBuilder extends MqmsMarketBulletin{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> marketBulletinIdList;

        public List<Integer> getMarketBulletinIdList(){return this.marketBulletinIdList;}

        private Integer marketBulletinIdSt;

        private Integer marketBulletinIdEd;

        public Integer getMarketBulletinIdSt(){return this.marketBulletinIdSt;}

        public Integer getMarketBulletinIdEd(){return this.marketBulletinIdEd;}

        private List<String> failureDateList;

        public List<String> getFailureDateList(){return this.failureDateList;}


        private List<String> fuzzyFailureDate;

        public List<String> getFuzzyFailureDate(){return this.fuzzyFailureDate;}

        private List<String> rightFuzzyFailureDate;

        public List<String> getRightFuzzyFailureDate(){return this.rightFuzzyFailureDate;}
        private List<String> vinCodeList;

        public List<String> getVinCodeList(){return this.vinCodeList;}


        private List<String> fuzzyVinCode;

        public List<String> getFuzzyVinCode(){return this.fuzzyVinCode;}

        private List<String> rightFuzzyVinCode;

        public List<String> getRightFuzzyVinCode(){return this.rightFuzzyVinCode;}
        private List<String> shortCodeList;

        public List<String> getShortCodeList(){return this.shortCodeList;}


        private List<String> fuzzyShortCode;

        public List<String> getFuzzyShortCode(){return this.fuzzyShortCode;}

        private List<String> rightFuzzyShortCode;

        public List<String> getRightFuzzyShortCode(){return this.rightFuzzyShortCode;}
        private List<String> transCategoryList;

        public List<String> getTransCategoryList(){return this.transCategoryList;}


        private List<String> fuzzyTransCategory;

        public List<String> getFuzzyTransCategory(){return this.fuzzyTransCategory;}

        private List<String> rightFuzzyTransCategory;

        public List<String> getRightFuzzyTransCategory(){return this.rightFuzzyTransCategory;}
        private List<String> engCodeList;

        public List<String> getEngCodeList(){return this.engCodeList;}


        private List<String> fuzzyEngCode;

        public List<String> getFuzzyEngCode(){return this.fuzzyEngCode;}

        private List<String> rightFuzzyEngCode;

        public List<String> getRightFuzzyEngCode(){return this.rightFuzzyEngCode;}
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
        private List<String> transTypeList;

        public List<String> getTransTypeList(){return this.transTypeList;}


        private List<String> fuzzyTransType;

        public List<String> getFuzzyTransType(){return this.fuzzyTransType;}

        private List<String> rightFuzzyTransType;

        public List<String> getRightFuzzyTransType(){return this.rightFuzzyTransType;}
        private List<String> manufactureDateList;

        public List<String> getManufactureDateList(){return this.manufactureDateList;}


        private List<String> fuzzyManufactureDate;

        public List<String> getFuzzyManufactureDate(){return this.fuzzyManufactureDate;}

        private List<String> rightFuzzyManufactureDate;

        public List<String> getRightFuzzyManufactureDate(){return this.rightFuzzyManufactureDate;}
        private List<String> inforSourceList;

        public List<String> getInforSourceList(){return this.inforSourceList;}


        private List<String> fuzzyInforSource;

        public List<String> getFuzzyInforSource(){return this.fuzzyInforSource;}

        private List<String> rightFuzzyInforSource;

        public List<String> getRightFuzzyInforSource(){return this.rightFuzzyInforSource;}
        private List<String> salesDateList;

        public List<String> getSalesDateList(){return this.salesDateList;}


        private List<String> fuzzySalesDate;

        public List<String> getFuzzySalesDate(){return this.fuzzySalesDate;}

        private List<String> rightFuzzySalesDate;

        public List<String> getRightFuzzySalesDate(){return this.rightFuzzySalesDate;}
        private List<String> partsNameList;

        public List<String> getPartsNameList(){return this.partsNameList;}


        private List<String> fuzzyPartsName;

        public List<String> getFuzzyPartsName(){return this.fuzzyPartsName;}

        private List<String> rightFuzzyPartsName;

        public List<String> getRightFuzzyPartsName(){return this.rightFuzzyPartsName;}
        private List<String> themeList;

        public List<String> getThemeList(){return this.themeList;}


        private List<String> fuzzyTheme;

        public List<String> getFuzzyTheme(){return this.fuzzyTheme;}

        private List<String> rightFuzzyTheme;

        public List<String> getRightFuzzyTheme(){return this.rightFuzzyTheme;}
        private List<String> countermeasureStateList;

        public List<String> getCountermeasureStateList(){return this.countermeasureStateList;}


        private List<String> fuzzyCountermeasureState;

        public List<String> getFuzzyCountermeasureState(){return this.fuzzyCountermeasureState;}

        private List<String> rightFuzzyCountermeasureState;

        public List<String> getRightFuzzyCountermeasureState(){return this.rightFuzzyCountermeasureState;}
        private List<String> dealerNameList;

        public List<String> getDealerNameList(){return this.dealerNameList;}


        private List<String> fuzzyDealerName;

        public List<String> getFuzzyDealerName(){return this.fuzzyDealerName;}

        private List<String> rightFuzzyDealerName;

        public List<String> getRightFuzzyDealerName(){return this.rightFuzzyDealerName;}
        private List<Integer> mileageList;

        public List<Integer> getMileageList(){return this.mileageList;}

        private Integer mileageSt;

        private Integer mileageEd;

        public Integer getMileageSt(){return this.mileageSt;}

        public Integer getMileageEd(){return this.mileageEd;}

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
        private List<String> maintenanceRecordList;

        public List<String> getMaintenanceRecordList(){return this.maintenanceRecordList;}


        private List<String> fuzzyMaintenanceRecord;

        public List<String> getFuzzyMaintenanceRecord(){return this.fuzzyMaintenanceRecord;}

        private List<String> rightFuzzyMaintenanceRecord;

        public List<String> getRightFuzzyMaintenanceRecord(){return this.rightFuzzyMaintenanceRecord;}
        private List<String> analyticalProgressList;

        public List<String> getAnalyticalProgressList(){return this.analyticalProgressList;}


        private List<String> fuzzyAnalyticalProgress;

        public List<String> getFuzzyAnalyticalProgress(){return this.fuzzyAnalyticalProgress;}

        private List<String> rightFuzzyAnalyticalProgress;

        public List<String> getRightFuzzyAnalyticalProgress(){return this.rightFuzzyAnalyticalProgress;}
        private List<String> controversyWithSTList;

        public List<String> getControversyWithSTList(){return this.controversyWithSTList;}


        private List<String> fuzzyControversyWithST;

        public List<String> getFuzzyControversyWithST(){return this.fuzzyControversyWithST;}

        private List<String> rightFuzzyControversyWithST;

        public List<String> getRightFuzzyControversyWithST(){return this.rightFuzzyControversyWithST;}
        private List<String> settleSchemeList;

        public List<String> getSettleSchemeList(){return this.settleSchemeList;}


        private List<String> fuzzySettleScheme;

        public List<String> getFuzzySettleScheme(){return this.fuzzySettleScheme;}

        private List<String> rightFuzzySettleScheme;

        public List<String> getRightFuzzySettleScheme(){return this.rightFuzzySettleScheme;}
        private List<String> claimFormList;

        public List<String> getClaimFormList(){return this.claimFormList;}


        private List<String> fuzzyClaimForm;

        public List<String> getFuzzyClaimForm(){return this.fuzzyClaimForm;}

        private List<String> rightFuzzyClaimForm;

        public List<String> getRightFuzzyClaimForm(){return this.rightFuzzyClaimForm;}
        private List<String> processingSchemeSTList;

        public List<String> getProcessingSchemeSTList(){return this.processingSchemeSTList;}


        private List<String> fuzzyProcessingSchemeST;

        public List<String> getFuzzyProcessingSchemeST(){return this.fuzzyProcessingSchemeST;}

        private List<String> rightFuzzyProcessingSchemeST;

        public List<String> getRightFuzzyProcessingSchemeST(){return this.rightFuzzyProcessingSchemeST;}
        private List<String> returnProgressList;

        public List<String> getReturnProgressList(){return this.returnProgressList;}


        private List<String> fuzzyReturnProgress;

        public List<String> getFuzzyReturnProgress(){return this.fuzzyReturnProgress;}

        private List<String> rightFuzzyReturnProgress;

        public List<String> getRightFuzzyReturnProgress(){return this.rightFuzzyReturnProgress;}
        private List<String> returnModeList;

        public List<String> getReturnModeList(){return this.returnModeList;}


        private List<String> fuzzyReturnMode;

        public List<String> getFuzzyReturnMode(){return this.fuzzyReturnMode;}

        private List<String> rightFuzzyReturnMode;

        public List<String> getRightFuzzyReturnMode(){return this.rightFuzzyReturnMode;}
        private List<String> deliveryReceivedDateList;

        public List<String> getDeliveryReceivedDateList(){return this.deliveryReceivedDateList;}


        private List<String> fuzzyDeliveryReceivedDate;

        public List<String> getFuzzyDeliveryReceivedDate(){return this.fuzzyDeliveryReceivedDate;}

        private List<String> rightFuzzyDeliveryReceivedDate;

        public List<String> getRightFuzzyDeliveryReceivedDate(){return this.rightFuzzyDeliveryReceivedDate;}
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

        public QueryBuilder marketBulletinIdBetWeen(Integer marketBulletinIdSt,Integer marketBulletinIdEd){
            this.marketBulletinIdSt = marketBulletinIdSt;
            this.marketBulletinIdEd = marketBulletinIdEd;
            return this;
        }

        public QueryBuilder marketBulletinIdGreaterEqThan(Integer marketBulletinIdSt){
            this.marketBulletinIdSt = marketBulletinIdSt;
            return this;
        }
        public QueryBuilder marketBulletinIdLessEqThan(Integer marketBulletinIdEd){
            this.marketBulletinIdEd = marketBulletinIdEd;
            return this;
        }


        public QueryBuilder marketBulletinId(Integer marketBulletinId){
            setMarketBulletinId(marketBulletinId);
            return this;
        }

        public QueryBuilder marketBulletinIdList(Integer ... marketBulletinId){
            this.marketBulletinIdList = solveNullList(marketBulletinId);
            return this;
        }

        public QueryBuilder marketBulletinIdList(List<Integer> marketBulletinId){
            this.marketBulletinIdList = marketBulletinId;
            return this;
        }

        public QueryBuilder fetchMarketBulletinId(){
            setFetchFields("fetchFields","marketBulletinId");
            return this;
        }

        public QueryBuilder excludeMarketBulletinId(){
            setFetchFields("excludeFields","marketBulletinId");
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

        public QueryBuilder fuzzyTransCategory (List<String> fuzzyTransCategory){
            this.fuzzyTransCategory = fuzzyTransCategory;
            return this;
        }

        public QueryBuilder fuzzyTransCategory (String ... fuzzyTransCategory){
            this.fuzzyTransCategory = solveNullList(fuzzyTransCategory);
            return this;
        }

        public QueryBuilder rightFuzzyTransCategory (List<String> rightFuzzyTransCategory){
            this.rightFuzzyTransCategory = rightFuzzyTransCategory;
            return this;
        }

        public QueryBuilder rightFuzzyTransCategory (String ... rightFuzzyTransCategory){
            this.rightFuzzyTransCategory = solveNullList(rightFuzzyTransCategory);
            return this;
        }

        public QueryBuilder transCategory(String transCategory){
            setTransCategory(transCategory);
            return this;
        }

        public QueryBuilder transCategoryList(String ... transCategory){
            this.transCategoryList = solveNullList(transCategory);
            return this;
        }

        public QueryBuilder transCategoryList(List<String> transCategory){
            this.transCategoryList = transCategory;
            return this;
        }

        public QueryBuilder fetchTransCategory(){
            setFetchFields("fetchFields","transCategory");
            return this;
        }

        public QueryBuilder excludeTransCategory(){
            setFetchFields("excludeFields","transCategory");
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

        public QueryBuilder fuzzyTransType (List<String> fuzzyTransType){
            this.fuzzyTransType = fuzzyTransType;
            return this;
        }

        public QueryBuilder fuzzyTransType (String ... fuzzyTransType){
            this.fuzzyTransType = solveNullList(fuzzyTransType);
            return this;
        }

        public QueryBuilder rightFuzzyTransType (List<String> rightFuzzyTransType){
            this.rightFuzzyTransType = rightFuzzyTransType;
            return this;
        }

        public QueryBuilder rightFuzzyTransType (String ... rightFuzzyTransType){
            this.rightFuzzyTransType = solveNullList(rightFuzzyTransType);
            return this;
        }

        public QueryBuilder transType(String transType){
            setTransType(transType);
            return this;
        }

        public QueryBuilder transTypeList(String ... transType){
            this.transTypeList = solveNullList(transType);
            return this;
        }

        public QueryBuilder transTypeList(List<String> transType){
            this.transTypeList = transType;
            return this;
        }

        public QueryBuilder fetchTransType(){
            setFetchFields("fetchFields","transType");
            return this;
        }

        public QueryBuilder excludeTransType(){
            setFetchFields("excludeFields","transType");
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

        public QueryBuilder fuzzyInforSource (List<String> fuzzyInforSource){
            this.fuzzyInforSource = fuzzyInforSource;
            return this;
        }

        public QueryBuilder fuzzyInforSource (String ... fuzzyInforSource){
            this.fuzzyInforSource = solveNullList(fuzzyInforSource);
            return this;
        }

        public QueryBuilder rightFuzzyInforSource (List<String> rightFuzzyInforSource){
            this.rightFuzzyInforSource = rightFuzzyInforSource;
            return this;
        }

        public QueryBuilder rightFuzzyInforSource (String ... rightFuzzyInforSource){
            this.rightFuzzyInforSource = solveNullList(rightFuzzyInforSource);
            return this;
        }

        public QueryBuilder inforSource(String inforSource){
            setInforSource(inforSource);
            return this;
        }

        public QueryBuilder inforSourceList(String ... inforSource){
            this.inforSourceList = solveNullList(inforSource);
            return this;
        }

        public QueryBuilder inforSourceList(List<String> inforSource){
            this.inforSourceList = inforSource;
            return this;
        }

        public QueryBuilder fetchInforSource(){
            setFetchFields("fetchFields","inforSource");
            return this;
        }

        public QueryBuilder excludeInforSource(){
            setFetchFields("excludeFields","inforSource");
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

        public QueryBuilder fuzzyCountermeasureState (List<String> fuzzyCountermeasureState){
            this.fuzzyCountermeasureState = fuzzyCountermeasureState;
            return this;
        }

        public QueryBuilder fuzzyCountermeasureState (String ... fuzzyCountermeasureState){
            this.fuzzyCountermeasureState = solveNullList(fuzzyCountermeasureState);
            return this;
        }

        public QueryBuilder rightFuzzyCountermeasureState (List<String> rightFuzzyCountermeasureState){
            this.rightFuzzyCountermeasureState = rightFuzzyCountermeasureState;
            return this;
        }

        public QueryBuilder rightFuzzyCountermeasureState (String ... rightFuzzyCountermeasureState){
            this.rightFuzzyCountermeasureState = solveNullList(rightFuzzyCountermeasureState);
            return this;
        }

        public QueryBuilder countermeasureState(String countermeasureState){
            setCountermeasureState(countermeasureState);
            return this;
        }

        public QueryBuilder countermeasureStateList(String ... countermeasureState){
            this.countermeasureStateList = solveNullList(countermeasureState);
            return this;
        }

        public QueryBuilder countermeasureStateList(List<String> countermeasureState){
            this.countermeasureStateList = countermeasureState;
            return this;
        }

        public QueryBuilder fetchCountermeasureState(){
            setFetchFields("fetchFields","countermeasureState");
            return this;
        }

        public QueryBuilder excludeCountermeasureState(){
            setFetchFields("excludeFields","countermeasureState");
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

        public QueryBuilder fuzzyMaintenanceRecord (List<String> fuzzyMaintenanceRecord){
            this.fuzzyMaintenanceRecord = fuzzyMaintenanceRecord;
            return this;
        }

        public QueryBuilder fuzzyMaintenanceRecord (String ... fuzzyMaintenanceRecord){
            this.fuzzyMaintenanceRecord = solveNullList(fuzzyMaintenanceRecord);
            return this;
        }

        public QueryBuilder rightFuzzyMaintenanceRecord (List<String> rightFuzzyMaintenanceRecord){
            this.rightFuzzyMaintenanceRecord = rightFuzzyMaintenanceRecord;
            return this;
        }

        public QueryBuilder rightFuzzyMaintenanceRecord (String ... rightFuzzyMaintenanceRecord){
            this.rightFuzzyMaintenanceRecord = solveNullList(rightFuzzyMaintenanceRecord);
            return this;
        }

        public QueryBuilder maintenanceRecord(String maintenanceRecord){
            setMaintenanceRecord(maintenanceRecord);
            return this;
        }

        public QueryBuilder maintenanceRecordList(String ... maintenanceRecord){
            this.maintenanceRecordList = solveNullList(maintenanceRecord);
            return this;
        }

        public QueryBuilder maintenanceRecordList(List<String> maintenanceRecord){
            this.maintenanceRecordList = maintenanceRecord;
            return this;
        }

        public QueryBuilder fetchMaintenanceRecord(){
            setFetchFields("fetchFields","maintenanceRecord");
            return this;
        }

        public QueryBuilder excludeMaintenanceRecord(){
            setFetchFields("excludeFields","maintenanceRecord");
            return this;
        }

        public QueryBuilder fuzzyAnalyticalProgress (List<String> fuzzyAnalyticalProgress){
            this.fuzzyAnalyticalProgress = fuzzyAnalyticalProgress;
            return this;
        }

        public QueryBuilder fuzzyAnalyticalProgress (String ... fuzzyAnalyticalProgress){
            this.fuzzyAnalyticalProgress = solveNullList(fuzzyAnalyticalProgress);
            return this;
        }

        public QueryBuilder rightFuzzyAnalyticalProgress (List<String> rightFuzzyAnalyticalProgress){
            this.rightFuzzyAnalyticalProgress = rightFuzzyAnalyticalProgress;
            return this;
        }

        public QueryBuilder rightFuzzyAnalyticalProgress (String ... rightFuzzyAnalyticalProgress){
            this.rightFuzzyAnalyticalProgress = solveNullList(rightFuzzyAnalyticalProgress);
            return this;
        }

        public QueryBuilder analyticalProgress(String analyticalProgress){
            setAnalyticalProgress(analyticalProgress);
            return this;
        }

        public QueryBuilder analyticalProgressList(String ... analyticalProgress){
            this.analyticalProgressList = solveNullList(analyticalProgress);
            return this;
        }

        public QueryBuilder analyticalProgressList(List<String> analyticalProgress){
            this.analyticalProgressList = analyticalProgress;
            return this;
        }

        public QueryBuilder fetchAnalyticalProgress(){
            setFetchFields("fetchFields","analyticalProgress");
            return this;
        }

        public QueryBuilder excludeAnalyticalProgress(){
            setFetchFields("excludeFields","analyticalProgress");
            return this;
        }

        public QueryBuilder fuzzyControversyWithST (List<String> fuzzyControversyWithST){
            this.fuzzyControversyWithST = fuzzyControversyWithST;
            return this;
        }

        public QueryBuilder fuzzyControversyWithST (String ... fuzzyControversyWithST){
            this.fuzzyControversyWithST = solveNullList(fuzzyControversyWithST);
            return this;
        }

        public QueryBuilder rightFuzzyControversyWithST (List<String> rightFuzzyControversyWithST){
            this.rightFuzzyControversyWithST = rightFuzzyControversyWithST;
            return this;
        }

        public QueryBuilder rightFuzzyControversyWithST (String ... rightFuzzyControversyWithST){
            this.rightFuzzyControversyWithST = solveNullList(rightFuzzyControversyWithST);
            return this;
        }

        public QueryBuilder controversyWithST(String controversyWithST){
            setControversyWithST(controversyWithST);
            return this;
        }

        public QueryBuilder controversyWithSTList(String ... controversyWithST){
            this.controversyWithSTList = solveNullList(controversyWithST);
            return this;
        }

        public QueryBuilder controversyWithSTList(List<String> controversyWithST){
            this.controversyWithSTList = controversyWithST;
            return this;
        }

        public QueryBuilder fetchControversyWithST(){
            setFetchFields("fetchFields","controversyWithST");
            return this;
        }

        public QueryBuilder excludeControversyWithST(){
            setFetchFields("excludeFields","controversyWithST");
            return this;
        }

        public QueryBuilder fuzzySettleScheme (List<String> fuzzySettleScheme){
            this.fuzzySettleScheme = fuzzySettleScheme;
            return this;
        }

        public QueryBuilder fuzzySettleScheme (String ... fuzzySettleScheme){
            this.fuzzySettleScheme = solveNullList(fuzzySettleScheme);
            return this;
        }

        public QueryBuilder rightFuzzySettleScheme (List<String> rightFuzzySettleScheme){
            this.rightFuzzySettleScheme = rightFuzzySettleScheme;
            return this;
        }

        public QueryBuilder rightFuzzySettleScheme (String ... rightFuzzySettleScheme){
            this.rightFuzzySettleScheme = solveNullList(rightFuzzySettleScheme);
            return this;
        }

        public QueryBuilder withSettleScheme(String settleScheme){
            setSettleScheme(settleScheme);
            return this;
        }

        public QueryBuilder withSettleSchemeList(String ... settleScheme){
            this.settleSchemeList = solveNullList(settleScheme);
            return this;
        }

        public QueryBuilder withSettleSchemeList(List<String> settleScheme){
            this.settleSchemeList = settleScheme;
            return this;
        }

        public QueryBuilder fetchSettleScheme(){
            setFetchFields("fetchFields","settleScheme");
            return this;
        }

        public QueryBuilder excludeSettleScheme(){
            setFetchFields("excludeFields","settleScheme");
            return this;
        }

        public QueryBuilder fuzzyClaimForm (List<String> fuzzyClaimForm){
            this.fuzzyClaimForm = fuzzyClaimForm;
            return this;
        }

        public QueryBuilder fuzzyClaimForm (String ... fuzzyClaimForm){
            this.fuzzyClaimForm = solveNullList(fuzzyClaimForm);
            return this;
        }

        public QueryBuilder rightFuzzyClaimForm (List<String> rightFuzzyClaimForm){
            this.rightFuzzyClaimForm = rightFuzzyClaimForm;
            return this;
        }

        public QueryBuilder rightFuzzyClaimForm (String ... rightFuzzyClaimForm){
            this.rightFuzzyClaimForm = solveNullList(rightFuzzyClaimForm);
            return this;
        }

        public QueryBuilder claimForm(String claimForm){
            setClaimForm(claimForm);
            return this;
        }

        public QueryBuilder claimFormList(String ... claimForm){
            this.claimFormList = solveNullList(claimForm);
            return this;
        }

        public QueryBuilder claimFormList(List<String> claimForm){
            this.claimFormList = claimForm;
            return this;
        }

        public QueryBuilder fetchClaimForm(){
            setFetchFields("fetchFields","claimForm");
            return this;
        }

        public QueryBuilder excludeClaimForm(){
            setFetchFields("excludeFields","claimForm");
            return this;
        }

        public QueryBuilder fuzzyProcessingSchemeST (List<String> fuzzyProcessingSchemeST){
            this.fuzzyProcessingSchemeST = fuzzyProcessingSchemeST;
            return this;
        }

        public QueryBuilder fuzzyProcessingSchemeST (String ... fuzzyProcessingSchemeST){
            this.fuzzyProcessingSchemeST = solveNullList(fuzzyProcessingSchemeST);
            return this;
        }

        public QueryBuilder rightFuzzyProcessingSchemeST (List<String> rightFuzzyProcessingSchemeST){
            this.rightFuzzyProcessingSchemeST = rightFuzzyProcessingSchemeST;
            return this;
        }

        public QueryBuilder rightFuzzyProcessingSchemeST (String ... rightFuzzyProcessingSchemeST){
            this.rightFuzzyProcessingSchemeST = solveNullList(rightFuzzyProcessingSchemeST);
            return this;
        }

        public QueryBuilder processingSchemeST(String processingSchemeST){
            setProcessingSchemeST(processingSchemeST);
            return this;
        }

        public QueryBuilder processingSchemeSTList(String ... processingSchemeST){
            this.processingSchemeSTList = solveNullList(processingSchemeST);
            return this;
        }

        public QueryBuilder processingSchemeSTList(List<String> processingSchemeST){
            this.processingSchemeSTList = processingSchemeST;
            return this;
        }

        public QueryBuilder fetchProcessingSchemeST(){
            setFetchFields("fetchFields","processingSchemeST");
            return this;
        }

        public QueryBuilder excludeProcessingSchemeST(){
            setFetchFields("excludeFields","processingSchemeST");
            return this;
        }

        public QueryBuilder fuzzyReturnProgress (List<String> fuzzyReturnProgress){
            this.fuzzyReturnProgress = fuzzyReturnProgress;
            return this;
        }

        public QueryBuilder fuzzyReturnProgress (String ... fuzzyReturnProgress){
            this.fuzzyReturnProgress = solveNullList(fuzzyReturnProgress);
            return this;
        }

        public QueryBuilder rightFuzzyReturnProgress (List<String> rightFuzzyReturnProgress){
            this.rightFuzzyReturnProgress = rightFuzzyReturnProgress;
            return this;
        }

        public QueryBuilder rightFuzzyReturnProgress (String ... rightFuzzyReturnProgress){
            this.rightFuzzyReturnProgress = solveNullList(rightFuzzyReturnProgress);
            return this;
        }

        public QueryBuilder returnProgress(String returnProgress){
            setReturnProgress(returnProgress);
            return this;
        }

        public QueryBuilder returnProgressList(String ... returnProgress){
            this.returnProgressList = solveNullList(returnProgress);
            return this;
        }

        public QueryBuilder returnProgressList(List<String> returnProgress){
            this.returnProgressList = returnProgress;
            return this;
        }

        public QueryBuilder fetchReturnProgress(){
            setFetchFields("fetchFields","returnProgress");
            return this;
        }

        public QueryBuilder excludeReturnProgress(){
            setFetchFields("excludeFields","returnProgress");
            return this;
        }

        public QueryBuilder fuzzyReturnMode (List<String> fuzzyReturnMode){
            this.fuzzyReturnMode = fuzzyReturnMode;
            return this;
        }

        public QueryBuilder fuzzyReturnMode (String ... fuzzyReturnMode){
            this.fuzzyReturnMode = solveNullList(fuzzyReturnMode);
            return this;
        }

        public QueryBuilder rightFuzzyReturnMode (List<String> rightFuzzyReturnMode){
            this.rightFuzzyReturnMode = rightFuzzyReturnMode;
            return this;
        }

        public QueryBuilder rightFuzzyReturnMode (String ... rightFuzzyReturnMode){
            this.rightFuzzyReturnMode = solveNullList(rightFuzzyReturnMode);
            return this;
        }

        public QueryBuilder returnMode(String returnMode){
            setReturnMode(returnMode);
            return this;
        }

        public QueryBuilder returnModeList(String ... returnMode){
            this.returnModeList = solveNullList(returnMode);
            return this;
        }

        public QueryBuilder returnModeList(List<String> returnMode){
            this.returnModeList = returnMode;
            return this;
        }

        public QueryBuilder fetchReturnMode(){
            setFetchFields("fetchFields","returnMode");
            return this;
        }

        public QueryBuilder excludeReturnMode(){
            setFetchFields("excludeFields","returnMode");
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

        public MqmsMarketBulletin build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> marketBulletinIdList;

        public List<Integer> getMarketBulletinIdList(){return this.marketBulletinIdList;}

        private Integer marketBulletinIdSt;

        private Integer marketBulletinIdEd;

        public Integer getMarketBulletinIdSt(){return this.marketBulletinIdSt;}

        public Integer getMarketBulletinIdEd(){return this.marketBulletinIdEd;}

        private List<String> failureDateList;

        public List<String> getFailureDateList(){return this.failureDateList;}


        private List<String> fuzzyFailureDate;

        public List<String> getFuzzyFailureDate(){return this.fuzzyFailureDate;}

        private List<String> rightFuzzyFailureDate;

        public List<String> getRightFuzzyFailureDate(){return this.rightFuzzyFailureDate;}
        private List<String> vinCodeList;

        public List<String> getVinCodeList(){return this.vinCodeList;}


        private List<String> fuzzyVinCode;

        public List<String> getFuzzyVinCode(){return this.fuzzyVinCode;}

        private List<String> rightFuzzyVinCode;

        public List<String> getRightFuzzyVinCode(){return this.rightFuzzyVinCode;}
        private List<String> shortCodeList;

        public List<String> getShortCodeList(){return this.shortCodeList;}


        private List<String> fuzzyShortCode;

        public List<String> getFuzzyShortCode(){return this.fuzzyShortCode;}

        private List<String> rightFuzzyShortCode;

        public List<String> getRightFuzzyShortCode(){return this.rightFuzzyShortCode;}
        private List<String> transCategoryList;

        public List<String> getTransCategoryList(){return this.transCategoryList;}


        private List<String> fuzzyTransCategory;

        public List<String> getFuzzyTransCategory(){return this.fuzzyTransCategory;}

        private List<String> rightFuzzyTransCategory;

        public List<String> getRightFuzzyTransCategory(){return this.rightFuzzyTransCategory;}
        private List<String> engCodeList;

        public List<String> getEngCodeList(){return this.engCodeList;}


        private List<String> fuzzyEngCode;

        public List<String> getFuzzyEngCode(){return this.fuzzyEngCode;}

        private List<String> rightFuzzyEngCode;

        public List<String> getRightFuzzyEngCode(){return this.rightFuzzyEngCode;}
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
        private List<String> transTypeList;

        public List<String> getTransTypeList(){return this.transTypeList;}


        private List<String> fuzzyTransType;

        public List<String> getFuzzyTransType(){return this.fuzzyTransType;}

        private List<String> rightFuzzyTransType;

        public List<String> getRightFuzzyTransType(){return this.rightFuzzyTransType;}
        private List<String> manufactureDateList;

        public List<String> getManufactureDateList(){return this.manufactureDateList;}


        private List<String> fuzzyManufactureDate;

        public List<String> getFuzzyManufactureDate(){return this.fuzzyManufactureDate;}

        private List<String> rightFuzzyManufactureDate;

        public List<String> getRightFuzzyManufactureDate(){return this.rightFuzzyManufactureDate;}
        private List<String> inforSourceList;

        public List<String> getInforSourceList(){return this.inforSourceList;}


        private List<String> fuzzyInforSource;

        public List<String> getFuzzyInforSource(){return this.fuzzyInforSource;}

        private List<String> rightFuzzyInforSource;

        public List<String> getRightFuzzyInforSource(){return this.rightFuzzyInforSource;}
        private List<String> salesDateList;

        public List<String> getSalesDateList(){return this.salesDateList;}


        private List<String> fuzzySalesDate;

        public List<String> getFuzzySalesDate(){return this.fuzzySalesDate;}

        private List<String> rightFuzzySalesDate;

        public List<String> getRightFuzzySalesDate(){return this.rightFuzzySalesDate;}
        private List<String> partsNameList;

        public List<String> getPartsNameList(){return this.partsNameList;}


        private List<String> fuzzyPartsName;

        public List<String> getFuzzyPartsName(){return this.fuzzyPartsName;}

        private List<String> rightFuzzyPartsName;

        public List<String> getRightFuzzyPartsName(){return this.rightFuzzyPartsName;}
        private List<String> themeList;

        public List<String> getThemeList(){return this.themeList;}


        private List<String> fuzzyTheme;

        public List<String> getFuzzyTheme(){return this.fuzzyTheme;}

        private List<String> rightFuzzyTheme;

        public List<String> getRightFuzzyTheme(){return this.rightFuzzyTheme;}
        private List<String> countermeasureStateList;

        public List<String> getCountermeasureStateList(){return this.countermeasureStateList;}


        private List<String> fuzzyCountermeasureState;

        public List<String> getFuzzyCountermeasureState(){return this.fuzzyCountermeasureState;}

        private List<String> rightFuzzyCountermeasureState;

        public List<String> getRightFuzzyCountermeasureState(){return this.rightFuzzyCountermeasureState;}
        private List<String> dealerNameList;

        public List<String> getDealerNameList(){return this.dealerNameList;}


        private List<String> fuzzyDealerName;

        public List<String> getFuzzyDealerName(){return this.fuzzyDealerName;}

        private List<String> rightFuzzyDealerName;

        public List<String> getRightFuzzyDealerName(){return this.rightFuzzyDealerName;}
        private List<Integer> mileageList;

        public List<Integer> getMileageList(){return this.mileageList;}

        private Integer mileageSt;

        private Integer mileageEd;

        public Integer getMileageSt(){return this.mileageSt;}

        public Integer getMileageEd(){return this.mileageEd;}

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
        private List<String> maintenanceRecordList;

        public List<String> getMaintenanceRecordList(){return this.maintenanceRecordList;}


        private List<String> fuzzyMaintenanceRecord;

        public List<String> getFuzzyMaintenanceRecord(){return this.fuzzyMaintenanceRecord;}

        private List<String> rightFuzzyMaintenanceRecord;

        public List<String> getRightFuzzyMaintenanceRecord(){return this.rightFuzzyMaintenanceRecord;}
        private List<String> analyticalProgressList;

        public List<String> getAnalyticalProgressList(){return this.analyticalProgressList;}


        private List<String> fuzzyAnalyticalProgress;

        public List<String> getFuzzyAnalyticalProgress(){return this.fuzzyAnalyticalProgress;}

        private List<String> rightFuzzyAnalyticalProgress;

        public List<String> getRightFuzzyAnalyticalProgress(){return this.rightFuzzyAnalyticalProgress;}
        private List<String> controversyWithSTList;

        public List<String> getControversyWithSTList(){return this.controversyWithSTList;}


        private List<String> fuzzyControversyWithST;

        public List<String> getFuzzyControversyWithST(){return this.fuzzyControversyWithST;}

        private List<String> rightFuzzyControversyWithST;

        public List<String> getRightFuzzyControversyWithST(){return this.rightFuzzyControversyWithST;}
        private List<String> settleSchemeList;

        public List<String> getSettleSchemeList(){return this.settleSchemeList;}


        private List<String> fuzzySettleScheme;

        public List<String> getFuzzySettleScheme(){return this.fuzzySettleScheme;}

        private List<String> rightFuzzySettleScheme;

        public List<String> getRightFuzzySettleScheme(){return this.rightFuzzySettleScheme;}
        private List<String> claimFormList;

        public List<String> getClaimFormList(){return this.claimFormList;}


        private List<String> fuzzyClaimForm;

        public List<String> getFuzzyClaimForm(){return this.fuzzyClaimForm;}

        private List<String> rightFuzzyClaimForm;

        public List<String> getRightFuzzyClaimForm(){return this.rightFuzzyClaimForm;}
        private List<String> processingSchemeSTList;

        public List<String> getProcessingSchemeSTList(){return this.processingSchemeSTList;}


        private List<String> fuzzyProcessingSchemeST;

        public List<String> getFuzzyProcessingSchemeST(){return this.fuzzyProcessingSchemeST;}

        private List<String> rightFuzzyProcessingSchemeST;

        public List<String> getRightFuzzyProcessingSchemeST(){return this.rightFuzzyProcessingSchemeST;}
        private List<String> returnProgressList;

        public List<String> getReturnProgressList(){return this.returnProgressList;}


        private List<String> fuzzyReturnProgress;

        public List<String> getFuzzyReturnProgress(){return this.fuzzyReturnProgress;}

        private List<String> rightFuzzyReturnProgress;

        public List<String> getRightFuzzyReturnProgress(){return this.rightFuzzyReturnProgress;}
        private List<String> returnModeList;

        public List<String> getReturnModeList(){return this.returnModeList;}


        private List<String> fuzzyReturnMode;

        public List<String> getFuzzyReturnMode(){return this.fuzzyReturnMode;}

        private List<String> rightFuzzyReturnMode;

        public List<String> getRightFuzzyReturnMode(){return this.rightFuzzyReturnMode;}
        private List<String> deliveryReceivedDateList;

        public List<String> getDeliveryReceivedDateList(){return this.deliveryReceivedDateList;}


        private List<String> fuzzyDeliveryReceivedDate;

        public List<String> getFuzzyDeliveryReceivedDate(){return this.fuzzyDeliveryReceivedDate;}

        private List<String> rightFuzzyDeliveryReceivedDate;

        public List<String> getRightFuzzyDeliveryReceivedDate(){return this.rightFuzzyDeliveryReceivedDate;}
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

        public ConditionBuilder marketBulletinIdBetWeen(Integer marketBulletinIdSt,Integer marketBulletinIdEd){
            this.marketBulletinIdSt = marketBulletinIdSt;
            this.marketBulletinIdEd = marketBulletinIdEd;
            return this;
        }

        public ConditionBuilder marketBulletinIdGreaterEqThan(Integer marketBulletinIdSt){
            this.marketBulletinIdSt = marketBulletinIdSt;
            return this;
        }
        public ConditionBuilder marketBulletinIdLessEqThan(Integer marketBulletinIdEd){
            this.marketBulletinIdEd = marketBulletinIdEd;
            return this;
        }


        public ConditionBuilder marketBulletinIdList(Integer ... marketBulletinId){
            this.marketBulletinIdList = solveNullList(marketBulletinId);
            return this;
        }

        public ConditionBuilder marketBulletinIdList(List<Integer> marketBulletinId){
            this.marketBulletinIdList = marketBulletinId;
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

        public ConditionBuilder fuzzyTransCategory (List<String> fuzzyTransCategory){
            this.fuzzyTransCategory = fuzzyTransCategory;
            return this;
        }

        public ConditionBuilder fuzzyTransCategory (String ... fuzzyTransCategory){
            this.fuzzyTransCategory = solveNullList(fuzzyTransCategory);
            return this;
        }

        public ConditionBuilder rightFuzzyTransCategory (List<String> rightFuzzyTransCategory){
            this.rightFuzzyTransCategory = rightFuzzyTransCategory;
            return this;
        }

        public ConditionBuilder rightFuzzyTransCategory (String ... rightFuzzyTransCategory){
            this.rightFuzzyTransCategory = solveNullList(rightFuzzyTransCategory);
            return this;
        }

        public ConditionBuilder transCategoryList(String ... transCategory){
            this.transCategoryList = solveNullList(transCategory);
            return this;
        }

        public ConditionBuilder transCategoryList(List<String> transCategory){
            this.transCategoryList = transCategory;
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

        public ConditionBuilder fuzzyTransType (List<String> fuzzyTransType){
            this.fuzzyTransType = fuzzyTransType;
            return this;
        }

        public ConditionBuilder fuzzyTransType (String ... fuzzyTransType){
            this.fuzzyTransType = solveNullList(fuzzyTransType);
            return this;
        }

        public ConditionBuilder rightFuzzyTransType (List<String> rightFuzzyTransType){
            this.rightFuzzyTransType = rightFuzzyTransType;
            return this;
        }

        public ConditionBuilder rightFuzzyTransType (String ... rightFuzzyTransType){
            this.rightFuzzyTransType = solveNullList(rightFuzzyTransType);
            return this;
        }

        public ConditionBuilder transTypeList(String ... transType){
            this.transTypeList = solveNullList(transType);
            return this;
        }

        public ConditionBuilder transTypeList(List<String> transType){
            this.transTypeList = transType;
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

        public ConditionBuilder fuzzyInforSource (List<String> fuzzyInforSource){
            this.fuzzyInforSource = fuzzyInforSource;
            return this;
        }

        public ConditionBuilder fuzzyInforSource (String ... fuzzyInforSource){
            this.fuzzyInforSource = solveNullList(fuzzyInforSource);
            return this;
        }

        public ConditionBuilder rightFuzzyInforSource (List<String> rightFuzzyInforSource){
            this.rightFuzzyInforSource = rightFuzzyInforSource;
            return this;
        }

        public ConditionBuilder rightFuzzyInforSource (String ... rightFuzzyInforSource){
            this.rightFuzzyInforSource = solveNullList(rightFuzzyInforSource);
            return this;
        }

        public ConditionBuilder inforSourceList(String ... inforSource){
            this.inforSourceList = solveNullList(inforSource);
            return this;
        }

        public ConditionBuilder inforSourceList(List<String> inforSource){
            this.inforSourceList = inforSource;
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

        public ConditionBuilder fuzzyCountermeasureState (List<String> fuzzyCountermeasureState){
            this.fuzzyCountermeasureState = fuzzyCountermeasureState;
            return this;
        }

        public ConditionBuilder fuzzyCountermeasureState (String ... fuzzyCountermeasureState){
            this.fuzzyCountermeasureState = solveNullList(fuzzyCountermeasureState);
            return this;
        }

        public ConditionBuilder rightFuzzyCountermeasureState (List<String> rightFuzzyCountermeasureState){
            this.rightFuzzyCountermeasureState = rightFuzzyCountermeasureState;
            return this;
        }

        public ConditionBuilder rightFuzzyCountermeasureState (String ... rightFuzzyCountermeasureState){
            this.rightFuzzyCountermeasureState = solveNullList(rightFuzzyCountermeasureState);
            return this;
        }

        public ConditionBuilder countermeasureStateList(String ... countermeasureState){
            this.countermeasureStateList = solveNullList(countermeasureState);
            return this;
        }

        public ConditionBuilder countermeasureStateList(List<String> countermeasureState){
            this.countermeasureStateList = countermeasureState;
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

        public ConditionBuilder fuzzyMaintenanceRecord (List<String> fuzzyMaintenanceRecord){
            this.fuzzyMaintenanceRecord = fuzzyMaintenanceRecord;
            return this;
        }

        public ConditionBuilder fuzzyMaintenanceRecord (String ... fuzzyMaintenanceRecord){
            this.fuzzyMaintenanceRecord = solveNullList(fuzzyMaintenanceRecord);
            return this;
        }

        public ConditionBuilder rightFuzzyMaintenanceRecord (List<String> rightFuzzyMaintenanceRecord){
            this.rightFuzzyMaintenanceRecord = rightFuzzyMaintenanceRecord;
            return this;
        }

        public ConditionBuilder rightFuzzyMaintenanceRecord (String ... rightFuzzyMaintenanceRecord){
            this.rightFuzzyMaintenanceRecord = solveNullList(rightFuzzyMaintenanceRecord);
            return this;
        }

        public ConditionBuilder maintenanceRecordList(String ... maintenanceRecord){
            this.maintenanceRecordList = solveNullList(maintenanceRecord);
            return this;
        }

        public ConditionBuilder maintenanceRecordList(List<String> maintenanceRecord){
            this.maintenanceRecordList = maintenanceRecord;
            return this;
        }

        public ConditionBuilder fuzzyAnalyticalProgress (List<String> fuzzyAnalyticalProgress){
            this.fuzzyAnalyticalProgress = fuzzyAnalyticalProgress;
            return this;
        }

        public ConditionBuilder fuzzyAnalyticalProgress (String ... fuzzyAnalyticalProgress){
            this.fuzzyAnalyticalProgress = solveNullList(fuzzyAnalyticalProgress);
            return this;
        }

        public ConditionBuilder rightFuzzyAnalyticalProgress (List<String> rightFuzzyAnalyticalProgress){
            this.rightFuzzyAnalyticalProgress = rightFuzzyAnalyticalProgress;
            return this;
        }

        public ConditionBuilder rightFuzzyAnalyticalProgress (String ... rightFuzzyAnalyticalProgress){
            this.rightFuzzyAnalyticalProgress = solveNullList(rightFuzzyAnalyticalProgress);
            return this;
        }

        public ConditionBuilder analyticalProgressList(String ... analyticalProgress){
            this.analyticalProgressList = solveNullList(analyticalProgress);
            return this;
        }

        public ConditionBuilder analyticalProgressList(List<String> analyticalProgress){
            this.analyticalProgressList = analyticalProgress;
            return this;
        }

        public ConditionBuilder fuzzyControversyWithST (List<String> fuzzyControversyWithST){
            this.fuzzyControversyWithST = fuzzyControversyWithST;
            return this;
        }

        public ConditionBuilder fuzzyControversyWithST (String ... fuzzyControversyWithST){
            this.fuzzyControversyWithST = solveNullList(fuzzyControversyWithST);
            return this;
        }

        public ConditionBuilder rightFuzzyControversyWithST (List<String> rightFuzzyControversyWithST){
            this.rightFuzzyControversyWithST = rightFuzzyControversyWithST;
            return this;
        }

        public ConditionBuilder rightFuzzyControversyWithST (String ... rightFuzzyControversyWithST){
            this.rightFuzzyControversyWithST = solveNullList(rightFuzzyControversyWithST);
            return this;
        }

        public ConditionBuilder controversyWithSTList(String ... controversyWithST){
            this.controversyWithSTList = solveNullList(controversyWithST);
            return this;
        }

        public ConditionBuilder controversyWithSTList(List<String> controversyWithST){
            this.controversyWithSTList = controversyWithST;
            return this;
        }

        public ConditionBuilder fuzzySettleScheme (List<String> fuzzySettleScheme){
            this.fuzzySettleScheme = fuzzySettleScheme;
            return this;
        }

        public ConditionBuilder fuzzySettleScheme (String ... fuzzySettleScheme){
            this.fuzzySettleScheme = solveNullList(fuzzySettleScheme);
            return this;
        }

        public ConditionBuilder rightFuzzySettleScheme (List<String> rightFuzzySettleScheme){
            this.rightFuzzySettleScheme = rightFuzzySettleScheme;
            return this;
        }

        public ConditionBuilder rightFuzzySettleScheme (String ... rightFuzzySettleScheme){
            this.rightFuzzySettleScheme = solveNullList(rightFuzzySettleScheme);
            return this;
        }

        public ConditionBuilder withSettleSchemeList(String ... settleScheme){
            this.settleSchemeList = solveNullList(settleScheme);
            return this;
        }

        public ConditionBuilder withSettleSchemeList(List<String> settleScheme){
            this.settleSchemeList = settleScheme;
            return this;
        }

        public ConditionBuilder fuzzyClaimForm (List<String> fuzzyClaimForm){
            this.fuzzyClaimForm = fuzzyClaimForm;
            return this;
        }

        public ConditionBuilder fuzzyClaimForm (String ... fuzzyClaimForm){
            this.fuzzyClaimForm = solveNullList(fuzzyClaimForm);
            return this;
        }

        public ConditionBuilder rightFuzzyClaimForm (List<String> rightFuzzyClaimForm){
            this.rightFuzzyClaimForm = rightFuzzyClaimForm;
            return this;
        }

        public ConditionBuilder rightFuzzyClaimForm (String ... rightFuzzyClaimForm){
            this.rightFuzzyClaimForm = solveNullList(rightFuzzyClaimForm);
            return this;
        }

        public ConditionBuilder claimFormList(String ... claimForm){
            this.claimFormList = solveNullList(claimForm);
            return this;
        }

        public ConditionBuilder claimFormList(List<String> claimForm){
            this.claimFormList = claimForm;
            return this;
        }

        public ConditionBuilder fuzzyProcessingSchemeST (List<String> fuzzyProcessingSchemeST){
            this.fuzzyProcessingSchemeST = fuzzyProcessingSchemeST;
            return this;
        }

        public ConditionBuilder fuzzyProcessingSchemeST (String ... fuzzyProcessingSchemeST){
            this.fuzzyProcessingSchemeST = solveNullList(fuzzyProcessingSchemeST);
            return this;
        }

        public ConditionBuilder rightFuzzyProcessingSchemeST (List<String> rightFuzzyProcessingSchemeST){
            this.rightFuzzyProcessingSchemeST = rightFuzzyProcessingSchemeST;
            return this;
        }

        public ConditionBuilder rightFuzzyProcessingSchemeST (String ... rightFuzzyProcessingSchemeST){
            this.rightFuzzyProcessingSchemeST = solveNullList(rightFuzzyProcessingSchemeST);
            return this;
        }

        public ConditionBuilder processingSchemeSTList(String ... processingSchemeST){
            this.processingSchemeSTList = solveNullList(processingSchemeST);
            return this;
        }

        public ConditionBuilder processingSchemeSTList(List<String> processingSchemeST){
            this.processingSchemeSTList = processingSchemeST;
            return this;
        }

        public ConditionBuilder fuzzyReturnProgress (List<String> fuzzyReturnProgress){
            this.fuzzyReturnProgress = fuzzyReturnProgress;
            return this;
        }

        public ConditionBuilder fuzzyReturnProgress (String ... fuzzyReturnProgress){
            this.fuzzyReturnProgress = solveNullList(fuzzyReturnProgress);
            return this;
        }

        public ConditionBuilder rightFuzzyReturnProgress (List<String> rightFuzzyReturnProgress){
            this.rightFuzzyReturnProgress = rightFuzzyReturnProgress;
            return this;
        }

        public ConditionBuilder rightFuzzyReturnProgress (String ... rightFuzzyReturnProgress){
            this.rightFuzzyReturnProgress = solveNullList(rightFuzzyReturnProgress);
            return this;
        }

        public ConditionBuilder returnProgressList(String ... returnProgress){
            this.returnProgressList = solveNullList(returnProgress);
            return this;
        }

        public ConditionBuilder returnProgressList(List<String> returnProgress){
            this.returnProgressList = returnProgress;
            return this;
        }

        public ConditionBuilder fuzzyReturnMode (List<String> fuzzyReturnMode){
            this.fuzzyReturnMode = fuzzyReturnMode;
            return this;
        }

        public ConditionBuilder fuzzyReturnMode (String ... fuzzyReturnMode){
            this.fuzzyReturnMode = solveNullList(fuzzyReturnMode);
            return this;
        }

        public ConditionBuilder rightFuzzyReturnMode (List<String> rightFuzzyReturnMode){
            this.rightFuzzyReturnMode = rightFuzzyReturnMode;
            return this;
        }

        public ConditionBuilder rightFuzzyReturnMode (String ... rightFuzzyReturnMode){
            this.rightFuzzyReturnMode = solveNullList(rightFuzzyReturnMode);
            return this;
        }

        public ConditionBuilder returnModeList(String ... returnMode){
            this.returnModeList = solveNullList(returnMode);
            return this;
        }

        public ConditionBuilder returnModeList(List<String> returnMode){
            this.returnModeList = returnMode;
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

        private MqmsMarketBulletin obj;

        public Builder(){
            this.obj = new MqmsMarketBulletin();
        }

        public Builder marketBulletinId(Integer marketBulletinId){
            this.obj.setMarketBulletinId(marketBulletinId);
            return this;
        }
        public Builder failureDate(String failureDate){
            this.obj.setFailureDate(failureDate);
            return this;
        }
        public Builder vinCode(String vinCode){
            this.obj.setVinCode(vinCode);
            return this;
        }
        public Builder shortCode(String shortCode){
            this.obj.setShortCode(shortCode);
            return this;
        }
        public Builder transCategory(String transCategory){
            this.obj.setTransCategory(transCategory);
            return this;
        }
        public Builder engCode(String engCode){
            this.obj.setEngCode(engCode);
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
        public Builder transType(String transType){
            this.obj.setTransType(transType);
            return this;
        }
        public Builder manufactureDate(String manufactureDate){
            this.obj.setManufactureDate(manufactureDate);
            return this;
        }
        public Builder inforSource(String inforSource){
            this.obj.setInforSource(inforSource);
            return this;
        }
        public Builder salesDate(String salesDate){
            this.obj.setSalesDate(salesDate);
            return this;
        }
        public Builder partsName(String partsName){
            this.obj.setPartsName(partsName);
            return this;
        }
        public Builder theme(String theme){
            this.obj.setTheme(theme);
            return this;
        }
        public Builder countermeasureState(String countermeasureState){
            this.obj.setCountermeasureState(countermeasureState);
            return this;
        }
        public Builder dealerName(String dealerName){
            this.obj.setDealerName(dealerName);
            return this;
        }
        public Builder mileage(Integer mileage){
            this.obj.setMileage(mileage);
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
        public Builder maintenanceRecord(String maintenanceRecord){
            this.obj.setMaintenanceRecord(maintenanceRecord);
            return this;
        }
        public Builder analyticalProgress(String analyticalProgress){
            this.obj.setAnalyticalProgress(analyticalProgress);
            return this;
        }
        public Builder controversyWithST(String controversyWithST){
            this.obj.setControversyWithST(controversyWithST);
            return this;
        }
        public Builder withSettleScheme(String settleScheme){
            this.obj.setSettleScheme(settleScheme);
            return this;
        }
        public Builder claimForm(String claimForm){
            this.obj.setClaimForm(claimForm);
            return this;
        }
        public Builder processingSchemeST(String processingSchemeST){
            this.obj.setProcessingSchemeST(processingSchemeST);
            return this;
        }
        public Builder returnProgress(String returnProgress){
            this.obj.setReturnProgress(returnProgress);
            return this;
        }
        public Builder returnMode(String returnMode){
            this.obj.setReturnMode(returnMode);
            return this;
        }
        public Builder deliveryReceivedDate(String deliveryReceivedDate){
            this.obj.setDeliveryReceivedDate(deliveryReceivedDate);
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
        public MqmsMarketBulletin build(){return obj;}
    }

}
