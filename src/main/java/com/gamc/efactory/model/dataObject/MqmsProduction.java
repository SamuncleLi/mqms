package com.gamc.efactory.model.dataObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class MqmsProduction implements Serializable {

    private static final long serialVersionUID = 1578885145298L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer productionId;

    /**
    * 工厂
    * isNullAble:1
    */
    private String factoryCode;

    /**
    * 生产批次
    * isNullAble:1
    */
    private String productionBatch;

    /**
    * vin码
    * isNullAble:1
    */
    private String vin;

    /**
    * mtoc
    * isNullAble:1
    */
    private String mtoc;

    /**
    * 站点
    * isNullAble:1
    */
    private String stationCode;

    /**
    * 通过时间
    * isNullAble:1
    */
    private String passTime;

    /**
    * 生产车型
    * isNullAble:1
    */
    private String carModelCode;

    /**
    * 生产车型名称
    * isNullAble:1
    */
    private String carModelName;

    /**
    * 工作日
    * isNullAble:1
    */
    private String productionWorktime;

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
    * 车辆类型
    * isNullAble:1
    */
    private String carType;

    /**
    * 出口国家
    * isNullAble:1
    */
    private String exportCountry;

    /**
    * 短码
    * isNullAble:1
    */
    private String shortCode;

    /**
    * 发动机机型
    * isNullAble:1
    */
    private String engType;

    /**
    * 系列
    * isNullAble:1
    */
    private String serialCode;

    /**
    * 区域
    * isNullAble:1
    */
    private String districtName;

    /**
    * 生产年
    * isNullAble:1
    */
    private String productionYear;

    /**
    * 生产月
    * isNullAble:1
    */
    private String productionMonth;

    /**
    * 变速箱短码
    * isNullAble:1
    */
    private String transmissionShortCode;

    /**
    * 变速箱简码
    * isNullAble:1
    */
    private String transmissionSimpleCode;

    /**
    * 变速箱类型
    * isNullAble:1
    */
    private String transmissionType;

    /**
    * 车型简码
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

    public void setEngType(String engType){this.engType = engType;}

    public String getEngType(){return this.engType;}

    public void setSerialCode(String serialCode){this.serialCode = serialCode;}

    public String getSerialCode(){return this.serialCode;}

    public void setDistrictName(String districtName){this.districtName = districtName;}

    public String getDistrictName(){return this.districtName;}

    public void setProductionYear(String productionYear){this.productionYear = productionYear;}

    public String getProductionYear(){return this.productionYear;}

    public void setProductionMonth(String productionMonth){this.productionMonth = productionMonth;}

    public String getProductionMonth(){return this.productionMonth;}

    public void setTransmissionShortCode(String transmissionShortCode){this.transmissionShortCode = transmissionShortCode;}

    public String getTransmissionShortCode(){return this.transmissionShortCode;}

    public void setTransmissionSimpleCode(String transmissionSimpleCode){this.transmissionSimpleCode = transmissionSimpleCode;}

    public String getTransmissionSimpleCode(){return this.transmissionSimpleCode;}

    public void setTransmissionType(String transmissionType){this.transmissionType = transmissionType;}

    public String getTransmissionType(){return this.transmissionType;}

    public void setCarShortCode(String carShortCode){this.carShortCode = carShortCode;}

    public String getCarShortCode(){return this.carShortCode;}

    public void setCarModel(String carModel){this.carModel = carModel;}

    public String getCarModel(){return this.carModel;}

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
                "engType='" + engType + '\'' +
                "serialCode='" + serialCode + '\'' +
                "districtName='" + districtName + '\'' +
                "productionYear='" + productionYear + '\'' +
                "productionMonth='" + productionMonth + '\'' +
                "transmissionShortCode='" + transmissionShortCode + '\'' +
                "transmissionSimpleCode='" + transmissionSimpleCode + '\'' +
                "transmissionType='" + transmissionType + '\'' +
                "carShortCode='" + carShortCode + '\'' +
                "carModel='" + carModel + '\'' +
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
        private List<String> engTypeList;

        public List<String> getEngTypeList(){return this.engTypeList;}


        private List<String> fuzzyEngType;

        public List<String> getFuzzyEngType(){return this.fuzzyEngType;}

        private List<String> rightFuzzyEngType;

        public List<String> getRightFuzzyEngType(){return this.rightFuzzyEngType;}
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
        private List<String> productionYearList;

        public List<String> getProductionYearList(){return this.productionYearList;}


        private List<String> fuzzyProductionYear;

        public List<String> getFuzzyProductionYear(){return this.fuzzyProductionYear;}

        private List<String> rightFuzzyProductionYear;

        public List<String> getRightFuzzyProductionYear(){return this.rightFuzzyProductionYear;}
        private List<String> productionMonthList;

        public List<String> getProductionMonthList(){return this.productionMonthList;}


        private List<String> fuzzyProductionMonth;

        public List<String> getFuzzyProductionMonth(){return this.fuzzyProductionMonth;}

        private List<String> rightFuzzyProductionMonth;

        public List<String> getRightFuzzyProductionMonth(){return this.rightFuzzyProductionMonth;}
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
        private List<String> carModelList;

        public List<String> getCarModelList(){return this.carModelList;}


        private List<String> fuzzyCarModel;

        public List<String> getFuzzyCarModel(){return this.fuzzyCarModel;}

        private List<String> rightFuzzyCarModel;

        public List<String> getRightFuzzyCarModel(){return this.rightFuzzyCarModel;}
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

        public QueryBuilder fuzzyProductionYear (List<String> fuzzyProductionYear){
            this.fuzzyProductionYear = fuzzyProductionYear;
            return this;
        }

        public QueryBuilder fuzzyProductionYear (String ... fuzzyProductionYear){
            this.fuzzyProductionYear = solveNullList(fuzzyProductionYear);
            return this;
        }

        public QueryBuilder rightFuzzyProductionYear (List<String> rightFuzzyProductionYear){
            this.rightFuzzyProductionYear = rightFuzzyProductionYear;
            return this;
        }

        public QueryBuilder rightFuzzyProductionYear (String ... rightFuzzyProductionYear){
            this.rightFuzzyProductionYear = solveNullList(rightFuzzyProductionYear);
            return this;
        }

        public QueryBuilder productionYear(String productionYear){
            setProductionYear(productionYear);
            return this;
        }

        public QueryBuilder productionYearList(String ... productionYear){
            this.productionYearList = solveNullList(productionYear);
            return this;
        }

        public QueryBuilder productionYearList(List<String> productionYear){
            this.productionYearList = productionYear;
            return this;
        }

        public QueryBuilder fetchProductionYear(){
            setFetchFields("fetchFields","productionYear");
            return this;
        }

        public QueryBuilder excludeProductionYear(){
            setFetchFields("excludeFields","productionYear");
            return this;
        }

        public QueryBuilder fuzzyProductionMonth (List<String> fuzzyProductionMonth){
            this.fuzzyProductionMonth = fuzzyProductionMonth;
            return this;
        }

        public QueryBuilder fuzzyProductionMonth (String ... fuzzyProductionMonth){
            this.fuzzyProductionMonth = solveNullList(fuzzyProductionMonth);
            return this;
        }

        public QueryBuilder rightFuzzyProductionMonth (List<String> rightFuzzyProductionMonth){
            this.rightFuzzyProductionMonth = rightFuzzyProductionMonth;
            return this;
        }

        public QueryBuilder rightFuzzyProductionMonth (String ... rightFuzzyProductionMonth){
            this.rightFuzzyProductionMonth = solveNullList(rightFuzzyProductionMonth);
            return this;
        }

        public QueryBuilder productionMonth(String productionMonth){
            setProductionMonth(productionMonth);
            return this;
        }

        public QueryBuilder productionMonthList(String ... productionMonth){
            this.productionMonthList = solveNullList(productionMonth);
            return this;
        }

        public QueryBuilder productionMonthList(List<String> productionMonth){
            this.productionMonthList = productionMonth;
            return this;
        }

        public QueryBuilder fetchProductionMonth(){
            setFetchFields("fetchFields","productionMonth");
            return this;
        }

        public QueryBuilder excludeProductionMonth(){
            setFetchFields("excludeFields","productionMonth");
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
        private List<String> engTypeList;

        public List<String> getEngTypeList(){return this.engTypeList;}


        private List<String> fuzzyEngType;

        public List<String> getFuzzyEngType(){return this.fuzzyEngType;}

        private List<String> rightFuzzyEngType;

        public List<String> getRightFuzzyEngType(){return this.rightFuzzyEngType;}
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
        private List<String> productionYearList;

        public List<String> getProductionYearList(){return this.productionYearList;}


        private List<String> fuzzyProductionYear;

        public List<String> getFuzzyProductionYear(){return this.fuzzyProductionYear;}

        private List<String> rightFuzzyProductionYear;

        public List<String> getRightFuzzyProductionYear(){return this.rightFuzzyProductionYear;}
        private List<String> productionMonthList;

        public List<String> getProductionMonthList(){return this.productionMonthList;}


        private List<String> fuzzyProductionMonth;

        public List<String> getFuzzyProductionMonth(){return this.fuzzyProductionMonth;}

        private List<String> rightFuzzyProductionMonth;

        public List<String> getRightFuzzyProductionMonth(){return this.rightFuzzyProductionMonth;}
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
        private List<String> carModelList;

        public List<String> getCarModelList(){return this.carModelList;}


        private List<String> fuzzyCarModel;

        public List<String> getFuzzyCarModel(){return this.fuzzyCarModel;}

        private List<String> rightFuzzyCarModel;

        public List<String> getRightFuzzyCarModel(){return this.rightFuzzyCarModel;}
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

        public ConditionBuilder fuzzyProductionYear (List<String> fuzzyProductionYear){
            this.fuzzyProductionYear = fuzzyProductionYear;
            return this;
        }

        public ConditionBuilder fuzzyProductionYear (String ... fuzzyProductionYear){
            this.fuzzyProductionYear = solveNullList(fuzzyProductionYear);
            return this;
        }

        public ConditionBuilder rightFuzzyProductionYear (List<String> rightFuzzyProductionYear){
            this.rightFuzzyProductionYear = rightFuzzyProductionYear;
            return this;
        }

        public ConditionBuilder rightFuzzyProductionYear (String ... rightFuzzyProductionYear){
            this.rightFuzzyProductionYear = solveNullList(rightFuzzyProductionYear);
            return this;
        }

        public ConditionBuilder productionYearList(String ... productionYear){
            this.productionYearList = solveNullList(productionYear);
            return this;
        }

        public ConditionBuilder productionYearList(List<String> productionYear){
            this.productionYearList = productionYear;
            return this;
        }

        public ConditionBuilder fuzzyProductionMonth (List<String> fuzzyProductionMonth){
            this.fuzzyProductionMonth = fuzzyProductionMonth;
            return this;
        }

        public ConditionBuilder fuzzyProductionMonth (String ... fuzzyProductionMonth){
            this.fuzzyProductionMonth = solveNullList(fuzzyProductionMonth);
            return this;
        }

        public ConditionBuilder rightFuzzyProductionMonth (List<String> rightFuzzyProductionMonth){
            this.rightFuzzyProductionMonth = rightFuzzyProductionMonth;
            return this;
        }

        public ConditionBuilder rightFuzzyProductionMonth (String ... rightFuzzyProductionMonth){
            this.rightFuzzyProductionMonth = solveNullList(rightFuzzyProductionMonth);
            return this;
        }

        public ConditionBuilder productionMonthList(String ... productionMonth){
            this.productionMonthList = solveNullList(productionMonth);
            return this;
        }

        public ConditionBuilder productionMonthList(List<String> productionMonth){
            this.productionMonthList = productionMonth;
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
        public Builder engType(String engType){
            this.obj.setEngType(engType);
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
        public Builder productionYear(String productionYear){
            this.obj.setProductionYear(productionYear);
            return this;
        }
        public Builder productionMonth(String productionMonth){
            this.obj.setProductionMonth(productionMonth);
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
        public Builder carModel(String carModel){
            this.obj.setCarModel(carModel);
            return this;
        }
        public Builder carSimpleCode(String carSimpleCode){
            this.obj.setCarSimpleCode(carSimpleCode);
            return this;
        }
        public MqmsProduction build(){return obj;}
    }

}
