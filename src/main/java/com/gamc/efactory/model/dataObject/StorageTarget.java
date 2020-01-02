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
public class StorageTarget implements Serializable {

    private static final long serialVersionUID = 1567824196486L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 目标金额
    * isNullAble:1
    */
    private java.math.BigDecimal amountTarget;

    /**
    * 类别（是内控还是财务目标）
    * isNullAble:1
    */
    private String type;

    /**
    * 年份
    * isNullAble:1
    */
    private String year;

    /**
    * 
    * isNullAble:1
    */
    private String materialType;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setAmountTarget(java.math.BigDecimal amountTarget){this.amountTarget = amountTarget;}

    public java.math.BigDecimal getAmountTarget(){return this.amountTarget;}

    public void setType(String type){this.type = type;}

    public String getType(){return this.type;}

    public void setYear(String year){this.year = year;}

    public String getYear(){return this.year;}

    public void setMaterialType(String materialType){this.materialType = materialType;}

    public String getMaterialType(){return this.materialType;}
    @Override
    public String toString() {
        return "StorageTarget{" +
                "id='" + id + '\'' +
                "amountTarget='" + amountTarget + '\'' +
                "type='" + type + '\'' +
                "year='" + year + '\'' +
                "materialType='" + materialType + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private StorageTarget set;

        private ConditionBuilder where;

        public UpdateBuilder set(StorageTarget set){
            this.set = set;
            return this;
        }

        public StorageTarget getSet(){
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

    public static class QueryBuilder extends StorageTarget{
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

        private List<java.math.BigDecimal> amountTargetList;

        public List<java.math.BigDecimal> getAmountTargetList(){return this.amountTargetList;}

        private java.math.BigDecimal amountTargetSt;

        private java.math.BigDecimal amountTargetEd;

        public java.math.BigDecimal getAmountTargetSt(){return this.amountTargetSt;}

        public java.math.BigDecimal getAmountTargetEd(){return this.amountTargetEd;}

        private List<String> typeList;

        public List<String> getTypeList(){return this.typeList;}


        private List<String> fuzzyType;

        public List<String> getFuzzyType(){return this.fuzzyType;}

        private List<String> rightFuzzyType;

        public List<String> getRightFuzzyType(){return this.rightFuzzyType;}
        private List<String> yearList;

        public List<String> getYearList(){return this.yearList;}


        private List<String> fuzzyYear;

        public List<String> getFuzzyYear(){return this.fuzzyYear;}

        private List<String> rightFuzzyYear;

        public List<String> getRightFuzzyYear(){return this.rightFuzzyYear;}
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

        public QueryBuilder amountTargetBetWeen(java.math.BigDecimal amountTargetSt,java.math.BigDecimal amountTargetEd){
            this.amountTargetSt = amountTargetSt;
            this.amountTargetEd = amountTargetEd;
            return this;
        }

        public QueryBuilder amountTargetGreaterEqThan(java.math.BigDecimal amountTargetSt){
            this.amountTargetSt = amountTargetSt;
            return this;
        }
        public QueryBuilder amountTargetLessEqThan(java.math.BigDecimal amountTargetEd){
            this.amountTargetEd = amountTargetEd;
            return this;
        }


        public QueryBuilder amountTarget(java.math.BigDecimal amountTarget){
            setAmountTarget(amountTarget);
            return this;
        }

        public QueryBuilder amountTargetList(java.math.BigDecimal ... amountTarget){
            this.amountTargetList = solveNullList(amountTarget);
            return this;
        }

        public QueryBuilder amountTargetList(List<java.math.BigDecimal> amountTarget){
            this.amountTargetList = amountTarget;
            return this;
        }

        public QueryBuilder fetchAmountTarget(){
            setFetchFields("fetchFields","amountTarget");
            return this;
        }

        public QueryBuilder excludeAmountTarget(){
            setFetchFields("excludeFields","amountTarget");
            return this;
        }

        public QueryBuilder fuzzyType (List<String> fuzzyType){
            this.fuzzyType = fuzzyType;
            return this;
        }

        public QueryBuilder fuzzyType (String ... fuzzyType){
            this.fuzzyType = solveNullList(fuzzyType);
            return this;
        }

        public QueryBuilder rightFuzzyType (List<String> rightFuzzyType){
            this.rightFuzzyType = rightFuzzyType;
            return this;
        }

        public QueryBuilder rightFuzzyType (String ... rightFuzzyType){
            this.rightFuzzyType = solveNullList(rightFuzzyType);
            return this;
        }

        public QueryBuilder type(String type){
            setType(type);
            return this;
        }

        public QueryBuilder typeList(String ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public QueryBuilder typeList(List<String> type){
            this.typeList = type;
            return this;
        }

        public QueryBuilder fetchType(){
            setFetchFields("fetchFields","type");
            return this;
        }

        public QueryBuilder excludeType(){
            setFetchFields("excludeFields","type");
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

        public StorageTarget build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<java.math.BigDecimal> amountTargetList;

        public List<java.math.BigDecimal> getAmountTargetList(){return this.amountTargetList;}

        private java.math.BigDecimal amountTargetSt;

        private java.math.BigDecimal amountTargetEd;

        public java.math.BigDecimal getAmountTargetSt(){return this.amountTargetSt;}

        public java.math.BigDecimal getAmountTargetEd(){return this.amountTargetEd;}

        private List<String> typeList;

        public List<String> getTypeList(){return this.typeList;}


        private List<String> fuzzyType;

        public List<String> getFuzzyType(){return this.fuzzyType;}

        private List<String> rightFuzzyType;

        public List<String> getRightFuzzyType(){return this.rightFuzzyType;}
        private List<String> yearList;

        public List<String> getYearList(){return this.yearList;}


        private List<String> fuzzyYear;

        public List<String> getFuzzyYear(){return this.fuzzyYear;}

        private List<String> rightFuzzyYear;

        public List<String> getRightFuzzyYear(){return this.rightFuzzyYear;}
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

        public ConditionBuilder amountTargetBetWeen(java.math.BigDecimal amountTargetSt,java.math.BigDecimal amountTargetEd){
            this.amountTargetSt = amountTargetSt;
            this.amountTargetEd = amountTargetEd;
            return this;
        }

        public ConditionBuilder amountTargetGreaterEqThan(java.math.BigDecimal amountTargetSt){
            this.amountTargetSt = amountTargetSt;
            return this;
        }
        public ConditionBuilder amountTargetLessEqThan(java.math.BigDecimal amountTargetEd){
            this.amountTargetEd = amountTargetEd;
            return this;
        }


        public ConditionBuilder amountTargetList(java.math.BigDecimal ... amountTarget){
            this.amountTargetList = solveNullList(amountTarget);
            return this;
        }

        public ConditionBuilder amountTargetList(List<java.math.BigDecimal> amountTarget){
            this.amountTargetList = amountTarget;
            return this;
        }

        public ConditionBuilder fuzzyType (List<String> fuzzyType){
            this.fuzzyType = fuzzyType;
            return this;
        }

        public ConditionBuilder fuzzyType (String ... fuzzyType){
            this.fuzzyType = solveNullList(fuzzyType);
            return this;
        }

        public ConditionBuilder rightFuzzyType (List<String> rightFuzzyType){
            this.rightFuzzyType = rightFuzzyType;
            return this;
        }

        public ConditionBuilder rightFuzzyType (String ... rightFuzzyType){
            this.rightFuzzyType = solveNullList(rightFuzzyType);
            return this;
        }

        public ConditionBuilder typeList(String ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public ConditionBuilder typeList(List<String> type){
            this.typeList = type;
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

        private StorageTarget obj;

        public Builder(){
            this.obj = new StorageTarget();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder amountTarget(java.math.BigDecimal amountTarget){
            this.obj.setAmountTarget(amountTarget);
            return this;
        }
        public Builder type(String type){
            this.obj.setType(type);
            return this;
        }
        public Builder year(String year){
            this.obj.setYear(year);
            return this;
        }
        public Builder materialType(String materialType){
            this.obj.setMaterialType(materialType);
            return this;
        }
        public StorageTarget build(){return obj;}
    }

}
