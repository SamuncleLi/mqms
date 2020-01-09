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
public class MqmsBreakdown implements Serializable {

    private static final long serialVersionUID = 1578469854316L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 
    * isNullAble:1
    */
    private String partsCode;

    /**
    * 
    * isNullAble:1
    */
    private String partsName;

    /**
    * 
    * isNullAble:1
    */
    private String breakdownCode;

    /**
    * 
    * isNullAble:1
    */
    private String breakdownName;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setPartsCode(String partsCode){this.partsCode = partsCode;}

    public String getPartsCode(){return this.partsCode;}

    public void setPartsName(String partsName){this.partsName = partsName;}

    public String getPartsName(){return this.partsName;}

    public void setBreakdownCode(String breakdownCode){this.breakdownCode = breakdownCode;}

    public String getBreakdownCode(){return this.breakdownCode;}

    public void setBreakdownName(String breakdownName){this.breakdownName = breakdownName;}

    public String getBreakdownName(){return this.breakdownName;}
    @Override
    public String toString() {
        return "MqmsBreakdown{" +
                "id='" + id + '\'' +
                "partsCode='" + partsCode + '\'' +
                "partsName='" + partsName + '\'' +
                "breakdownCode='" + breakdownCode + '\'' +
                "breakdownName='" + breakdownName + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsBreakdown set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsBreakdown set){
            this.set = set;
            return this;
        }

        public MqmsBreakdown getSet(){
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

    public static class QueryBuilder extends MqmsBreakdown{
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

        private List<String> partsCodeList;

        public List<String> getPartsCodeList(){return this.partsCodeList;}


        private List<String> fuzzyPartsCode;

        public List<String> getFuzzyPartsCode(){return this.fuzzyPartsCode;}

        private List<String> rightFuzzyPartsCode;

        public List<String> getRightFuzzyPartsCode(){return this.rightFuzzyPartsCode;}
        private List<String> partsNameList;

        public List<String> getPartsNameList(){return this.partsNameList;}


        private List<String> fuzzyPartsName;

        public List<String> getFuzzyPartsName(){return this.fuzzyPartsName;}

        private List<String> rightFuzzyPartsName;

        public List<String> getRightFuzzyPartsName(){return this.rightFuzzyPartsName;}
        private List<String> breakdownCodeList;

        public List<String> getBreakdownCodeList(){return this.breakdownCodeList;}


        private List<String> fuzzyBreakdownCode;

        public List<String> getFuzzyBreakdownCode(){return this.fuzzyBreakdownCode;}

        private List<String> rightFuzzyBreakdownCode;

        public List<String> getRightFuzzyBreakdownCode(){return this.rightFuzzyBreakdownCode;}
        private List<String> breakdownNameList;

        public List<String> getBreakdownNameList(){return this.breakdownNameList;}


        private List<String> fuzzyBreakdownName;

        public List<String> getFuzzyBreakdownName(){return this.fuzzyBreakdownName;}

        private List<String> rightFuzzyBreakdownName;

        public List<String> getRightFuzzyBreakdownName(){return this.rightFuzzyBreakdownName;}
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

        public QueryBuilder fuzzyPartsCode (List<String> fuzzyPartsCode){
            this.fuzzyPartsCode = fuzzyPartsCode;
            return this;
        }

        public QueryBuilder fuzzyPartsCode (String ... fuzzyPartsCode){
            this.fuzzyPartsCode = solveNullList(fuzzyPartsCode);
            return this;
        }

        public QueryBuilder rightFuzzyPartsCode (List<String> rightFuzzyPartsCode){
            this.rightFuzzyPartsCode = rightFuzzyPartsCode;
            return this;
        }

        public QueryBuilder rightFuzzyPartsCode (String ... rightFuzzyPartsCode){
            this.rightFuzzyPartsCode = solveNullList(rightFuzzyPartsCode);
            return this;
        }

        public QueryBuilder partsCode(String partsCode){
            setPartsCode(partsCode);
            return this;
        }

        public QueryBuilder partsCodeList(String ... partsCode){
            this.partsCodeList = solveNullList(partsCode);
            return this;
        }

        public QueryBuilder partsCodeList(List<String> partsCode){
            this.partsCodeList = partsCode;
            return this;
        }

        public QueryBuilder fetchPartsCode(){
            setFetchFields("fetchFields","partsCode");
            return this;
        }

        public QueryBuilder excludePartsCode(){
            setFetchFields("excludeFields","partsCode");
            return this;
        }

        public QueryBuilder fuzzyPartsName (List<String> fuzzyPartsName){
            this.fuzzyPartsName = fuzzyPartsName;
            return this;
        }

        public QueryBuilder fuzzyPartsName (String ... fuzzyPartsName){
            this.fuzzyPartsName = solveNullList(fuzzyPartsName);
            return this;
        }

        public QueryBuilder rightFuzzyPartsName (List<String> rightFuzzyPartsName){
            this.rightFuzzyPartsName = rightFuzzyPartsName;
            return this;
        }

        public QueryBuilder rightFuzzyPartsName (String ... rightFuzzyPartsName){
            this.rightFuzzyPartsName = solveNullList(rightFuzzyPartsName);
            return this;
        }

        public QueryBuilder partsName(String partsName){
            setPartsName(partsName);
            return this;
        }

        public QueryBuilder partsNameList(String ... partsName){
            this.partsNameList = solveNullList(partsName);
            return this;
        }

        public QueryBuilder partsNameList(List<String> partsName){
            this.partsNameList = partsName;
            return this;
        }

        public QueryBuilder fetchPartsName(){
            setFetchFields("fetchFields","partsName");
            return this;
        }

        public QueryBuilder excludePartsName(){
            setFetchFields("excludeFields","partsName");
            return this;
        }

        public QueryBuilder fuzzyBreakdownCode (List<String> fuzzyBreakdownCode){
            this.fuzzyBreakdownCode = fuzzyBreakdownCode;
            return this;
        }

        public QueryBuilder fuzzyBreakdownCode (String ... fuzzyBreakdownCode){
            this.fuzzyBreakdownCode = solveNullList(fuzzyBreakdownCode);
            return this;
        }

        public QueryBuilder rightFuzzyBreakdownCode (List<String> rightFuzzyBreakdownCode){
            this.rightFuzzyBreakdownCode = rightFuzzyBreakdownCode;
            return this;
        }

        public QueryBuilder rightFuzzyBreakdownCode (String ... rightFuzzyBreakdownCode){
            this.rightFuzzyBreakdownCode = solveNullList(rightFuzzyBreakdownCode);
            return this;
        }

        public QueryBuilder breakdownCode(String breakdownCode){
            setBreakdownCode(breakdownCode);
            return this;
        }

        public QueryBuilder breakdownCodeList(String ... breakdownCode){
            this.breakdownCodeList = solveNullList(breakdownCode);
            return this;
        }

        public QueryBuilder breakdownCodeList(List<String> breakdownCode){
            this.breakdownCodeList = breakdownCode;
            return this;
        }

        public QueryBuilder fetchBreakdownCode(){
            setFetchFields("fetchFields","breakdownCode");
            return this;
        }

        public QueryBuilder excludeBreakdownCode(){
            setFetchFields("excludeFields","breakdownCode");
            return this;
        }

        public QueryBuilder fuzzyBreakdownName (List<String> fuzzyBreakdownName){
            this.fuzzyBreakdownName = fuzzyBreakdownName;
            return this;
        }

        public QueryBuilder fuzzyBreakdownName (String ... fuzzyBreakdownName){
            this.fuzzyBreakdownName = solveNullList(fuzzyBreakdownName);
            return this;
        }

        public QueryBuilder rightFuzzyBreakdownName (List<String> rightFuzzyBreakdownName){
            this.rightFuzzyBreakdownName = rightFuzzyBreakdownName;
            return this;
        }

        public QueryBuilder rightFuzzyBreakdownName (String ... rightFuzzyBreakdownName){
            this.rightFuzzyBreakdownName = solveNullList(rightFuzzyBreakdownName);
            return this;
        }

        public QueryBuilder breakdownName(String breakdownName){
            setBreakdownName(breakdownName);
            return this;
        }

        public QueryBuilder breakdownNameList(String ... breakdownName){
            this.breakdownNameList = solveNullList(breakdownName);
            return this;
        }

        public QueryBuilder breakdownNameList(List<String> breakdownName){
            this.breakdownNameList = breakdownName;
            return this;
        }

        public QueryBuilder fetchBreakdownName(){
            setFetchFields("fetchFields","breakdownName");
            return this;
        }

        public QueryBuilder excludeBreakdownName(){
            setFetchFields("excludeFields","breakdownName");
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

        public MqmsBreakdown build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> partsCodeList;

        public List<String> getPartsCodeList(){return this.partsCodeList;}


        private List<String> fuzzyPartsCode;

        public List<String> getFuzzyPartsCode(){return this.fuzzyPartsCode;}

        private List<String> rightFuzzyPartsCode;

        public List<String> getRightFuzzyPartsCode(){return this.rightFuzzyPartsCode;}
        private List<String> partsNameList;

        public List<String> getPartsNameList(){return this.partsNameList;}


        private List<String> fuzzyPartsName;

        public List<String> getFuzzyPartsName(){return this.fuzzyPartsName;}

        private List<String> rightFuzzyPartsName;

        public List<String> getRightFuzzyPartsName(){return this.rightFuzzyPartsName;}
        private List<String> breakdownCodeList;

        public List<String> getBreakdownCodeList(){return this.breakdownCodeList;}


        private List<String> fuzzyBreakdownCode;

        public List<String> getFuzzyBreakdownCode(){return this.fuzzyBreakdownCode;}

        private List<String> rightFuzzyBreakdownCode;

        public List<String> getRightFuzzyBreakdownCode(){return this.rightFuzzyBreakdownCode;}
        private List<String> breakdownNameList;

        public List<String> getBreakdownNameList(){return this.breakdownNameList;}


        private List<String> fuzzyBreakdownName;

        public List<String> getFuzzyBreakdownName(){return this.fuzzyBreakdownName;}

        private List<String> rightFuzzyBreakdownName;

        public List<String> getRightFuzzyBreakdownName(){return this.rightFuzzyBreakdownName;}

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

        public ConditionBuilder fuzzyPartsCode (List<String> fuzzyPartsCode){
            this.fuzzyPartsCode = fuzzyPartsCode;
            return this;
        }

        public ConditionBuilder fuzzyPartsCode (String ... fuzzyPartsCode){
            this.fuzzyPartsCode = solveNullList(fuzzyPartsCode);
            return this;
        }

        public ConditionBuilder rightFuzzyPartsCode (List<String> rightFuzzyPartsCode){
            this.rightFuzzyPartsCode = rightFuzzyPartsCode;
            return this;
        }

        public ConditionBuilder rightFuzzyPartsCode (String ... rightFuzzyPartsCode){
            this.rightFuzzyPartsCode = solveNullList(rightFuzzyPartsCode);
            return this;
        }

        public ConditionBuilder partsCodeList(String ... partsCode){
            this.partsCodeList = solveNullList(partsCode);
            return this;
        }

        public ConditionBuilder partsCodeList(List<String> partsCode){
            this.partsCodeList = partsCode;
            return this;
        }

        public ConditionBuilder fuzzyPartsName (List<String> fuzzyPartsName){
            this.fuzzyPartsName = fuzzyPartsName;
            return this;
        }

        public ConditionBuilder fuzzyPartsName (String ... fuzzyPartsName){
            this.fuzzyPartsName = solveNullList(fuzzyPartsName);
            return this;
        }

        public ConditionBuilder rightFuzzyPartsName (List<String> rightFuzzyPartsName){
            this.rightFuzzyPartsName = rightFuzzyPartsName;
            return this;
        }

        public ConditionBuilder rightFuzzyPartsName (String ... rightFuzzyPartsName){
            this.rightFuzzyPartsName = solveNullList(rightFuzzyPartsName);
            return this;
        }

        public ConditionBuilder partsNameList(String ... partsName){
            this.partsNameList = solveNullList(partsName);
            return this;
        }

        public ConditionBuilder partsNameList(List<String> partsName){
            this.partsNameList = partsName;
            return this;
        }

        public ConditionBuilder fuzzyBreakdownCode (List<String> fuzzyBreakdownCode){
            this.fuzzyBreakdownCode = fuzzyBreakdownCode;
            return this;
        }

        public ConditionBuilder fuzzyBreakdownCode (String ... fuzzyBreakdownCode){
            this.fuzzyBreakdownCode = solveNullList(fuzzyBreakdownCode);
            return this;
        }

        public ConditionBuilder rightFuzzyBreakdownCode (List<String> rightFuzzyBreakdownCode){
            this.rightFuzzyBreakdownCode = rightFuzzyBreakdownCode;
            return this;
        }

        public ConditionBuilder rightFuzzyBreakdownCode (String ... rightFuzzyBreakdownCode){
            this.rightFuzzyBreakdownCode = solveNullList(rightFuzzyBreakdownCode);
            return this;
        }

        public ConditionBuilder breakdownCodeList(String ... breakdownCode){
            this.breakdownCodeList = solveNullList(breakdownCode);
            return this;
        }

        public ConditionBuilder breakdownCodeList(List<String> breakdownCode){
            this.breakdownCodeList = breakdownCode;
            return this;
        }

        public ConditionBuilder fuzzyBreakdownName (List<String> fuzzyBreakdownName){
            this.fuzzyBreakdownName = fuzzyBreakdownName;
            return this;
        }

        public ConditionBuilder fuzzyBreakdownName (String ... fuzzyBreakdownName){
            this.fuzzyBreakdownName = solveNullList(fuzzyBreakdownName);
            return this;
        }

        public ConditionBuilder rightFuzzyBreakdownName (List<String> rightFuzzyBreakdownName){
            this.rightFuzzyBreakdownName = rightFuzzyBreakdownName;
            return this;
        }

        public ConditionBuilder rightFuzzyBreakdownName (String ... rightFuzzyBreakdownName){
            this.rightFuzzyBreakdownName = solveNullList(rightFuzzyBreakdownName);
            return this;
        }

        public ConditionBuilder breakdownNameList(String ... breakdownName){
            this.breakdownNameList = solveNullList(breakdownName);
            return this;
        }

        public ConditionBuilder breakdownNameList(List<String> breakdownName){
            this.breakdownNameList = breakdownName;
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

        private MqmsBreakdown obj;

        public Builder(){
            this.obj = new MqmsBreakdown();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder partsCode(String partsCode){
            this.obj.setPartsCode(partsCode);
            return this;
        }
        public Builder partsName(String partsName){
            this.obj.setPartsName(partsName);
            return this;
        }
        public Builder breakdownCode(String breakdownCode){
            this.obj.setBreakdownCode(breakdownCode);
            return this;
        }
        public Builder breakdownName(String breakdownName){
            this.obj.setBreakdownName(breakdownName);
            return this;
        }
        public MqmsBreakdown build(){return obj;}
    }

}
