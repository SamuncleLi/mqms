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
public class FinancialCenter implements Serializable {

    private static final long serialVersionUID = 1565058587417L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer financialCenterId;

    /**
    * 
    * isNullAble:1
    */
    private String financialCenterCode;

    /**
    * 
    * isNullAble:1
    */
    private String financialCenterName;


    public void setFinancialCenterId(Integer financialCenterId){this.financialCenterId = financialCenterId;}

    public Integer getFinancialCenterId(){return this.financialCenterId;}

    public void setFinancialCenterCode(String financialCenterCode){this.financialCenterCode = financialCenterCode;}

    public String getFinancialCenterCode(){return this.financialCenterCode;}

    public void setFinancialCenterName(String financialCenterName){this.financialCenterName = financialCenterName;}

    public String getFinancialCenterName(){return this.financialCenterName;}
    @Override
    public String toString() {
        return "FinancialCenter{" +
                "financialCenterId='" + financialCenterId + '\'' +
                "financialCenterCode='" + financialCenterCode + '\'' +
                "financialCenterName='" + financialCenterName + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private FinancialCenter set;

        private ConditionBuilder where;

        public UpdateBuilder set(FinancialCenter set){
            this.set = set;
            return this;
        }

        public FinancialCenter getSet(){
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

    public static class QueryBuilder extends FinancialCenter{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> financialCenterIdList;

        public List<Integer> getFinancialCenterIdList(){return this.financialCenterIdList;}

        private Integer financialCenterIdSt;

        private Integer financialCenterIdEd;

        public Integer getFinancialCenterIdSt(){return this.financialCenterIdSt;}

        public Integer getFinancialCenterIdEd(){return this.financialCenterIdEd;}

        private List<String> financialCenterCodeList;

        public List<String> getFinancialCenterCodeList(){return this.financialCenterCodeList;}


        private List<String> fuzzyFinancialCenterCode;

        public List<String> getFuzzyFinancialCenterCode(){return this.fuzzyFinancialCenterCode;}

        private List<String> rightFuzzyFinancialCenterCode;

        public List<String> getRightFuzzyFinancialCenterCode(){return this.rightFuzzyFinancialCenterCode;}
        private List<String> financialCenterNameList;

        public List<String> getFinancialCenterNameList(){return this.financialCenterNameList;}


        private List<String> fuzzyFinancialCenterName;

        public List<String> getFuzzyFinancialCenterName(){return this.fuzzyFinancialCenterName;}

        private List<String> rightFuzzyFinancialCenterName;

        public List<String> getRightFuzzyFinancialCenterName(){return this.rightFuzzyFinancialCenterName;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder financialCenterIdBetWeen(Integer financialCenterIdSt,Integer financialCenterIdEd){
            this.financialCenterIdSt = financialCenterIdSt;
            this.financialCenterIdEd = financialCenterIdEd;
            return this;
        }

        public QueryBuilder financialCenterIdGreaterEqThan(Integer financialCenterIdSt){
            this.financialCenterIdSt = financialCenterIdSt;
            return this;
        }
        public QueryBuilder financialCenterIdLessEqThan(Integer financialCenterIdEd){
            this.financialCenterIdEd = financialCenterIdEd;
            return this;
        }


        public QueryBuilder financialCenterId(Integer financialCenterId){
            setFinancialCenterId(financialCenterId);
            return this;
        }

        public QueryBuilder financialCenterIdList(Integer ... financialCenterId){
            this.financialCenterIdList = solveNullList(financialCenterId);
            return this;
        }

        public QueryBuilder financialCenterIdList(List<Integer> financialCenterId){
            this.financialCenterIdList = financialCenterId;
            return this;
        }

        public QueryBuilder fetchFinancialCenterId(){
            setFetchFields("fetchFields","financialCenterId");
            return this;
        }

        public QueryBuilder excludeFinancialCenterId(){
            setFetchFields("excludeFields","financialCenterId");
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

        public QueryBuilder fuzzyFinancialCenterName (List<String> fuzzyFinancialCenterName){
            this.fuzzyFinancialCenterName = fuzzyFinancialCenterName;
            return this;
        }

        public QueryBuilder fuzzyFinancialCenterName (String ... fuzzyFinancialCenterName){
            this.fuzzyFinancialCenterName = solveNullList(fuzzyFinancialCenterName);
            return this;
        }

        public QueryBuilder rightFuzzyFinancialCenterName (List<String> rightFuzzyFinancialCenterName){
            this.rightFuzzyFinancialCenterName = rightFuzzyFinancialCenterName;
            return this;
        }

        public QueryBuilder rightFuzzyFinancialCenterName (String ... rightFuzzyFinancialCenterName){
            this.rightFuzzyFinancialCenterName = solveNullList(rightFuzzyFinancialCenterName);
            return this;
        }

        public QueryBuilder financialCenterName(String financialCenterName){
            setFinancialCenterName(financialCenterName);
            return this;
        }

        public QueryBuilder financialCenterNameList(String ... financialCenterName){
            this.financialCenterNameList = solveNullList(financialCenterName);
            return this;
        }

        public QueryBuilder financialCenterNameList(List<String> financialCenterName){
            this.financialCenterNameList = financialCenterName;
            return this;
        }

        public QueryBuilder fetchFinancialCenterName(){
            setFetchFields("fetchFields","financialCenterName");
            return this;
        }

        public QueryBuilder excludeFinancialCenterName(){
            setFetchFields("excludeFields","financialCenterName");
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

        public FinancialCenter build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> financialCenterIdList;

        public List<Integer> getFinancialCenterIdList(){return this.financialCenterIdList;}

        private Integer financialCenterIdSt;

        private Integer financialCenterIdEd;

        public Integer getFinancialCenterIdSt(){return this.financialCenterIdSt;}

        public Integer getFinancialCenterIdEd(){return this.financialCenterIdEd;}

        private List<String> financialCenterCodeList;

        public List<String> getFinancialCenterCodeList(){return this.financialCenterCodeList;}


        private List<String> fuzzyFinancialCenterCode;

        public List<String> getFuzzyFinancialCenterCode(){return this.fuzzyFinancialCenterCode;}

        private List<String> rightFuzzyFinancialCenterCode;

        public List<String> getRightFuzzyFinancialCenterCode(){return this.rightFuzzyFinancialCenterCode;}
        private List<String> financialCenterNameList;

        public List<String> getFinancialCenterNameList(){return this.financialCenterNameList;}


        private List<String> fuzzyFinancialCenterName;

        public List<String> getFuzzyFinancialCenterName(){return this.fuzzyFinancialCenterName;}

        private List<String> rightFuzzyFinancialCenterName;

        public List<String> getRightFuzzyFinancialCenterName(){return this.rightFuzzyFinancialCenterName;}

        public ConditionBuilder financialCenterIdBetWeen(Integer financialCenterIdSt,Integer financialCenterIdEd){
            this.financialCenterIdSt = financialCenterIdSt;
            this.financialCenterIdEd = financialCenterIdEd;
            return this;
        }

        public ConditionBuilder financialCenterIdGreaterEqThan(Integer financialCenterIdSt){
            this.financialCenterIdSt = financialCenterIdSt;
            return this;
        }
        public ConditionBuilder financialCenterIdLessEqThan(Integer financialCenterIdEd){
            this.financialCenterIdEd = financialCenterIdEd;
            return this;
        }


        public ConditionBuilder financialCenterIdList(Integer ... financialCenterId){
            this.financialCenterIdList = solveNullList(financialCenterId);
            return this;
        }

        public ConditionBuilder financialCenterIdList(List<Integer> financialCenterId){
            this.financialCenterIdList = financialCenterId;
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

        public ConditionBuilder fuzzyFinancialCenterName (List<String> fuzzyFinancialCenterName){
            this.fuzzyFinancialCenterName = fuzzyFinancialCenterName;
            return this;
        }

        public ConditionBuilder fuzzyFinancialCenterName (String ... fuzzyFinancialCenterName){
            this.fuzzyFinancialCenterName = solveNullList(fuzzyFinancialCenterName);
            return this;
        }

        public ConditionBuilder rightFuzzyFinancialCenterName (List<String> rightFuzzyFinancialCenterName){
            this.rightFuzzyFinancialCenterName = rightFuzzyFinancialCenterName;
            return this;
        }

        public ConditionBuilder rightFuzzyFinancialCenterName (String ... rightFuzzyFinancialCenterName){
            this.rightFuzzyFinancialCenterName = solveNullList(rightFuzzyFinancialCenterName);
            return this;
        }

        public ConditionBuilder financialCenterNameList(String ... financialCenterName){
            this.financialCenterNameList = solveNullList(financialCenterName);
            return this;
        }

        public ConditionBuilder financialCenterNameList(List<String> financialCenterName){
            this.financialCenterNameList = financialCenterName;
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

        private FinancialCenter obj;

        public Builder(){
            this.obj = new FinancialCenter();
        }

        public Builder financialCenterId(Integer financialCenterId){
            this.obj.setFinancialCenterId(financialCenterId);
            return this;
        }
        public Builder financialCenterCode(String financialCenterCode){
            this.obj.setFinancialCenterCode(financialCenterCode);
            return this;
        }
        public Builder financialCenterName(String financialCenterName){
            this.obj.setFinancialCenterName(financialCenterName);
            return this;
        }
        public FinancialCenter build(){return obj;}
    }

}
