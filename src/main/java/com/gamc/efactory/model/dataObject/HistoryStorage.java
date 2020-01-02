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
public class HistoryStorage implements Serializable {

    private static final long serialVersionUID = 1567755868275L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 申请人
    * isNullAble:1
    */
    private String applier;

    /**
    * 申请时间
    * isNullAble:1
    */
    private String applyTime;

    /**
    * 年
    * isNullAble:1
    */
    private String year;

    /**
    * 月
    * isNullAble:1
    */
    private String month;

    /**
    * 日
    * isNullAble:1
    */
    private String day;

    /**
    * 日期
    * isNullAble:1
    */
    private String date;

    /**
    * 库存金额总额
    * isNullAble:1
    */
    private java.math.BigDecimal moneyAmount;

    /**
    * 仓库号
    * isNullAble:1
    */
    private String warehouseCode;

    /**
    * 物料种类
    * isNullAble:1
    */
    private String materialType;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setApplier(String applier){this.applier = applier;}

    public String getApplier(){return this.applier;}

    public void setApplyTime(String applyTime){this.applyTime = applyTime;}

    public String getApplyTime(){return this.applyTime;}

    public void setYear(String year){this.year = year;}

    public String getYear(){return this.year;}

    public void setMonth(String month){this.month = month;}

    public String getMonth(){return this.month;}

    public void setDay(String day){this.day = day;}

    public String getDay(){return this.day;}

    public void setDate(String date){this.date = date;}

    public String getDate(){return this.date;}

    public void setMoneyAmount(java.math.BigDecimal moneyAmount){this.moneyAmount = moneyAmount;}

    public java.math.BigDecimal getMoneyAmount(){return this.moneyAmount;}

    public void setWarehouseCode(String warehouseCode){this.warehouseCode = warehouseCode;}

    public String getWarehouseCode(){return this.warehouseCode;}

    public void setMaterialType(String materialType){this.materialType = materialType;}

    public String getMaterialType(){return this.materialType;}
    @Override
    public String toString() {
        return "HistoryStorage{" +
                "id='" + id + '\'' +
                "applier='" + applier + '\'' +
                "applyTime='" + applyTime + '\'' +
                "year='" + year + '\'' +
                "month='" + month + '\'' +
                "day='" + day + '\'' +
                "date='" + date + '\'' +
                "moneyAmount='" + moneyAmount + '\'' +
                "warehouseCode='" + warehouseCode + '\'' +
                "materialType='" + materialType + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private HistoryStorage set;

        private ConditionBuilder where;

        public UpdateBuilder set(HistoryStorage set){
            this.set = set;
            return this;
        }

        public HistoryStorage getSet(){
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

    public static class QueryBuilder extends HistoryStorage{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> applierList;

        public List<String> getApplierList(){return this.applierList;}


        private List<String> fuzzyApplier;

        public List<String> getFuzzyApplier(){return this.fuzzyApplier;}

        private List<String> rightFuzzyApplier;

        public List<String> getRightFuzzyApplier(){return this.rightFuzzyApplier;}
        private List<String> applyTimeList;

        public List<String> getApplyTimeList(){return this.applyTimeList;}


        private List<String> fuzzyApplyTime;

        public List<String> getFuzzyApplyTime(){return this.fuzzyApplyTime;}

        private List<String> rightFuzzyApplyTime;

        public List<String> getRightFuzzyApplyTime(){return this.rightFuzzyApplyTime;}
        private List<String> yearList;

        public List<String> getYearList(){return this.yearList;}


        private List<String> fuzzyYear;

        public List<String> getFuzzyYear(){return this.fuzzyYear;}

        private List<String> rightFuzzyYear;

        public List<String> getRightFuzzyYear(){return this.rightFuzzyYear;}
        private List<String> monthList;

        public List<String> getMonthList(){return this.monthList;}


        private List<String> fuzzyMonth;

        public List<String> getFuzzyMonth(){return this.fuzzyMonth;}

        private List<String> rightFuzzyMonth;

        public List<String> getRightFuzzyMonth(){return this.rightFuzzyMonth;}
        private List<String> dayList;

        public List<String> getDayList(){return this.dayList;}


        private List<String> fuzzyDay;

        public List<String> getFuzzyDay(){return this.fuzzyDay;}

        private List<String> rightFuzzyDay;

        public List<String> getRightFuzzyDay(){return this.rightFuzzyDay;}
        private List<String> dateList;

        public List<String> getDateList(){return this.dateList;}


        private List<String> fuzzyDate;

        public List<String> getFuzzyDate(){return this.fuzzyDate;}

        private List<String> rightFuzzyDate;

        public List<String> getRightFuzzyDate(){return this.rightFuzzyDate;}
        private List<java.math.BigDecimal> moneyAmountList;

        public List<java.math.BigDecimal> getMoneyAmountList(){return this.moneyAmountList;}

        private java.math.BigDecimal moneyAmountSt;

        private java.math.BigDecimal moneyAmountEd;

        public java.math.BigDecimal getMoneyAmountSt(){return this.moneyAmountSt;}

        public java.math.BigDecimal getMoneyAmountEd(){return this.moneyAmountEd;}

        private List<String> warehouseCodeList;

        public List<String> getWarehouseCodeList(){return this.warehouseCodeList;}


        private List<String> fuzzyWarehouseCode;

        public List<String> getFuzzyWarehouseCode(){return this.fuzzyWarehouseCode;}

        private List<String> rightFuzzyWarehouseCode;

        public List<String> getRightFuzzyWarehouseCode(){return this.rightFuzzyWarehouseCode;}
        private List<String> materialTypeList;

        public List<String> getMaterialTypeList(){return this.materialTypeList;}


        private List<String> fuzzyMaterialType;

        public List<String> getFuzzyMaterialType(){return this.fuzzyMaterialType;}

        private List<String> rightFuzzyMaterialType;

        public List<String> getRightFuzzyMaterialType(){return this.rightFuzzyMaterialType;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyApplier (List<String> fuzzyApplier){
            this.fuzzyApplier = fuzzyApplier;
            return this;
        }

        public QueryBuilder fuzzyApplier (String ... fuzzyApplier){
            this.fuzzyApplier = solveNullList(fuzzyApplier);
            return this;
        }

        public QueryBuilder rightFuzzyApplier (List<String> rightFuzzyApplier){
            this.rightFuzzyApplier = rightFuzzyApplier;
            return this;
        }

        public QueryBuilder rightFuzzyApplier (String ... rightFuzzyApplier){
            this.rightFuzzyApplier = solveNullList(rightFuzzyApplier);
            return this;
        }

        public QueryBuilder applier(String applier){
            setApplier(applier);
            return this;
        }

        public QueryBuilder applierList(String ... applier){
            this.applierList = solveNullList(applier);
            return this;
        }

        public QueryBuilder applierList(List<String> applier){
            this.applierList = applier;
            return this;
        }

        public QueryBuilder fetchApplier(){
            setFetchFields("fetchFields","applier");
            return this;
        }

        public QueryBuilder excludeApplier(){
            setFetchFields("excludeFields","applier");
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

        public QueryBuilder fuzzyYear (List<String> fuzzyYear){
            this.fuzzyYear = fuzzyYear;
            return this;
        }

        public QueryBuilder fuzzyYear (String ... fuzzyYear){
            this.fuzzyYear = solveNullList(fuzzyYear);
            return this;
        }

        public QueryBuilder rightFuzzyYear (List<String> rightFuzzyYear){
            this.rightFuzzyYear = rightFuzzyYear;
            return this;
        }

        public QueryBuilder rightFuzzyYear (String ... rightFuzzyYear){
            this.rightFuzzyYear = solveNullList(rightFuzzyYear);
            return this;
        }

        public QueryBuilder year(String year){
            setYear(year);
            return this;
        }

        public QueryBuilder yearList(String ... year){
            this.yearList = solveNullList(year);
            return this;
        }

        public QueryBuilder yearList(List<String> year){
            this.yearList = year;
            return this;
        }

        public QueryBuilder fetchYear(){
            setFetchFields("fetchFields","year");
            return this;
        }

        public QueryBuilder excludeYear(){
            setFetchFields("excludeFields","year");
            return this;
        }

        public QueryBuilder fuzzyMonth (List<String> fuzzyMonth){
            this.fuzzyMonth = fuzzyMonth;
            return this;
        }

        public QueryBuilder fuzzyMonth (String ... fuzzyMonth){
            this.fuzzyMonth = solveNullList(fuzzyMonth);
            return this;
        }

        public QueryBuilder rightFuzzyMonth (List<String> rightFuzzyMonth){
            this.rightFuzzyMonth = rightFuzzyMonth;
            return this;
        }

        public QueryBuilder rightFuzzyMonth (String ... rightFuzzyMonth){
            this.rightFuzzyMonth = solveNullList(rightFuzzyMonth);
            return this;
        }

        public QueryBuilder month(String month){
            setMonth(month);
            return this;
        }

        public QueryBuilder monthList(String ... month){
            this.monthList = solveNullList(month);
            return this;
        }

        public QueryBuilder monthList(List<String> month){
            this.monthList = month;
            return this;
        }

        public QueryBuilder fetchMonth(){
            setFetchFields("fetchFields","month");
            return this;
        }

        public QueryBuilder excludeMonth(){
            setFetchFields("excludeFields","month");
            return this;
        }

        public QueryBuilder fuzzyDay (List<String> fuzzyDay){
            this.fuzzyDay = fuzzyDay;
            return this;
        }

        public QueryBuilder fuzzyDay (String ... fuzzyDay){
            this.fuzzyDay = solveNullList(fuzzyDay);
            return this;
        }

        public QueryBuilder rightFuzzyDay (List<String> rightFuzzyDay){
            this.rightFuzzyDay = rightFuzzyDay;
            return this;
        }

        public QueryBuilder rightFuzzyDay (String ... rightFuzzyDay){
            this.rightFuzzyDay = solveNullList(rightFuzzyDay);
            return this;
        }

        public QueryBuilder day(String day){
            setDay(day);
            return this;
        }

        public QueryBuilder dayList(String ... day){
            this.dayList = solveNullList(day);
            return this;
        }

        public QueryBuilder dayList(List<String> day){
            this.dayList = day;
            return this;
        }

        public QueryBuilder fetchDay(){
            setFetchFields("fetchFields","day");
            return this;
        }

        public QueryBuilder excludeDay(){
            setFetchFields("excludeFields","day");
            return this;
        }

        public QueryBuilder fuzzyDate (List<String> fuzzyDate){
            this.fuzzyDate = fuzzyDate;
            return this;
        }

        public QueryBuilder fuzzyDate (String ... fuzzyDate){
            this.fuzzyDate = solveNullList(fuzzyDate);
            return this;
        }

        public QueryBuilder rightFuzzyDate (List<String> rightFuzzyDate){
            this.rightFuzzyDate = rightFuzzyDate;
            return this;
        }

        public QueryBuilder rightFuzzyDate (String ... rightFuzzyDate){
            this.rightFuzzyDate = solveNullList(rightFuzzyDate);
            return this;
        }

        public QueryBuilder date(String date){
            setDate(date);
            return this;
        }

        public QueryBuilder dateList(String ... date){
            this.dateList = solveNullList(date);
            return this;
        }

        public QueryBuilder dateList(List<String> date){
            this.dateList = date;
            return this;
        }

        public QueryBuilder fetchDate(){
            setFetchFields("fetchFields","date");
            return this;
        }

        public QueryBuilder excludeDate(){
            setFetchFields("excludeFields","date");
            return this;
        }

        public QueryBuilder moneyAmountBetWeen(java.math.BigDecimal moneyAmountSt,java.math.BigDecimal moneyAmountEd){
            this.moneyAmountSt = moneyAmountSt;
            this.moneyAmountEd = moneyAmountEd;
            return this;
        }

        public QueryBuilder moneyAmountGreaterEqThan(java.math.BigDecimal moneyAmountSt){
            this.moneyAmountSt = moneyAmountSt;
            return this;
        }
        public QueryBuilder moneyAmountLessEqThan(java.math.BigDecimal moneyAmountEd){
            this.moneyAmountEd = moneyAmountEd;
            return this;
        }


        public QueryBuilder moneyAmount(java.math.BigDecimal moneyAmount){
            setMoneyAmount(moneyAmount);
            return this;
        }

        public QueryBuilder moneyAmountList(java.math.BigDecimal ... moneyAmount){
            this.moneyAmountList = solveNullList(moneyAmount);
            return this;
        }

        public QueryBuilder moneyAmountList(List<java.math.BigDecimal> moneyAmount){
            this.moneyAmountList = moneyAmount;
            return this;
        }

        public QueryBuilder fetchMoneyAmount(){
            setFetchFields("fetchFields","moneyAmount");
            return this;
        }

        public QueryBuilder excludeMoneyAmount(){
            setFetchFields("excludeFields","moneyAmount");
            return this;
        }

        public QueryBuilder fuzzyWarehouseCode (List<String> fuzzyWarehouseCode){
            this.fuzzyWarehouseCode = fuzzyWarehouseCode;
            return this;
        }

        public QueryBuilder fuzzyWarehouseCode (String ... fuzzyWarehouseCode){
            this.fuzzyWarehouseCode = solveNullList(fuzzyWarehouseCode);
            return this;
        }

        public QueryBuilder rightFuzzyWarehouseCode (List<String> rightFuzzyWarehouseCode){
            this.rightFuzzyWarehouseCode = rightFuzzyWarehouseCode;
            return this;
        }

        public QueryBuilder rightFuzzyWarehouseCode (String ... rightFuzzyWarehouseCode){
            this.rightFuzzyWarehouseCode = solveNullList(rightFuzzyWarehouseCode);
            return this;
        }

        public QueryBuilder warehouseCode(String warehouseCode){
            setWarehouseCode(warehouseCode);
            return this;
        }

        public QueryBuilder warehouseCodeList(String ... warehouseCode){
            this.warehouseCodeList = solveNullList(warehouseCode);
            return this;
        }

        public QueryBuilder warehouseCodeList(List<String> warehouseCode){
            this.warehouseCodeList = warehouseCode;
            return this;
        }

        public QueryBuilder fetchWarehouseCode(){
            setFetchFields("fetchFields","warehouseCode");
            return this;
        }

        public QueryBuilder excludeWarehouseCode(){
            setFetchFields("excludeFields","warehouseCode");
            return this;
        }

        public QueryBuilder fuzzyMaterialType (List<String> fuzzyMaterialType){
            this.fuzzyMaterialType = fuzzyMaterialType;
            return this;
        }

        public QueryBuilder fuzzyMaterialType (String ... fuzzyMaterialType){
            this.fuzzyMaterialType = solveNullList(fuzzyMaterialType);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialType (List<String> rightFuzzyMaterialType){
            this.rightFuzzyMaterialType = rightFuzzyMaterialType;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialType (String ... rightFuzzyMaterialType){
            this.rightFuzzyMaterialType = solveNullList(rightFuzzyMaterialType);
            return this;
        }

        public QueryBuilder materialType(String materialType){
            setMaterialType(materialType);
            return this;
        }

        public QueryBuilder materialTypeList(String ... materialType){
            this.materialTypeList = solveNullList(materialType);
            return this;
        }

        public QueryBuilder materialTypeList(List<String> materialType){
            this.materialTypeList = materialType;
            return this;
        }

        public QueryBuilder fetchMaterialType(){
            setFetchFields("fetchFields","materialType");
            return this;
        }

        public QueryBuilder excludeMaterialType(){
            setFetchFields("excludeFields","materialType");
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

        public HistoryStorage build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> applierList;

        public List<String> getApplierList(){return this.applierList;}


        private List<String> fuzzyApplier;

        public List<String> getFuzzyApplier(){return this.fuzzyApplier;}

        private List<String> rightFuzzyApplier;

        public List<String> getRightFuzzyApplier(){return this.rightFuzzyApplier;}
        private List<String> applyTimeList;

        public List<String> getApplyTimeList(){return this.applyTimeList;}


        private List<String> fuzzyApplyTime;

        public List<String> getFuzzyApplyTime(){return this.fuzzyApplyTime;}

        private List<String> rightFuzzyApplyTime;

        public List<String> getRightFuzzyApplyTime(){return this.rightFuzzyApplyTime;}
        private List<String> yearList;

        public List<String> getYearList(){return this.yearList;}


        private List<String> fuzzyYear;

        public List<String> getFuzzyYear(){return this.fuzzyYear;}

        private List<String> rightFuzzyYear;

        public List<String> getRightFuzzyYear(){return this.rightFuzzyYear;}
        private List<String> monthList;

        public List<String> getMonthList(){return this.monthList;}


        private List<String> fuzzyMonth;

        public List<String> getFuzzyMonth(){return this.fuzzyMonth;}

        private List<String> rightFuzzyMonth;

        public List<String> getRightFuzzyMonth(){return this.rightFuzzyMonth;}
        private List<String> dayList;

        public List<String> getDayList(){return this.dayList;}


        private List<String> fuzzyDay;

        public List<String> getFuzzyDay(){return this.fuzzyDay;}

        private List<String> rightFuzzyDay;

        public List<String> getRightFuzzyDay(){return this.rightFuzzyDay;}
        private List<String> dateList;

        public List<String> getDateList(){return this.dateList;}


        private List<String> fuzzyDate;

        public List<String> getFuzzyDate(){return this.fuzzyDate;}

        private List<String> rightFuzzyDate;

        public List<String> getRightFuzzyDate(){return this.rightFuzzyDate;}
        private List<java.math.BigDecimal> moneyAmountList;

        public List<java.math.BigDecimal> getMoneyAmountList(){return this.moneyAmountList;}

        private java.math.BigDecimal moneyAmountSt;

        private java.math.BigDecimal moneyAmountEd;

        public java.math.BigDecimal getMoneyAmountSt(){return this.moneyAmountSt;}

        public java.math.BigDecimal getMoneyAmountEd(){return this.moneyAmountEd;}

        private List<String> warehouseCodeList;

        public List<String> getWarehouseCodeList(){return this.warehouseCodeList;}


        private List<String> fuzzyWarehouseCode;

        public List<String> getFuzzyWarehouseCode(){return this.fuzzyWarehouseCode;}

        private List<String> rightFuzzyWarehouseCode;

        public List<String> getRightFuzzyWarehouseCode(){return this.rightFuzzyWarehouseCode;}
        private List<String> materialTypeList;

        public List<String> getMaterialTypeList(){return this.materialTypeList;}


        private List<String> fuzzyMaterialType;

        public List<String> getFuzzyMaterialType(){return this.fuzzyMaterialType;}

        private List<String> rightFuzzyMaterialType;

        public List<String> getRightFuzzyMaterialType(){return this.rightFuzzyMaterialType;}

        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyApplier (List<String> fuzzyApplier){
            this.fuzzyApplier = fuzzyApplier;
            return this;
        }

        public ConditionBuilder fuzzyApplier (String ... fuzzyApplier){
            this.fuzzyApplier = solveNullList(fuzzyApplier);
            return this;
        }

        public ConditionBuilder rightFuzzyApplier (List<String> rightFuzzyApplier){
            this.rightFuzzyApplier = rightFuzzyApplier;
            return this;
        }

        public ConditionBuilder rightFuzzyApplier (String ... rightFuzzyApplier){
            this.rightFuzzyApplier = solveNullList(rightFuzzyApplier);
            return this;
        }

        public ConditionBuilder applierList(String ... applier){
            this.applierList = solveNullList(applier);
            return this;
        }

        public ConditionBuilder applierList(List<String> applier){
            this.applierList = applier;
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

        public ConditionBuilder fuzzyYear (List<String> fuzzyYear){
            this.fuzzyYear = fuzzyYear;
            return this;
        }

        public ConditionBuilder fuzzyYear (String ... fuzzyYear){
            this.fuzzyYear = solveNullList(fuzzyYear);
            return this;
        }

        public ConditionBuilder rightFuzzyYear (List<String> rightFuzzyYear){
            this.rightFuzzyYear = rightFuzzyYear;
            return this;
        }

        public ConditionBuilder rightFuzzyYear (String ... rightFuzzyYear){
            this.rightFuzzyYear = solveNullList(rightFuzzyYear);
            return this;
        }

        public ConditionBuilder yearList(String ... year){
            this.yearList = solveNullList(year);
            return this;
        }

        public ConditionBuilder yearList(List<String> year){
            this.yearList = year;
            return this;
        }

        public ConditionBuilder fuzzyMonth (List<String> fuzzyMonth){
            this.fuzzyMonth = fuzzyMonth;
            return this;
        }

        public ConditionBuilder fuzzyMonth (String ... fuzzyMonth){
            this.fuzzyMonth = solveNullList(fuzzyMonth);
            return this;
        }

        public ConditionBuilder rightFuzzyMonth (List<String> rightFuzzyMonth){
            this.rightFuzzyMonth = rightFuzzyMonth;
            return this;
        }

        public ConditionBuilder rightFuzzyMonth (String ... rightFuzzyMonth){
            this.rightFuzzyMonth = solveNullList(rightFuzzyMonth);
            return this;
        }

        public ConditionBuilder monthList(String ... month){
            this.monthList = solveNullList(month);
            return this;
        }

        public ConditionBuilder monthList(List<String> month){
            this.monthList = month;
            return this;
        }

        public ConditionBuilder fuzzyDay (List<String> fuzzyDay){
            this.fuzzyDay = fuzzyDay;
            return this;
        }

        public ConditionBuilder fuzzyDay (String ... fuzzyDay){
            this.fuzzyDay = solveNullList(fuzzyDay);
            return this;
        }

        public ConditionBuilder rightFuzzyDay (List<String> rightFuzzyDay){
            this.rightFuzzyDay = rightFuzzyDay;
            return this;
        }

        public ConditionBuilder rightFuzzyDay (String ... rightFuzzyDay){
            this.rightFuzzyDay = solveNullList(rightFuzzyDay);
            return this;
        }

        public ConditionBuilder dayList(String ... day){
            this.dayList = solveNullList(day);
            return this;
        }

        public ConditionBuilder dayList(List<String> day){
            this.dayList = day;
            return this;
        }

        public ConditionBuilder fuzzyDate (List<String> fuzzyDate){
            this.fuzzyDate = fuzzyDate;
            return this;
        }

        public ConditionBuilder fuzzyDate (String ... fuzzyDate){
            this.fuzzyDate = solveNullList(fuzzyDate);
            return this;
        }

        public ConditionBuilder rightFuzzyDate (List<String> rightFuzzyDate){
            this.rightFuzzyDate = rightFuzzyDate;
            return this;
        }

        public ConditionBuilder rightFuzzyDate (String ... rightFuzzyDate){
            this.rightFuzzyDate = solveNullList(rightFuzzyDate);
            return this;
        }

        public ConditionBuilder dateList(String ... date){
            this.dateList = solveNullList(date);
            return this;
        }

        public ConditionBuilder dateList(List<String> date){
            this.dateList = date;
            return this;
        }

        public ConditionBuilder moneyAmountBetWeen(java.math.BigDecimal moneyAmountSt,java.math.BigDecimal moneyAmountEd){
            this.moneyAmountSt = moneyAmountSt;
            this.moneyAmountEd = moneyAmountEd;
            return this;
        }

        public ConditionBuilder moneyAmountGreaterEqThan(java.math.BigDecimal moneyAmountSt){
            this.moneyAmountSt = moneyAmountSt;
            return this;
        }
        public ConditionBuilder moneyAmountLessEqThan(java.math.BigDecimal moneyAmountEd){
            this.moneyAmountEd = moneyAmountEd;
            return this;
        }


        public ConditionBuilder moneyAmountList(java.math.BigDecimal ... moneyAmount){
            this.moneyAmountList = solveNullList(moneyAmount);
            return this;
        }

        public ConditionBuilder moneyAmountList(List<java.math.BigDecimal> moneyAmount){
            this.moneyAmountList = moneyAmount;
            return this;
        }

        public ConditionBuilder fuzzyWarehouseCode (List<String> fuzzyWarehouseCode){
            this.fuzzyWarehouseCode = fuzzyWarehouseCode;
            return this;
        }

        public ConditionBuilder fuzzyWarehouseCode (String ... fuzzyWarehouseCode){
            this.fuzzyWarehouseCode = solveNullList(fuzzyWarehouseCode);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehouseCode (List<String> rightFuzzyWarehouseCode){
            this.rightFuzzyWarehouseCode = rightFuzzyWarehouseCode;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehouseCode (String ... rightFuzzyWarehouseCode){
            this.rightFuzzyWarehouseCode = solveNullList(rightFuzzyWarehouseCode);
            return this;
        }

        public ConditionBuilder warehouseCodeList(String ... warehouseCode){
            this.warehouseCodeList = solveNullList(warehouseCode);
            return this;
        }

        public ConditionBuilder warehouseCodeList(List<String> warehouseCode){
            this.warehouseCodeList = warehouseCode;
            return this;
        }

        public ConditionBuilder fuzzyMaterialType (List<String> fuzzyMaterialType){
            this.fuzzyMaterialType = fuzzyMaterialType;
            return this;
        }

        public ConditionBuilder fuzzyMaterialType (String ... fuzzyMaterialType){
            this.fuzzyMaterialType = solveNullList(fuzzyMaterialType);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialType (List<String> rightFuzzyMaterialType){
            this.rightFuzzyMaterialType = rightFuzzyMaterialType;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialType (String ... rightFuzzyMaterialType){
            this.rightFuzzyMaterialType = solveNullList(rightFuzzyMaterialType);
            return this;
        }

        public ConditionBuilder materialTypeList(String ... materialType){
            this.materialTypeList = solveNullList(materialType);
            return this;
        }

        public ConditionBuilder materialTypeList(List<String> materialType){
            this.materialTypeList = materialType;
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

        private HistoryStorage obj;

        public Builder(){
            this.obj = new HistoryStorage();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder applier(String applier){
            this.obj.setApplier(applier);
            return this;
        }
        public Builder applyTime(String applyTime){
            this.obj.setApplyTime(applyTime);
            return this;
        }
        public Builder year(String year){
            this.obj.setYear(year);
            return this;
        }
        public Builder month(String month){
            this.obj.setMonth(month);
            return this;
        }
        public Builder day(String day){
            this.obj.setDay(day);
            return this;
        }
        public Builder date(String date){
            this.obj.setDate(date);
            return this;
        }
        public Builder moneyAmount(java.math.BigDecimal moneyAmount){
            this.obj.setMoneyAmount(moneyAmount);
            return this;
        }
        public Builder warehouseCode(String warehouseCode){
            this.obj.setWarehouseCode(warehouseCode);
            return this;
        }
        public Builder materialType(String materialType){
            this.obj.setMaterialType(materialType);
            return this;
        }
        public HistoryStorage build(){return obj;}
    }

}
