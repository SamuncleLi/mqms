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
public class OrderChecker implements Serializable {

    private static final long serialVersionUID = 1568192519206L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer orderCheckerId;

    /**
    * 
    * isNullAble:1
    */
    private String financialCenterCode;

    /**
    * 
    * isNullAble:1
    */
    private Integer orderCheckerLevelId;

    /**
    * 
    * isNullAble:1
    */
    private String orderCheckerLevelName;

    /**
    * 
    * isNullAble:1
    */
    private String orderCheckerLevelDesc;

    /**
    * 
    * isNullAble:1
    */
    private String orderCheckerUserId;

    /**
    * 
    * isNullAble:1
    */
    private String orderCheckerUserName;

    /**
    * 
    * isNullAble:1
    */
    private String orderCheckerUserNo;

    /**
    * 
    * isNullAble:1
    */
    private Integer dictDefault;


    public void setOrderCheckerId(Integer orderCheckerId){this.orderCheckerId = orderCheckerId;}

    public Integer getOrderCheckerId(){return this.orderCheckerId;}

    public void setFinancialCenterCode(String financialCenterCode){this.financialCenterCode = financialCenterCode;}

    public String getFinancialCenterCode(){return this.financialCenterCode;}

    public void setOrderCheckerLevelId(Integer orderCheckerLevelId){this.orderCheckerLevelId = orderCheckerLevelId;}

    public Integer getOrderCheckerLevelId(){return this.orderCheckerLevelId;}

    public void setOrderCheckerLevelName(String orderCheckerLevelName){this.orderCheckerLevelName = orderCheckerLevelName;}

    public String getOrderCheckerLevelName(){return this.orderCheckerLevelName;}

    public void setOrderCheckerLevelDesc(String orderCheckerLevelDesc){this.orderCheckerLevelDesc = orderCheckerLevelDesc;}

    public String getOrderCheckerLevelDesc(){return this.orderCheckerLevelDesc;}

    public void setOrderCheckerUserId(String orderCheckerUserId){this.orderCheckerUserId = orderCheckerUserId;}

    public String getOrderCheckerUserId(){return this.orderCheckerUserId;}

    public void setOrderCheckerUserName(String orderCheckerUserName){this.orderCheckerUserName = orderCheckerUserName;}

    public String getOrderCheckerUserName(){return this.orderCheckerUserName;}

    public void setOrderCheckerUserNo(String orderCheckerUserNo){this.orderCheckerUserNo = orderCheckerUserNo;}

    public String getOrderCheckerUserNo(){return this.orderCheckerUserNo;}

    public void setDictDefault(Integer dictDefault){this.dictDefault = dictDefault;}

    public Integer getDictDefault(){return this.dictDefault;}
    @Override
    public String toString() {
        return "OrderChecker{" +
                "orderCheckerId='" + orderCheckerId + '\'' +
                "financialCenterCode='" + financialCenterCode + '\'' +
                "orderCheckerLevelId='" + orderCheckerLevelId + '\'' +
                "orderCheckerLevelName='" + orderCheckerLevelName + '\'' +
                "orderCheckerLevelDesc='" + orderCheckerLevelDesc + '\'' +
                "orderCheckerUserId='" + orderCheckerUserId + '\'' +
                "orderCheckerUserName='" + orderCheckerUserName + '\'' +
                "orderCheckerUserNo='" + orderCheckerUserNo + '\'' +
                "dictDefault='" + dictDefault + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private OrderChecker set;

        private ConditionBuilder where;

        public UpdateBuilder set(OrderChecker set){
            this.set = set;
            return this;
        }

        public OrderChecker getSet(){
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

    public static class QueryBuilder extends OrderChecker{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> orderCheckerIdList;

        public List<Integer> getOrderCheckerIdList(){return this.orderCheckerIdList;}

        private Integer orderCheckerIdSt;

        private Integer orderCheckerIdEd;

        public Integer getOrderCheckerIdSt(){return this.orderCheckerIdSt;}

        public Integer getOrderCheckerIdEd(){return this.orderCheckerIdEd;}

        private List<String> financialCenterCodeList;

        public List<String> getFinancialCenterCodeList(){return this.financialCenterCodeList;}


        private List<String> fuzzyFinancialCenterCode;

        public List<String> getFuzzyFinancialCenterCode(){return this.fuzzyFinancialCenterCode;}

        private List<String> rightFuzzyFinancialCenterCode;

        public List<String> getRightFuzzyFinancialCenterCode(){return this.rightFuzzyFinancialCenterCode;}
        private List<Integer> orderCheckerLevelIdList;

        public List<Integer> getOrderCheckerLevelIdList(){return this.orderCheckerLevelIdList;}

        private Integer orderCheckerLevelIdSt;

        private Integer orderCheckerLevelIdEd;

        public Integer getOrderCheckerLevelIdSt(){return this.orderCheckerLevelIdSt;}

        public Integer getOrderCheckerLevelIdEd(){return this.orderCheckerLevelIdEd;}

        private List<String> orderCheckerLevelNameList;

        public List<String> getOrderCheckerLevelNameList(){return this.orderCheckerLevelNameList;}


        private List<String> fuzzyOrderCheckerLevelName;

        public List<String> getFuzzyOrderCheckerLevelName(){return this.fuzzyOrderCheckerLevelName;}

        private List<String> rightFuzzyOrderCheckerLevelName;

        public List<String> getRightFuzzyOrderCheckerLevelName(){return this.rightFuzzyOrderCheckerLevelName;}
        private List<String> orderCheckerLevelDescList;

        public List<String> getOrderCheckerLevelDescList(){return this.orderCheckerLevelDescList;}


        private List<String> fuzzyOrderCheckerLevelDesc;

        public List<String> getFuzzyOrderCheckerLevelDesc(){return this.fuzzyOrderCheckerLevelDesc;}

        private List<String> rightFuzzyOrderCheckerLevelDesc;

        public List<String> getRightFuzzyOrderCheckerLevelDesc(){return this.rightFuzzyOrderCheckerLevelDesc;}
        private List<String> orderCheckerUserIdList;

        public List<String> getOrderCheckerUserIdList(){return this.orderCheckerUserIdList;}


        private List<String> fuzzyOrderCheckerUserId;

        public List<String> getFuzzyOrderCheckerUserId(){return this.fuzzyOrderCheckerUserId;}

        private List<String> rightFuzzyOrderCheckerUserId;

        public List<String> getRightFuzzyOrderCheckerUserId(){return this.rightFuzzyOrderCheckerUserId;}
        private List<String> orderCheckerUserNameList;

        public List<String> getOrderCheckerUserNameList(){return this.orderCheckerUserNameList;}


        private List<String> fuzzyOrderCheckerUserName;

        public List<String> getFuzzyOrderCheckerUserName(){return this.fuzzyOrderCheckerUserName;}

        private List<String> rightFuzzyOrderCheckerUserName;

        public List<String> getRightFuzzyOrderCheckerUserName(){return this.rightFuzzyOrderCheckerUserName;}
        private List<String> orderCheckerUserNoList;

        public List<String> getOrderCheckerUserNoList(){return this.orderCheckerUserNoList;}


        private List<String> fuzzyOrderCheckerUserNo;

        public List<String> getFuzzyOrderCheckerUserNo(){return this.fuzzyOrderCheckerUserNo;}

        private List<String> rightFuzzyOrderCheckerUserNo;

        public List<String> getRightFuzzyOrderCheckerUserNo(){return this.rightFuzzyOrderCheckerUserNo;}
        private List<Integer> dictDefaultList;

        public List<Integer> getDictDefaultList(){return this.dictDefaultList;}

        private Integer dictDefaultSt;

        private Integer dictDefaultEd;

        public Integer getDictDefaultSt(){return this.dictDefaultSt;}

        public Integer getDictDefaultEd(){return this.dictDefaultEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder orderCheckerIdBetWeen(Integer orderCheckerIdSt,Integer orderCheckerIdEd){
            this.orderCheckerIdSt = orderCheckerIdSt;
            this.orderCheckerIdEd = orderCheckerIdEd;
            return this;
        }

        public QueryBuilder orderCheckerIdGreaterEqThan(Integer orderCheckerIdSt){
            this.orderCheckerIdSt = orderCheckerIdSt;
            return this;
        }
        public QueryBuilder orderCheckerIdLessEqThan(Integer orderCheckerIdEd){
            this.orderCheckerIdEd = orderCheckerIdEd;
            return this;
        }


        public QueryBuilder orderCheckerId(Integer orderCheckerId){
            setOrderCheckerId(orderCheckerId);
            return this;
        }

        public QueryBuilder orderCheckerIdList(Integer ... orderCheckerId){
            this.orderCheckerIdList = solveNullList(orderCheckerId);
            return this;
        }

        public QueryBuilder orderCheckerIdList(List<Integer> orderCheckerId){
            this.orderCheckerIdList = orderCheckerId;
            return this;
        }

        public QueryBuilder fetchOrderCheckerId(){
            setFetchFields("fetchFields","orderCheckerId");
            return this;
        }

        public QueryBuilder excludeOrderCheckerId(){
            setFetchFields("excludeFields","orderCheckerId");
            return this;
        }

        public QueryBuilder fuzzyFinancialCenterCode (List<String> fuzzyFinancialCenterCode){
            this.fuzzyFinancialCenterCode = fuzzyFinancialCenterCode;
            return this;
        }

        public QueryBuilder fuzzyFinancialCenterCode (String ... fuzzyFinancialCenterCode){
            this.fuzzyFinancialCenterCode = solveNullList(fuzzyFinancialCenterCode);
            return this;
        }

        public QueryBuilder rightFuzzyFinancialCenterCode (List<String> rightFuzzyFinancialCenterCode){
            this.rightFuzzyFinancialCenterCode = rightFuzzyFinancialCenterCode;
            return this;
        }

        public QueryBuilder rightFuzzyFinancialCenterCode (String ... rightFuzzyFinancialCenterCode){
            this.rightFuzzyFinancialCenterCode = solveNullList(rightFuzzyFinancialCenterCode);
            return this;
        }

        public QueryBuilder financialCenterCode(String financialCenterCode){
            setFinancialCenterCode(financialCenterCode);
            return this;
        }

        public QueryBuilder financialCenterCodeList(String ... financialCenterCode){
            this.financialCenterCodeList = solveNullList(financialCenterCode);
            return this;
        }

        public QueryBuilder financialCenterCodeList(List<String> financialCenterCode){
            this.financialCenterCodeList = financialCenterCode;
            return this;
        }

        public QueryBuilder fetchFinancialCenterCode(){
            setFetchFields("fetchFields","financialCenterCode");
            return this;
        }

        public QueryBuilder excludeFinancialCenterCode(){
            setFetchFields("excludeFields","financialCenterCode");
            return this;
        }

        public QueryBuilder orderCheckerLevelIdBetWeen(Integer orderCheckerLevelIdSt,Integer orderCheckerLevelIdEd){
            this.orderCheckerLevelIdSt = orderCheckerLevelIdSt;
            this.orderCheckerLevelIdEd = orderCheckerLevelIdEd;
            return this;
        }

        public QueryBuilder orderCheckerLevelIdGreaterEqThan(Integer orderCheckerLevelIdSt){
            this.orderCheckerLevelIdSt = orderCheckerLevelIdSt;
            return this;
        }
        public QueryBuilder orderCheckerLevelIdLessEqThan(Integer orderCheckerLevelIdEd){
            this.orderCheckerLevelIdEd = orderCheckerLevelIdEd;
            return this;
        }


        public QueryBuilder orderCheckerLevelId(Integer orderCheckerLevelId){
            setOrderCheckerLevelId(orderCheckerLevelId);
            return this;
        }

        public QueryBuilder orderCheckerLevelIdList(Integer ... orderCheckerLevelId){
            this.orderCheckerLevelIdList = solveNullList(orderCheckerLevelId);
            return this;
        }

        public QueryBuilder orderCheckerLevelIdList(List<Integer> orderCheckerLevelId){
            this.orderCheckerLevelIdList = orderCheckerLevelId;
            return this;
        }

        public QueryBuilder fetchOrderCheckerLevelId(){
            setFetchFields("fetchFields","orderCheckerLevelId");
            return this;
        }

        public QueryBuilder excludeOrderCheckerLevelId(){
            setFetchFields("excludeFields","orderCheckerLevelId");
            return this;
        }

        public QueryBuilder fuzzyOrderCheckerLevelName (List<String> fuzzyOrderCheckerLevelName){
            this.fuzzyOrderCheckerLevelName = fuzzyOrderCheckerLevelName;
            return this;
        }

        public QueryBuilder fuzzyOrderCheckerLevelName (String ... fuzzyOrderCheckerLevelName){
            this.fuzzyOrderCheckerLevelName = solveNullList(fuzzyOrderCheckerLevelName);
            return this;
        }

        public QueryBuilder rightFuzzyOrderCheckerLevelName (List<String> rightFuzzyOrderCheckerLevelName){
            this.rightFuzzyOrderCheckerLevelName = rightFuzzyOrderCheckerLevelName;
            return this;
        }

        public QueryBuilder rightFuzzyOrderCheckerLevelName (String ... rightFuzzyOrderCheckerLevelName){
            this.rightFuzzyOrderCheckerLevelName = solveNullList(rightFuzzyOrderCheckerLevelName);
            return this;
        }

        public QueryBuilder orderCheckerLevelName(String orderCheckerLevelName){
            setOrderCheckerLevelName(orderCheckerLevelName);
            return this;
        }

        public QueryBuilder orderCheckerLevelNameList(String ... orderCheckerLevelName){
            this.orderCheckerLevelNameList = solveNullList(orderCheckerLevelName);
            return this;
        }

        public QueryBuilder orderCheckerLevelNameList(List<String> orderCheckerLevelName){
            this.orderCheckerLevelNameList = orderCheckerLevelName;
            return this;
        }

        public QueryBuilder fetchOrderCheckerLevelName(){
            setFetchFields("fetchFields","orderCheckerLevelName");
            return this;
        }

        public QueryBuilder excludeOrderCheckerLevelName(){
            setFetchFields("excludeFields","orderCheckerLevelName");
            return this;
        }

        public QueryBuilder fuzzyOrderCheckerLevelDesc (List<String> fuzzyOrderCheckerLevelDesc){
            this.fuzzyOrderCheckerLevelDesc = fuzzyOrderCheckerLevelDesc;
            return this;
        }

        public QueryBuilder fuzzyOrderCheckerLevelDesc (String ... fuzzyOrderCheckerLevelDesc){
            this.fuzzyOrderCheckerLevelDesc = solveNullList(fuzzyOrderCheckerLevelDesc);
            return this;
        }

        public QueryBuilder rightFuzzyOrderCheckerLevelDesc (List<String> rightFuzzyOrderCheckerLevelDesc){
            this.rightFuzzyOrderCheckerLevelDesc = rightFuzzyOrderCheckerLevelDesc;
            return this;
        }

        public QueryBuilder rightFuzzyOrderCheckerLevelDesc (String ... rightFuzzyOrderCheckerLevelDesc){
            this.rightFuzzyOrderCheckerLevelDesc = solveNullList(rightFuzzyOrderCheckerLevelDesc);
            return this;
        }

        public QueryBuilder orderCheckerLevelDesc(String orderCheckerLevelDesc){
            setOrderCheckerLevelDesc(orderCheckerLevelDesc);
            return this;
        }

        public QueryBuilder orderCheckerLevelDescList(String ... orderCheckerLevelDesc){
            this.orderCheckerLevelDescList = solveNullList(orderCheckerLevelDesc);
            return this;
        }

        public QueryBuilder orderCheckerLevelDescList(List<String> orderCheckerLevelDesc){
            this.orderCheckerLevelDescList = orderCheckerLevelDesc;
            return this;
        }

        public QueryBuilder fetchOrderCheckerLevelDesc(){
            setFetchFields("fetchFields","orderCheckerLevelDesc");
            return this;
        }

        public QueryBuilder excludeOrderCheckerLevelDesc(){
            setFetchFields("excludeFields","orderCheckerLevelDesc");
            return this;
        }

        public QueryBuilder fuzzyOrderCheckerUserId (List<String> fuzzyOrderCheckerUserId){
            this.fuzzyOrderCheckerUserId = fuzzyOrderCheckerUserId;
            return this;
        }

        public QueryBuilder fuzzyOrderCheckerUserId (String ... fuzzyOrderCheckerUserId){
            this.fuzzyOrderCheckerUserId = solveNullList(fuzzyOrderCheckerUserId);
            return this;
        }

        public QueryBuilder rightFuzzyOrderCheckerUserId (List<String> rightFuzzyOrderCheckerUserId){
            this.rightFuzzyOrderCheckerUserId = rightFuzzyOrderCheckerUserId;
            return this;
        }

        public QueryBuilder rightFuzzyOrderCheckerUserId (String ... rightFuzzyOrderCheckerUserId){
            this.rightFuzzyOrderCheckerUserId = solveNullList(rightFuzzyOrderCheckerUserId);
            return this;
        }

        public QueryBuilder orderCheckerUserId(String orderCheckerUserId){
            setOrderCheckerUserId(orderCheckerUserId);
            return this;
        }

        public QueryBuilder orderCheckerUserIdList(String ... orderCheckerUserId){
            this.orderCheckerUserIdList = solveNullList(orderCheckerUserId);
            return this;
        }

        public QueryBuilder orderCheckerUserIdList(List<String> orderCheckerUserId){
            this.orderCheckerUserIdList = orderCheckerUserId;
            return this;
        }

        public QueryBuilder fetchOrderCheckerUserId(){
            setFetchFields("fetchFields","orderCheckerUserId");
            return this;
        }

        public QueryBuilder excludeOrderCheckerUserId(){
            setFetchFields("excludeFields","orderCheckerUserId");
            return this;
        }

        public QueryBuilder fuzzyOrderCheckerUserName (List<String> fuzzyOrderCheckerUserName){
            this.fuzzyOrderCheckerUserName = fuzzyOrderCheckerUserName;
            return this;
        }

        public QueryBuilder fuzzyOrderCheckerUserName (String ... fuzzyOrderCheckerUserName){
            this.fuzzyOrderCheckerUserName = solveNullList(fuzzyOrderCheckerUserName);
            return this;
        }

        public QueryBuilder rightFuzzyOrderCheckerUserName (List<String> rightFuzzyOrderCheckerUserName){
            this.rightFuzzyOrderCheckerUserName = rightFuzzyOrderCheckerUserName;
            return this;
        }

        public QueryBuilder rightFuzzyOrderCheckerUserName (String ... rightFuzzyOrderCheckerUserName){
            this.rightFuzzyOrderCheckerUserName = solveNullList(rightFuzzyOrderCheckerUserName);
            return this;
        }

        public QueryBuilder orderCheckerUserName(String orderCheckerUserName){
            setOrderCheckerUserName(orderCheckerUserName);
            return this;
        }

        public QueryBuilder orderCheckerUserNameList(String ... orderCheckerUserName){
            this.orderCheckerUserNameList = solveNullList(orderCheckerUserName);
            return this;
        }

        public QueryBuilder orderCheckerUserNameList(List<String> orderCheckerUserName){
            this.orderCheckerUserNameList = orderCheckerUserName;
            return this;
        }

        public QueryBuilder fetchOrderCheckerUserName(){
            setFetchFields("fetchFields","orderCheckerUserName");
            return this;
        }

        public QueryBuilder excludeOrderCheckerUserName(){
            setFetchFields("excludeFields","orderCheckerUserName");
            return this;
        }

        public QueryBuilder fuzzyOrderCheckerUserNo (List<String> fuzzyOrderCheckerUserNo){
            this.fuzzyOrderCheckerUserNo = fuzzyOrderCheckerUserNo;
            return this;
        }

        public QueryBuilder fuzzyOrderCheckerUserNo (String ... fuzzyOrderCheckerUserNo){
            this.fuzzyOrderCheckerUserNo = solveNullList(fuzzyOrderCheckerUserNo);
            return this;
        }

        public QueryBuilder rightFuzzyOrderCheckerUserNo (List<String> rightFuzzyOrderCheckerUserNo){
            this.rightFuzzyOrderCheckerUserNo = rightFuzzyOrderCheckerUserNo;
            return this;
        }

        public QueryBuilder rightFuzzyOrderCheckerUserNo (String ... rightFuzzyOrderCheckerUserNo){
            this.rightFuzzyOrderCheckerUserNo = solveNullList(rightFuzzyOrderCheckerUserNo);
            return this;
        }

        public QueryBuilder orderCheckerUserNo(String orderCheckerUserNo){
            setOrderCheckerUserNo(orderCheckerUserNo);
            return this;
        }

        public QueryBuilder orderCheckerUserNoList(String ... orderCheckerUserNo){
            this.orderCheckerUserNoList = solveNullList(orderCheckerUserNo);
            return this;
        }

        public QueryBuilder orderCheckerUserNoList(List<String> orderCheckerUserNo){
            this.orderCheckerUserNoList = orderCheckerUserNo;
            return this;
        }

        public QueryBuilder fetchOrderCheckerUserNo(){
            setFetchFields("fetchFields","orderCheckerUserNo");
            return this;
        }

        public QueryBuilder excludeOrderCheckerUserNo(){
            setFetchFields("excludeFields","orderCheckerUserNo");
            return this;
        }

        public QueryBuilder dictDefaultBetWeen(Integer dictDefaultSt,Integer dictDefaultEd){
            this.dictDefaultSt = dictDefaultSt;
            this.dictDefaultEd = dictDefaultEd;
            return this;
        }

        public QueryBuilder dictDefaultGreaterEqThan(Integer dictDefaultSt){
            this.dictDefaultSt = dictDefaultSt;
            return this;
        }
        public QueryBuilder dictDefaultLessEqThan(Integer dictDefaultEd){
            this.dictDefaultEd = dictDefaultEd;
            return this;
        }


        public QueryBuilder dictDefault(Integer dictDefault){
            setDictDefault(dictDefault);
            return this;
        }

        public QueryBuilder dictDefaultList(Integer ... dictDefault){
            this.dictDefaultList = solveNullList(dictDefault);
            return this;
        }

        public QueryBuilder dictDefaultList(List<Integer> dictDefault){
            this.dictDefaultList = dictDefault;
            return this;
        }

        public QueryBuilder fetchDictDefault(){
            setFetchFields("fetchFields","dictDefault");
            return this;
        }

        public QueryBuilder excludeDictDefault(){
            setFetchFields("excludeFields","dictDefault");
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

        public OrderChecker build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> orderCheckerIdList;

        public List<Integer> getOrderCheckerIdList(){return this.orderCheckerIdList;}

        private Integer orderCheckerIdSt;

        private Integer orderCheckerIdEd;

        public Integer getOrderCheckerIdSt(){return this.orderCheckerIdSt;}

        public Integer getOrderCheckerIdEd(){return this.orderCheckerIdEd;}

        private List<String> financialCenterCodeList;

        public List<String> getFinancialCenterCodeList(){return this.financialCenterCodeList;}


        private List<String> fuzzyFinancialCenterCode;

        public List<String> getFuzzyFinancialCenterCode(){return this.fuzzyFinancialCenterCode;}

        private List<String> rightFuzzyFinancialCenterCode;

        public List<String> getRightFuzzyFinancialCenterCode(){return this.rightFuzzyFinancialCenterCode;}
        private List<Integer> orderCheckerLevelIdList;

        public List<Integer> getOrderCheckerLevelIdList(){return this.orderCheckerLevelIdList;}

        private Integer orderCheckerLevelIdSt;

        private Integer orderCheckerLevelIdEd;

        public Integer getOrderCheckerLevelIdSt(){return this.orderCheckerLevelIdSt;}

        public Integer getOrderCheckerLevelIdEd(){return this.orderCheckerLevelIdEd;}

        private List<String> orderCheckerLevelNameList;

        public List<String> getOrderCheckerLevelNameList(){return this.orderCheckerLevelNameList;}


        private List<String> fuzzyOrderCheckerLevelName;

        public List<String> getFuzzyOrderCheckerLevelName(){return this.fuzzyOrderCheckerLevelName;}

        private List<String> rightFuzzyOrderCheckerLevelName;

        public List<String> getRightFuzzyOrderCheckerLevelName(){return this.rightFuzzyOrderCheckerLevelName;}
        private List<String> orderCheckerLevelDescList;

        public List<String> getOrderCheckerLevelDescList(){return this.orderCheckerLevelDescList;}


        private List<String> fuzzyOrderCheckerLevelDesc;

        public List<String> getFuzzyOrderCheckerLevelDesc(){return this.fuzzyOrderCheckerLevelDesc;}

        private List<String> rightFuzzyOrderCheckerLevelDesc;

        public List<String> getRightFuzzyOrderCheckerLevelDesc(){return this.rightFuzzyOrderCheckerLevelDesc;}
        private List<String> orderCheckerUserIdList;

        public List<String> getOrderCheckerUserIdList(){return this.orderCheckerUserIdList;}


        private List<String> fuzzyOrderCheckerUserId;

        public List<String> getFuzzyOrderCheckerUserId(){return this.fuzzyOrderCheckerUserId;}

        private List<String> rightFuzzyOrderCheckerUserId;

        public List<String> getRightFuzzyOrderCheckerUserId(){return this.rightFuzzyOrderCheckerUserId;}
        private List<String> orderCheckerUserNameList;

        public List<String> getOrderCheckerUserNameList(){return this.orderCheckerUserNameList;}


        private List<String> fuzzyOrderCheckerUserName;

        public List<String> getFuzzyOrderCheckerUserName(){return this.fuzzyOrderCheckerUserName;}

        private List<String> rightFuzzyOrderCheckerUserName;

        public List<String> getRightFuzzyOrderCheckerUserName(){return this.rightFuzzyOrderCheckerUserName;}
        private List<String> orderCheckerUserNoList;

        public List<String> getOrderCheckerUserNoList(){return this.orderCheckerUserNoList;}


        private List<String> fuzzyOrderCheckerUserNo;

        public List<String> getFuzzyOrderCheckerUserNo(){return this.fuzzyOrderCheckerUserNo;}

        private List<String> rightFuzzyOrderCheckerUserNo;

        public List<String> getRightFuzzyOrderCheckerUserNo(){return this.rightFuzzyOrderCheckerUserNo;}
        private List<Integer> dictDefaultList;

        public List<Integer> getDictDefaultList(){return this.dictDefaultList;}

        private Integer dictDefaultSt;

        private Integer dictDefaultEd;

        public Integer getDictDefaultSt(){return this.dictDefaultSt;}

        public Integer getDictDefaultEd(){return this.dictDefaultEd;}


        public ConditionBuilder orderCheckerIdBetWeen(Integer orderCheckerIdSt,Integer orderCheckerIdEd){
            this.orderCheckerIdSt = orderCheckerIdSt;
            this.orderCheckerIdEd = orderCheckerIdEd;
            return this;
        }

        public ConditionBuilder orderCheckerIdGreaterEqThan(Integer orderCheckerIdSt){
            this.orderCheckerIdSt = orderCheckerIdSt;
            return this;
        }
        public ConditionBuilder orderCheckerIdLessEqThan(Integer orderCheckerIdEd){
            this.orderCheckerIdEd = orderCheckerIdEd;
            return this;
        }


        public ConditionBuilder orderCheckerIdList(Integer ... orderCheckerId){
            this.orderCheckerIdList = solveNullList(orderCheckerId);
            return this;
        }

        public ConditionBuilder orderCheckerIdList(List<Integer> orderCheckerId){
            this.orderCheckerIdList = orderCheckerId;
            return this;
        }

        public ConditionBuilder fuzzyFinancialCenterCode (List<String> fuzzyFinancialCenterCode){
            this.fuzzyFinancialCenterCode = fuzzyFinancialCenterCode;
            return this;
        }

        public ConditionBuilder fuzzyFinancialCenterCode (String ... fuzzyFinancialCenterCode){
            this.fuzzyFinancialCenterCode = solveNullList(fuzzyFinancialCenterCode);
            return this;
        }

        public ConditionBuilder rightFuzzyFinancialCenterCode (List<String> rightFuzzyFinancialCenterCode){
            this.rightFuzzyFinancialCenterCode = rightFuzzyFinancialCenterCode;
            return this;
        }

        public ConditionBuilder rightFuzzyFinancialCenterCode (String ... rightFuzzyFinancialCenterCode){
            this.rightFuzzyFinancialCenterCode = solveNullList(rightFuzzyFinancialCenterCode);
            return this;
        }

        public ConditionBuilder financialCenterCodeList(String ... financialCenterCode){
            this.financialCenterCodeList = solveNullList(financialCenterCode);
            return this;
        }

        public ConditionBuilder financialCenterCodeList(List<String> financialCenterCode){
            this.financialCenterCodeList = financialCenterCode;
            return this;
        }

        public ConditionBuilder orderCheckerLevelIdBetWeen(Integer orderCheckerLevelIdSt,Integer orderCheckerLevelIdEd){
            this.orderCheckerLevelIdSt = orderCheckerLevelIdSt;
            this.orderCheckerLevelIdEd = orderCheckerLevelIdEd;
            return this;
        }

        public ConditionBuilder orderCheckerLevelIdGreaterEqThan(Integer orderCheckerLevelIdSt){
            this.orderCheckerLevelIdSt = orderCheckerLevelIdSt;
            return this;
        }
        public ConditionBuilder orderCheckerLevelIdLessEqThan(Integer orderCheckerLevelIdEd){
            this.orderCheckerLevelIdEd = orderCheckerLevelIdEd;
            return this;
        }


        public ConditionBuilder orderCheckerLevelIdList(Integer ... orderCheckerLevelId){
            this.orderCheckerLevelIdList = solveNullList(orderCheckerLevelId);
            return this;
        }

        public ConditionBuilder orderCheckerLevelIdList(List<Integer> orderCheckerLevelId){
            this.orderCheckerLevelIdList = orderCheckerLevelId;
            return this;
        }

        public ConditionBuilder fuzzyOrderCheckerLevelName (List<String> fuzzyOrderCheckerLevelName){
            this.fuzzyOrderCheckerLevelName = fuzzyOrderCheckerLevelName;
            return this;
        }

        public ConditionBuilder fuzzyOrderCheckerLevelName (String ... fuzzyOrderCheckerLevelName){
            this.fuzzyOrderCheckerLevelName = solveNullList(fuzzyOrderCheckerLevelName);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderCheckerLevelName (List<String> rightFuzzyOrderCheckerLevelName){
            this.rightFuzzyOrderCheckerLevelName = rightFuzzyOrderCheckerLevelName;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderCheckerLevelName (String ... rightFuzzyOrderCheckerLevelName){
            this.rightFuzzyOrderCheckerLevelName = solveNullList(rightFuzzyOrderCheckerLevelName);
            return this;
        }

        public ConditionBuilder orderCheckerLevelNameList(String ... orderCheckerLevelName){
            this.orderCheckerLevelNameList = solveNullList(orderCheckerLevelName);
            return this;
        }

        public ConditionBuilder orderCheckerLevelNameList(List<String> orderCheckerLevelName){
            this.orderCheckerLevelNameList = orderCheckerLevelName;
            return this;
        }

        public ConditionBuilder fuzzyOrderCheckerLevelDesc (List<String> fuzzyOrderCheckerLevelDesc){
            this.fuzzyOrderCheckerLevelDesc = fuzzyOrderCheckerLevelDesc;
            return this;
        }

        public ConditionBuilder fuzzyOrderCheckerLevelDesc (String ... fuzzyOrderCheckerLevelDesc){
            this.fuzzyOrderCheckerLevelDesc = solveNullList(fuzzyOrderCheckerLevelDesc);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderCheckerLevelDesc (List<String> rightFuzzyOrderCheckerLevelDesc){
            this.rightFuzzyOrderCheckerLevelDesc = rightFuzzyOrderCheckerLevelDesc;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderCheckerLevelDesc (String ... rightFuzzyOrderCheckerLevelDesc){
            this.rightFuzzyOrderCheckerLevelDesc = solveNullList(rightFuzzyOrderCheckerLevelDesc);
            return this;
        }

        public ConditionBuilder orderCheckerLevelDescList(String ... orderCheckerLevelDesc){
            this.orderCheckerLevelDescList = solveNullList(orderCheckerLevelDesc);
            return this;
        }

        public ConditionBuilder orderCheckerLevelDescList(List<String> orderCheckerLevelDesc){
            this.orderCheckerLevelDescList = orderCheckerLevelDesc;
            return this;
        }

        public ConditionBuilder fuzzyOrderCheckerUserId (List<String> fuzzyOrderCheckerUserId){
            this.fuzzyOrderCheckerUserId = fuzzyOrderCheckerUserId;
            return this;
        }

        public ConditionBuilder fuzzyOrderCheckerUserId (String ... fuzzyOrderCheckerUserId){
            this.fuzzyOrderCheckerUserId = solveNullList(fuzzyOrderCheckerUserId);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderCheckerUserId (List<String> rightFuzzyOrderCheckerUserId){
            this.rightFuzzyOrderCheckerUserId = rightFuzzyOrderCheckerUserId;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderCheckerUserId (String ... rightFuzzyOrderCheckerUserId){
            this.rightFuzzyOrderCheckerUserId = solveNullList(rightFuzzyOrderCheckerUserId);
            return this;
        }

        public ConditionBuilder orderCheckerUserIdList(String ... orderCheckerUserId){
            this.orderCheckerUserIdList = solveNullList(orderCheckerUserId);
            return this;
        }

        public ConditionBuilder orderCheckerUserIdList(List<String> orderCheckerUserId){
            this.orderCheckerUserIdList = orderCheckerUserId;
            return this;
        }

        public ConditionBuilder fuzzyOrderCheckerUserName (List<String> fuzzyOrderCheckerUserName){
            this.fuzzyOrderCheckerUserName = fuzzyOrderCheckerUserName;
            return this;
        }

        public ConditionBuilder fuzzyOrderCheckerUserName (String ... fuzzyOrderCheckerUserName){
            this.fuzzyOrderCheckerUserName = solveNullList(fuzzyOrderCheckerUserName);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderCheckerUserName (List<String> rightFuzzyOrderCheckerUserName){
            this.rightFuzzyOrderCheckerUserName = rightFuzzyOrderCheckerUserName;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderCheckerUserName (String ... rightFuzzyOrderCheckerUserName){
            this.rightFuzzyOrderCheckerUserName = solveNullList(rightFuzzyOrderCheckerUserName);
            return this;
        }

        public ConditionBuilder orderCheckerUserNameList(String ... orderCheckerUserName){
            this.orderCheckerUserNameList = solveNullList(orderCheckerUserName);
            return this;
        }

        public ConditionBuilder orderCheckerUserNameList(List<String> orderCheckerUserName){
            this.orderCheckerUserNameList = orderCheckerUserName;
            return this;
        }

        public ConditionBuilder fuzzyOrderCheckerUserNo (List<String> fuzzyOrderCheckerUserNo){
            this.fuzzyOrderCheckerUserNo = fuzzyOrderCheckerUserNo;
            return this;
        }

        public ConditionBuilder fuzzyOrderCheckerUserNo (String ... fuzzyOrderCheckerUserNo){
            this.fuzzyOrderCheckerUserNo = solveNullList(fuzzyOrderCheckerUserNo);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderCheckerUserNo (List<String> rightFuzzyOrderCheckerUserNo){
            this.rightFuzzyOrderCheckerUserNo = rightFuzzyOrderCheckerUserNo;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderCheckerUserNo (String ... rightFuzzyOrderCheckerUserNo){
            this.rightFuzzyOrderCheckerUserNo = solveNullList(rightFuzzyOrderCheckerUserNo);
            return this;
        }

        public ConditionBuilder orderCheckerUserNoList(String ... orderCheckerUserNo){
            this.orderCheckerUserNoList = solveNullList(orderCheckerUserNo);
            return this;
        }

        public ConditionBuilder orderCheckerUserNoList(List<String> orderCheckerUserNo){
            this.orderCheckerUserNoList = orderCheckerUserNo;
            return this;
        }

        public ConditionBuilder dictDefaultBetWeen(Integer dictDefaultSt,Integer dictDefaultEd){
            this.dictDefaultSt = dictDefaultSt;
            this.dictDefaultEd = dictDefaultEd;
            return this;
        }

        public ConditionBuilder dictDefaultGreaterEqThan(Integer dictDefaultSt){
            this.dictDefaultSt = dictDefaultSt;
            return this;
        }
        public ConditionBuilder dictDefaultLessEqThan(Integer dictDefaultEd){
            this.dictDefaultEd = dictDefaultEd;
            return this;
        }


        public ConditionBuilder dictDefaultList(Integer ... dictDefault){
            this.dictDefaultList = solveNullList(dictDefault);
            return this;
        }

        public ConditionBuilder dictDefaultList(List<Integer> dictDefault){
            this.dictDefaultList = dictDefault;
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

        private OrderChecker obj;

        public Builder(){
            this.obj = new OrderChecker();
        }

        public Builder orderCheckerId(Integer orderCheckerId){
            this.obj.setOrderCheckerId(orderCheckerId);
            return this;
        }
        public Builder financialCenterCode(String financialCenterCode){
            this.obj.setFinancialCenterCode(financialCenterCode);
            return this;
        }
        public Builder orderCheckerLevelId(Integer orderCheckerLevelId){
            this.obj.setOrderCheckerLevelId(orderCheckerLevelId);
            return this;
        }
        public Builder orderCheckerLevelName(String orderCheckerLevelName){
            this.obj.setOrderCheckerLevelName(orderCheckerLevelName);
            return this;
        }
        public Builder orderCheckerLevelDesc(String orderCheckerLevelDesc){
            this.obj.setOrderCheckerLevelDesc(orderCheckerLevelDesc);
            return this;
        }
        public Builder orderCheckerUserId(String orderCheckerUserId){
            this.obj.setOrderCheckerUserId(orderCheckerUserId);
            return this;
        }
        public Builder orderCheckerUserName(String orderCheckerUserName){
            this.obj.setOrderCheckerUserName(orderCheckerUserName);
            return this;
        }
        public Builder orderCheckerUserNo(String orderCheckerUserNo){
            this.obj.setOrderCheckerUserNo(orderCheckerUserNo);
            return this;
        }
        public Builder dictDefault(Integer dictDefault){
            this.obj.setDictDefault(dictDefault);
            return this;
        }
        public OrderChecker build(){return obj;}
    }

}
