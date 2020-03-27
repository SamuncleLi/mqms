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
public class MqmsTransType implements Serializable {

    private static final long serialVersionUID = 1584851845981L;


    /**
    * 主键
    * id
    * isNullAble:0
    */
    private Integer id;

    /**
    * 变速箱型号
    * isNullAble:1
    */
    private String transType;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setTransType(String transType){this.transType = transType;}

    public String getTransType(){return this.transType;}
    @Override
    public String toString() {
        return "MqmsTransType{" +
                "id='" + id + '\'' +
                "transType='" + transType + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsTransType set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsTransType set){
            this.set = set;
            return this;
        }

        public MqmsTransType getSet(){
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

    public static class QueryBuilder extends MqmsTransType{
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

        private List<String> transTypeList;

        public List<String> getTransTypeList(){return this.transTypeList;}


        private List<String> fuzzyTransType;

        public List<String> getFuzzyTransType(){return this.fuzzyTransType;}

        private List<String> rightFuzzyTransType;

        public List<String> getRightFuzzyTransType(){return this.rightFuzzyTransType;}
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

        public QueryBuilder fuzzyTransType (List<String> fuzzyTransType){
            this.fuzzyTransType = fuzzyTransType;
            return this;
        }

        public QueryBuilder fuzzyTransType (String ... fuzzyTransType){
            this.fuzzyTransType = solveNullList(fuzzyTransType);
            return this;
        }

        public QueryBuilder rightFuzzyTransType (List<String> rightFuzzyTransType){
            this.rightFuzzyTransType = rightFuzzyTransType;
            return this;
        }

        public QueryBuilder rightFuzzyTransType (String ... rightFuzzyTransType){
            this.rightFuzzyTransType = solveNullList(rightFuzzyTransType);
            return this;
        }

        public QueryBuilder transType(String transType){
            setTransType(transType);
            return this;
        }

        public QueryBuilder transTypeList(String ... transType){
            this.transTypeList = solveNullList(transType);
            return this;
        }

        public QueryBuilder transTypeList(List<String> transType){
            this.transTypeList = transType;
            return this;
        }

        public QueryBuilder fetchTransType(){
            setFetchFields("fetchFields","transType");
            return this;
        }

        public QueryBuilder excludeTransType(){
            setFetchFields("excludeFields","transType");
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

        public MqmsTransType build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> transTypeList;

        public List<String> getTransTypeList(){return this.transTypeList;}


        private List<String> fuzzyTransType;

        public List<String> getFuzzyTransType(){return this.fuzzyTransType;}

        private List<String> rightFuzzyTransType;

        public List<String> getRightFuzzyTransType(){return this.rightFuzzyTransType;}

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

        public ConditionBuilder fuzzyTransType (List<String> fuzzyTransType){
            this.fuzzyTransType = fuzzyTransType;
            return this;
        }

        public ConditionBuilder fuzzyTransType (String ... fuzzyTransType){
            this.fuzzyTransType = solveNullList(fuzzyTransType);
            return this;
        }

        public ConditionBuilder rightFuzzyTransType (List<String> rightFuzzyTransType){
            this.rightFuzzyTransType = rightFuzzyTransType;
            return this;
        }

        public ConditionBuilder rightFuzzyTransType (String ... rightFuzzyTransType){
            this.rightFuzzyTransType = solveNullList(rightFuzzyTransType);
            return this;
        }

        public ConditionBuilder transTypeList(String ... transType){
            this.transTypeList = solveNullList(transType);
            return this;
        }

        public ConditionBuilder transTypeList(List<String> transType){
            this.transTypeList = transType;
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

        private MqmsTransType obj;

        public Builder(){
            this.obj = new MqmsTransType();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder transType(String transType){
            this.obj.setTransType(transType);
            return this;
        }
        public MqmsTransType build(){return obj;}
    }

}
