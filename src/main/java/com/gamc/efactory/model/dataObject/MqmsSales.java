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
public class MqmsSales implements Serializable {

    private static final long serialVersionUID = 1585183733147L;


    /**
    * 主键
    * 销售数据id
    * isNullAble:0
    */
    private Integer salesId;

    /**
    * vin码
    * isNullAble:1
    */
    private String vinCode;

    /**
    * 销售系统车型
    * isNullAble:1
    */
    private String salesCarType;

    /**
    * 车型细分
    * isNullAble:1
    */
    private String salesCarTypeDetail;

    /**
    * 车型中文名
    * isNullAble:1
    */
    private String salesCarTypeCn;

    /**
    * 经销商编号
    * isNullAble:1
    */
    private String dealerCode;

    /**
    * 经销商名称
    * isNullAble:1
    */
    private String dealerName;

    /**
    * 生产日期
    * isNullAble:1
    */
    private String produceDate;

    /**
    * 一次实销日期
    * isNullAble:1
    */
    private String firstPinDate;

    /**
    * 二次实销日期
    * isNullAble:1
    */
    private String secondPinDate;

    /**
    * 状态
    * isNullAble:1
    */
    private String state;

    /**
    * MTOC
    * isNullAble:1
    */
    private String mtoc;

    /**
    * 车型
    * isNullAble:1
    */
    private String carType;

    /**
    * 变速箱号
    * isNullAble:1
    */
    private String transmissionCode;

    /**
    * 工厂简码
    * isNullAble:1
    */
    private String factoryCode;

    /**
    * 工厂地区
    * isNullAble:1
    */
    private String factoryArea;

    /**
    * 发动机短码
    * isNullAble:1
    */
    private String engShortCode;

    /**
    * 发动机类型
    * isNullAble:1
    */
    private String engType;

    /**
    * 发动机系列
    * isNullAble:1
    */
    private String engSeries;

    /**
    * 销售区域
    * isNullAble:1
    */
    private String salesArea;

    /**
    * 销售年
    * isNullAble:1
    */
    private String salesYear;

    /**
    * 销售月
    * isNullAble:1
    */
    private String salesMonth;

    /**
    * 变速箱短码
    * isNullAble:1
    */
    private String tranShortCode;

    /**
    * 变速箱类型
    * isNullAble:1
    */
    private String tranType;

    /**
    * 变速箱系列
    * isNullAble:1
    */
    private String tranSeries;

    /**
    * 车辆短码
    * isNullAble:1
    */
    private String carShortCode;

    /**
    * 车型
    * isNullAble:1
    */
    private String carModel;

    /**
    * 内部车型代号
    * isNullAble:1
    */
    private String carModelCode;

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


    public void setSalesId(Integer salesId){this.salesId = salesId;}

    public Integer getSalesId(){return this.salesId;}

    public void setVinCode(String vinCode){this.vinCode = vinCode;}

    public String getVinCode(){return this.vinCode;}

    public void setSalesCarType(String salesCarType){this.salesCarType = salesCarType;}

    public String getSalesCarType(){return this.salesCarType;}

    public void setSalesCarTypeDetail(String salesCarTypeDetail){this.salesCarTypeDetail = salesCarTypeDetail;}

    public String getSalesCarTypeDetail(){return this.salesCarTypeDetail;}

    public void setSalesCarTypeCn(String salesCarTypeCn){this.salesCarTypeCn = salesCarTypeCn;}

    public String getSalesCarTypeCn(){return this.salesCarTypeCn;}

    public void setDealerCode(String dealerCode){this.dealerCode = dealerCode;}

    public String getDealerCode(){return this.dealerCode;}

    public void setDealerName(String dealerName){this.dealerName = dealerName;}

    public String getDealerName(){return this.dealerName;}

    public void setProduceDate(String produceDate){this.produceDate = produceDate;}

    public String getProduceDate(){return this.produceDate;}

    public void setFirstPinDate(String firstPinDate){this.firstPinDate = firstPinDate;}

    public String getFirstPinDate(){return this.firstPinDate;}

    public void setSecondPinDate(String secondPinDate){this.secondPinDate = secondPinDate;}

    public String getSecondPinDate(){return this.secondPinDate;}

    public void setState(String state){this.state = state;}

    public String getState(){return this.state;}

    public void setMtoc(String mtoc){this.mtoc = mtoc;}

    public String getMtoc(){return this.mtoc;}

    public void setCarType(String carType){this.carType = carType;}

    public String getCarType(){return this.carType;}

    public void setTransmissionCode(String transmissionCode){this.transmissionCode = transmissionCode;}

    public String getTransmissionCode(){return this.transmissionCode;}

    public void setFactoryCode(String factoryCode){this.factoryCode = factoryCode;}

    public String getFactoryCode(){return this.factoryCode;}

    public void setFactoryArea(String factoryArea){this.factoryArea = factoryArea;}

    public String getFactoryArea(){return this.factoryArea;}

    public void setEngShortCode(String engShortCode){this.engShortCode = engShortCode;}

    public String getEngShortCode(){return this.engShortCode;}

    public void setEngType(String engType){this.engType = engType;}

    public String getEngType(){return this.engType;}

    public void setEngSeries(String engSeries){this.engSeries = engSeries;}

    public String getEngSeries(){return this.engSeries;}

    public void setSalesArea(String salesArea){this.salesArea = salesArea;}

    public String getSalesArea(){return this.salesArea;}

    public void setSalesYear(String salesYear){this.salesYear = salesYear;}

    public String getSalesYear(){return this.salesYear;}

    public void setSalesMonth(String salesMonth){this.salesMonth = salesMonth;}

    public String getSalesMonth(){return this.salesMonth;}

    public void setTranShortCode(String tranShortCode){this.tranShortCode = tranShortCode;}

    public String getTranShortCode(){return this.tranShortCode;}

    public void setTranType(String tranType){this.tranType = tranType;}

    public String getTranType(){return this.tranType;}

    public void setTranSeries(String tranSeries){this.tranSeries = tranSeries;}

    public String getTranSeries(){return this.tranSeries;}

    public void setCarShortCode(String carShortCode){this.carShortCode = carShortCode;}

    public String getCarShortCode(){return this.carShortCode;}

    public void setCarModel(String carModel){this.carModel = carModel;}

    public String getCarModel(){return this.carModel;}

    public void setCarModelCode(String carModelCode){this.carModelCode = carModelCode;}

    public String getCarModelCode(){return this.carModelCode;}

    public void setApplierId(Integer applierId){this.applierId = applierId;}

    public Integer getApplierId(){return this.applierId;}

    public void setApplierName(String applierName){this.applierName = applierName;}

    public String getApplierName(){return this.applierName;}

    public void setApplyTime(String applyTime){this.applyTime = applyTime;}

    public String getApplyTime(){return this.applyTime;}
    @Override
    public String toString() {
        return "MqmsSales{" +
                "salesId='" + salesId + '\'' +
                "vinCode='" + vinCode + '\'' +
                "salesCarType='" + salesCarType + '\'' +
                "salesCarTypeDetail='" + salesCarTypeDetail + '\'' +
                "salesCarTypeCn='" + salesCarTypeCn + '\'' +
                "dealerCode='" + dealerCode + '\'' +
                "dealerName='" + dealerName + '\'' +
                "produceDate='" + produceDate + '\'' +
                "firstPinDate='" + firstPinDate + '\'' +
                "secondPinDate='" + secondPinDate + '\'' +
                "state='" + state + '\'' +
                "mtoc='" + mtoc + '\'' +
                "carType='" + carType + '\'' +
                "transmissionCode='" + transmissionCode + '\'' +
                "factoryCode='" + factoryCode + '\'' +
                "factoryArea='" + factoryArea + '\'' +
                "engShortCode='" + engShortCode + '\'' +
                "engType='" + engType + '\'' +
                "engSeries='" + engSeries + '\'' +
                "salesArea='" + salesArea + '\'' +
                "salesYear='" + salesYear + '\'' +
                "salesMonth='" + salesMonth + '\'' +
                "tranShortCode='" + tranShortCode + '\'' +
                "tranType='" + tranType + '\'' +
                "tranSeries='" + tranSeries + '\'' +
                "carShortCode='" + carShortCode + '\'' +
                "carModel='" + carModel + '\'' +
                "carModelCode='" + carModelCode + '\'' +
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

        private MqmsSales set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsSales set){
            this.set = set;
            return this;
        }

        public MqmsSales getSet(){
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

    public static class QueryBuilder extends MqmsSales{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> salesIdList;

        public List<Integer> getSalesIdList(){return this.salesIdList;}

        private Integer salesIdSt;

        private Integer salesIdEd;

        public Integer getSalesIdSt(){return this.salesIdSt;}

        public Integer getSalesIdEd(){return this.salesIdEd;}

        private List<String> vinCodeList;

        public List<String> getVinCodeList(){return this.vinCodeList;}


        private List<String> fuzzyVinCode;

        public List<String> getFuzzyVinCode(){return this.fuzzyVinCode;}

        private List<String> rightFuzzyVinCode;

        public List<String> getRightFuzzyVinCode(){return this.rightFuzzyVinCode;}
        private List<String> salesCarTypeList;

        public List<String> getSalesCarTypeList(){return this.salesCarTypeList;}


        private List<String> fuzzySalesCarType;

        public List<String> getFuzzySalesCarType(){return this.fuzzySalesCarType;}

        private List<String> rightFuzzySalesCarType;

        public List<String> getRightFuzzySalesCarType(){return this.rightFuzzySalesCarType;}
        private List<String> salesCarTypeDetailList;

        public List<String> getSalesCarTypeDetailList(){return this.salesCarTypeDetailList;}


        private List<String> fuzzySalesCarTypeDetail;

        public List<String> getFuzzySalesCarTypeDetail(){return this.fuzzySalesCarTypeDetail;}

        private List<String> rightFuzzySalesCarTypeDetail;

        public List<String> getRightFuzzySalesCarTypeDetail(){return this.rightFuzzySalesCarTypeDetail;}
        private List<String> salesCarTypeCnList;

        public List<String> getSalesCarTypeCnList(){return this.salesCarTypeCnList;}


        private List<String> fuzzySalesCarTypeCn;

        public List<String> getFuzzySalesCarTypeCn(){return this.fuzzySalesCarTypeCn;}

        private List<String> rightFuzzySalesCarTypeCn;

        public List<String> getRightFuzzySalesCarTypeCn(){return this.rightFuzzySalesCarTypeCn;}
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
        private List<String> produceDateList;

        public List<String> getProduceDateList(){return this.produceDateList;}


        private List<String> fuzzyProduceDate;

        public List<String> getFuzzyProduceDate(){return this.fuzzyProduceDate;}

        private List<String> rightFuzzyProduceDate;

        public List<String> getRightFuzzyProduceDate(){return this.rightFuzzyProduceDate;}
        private List<String> firstPinDateList;

        public List<String> getFirstPinDateList(){return this.firstPinDateList;}


        private List<String> fuzzyFirstPinDate;

        public List<String> getFuzzyFirstPinDate(){return this.fuzzyFirstPinDate;}

        private List<String> rightFuzzyFirstPinDate;

        public List<String> getRightFuzzyFirstPinDate(){return this.rightFuzzyFirstPinDate;}
        private List<String> secondPinDateList;

        public List<String> getSecondPinDateList(){return this.secondPinDateList;}


        private List<String> fuzzySecondPinDate;

        public List<String> getFuzzySecondPinDate(){return this.fuzzySecondPinDate;}

        private List<String> rightFuzzySecondPinDate;

        public List<String> getRightFuzzySecondPinDate(){return this.rightFuzzySecondPinDate;}
        private List<String> stateList;

        public List<String> getStateList(){return this.stateList;}


        private List<String> fuzzyState;

        public List<String> getFuzzyState(){return this.fuzzyState;}

        private List<String> rightFuzzyState;

        public List<String> getRightFuzzyState(){return this.rightFuzzyState;}
        private List<String> mtocList;

        public List<String> getMtocList(){return this.mtocList;}


        private List<String> fuzzyMtoc;

        public List<String> getFuzzyMtoc(){return this.fuzzyMtoc;}

        private List<String> rightFuzzyMtoc;

        public List<String> getRightFuzzyMtoc(){return this.rightFuzzyMtoc;}
        private List<String> carTypeList;

        public List<String> getCarTypeList(){return this.carTypeList;}


        private List<String> fuzzyCarType;

        public List<String> getFuzzyCarType(){return this.fuzzyCarType;}

        private List<String> rightFuzzyCarType;

        public List<String> getRightFuzzyCarType(){return this.rightFuzzyCarType;}
        private List<String> transmissionCodeList;

        public List<String> getTransmissionCodeList(){return this.transmissionCodeList;}


        private List<String> fuzzyTransmissionCode;

        public List<String> getFuzzyTransmissionCode(){return this.fuzzyTransmissionCode;}

        private List<String> rightFuzzyTransmissionCode;

        public List<String> getRightFuzzyTransmissionCode(){return this.rightFuzzyTransmissionCode;}
        private List<String> factoryCodeList;

        public List<String> getFactoryCodeList(){return this.factoryCodeList;}


        private List<String> fuzzyFactoryCode;

        public List<String> getFuzzyFactoryCode(){return this.fuzzyFactoryCode;}

        private List<String> rightFuzzyFactoryCode;

        public List<String> getRightFuzzyFactoryCode(){return this.rightFuzzyFactoryCode;}
        private List<String> factoryAreaList;

        public List<String> getFactoryAreaList(){return this.factoryAreaList;}


        private List<String> fuzzyFactoryArea;

        public List<String> getFuzzyFactoryArea(){return this.fuzzyFactoryArea;}

        private List<String> rightFuzzyFactoryArea;

        public List<String> getRightFuzzyFactoryArea(){return this.rightFuzzyFactoryArea;}
        private List<String> engShortCodeList;

        public List<String> getEngShortCodeList(){return this.engShortCodeList;}


        private List<String> fuzzyEngShortCode;

        public List<String> getFuzzyEngShortCode(){return this.fuzzyEngShortCode;}

        private List<String> rightFuzzyEngShortCode;

        public List<String> getRightFuzzyEngShortCode(){return this.rightFuzzyEngShortCode;}
        private List<String> engTypeList;

        public List<String> getEngTypeList(){return this.engTypeList;}


        private List<String> fuzzyEngType;

        public List<String> getFuzzyEngType(){return this.fuzzyEngType;}

        private List<String> rightFuzzyEngType;

        public List<String> getRightFuzzyEngType(){return this.rightFuzzyEngType;}
        private List<String> engSeriesList;

        public List<String> getEngSeriesList(){return this.engSeriesList;}


        private List<String> fuzzyEngSeries;

        public List<String> getFuzzyEngSeries(){return this.fuzzyEngSeries;}

        private List<String> rightFuzzyEngSeries;

        public List<String> getRightFuzzyEngSeries(){return this.rightFuzzyEngSeries;}
        private List<String> salesAreaList;

        public List<String> getSalesAreaList(){return this.salesAreaList;}


        private List<String> fuzzySalesArea;

        public List<String> getFuzzySalesArea(){return this.fuzzySalesArea;}

        private List<String> rightFuzzySalesArea;

        public List<String> getRightFuzzySalesArea(){return this.rightFuzzySalesArea;}
        private List<String> salesYearList;

        public List<String> getSalesYearList(){return this.salesYearList;}


        private List<String> fuzzySalesYear;

        public List<String> getFuzzySalesYear(){return this.fuzzySalesYear;}

        private List<String> rightFuzzySalesYear;

        public List<String> getRightFuzzySalesYear(){return this.rightFuzzySalesYear;}
        private List<String> salesMonthList;

        public List<String> getSalesMonthList(){return this.salesMonthList;}


        private List<String> fuzzySalesMonth;

        public List<String> getFuzzySalesMonth(){return this.fuzzySalesMonth;}

        private List<String> rightFuzzySalesMonth;

        public List<String> getRightFuzzySalesMonth(){return this.rightFuzzySalesMonth;}
        private List<String> tranShortCodeList;

        public List<String> getTranShortCodeList(){return this.tranShortCodeList;}


        private List<String> fuzzyTranShortCode;

        public List<String> getFuzzyTranShortCode(){return this.fuzzyTranShortCode;}

        private List<String> rightFuzzyTranShortCode;

        public List<String> getRightFuzzyTranShortCode(){return this.rightFuzzyTranShortCode;}
        private List<String> tranTypeList;

        public List<String> getTranTypeList(){return this.tranTypeList;}


        private List<String> fuzzyTranType;

        public List<String> getFuzzyTranType(){return this.fuzzyTranType;}

        private List<String> rightFuzzyTranType;

        public List<String> getRightFuzzyTranType(){return this.rightFuzzyTranType;}
        private List<String> tranSeriesList;

        public List<String> getTranSeriesList(){return this.tranSeriesList;}


        private List<String> fuzzyTranSeries;

        public List<String> getFuzzyTranSeries(){return this.fuzzyTranSeries;}

        private List<String> rightFuzzyTranSeries;

        public List<String> getRightFuzzyTranSeries(){return this.rightFuzzyTranSeries;}
        private List<String> carShortCodeList;

        public List<String> getCarShortCodeList(){return this.carShortCodeList;}


        private List<String> fuzzyCarShortCode;

        public List<String> getFuzzyCarShortCode(){return this.fuzzyCarShortCode;}

        private List<String> rightFuzzyCarShortCode;

        public List<String> getRightFuzzyCarShortCode(){return this.rightFuzzyCarShortCode;}
        private List<String> carModelList;

        public List<String> getCarModelList(){return this.carModelList;}


        private List<String> fuzzyCarModel;

        public List<String> getFuzzyCarModel(){return this.fuzzyCarModel;}

        private List<String> rightFuzzyCarModel;

        public List<String> getRightFuzzyCarModel(){return this.rightFuzzyCarModel;}
        private List<String> carModelCodeList;

        public List<String> getCarModelCodeList(){return this.carModelCodeList;}


        private List<String> fuzzyCarModelCode;

        public List<String> getFuzzyCarModelCode(){return this.fuzzyCarModelCode;}

        private List<String> rightFuzzyCarModelCode;

        public List<String> getRightFuzzyCarModelCode(){return this.rightFuzzyCarModelCode;}
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

        public QueryBuilder salesIdBetWeen(Integer salesIdSt,Integer salesIdEd){
            this.salesIdSt = salesIdSt;
            this.salesIdEd = salesIdEd;
            return this;
        }

        public QueryBuilder salesIdGreaterEqThan(Integer salesIdSt){
            this.salesIdSt = salesIdSt;
            return this;
        }
        public QueryBuilder salesIdLessEqThan(Integer salesIdEd){
            this.salesIdEd = salesIdEd;
            return this;
        }


        public QueryBuilder salesId(Integer salesId){
            setSalesId(salesId);
            return this;
        }

        public QueryBuilder salesIdList(Integer ... salesId){
            this.salesIdList = solveNullList(salesId);
            return this;
        }

        public QueryBuilder salesIdList(List<Integer> salesId){
            this.salesIdList = salesId;
            return this;
        }

        public QueryBuilder fetchSalesId(){
            setFetchFields("fetchFields","salesId");
            return this;
        }

        public QueryBuilder excludeSalesId(){
            setFetchFields("excludeFields","salesId");
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

        public QueryBuilder fuzzySalesCarType (List<String> fuzzySalesCarType){
            this.fuzzySalesCarType = fuzzySalesCarType;
            return this;
        }

        public QueryBuilder fuzzySalesCarType (String ... fuzzySalesCarType){
            this.fuzzySalesCarType = solveNullList(fuzzySalesCarType);
            return this;
        }

        public QueryBuilder rightFuzzySalesCarType (List<String> rightFuzzySalesCarType){
            this.rightFuzzySalesCarType = rightFuzzySalesCarType;
            return this;
        }

        public QueryBuilder rightFuzzySalesCarType (String ... rightFuzzySalesCarType){
            this.rightFuzzySalesCarType = solveNullList(rightFuzzySalesCarType);
            return this;
        }

        public QueryBuilder salesCarType(String salesCarType){
            setSalesCarType(salesCarType);
            return this;
        }

        public QueryBuilder salesCarTypeList(String ... salesCarType){
            this.salesCarTypeList = solveNullList(salesCarType);
            return this;
        }

        public QueryBuilder salesCarTypeList(List<String> salesCarType){
            this.salesCarTypeList = salesCarType;
            return this;
        }

        public QueryBuilder fetchSalesCarType(){
            setFetchFields("fetchFields","salesCarType");
            return this;
        }

        public QueryBuilder excludeSalesCarType(){
            setFetchFields("excludeFields","salesCarType");
            return this;
        }

        public QueryBuilder fuzzySalesCarTypeDetail (List<String> fuzzySalesCarTypeDetail){
            this.fuzzySalesCarTypeDetail = fuzzySalesCarTypeDetail;
            return this;
        }

        public QueryBuilder fuzzySalesCarTypeDetail (String ... fuzzySalesCarTypeDetail){
            this.fuzzySalesCarTypeDetail = solveNullList(fuzzySalesCarTypeDetail);
            return this;
        }

        public QueryBuilder rightFuzzySalesCarTypeDetail (List<String> rightFuzzySalesCarTypeDetail){
            this.rightFuzzySalesCarTypeDetail = rightFuzzySalesCarTypeDetail;
            return this;
        }

        public QueryBuilder rightFuzzySalesCarTypeDetail (String ... rightFuzzySalesCarTypeDetail){
            this.rightFuzzySalesCarTypeDetail = solveNullList(rightFuzzySalesCarTypeDetail);
            return this;
        }

        public QueryBuilder salesCarTypeDetail(String salesCarTypeDetail){
            setSalesCarTypeDetail(salesCarTypeDetail);
            return this;
        }

        public QueryBuilder salesCarTypeDetailList(String ... salesCarTypeDetail){
            this.salesCarTypeDetailList = solveNullList(salesCarTypeDetail);
            return this;
        }

        public QueryBuilder salesCarTypeDetailList(List<String> salesCarTypeDetail){
            this.salesCarTypeDetailList = salesCarTypeDetail;
            return this;
        }

        public QueryBuilder fetchSalesCarTypeDetail(){
            setFetchFields("fetchFields","salesCarTypeDetail");
            return this;
        }

        public QueryBuilder excludeSalesCarTypeDetail(){
            setFetchFields("excludeFields","salesCarTypeDetail");
            return this;
        }

        public QueryBuilder fuzzySalesCarTypeCn (List<String> fuzzySalesCarTypeCn){
            this.fuzzySalesCarTypeCn = fuzzySalesCarTypeCn;
            return this;
        }

        public QueryBuilder fuzzySalesCarTypeCn (String ... fuzzySalesCarTypeCn){
            this.fuzzySalesCarTypeCn = solveNullList(fuzzySalesCarTypeCn);
            return this;
        }

        public QueryBuilder rightFuzzySalesCarTypeCn (List<String> rightFuzzySalesCarTypeCn){
            this.rightFuzzySalesCarTypeCn = rightFuzzySalesCarTypeCn;
            return this;
        }

        public QueryBuilder rightFuzzySalesCarTypeCn (String ... rightFuzzySalesCarTypeCn){
            this.rightFuzzySalesCarTypeCn = solveNullList(rightFuzzySalesCarTypeCn);
            return this;
        }

        public QueryBuilder salesCarTypeCn(String salesCarTypeCn){
            setSalesCarTypeCn(salesCarTypeCn);
            return this;
        }

        public QueryBuilder salesCarTypeCnList(String ... salesCarTypeCn){
            this.salesCarTypeCnList = solveNullList(salesCarTypeCn);
            return this;
        }

        public QueryBuilder salesCarTypeCnList(List<String> salesCarTypeCn){
            this.salesCarTypeCnList = salesCarTypeCn;
            return this;
        }

        public QueryBuilder fetchSalesCarTypeCn(){
            setFetchFields("fetchFields","salesCarTypeCn");
            return this;
        }

        public QueryBuilder excludeSalesCarTypeCn(){
            setFetchFields("excludeFields","salesCarTypeCn");
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

        public QueryBuilder fuzzyProduceDate (List<String> fuzzyProduceDate){
            this.fuzzyProduceDate = fuzzyProduceDate;
            return this;
        }

        public QueryBuilder fuzzyProduceDate (String ... fuzzyProduceDate){
            this.fuzzyProduceDate = solveNullList(fuzzyProduceDate);
            return this;
        }

        public QueryBuilder rightFuzzyProduceDate (List<String> rightFuzzyProduceDate){
            this.rightFuzzyProduceDate = rightFuzzyProduceDate;
            return this;
        }

        public QueryBuilder rightFuzzyProduceDate (String ... rightFuzzyProduceDate){
            this.rightFuzzyProduceDate = solveNullList(rightFuzzyProduceDate);
            return this;
        }

        public QueryBuilder produceDate(String produceDate){
            setProduceDate(produceDate);
            return this;
        }

        public QueryBuilder produceDateList(String ... produceDate){
            this.produceDateList = solveNullList(produceDate);
            return this;
        }

        public QueryBuilder produceDateList(List<String> produceDate){
            this.produceDateList = produceDate;
            return this;
        }

        public QueryBuilder fetchProduceDate(){
            setFetchFields("fetchFields","produceDate");
            return this;
        }

        public QueryBuilder excludeProduceDate(){
            setFetchFields("excludeFields","produceDate");
            return this;
        }

        public QueryBuilder fuzzyFirstPinDate (List<String> fuzzyFirstPinDate){
            this.fuzzyFirstPinDate = fuzzyFirstPinDate;
            return this;
        }

        public QueryBuilder fuzzyFirstPinDate (String ... fuzzyFirstPinDate){
            this.fuzzyFirstPinDate = solveNullList(fuzzyFirstPinDate);
            return this;
        }

        public QueryBuilder rightFuzzyFirstPinDate (List<String> rightFuzzyFirstPinDate){
            this.rightFuzzyFirstPinDate = rightFuzzyFirstPinDate;
            return this;
        }

        public QueryBuilder rightFuzzyFirstPinDate (String ... rightFuzzyFirstPinDate){
            this.rightFuzzyFirstPinDate = solveNullList(rightFuzzyFirstPinDate);
            return this;
        }

        public QueryBuilder firstPinDate(String firstPinDate){
            setFirstPinDate(firstPinDate);
            return this;
        }

        public QueryBuilder firstPinDateList(String ... firstPinDate){
            this.firstPinDateList = solveNullList(firstPinDate);
            return this;
        }

        public QueryBuilder firstPinDateList(List<String> firstPinDate){
            this.firstPinDateList = firstPinDate;
            return this;
        }

        public QueryBuilder fetchFirstPinDate(){
            setFetchFields("fetchFields","firstPinDate");
            return this;
        }

        public QueryBuilder excludeFirstPinDate(){
            setFetchFields("excludeFields","firstPinDate");
            return this;
        }

        public QueryBuilder fuzzySecondPinDate (List<String> fuzzySecondPinDate){
            this.fuzzySecondPinDate = fuzzySecondPinDate;
            return this;
        }

        public QueryBuilder fuzzySecondPinDate (String ... fuzzySecondPinDate){
            this.fuzzySecondPinDate = solveNullList(fuzzySecondPinDate);
            return this;
        }

        public QueryBuilder rightFuzzySecondPinDate (List<String> rightFuzzySecondPinDate){
            this.rightFuzzySecondPinDate = rightFuzzySecondPinDate;
            return this;
        }

        public QueryBuilder rightFuzzySecondPinDate (String ... rightFuzzySecondPinDate){
            this.rightFuzzySecondPinDate = solveNullList(rightFuzzySecondPinDate);
            return this;
        }

        public QueryBuilder secondPinDate(String secondPinDate){
            setSecondPinDate(secondPinDate);
            return this;
        }

        public QueryBuilder secondPinDateList(String ... secondPinDate){
            this.secondPinDateList = solveNullList(secondPinDate);
            return this;
        }

        public QueryBuilder secondPinDateList(List<String> secondPinDate){
            this.secondPinDateList = secondPinDate;
            return this;
        }

        public QueryBuilder fetchSecondPinDate(){
            setFetchFields("fetchFields","secondPinDate");
            return this;
        }

        public QueryBuilder excludeSecondPinDate(){
            setFetchFields("excludeFields","secondPinDate");
            return this;
        }

        public QueryBuilder fuzzyState (List<String> fuzzyState){
            this.fuzzyState = fuzzyState;
            return this;
        }

        public QueryBuilder fuzzyState (String ... fuzzyState){
            this.fuzzyState = solveNullList(fuzzyState);
            return this;
        }

        public QueryBuilder rightFuzzyState (List<String> rightFuzzyState){
            this.rightFuzzyState = rightFuzzyState;
            return this;
        }

        public QueryBuilder rightFuzzyState (String ... rightFuzzyState){
            this.rightFuzzyState = solveNullList(rightFuzzyState);
            return this;
        }

        public QueryBuilder state(String state){
            setState(state);
            return this;
        }

        public QueryBuilder stateList(String ... state){
            this.stateList = solveNullList(state);
            return this;
        }

        public QueryBuilder stateList(List<String> state){
            this.stateList = state;
            return this;
        }

        public QueryBuilder fetchState(){
            setFetchFields("fetchFields","state");
            return this;
        }

        public QueryBuilder excludeState(){
            setFetchFields("excludeFields","state");
            return this;
        }

        public QueryBuilder fuzzyMtoc (List<String> fuzzyMtoc){
            this.fuzzyMtoc = fuzzyMtoc;
            return this;
        }

        public QueryBuilder fuzzyMtoc (String ... fuzzyMtoc){
            this.fuzzyMtoc = solveNullList(fuzzyMtoc);
            return this;
        }

        public QueryBuilder rightFuzzyMtoc (List<String> rightFuzzyMtoc){
            this.rightFuzzyMtoc = rightFuzzyMtoc;
            return this;
        }

        public QueryBuilder rightFuzzyMtoc (String ... rightFuzzyMtoc){
            this.rightFuzzyMtoc = solveNullList(rightFuzzyMtoc);
            return this;
        }

        public QueryBuilder mtoc(String mtoc){
            setMtoc(mtoc);
            return this;
        }

        public QueryBuilder mtocList(String ... mtoc){
            this.mtocList = solveNullList(mtoc);
            return this;
        }

        public QueryBuilder mtocList(List<String> mtoc){
            this.mtocList = mtoc;
            return this;
        }

        public QueryBuilder fetchMtoc(){
            setFetchFields("fetchFields","mtoc");
            return this;
        }

        public QueryBuilder excludeMtoc(){
            setFetchFields("excludeFields","mtoc");
            return this;
        }

        public QueryBuilder fuzzyCarType (List<String> fuzzyCarType){
            this.fuzzyCarType = fuzzyCarType;
            return this;
        }

        public QueryBuilder fuzzyCarType (String ... fuzzyCarType){
            this.fuzzyCarType = solveNullList(fuzzyCarType);
            return this;
        }

        public QueryBuilder rightFuzzyCarType (List<String> rightFuzzyCarType){
            this.rightFuzzyCarType = rightFuzzyCarType;
            return this;
        }

        public QueryBuilder rightFuzzyCarType (String ... rightFuzzyCarType){
            this.rightFuzzyCarType = solveNullList(rightFuzzyCarType);
            return this;
        }

        public QueryBuilder carType(String carType){
            setCarType(carType);
            return this;
        }

        public QueryBuilder carTypeList(String ... carType){
            this.carTypeList = solveNullList(carType);
            return this;
        }

        public QueryBuilder carTypeList(List<String> carType){
            this.carTypeList = carType;
            return this;
        }

        public QueryBuilder fetchCarType(){
            setFetchFields("fetchFields","carType");
            return this;
        }

        public QueryBuilder excludeCarType(){
            setFetchFields("excludeFields","carType");
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

        public QueryBuilder fuzzyFactoryCode (List<String> fuzzyFactoryCode){
            this.fuzzyFactoryCode = fuzzyFactoryCode;
            return this;
        }

        public QueryBuilder fuzzyFactoryCode (String ... fuzzyFactoryCode){
            this.fuzzyFactoryCode = solveNullList(fuzzyFactoryCode);
            return this;
        }

        public QueryBuilder rightFuzzyFactoryCode (List<String> rightFuzzyFactoryCode){
            this.rightFuzzyFactoryCode = rightFuzzyFactoryCode;
            return this;
        }

        public QueryBuilder rightFuzzyFactoryCode (String ... rightFuzzyFactoryCode){
            this.rightFuzzyFactoryCode = solveNullList(rightFuzzyFactoryCode);
            return this;
        }

        public QueryBuilder factoryCode(String factoryCode){
            setFactoryCode(factoryCode);
            return this;
        }

        public QueryBuilder factoryCodeList(String ... factoryCode){
            this.factoryCodeList = solveNullList(factoryCode);
            return this;
        }

        public QueryBuilder factoryCodeList(List<String> factoryCode){
            this.factoryCodeList = factoryCode;
            return this;
        }

        public QueryBuilder fetchFactoryCode(){
            setFetchFields("fetchFields","factoryCode");
            return this;
        }

        public QueryBuilder excludeFactoryCode(){
            setFetchFields("excludeFields","factoryCode");
            return this;
        }

        public QueryBuilder fuzzyFactoryArea (List<String> fuzzyFactoryArea){
            this.fuzzyFactoryArea = fuzzyFactoryArea;
            return this;
        }

        public QueryBuilder fuzzyFactoryArea (String ... fuzzyFactoryArea){
            this.fuzzyFactoryArea = solveNullList(fuzzyFactoryArea);
            return this;
        }

        public QueryBuilder rightFuzzyFactoryArea (List<String> rightFuzzyFactoryArea){
            this.rightFuzzyFactoryArea = rightFuzzyFactoryArea;
            return this;
        }

        public QueryBuilder rightFuzzyFactoryArea (String ... rightFuzzyFactoryArea){
            this.rightFuzzyFactoryArea = solveNullList(rightFuzzyFactoryArea);
            return this;
        }

        public QueryBuilder factoryArea(String factoryArea){
            setFactoryArea(factoryArea);
            return this;
        }

        public QueryBuilder factoryAreaList(String ... factoryArea){
            this.factoryAreaList = solveNullList(factoryArea);
            return this;
        }

        public QueryBuilder factoryAreaList(List<String> factoryArea){
            this.factoryAreaList = factoryArea;
            return this;
        }

        public QueryBuilder fetchFactoryArea(){
            setFetchFields("fetchFields","factoryArea");
            return this;
        }

        public QueryBuilder excludeFactoryArea(){
            setFetchFields("excludeFields","factoryArea");
            return this;
        }

        public QueryBuilder fuzzyEngShortCode (List<String> fuzzyEngShortCode){
            this.fuzzyEngShortCode = fuzzyEngShortCode;
            return this;
        }

        public QueryBuilder fuzzyEngShortCode (String ... fuzzyEngShortCode){
            this.fuzzyEngShortCode = solveNullList(fuzzyEngShortCode);
            return this;
        }

        public QueryBuilder rightFuzzyEngShortCode (List<String> rightFuzzyEngShortCode){
            this.rightFuzzyEngShortCode = rightFuzzyEngShortCode;
            return this;
        }

        public QueryBuilder rightFuzzyEngShortCode (String ... rightFuzzyEngShortCode){
            this.rightFuzzyEngShortCode = solveNullList(rightFuzzyEngShortCode);
            return this;
        }

        public QueryBuilder engShortCode(String engShortCode){
            setEngShortCode(engShortCode);
            return this;
        }

        public QueryBuilder engShortCodeList(String ... engShortCode){
            this.engShortCodeList = solveNullList(engShortCode);
            return this;
        }

        public QueryBuilder engShortCodeList(List<String> engShortCode){
            this.engShortCodeList = engShortCode;
            return this;
        }

        public QueryBuilder fetchEngShortCode(){
            setFetchFields("fetchFields","engShortCode");
            return this;
        }

        public QueryBuilder excludeEngShortCode(){
            setFetchFields("excludeFields","engShortCode");
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

        public QueryBuilder fuzzyEngSeries (List<String> fuzzyEngSeries){
            this.fuzzyEngSeries = fuzzyEngSeries;
            return this;
        }

        public QueryBuilder fuzzyEngSeries (String ... fuzzyEngSeries){
            this.fuzzyEngSeries = solveNullList(fuzzyEngSeries);
            return this;
        }

        public QueryBuilder rightFuzzyEngSeries (List<String> rightFuzzyEngSeries){
            this.rightFuzzyEngSeries = rightFuzzyEngSeries;
            return this;
        }

        public QueryBuilder rightFuzzyEngSeries (String ... rightFuzzyEngSeries){
            this.rightFuzzyEngSeries = solveNullList(rightFuzzyEngSeries);
            return this;
        }

        public QueryBuilder engSeries(String engSeries){
            setEngSeries(engSeries);
            return this;
        }

        public QueryBuilder engSeriesList(String ... engSeries){
            this.engSeriesList = solveNullList(engSeries);
            return this;
        }

        public QueryBuilder engSeriesList(List<String> engSeries){
            this.engSeriesList = engSeries;
            return this;
        }

        public QueryBuilder fetchEngSeries(){
            setFetchFields("fetchFields","engSeries");
            return this;
        }

        public QueryBuilder excludeEngSeries(){
            setFetchFields("excludeFields","engSeries");
            return this;
        }

        public QueryBuilder fuzzySalesArea (List<String> fuzzySalesArea){
            this.fuzzySalesArea = fuzzySalesArea;
            return this;
        }

        public QueryBuilder fuzzySalesArea (String ... fuzzySalesArea){
            this.fuzzySalesArea = solveNullList(fuzzySalesArea);
            return this;
        }

        public QueryBuilder rightFuzzySalesArea (List<String> rightFuzzySalesArea){
            this.rightFuzzySalesArea = rightFuzzySalesArea;
            return this;
        }

        public QueryBuilder rightFuzzySalesArea (String ... rightFuzzySalesArea){
            this.rightFuzzySalesArea = solveNullList(rightFuzzySalesArea);
            return this;
        }

        public QueryBuilder salesArea(String salesArea){
            setSalesArea(salesArea);
            return this;
        }

        public QueryBuilder salesAreaList(String ... salesArea){
            this.salesAreaList = solveNullList(salesArea);
            return this;
        }

        public QueryBuilder salesAreaList(List<String> salesArea){
            this.salesAreaList = salesArea;
            return this;
        }

        public QueryBuilder fetchSalesArea(){
            setFetchFields("fetchFields","salesArea");
            return this;
        }

        public QueryBuilder excludeSalesArea(){
            setFetchFields("excludeFields","salesArea");
            return this;
        }

        public QueryBuilder fuzzySalesYear (List<String> fuzzySalesYear){
            this.fuzzySalesYear = fuzzySalesYear;
            return this;
        }

        public QueryBuilder fuzzySalesYear (String ... fuzzySalesYear){
            this.fuzzySalesYear = solveNullList(fuzzySalesYear);
            return this;
        }

        public QueryBuilder rightFuzzySalesYear (List<String> rightFuzzySalesYear){
            this.rightFuzzySalesYear = rightFuzzySalesYear;
            return this;
        }

        public QueryBuilder rightFuzzySalesYear (String ... rightFuzzySalesYear){
            this.rightFuzzySalesYear = solveNullList(rightFuzzySalesYear);
            return this;
        }

        public QueryBuilder salesYear(String salesYear){
            setSalesYear(salesYear);
            return this;
        }

        public QueryBuilder salesYearList(String ... salesYear){
            this.salesYearList = solveNullList(salesYear);
            return this;
        }

        public QueryBuilder salesYearList(List<String> salesYear){
            this.salesYearList = salesYear;
            return this;
        }

        public QueryBuilder fetchSalesYear(){
            setFetchFields("fetchFields","salesYear");
            return this;
        }

        public QueryBuilder excludeSalesYear(){
            setFetchFields("excludeFields","salesYear");
            return this;
        }

        public QueryBuilder fuzzySalesMonth (List<String> fuzzySalesMonth){
            this.fuzzySalesMonth = fuzzySalesMonth;
            return this;
        }

        public QueryBuilder fuzzySalesMonth (String ... fuzzySalesMonth){
            this.fuzzySalesMonth = solveNullList(fuzzySalesMonth);
            return this;
        }

        public QueryBuilder rightFuzzySalesMonth (List<String> rightFuzzySalesMonth){
            this.rightFuzzySalesMonth = rightFuzzySalesMonth;
            return this;
        }

        public QueryBuilder rightFuzzySalesMonth (String ... rightFuzzySalesMonth){
            this.rightFuzzySalesMonth = solveNullList(rightFuzzySalesMonth);
            return this;
        }

        public QueryBuilder salesMonth(String salesMonth){
            setSalesMonth(salesMonth);
            return this;
        }

        public QueryBuilder salesMonthList(String ... salesMonth){
            this.salesMonthList = solveNullList(salesMonth);
            return this;
        }

        public QueryBuilder salesMonthList(List<String> salesMonth){
            this.salesMonthList = salesMonth;
            return this;
        }

        public QueryBuilder fetchSalesMonth(){
            setFetchFields("fetchFields","salesMonth");
            return this;
        }

        public QueryBuilder excludeSalesMonth(){
            setFetchFields("excludeFields","salesMonth");
            return this;
        }

        public QueryBuilder fuzzyTranShortCode (List<String> fuzzyTranShortCode){
            this.fuzzyTranShortCode = fuzzyTranShortCode;
            return this;
        }

        public QueryBuilder fuzzyTranShortCode (String ... fuzzyTranShortCode){
            this.fuzzyTranShortCode = solveNullList(fuzzyTranShortCode);
            return this;
        }

        public QueryBuilder rightFuzzyTranShortCode (List<String> rightFuzzyTranShortCode){
            this.rightFuzzyTranShortCode = rightFuzzyTranShortCode;
            return this;
        }

        public QueryBuilder rightFuzzyTranShortCode (String ... rightFuzzyTranShortCode){
            this.rightFuzzyTranShortCode = solveNullList(rightFuzzyTranShortCode);
            return this;
        }

        public QueryBuilder tranShortCode(String tranShortCode){
            setTranShortCode(tranShortCode);
            return this;
        }

        public QueryBuilder tranShortCodeList(String ... tranShortCode){
            this.tranShortCodeList = solveNullList(tranShortCode);
            return this;
        }

        public QueryBuilder tranShortCodeList(List<String> tranShortCode){
            this.tranShortCodeList = tranShortCode;
            return this;
        }

        public QueryBuilder fetchTranShortCode(){
            setFetchFields("fetchFields","tranShortCode");
            return this;
        }

        public QueryBuilder excludeTranShortCode(){
            setFetchFields("excludeFields","tranShortCode");
            return this;
        }

        public QueryBuilder fuzzyTranType (List<String> fuzzyTranType){
            this.fuzzyTranType = fuzzyTranType;
            return this;
        }

        public QueryBuilder fuzzyTranType (String ... fuzzyTranType){
            this.fuzzyTranType = solveNullList(fuzzyTranType);
            return this;
        }

        public QueryBuilder rightFuzzyTranType (List<String> rightFuzzyTranType){
            this.rightFuzzyTranType = rightFuzzyTranType;
            return this;
        }

        public QueryBuilder rightFuzzyTranType (String ... rightFuzzyTranType){
            this.rightFuzzyTranType = solveNullList(rightFuzzyTranType);
            return this;
        }

        public QueryBuilder tranType(String tranType){
            setTranType(tranType);
            return this;
        }

        public QueryBuilder tranTypeList(String ... tranType){
            this.tranTypeList = solveNullList(tranType);
            return this;
        }

        public QueryBuilder tranTypeList(List<String> tranType){
            this.tranTypeList = tranType;
            return this;
        }

        public QueryBuilder fetchTranType(){
            setFetchFields("fetchFields","tranType");
            return this;
        }

        public QueryBuilder excludeTranType(){
            setFetchFields("excludeFields","tranType");
            return this;
        }

        public QueryBuilder fuzzyTranSeries (List<String> fuzzyTranSeries){
            this.fuzzyTranSeries = fuzzyTranSeries;
            return this;
        }

        public QueryBuilder fuzzyTranSeries (String ... fuzzyTranSeries){
            this.fuzzyTranSeries = solveNullList(fuzzyTranSeries);
            return this;
        }

        public QueryBuilder rightFuzzyTranSeries (List<String> rightFuzzyTranSeries){
            this.rightFuzzyTranSeries = rightFuzzyTranSeries;
            return this;
        }

        public QueryBuilder rightFuzzyTranSeries (String ... rightFuzzyTranSeries){
            this.rightFuzzyTranSeries = solveNullList(rightFuzzyTranSeries);
            return this;
        }

        public QueryBuilder tranSeries(String tranSeries){
            setTranSeries(tranSeries);
            return this;
        }

        public QueryBuilder tranSeriesList(String ... tranSeries){
            this.tranSeriesList = solveNullList(tranSeries);
            return this;
        }

        public QueryBuilder tranSeriesList(List<String> tranSeries){
            this.tranSeriesList = tranSeries;
            return this;
        }

        public QueryBuilder fetchTranSeries(){
            setFetchFields("fetchFields","tranSeries");
            return this;
        }

        public QueryBuilder excludeTranSeries(){
            setFetchFields("excludeFields","tranSeries");
            return this;
        }

        public QueryBuilder fuzzyCarShortCode (List<String> fuzzyCarShortCode){
            this.fuzzyCarShortCode = fuzzyCarShortCode;
            return this;
        }

        public QueryBuilder fuzzyCarShortCode (String ... fuzzyCarShortCode){
            this.fuzzyCarShortCode = solveNullList(fuzzyCarShortCode);
            return this;
        }

        public QueryBuilder rightFuzzyCarShortCode (List<String> rightFuzzyCarShortCode){
            this.rightFuzzyCarShortCode = rightFuzzyCarShortCode;
            return this;
        }

        public QueryBuilder rightFuzzyCarShortCode (String ... rightFuzzyCarShortCode){
            this.rightFuzzyCarShortCode = solveNullList(rightFuzzyCarShortCode);
            return this;
        }

        public QueryBuilder carShortCode(String carShortCode){
            setCarShortCode(carShortCode);
            return this;
        }

        public QueryBuilder carShortCodeList(String ... carShortCode){
            this.carShortCodeList = solveNullList(carShortCode);
            return this;
        }

        public QueryBuilder carShortCodeList(List<String> carShortCode){
            this.carShortCodeList = carShortCode;
            return this;
        }

        public QueryBuilder fetchCarShortCode(){
            setFetchFields("fetchFields","carShortCode");
            return this;
        }

        public QueryBuilder excludeCarShortCode(){
            setFetchFields("excludeFields","carShortCode");
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

        public QueryBuilder fuzzyCarModelCode (List<String> fuzzyCarModelCode){
            this.fuzzyCarModelCode = fuzzyCarModelCode;
            return this;
        }

        public QueryBuilder fuzzyCarModelCode (String ... fuzzyCarModelCode){
            this.fuzzyCarModelCode = solveNullList(fuzzyCarModelCode);
            return this;
        }

        public QueryBuilder rightFuzzyCarModelCode (List<String> rightFuzzyCarModelCode){
            this.rightFuzzyCarModelCode = rightFuzzyCarModelCode;
            return this;
        }

        public QueryBuilder rightFuzzyCarModelCode (String ... rightFuzzyCarModelCode){
            this.rightFuzzyCarModelCode = solveNullList(rightFuzzyCarModelCode);
            return this;
        }

        public QueryBuilder carModelCode(String carModelCode){
            setCarModelCode(carModelCode);
            return this;
        }

        public QueryBuilder carModelCodeList(String ... carModelCode){
            this.carModelCodeList = solveNullList(carModelCode);
            return this;
        }

        public QueryBuilder carModelCodeList(List<String> carModelCode){
            this.carModelCodeList = carModelCode;
            return this;
        }

        public QueryBuilder fetchCarModelCode(){
            setFetchFields("fetchFields","carModelCode");
            return this;
        }

        public QueryBuilder excludeCarModelCode(){
            setFetchFields("excludeFields","carModelCode");
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

        public MqmsSales build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> salesIdList;

        public List<Integer> getSalesIdList(){return this.salesIdList;}

        private Integer salesIdSt;

        private Integer salesIdEd;

        public Integer getSalesIdSt(){return this.salesIdSt;}

        public Integer getSalesIdEd(){return this.salesIdEd;}

        private List<String> vinCodeList;

        public List<String> getVinCodeList(){return this.vinCodeList;}


        private List<String> fuzzyVinCode;

        public List<String> getFuzzyVinCode(){return this.fuzzyVinCode;}

        private List<String> rightFuzzyVinCode;

        public List<String> getRightFuzzyVinCode(){return this.rightFuzzyVinCode;}
        private List<String> salesCarTypeList;

        public List<String> getSalesCarTypeList(){return this.salesCarTypeList;}


        private List<String> fuzzySalesCarType;

        public List<String> getFuzzySalesCarType(){return this.fuzzySalesCarType;}

        private List<String> rightFuzzySalesCarType;

        public List<String> getRightFuzzySalesCarType(){return this.rightFuzzySalesCarType;}
        private List<String> salesCarTypeDetailList;

        public List<String> getSalesCarTypeDetailList(){return this.salesCarTypeDetailList;}


        private List<String> fuzzySalesCarTypeDetail;

        public List<String> getFuzzySalesCarTypeDetail(){return this.fuzzySalesCarTypeDetail;}

        private List<String> rightFuzzySalesCarTypeDetail;

        public List<String> getRightFuzzySalesCarTypeDetail(){return this.rightFuzzySalesCarTypeDetail;}
        private List<String> salesCarTypeCnList;

        public List<String> getSalesCarTypeCnList(){return this.salesCarTypeCnList;}


        private List<String> fuzzySalesCarTypeCn;

        public List<String> getFuzzySalesCarTypeCn(){return this.fuzzySalesCarTypeCn;}

        private List<String> rightFuzzySalesCarTypeCn;

        public List<String> getRightFuzzySalesCarTypeCn(){return this.rightFuzzySalesCarTypeCn;}
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
        private List<String> produceDateList;

        public List<String> getProduceDateList(){return this.produceDateList;}


        private List<String> fuzzyProduceDate;

        public List<String> getFuzzyProduceDate(){return this.fuzzyProduceDate;}

        private List<String> rightFuzzyProduceDate;

        public List<String> getRightFuzzyProduceDate(){return this.rightFuzzyProduceDate;}
        private List<String> firstPinDateList;

        public List<String> getFirstPinDateList(){return this.firstPinDateList;}


        private List<String> fuzzyFirstPinDate;

        public List<String> getFuzzyFirstPinDate(){return this.fuzzyFirstPinDate;}

        private List<String> rightFuzzyFirstPinDate;

        public List<String> getRightFuzzyFirstPinDate(){return this.rightFuzzyFirstPinDate;}
        private List<String> secondPinDateList;

        public List<String> getSecondPinDateList(){return this.secondPinDateList;}


        private List<String> fuzzySecondPinDate;

        public List<String> getFuzzySecondPinDate(){return this.fuzzySecondPinDate;}

        private List<String> rightFuzzySecondPinDate;

        public List<String> getRightFuzzySecondPinDate(){return this.rightFuzzySecondPinDate;}
        private List<String> stateList;

        public List<String> getStateList(){return this.stateList;}


        private List<String> fuzzyState;

        public List<String> getFuzzyState(){return this.fuzzyState;}

        private List<String> rightFuzzyState;

        public List<String> getRightFuzzyState(){return this.rightFuzzyState;}
        private List<String> mtocList;

        public List<String> getMtocList(){return this.mtocList;}


        private List<String> fuzzyMtoc;

        public List<String> getFuzzyMtoc(){return this.fuzzyMtoc;}

        private List<String> rightFuzzyMtoc;

        public List<String> getRightFuzzyMtoc(){return this.rightFuzzyMtoc;}
        private List<String> carTypeList;

        public List<String> getCarTypeList(){return this.carTypeList;}


        private List<String> fuzzyCarType;

        public List<String> getFuzzyCarType(){return this.fuzzyCarType;}

        private List<String> rightFuzzyCarType;

        public List<String> getRightFuzzyCarType(){return this.rightFuzzyCarType;}
        private List<String> transmissionCodeList;

        public List<String> getTransmissionCodeList(){return this.transmissionCodeList;}


        private List<String> fuzzyTransmissionCode;

        public List<String> getFuzzyTransmissionCode(){return this.fuzzyTransmissionCode;}

        private List<String> rightFuzzyTransmissionCode;

        public List<String> getRightFuzzyTransmissionCode(){return this.rightFuzzyTransmissionCode;}
        private List<String> factoryCodeList;

        public List<String> getFactoryCodeList(){return this.factoryCodeList;}


        private List<String> fuzzyFactoryCode;

        public List<String> getFuzzyFactoryCode(){return this.fuzzyFactoryCode;}

        private List<String> rightFuzzyFactoryCode;

        public List<String> getRightFuzzyFactoryCode(){return this.rightFuzzyFactoryCode;}
        private List<String> factoryAreaList;

        public List<String> getFactoryAreaList(){return this.factoryAreaList;}


        private List<String> fuzzyFactoryArea;

        public List<String> getFuzzyFactoryArea(){return this.fuzzyFactoryArea;}

        private List<String> rightFuzzyFactoryArea;

        public List<String> getRightFuzzyFactoryArea(){return this.rightFuzzyFactoryArea;}
        private List<String> engShortCodeList;

        public List<String> getEngShortCodeList(){return this.engShortCodeList;}


        private List<String> fuzzyEngShortCode;

        public List<String> getFuzzyEngShortCode(){return this.fuzzyEngShortCode;}

        private List<String> rightFuzzyEngShortCode;

        public List<String> getRightFuzzyEngShortCode(){return this.rightFuzzyEngShortCode;}
        private List<String> engTypeList;

        public List<String> getEngTypeList(){return this.engTypeList;}


        private List<String> fuzzyEngType;

        public List<String> getFuzzyEngType(){return this.fuzzyEngType;}

        private List<String> rightFuzzyEngType;

        public List<String> getRightFuzzyEngType(){return this.rightFuzzyEngType;}
        private List<String> engSeriesList;

        public List<String> getEngSeriesList(){return this.engSeriesList;}


        private List<String> fuzzyEngSeries;

        public List<String> getFuzzyEngSeries(){return this.fuzzyEngSeries;}

        private List<String> rightFuzzyEngSeries;

        public List<String> getRightFuzzyEngSeries(){return this.rightFuzzyEngSeries;}
        private List<String> salesAreaList;

        public List<String> getSalesAreaList(){return this.salesAreaList;}


        private List<String> fuzzySalesArea;

        public List<String> getFuzzySalesArea(){return this.fuzzySalesArea;}

        private List<String> rightFuzzySalesArea;

        public List<String> getRightFuzzySalesArea(){return this.rightFuzzySalesArea;}
        private List<String> salesYearList;

        public List<String> getSalesYearList(){return this.salesYearList;}


        private List<String> fuzzySalesYear;

        public List<String> getFuzzySalesYear(){return this.fuzzySalesYear;}

        private List<String> rightFuzzySalesYear;

        public List<String> getRightFuzzySalesYear(){return this.rightFuzzySalesYear;}
        private List<String> salesMonthList;

        public List<String> getSalesMonthList(){return this.salesMonthList;}


        private List<String> fuzzySalesMonth;

        public List<String> getFuzzySalesMonth(){return this.fuzzySalesMonth;}

        private List<String> rightFuzzySalesMonth;

        public List<String> getRightFuzzySalesMonth(){return this.rightFuzzySalesMonth;}
        private List<String> tranShortCodeList;

        public List<String> getTranShortCodeList(){return this.tranShortCodeList;}


        private List<String> fuzzyTranShortCode;

        public List<String> getFuzzyTranShortCode(){return this.fuzzyTranShortCode;}

        private List<String> rightFuzzyTranShortCode;

        public List<String> getRightFuzzyTranShortCode(){return this.rightFuzzyTranShortCode;}
        private List<String> tranTypeList;

        public List<String> getTranTypeList(){return this.tranTypeList;}


        private List<String> fuzzyTranType;

        public List<String> getFuzzyTranType(){return this.fuzzyTranType;}

        private List<String> rightFuzzyTranType;

        public List<String> getRightFuzzyTranType(){return this.rightFuzzyTranType;}
        private List<String> tranSeriesList;

        public List<String> getTranSeriesList(){return this.tranSeriesList;}


        private List<String> fuzzyTranSeries;

        public List<String> getFuzzyTranSeries(){return this.fuzzyTranSeries;}

        private List<String> rightFuzzyTranSeries;

        public List<String> getRightFuzzyTranSeries(){return this.rightFuzzyTranSeries;}
        private List<String> carShortCodeList;

        public List<String> getCarShortCodeList(){return this.carShortCodeList;}


        private List<String> fuzzyCarShortCode;

        public List<String> getFuzzyCarShortCode(){return this.fuzzyCarShortCode;}

        private List<String> rightFuzzyCarShortCode;

        public List<String> getRightFuzzyCarShortCode(){return this.rightFuzzyCarShortCode;}
        private List<String> carModelList;

        public List<String> getCarModelList(){return this.carModelList;}


        private List<String> fuzzyCarModel;

        public List<String> getFuzzyCarModel(){return this.fuzzyCarModel;}

        private List<String> rightFuzzyCarModel;

        public List<String> getRightFuzzyCarModel(){return this.rightFuzzyCarModel;}
        private List<String> carModelCodeList;

        public List<String> getCarModelCodeList(){return this.carModelCodeList;}


        private List<String> fuzzyCarModelCode;

        public List<String> getFuzzyCarModelCode(){return this.fuzzyCarModelCode;}

        private List<String> rightFuzzyCarModelCode;

        public List<String> getRightFuzzyCarModelCode(){return this.rightFuzzyCarModelCode;}
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

        public ConditionBuilder salesIdBetWeen(Integer salesIdSt,Integer salesIdEd){
            this.salesIdSt = salesIdSt;
            this.salesIdEd = salesIdEd;
            return this;
        }

        public ConditionBuilder salesIdGreaterEqThan(Integer salesIdSt){
            this.salesIdSt = salesIdSt;
            return this;
        }
        public ConditionBuilder salesIdLessEqThan(Integer salesIdEd){
            this.salesIdEd = salesIdEd;
            return this;
        }


        public ConditionBuilder salesIdList(Integer ... salesId){
            this.salesIdList = solveNullList(salesId);
            return this;
        }

        public ConditionBuilder salesIdList(List<Integer> salesId){
            this.salesIdList = salesId;
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

        public ConditionBuilder fuzzySalesCarType (List<String> fuzzySalesCarType){
            this.fuzzySalesCarType = fuzzySalesCarType;
            return this;
        }

        public ConditionBuilder fuzzySalesCarType (String ... fuzzySalesCarType){
            this.fuzzySalesCarType = solveNullList(fuzzySalesCarType);
            return this;
        }

        public ConditionBuilder rightFuzzySalesCarType (List<String> rightFuzzySalesCarType){
            this.rightFuzzySalesCarType = rightFuzzySalesCarType;
            return this;
        }

        public ConditionBuilder rightFuzzySalesCarType (String ... rightFuzzySalesCarType){
            this.rightFuzzySalesCarType = solveNullList(rightFuzzySalesCarType);
            return this;
        }

        public ConditionBuilder salesCarTypeList(String ... salesCarType){
            this.salesCarTypeList = solveNullList(salesCarType);
            return this;
        }

        public ConditionBuilder salesCarTypeList(List<String> salesCarType){
            this.salesCarTypeList = salesCarType;
            return this;
        }

        public ConditionBuilder fuzzySalesCarTypeDetail (List<String> fuzzySalesCarTypeDetail){
            this.fuzzySalesCarTypeDetail = fuzzySalesCarTypeDetail;
            return this;
        }

        public ConditionBuilder fuzzySalesCarTypeDetail (String ... fuzzySalesCarTypeDetail){
            this.fuzzySalesCarTypeDetail = solveNullList(fuzzySalesCarTypeDetail);
            return this;
        }

        public ConditionBuilder rightFuzzySalesCarTypeDetail (List<String> rightFuzzySalesCarTypeDetail){
            this.rightFuzzySalesCarTypeDetail = rightFuzzySalesCarTypeDetail;
            return this;
        }

        public ConditionBuilder rightFuzzySalesCarTypeDetail (String ... rightFuzzySalesCarTypeDetail){
            this.rightFuzzySalesCarTypeDetail = solveNullList(rightFuzzySalesCarTypeDetail);
            return this;
        }

        public ConditionBuilder salesCarTypeDetailList(String ... salesCarTypeDetail){
            this.salesCarTypeDetailList = solveNullList(salesCarTypeDetail);
            return this;
        }

        public ConditionBuilder salesCarTypeDetailList(List<String> salesCarTypeDetail){
            this.salesCarTypeDetailList = salesCarTypeDetail;
            return this;
        }

        public ConditionBuilder fuzzySalesCarTypeCn (List<String> fuzzySalesCarTypeCn){
            this.fuzzySalesCarTypeCn = fuzzySalesCarTypeCn;
            return this;
        }

        public ConditionBuilder fuzzySalesCarTypeCn (String ... fuzzySalesCarTypeCn){
            this.fuzzySalesCarTypeCn = solveNullList(fuzzySalesCarTypeCn);
            return this;
        }

        public ConditionBuilder rightFuzzySalesCarTypeCn (List<String> rightFuzzySalesCarTypeCn){
            this.rightFuzzySalesCarTypeCn = rightFuzzySalesCarTypeCn;
            return this;
        }

        public ConditionBuilder rightFuzzySalesCarTypeCn (String ... rightFuzzySalesCarTypeCn){
            this.rightFuzzySalesCarTypeCn = solveNullList(rightFuzzySalesCarTypeCn);
            return this;
        }

        public ConditionBuilder salesCarTypeCnList(String ... salesCarTypeCn){
            this.salesCarTypeCnList = solveNullList(salesCarTypeCn);
            return this;
        }

        public ConditionBuilder salesCarTypeCnList(List<String> salesCarTypeCn){
            this.salesCarTypeCnList = salesCarTypeCn;
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

        public ConditionBuilder fuzzyProduceDate (List<String> fuzzyProduceDate){
            this.fuzzyProduceDate = fuzzyProduceDate;
            return this;
        }

        public ConditionBuilder fuzzyProduceDate (String ... fuzzyProduceDate){
            this.fuzzyProduceDate = solveNullList(fuzzyProduceDate);
            return this;
        }

        public ConditionBuilder rightFuzzyProduceDate (List<String> rightFuzzyProduceDate){
            this.rightFuzzyProduceDate = rightFuzzyProduceDate;
            return this;
        }

        public ConditionBuilder rightFuzzyProduceDate (String ... rightFuzzyProduceDate){
            this.rightFuzzyProduceDate = solveNullList(rightFuzzyProduceDate);
            return this;
        }

        public ConditionBuilder produceDateList(String ... produceDate){
            this.produceDateList = solveNullList(produceDate);
            return this;
        }

        public ConditionBuilder produceDateList(List<String> produceDate){
            this.produceDateList = produceDate;
            return this;
        }

        public ConditionBuilder fuzzyFirstPinDate (List<String> fuzzyFirstPinDate){
            this.fuzzyFirstPinDate = fuzzyFirstPinDate;
            return this;
        }

        public ConditionBuilder fuzzyFirstPinDate (String ... fuzzyFirstPinDate){
            this.fuzzyFirstPinDate = solveNullList(fuzzyFirstPinDate);
            return this;
        }

        public ConditionBuilder rightFuzzyFirstPinDate (List<String> rightFuzzyFirstPinDate){
            this.rightFuzzyFirstPinDate = rightFuzzyFirstPinDate;
            return this;
        }

        public ConditionBuilder rightFuzzyFirstPinDate (String ... rightFuzzyFirstPinDate){
            this.rightFuzzyFirstPinDate = solveNullList(rightFuzzyFirstPinDate);
            return this;
        }

        public ConditionBuilder firstPinDateList(String ... firstPinDate){
            this.firstPinDateList = solveNullList(firstPinDate);
            return this;
        }

        public ConditionBuilder firstPinDateList(List<String> firstPinDate){
            this.firstPinDateList = firstPinDate;
            return this;
        }

        public ConditionBuilder fuzzySecondPinDate (List<String> fuzzySecondPinDate){
            this.fuzzySecondPinDate = fuzzySecondPinDate;
            return this;
        }

        public ConditionBuilder fuzzySecondPinDate (String ... fuzzySecondPinDate){
            this.fuzzySecondPinDate = solveNullList(fuzzySecondPinDate);
            return this;
        }

        public ConditionBuilder rightFuzzySecondPinDate (List<String> rightFuzzySecondPinDate){
            this.rightFuzzySecondPinDate = rightFuzzySecondPinDate;
            return this;
        }

        public ConditionBuilder rightFuzzySecondPinDate (String ... rightFuzzySecondPinDate){
            this.rightFuzzySecondPinDate = solveNullList(rightFuzzySecondPinDate);
            return this;
        }

        public ConditionBuilder secondPinDateList(String ... secondPinDate){
            this.secondPinDateList = solveNullList(secondPinDate);
            return this;
        }

        public ConditionBuilder secondPinDateList(List<String> secondPinDate){
            this.secondPinDateList = secondPinDate;
            return this;
        }

        public ConditionBuilder fuzzyState (List<String> fuzzyState){
            this.fuzzyState = fuzzyState;
            return this;
        }

        public ConditionBuilder fuzzyState (String ... fuzzyState){
            this.fuzzyState = solveNullList(fuzzyState);
            return this;
        }

        public ConditionBuilder rightFuzzyState (List<String> rightFuzzyState){
            this.rightFuzzyState = rightFuzzyState;
            return this;
        }

        public ConditionBuilder rightFuzzyState (String ... rightFuzzyState){
            this.rightFuzzyState = solveNullList(rightFuzzyState);
            return this;
        }

        public ConditionBuilder stateList(String ... state){
            this.stateList = solveNullList(state);
            return this;
        }

        public ConditionBuilder stateList(List<String> state){
            this.stateList = state;
            return this;
        }

        public ConditionBuilder fuzzyMtoc (List<String> fuzzyMtoc){
            this.fuzzyMtoc = fuzzyMtoc;
            return this;
        }

        public ConditionBuilder fuzzyMtoc (String ... fuzzyMtoc){
            this.fuzzyMtoc = solveNullList(fuzzyMtoc);
            return this;
        }

        public ConditionBuilder rightFuzzyMtoc (List<String> rightFuzzyMtoc){
            this.rightFuzzyMtoc = rightFuzzyMtoc;
            return this;
        }

        public ConditionBuilder rightFuzzyMtoc (String ... rightFuzzyMtoc){
            this.rightFuzzyMtoc = solveNullList(rightFuzzyMtoc);
            return this;
        }

        public ConditionBuilder mtocList(String ... mtoc){
            this.mtocList = solveNullList(mtoc);
            return this;
        }

        public ConditionBuilder mtocList(List<String> mtoc){
            this.mtocList = mtoc;
            return this;
        }

        public ConditionBuilder fuzzyCarType (List<String> fuzzyCarType){
            this.fuzzyCarType = fuzzyCarType;
            return this;
        }

        public ConditionBuilder fuzzyCarType (String ... fuzzyCarType){
            this.fuzzyCarType = solveNullList(fuzzyCarType);
            return this;
        }

        public ConditionBuilder rightFuzzyCarType (List<String> rightFuzzyCarType){
            this.rightFuzzyCarType = rightFuzzyCarType;
            return this;
        }

        public ConditionBuilder rightFuzzyCarType (String ... rightFuzzyCarType){
            this.rightFuzzyCarType = solveNullList(rightFuzzyCarType);
            return this;
        }

        public ConditionBuilder carTypeList(String ... carType){
            this.carTypeList = solveNullList(carType);
            return this;
        }

        public ConditionBuilder carTypeList(List<String> carType){
            this.carTypeList = carType;
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

        public ConditionBuilder fuzzyFactoryCode (List<String> fuzzyFactoryCode){
            this.fuzzyFactoryCode = fuzzyFactoryCode;
            return this;
        }

        public ConditionBuilder fuzzyFactoryCode (String ... fuzzyFactoryCode){
            this.fuzzyFactoryCode = solveNullList(fuzzyFactoryCode);
            return this;
        }

        public ConditionBuilder rightFuzzyFactoryCode (List<String> rightFuzzyFactoryCode){
            this.rightFuzzyFactoryCode = rightFuzzyFactoryCode;
            return this;
        }

        public ConditionBuilder rightFuzzyFactoryCode (String ... rightFuzzyFactoryCode){
            this.rightFuzzyFactoryCode = solveNullList(rightFuzzyFactoryCode);
            return this;
        }

        public ConditionBuilder factoryCodeList(String ... factoryCode){
            this.factoryCodeList = solveNullList(factoryCode);
            return this;
        }

        public ConditionBuilder factoryCodeList(List<String> factoryCode){
            this.factoryCodeList = factoryCode;
            return this;
        }

        public ConditionBuilder fuzzyFactoryArea (List<String> fuzzyFactoryArea){
            this.fuzzyFactoryArea = fuzzyFactoryArea;
            return this;
        }

        public ConditionBuilder fuzzyFactoryArea (String ... fuzzyFactoryArea){
            this.fuzzyFactoryArea = solveNullList(fuzzyFactoryArea);
            return this;
        }

        public ConditionBuilder rightFuzzyFactoryArea (List<String> rightFuzzyFactoryArea){
            this.rightFuzzyFactoryArea = rightFuzzyFactoryArea;
            return this;
        }

        public ConditionBuilder rightFuzzyFactoryArea (String ... rightFuzzyFactoryArea){
            this.rightFuzzyFactoryArea = solveNullList(rightFuzzyFactoryArea);
            return this;
        }

        public ConditionBuilder factoryAreaList(String ... factoryArea){
            this.factoryAreaList = solveNullList(factoryArea);
            return this;
        }

        public ConditionBuilder factoryAreaList(List<String> factoryArea){
            this.factoryAreaList = factoryArea;
            return this;
        }

        public ConditionBuilder fuzzyEngShortCode (List<String> fuzzyEngShortCode){
            this.fuzzyEngShortCode = fuzzyEngShortCode;
            return this;
        }

        public ConditionBuilder fuzzyEngShortCode (String ... fuzzyEngShortCode){
            this.fuzzyEngShortCode = solveNullList(fuzzyEngShortCode);
            return this;
        }

        public ConditionBuilder rightFuzzyEngShortCode (List<String> rightFuzzyEngShortCode){
            this.rightFuzzyEngShortCode = rightFuzzyEngShortCode;
            return this;
        }

        public ConditionBuilder rightFuzzyEngShortCode (String ... rightFuzzyEngShortCode){
            this.rightFuzzyEngShortCode = solveNullList(rightFuzzyEngShortCode);
            return this;
        }

        public ConditionBuilder engShortCodeList(String ... engShortCode){
            this.engShortCodeList = solveNullList(engShortCode);
            return this;
        }

        public ConditionBuilder engShortCodeList(List<String> engShortCode){
            this.engShortCodeList = engShortCode;
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

        public ConditionBuilder fuzzyEngSeries (List<String> fuzzyEngSeries){
            this.fuzzyEngSeries = fuzzyEngSeries;
            return this;
        }

        public ConditionBuilder fuzzyEngSeries (String ... fuzzyEngSeries){
            this.fuzzyEngSeries = solveNullList(fuzzyEngSeries);
            return this;
        }

        public ConditionBuilder rightFuzzyEngSeries (List<String> rightFuzzyEngSeries){
            this.rightFuzzyEngSeries = rightFuzzyEngSeries;
            return this;
        }

        public ConditionBuilder rightFuzzyEngSeries (String ... rightFuzzyEngSeries){
            this.rightFuzzyEngSeries = solveNullList(rightFuzzyEngSeries);
            return this;
        }

        public ConditionBuilder engSeriesList(String ... engSeries){
            this.engSeriesList = solveNullList(engSeries);
            return this;
        }

        public ConditionBuilder engSeriesList(List<String> engSeries){
            this.engSeriesList = engSeries;
            return this;
        }

        public ConditionBuilder fuzzySalesArea (List<String> fuzzySalesArea){
            this.fuzzySalesArea = fuzzySalesArea;
            return this;
        }

        public ConditionBuilder fuzzySalesArea (String ... fuzzySalesArea){
            this.fuzzySalesArea = solveNullList(fuzzySalesArea);
            return this;
        }

        public ConditionBuilder rightFuzzySalesArea (List<String> rightFuzzySalesArea){
            this.rightFuzzySalesArea = rightFuzzySalesArea;
            return this;
        }

        public ConditionBuilder rightFuzzySalesArea (String ... rightFuzzySalesArea){
            this.rightFuzzySalesArea = solveNullList(rightFuzzySalesArea);
            return this;
        }

        public ConditionBuilder salesAreaList(String ... salesArea){
            this.salesAreaList = solveNullList(salesArea);
            return this;
        }

        public ConditionBuilder salesAreaList(List<String> salesArea){
            this.salesAreaList = salesArea;
            return this;
        }

        public ConditionBuilder fuzzySalesYear (List<String> fuzzySalesYear){
            this.fuzzySalesYear = fuzzySalesYear;
            return this;
        }

        public ConditionBuilder fuzzySalesYear (String ... fuzzySalesYear){
            this.fuzzySalesYear = solveNullList(fuzzySalesYear);
            return this;
        }

        public ConditionBuilder rightFuzzySalesYear (List<String> rightFuzzySalesYear){
            this.rightFuzzySalesYear = rightFuzzySalesYear;
            return this;
        }

        public ConditionBuilder rightFuzzySalesYear (String ... rightFuzzySalesYear){
            this.rightFuzzySalesYear = solveNullList(rightFuzzySalesYear);
            return this;
        }

        public ConditionBuilder salesYearList(String ... salesYear){
            this.salesYearList = solveNullList(salesYear);
            return this;
        }

        public ConditionBuilder salesYearList(List<String> salesYear){
            this.salesYearList = salesYear;
            return this;
        }

        public ConditionBuilder fuzzySalesMonth (List<String> fuzzySalesMonth){
            this.fuzzySalesMonth = fuzzySalesMonth;
            return this;
        }

        public ConditionBuilder fuzzySalesMonth (String ... fuzzySalesMonth){
            this.fuzzySalesMonth = solveNullList(fuzzySalesMonth);
            return this;
        }

        public ConditionBuilder rightFuzzySalesMonth (List<String> rightFuzzySalesMonth){
            this.rightFuzzySalesMonth = rightFuzzySalesMonth;
            return this;
        }

        public ConditionBuilder rightFuzzySalesMonth (String ... rightFuzzySalesMonth){
            this.rightFuzzySalesMonth = solveNullList(rightFuzzySalesMonth);
            return this;
        }

        public ConditionBuilder salesMonthList(String ... salesMonth){
            this.salesMonthList = solveNullList(salesMonth);
            return this;
        }

        public ConditionBuilder salesMonthList(List<String> salesMonth){
            this.salesMonthList = salesMonth;
            return this;
        }

        public ConditionBuilder fuzzyTranShortCode (List<String> fuzzyTranShortCode){
            this.fuzzyTranShortCode = fuzzyTranShortCode;
            return this;
        }

        public ConditionBuilder fuzzyTranShortCode (String ... fuzzyTranShortCode){
            this.fuzzyTranShortCode = solveNullList(fuzzyTranShortCode);
            return this;
        }

        public ConditionBuilder rightFuzzyTranShortCode (List<String> rightFuzzyTranShortCode){
            this.rightFuzzyTranShortCode = rightFuzzyTranShortCode;
            return this;
        }

        public ConditionBuilder rightFuzzyTranShortCode (String ... rightFuzzyTranShortCode){
            this.rightFuzzyTranShortCode = solveNullList(rightFuzzyTranShortCode);
            return this;
        }

        public ConditionBuilder tranShortCodeList(String ... tranShortCode){
            this.tranShortCodeList = solveNullList(tranShortCode);
            return this;
        }

        public ConditionBuilder tranShortCodeList(List<String> tranShortCode){
            this.tranShortCodeList = tranShortCode;
            return this;
        }

        public ConditionBuilder fuzzyTranType (List<String> fuzzyTranType){
            this.fuzzyTranType = fuzzyTranType;
            return this;
        }

        public ConditionBuilder fuzzyTranType (String ... fuzzyTranType){
            this.fuzzyTranType = solveNullList(fuzzyTranType);
            return this;
        }

        public ConditionBuilder rightFuzzyTranType (List<String> rightFuzzyTranType){
            this.rightFuzzyTranType = rightFuzzyTranType;
            return this;
        }

        public ConditionBuilder rightFuzzyTranType (String ... rightFuzzyTranType){
            this.rightFuzzyTranType = solveNullList(rightFuzzyTranType);
            return this;
        }

        public ConditionBuilder tranTypeList(String ... tranType){
            this.tranTypeList = solveNullList(tranType);
            return this;
        }

        public ConditionBuilder tranTypeList(List<String> tranType){
            this.tranTypeList = tranType;
            return this;
        }

        public ConditionBuilder fuzzyTranSeries (List<String> fuzzyTranSeries){
            this.fuzzyTranSeries = fuzzyTranSeries;
            return this;
        }

        public ConditionBuilder fuzzyTranSeries (String ... fuzzyTranSeries){
            this.fuzzyTranSeries = solveNullList(fuzzyTranSeries);
            return this;
        }

        public ConditionBuilder rightFuzzyTranSeries (List<String> rightFuzzyTranSeries){
            this.rightFuzzyTranSeries = rightFuzzyTranSeries;
            return this;
        }

        public ConditionBuilder rightFuzzyTranSeries (String ... rightFuzzyTranSeries){
            this.rightFuzzyTranSeries = solveNullList(rightFuzzyTranSeries);
            return this;
        }

        public ConditionBuilder tranSeriesList(String ... tranSeries){
            this.tranSeriesList = solveNullList(tranSeries);
            return this;
        }

        public ConditionBuilder tranSeriesList(List<String> tranSeries){
            this.tranSeriesList = tranSeries;
            return this;
        }

        public ConditionBuilder fuzzyCarShortCode (List<String> fuzzyCarShortCode){
            this.fuzzyCarShortCode = fuzzyCarShortCode;
            return this;
        }

        public ConditionBuilder fuzzyCarShortCode (String ... fuzzyCarShortCode){
            this.fuzzyCarShortCode = solveNullList(fuzzyCarShortCode);
            return this;
        }

        public ConditionBuilder rightFuzzyCarShortCode (List<String> rightFuzzyCarShortCode){
            this.rightFuzzyCarShortCode = rightFuzzyCarShortCode;
            return this;
        }

        public ConditionBuilder rightFuzzyCarShortCode (String ... rightFuzzyCarShortCode){
            this.rightFuzzyCarShortCode = solveNullList(rightFuzzyCarShortCode);
            return this;
        }

        public ConditionBuilder carShortCodeList(String ... carShortCode){
            this.carShortCodeList = solveNullList(carShortCode);
            return this;
        }

        public ConditionBuilder carShortCodeList(List<String> carShortCode){
            this.carShortCodeList = carShortCode;
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

        public ConditionBuilder fuzzyCarModelCode (List<String> fuzzyCarModelCode){
            this.fuzzyCarModelCode = fuzzyCarModelCode;
            return this;
        }

        public ConditionBuilder fuzzyCarModelCode (String ... fuzzyCarModelCode){
            this.fuzzyCarModelCode = solveNullList(fuzzyCarModelCode);
            return this;
        }

        public ConditionBuilder rightFuzzyCarModelCode (List<String> rightFuzzyCarModelCode){
            this.rightFuzzyCarModelCode = rightFuzzyCarModelCode;
            return this;
        }

        public ConditionBuilder rightFuzzyCarModelCode (String ... rightFuzzyCarModelCode){
            this.rightFuzzyCarModelCode = solveNullList(rightFuzzyCarModelCode);
            return this;
        }

        public ConditionBuilder carModelCodeList(String ... carModelCode){
            this.carModelCodeList = solveNullList(carModelCode);
            return this;
        }

        public ConditionBuilder carModelCodeList(List<String> carModelCode){
            this.carModelCodeList = carModelCode;
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

        private MqmsSales obj;

        public Builder(){
            this.obj = new MqmsSales();
        }

        public Builder salesId(Integer salesId){
            this.obj.setSalesId(salesId);
            return this;
        }
        public Builder vinCode(String vinCode){
            this.obj.setVinCode(vinCode);
            return this;
        }
        public Builder salesCarType(String salesCarType){
            this.obj.setSalesCarType(salesCarType);
            return this;
        }
        public Builder salesCarTypeDetail(String salesCarTypeDetail){
            this.obj.setSalesCarTypeDetail(salesCarTypeDetail);
            return this;
        }
        public Builder salesCarTypeCn(String salesCarTypeCn){
            this.obj.setSalesCarTypeCn(salesCarTypeCn);
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
        public Builder produceDate(String produceDate){
            this.obj.setProduceDate(produceDate);
            return this;
        }
        public Builder firstPinDate(String firstPinDate){
            this.obj.setFirstPinDate(firstPinDate);
            return this;
        }
        public Builder secondPinDate(String secondPinDate){
            this.obj.setSecondPinDate(secondPinDate);
            return this;
        }
        public Builder state(String state){
            this.obj.setState(state);
            return this;
        }
        public Builder mtoc(String mtoc){
            this.obj.setMtoc(mtoc);
            return this;
        }
        public Builder carType(String carType){
            this.obj.setCarType(carType);
            return this;
        }
        public Builder transmissionCode(String transmissionCode){
            this.obj.setTransmissionCode(transmissionCode);
            return this;
        }
        public Builder factoryCode(String factoryCode){
            this.obj.setFactoryCode(factoryCode);
            return this;
        }
        public Builder factoryArea(String factoryArea){
            this.obj.setFactoryArea(factoryArea);
            return this;
        }
        public Builder engShortCode(String engShortCode){
            this.obj.setEngShortCode(engShortCode);
            return this;
        }
        public Builder engType(String engType){
            this.obj.setEngType(engType);
            return this;
        }
        public Builder engSeries(String engSeries){
            this.obj.setEngSeries(engSeries);
            return this;
        }
        public Builder salesArea(String salesArea){
            this.obj.setSalesArea(salesArea);
            return this;
        }
        public Builder salesYear(String salesYear){
            this.obj.setSalesYear(salesYear);
            return this;
        }
        public Builder salesMonth(String salesMonth){
            this.obj.setSalesMonth(salesMonth);
            return this;
        }
        public Builder tranShortCode(String tranShortCode){
            this.obj.setTranShortCode(tranShortCode);
            return this;
        }
        public Builder tranType(String tranType){
            this.obj.setTranType(tranType);
            return this;
        }
        public Builder tranSeries(String tranSeries){
            this.obj.setTranSeries(tranSeries);
            return this;
        }
        public Builder carShortCode(String carShortCode){
            this.obj.setCarShortCode(carShortCode);
            return this;
        }
        public Builder carModel(String carModel){
            this.obj.setCarModel(carModel);
            return this;
        }
        public Builder carModelCode(String carModelCode){
            this.obj.setCarModelCode(carModelCode);
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
        public MqmsSales build(){return obj;}
    }

}
