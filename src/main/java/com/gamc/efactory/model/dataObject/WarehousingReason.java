package com.gamc.efactory.model.dataObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author lizh
*/
public class WarehousingReason implements Serializable {

    private static final long serialVersionUID = 1562809890269L;


    /**
    * 主键
    * ID
    * isNullAble:0
    */
    private Integer warehousingReasonId;

    /**
    * 调整原因
    * isNullAble:1,defaultVal:
    */
    private String warehousingReasonCode;

    /**
    * 调整原因描述
    * isNullAble:1,defaultVal:
    */
    private String warehousingReasonDescription;


    public void setWarehousingReasonId(Integer warehousingReasonId){this.warehousingReasonId = warehousingReasonId;}

    public Integer getWarehousingReasonId(){return this.warehousingReasonId;}

    public void setWarehousingReasonCode(String warehousingReasonCode){this.warehousingReasonCode = warehousingReasonCode;}

    public String getWarehousingReasonCode(){return this.warehousingReasonCode;}

    public void setWarehousingReasonDescription(String warehousingReasonDescription){this.warehousingReasonDescription = warehousingReasonDescription;}

    public String getWarehousingReasonDescription(){return this.warehousingReasonDescription;}
    @Override
    public String toString() {
        return "WarehousingReason{" +
                "warehousingReasonId='" + warehousingReasonId + '\'' +
                "warehousingReasonCode='" + warehousingReasonCode + '\'' +
                "warehousingReasonDescription='" + warehousingReasonDescription + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private WarehousingReason set;

        private ConditionBuilder where;

        public UpdateBuilder set(WarehousingReason set){
            this.set = set;
            return this;
        }

        public WarehousingReason getSet(){
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

    public static class QueryBuilder extends WarehousingReason{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> warehousingReasonIdList;

        public List<Integer> getWarehousingReasonIdList(){return this.warehousingReasonIdList;}

        private Integer warehousingReasonIdSt;

        private Integer warehousingReasonIdEd;

        public Integer getWarehousingReasonIdSt(){return this.warehousingReasonIdSt;}

        public Integer getWarehousingReasonIdEd(){return this.warehousingReasonIdEd;}

        private List<String> warehousingReasonCodeList;

        public List<String> getWarehousingReasonCodeList(){return this.warehousingReasonCodeList;}


        private List<String> fuzzyWarehousingReasonCode;

        public List<String> getFuzzyWarehousingReasonCode(){return this.fuzzyWarehousingReasonCode;}

        private List<String> rightFuzzyWarehousingReasonCode;

        public List<String> getRightFuzzyWarehousingReasonCode(){return this.rightFuzzyWarehousingReasonCode;}
        private List<String> warehousingReasonDescriptionList;

        public List<String> getWarehousingReasonDescriptionList(){return this.warehousingReasonDescriptionList;}


        private List<String> fuzzyWarehousingReasonDescription;

        public List<String> getFuzzyWarehousingReasonDescription(){return this.fuzzyWarehousingReasonDescription;}

        private List<String> rightFuzzyWarehousingReasonDescription;

        public List<String> getRightFuzzyWarehousingReasonDescription(){return this.rightFuzzyWarehousingReasonDescription;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder warehousingReasonIdBetWeen(Integer warehousingReasonIdSt,Integer warehousingReasonIdEd){
            this.warehousingReasonIdSt = warehousingReasonIdSt;
            this.warehousingReasonIdEd = warehousingReasonIdEd;
            return this;
        }

        public QueryBuilder warehousingReasonIdGreaterEqThan(Integer warehousingReasonIdSt){
            this.warehousingReasonIdSt = warehousingReasonIdSt;
            return this;
        }
        public QueryBuilder warehousingReasonIdLessEqThan(Integer warehousingReasonIdEd){
            this.warehousingReasonIdEd = warehousingReasonIdEd;
            return this;
        }


        public QueryBuilder warehousingReasonId(Integer warehousingReasonId){
            setWarehousingReasonId(warehousingReasonId);
            return this;
        }

        public QueryBuilder warehousingReasonIdList(Integer ... warehousingReasonId){
            this.warehousingReasonIdList = solveNullList(warehousingReasonId);
            return this;
        }

        public QueryBuilder warehousingReasonIdList(List<Integer> warehousingReasonId){
            this.warehousingReasonIdList = warehousingReasonId;
            return this;
        }

        public QueryBuilder fetchWarehousingReasonId(){
            setFetchFields("fetchFields","warehousingReasonId");
            return this;
        }

        public QueryBuilder excludeWarehousingReasonId(){
            setFetchFields("excludeFields","warehousingReasonId");
            return this;
        }

        public QueryBuilder fuzzyWarehousingReasonCode (List<String> fuzzyWarehousingReasonCode){
            this.fuzzyWarehousingReasonCode = fuzzyWarehousingReasonCode;
            return this;
        }

        public QueryBuilder fuzzyWarehousingReasonCode (String ... fuzzyWarehousingReasonCode){
            this.fuzzyWarehousingReasonCode = solveNullList(fuzzyWarehousingReasonCode);
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingReasonCode (List<String> rightFuzzyWarehousingReasonCode){
            this.rightFuzzyWarehousingReasonCode = rightFuzzyWarehousingReasonCode;
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingReasonCode (String ... rightFuzzyWarehousingReasonCode){
            this.rightFuzzyWarehousingReasonCode = solveNullList(rightFuzzyWarehousingReasonCode);
            return this;
        }

        public QueryBuilder warehousingReasonCode(String warehousingReasonCode){
            setWarehousingReasonCode(warehousingReasonCode);
            return this;
        }

        public QueryBuilder warehousingReasonCodeList(String ... warehousingReasonCode){
            this.warehousingReasonCodeList = solveNullList(warehousingReasonCode);
            return this;
        }

        public QueryBuilder warehousingReasonCodeList(List<String> warehousingReasonCode){
            this.warehousingReasonCodeList = warehousingReasonCode;
            return this;
        }

        public QueryBuilder fetchWarehousingReasonCode(){
            setFetchFields("fetchFields","warehousingReasonCode");
            return this;
        }

        public QueryBuilder excludeWarehousingReasonCode(){
            setFetchFields("excludeFields","warehousingReasonCode");
            return this;
        }

        public QueryBuilder fuzzyWarehousingReasonDescription (List<String> fuzzyWarehousingReasonDescription){
            this.fuzzyWarehousingReasonDescription = fuzzyWarehousingReasonDescription;
            return this;
        }

        public QueryBuilder fuzzyWarehousingReasonDescription (String ... fuzzyWarehousingReasonDescription){
            this.fuzzyWarehousingReasonDescription = solveNullList(fuzzyWarehousingReasonDescription);
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingReasonDescription (List<String> rightFuzzyWarehousingReasonDescription){
            this.rightFuzzyWarehousingReasonDescription = rightFuzzyWarehousingReasonDescription;
            return this;
        }

        public QueryBuilder rightFuzzyWarehousingReasonDescription (String ... rightFuzzyWarehousingReasonDescription){
            this.rightFuzzyWarehousingReasonDescription = solveNullList(rightFuzzyWarehousingReasonDescription);
            return this;
        }

        public QueryBuilder warehousingReasonDescription(String warehousingReasonDescription){
            setWarehousingReasonDescription(warehousingReasonDescription);
            return this;
        }

        public QueryBuilder warehousingReasonDescriptionList(String ... warehousingReasonDescription){
            this.warehousingReasonDescriptionList = solveNullList(warehousingReasonDescription);
            return this;
        }

        public QueryBuilder warehousingReasonDescriptionList(List<String> warehousingReasonDescription){
            this.warehousingReasonDescriptionList = warehousingReasonDescription;
            return this;
        }

        public QueryBuilder fetchWarehousingReasonDescription(){
            setFetchFields("fetchFields","warehousingReasonDescription");
            return this;
        }

        public QueryBuilder excludeWarehousingReasonDescription(){
            setFetchFields("excludeFields","warehousingReasonDescription");
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

        public WarehousingReason build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> warehousingReasonIdList;

        public List<Integer> getWarehousingReasonIdList(){return this.warehousingReasonIdList;}

        private Integer warehousingReasonIdSt;

        private Integer warehousingReasonIdEd;

        public Integer getWarehousingReasonIdSt(){return this.warehousingReasonIdSt;}

        public Integer getWarehousingReasonIdEd(){return this.warehousingReasonIdEd;}

        private List<String> warehousingReasonCodeList;

        public List<String> getWarehousingReasonCodeList(){return this.warehousingReasonCodeList;}


        private List<String> fuzzyWarehousingReasonCode;

        public List<String> getFuzzyWarehousingReasonCode(){return this.fuzzyWarehousingReasonCode;}

        private List<String> rightFuzzyWarehousingReasonCode;

        public List<String> getRightFuzzyWarehousingReasonCode(){return this.rightFuzzyWarehousingReasonCode;}
        private List<String> warehousingReasonDescriptionList;

        public List<String> getWarehousingReasonDescriptionList(){return this.warehousingReasonDescriptionList;}


        private List<String> fuzzyWarehousingReasonDescription;

        public List<String> getFuzzyWarehousingReasonDescription(){return this.fuzzyWarehousingReasonDescription;}

        private List<String> rightFuzzyWarehousingReasonDescription;

        public List<String> getRightFuzzyWarehousingReasonDescription(){return this.rightFuzzyWarehousingReasonDescription;}

        public ConditionBuilder warehousingReasonIdBetWeen(Integer warehousingReasonIdSt,Integer warehousingReasonIdEd){
            this.warehousingReasonIdSt = warehousingReasonIdSt;
            this.warehousingReasonIdEd = warehousingReasonIdEd;
            return this;
        }

        public ConditionBuilder warehousingReasonIdGreaterEqThan(Integer warehousingReasonIdSt){
            this.warehousingReasonIdSt = warehousingReasonIdSt;
            return this;
        }
        public ConditionBuilder warehousingReasonIdLessEqThan(Integer warehousingReasonIdEd){
            this.warehousingReasonIdEd = warehousingReasonIdEd;
            return this;
        }


        public ConditionBuilder warehousingReasonIdList(Integer ... warehousingReasonId){
            this.warehousingReasonIdList = solveNullList(warehousingReasonId);
            return this;
        }

        public ConditionBuilder warehousingReasonIdList(List<Integer> warehousingReasonId){
            this.warehousingReasonIdList = warehousingReasonId;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingReasonCode (List<String> fuzzyWarehousingReasonCode){
            this.fuzzyWarehousingReasonCode = fuzzyWarehousingReasonCode;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingReasonCode (String ... fuzzyWarehousingReasonCode){
            this.fuzzyWarehousingReasonCode = solveNullList(fuzzyWarehousingReasonCode);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingReasonCode (List<String> rightFuzzyWarehousingReasonCode){
            this.rightFuzzyWarehousingReasonCode = rightFuzzyWarehousingReasonCode;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingReasonCode (String ... rightFuzzyWarehousingReasonCode){
            this.rightFuzzyWarehousingReasonCode = solveNullList(rightFuzzyWarehousingReasonCode);
            return this;
        }

        public ConditionBuilder warehousingReasonCodeList(String ... warehousingReasonCode){
            this.warehousingReasonCodeList = solveNullList(warehousingReasonCode);
            return this;
        }

        public ConditionBuilder warehousingReasonCodeList(List<String> warehousingReasonCode){
            this.warehousingReasonCodeList = warehousingReasonCode;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingReasonDescription (List<String> fuzzyWarehousingReasonDescription){
            this.fuzzyWarehousingReasonDescription = fuzzyWarehousingReasonDescription;
            return this;
        }

        public ConditionBuilder fuzzyWarehousingReasonDescription (String ... fuzzyWarehousingReasonDescription){
            this.fuzzyWarehousingReasonDescription = solveNullList(fuzzyWarehousingReasonDescription);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingReasonDescription (List<String> rightFuzzyWarehousingReasonDescription){
            this.rightFuzzyWarehousingReasonDescription = rightFuzzyWarehousingReasonDescription;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousingReasonDescription (String ... rightFuzzyWarehousingReasonDescription){
            this.rightFuzzyWarehousingReasonDescription = solveNullList(rightFuzzyWarehousingReasonDescription);
            return this;
        }

        public ConditionBuilder warehousingReasonDescriptionList(String ... warehousingReasonDescription){
            this.warehousingReasonDescriptionList = solveNullList(warehousingReasonDescription);
            return this;
        }

        public ConditionBuilder warehousingReasonDescriptionList(List<String> warehousingReasonDescription){
            this.warehousingReasonDescriptionList = warehousingReasonDescription;
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

        private WarehousingReason obj;

        public Builder(){
            this.obj = new WarehousingReason();
        }

        public Builder warehousingReasonId(Integer warehousingReasonId){
            this.obj.setWarehousingReasonId(warehousingReasonId);
            return this;
        }
        public Builder warehousingReasonCode(String warehousingReasonCode){
            this.obj.setWarehousingReasonCode(warehousingReasonCode);
            return this;
        }
        public Builder warehousingReasonDescription(String warehousingReasonDescription){
            this.obj.setWarehousingReasonDescription(warehousingReasonDescription);
            return this;
        }
        public WarehousingReason build(){return obj;}
    }

}
