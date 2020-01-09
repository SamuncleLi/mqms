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
public class MqmsTranCodeDecode implements Serializable {

    private static final long serialVersionUID = 1578469915452L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 变速箱号解码类型
    * isNullAble:1
    */
    private String tranCodeType;

    /**
    * 变速箱号原码
    * isNullAble:1
    */
    private String tranCodeSource;

    /**
    * 变速箱号解码结果
    * isNullAble:1
    */
    private String tranCodeResult;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setTranCodeType(String tranCodeType){this.tranCodeType = tranCodeType;}

    public String getTranCodeType(){return this.tranCodeType;}

    public void setTranCodeSource(String tranCodeSource){this.tranCodeSource = tranCodeSource;}

    public String getTranCodeSource(){return this.tranCodeSource;}

    public void setTranCodeResult(String tranCodeResult){this.tranCodeResult = tranCodeResult;}

    public String getTranCodeResult(){return this.tranCodeResult;}
    @Override
    public String toString() {
        return "MqmsTranCodeDecode{" +
                "id='" + id + '\'' +
                "tranCodeType='" + tranCodeType + '\'' +
                "tranCodeSource='" + tranCodeSource + '\'' +
                "tranCodeResult='" + tranCodeResult + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsTranCodeDecode set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsTranCodeDecode set){
            this.set = set;
            return this;
        }

        public MqmsTranCodeDecode getSet(){
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

    public static class QueryBuilder extends MqmsTranCodeDecode{
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

        private List<String> tranCodeTypeList;

        public List<String> getTranCodeTypeList(){return this.tranCodeTypeList;}


        private List<String> fuzzyTranCodeType;

        public List<String> getFuzzyTranCodeType(){return this.fuzzyTranCodeType;}

        private List<String> rightFuzzyTranCodeType;

        public List<String> getRightFuzzyTranCodeType(){return this.rightFuzzyTranCodeType;}
        private List<String> tranCodeSourceList;

        public List<String> getTranCodeSourceList(){return this.tranCodeSourceList;}


        private List<String> fuzzyTranCodeSource;

        public List<String> getFuzzyTranCodeSource(){return this.fuzzyTranCodeSource;}

        private List<String> rightFuzzyTranCodeSource;

        public List<String> getRightFuzzyTranCodeSource(){return this.rightFuzzyTranCodeSource;}
        private List<String> tranCodeResultList;

        public List<String> getTranCodeResultList(){return this.tranCodeResultList;}


        private List<String> fuzzyTranCodeResult;

        public List<String> getFuzzyTranCodeResult(){return this.fuzzyTranCodeResult;}

        private List<String> rightFuzzyTranCodeResult;

        public List<String> getRightFuzzyTranCodeResult(){return this.rightFuzzyTranCodeResult;}
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

        public QueryBuilder fuzzyTranCodeType (List<String> fuzzyTranCodeType){
            this.fuzzyTranCodeType = fuzzyTranCodeType;
            return this;
        }

        public QueryBuilder fuzzyTranCodeType (String ... fuzzyTranCodeType){
            this.fuzzyTranCodeType = solveNullList(fuzzyTranCodeType);
            return this;
        }

        public QueryBuilder rightFuzzyTranCodeType (List<String> rightFuzzyTranCodeType){
            this.rightFuzzyTranCodeType = rightFuzzyTranCodeType;
            return this;
        }

        public QueryBuilder rightFuzzyTranCodeType (String ... rightFuzzyTranCodeType){
            this.rightFuzzyTranCodeType = solveNullList(rightFuzzyTranCodeType);
            return this;
        }

        public QueryBuilder tranCodeType(String tranCodeType){
            setTranCodeType(tranCodeType);
            return this;
        }

        public QueryBuilder tranCodeTypeList(String ... tranCodeType){
            this.tranCodeTypeList = solveNullList(tranCodeType);
            return this;
        }

        public QueryBuilder tranCodeTypeList(List<String> tranCodeType){
            this.tranCodeTypeList = tranCodeType;
            return this;
        }

        public QueryBuilder fetchTranCodeType(){
            setFetchFields("fetchFields","tranCodeType");
            return this;
        }

        public QueryBuilder excludeTranCodeType(){
            setFetchFields("excludeFields","tranCodeType");
            return this;
        }

        public QueryBuilder fuzzyTranCodeSource (List<String> fuzzyTranCodeSource){
            this.fuzzyTranCodeSource = fuzzyTranCodeSource;
            return this;
        }

        public QueryBuilder fuzzyTranCodeSource (String ... fuzzyTranCodeSource){
            this.fuzzyTranCodeSource = solveNullList(fuzzyTranCodeSource);
            return this;
        }

        public QueryBuilder rightFuzzyTranCodeSource (List<String> rightFuzzyTranCodeSource){
            this.rightFuzzyTranCodeSource = rightFuzzyTranCodeSource;
            return this;
        }

        public QueryBuilder rightFuzzyTranCodeSource (String ... rightFuzzyTranCodeSource){
            this.rightFuzzyTranCodeSource = solveNullList(rightFuzzyTranCodeSource);
            return this;
        }

        public QueryBuilder tranCodeSource(String tranCodeSource){
            setTranCodeSource(tranCodeSource);
            return this;
        }

        public QueryBuilder tranCodeSourceList(String ... tranCodeSource){
            this.tranCodeSourceList = solveNullList(tranCodeSource);
            return this;
        }

        public QueryBuilder tranCodeSourceList(List<String> tranCodeSource){
            this.tranCodeSourceList = tranCodeSource;
            return this;
        }

        public QueryBuilder fetchTranCodeSource(){
            setFetchFields("fetchFields","tranCodeSource");
            return this;
        }

        public QueryBuilder excludeTranCodeSource(){
            setFetchFields("excludeFields","tranCodeSource");
            return this;
        }

        public QueryBuilder fuzzyTranCodeResult (List<String> fuzzyTranCodeResult){
            this.fuzzyTranCodeResult = fuzzyTranCodeResult;
            return this;
        }

        public QueryBuilder fuzzyTranCodeResult (String ... fuzzyTranCodeResult){
            this.fuzzyTranCodeResult = solveNullList(fuzzyTranCodeResult);
            return this;
        }

        public QueryBuilder rightFuzzyTranCodeResult (List<String> rightFuzzyTranCodeResult){
            this.rightFuzzyTranCodeResult = rightFuzzyTranCodeResult;
            return this;
        }

        public QueryBuilder rightFuzzyTranCodeResult (String ... rightFuzzyTranCodeResult){
            this.rightFuzzyTranCodeResult = solveNullList(rightFuzzyTranCodeResult);
            return this;
        }

        public QueryBuilder tranCodeResult(String tranCodeResult){
            setTranCodeResult(tranCodeResult);
            return this;
        }

        public QueryBuilder tranCodeResultList(String ... tranCodeResult){
            this.tranCodeResultList = solveNullList(tranCodeResult);
            return this;
        }

        public QueryBuilder tranCodeResultList(List<String> tranCodeResult){
            this.tranCodeResultList = tranCodeResult;
            return this;
        }

        public QueryBuilder fetchTranCodeResult(){
            setFetchFields("fetchFields","tranCodeResult");
            return this;
        }

        public QueryBuilder excludeTranCodeResult(){
            setFetchFields("excludeFields","tranCodeResult");
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

        public MqmsTranCodeDecode build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> tranCodeTypeList;

        public List<String> getTranCodeTypeList(){return this.tranCodeTypeList;}


        private List<String> fuzzyTranCodeType;

        public List<String> getFuzzyTranCodeType(){return this.fuzzyTranCodeType;}

        private List<String> rightFuzzyTranCodeType;

        public List<String> getRightFuzzyTranCodeType(){return this.rightFuzzyTranCodeType;}
        private List<String> tranCodeSourceList;

        public List<String> getTranCodeSourceList(){return this.tranCodeSourceList;}


        private List<String> fuzzyTranCodeSource;

        public List<String> getFuzzyTranCodeSource(){return this.fuzzyTranCodeSource;}

        private List<String> rightFuzzyTranCodeSource;

        public List<String> getRightFuzzyTranCodeSource(){return this.rightFuzzyTranCodeSource;}
        private List<String> tranCodeResultList;

        public List<String> getTranCodeResultList(){return this.tranCodeResultList;}


        private List<String> fuzzyTranCodeResult;

        public List<String> getFuzzyTranCodeResult(){return this.fuzzyTranCodeResult;}

        private List<String> rightFuzzyTranCodeResult;

        public List<String> getRightFuzzyTranCodeResult(){return this.rightFuzzyTranCodeResult;}

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

        public ConditionBuilder fuzzyTranCodeType (List<String> fuzzyTranCodeType){
            this.fuzzyTranCodeType = fuzzyTranCodeType;
            return this;
        }

        public ConditionBuilder fuzzyTranCodeType (String ... fuzzyTranCodeType){
            this.fuzzyTranCodeType = solveNullList(fuzzyTranCodeType);
            return this;
        }

        public ConditionBuilder rightFuzzyTranCodeType (List<String> rightFuzzyTranCodeType){
            this.rightFuzzyTranCodeType = rightFuzzyTranCodeType;
            return this;
        }

        public ConditionBuilder rightFuzzyTranCodeType (String ... rightFuzzyTranCodeType){
            this.rightFuzzyTranCodeType = solveNullList(rightFuzzyTranCodeType);
            return this;
        }

        public ConditionBuilder tranCodeTypeList(String ... tranCodeType){
            this.tranCodeTypeList = solveNullList(tranCodeType);
            return this;
        }

        public ConditionBuilder tranCodeTypeList(List<String> tranCodeType){
            this.tranCodeTypeList = tranCodeType;
            return this;
        }

        public ConditionBuilder fuzzyTranCodeSource (List<String> fuzzyTranCodeSource){
            this.fuzzyTranCodeSource = fuzzyTranCodeSource;
            return this;
        }

        public ConditionBuilder fuzzyTranCodeSource (String ... fuzzyTranCodeSource){
            this.fuzzyTranCodeSource = solveNullList(fuzzyTranCodeSource);
            return this;
        }

        public ConditionBuilder rightFuzzyTranCodeSource (List<String> rightFuzzyTranCodeSource){
            this.rightFuzzyTranCodeSource = rightFuzzyTranCodeSource;
            return this;
        }

        public ConditionBuilder rightFuzzyTranCodeSource (String ... rightFuzzyTranCodeSource){
            this.rightFuzzyTranCodeSource = solveNullList(rightFuzzyTranCodeSource);
            return this;
        }

        public ConditionBuilder tranCodeSourceList(String ... tranCodeSource){
            this.tranCodeSourceList = solveNullList(tranCodeSource);
            return this;
        }

        public ConditionBuilder tranCodeSourceList(List<String> tranCodeSource){
            this.tranCodeSourceList = tranCodeSource;
            return this;
        }

        public ConditionBuilder fuzzyTranCodeResult (List<String> fuzzyTranCodeResult){
            this.fuzzyTranCodeResult = fuzzyTranCodeResult;
            return this;
        }

        public ConditionBuilder fuzzyTranCodeResult (String ... fuzzyTranCodeResult){
            this.fuzzyTranCodeResult = solveNullList(fuzzyTranCodeResult);
            return this;
        }

        public ConditionBuilder rightFuzzyTranCodeResult (List<String> rightFuzzyTranCodeResult){
            this.rightFuzzyTranCodeResult = rightFuzzyTranCodeResult;
            return this;
        }

        public ConditionBuilder rightFuzzyTranCodeResult (String ... rightFuzzyTranCodeResult){
            this.rightFuzzyTranCodeResult = solveNullList(rightFuzzyTranCodeResult);
            return this;
        }

        public ConditionBuilder tranCodeResultList(String ... tranCodeResult){
            this.tranCodeResultList = solveNullList(tranCodeResult);
            return this;
        }

        public ConditionBuilder tranCodeResultList(List<String> tranCodeResult){
            this.tranCodeResultList = tranCodeResult;
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

        private MqmsTranCodeDecode obj;

        public Builder(){
            this.obj = new MqmsTranCodeDecode();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder tranCodeType(String tranCodeType){
            this.obj.setTranCodeType(tranCodeType);
            return this;
        }
        public Builder tranCodeSource(String tranCodeSource){
            this.obj.setTranCodeSource(tranCodeSource);
            return this;
        }
        public Builder tranCodeResult(String tranCodeResult){
            this.obj.setTranCodeResult(tranCodeResult);
            return this;
        }
        public MqmsTranCodeDecode build(){return obj;}
    }

}
