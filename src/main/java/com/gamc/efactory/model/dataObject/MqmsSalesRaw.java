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
public class MqmsSalesRaw implements Serializable {

    private static final long serialVersionUID = 1585036109171L;


    /**
    * 主键
    * 销售数据id
    * isNullAble:0
    */
    private Integer salesId;

    /**
    * vin码
    * isNullAble:0
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
    * 二次实效日期
    * isNullAble:1
    */
    private String secondPinDate;

    /**
    * 状态
    * isNullAble:1
    */
    private String state;

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

    public void setApplierId(Integer applierId){this.applierId = applierId;}

    public Integer getApplierId(){return this.applierId;}

    public void setApplierName(String applierName){this.applierName = applierName;}

    public String getApplierName(){return this.applierName;}

    public void setApplyTime(String applyTime){this.applyTime = applyTime;}

    public String getApplyTime(){return this.applyTime;}
    @Override
    public String toString() {
        return "MqmsSalesRaw{" +
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

        private MqmsSalesRaw set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsSalesRaw set){
            this.set = set;
            return this;
        }

        public MqmsSalesRaw getSet(){
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

    public static class QueryBuilder extends MqmsSalesRaw{
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

        public MqmsSalesRaw build(){return this;}
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

        private MqmsSalesRaw obj;

        public Builder(){
            this.obj = new MqmsSalesRaw();
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
        public MqmsSalesRaw build(){return obj;}
    }

}
