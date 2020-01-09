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
public class MqmsMtocDecode implements Serializable {

    private static final long serialVersionUID = 1578469890433L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 解码类型
    * isNullAble:1
    */
    private String mtocType;

    /**
    * mtoc原码
    * isNullAble:1
    */
    private String mtocSource;

    /**
    * mtoc解码结果
    * isNullAble:1
    */
    private String mtocResult;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setMtocType(String mtocType){this.mtocType = mtocType;}

    public String getMtocType(){return this.mtocType;}

    public void setMtocSource(String mtocSource){this.mtocSource = mtocSource;}

    public String getMtocSource(){return this.mtocSource;}

    public void setMtocResult(String mtocResult){this.mtocResult = mtocResult;}

    public String getMtocResult(){return this.mtocResult;}
    @Override
    public String toString() {
        return "MqmsMtocDecode{" +
                "id='" + id + '\'' +
                "mtocType='" + mtocType + '\'' +
                "mtocSource='" + mtocSource + '\'' +
                "mtocResult='" + mtocResult + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsMtocDecode set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsMtocDecode set){
            this.set = set;
            return this;
        }

        public MqmsMtocDecode getSet(){
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

    public static class QueryBuilder extends MqmsMtocDecode{
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

        private List<String> mtocTypeList;

        public List<String> getMtocTypeList(){return this.mtocTypeList;}


        private List<String> fuzzyMtocType;

        public List<String> getFuzzyMtocType(){return this.fuzzyMtocType;}

        private List<String> rightFuzzyMtocType;

        public List<String> getRightFuzzyMtocType(){return this.rightFuzzyMtocType;}
        private List<String> mtocSourceList;

        public List<String> getMtocSourceList(){return this.mtocSourceList;}


        private List<String> fuzzyMtocSource;

        public List<String> getFuzzyMtocSource(){return this.fuzzyMtocSource;}

        private List<String> rightFuzzyMtocSource;

        public List<String> getRightFuzzyMtocSource(){return this.rightFuzzyMtocSource;}
        private List<String> mtocResultList;

        public List<String> getMtocResultList(){return this.mtocResultList;}


        private List<String> fuzzyMtocResult;

        public List<String> getFuzzyMtocResult(){return this.fuzzyMtocResult;}

        private List<String> rightFuzzyMtocResult;

        public List<String> getRightFuzzyMtocResult(){return this.rightFuzzyMtocResult;}
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

        public QueryBuilder fuzzyMtocType (List<String> fuzzyMtocType){
            this.fuzzyMtocType = fuzzyMtocType;
            return this;
        }

        public QueryBuilder fuzzyMtocType (String ... fuzzyMtocType){
            this.fuzzyMtocType = solveNullList(fuzzyMtocType);
            return this;
        }

        public QueryBuilder rightFuzzyMtocType (List<String> rightFuzzyMtocType){
            this.rightFuzzyMtocType = rightFuzzyMtocType;
            return this;
        }

        public QueryBuilder rightFuzzyMtocType (String ... rightFuzzyMtocType){
            this.rightFuzzyMtocType = solveNullList(rightFuzzyMtocType);
            return this;
        }

        public QueryBuilder mtocType(String mtocType){
            setMtocType(mtocType);
            return this;
        }

        public QueryBuilder mtocTypeList(String ... mtocType){
            this.mtocTypeList = solveNullList(mtocType);
            return this;
        }

        public QueryBuilder mtocTypeList(List<String> mtocType){
            this.mtocTypeList = mtocType;
            return this;
        }

        public QueryBuilder fetchMtocType(){
            setFetchFields("fetchFields","mtocType");
            return this;
        }

        public QueryBuilder excludeMtocType(){
            setFetchFields("excludeFields","mtocType");
            return this;
        }

        public QueryBuilder fuzzyMtocSource (List<String> fuzzyMtocSource){
            this.fuzzyMtocSource = fuzzyMtocSource;
            return this;
        }

        public QueryBuilder fuzzyMtocSource (String ... fuzzyMtocSource){
            this.fuzzyMtocSource = solveNullList(fuzzyMtocSource);
            return this;
        }

        public QueryBuilder rightFuzzyMtocSource (List<String> rightFuzzyMtocSource){
            this.rightFuzzyMtocSource = rightFuzzyMtocSource;
            return this;
        }

        public QueryBuilder rightFuzzyMtocSource (String ... rightFuzzyMtocSource){
            this.rightFuzzyMtocSource = solveNullList(rightFuzzyMtocSource);
            return this;
        }

        public QueryBuilder mtocSource(String mtocSource){
            setMtocSource(mtocSource);
            return this;
        }

        public QueryBuilder mtocSourceList(String ... mtocSource){
            this.mtocSourceList = solveNullList(mtocSource);
            return this;
        }

        public QueryBuilder mtocSourceList(List<String> mtocSource){
            this.mtocSourceList = mtocSource;
            return this;
        }

        public QueryBuilder fetchMtocSource(){
            setFetchFields("fetchFields","mtocSource");
            return this;
        }

        public QueryBuilder excludeMtocSource(){
            setFetchFields("excludeFields","mtocSource");
            return this;
        }

        public QueryBuilder fuzzyMtocResult (List<String> fuzzyMtocResult){
            this.fuzzyMtocResult = fuzzyMtocResult;
            return this;
        }

        public QueryBuilder fuzzyMtocResult (String ... fuzzyMtocResult){
            this.fuzzyMtocResult = solveNullList(fuzzyMtocResult);
            return this;
        }

        public QueryBuilder rightFuzzyMtocResult (List<String> rightFuzzyMtocResult){
            this.rightFuzzyMtocResult = rightFuzzyMtocResult;
            return this;
        }

        public QueryBuilder rightFuzzyMtocResult (String ... rightFuzzyMtocResult){
            this.rightFuzzyMtocResult = solveNullList(rightFuzzyMtocResult);
            return this;
        }

        public QueryBuilder mtocResult(String mtocResult){
            setMtocResult(mtocResult);
            return this;
        }

        public QueryBuilder mtocResultList(String ... mtocResult){
            this.mtocResultList = solveNullList(mtocResult);
            return this;
        }

        public QueryBuilder mtocResultList(List<String> mtocResult){
            this.mtocResultList = mtocResult;
            return this;
        }

        public QueryBuilder fetchMtocResult(){
            setFetchFields("fetchFields","mtocResult");
            return this;
        }

        public QueryBuilder excludeMtocResult(){
            setFetchFields("excludeFields","mtocResult");
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

        public MqmsMtocDecode build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> mtocTypeList;

        public List<String> getMtocTypeList(){return this.mtocTypeList;}


        private List<String> fuzzyMtocType;

        public List<String> getFuzzyMtocType(){return this.fuzzyMtocType;}

        private List<String> rightFuzzyMtocType;

        public List<String> getRightFuzzyMtocType(){return this.rightFuzzyMtocType;}
        private List<String> mtocSourceList;

        public List<String> getMtocSourceList(){return this.mtocSourceList;}


        private List<String> fuzzyMtocSource;

        public List<String> getFuzzyMtocSource(){return this.fuzzyMtocSource;}

        private List<String> rightFuzzyMtocSource;

        public List<String> getRightFuzzyMtocSource(){return this.rightFuzzyMtocSource;}
        private List<String> mtocResultList;

        public List<String> getMtocResultList(){return this.mtocResultList;}


        private List<String> fuzzyMtocResult;

        public List<String> getFuzzyMtocResult(){return this.fuzzyMtocResult;}

        private List<String> rightFuzzyMtocResult;

        public List<String> getRightFuzzyMtocResult(){return this.rightFuzzyMtocResult;}

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

        public ConditionBuilder fuzzyMtocType (List<String> fuzzyMtocType){
            this.fuzzyMtocType = fuzzyMtocType;
            return this;
        }

        public ConditionBuilder fuzzyMtocType (String ... fuzzyMtocType){
            this.fuzzyMtocType = solveNullList(fuzzyMtocType);
            return this;
        }

        public ConditionBuilder rightFuzzyMtocType (List<String> rightFuzzyMtocType){
            this.rightFuzzyMtocType = rightFuzzyMtocType;
            return this;
        }

        public ConditionBuilder rightFuzzyMtocType (String ... rightFuzzyMtocType){
            this.rightFuzzyMtocType = solveNullList(rightFuzzyMtocType);
            return this;
        }

        public ConditionBuilder mtocTypeList(String ... mtocType){
            this.mtocTypeList = solveNullList(mtocType);
            return this;
        }

        public ConditionBuilder mtocTypeList(List<String> mtocType){
            this.mtocTypeList = mtocType;
            return this;
        }

        public ConditionBuilder fuzzyMtocSource (List<String> fuzzyMtocSource){
            this.fuzzyMtocSource = fuzzyMtocSource;
            return this;
        }

        public ConditionBuilder fuzzyMtocSource (String ... fuzzyMtocSource){
            this.fuzzyMtocSource = solveNullList(fuzzyMtocSource);
            return this;
        }

        public ConditionBuilder rightFuzzyMtocSource (List<String> rightFuzzyMtocSource){
            this.rightFuzzyMtocSource = rightFuzzyMtocSource;
            return this;
        }

        public ConditionBuilder rightFuzzyMtocSource (String ... rightFuzzyMtocSource){
            this.rightFuzzyMtocSource = solveNullList(rightFuzzyMtocSource);
            return this;
        }

        public ConditionBuilder mtocSourceList(String ... mtocSource){
            this.mtocSourceList = solveNullList(mtocSource);
            return this;
        }

        public ConditionBuilder mtocSourceList(List<String> mtocSource){
            this.mtocSourceList = mtocSource;
            return this;
        }

        public ConditionBuilder fuzzyMtocResult (List<String> fuzzyMtocResult){
            this.fuzzyMtocResult = fuzzyMtocResult;
            return this;
        }

        public ConditionBuilder fuzzyMtocResult (String ... fuzzyMtocResult){
            this.fuzzyMtocResult = solveNullList(fuzzyMtocResult);
            return this;
        }

        public ConditionBuilder rightFuzzyMtocResult (List<String> rightFuzzyMtocResult){
            this.rightFuzzyMtocResult = rightFuzzyMtocResult;
            return this;
        }

        public ConditionBuilder rightFuzzyMtocResult (String ... rightFuzzyMtocResult){
            this.rightFuzzyMtocResult = solveNullList(rightFuzzyMtocResult);
            return this;
        }

        public ConditionBuilder mtocResultList(String ... mtocResult){
            this.mtocResultList = solveNullList(mtocResult);
            return this;
        }

        public ConditionBuilder mtocResultList(List<String> mtocResult){
            this.mtocResultList = mtocResult;
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

        private MqmsMtocDecode obj;

        public Builder(){
            this.obj = new MqmsMtocDecode();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder mtocType(String mtocType){
            this.obj.setMtocType(mtocType);
            return this;
        }
        public Builder mtocSource(String mtocSource){
            this.obj.setMtocSource(mtocSource);
            return this;
        }
        public Builder mtocResult(String mtocResult){
            this.obj.setMtocResult(mtocResult);
            return this;
        }
        public MqmsMtocDecode build(){return obj;}
    }

}
