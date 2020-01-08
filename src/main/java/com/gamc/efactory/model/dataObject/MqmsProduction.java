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
public class MqmsProduction implements Serializable {

    private static final long serialVersionUID = 1578466614058L;


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
    private String shortCode;

    /**
    * 
    * isNullAble:1
    */
    private String engCode;

    /**
    * 
    * isNullAble:1
    */
    private String serialCode;

    /**
    * 
    * isNullAble:1
    */
    private String districtName;

    /**
    * 
    * isNullAble:1
    */
    private String salesYear;

    /**
    * 
    * isNullAble:1
    */
    private String salesMonth;

    /**
    * 
    * isNullAble:1
    */
    private String transmissionShortCode;

    /**
    * 
    * isNullAble:1
    */
    private String transmissionSimpleCode;

    /**
    * 
    * isNullAble:1
    */
    private String transmissionType;

    /**
    * 
    * isNullAble:1
    */
    private String carShortCode;

    /**
    * 
    * isNullAble:1
    */
    private String carTypeCode;

    /**
    * 
    * isNullAble:1
    */
    private String carSimpleCode;


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

    public void setShortCode(String shortCode){this.shortCode = shortCode;}

    public String getShortCode(){return this.shortCode;}

    public void setEngCode(String engCode){this.engCode = engCode;}

    public String getEngCode(){return this.engCode;}

    public void setSerialCode(String serialCode){this.serialCode = serialCode;}

    public String getSerialCode(){return this.serialCode;}

    public void setDistrictName(String districtName){this.districtName = districtName;}

    public String getDistrictName(){return this.districtName;}

    public void setSalesYear(String salesYear){this.salesYear = salesYear;}

    public String getSalesYear(){return this.salesYear;}

    public void setSalesMonth(String salesMonth){this.salesMonth = salesMonth;}

    public String getSalesMonth(){return this.salesMonth;}

    public void setTransmissionShortCode(String transmissionShortCode){this.transmissionShortCode = transmissionShortCode;}

    public String getTransmissionShortCode(){return this.transmissionShortCode;}

    public void setTransmissionSimpleCode(String transmissionSimpleCode){this.transmissionSimpleCode = transmissionSimpleCode;}

    public String getTransmissionSimpleCode(){return this.transmissionSimpleCode;}

    public void setTransmissionType(String transmissionType){this.transmissionType = transmissionType;}

    public String getTransmissionType(){return this.transmissionType;}

    public void setCarShortCode(String carShortCode){this.carShortCode = carShortCode;}

    public String getCarShortCode(){return this.carShortCode;}

    public void setCarTypeCode(String carTypeCode){this.carTypeCode = carTypeCode;}

    public String getCarTypeCode(){return this.carTypeCode;}

    public void setCarSimpleCode(String carSimpleCode){this.carSimpleCode = carSimpleCode;}

    public String getCarSimpleCode(){return this.carSimpleCode;}
    @Override
    public String toString() {
        return "MqmsProduction{" +
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
                "shortCode='" + shortCode + '\'' +
                "engCode='" + engCode + '\'' +
                "serialCode='" + serialCode + '\'' +
                "districtName='" + districtName + '\'' +
                "salesYear='" + salesYear + '\'' +
                "salesMonth='" + salesMonth + '\'' +
                "transmissionShortCode='" + transmissionShortCode + '\'' +
                "transmissionSimpleCode='" + transmissionSimpleCode + '\'' +
                "transmissionType='" + transmissionType + '\'' +
                "carShortCode='" + carShortCode + '\'' +
                "carTypeCode='" + carTypeCode + '\'' +
                "carSimpleCode='" + carSimpleCode + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsProduction set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsProduction set){
            this.set = set;
            return this;
        }

        public MqmsProduction getSet(){
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

    public static class QueryBuilder extends MqmsProduction{
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
        private List<String> shortCodeList;

        public List<String> getShortCodeList(){return this.shortCodeList;}


        private List<String> fuzzyShortCode;

        public List<String> getFuzzyShortCode(){return this.fuzzyShortCode;}

        private List<String> rightFuzzyShortCode;

        public List<String> getRightFuzzyShortCode(){return this.rightFuzzyShortCode;}
        private List<String> engCodeList;

        public List<String> getEngCodeList(){return this.engCodeList;}


        private List<String> fuzzyEngCode;

        public List<String> getFuzzyEngCode(){return this.fuzzyEngCode;}

        private List<String> rightFuzzyEngCode;

        public List<String> getRightFuzzyEngCode(){return this.rightFuzzyEngCode;}
        private List<String> serialCodeList;

        public List<String> getSerialCodeList(){return this.serialCodeList;}


        private List<String> fuzzySerialCode;

        public List<String> getFuzzySerialCode(){return this.fuzzySerialCode;}

        private List<String> rightFuzzySerialCode;

        public List<String> getRightFuzzySerialCode(){return this.rightFuzzySerialCode;}
        private List<String> districtNameList;

        public List<String> getDistrictNameList(){return this.districtNameList;}


        private List<String> fuzzyDistrictName;

        public List<String> getFuzzyDistrictName(){return this.fuzzyDistrictName;}

        private List<String> rightFuzzyDistrictName;

        public List<String> getRightFuzzyDistrictName(){return this.rightFuzzyDistrictName;}
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
        private List<String> transmissionShortCodeList;

        public List<String> getTransmissionShortCodeList(){return this.transmissionShortCodeList;}


        private List<String> fuzzyTransmissionShortCode;

        public List<String> getFuzzyTransmissionShortCode(){return this.fuzzyTransmissionShortCode;}

        private List<String> rightFuzzyTransmissionShortCode;

        public List<String> getRightFuzzyTransmissionShortCode(){return this.rightFuzzyTransmissionShortCode;}
        private List<String> transmissionSimpleCodeList;

        public List<String> getTransmissionSimpleCodeList(){return this.transmissionSimpleCodeList;}


        private List<String> fuzzyTransmissionSimpleCode;

        public List<String> getFuzzyTransmissionSimpleCode(){return this.fuzzyTransmissionSimpleCode;}

        private List<String> rightFuzzyTransmissionSimpleCode;

        public List<String> getRightFuzzyTransmissionSimpleCode(){return this.rightFuzzyTransmissionSimpleCode;}
        private List<String> transmissionTypeList;

        public List<String> getTransmissionTypeList(){return this.transmissionTypeList;}


        private List<String> fuzzyTransmissionType;

        public List<String> getFuzzyTransmissionType(){return this.fuzzyTransmissionType;}

        private List<String> rightFuzzyTransmissionType;

        public List<String> getRightFuzzyTransmissionType(){return this.rightFuzzyTransmissionType;}
        private List<String> carShortCodeList;

        public List<String> getCarShortCodeList(){return this.carShortCodeList;}


        private List<String> fuzzyCarShortCode;

        public List<String> getFuzzyCarShortCode(){return this.fuzzyCarShortCode;}

        private List<String> rightFuzzyCarShortCode;

        public List<String> getRightFuzzyCarShortCode(){return this.rightFuzzyCarShortCode;}
        private List<String> carTypeCodeList;

        public List<String> getCarTypeCodeList(){return this.carTypeCodeList;}


        private List<String> fuzzyCarTypeCode;

        public List<String> getFuzzyCarTypeCode(){return this.fuzzyCarTypeCode;}

        private List<String> rightFuzzyCarTypeCode;

        public List<String> getRightFuzzyCarTypeCode(){return this.rightFuzzyCarTypeCode;}
        private List<String> carSimpleCodeList;

        public List<String> getCarSimpleCodeList(){return this.carSimpleCodeList;}


        private List<String> fuzzyCarSimpleCode;

        public List<String> getFuzzyCarSimpleCode(){return this.fuzzyCarSimpleCode;}

        private List<String> rightFuzzyCarSimpleCode;

        public List<String> getRightFuzzyCarSimpleCode(){return this.rightFuzzyCarSimpleCode;}
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

        public QueryBuilder fuzzySerialCode (List<String> fuzzySerialCode){
            this.fuzzySerialCode = fuzzySerialCode;
            return this;
        }

        public QueryBuilder fuzzySerialCode (String ... fuzzySerialCode){
            this.fuzzySerialCode = solveNullList(fuzzySerialCode);
            return this;
        }

        public QueryBuilder rightFuzzySerialCode (List<String> rightFuzzySerialCode){
            this.rightFuzzySerialCode = rightFuzzySerialCode;
            return this;
        }

        public QueryBuilder rightFuzzySerialCode (String ... rightFuzzySerialCode){
            this.rightFuzzySerialCode = solveNullList(rightFuzzySerialCode);
            return this;
        }

        public QueryBuilder serialCode(String serialCode){
            setSerialCode(serialCode);
            return this;
        }

        public QueryBuilder serialCodeList(String ... serialCode){
            this.serialCodeList = solveNullList(serialCode);
            return this;
        }

        public QueryBuilder serialCodeList(List<String> serialCode){
            this.serialCodeList = serialCode;
            return this;
        }

        public QueryBuilder fetchSerialCode(){
            setFetchFields("fetchFields","serialCode");
            return this;
        }

        public QueryBuilder excludeSerialCode(){
            setFetchFields("excludeFields","serialCode");
            return this;
        }

        public QueryBuilder fuzzyDistrictName (List<String> fuzzyDistrictName){
            this.fuzzyDistrictName = fuzzyDistrictName;
            return this;
        }

        public QueryBuilder fuzzyDistrictName (String ... fuzzyDistrictName){
            this.fuzzyDistrictName = solveNullList(fuzzyDistrictName);
            return this;
        }

        public QueryBuilder rightFuzzyDistrictName (List<String> rightFuzzyDistrictName){
            this.rightFuzzyDistrictName = rightFuzzyDistrictName;
            return this;
        }

        public QueryBuilder rightFuzzyDistrictName (String ... rightFuzzyDistrictName){
            this.rightFuzzyDistrictName = solveNullList(rightFuzzyDistrictName);
            return this;
        }

        public QueryBuilder districtName(String districtName){
            setDistrictName(districtName);
            return this;
        }

        public QueryBuilder districtNameList(String ... districtName){
            this.districtNameList = solveNullList(districtName);
            return this;
        }

        public QueryBuilder districtNameList(List<String> districtName){
            this.districtNameList = districtName;
            return this;
        }

        public QueryBuilder fetchDistrictName(){
            setFetchFields("fetchFields","districtName");
            return this;
        }

        public QueryBuilder excludeDistrictName(){
            setFetchFields("excludeFields","districtName");
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

        public QueryBuilder fuzzyTransmissionSimpleCode (List<String> fuzzyTransmissionSimpleCode){
            this.fuzzyTransmissionSimpleCode = fuzzyTransmissionSimpleCode;
            return this;
        }

        public QueryBuilder fuzzyTransmissionSimpleCode (String ... fuzzyTransmissionSimpleCode){
            this.fuzzyTransmissionSimpleCode = solveNullList(fuzzyTransmissionSimpleCode);
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionSimpleCode (List<String> rightFuzzyTransmissionSimpleCode){
            this.rightFuzzyTransmissionSimpleCode = rightFuzzyTransmissionSimpleCode;
            return this;
        }

        public QueryBuilder rightFuzzyTransmissionSimpleCode (String ... rightFuzzyTransmissionSimpleCode){
            this.rightFuzzyTransmissionSimpleCode = solveNullList(rightFuzzyTransmissionSimpleCode);
            return this;
        }

        public QueryBuilder transmissionSimpleCode(String transmissionSimpleCode){
            setTransmissionSimpleCode(transmissionSimpleCode);
            return this;
        }

        public QueryBuilder transmissionSimpleCodeList(String ... transmissionSimpleCode){
            this.transmissionSimpleCodeList = solveNullList(transmissionSimpleCode);
            return this;
        }

        public QueryBuilder transmissionSimpleCodeList(List<String> transmissionSimpleCode){
            this.transmissionSimpleCodeList = transmissionSimpleCode;
            return this;
        }

        public QueryBuilder fetchTransmissionSimpleCode(){
            setFetchFields("fetchFields","transmissionSimpleCode");
            return this;
        }

        public QueryBuilder excludeTransmissionSimpleCode(){
            setFetchFields("excludeFields","transmissionSimpleCode");
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

        public QueryBuilder fuzzyCarTypeCode (List<String> fuzzyCarTypeCode){
            this.fuzzyCarTypeCode = fuzzyCarTypeCode;
            return this;
        }

        public QueryBuilder fuzzyCarTypeCode (String ... fuzzyCarTypeCode){
            this.fuzzyCarTypeCode = solveNullList(fuzzyCarTypeCode);
            return this;
        }

        public QueryBuilder rightFuzzyCarTypeCode (List<String> rightFuzzyCarTypeCode){
            this.rightFuzzyCarTypeCode = rightFuzzyCarTypeCode;
            return this;
        }

        public QueryBuilder rightFuzzyCarTypeCode (String ... rightFuzzyCarTypeCode){
            this.rightFuzzyCarTypeCode = solveNullList(rightFuzzyCarTypeCode);
            return this;
        }

        public QueryBuilder carTypeCode(String carTypeCode){
            setCarTypeCode(carTypeCode);
            return this;
        }

        public QueryBuilder carTypeCodeList(String ... carTypeCode){
            this.carTypeCodeList = solveNullList(carTypeCode);
            return this;
        }

        public QueryBuilder carTypeCodeList(List<String> carTypeCode){
            this.carTypeCodeList = carTypeCode;
            return this;
        }

        public QueryBuilder fetchCarTypeCode(){
            setFetchFields("fetchFields","carTypeCode");
            return this;
        }

        public QueryBuilder excludeCarTypeCode(){
            setFetchFields("excludeFields","carTypeCode");
            return this;
        }

        public QueryBuilder fuzzyCarSimpleCode (List<String> fuzzyCarSimpleCode){
            this.fuzzyCarSimpleCode = fuzzyCarSimpleCode;
            return this;
        }

        public QueryBuilder fuzzyCarSimpleCode (String ... fuzzyCarSimpleCode){
            this.fuzzyCarSimpleCode = solveNullList(fuzzyCarSimpleCode);
            return this;
        }

        public QueryBuilder rightFuzzyCarSimpleCode (List<String> rightFuzzyCarSimpleCode){
            this.rightFuzzyCarSimpleCode = rightFuzzyCarSimpleCode;
            return this;
        }

        public QueryBuilder rightFuzzyCarSimpleCode (String ... rightFuzzyCarSimpleCode){
            this.rightFuzzyCarSimpleCode = solveNullList(rightFuzzyCarSimpleCode);
            return this;
        }

        public QueryBuilder carSimpleCode(String carSimpleCode){
            setCarSimpleCode(carSimpleCode);
            return this;
        }

        public QueryBuilder carSimpleCodeList(String ... carSimpleCode){
            this.carSimpleCodeList = solveNullList(carSimpleCode);
            return this;
        }

        public QueryBuilder carSimpleCodeList(List<String> carSimpleCode){
            this.carSimpleCodeList = carSimpleCode;
            return this;
        }

        public QueryBuilder fetchCarSimpleCode(){
            setFetchFields("fetchFields","carSimpleCode");
            return this;
        }

        public QueryBuilder excludeCarSimpleCode(){
            setFetchFields("excludeFields","carSimpleCode");
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

        public MqmsProduction build(){return this;}
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
        private List<String> shortCodeList;

        public List<String> getShortCodeList(){return this.shortCodeList;}


        private List<String> fuzzyShortCode;

        public List<String> getFuzzyShortCode(){return this.fuzzyShortCode;}

        private List<String> rightFuzzyShortCode;

        public List<String> getRightFuzzyShortCode(){return this.rightFuzzyShortCode;}
        private List<String> engCodeList;

        public List<String> getEngCodeList(){return this.engCodeList;}


        private List<String> fuzzyEngCode;

        public List<String> getFuzzyEngCode(){return this.fuzzyEngCode;}

        private List<String> rightFuzzyEngCode;

        public List<String> getRightFuzzyEngCode(){return this.rightFuzzyEngCode;}
        private List<String> serialCodeList;

        public List<String> getSerialCodeList(){return this.serialCodeList;}


        private List<String> fuzzySerialCode;

        public List<String> getFuzzySerialCode(){return this.fuzzySerialCode;}

        private List<String> rightFuzzySerialCode;

        public List<String> getRightFuzzySerialCode(){return this.rightFuzzySerialCode;}
        private List<String> districtNameList;

        public List<String> getDistrictNameList(){return this.districtNameList;}


        private List<String> fuzzyDistrictName;

        public List<String> getFuzzyDistrictName(){return this.fuzzyDistrictName;}

        private List<String> rightFuzzyDistrictName;

        public List<String> getRightFuzzyDistrictName(){return this.rightFuzzyDistrictName;}
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
        private List<String> transmissionShortCodeList;

        public List<String> getTransmissionShortCodeList(){return this.transmissionShortCodeList;}


        private List<String> fuzzyTransmissionShortCode;

        public List<String> getFuzzyTransmissionShortCode(){return this.fuzzyTransmissionShortCode;}

        private List<String> rightFuzzyTransmissionShortCode;

        public List<String> getRightFuzzyTransmissionShortCode(){return this.rightFuzzyTransmissionShortCode;}
        private List<String> transmissionSimpleCodeList;

        public List<String> getTransmissionSimpleCodeList(){return this.transmissionSimpleCodeList;}


        private List<String> fuzzyTransmissionSimpleCode;

        public List<String> getFuzzyTransmissionSimpleCode(){return this.fuzzyTransmissionSimpleCode;}

        private List<String> rightFuzzyTransmissionSimpleCode;

        public List<String> getRightFuzzyTransmissionSimpleCode(){return this.rightFuzzyTransmissionSimpleCode;}
        private List<String> transmissionTypeList;

        public List<String> getTransmissionTypeList(){return this.transmissionTypeList;}


        private List<String> fuzzyTransmissionType;

        public List<String> getFuzzyTransmissionType(){return this.fuzzyTransmissionType;}

        private List<String> rightFuzzyTransmissionType;

        public List<String> getRightFuzzyTransmissionType(){return this.rightFuzzyTransmissionType;}
        private List<String> carShortCodeList;

        public List<String> getCarShortCodeList(){return this.carShortCodeList;}


        private List<String> fuzzyCarShortCode;

        public List<String> getFuzzyCarShortCode(){return this.fuzzyCarShortCode;}

        private List<String> rightFuzzyCarShortCode;

        public List<String> getRightFuzzyCarShortCode(){return this.rightFuzzyCarShortCode;}
        private List<String> carTypeCodeList;

        public List<String> getCarTypeCodeList(){return this.carTypeCodeList;}


        private List<String> fuzzyCarTypeCode;

        public List<String> getFuzzyCarTypeCode(){return this.fuzzyCarTypeCode;}

        private List<String> rightFuzzyCarTypeCode;

        public List<String> getRightFuzzyCarTypeCode(){return this.rightFuzzyCarTypeCode;}
        private List<String> carSimpleCodeList;

        public List<String> getCarSimpleCodeList(){return this.carSimpleCodeList;}


        private List<String> fuzzyCarSimpleCode;

        public List<String> getFuzzyCarSimpleCode(){return this.fuzzyCarSimpleCode;}

        private List<String> rightFuzzyCarSimpleCode;

        public List<String> getRightFuzzyCarSimpleCode(){return this.rightFuzzyCarSimpleCode;}

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

        public ConditionBuilder fuzzySerialCode (List<String> fuzzySerialCode){
            this.fuzzySerialCode = fuzzySerialCode;
            return this;
        }

        public ConditionBuilder fuzzySerialCode (String ... fuzzySerialCode){
            this.fuzzySerialCode = solveNullList(fuzzySerialCode);
            return this;
        }

        public ConditionBuilder rightFuzzySerialCode (List<String> rightFuzzySerialCode){
            this.rightFuzzySerialCode = rightFuzzySerialCode;
            return this;
        }

        public ConditionBuilder rightFuzzySerialCode (String ... rightFuzzySerialCode){
            this.rightFuzzySerialCode = solveNullList(rightFuzzySerialCode);
            return this;
        }

        public ConditionBuilder serialCodeList(String ... serialCode){
            this.serialCodeList = solveNullList(serialCode);
            return this;
        }

        public ConditionBuilder serialCodeList(List<String> serialCode){
            this.serialCodeList = serialCode;
            return this;
        }

        public ConditionBuilder fuzzyDistrictName (List<String> fuzzyDistrictName){
            this.fuzzyDistrictName = fuzzyDistrictName;
            return this;
        }

        public ConditionBuilder fuzzyDistrictName (String ... fuzzyDistrictName){
            this.fuzzyDistrictName = solveNullList(fuzzyDistrictName);
            return this;
        }

        public ConditionBuilder rightFuzzyDistrictName (List<String> rightFuzzyDistrictName){
            this.rightFuzzyDistrictName = rightFuzzyDistrictName;
            return this;
        }

        public ConditionBuilder rightFuzzyDistrictName (String ... rightFuzzyDistrictName){
            this.rightFuzzyDistrictName = solveNullList(rightFuzzyDistrictName);
            return this;
        }

        public ConditionBuilder districtNameList(String ... districtName){
            this.districtNameList = solveNullList(districtName);
            return this;
        }

        public ConditionBuilder districtNameList(List<String> districtName){
            this.districtNameList = districtName;
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

        public ConditionBuilder fuzzyTransmissionSimpleCode (List<String> fuzzyTransmissionSimpleCode){
            this.fuzzyTransmissionSimpleCode = fuzzyTransmissionSimpleCode;
            return this;
        }

        public ConditionBuilder fuzzyTransmissionSimpleCode (String ... fuzzyTransmissionSimpleCode){
            this.fuzzyTransmissionSimpleCode = solveNullList(fuzzyTransmissionSimpleCode);
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionSimpleCode (List<String> rightFuzzyTransmissionSimpleCode){
            this.rightFuzzyTransmissionSimpleCode = rightFuzzyTransmissionSimpleCode;
            return this;
        }

        public ConditionBuilder rightFuzzyTransmissionSimpleCode (String ... rightFuzzyTransmissionSimpleCode){
            this.rightFuzzyTransmissionSimpleCode = solveNullList(rightFuzzyTransmissionSimpleCode);
            return this;
        }

        public ConditionBuilder transmissionSimpleCodeList(String ... transmissionSimpleCode){
            this.transmissionSimpleCodeList = solveNullList(transmissionSimpleCode);
            return this;
        }

        public ConditionBuilder transmissionSimpleCodeList(List<String> transmissionSimpleCode){
            this.transmissionSimpleCodeList = transmissionSimpleCode;
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

        public ConditionBuilder fuzzyCarTypeCode (List<String> fuzzyCarTypeCode){
            this.fuzzyCarTypeCode = fuzzyCarTypeCode;
            return this;
        }

        public ConditionBuilder fuzzyCarTypeCode (String ... fuzzyCarTypeCode){
            this.fuzzyCarTypeCode = solveNullList(fuzzyCarTypeCode);
            return this;
        }

        public ConditionBuilder rightFuzzyCarTypeCode (List<String> rightFuzzyCarTypeCode){
            this.rightFuzzyCarTypeCode = rightFuzzyCarTypeCode;
            return this;
        }

        public ConditionBuilder rightFuzzyCarTypeCode (String ... rightFuzzyCarTypeCode){
            this.rightFuzzyCarTypeCode = solveNullList(rightFuzzyCarTypeCode);
            return this;
        }

        public ConditionBuilder carTypeCodeList(String ... carTypeCode){
            this.carTypeCodeList = solveNullList(carTypeCode);
            return this;
        }

        public ConditionBuilder carTypeCodeList(List<String> carTypeCode){
            this.carTypeCodeList = carTypeCode;
            return this;
        }

        public ConditionBuilder fuzzyCarSimpleCode (List<String> fuzzyCarSimpleCode){
            this.fuzzyCarSimpleCode = fuzzyCarSimpleCode;
            return this;
        }

        public ConditionBuilder fuzzyCarSimpleCode (String ... fuzzyCarSimpleCode){
            this.fuzzyCarSimpleCode = solveNullList(fuzzyCarSimpleCode);
            return this;
        }

        public ConditionBuilder rightFuzzyCarSimpleCode (List<String> rightFuzzyCarSimpleCode){
            this.rightFuzzyCarSimpleCode = rightFuzzyCarSimpleCode;
            return this;
        }

        public ConditionBuilder rightFuzzyCarSimpleCode (String ... rightFuzzyCarSimpleCode){
            this.rightFuzzyCarSimpleCode = solveNullList(rightFuzzyCarSimpleCode);
            return this;
        }

        public ConditionBuilder carSimpleCodeList(String ... carSimpleCode){
            this.carSimpleCodeList = solveNullList(carSimpleCode);
            return this;
        }

        public ConditionBuilder carSimpleCodeList(List<String> carSimpleCode){
            this.carSimpleCodeList = carSimpleCode;
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

        private MqmsProduction obj;

        public Builder(){
            this.obj = new MqmsProduction();
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
        public Builder shortCode(String shortCode){
            this.obj.setShortCode(shortCode);
            return this;
        }
        public Builder engCode(String engCode){
            this.obj.setEngCode(engCode);
            return this;
        }
        public Builder serialCode(String serialCode){
            this.obj.setSerialCode(serialCode);
            return this;
        }
        public Builder districtName(String districtName){
            this.obj.setDistrictName(districtName);
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
        public Builder transmissionShortCode(String transmissionShortCode){
            this.obj.setTransmissionShortCode(transmissionShortCode);
            return this;
        }
        public Builder transmissionSimpleCode(String transmissionSimpleCode){
            this.obj.setTransmissionSimpleCode(transmissionSimpleCode);
            return this;
        }
        public Builder transmissionType(String transmissionType){
            this.obj.setTransmissionType(transmissionType);
            return this;
        }
        public Builder carShortCode(String carShortCode){
            this.obj.setCarShortCode(carShortCode);
            return this;
        }
        public Builder carTypeCode(String carTypeCode){
            this.obj.setCarTypeCode(carTypeCode);
            return this;
        }
        public Builder carSimpleCode(String carSimpleCode){
            this.obj.setCarSimpleCode(carSimpleCode);
            return this;
        }
        public MqmsProduction build(){return obj;}
    }

}
