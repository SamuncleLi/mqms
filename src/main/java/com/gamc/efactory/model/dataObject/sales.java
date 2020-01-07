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
public class sales implements Serializable {

    private static final long serialVersionUID = 1578313745349L;


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
    * 销售系统状态
    * isNullAble:1
    */
    private String salesState;

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


    public void setSalesId(Integer salesId){this.salesId = salesId;}

    public Integer getSalesId(){return this.salesId;}

    public void setVinCode(String vinCode){this.vinCode = vinCode;}

    public String getVinCode(){return this.vinCode;}

    public void setSalesCarType(String salesCarType){this.salesCarType = salesCarType;}

    public String getSalesCarType(){return this.salesCarType;}

    public void setSalesState(String salesState){this.salesState = salesState;}

    public String getSalesState(){return this.salesState;}

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
    @Override
    public String toString() {
        return "sales{" +
                "salesId='" + salesId + '\'' +
                "vinCode='" + vinCode + '\'' +
                "salesCarType='" + salesCarType + '\'' +
                "salesState='" + salesState + '\'' +
                "dealerCode='" + dealerCode + '\'' +
                "dealerName='" + dealerName + '\'' +
                "produceDate='" + produceDate + '\'' +
                "firstPinDate='" + firstPinDate + '\'' +
                "secondPinDate='" + secondPinDate + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private sales set;

        private ConditionBuilder where;

        public UpdateBuilder set(sales set){
            this.set = set;
            return this;
        }

        public sales getSet(){
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

    public static class QueryBuilder extends sales{
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
        private List<String> salesStateList;

        public List<String> getSalesStateList(){return this.salesStateList;}


        private List<String> fuzzySalesState;

        public List<String> getFuzzySalesState(){return this.fuzzySalesState;}

        private List<String> rightFuzzySalesState;

        public List<String> getRightFuzzySalesState(){return this.rightFuzzySalesState;}
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

        public QueryBuilder fuzzySalesState (List<String> fuzzySalesState){
            this.fuzzySalesState = fuzzySalesState;
            return this;
        }

        public QueryBuilder fuzzySalesState (String ... fuzzySalesState){
            this.fuzzySalesState = solveNullList(fuzzySalesState);
            return this;
        }

        public QueryBuilder rightFuzzySalesState (List<String> rightFuzzySalesState){
            this.rightFuzzySalesState = rightFuzzySalesState;
            return this;
        }

        public QueryBuilder rightFuzzySalesState (String ... rightFuzzySalesState){
            this.rightFuzzySalesState = solveNullList(rightFuzzySalesState);
            return this;
        }

        public QueryBuilder salesState(String salesState){
            setSalesState(salesState);
            return this;
        }

        public QueryBuilder salesStateList(String ... salesState){
            this.salesStateList = solveNullList(salesState);
            return this;
        }

        public QueryBuilder salesStateList(List<String> salesState){
            this.salesStateList = salesState;
            return this;
        }

        public QueryBuilder fetchSalesState(){
            setFetchFields("fetchFields","salesState");
            return this;
        }

        public QueryBuilder excludeSalesState(){
            setFetchFields("excludeFields","salesState");
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

        public sales build(){return this;}
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
        private List<String> salesStateList;

        public List<String> getSalesStateList(){return this.salesStateList;}


        private List<String> fuzzySalesState;

        public List<String> getFuzzySalesState(){return this.fuzzySalesState;}

        private List<String> rightFuzzySalesState;

        public List<String> getRightFuzzySalesState(){return this.rightFuzzySalesState;}
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

        public ConditionBuilder fuzzySalesState (List<String> fuzzySalesState){
            this.fuzzySalesState = fuzzySalesState;
            return this;
        }

        public ConditionBuilder fuzzySalesState (String ... fuzzySalesState){
            this.fuzzySalesState = solveNullList(fuzzySalesState);
            return this;
        }

        public ConditionBuilder rightFuzzySalesState (List<String> rightFuzzySalesState){
            this.rightFuzzySalesState = rightFuzzySalesState;
            return this;
        }

        public ConditionBuilder rightFuzzySalesState (String ... rightFuzzySalesState){
            this.rightFuzzySalesState = solveNullList(rightFuzzySalesState);
            return this;
        }

        public ConditionBuilder salesStateList(String ... salesState){
            this.salesStateList = solveNullList(salesState);
            return this;
        }

        public ConditionBuilder salesStateList(List<String> salesState){
            this.salesStateList = salesState;
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

        private sales obj;

        public Builder(){
            this.obj = new sales();
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
        public Builder salesState(String salesState){
            this.obj.setSalesState(salesState);
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
        public sales build(){return obj;}
    }

}
