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
public class MqmsProductionRaw implements Serializable {

    private static final long serialVersionUID = 1583227536383L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer productionId;

    /**
    * 
    * isNullAble:1
    */
    private String factoryCode;

    /**
    * 
    * isNullAble:1
    */
    private String productionBatch;

    /**
    * 
    * isNullAble:1
    */
    private String vin;

    /**
    * 
    * isNullAble:1
    */
    private String mtoc;

    /**
    * 
    * isNullAble:1
    */
    private String stationCode;

    /**
    * 
    * isNullAble:1
    */
    private String passTime;

    /**
    * 生产车型
    * isNullAble:1
    */
    private String carModelCode;

    /**
    * 
    * isNullAble:1
    */
    private String carModelName;

    /**
    * 
    * isNullAble:1
    */
    private String productionWorktime;

    /**
    * 发动机号
    * isNullAble:1
    */
    private String egtypeCode;

    /**
    * 
    * isNullAble:1
    */
    private String transmissionCode;

    /**
    * 车辆等级
    * isNullAble:1
    */
    private String carLevel;

    /**
    * 阶段
    * isNullAble:1
    */
    private String period;

    /**
    * 
    * isNullAble:1
    */
    private String carType;

    /**
    * 
    * isNullAble:1
    */
    private String exportCountry;

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


    public void setProductionId(Integer productionId){this.productionId = productionId;}

    public Integer getProductionId(){return this.productionId;}

    public void setFactoryCode(String factoryCode){this.factoryCode = factoryCode;}

    public String getFactoryCode(){return this.factoryCode;}

    public void setProductionBatch(String productionBatch){this.productionBatch = productionBatch;}

    public String getProductionBatch(){return this.productionBatch;}

    public void setVin(String vin){this.vin = vin;}

    public String getVin(){return this.vin;}

    public void setMtoc(String mtoc){this.mtoc = mtoc;}

    public String getMtoc(){return this.mtoc;}

    public void setStationCode(String stationCode){this.stationCode = stationCode;}

    public String getStationCode(){return this.stationCode;}

    public void setPassTime(String passTime){this.passTime = passTime;}

    public String getPassTime(){return this.passTime;}

    public void setCarModelCode(String carModelCode){this.carModelCode = carModelCode;}

    public String getCarModelCode(){return this.carModelCode;}

    public void setCarModelName(String carModelName){this.carModelName = carModelName;}

    public String getCarModelName(){return this.carModelName;}

    public void setProductionWorktime(String productionWorktime){this.productionWorktime = productionWorktime;}

    public String getProductionWorktime(){return this.productionWorktime;}

    public void setEgtypeCode(String egtypeCode){this.egtypeCode = egtypeCode;}

    public String getEgtypeCode(){return this.egtypeCode;}

    public void setTransmissionCode(String transmissionCode){this.transmissionCode = transmissionCode;}

    public String getTransmissionCode(){return this.transmissionCode;}

    public void setCarLevel(String carLevel){this.carLevel = carLevel;}

    public String getCarLevel(){return this.carLevel;}

    public void setPeriod(String period){this.period = period;}

    public String getPeriod(){return this.period;}

    public void setCarType(String carType){this.carType = carType;}

    public String getCarType(){return this.carType;}

    public void setExportCountry(String exportCountry){this.exportCountry = exportCountry;}

    public String getExportCountry(){return this.exportCountry;}

    public void setApplierId(Integer applierId){this.applierId = applierId;}

    public Integer getApplierId(){return this.applierId;}

    public void setApplierName(String applierName){this.applierName = applierName;}

    public String getApplierName(){return this.applierName;}

    public void setApplyTime(String applyTime){this.applyTime = applyTime;}

    public String getApplyTime(){return this.applyTime;}
    @Override
    public String toString() {
        return "MqmsProductionRaw{" +
                "productionId='" + productionId + '\'' +
                "factoryCode='" + factoryCode + '\'' +
                "productionBatch='" + productionBatch + '\'' +
                "vin='" + vin + '\'' +
                "mtoc='" + mtoc + '\'' +
                "stationCode='" + stationCode + '\'' +
                "passTime='" + passTime + '\'' +
                "carModelCode='" + carModelCode + '\'' +
                "carModelName='" + carModelName + '\'' +
                "productionWorktime='" + productionWorktime + '\'' +
                "egtypeCode='" + egtypeCode + '\'' +
                "transmissionCode='" + transmissionCode + '\'' +
                "carLevel='" + carLevel + '\'' +
                "period='" + period + '\'' +
                "carType='" + carType + '\'' +
                "exportCountry='" + exportCountry + '\'' +
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

        private MqmsProductionRaw set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsProductionRaw set){
            this.set = set;
            return this;
        }

        public MqmsProductionRaw getSet(){
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

    public static class QueryBuilder extends MqmsProductionRaw{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> productionIdList;

        public List<Integer> getProductionIdList(){return this.productionIdList;}

        private Integer productionIdSt;

        private Integer productionIdEd;

        public Integer getProductionIdSt(){return this.productionIdSt;}

        public Integer getProductionIdEd(){return this.productionIdEd;}

        private List<String> factoryCodeList;

        public List<String> getFactoryCodeList(){return this.factoryCodeList;}


        private List<String> fuzzyFactoryCode;

        public List<String> getFuzzyFactoryCode(){return this.fuzzyFactoryCode;}

        private List<String> rightFuzzyFactoryCode;

        public List<String> getRightFuzzyFactoryCode(){return this.rightFuzzyFactoryCode;}
        private List<String> productionBatchList;

        public List<String> getProductionBatchList(){return this.productionBatchList;}


        private List<String> fuzzyProductionBatch;

        public List<String> getFuzzyProductionBatch(){return this.fuzzyProductionBatch;}

        private List<String> rightFuzzyProductionBatch;

        public List<String> getRightFuzzyProductionBatch(){return this.rightFuzzyProductionBatch;}
        private List<String> vinList;

        public List<String> getVinList(){return this.vinList;}


        private List<String> fuzzyVin;

        public List<String> getFuzzyVin(){return this.fuzzyVin;}

        private List<String> rightFuzzyVin;

        public List<String> getRightFuzzyVin(){return this.rightFuzzyVin;}
        private List<String> mtocList;

        public List<String> getMtocList(){return this.mtocList;}


        private List<String> fuzzyMtoc;

        public List<String> getFuzzyMtoc(){return this.fuzzyMtoc;}

        private List<String> rightFuzzyMtoc;

        public List<String> getRightFuzzyMtoc(){return this.rightFuzzyMtoc;}
        private List<String> stationCodeList;

        public List<String> getStationCodeList(){return this.stationCodeList;}


        private List<String> fuzzyStationCode;

        public List<String> getFuzzyStationCode(){return this.fuzzyStationCode;}

        private List<String> rightFuzzyStationCode;

        public List<String> getRightFuzzyStationCode(){return this.rightFuzzyStationCode;}
        private List<String> passTimeList;

        public List<String> getPassTimeList(){return this.passTimeList;}


        private List<String> fuzzyPassTime;

        public List<String> getFuzzyPassTime(){return this.fuzzyPassTime;}

        private List<String> rightFuzzyPassTime;

        public List<String> getRightFuzzyPassTime(){return this.rightFuzzyPassTime;}
        private List<String> carModelCodeList;

        public List<String> getCarModelCodeList(){return this.carModelCodeList;}


        private List<String> fuzzyCarModelCode;

        public List<String> getFuzzyCarModelCode(){return this.fuzzyCarModelCode;}

        private List<String> rightFuzzyCarModelCode;

        public List<String> getRightFuzzyCarModelCode(){return this.rightFuzzyCarModelCode;}
        private List<String> carModelNameList;

        public List<String> getCarModelNameList(){return this.carModelNameList;}


        private List<String> fuzzyCarModelName;

        public List<String> getFuzzyCarModelName(){return this.fuzzyCarModelName;}

        private List<String> rightFuzzyCarModelName;

        public List<String> getRightFuzzyCarModelName(){return this.rightFuzzyCarModelName;}
        private List<String> productionWorktimeList;

        public List<String> getProductionWorktimeList(){return this.productionWorktimeList;}


        private List<String> fuzzyProductionWorktime;

        public List<String> getFuzzyProductionWorktime(){return this.fuzzyProductionWorktime;}

        private List<String> rightFuzzyProductionWorktime;

        public List<String> getRightFuzzyProductionWorktime(){return this.rightFuzzyProductionWorktime;}
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
        private List<String> carLevelList;

        public List<String> getCarLevelList(){return this.carLevelList;}


        private List<String> fuzzyCarLevel;

        public List<String> getFuzzyCarLevel(){return this.fuzzyCarLevel;}

        private List<String> rightFuzzyCarLevel;

        public List<String> getRightFuzzyCarLevel(){return this.rightFuzzyCarLevel;}
        private List<String> periodList;

        public List<String> getPeriodList(){return this.periodList;}


        private List<String> fuzzyPeriod;

        public List<String> getFuzzyPeriod(){return this.fuzzyPeriod;}

        private List<String> rightFuzzyPeriod;

        public List<String> getRightFuzzyPeriod(){return this.rightFuzzyPeriod;}
        private List<String> carTypeList;

        public List<String> getCarTypeList(){return this.carTypeList;}


        private List<String> fuzzyCarType;

        public List<String> getFuzzyCarType(){return this.fuzzyCarType;}

        private List<String> rightFuzzyCarType;

        public List<String> getRightFuzzyCarType(){return this.rightFuzzyCarType;}
        private List<String> exportCountryList;

        public List<String> getExportCountryList(){return this.exportCountryList;}


        private List<String> fuzzyExportCountry;

        public List<String> getFuzzyExportCountry(){return this.fuzzyExportCountry;}

        private List<String> rightFuzzyExportCountry;

        public List<String> getRightFuzzyExportCountry(){return this.rightFuzzyExportCountry;}
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

        public QueryBuilder productionIdBetWeen(Integer productionIdSt,Integer productionIdEd){
            this.productionIdSt = productionIdSt;
            this.productionIdEd = productionIdEd;
            return this;
        }

        public QueryBuilder productionIdGreaterEqThan(Integer productionIdSt){
            this.productionIdSt = productionIdSt;
            return this;
        }
        public QueryBuilder productionIdLessEqThan(Integer productionIdEd){
            this.productionIdEd = productionIdEd;
            return this;
        }


        public QueryBuilder productionId(Integer productionId){
            setProductionId(productionId);
            return this;
        }

        public QueryBuilder productionIdList(Integer ... productionId){
            this.productionIdList = solveNullList(productionId);
            return this;
        }

        public QueryBuilder productionIdList(List<Integer> productionId){
            this.productionIdList = productionId;
            return this;
        }

        public QueryBuilder fetchProductionId(){
            setFetchFields("fetchFields","productionId");
            return this;
        }

        public QueryBuilder excludeProductionId(){
            setFetchFields("excludeFields","productionId");
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

        public QueryBuilder fuzzyProductionBatch (List<String> fuzzyProductionBatch){
            this.fuzzyProductionBatch = fuzzyProductionBatch;
            return this;
        }

        public QueryBuilder fuzzyProductionBatch (String ... fuzzyProductionBatch){
            this.fuzzyProductionBatch = solveNullList(fuzzyProductionBatch);
            return this;
        }

        public QueryBuilder rightFuzzyProductionBatch (List<String> rightFuzzyProductionBatch){
            this.rightFuzzyProductionBatch = rightFuzzyProductionBatch;
            return this;
        }

        public QueryBuilder rightFuzzyProductionBatch (String ... rightFuzzyProductionBatch){
            this.rightFuzzyProductionBatch = solveNullList(rightFuzzyProductionBatch);
            return this;
        }

        public QueryBuilder productionBatch(String productionBatch){
            setProductionBatch(productionBatch);
            return this;
        }

        public QueryBuilder productionBatchList(String ... productionBatch){
            this.productionBatchList = solveNullList(productionBatch);
            return this;
        }

        public QueryBuilder productionBatchList(List<String> productionBatch){
            this.productionBatchList = productionBatch;
            return this;
        }

        public QueryBuilder fetchProductionBatch(){
            setFetchFields("fetchFields","productionBatch");
            return this;
        }

        public QueryBuilder excludeProductionBatch(){
            setFetchFields("excludeFields","productionBatch");
            return this;
        }

        public QueryBuilder fuzzyVin (List<String> fuzzyVin){
            this.fuzzyVin = fuzzyVin;
            return this;
        }

        public QueryBuilder fuzzyVin (String ... fuzzyVin){
            this.fuzzyVin = solveNullList(fuzzyVin);
            return this;
        }

        public QueryBuilder rightFuzzyVin (List<String> rightFuzzyVin){
            this.rightFuzzyVin = rightFuzzyVin;
            return this;
        }

        public QueryBuilder rightFuzzyVin (String ... rightFuzzyVin){
            this.rightFuzzyVin = solveNullList(rightFuzzyVin);
            return this;
        }

        public QueryBuilder vin(String vin){
            setVin(vin);
            return this;
        }

        public QueryBuilder vinList(String ... vin){
            this.vinList = solveNullList(vin);
            return this;
        }

        public QueryBuilder vinList(List<String> vin){
            this.vinList = vin;
            return this;
        }

        public QueryBuilder fetchVin(){
            setFetchFields("fetchFields","vin");
            return this;
        }

        public QueryBuilder excludeVin(){
            setFetchFields("excludeFields","vin");
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

        public QueryBuilder fuzzyStationCode (List<String> fuzzyStationCode){
            this.fuzzyStationCode = fuzzyStationCode;
            return this;
        }

        public QueryBuilder fuzzyStationCode (String ... fuzzyStationCode){
            this.fuzzyStationCode = solveNullList(fuzzyStationCode);
            return this;
        }

        public QueryBuilder rightFuzzyStationCode (List<String> rightFuzzyStationCode){
            this.rightFuzzyStationCode = rightFuzzyStationCode;
            return this;
        }

        public QueryBuilder rightFuzzyStationCode (String ... rightFuzzyStationCode){
            this.rightFuzzyStationCode = solveNullList(rightFuzzyStationCode);
            return this;
        }

        public QueryBuilder stationCode(String stationCode){
            setStationCode(stationCode);
            return this;
        }

        public QueryBuilder stationCodeList(String ... stationCode){
            this.stationCodeList = solveNullList(stationCode);
            return this;
        }

        public QueryBuilder stationCodeList(List<String> stationCode){
            this.stationCodeList = stationCode;
            return this;
        }

        public QueryBuilder fetchStationCode(){
            setFetchFields("fetchFields","stationCode");
            return this;
        }

        public QueryBuilder excludeStationCode(){
            setFetchFields("excludeFields","stationCode");
            return this;
        }

        public QueryBuilder fuzzyPassTime (List<String> fuzzyPassTime){
            this.fuzzyPassTime = fuzzyPassTime;
            return this;
        }

        public QueryBuilder fuzzyPassTime (String ... fuzzyPassTime){
            this.fuzzyPassTime = solveNullList(fuzzyPassTime);
            return this;
        }

        public QueryBuilder rightFuzzyPassTime (List<String> rightFuzzyPassTime){
            this.rightFuzzyPassTime = rightFuzzyPassTime;
            return this;
        }

        public QueryBuilder rightFuzzyPassTime (String ... rightFuzzyPassTime){
            this.rightFuzzyPassTime = solveNullList(rightFuzzyPassTime);
            return this;
        }

        public QueryBuilder passTime(String passTime){
            setPassTime(passTime);
            return this;
        }

        public QueryBuilder passTimeList(String ... passTime){
            this.passTimeList = solveNullList(passTime);
            return this;
        }

        public QueryBuilder passTimeList(List<String> passTime){
            this.passTimeList = passTime;
            return this;
        }

        public QueryBuilder fetchPassTime(){
            setFetchFields("fetchFields","passTime");
            return this;
        }

        public QueryBuilder excludePassTime(){
            setFetchFields("excludeFields","passTime");
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

        public QueryBuilder fuzzyCarModelName (List<String> fuzzyCarModelName){
            this.fuzzyCarModelName = fuzzyCarModelName;
            return this;
        }

        public QueryBuilder fuzzyCarModelName (String ... fuzzyCarModelName){
            this.fuzzyCarModelName = solveNullList(fuzzyCarModelName);
            return this;
        }

        public QueryBuilder rightFuzzyCarModelName (List<String> rightFuzzyCarModelName){
            this.rightFuzzyCarModelName = rightFuzzyCarModelName;
            return this;
        }

        public QueryBuilder rightFuzzyCarModelName (String ... rightFuzzyCarModelName){
            this.rightFuzzyCarModelName = solveNullList(rightFuzzyCarModelName);
            return this;
        }

        public QueryBuilder carModelName(String carModelName){
            setCarModelName(carModelName);
            return this;
        }

        public QueryBuilder carModelNameList(String ... carModelName){
            this.carModelNameList = solveNullList(carModelName);
            return this;
        }

        public QueryBuilder carModelNameList(List<String> carModelName){
            this.carModelNameList = carModelName;
            return this;
        }

        public QueryBuilder fetchCarModelName(){
            setFetchFields("fetchFields","carModelName");
            return this;
        }

        public QueryBuilder excludeCarModelName(){
            setFetchFields("excludeFields","carModelName");
            return this;
        }

        public QueryBuilder fuzzyProductionWorktime (List<String> fuzzyProductionWorktime){
            this.fuzzyProductionWorktime = fuzzyProductionWorktime;
            return this;
        }

        public QueryBuilder fuzzyProductionWorktime (String ... fuzzyProductionWorktime){
            this.fuzzyProductionWorktime = solveNullList(fuzzyProductionWorktime);
            return this;
        }

        public QueryBuilder rightFuzzyProductionWorktime (List<String> rightFuzzyProductionWorktime){
            this.rightFuzzyProductionWorktime = rightFuzzyProductionWorktime;
            return this;
        }

        public QueryBuilder rightFuzzyProductionWorktime (String ... rightFuzzyProductionWorktime){
            this.rightFuzzyProductionWorktime = solveNullList(rightFuzzyProductionWorktime);
            return this;
        }

        public QueryBuilder productionWorktime(String productionWorktime){
            setProductionWorktime(productionWorktime);
            return this;
        }

        public QueryBuilder productionWorktimeList(String ... productionWorktime){
            this.productionWorktimeList = solveNullList(productionWorktime);
            return this;
        }

        public QueryBuilder productionWorktimeList(List<String> productionWorktime){
            this.productionWorktimeList = productionWorktime;
            return this;
        }

        public QueryBuilder fetchProductionWorktime(){
            setFetchFields("fetchFields","productionWorktime");
            return this;
        }

        public QueryBuilder excludeProductionWorktime(){
            setFetchFields("excludeFields","productionWorktime");
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

        public QueryBuilder fuzzyCarLevel (List<String> fuzzyCarLevel){
            this.fuzzyCarLevel = fuzzyCarLevel;
            return this;
        }

        public QueryBuilder fuzzyCarLevel (String ... fuzzyCarLevel){
            this.fuzzyCarLevel = solveNullList(fuzzyCarLevel);
            return this;
        }

        public QueryBuilder rightFuzzyCarLevel (List<String> rightFuzzyCarLevel){
            this.rightFuzzyCarLevel = rightFuzzyCarLevel;
            return this;
        }

        public QueryBuilder rightFuzzyCarLevel (String ... rightFuzzyCarLevel){
            this.rightFuzzyCarLevel = solveNullList(rightFuzzyCarLevel);
            return this;
        }

        public QueryBuilder carLevel(String carLevel){
            setCarLevel(carLevel);
            return this;
        }

        public QueryBuilder carLevelList(String ... carLevel){
            this.carLevelList = solveNullList(carLevel);
            return this;
        }

        public QueryBuilder carLevelList(List<String> carLevel){
            this.carLevelList = carLevel;
            return this;
        }

        public QueryBuilder fetchCarLevel(){
            setFetchFields("fetchFields","carLevel");
            return this;
        }

        public QueryBuilder excludeCarLevel(){
            setFetchFields("excludeFields","carLevel");
            return this;
        }

        public QueryBuilder fuzzyPeriod (List<String> fuzzyPeriod){
            this.fuzzyPeriod = fuzzyPeriod;
            return this;
        }

        public QueryBuilder fuzzyPeriod (String ... fuzzyPeriod){
            this.fuzzyPeriod = solveNullList(fuzzyPeriod);
            return this;
        }

        public QueryBuilder rightFuzzyPeriod (List<String> rightFuzzyPeriod){
            this.rightFuzzyPeriod = rightFuzzyPeriod;
            return this;
        }

        public QueryBuilder rightFuzzyPeriod (String ... rightFuzzyPeriod){
            this.rightFuzzyPeriod = solveNullList(rightFuzzyPeriod);
            return this;
        }

        public QueryBuilder period(String period){
            setPeriod(period);
            return this;
        }

        public QueryBuilder periodList(String ... period){
            this.periodList = solveNullList(period);
            return this;
        }

        public QueryBuilder periodList(List<String> period){
            this.periodList = period;
            return this;
        }

        public QueryBuilder fetchPeriod(){
            setFetchFields("fetchFields","period");
            return this;
        }

        public QueryBuilder excludePeriod(){
            setFetchFields("excludeFields","period");
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

        public QueryBuilder fuzzyExportCountry (List<String> fuzzyExportCountry){
            this.fuzzyExportCountry = fuzzyExportCountry;
            return this;
        }

        public QueryBuilder fuzzyExportCountry (String ... fuzzyExportCountry){
            this.fuzzyExportCountry = solveNullList(fuzzyExportCountry);
            return this;
        }

        public QueryBuilder rightFuzzyExportCountry (List<String> rightFuzzyExportCountry){
            this.rightFuzzyExportCountry = rightFuzzyExportCountry;
            return this;
        }

        public QueryBuilder rightFuzzyExportCountry (String ... rightFuzzyExportCountry){
            this.rightFuzzyExportCountry = solveNullList(rightFuzzyExportCountry);
            return this;
        }

        public QueryBuilder exportCountry(String exportCountry){
            setExportCountry(exportCountry);
            return this;
        }

        public QueryBuilder exportCountryList(String ... exportCountry){
            this.exportCountryList = solveNullList(exportCountry);
            return this;
        }

        public QueryBuilder exportCountryList(List<String> exportCountry){
            this.exportCountryList = exportCountry;
            return this;
        }

        public QueryBuilder fetchExportCountry(){
            setFetchFields("fetchFields","exportCountry");
            return this;
        }

        public QueryBuilder excludeExportCountry(){
            setFetchFields("excludeFields","exportCountry");
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

        public MqmsProductionRaw build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> productionIdList;

        public List<Integer> getProductionIdList(){return this.productionIdList;}

        private Integer productionIdSt;

        private Integer productionIdEd;

        public Integer getProductionIdSt(){return this.productionIdSt;}

        public Integer getProductionIdEd(){return this.productionIdEd;}

        private List<String> factoryCodeList;

        public List<String> getFactoryCodeList(){return this.factoryCodeList;}


        private List<String> fuzzyFactoryCode;

        public List<String> getFuzzyFactoryCode(){return this.fuzzyFactoryCode;}

        private List<String> rightFuzzyFactoryCode;

        public List<String> getRightFuzzyFactoryCode(){return this.rightFuzzyFactoryCode;}
        private List<String> productionBatchList;

        public List<String> getProductionBatchList(){return this.productionBatchList;}


        private List<String> fuzzyProductionBatch;

        public List<String> getFuzzyProductionBatch(){return this.fuzzyProductionBatch;}

        private List<String> rightFuzzyProductionBatch;

        public List<String> getRightFuzzyProductionBatch(){return this.rightFuzzyProductionBatch;}
        private List<String> vinList;

        public List<String> getVinList(){return this.vinList;}


        private List<String> fuzzyVin;

        public List<String> getFuzzyVin(){return this.fuzzyVin;}

        private List<String> rightFuzzyVin;

        public List<String> getRightFuzzyVin(){return this.rightFuzzyVin;}
        private List<String> mtocList;

        public List<String> getMtocList(){return this.mtocList;}


        private List<String> fuzzyMtoc;

        public List<String> getFuzzyMtoc(){return this.fuzzyMtoc;}

        private List<String> rightFuzzyMtoc;

        public List<String> getRightFuzzyMtoc(){return this.rightFuzzyMtoc;}
        private List<String> stationCodeList;

        public List<String> getStationCodeList(){return this.stationCodeList;}


        private List<String> fuzzyStationCode;

        public List<String> getFuzzyStationCode(){return this.fuzzyStationCode;}

        private List<String> rightFuzzyStationCode;

        public List<String> getRightFuzzyStationCode(){return this.rightFuzzyStationCode;}
        private List<String> passTimeList;

        public List<String> getPassTimeList(){return this.passTimeList;}


        private List<String> fuzzyPassTime;

        public List<String> getFuzzyPassTime(){return this.fuzzyPassTime;}

        private List<String> rightFuzzyPassTime;

        public List<String> getRightFuzzyPassTime(){return this.rightFuzzyPassTime;}
        private List<String> carModelCodeList;

        public List<String> getCarModelCodeList(){return this.carModelCodeList;}


        private List<String> fuzzyCarModelCode;

        public List<String> getFuzzyCarModelCode(){return this.fuzzyCarModelCode;}

        private List<String> rightFuzzyCarModelCode;

        public List<String> getRightFuzzyCarModelCode(){return this.rightFuzzyCarModelCode;}
        private List<String> carModelNameList;

        public List<String> getCarModelNameList(){return this.carModelNameList;}


        private List<String> fuzzyCarModelName;

        public List<String> getFuzzyCarModelName(){return this.fuzzyCarModelName;}

        private List<String> rightFuzzyCarModelName;

        public List<String> getRightFuzzyCarModelName(){return this.rightFuzzyCarModelName;}
        private List<String> productionWorktimeList;

        public List<String> getProductionWorktimeList(){return this.productionWorktimeList;}


        private List<String> fuzzyProductionWorktime;

        public List<String> getFuzzyProductionWorktime(){return this.fuzzyProductionWorktime;}

        private List<String> rightFuzzyProductionWorktime;

        public List<String> getRightFuzzyProductionWorktime(){return this.rightFuzzyProductionWorktime;}
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
        private List<String> carLevelList;

        public List<String> getCarLevelList(){return this.carLevelList;}


        private List<String> fuzzyCarLevel;

        public List<String> getFuzzyCarLevel(){return this.fuzzyCarLevel;}

        private List<String> rightFuzzyCarLevel;

        public List<String> getRightFuzzyCarLevel(){return this.rightFuzzyCarLevel;}
        private List<String> periodList;

        public List<String> getPeriodList(){return this.periodList;}


        private List<String> fuzzyPeriod;

        public List<String> getFuzzyPeriod(){return this.fuzzyPeriod;}

        private List<String> rightFuzzyPeriod;

        public List<String> getRightFuzzyPeriod(){return this.rightFuzzyPeriod;}
        private List<String> carTypeList;

        public List<String> getCarTypeList(){return this.carTypeList;}


        private List<String> fuzzyCarType;

        public List<String> getFuzzyCarType(){return this.fuzzyCarType;}

        private List<String> rightFuzzyCarType;

        public List<String> getRightFuzzyCarType(){return this.rightFuzzyCarType;}
        private List<String> exportCountryList;

        public List<String> getExportCountryList(){return this.exportCountryList;}


        private List<String> fuzzyExportCountry;

        public List<String> getFuzzyExportCountry(){return this.fuzzyExportCountry;}

        private List<String> rightFuzzyExportCountry;

        public List<String> getRightFuzzyExportCountry(){return this.rightFuzzyExportCountry;}
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

        public ConditionBuilder productionIdBetWeen(Integer productionIdSt,Integer productionIdEd){
            this.productionIdSt = productionIdSt;
            this.productionIdEd = productionIdEd;
            return this;
        }

        public ConditionBuilder productionIdGreaterEqThan(Integer productionIdSt){
            this.productionIdSt = productionIdSt;
            return this;
        }
        public ConditionBuilder productionIdLessEqThan(Integer productionIdEd){
            this.productionIdEd = productionIdEd;
            return this;
        }


        public ConditionBuilder productionIdList(Integer ... productionId){
            this.productionIdList = solveNullList(productionId);
            return this;
        }

        public ConditionBuilder productionIdList(List<Integer> productionId){
            this.productionIdList = productionId;
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

        public ConditionBuilder fuzzyProductionBatch (List<String> fuzzyProductionBatch){
            this.fuzzyProductionBatch = fuzzyProductionBatch;
            return this;
        }

        public ConditionBuilder fuzzyProductionBatch (String ... fuzzyProductionBatch){
            this.fuzzyProductionBatch = solveNullList(fuzzyProductionBatch);
            return this;
        }

        public ConditionBuilder rightFuzzyProductionBatch (List<String> rightFuzzyProductionBatch){
            this.rightFuzzyProductionBatch = rightFuzzyProductionBatch;
            return this;
        }

        public ConditionBuilder rightFuzzyProductionBatch (String ... rightFuzzyProductionBatch){
            this.rightFuzzyProductionBatch = solveNullList(rightFuzzyProductionBatch);
            return this;
        }

        public ConditionBuilder productionBatchList(String ... productionBatch){
            this.productionBatchList = solveNullList(productionBatch);
            return this;
        }

        public ConditionBuilder productionBatchList(List<String> productionBatch){
            this.productionBatchList = productionBatch;
            return this;
        }

        public ConditionBuilder fuzzyVin (List<String> fuzzyVin){
            this.fuzzyVin = fuzzyVin;
            return this;
        }

        public ConditionBuilder fuzzyVin (String ... fuzzyVin){
            this.fuzzyVin = solveNullList(fuzzyVin);
            return this;
        }

        public ConditionBuilder rightFuzzyVin (List<String> rightFuzzyVin){
            this.rightFuzzyVin = rightFuzzyVin;
            return this;
        }

        public ConditionBuilder rightFuzzyVin (String ... rightFuzzyVin){
            this.rightFuzzyVin = solveNullList(rightFuzzyVin);
            return this;
        }

        public ConditionBuilder vinList(String ... vin){
            this.vinList = solveNullList(vin);
            return this;
        }

        public ConditionBuilder vinList(List<String> vin){
            this.vinList = vin;
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

        public ConditionBuilder fuzzyStationCode (List<String> fuzzyStationCode){
            this.fuzzyStationCode = fuzzyStationCode;
            return this;
        }

        public ConditionBuilder fuzzyStationCode (String ... fuzzyStationCode){
            this.fuzzyStationCode = solveNullList(fuzzyStationCode);
            return this;
        }

        public ConditionBuilder rightFuzzyStationCode (List<String> rightFuzzyStationCode){
            this.rightFuzzyStationCode = rightFuzzyStationCode;
            return this;
        }

        public ConditionBuilder rightFuzzyStationCode (String ... rightFuzzyStationCode){
            this.rightFuzzyStationCode = solveNullList(rightFuzzyStationCode);
            return this;
        }

        public ConditionBuilder stationCodeList(String ... stationCode){
            this.stationCodeList = solveNullList(stationCode);
            return this;
        }

        public ConditionBuilder stationCodeList(List<String> stationCode){
            this.stationCodeList = stationCode;
            return this;
        }

        public ConditionBuilder fuzzyPassTime (List<String> fuzzyPassTime){
            this.fuzzyPassTime = fuzzyPassTime;
            return this;
        }

        public ConditionBuilder fuzzyPassTime (String ... fuzzyPassTime){
            this.fuzzyPassTime = solveNullList(fuzzyPassTime);
            return this;
        }

        public ConditionBuilder rightFuzzyPassTime (List<String> rightFuzzyPassTime){
            this.rightFuzzyPassTime = rightFuzzyPassTime;
            return this;
        }

        public ConditionBuilder rightFuzzyPassTime (String ... rightFuzzyPassTime){
            this.rightFuzzyPassTime = solveNullList(rightFuzzyPassTime);
            return this;
        }

        public ConditionBuilder passTimeList(String ... passTime){
            this.passTimeList = solveNullList(passTime);
            return this;
        }

        public ConditionBuilder passTimeList(List<String> passTime){
            this.passTimeList = passTime;
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

        public ConditionBuilder fuzzyCarModelName (List<String> fuzzyCarModelName){
            this.fuzzyCarModelName = fuzzyCarModelName;
            return this;
        }

        public ConditionBuilder fuzzyCarModelName (String ... fuzzyCarModelName){
            this.fuzzyCarModelName = solveNullList(fuzzyCarModelName);
            return this;
        }

        public ConditionBuilder rightFuzzyCarModelName (List<String> rightFuzzyCarModelName){
            this.rightFuzzyCarModelName = rightFuzzyCarModelName;
            return this;
        }

        public ConditionBuilder rightFuzzyCarModelName (String ... rightFuzzyCarModelName){
            this.rightFuzzyCarModelName = solveNullList(rightFuzzyCarModelName);
            return this;
        }

        public ConditionBuilder carModelNameList(String ... carModelName){
            this.carModelNameList = solveNullList(carModelName);
            return this;
        }

        public ConditionBuilder carModelNameList(List<String> carModelName){
            this.carModelNameList = carModelName;
            return this;
        }

        public ConditionBuilder fuzzyProductionWorktime (List<String> fuzzyProductionWorktime){
            this.fuzzyProductionWorktime = fuzzyProductionWorktime;
            return this;
        }

        public ConditionBuilder fuzzyProductionWorktime (String ... fuzzyProductionWorktime){
            this.fuzzyProductionWorktime = solveNullList(fuzzyProductionWorktime);
            return this;
        }

        public ConditionBuilder rightFuzzyProductionWorktime (List<String> rightFuzzyProductionWorktime){
            this.rightFuzzyProductionWorktime = rightFuzzyProductionWorktime;
            return this;
        }

        public ConditionBuilder rightFuzzyProductionWorktime (String ... rightFuzzyProductionWorktime){
            this.rightFuzzyProductionWorktime = solveNullList(rightFuzzyProductionWorktime);
            return this;
        }

        public ConditionBuilder productionWorktimeList(String ... productionWorktime){
            this.productionWorktimeList = solveNullList(productionWorktime);
            return this;
        }

        public ConditionBuilder productionWorktimeList(List<String> productionWorktime){
            this.productionWorktimeList = productionWorktime;
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

        public ConditionBuilder fuzzyCarLevel (List<String> fuzzyCarLevel){
            this.fuzzyCarLevel = fuzzyCarLevel;
            return this;
        }

        public ConditionBuilder fuzzyCarLevel (String ... fuzzyCarLevel){
            this.fuzzyCarLevel = solveNullList(fuzzyCarLevel);
            return this;
        }

        public ConditionBuilder rightFuzzyCarLevel (List<String> rightFuzzyCarLevel){
            this.rightFuzzyCarLevel = rightFuzzyCarLevel;
            return this;
        }

        public ConditionBuilder rightFuzzyCarLevel (String ... rightFuzzyCarLevel){
            this.rightFuzzyCarLevel = solveNullList(rightFuzzyCarLevel);
            return this;
        }

        public ConditionBuilder carLevelList(String ... carLevel){
            this.carLevelList = solveNullList(carLevel);
            return this;
        }

        public ConditionBuilder carLevelList(List<String> carLevel){
            this.carLevelList = carLevel;
            return this;
        }

        public ConditionBuilder fuzzyPeriod (List<String> fuzzyPeriod){
            this.fuzzyPeriod = fuzzyPeriod;
            return this;
        }

        public ConditionBuilder fuzzyPeriod (String ... fuzzyPeriod){
            this.fuzzyPeriod = solveNullList(fuzzyPeriod);
            return this;
        }

        public ConditionBuilder rightFuzzyPeriod (List<String> rightFuzzyPeriod){
            this.rightFuzzyPeriod = rightFuzzyPeriod;
            return this;
        }

        public ConditionBuilder rightFuzzyPeriod (String ... rightFuzzyPeriod){
            this.rightFuzzyPeriod = solveNullList(rightFuzzyPeriod);
            return this;
        }

        public ConditionBuilder periodList(String ... period){
            this.periodList = solveNullList(period);
            return this;
        }

        public ConditionBuilder periodList(List<String> period){
            this.periodList = period;
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

        public ConditionBuilder fuzzyExportCountry (List<String> fuzzyExportCountry){
            this.fuzzyExportCountry = fuzzyExportCountry;
            return this;
        }

        public ConditionBuilder fuzzyExportCountry (String ... fuzzyExportCountry){
            this.fuzzyExportCountry = solveNullList(fuzzyExportCountry);
            return this;
        }

        public ConditionBuilder rightFuzzyExportCountry (List<String> rightFuzzyExportCountry){
            this.rightFuzzyExportCountry = rightFuzzyExportCountry;
            return this;
        }

        public ConditionBuilder rightFuzzyExportCountry (String ... rightFuzzyExportCountry){
            this.rightFuzzyExportCountry = solveNullList(rightFuzzyExportCountry);
            return this;
        }

        public ConditionBuilder exportCountryList(String ... exportCountry){
            this.exportCountryList = solveNullList(exportCountry);
            return this;
        }

        public ConditionBuilder exportCountryList(List<String> exportCountry){
            this.exportCountryList = exportCountry;
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

        private MqmsProductionRaw obj;

        public Builder(){
            this.obj = new MqmsProductionRaw();
        }

        public Builder productionId(Integer productionId){
            this.obj.setProductionId(productionId);
            return this;
        }
        public Builder factoryCode(String factoryCode){
            this.obj.setFactoryCode(factoryCode);
            return this;
        }
        public Builder productionBatch(String productionBatch){
            this.obj.setProductionBatch(productionBatch);
            return this;
        }
        public Builder vin(String vin){
            this.obj.setVin(vin);
            return this;
        }
        public Builder mtoc(String mtoc){
            this.obj.setMtoc(mtoc);
            return this;
        }
        public Builder stationCode(String stationCode){
            this.obj.setStationCode(stationCode);
            return this;
        }
        public Builder passTime(String passTime){
            this.obj.setPassTime(passTime);
            return this;
        }
        public Builder carModelCode(String carModelCode){
            this.obj.setCarModelCode(carModelCode);
            return this;
        }
        public Builder carModelName(String carModelName){
            this.obj.setCarModelName(carModelName);
            return this;
        }
        public Builder productionWorktime(String productionWorktime){
            this.obj.setProductionWorktime(productionWorktime);
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
        public Builder carLevel(String carLevel){
            this.obj.setCarLevel(carLevel);
            return this;
        }
        public Builder period(String period){
            this.obj.setPeriod(period);
            return this;
        }
        public Builder carType(String carType){
            this.obj.setCarType(carType);
            return this;
        }
        public Builder exportCountry(String exportCountry){
            this.obj.setExportCountry(exportCountry);
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
        public MqmsProductionRaw build(){return obj;}
    }

}
