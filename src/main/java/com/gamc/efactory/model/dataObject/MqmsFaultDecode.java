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
public class MqmsFaultDecode implements Serializable {

    private static final long serialVersionUID = 1584287120196L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 零件代号
    * isNullAble:1
    */
    private String faultPartCode;

    /**
    * 零件名称
    * isNullAble:1
    */
    private String faultPartName;

    /**
    * 故障现象
    * isNullAble:1
    */
    private String faultSymptomPhoeno;

    /**
    * 故障代码
    * isNullAble:1
    */
    private String faultSymptomCode;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setFaultPartCode(String faultPartCode){this.faultPartCode = faultPartCode;}

    public String getFaultPartCode(){return this.faultPartCode;}

    public void setFaultPartName(String faultPartName){this.faultPartName = faultPartName;}

    public String getFaultPartName(){return this.faultPartName;}

    public void setFaultSymptomPhoeno(String faultSymptomPhoeno){this.faultSymptomPhoeno = faultSymptomPhoeno;}

    public String getFaultSymptomPhoeno(){return this.faultSymptomPhoeno;}

    public void setFaultSymptomCode(String faultSymptomCode){this.faultSymptomCode = faultSymptomCode;}

    public String getFaultSymptomCode(){return this.faultSymptomCode;}
    @Override
    public String toString() {
        return "MqmsFaultDecode{" +
                "id='" + id + '\'' +
                "faultPartCode='" + faultPartCode + '\'' +
                "faultPartName='" + faultPartName + '\'' +
                "faultSymptomPhoeno='" + faultSymptomPhoeno + '\'' +
                "faultSymptomCode='" + faultSymptomCode + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsFaultDecode set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsFaultDecode set){
            this.set = set;
            return this;
        }

        public MqmsFaultDecode getSet(){
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

    public static class QueryBuilder extends MqmsFaultDecode{
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

        private List<String> faultPartCodeList;

        public List<String> getFaultPartCodeList(){return this.faultPartCodeList;}


        private List<String> fuzzyFaultPartCode;

        public List<String> getFuzzyFaultPartCode(){return this.fuzzyFaultPartCode;}

        private List<String> rightFuzzyFaultPartCode;

        public List<String> getRightFuzzyFaultPartCode(){return this.rightFuzzyFaultPartCode;}
        private List<String> faultPartNameList;

        public List<String> getFaultPartNameList(){return this.faultPartNameList;}


        private List<String> fuzzyFaultPartName;

        public List<String> getFuzzyFaultPartName(){return this.fuzzyFaultPartName;}

        private List<String> rightFuzzyFaultPartName;

        public List<String> getRightFuzzyFaultPartName(){return this.rightFuzzyFaultPartName;}
        private List<String> faultSymptomPhoenoList;

        public List<String> getFaultSymptomPhoenoList(){return this.faultSymptomPhoenoList;}


        private List<String> fuzzyFaultSymptomPhoeno;

        public List<String> getFuzzyFaultSymptomPhoeno(){return this.fuzzyFaultSymptomPhoeno;}

        private List<String> rightFuzzyFaultSymptomPhoeno;

        public List<String> getRightFuzzyFaultSymptomPhoeno(){return this.rightFuzzyFaultSymptomPhoeno;}
        private List<String> faultSymptomCodeList;

        public List<String> getFaultSymptomCodeList(){return this.faultSymptomCodeList;}


        private List<String> fuzzyFaultSymptomCode;

        public List<String> getFuzzyFaultSymptomCode(){return this.fuzzyFaultSymptomCode;}

        private List<String> rightFuzzyFaultSymptomCode;

        public List<String> getRightFuzzyFaultSymptomCode(){return this.rightFuzzyFaultSymptomCode;}
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

        public QueryBuilder fuzzyFaultPartCode (List<String> fuzzyFaultPartCode){
            this.fuzzyFaultPartCode = fuzzyFaultPartCode;
            return this;
        }

        public QueryBuilder fuzzyFaultPartCode (String ... fuzzyFaultPartCode){
            this.fuzzyFaultPartCode = solveNullList(fuzzyFaultPartCode);
            return this;
        }

        public QueryBuilder rightFuzzyFaultPartCode (List<String> rightFuzzyFaultPartCode){
            this.rightFuzzyFaultPartCode = rightFuzzyFaultPartCode;
            return this;
        }

        public QueryBuilder rightFuzzyFaultPartCode (String ... rightFuzzyFaultPartCode){
            this.rightFuzzyFaultPartCode = solveNullList(rightFuzzyFaultPartCode);
            return this;
        }

        public QueryBuilder faultPartCode(String faultPartCode){
            setFaultPartCode(faultPartCode);
            return this;
        }

        public QueryBuilder faultPartCodeList(String ... faultPartCode){
            this.faultPartCodeList = solveNullList(faultPartCode);
            return this;
        }

        public QueryBuilder faultPartCodeList(List<String> faultPartCode){
            this.faultPartCodeList = faultPartCode;
            return this;
        }

        public QueryBuilder fetchFaultPartCode(){
            setFetchFields("fetchFields","faultPartCode");
            return this;
        }

        public QueryBuilder excludeFaultPartCode(){
            setFetchFields("excludeFields","faultPartCode");
            return this;
        }

        public QueryBuilder fuzzyFaultPartName (List<String> fuzzyFaultPartName){
            this.fuzzyFaultPartName = fuzzyFaultPartName;
            return this;
        }

        public QueryBuilder fuzzyFaultPartName (String ... fuzzyFaultPartName){
            this.fuzzyFaultPartName = solveNullList(fuzzyFaultPartName);
            return this;
        }

        public QueryBuilder rightFuzzyFaultPartName (List<String> rightFuzzyFaultPartName){
            this.rightFuzzyFaultPartName = rightFuzzyFaultPartName;
            return this;
        }

        public QueryBuilder rightFuzzyFaultPartName (String ... rightFuzzyFaultPartName){
            this.rightFuzzyFaultPartName = solveNullList(rightFuzzyFaultPartName);
            return this;
        }

        public QueryBuilder faultPartName(String faultPartName){
            setFaultPartName(faultPartName);
            return this;
        }

        public QueryBuilder faultPartNameList(String ... faultPartName){
            this.faultPartNameList = solveNullList(faultPartName);
            return this;
        }

        public QueryBuilder faultPartNameList(List<String> faultPartName){
            this.faultPartNameList = faultPartName;
            return this;
        }

        public QueryBuilder fetchFaultPartName(){
            setFetchFields("fetchFields","faultPartName");
            return this;
        }

        public QueryBuilder excludeFaultPartName(){
            setFetchFields("excludeFields","faultPartName");
            return this;
        }

        public QueryBuilder fuzzyFaultSymptomPhoeno (List<String> fuzzyFaultSymptomPhoeno){
            this.fuzzyFaultSymptomPhoeno = fuzzyFaultSymptomPhoeno;
            return this;
        }

        public QueryBuilder fuzzyFaultSymptomPhoeno (String ... fuzzyFaultSymptomPhoeno){
            this.fuzzyFaultSymptomPhoeno = solveNullList(fuzzyFaultSymptomPhoeno);
            return this;
        }

        public QueryBuilder rightFuzzyFaultSymptomPhoeno (List<String> rightFuzzyFaultSymptomPhoeno){
            this.rightFuzzyFaultSymptomPhoeno = rightFuzzyFaultSymptomPhoeno;
            return this;
        }

        public QueryBuilder rightFuzzyFaultSymptomPhoeno (String ... rightFuzzyFaultSymptomPhoeno){
            this.rightFuzzyFaultSymptomPhoeno = solveNullList(rightFuzzyFaultSymptomPhoeno);
            return this;
        }

        public QueryBuilder faultSymptomPhoeno(String faultSymptomPhoeno){
            setFaultSymptomPhoeno(faultSymptomPhoeno);
            return this;
        }

        public QueryBuilder faultSymptomPhoenoList(String ... faultSymptomPhoeno){
            this.faultSymptomPhoenoList = solveNullList(faultSymptomPhoeno);
            return this;
        }

        public QueryBuilder faultSymptomPhoenoList(List<String> faultSymptomPhoeno){
            this.faultSymptomPhoenoList = faultSymptomPhoeno;
            return this;
        }

        public QueryBuilder fetchFaultSymptomPhoeno(){
            setFetchFields("fetchFields","faultSymptomPhoeno");
            return this;
        }

        public QueryBuilder excludeFaultSymptomPhoeno(){
            setFetchFields("excludeFields","faultSymptomPhoeno");
            return this;
        }

        public QueryBuilder fuzzyFaultSymptomCode (List<String> fuzzyFaultSymptomCode){
            this.fuzzyFaultSymptomCode = fuzzyFaultSymptomCode;
            return this;
        }

        public QueryBuilder fuzzyFaultSymptomCode (String ... fuzzyFaultSymptomCode){
            this.fuzzyFaultSymptomCode = solveNullList(fuzzyFaultSymptomCode);
            return this;
        }

        public QueryBuilder rightFuzzyFaultSymptomCode (List<String> rightFuzzyFaultSymptomCode){
            this.rightFuzzyFaultSymptomCode = rightFuzzyFaultSymptomCode;
            return this;
        }

        public QueryBuilder rightFuzzyFaultSymptomCode (String ... rightFuzzyFaultSymptomCode){
            this.rightFuzzyFaultSymptomCode = solveNullList(rightFuzzyFaultSymptomCode);
            return this;
        }

        public QueryBuilder faultSymptomCode(String faultSymptomCode){
            setFaultSymptomCode(faultSymptomCode);
            return this;
        }

        public QueryBuilder faultSymptomCodeList(String ... faultSymptomCode){
            this.faultSymptomCodeList = solveNullList(faultSymptomCode);
            return this;
        }

        public QueryBuilder faultSymptomCodeList(List<String> faultSymptomCode){
            this.faultSymptomCodeList = faultSymptomCode;
            return this;
        }

        public QueryBuilder fetchFaultSymptomCode(){
            setFetchFields("fetchFields","faultSymptomCode");
            return this;
        }

        public QueryBuilder excludeFaultSymptomCode(){
            setFetchFields("excludeFields","faultSymptomCode");
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

        public MqmsFaultDecode build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> faultPartCodeList;

        public List<String> getFaultPartCodeList(){return this.faultPartCodeList;}


        private List<String> fuzzyFaultPartCode;

        public List<String> getFuzzyFaultPartCode(){return this.fuzzyFaultPartCode;}

        private List<String> rightFuzzyFaultPartCode;

        public List<String> getRightFuzzyFaultPartCode(){return this.rightFuzzyFaultPartCode;}
        private List<String> faultPartNameList;

        public List<String> getFaultPartNameList(){return this.faultPartNameList;}


        private List<String> fuzzyFaultPartName;

        public List<String> getFuzzyFaultPartName(){return this.fuzzyFaultPartName;}

        private List<String> rightFuzzyFaultPartName;

        public List<String> getRightFuzzyFaultPartName(){return this.rightFuzzyFaultPartName;}
        private List<String> faultSymptomPhoenoList;

        public List<String> getFaultSymptomPhoenoList(){return this.faultSymptomPhoenoList;}


        private List<String> fuzzyFaultSymptomPhoeno;

        public List<String> getFuzzyFaultSymptomPhoeno(){return this.fuzzyFaultSymptomPhoeno;}

        private List<String> rightFuzzyFaultSymptomPhoeno;

        public List<String> getRightFuzzyFaultSymptomPhoeno(){return this.rightFuzzyFaultSymptomPhoeno;}
        private List<String> faultSymptomCodeList;

        public List<String> getFaultSymptomCodeList(){return this.faultSymptomCodeList;}


        private List<String> fuzzyFaultSymptomCode;

        public List<String> getFuzzyFaultSymptomCode(){return this.fuzzyFaultSymptomCode;}

        private List<String> rightFuzzyFaultSymptomCode;

        public List<String> getRightFuzzyFaultSymptomCode(){return this.rightFuzzyFaultSymptomCode;}

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

        public ConditionBuilder fuzzyFaultPartCode (List<String> fuzzyFaultPartCode){
            this.fuzzyFaultPartCode = fuzzyFaultPartCode;
            return this;
        }

        public ConditionBuilder fuzzyFaultPartCode (String ... fuzzyFaultPartCode){
            this.fuzzyFaultPartCode = solveNullList(fuzzyFaultPartCode);
            return this;
        }

        public ConditionBuilder rightFuzzyFaultPartCode (List<String> rightFuzzyFaultPartCode){
            this.rightFuzzyFaultPartCode = rightFuzzyFaultPartCode;
            return this;
        }

        public ConditionBuilder rightFuzzyFaultPartCode (String ... rightFuzzyFaultPartCode){
            this.rightFuzzyFaultPartCode = solveNullList(rightFuzzyFaultPartCode);
            return this;
        }

        public ConditionBuilder faultPartCodeList(String ... faultPartCode){
            this.faultPartCodeList = solveNullList(faultPartCode);
            return this;
        }

        public ConditionBuilder faultPartCodeList(List<String> faultPartCode){
            this.faultPartCodeList = faultPartCode;
            return this;
        }

        public ConditionBuilder fuzzyFaultPartName (List<String> fuzzyFaultPartName){
            this.fuzzyFaultPartName = fuzzyFaultPartName;
            return this;
        }

        public ConditionBuilder fuzzyFaultPartName (String ... fuzzyFaultPartName){
            this.fuzzyFaultPartName = solveNullList(fuzzyFaultPartName);
            return this;
        }

        public ConditionBuilder rightFuzzyFaultPartName (List<String> rightFuzzyFaultPartName){
            this.rightFuzzyFaultPartName = rightFuzzyFaultPartName;
            return this;
        }

        public ConditionBuilder rightFuzzyFaultPartName (String ... rightFuzzyFaultPartName){
            this.rightFuzzyFaultPartName = solveNullList(rightFuzzyFaultPartName);
            return this;
        }

        public ConditionBuilder faultPartNameList(String ... faultPartName){
            this.faultPartNameList = solveNullList(faultPartName);
            return this;
        }

        public ConditionBuilder faultPartNameList(List<String> faultPartName){
            this.faultPartNameList = faultPartName;
            return this;
        }

        public ConditionBuilder fuzzyFaultSymptomPhoeno (List<String> fuzzyFaultSymptomPhoeno){
            this.fuzzyFaultSymptomPhoeno = fuzzyFaultSymptomPhoeno;
            return this;
        }

        public ConditionBuilder fuzzyFaultSymptomPhoeno (String ... fuzzyFaultSymptomPhoeno){
            this.fuzzyFaultSymptomPhoeno = solveNullList(fuzzyFaultSymptomPhoeno);
            return this;
        }

        public ConditionBuilder rightFuzzyFaultSymptomPhoeno (List<String> rightFuzzyFaultSymptomPhoeno){
            this.rightFuzzyFaultSymptomPhoeno = rightFuzzyFaultSymptomPhoeno;
            return this;
        }

        public ConditionBuilder rightFuzzyFaultSymptomPhoeno (String ... rightFuzzyFaultSymptomPhoeno){
            this.rightFuzzyFaultSymptomPhoeno = solveNullList(rightFuzzyFaultSymptomPhoeno);
            return this;
        }

        public ConditionBuilder faultSymptomPhoenoList(String ... faultSymptomPhoeno){
            this.faultSymptomPhoenoList = solveNullList(faultSymptomPhoeno);
            return this;
        }

        public ConditionBuilder faultSymptomPhoenoList(List<String> faultSymptomPhoeno){
            this.faultSymptomPhoenoList = faultSymptomPhoeno;
            return this;
        }

        public ConditionBuilder fuzzyFaultSymptomCode (List<String> fuzzyFaultSymptomCode){
            this.fuzzyFaultSymptomCode = fuzzyFaultSymptomCode;
            return this;
        }

        public ConditionBuilder fuzzyFaultSymptomCode (String ... fuzzyFaultSymptomCode){
            this.fuzzyFaultSymptomCode = solveNullList(fuzzyFaultSymptomCode);
            return this;
        }

        public ConditionBuilder rightFuzzyFaultSymptomCode (List<String> rightFuzzyFaultSymptomCode){
            this.rightFuzzyFaultSymptomCode = rightFuzzyFaultSymptomCode;
            return this;
        }

        public ConditionBuilder rightFuzzyFaultSymptomCode (String ... rightFuzzyFaultSymptomCode){
            this.rightFuzzyFaultSymptomCode = solveNullList(rightFuzzyFaultSymptomCode);
            return this;
        }

        public ConditionBuilder faultSymptomCodeList(String ... faultSymptomCode){
            this.faultSymptomCodeList = solveNullList(faultSymptomCode);
            return this;
        }

        public ConditionBuilder faultSymptomCodeList(List<String> faultSymptomCode){
            this.faultSymptomCodeList = faultSymptomCode;
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

        private MqmsFaultDecode obj;

        public Builder(){
            this.obj = new MqmsFaultDecode();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder faultPartCode(String faultPartCode){
            this.obj.setFaultPartCode(faultPartCode);
            return this;
        }
        public Builder faultPartName(String faultPartName){
            this.obj.setFaultPartName(faultPartName);
            return this;
        }
        public Builder faultSymptomPhoeno(String faultSymptomPhoeno){
            this.obj.setFaultSymptomPhoeno(faultSymptomPhoeno);
            return this;
        }
        public Builder faultSymptomCode(String faultSymptomCode){
            this.obj.setFaultSymptomCode(faultSymptomCode);
            return this;
        }
        public MqmsFaultDecode build(){return obj;}
    }

}
