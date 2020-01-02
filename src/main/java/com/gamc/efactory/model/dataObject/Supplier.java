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
public class Supplier implements Serializable {

    private static final long serialVersionUID = 1570350226120L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 供应商代码
    * isNullAble:1
    */
    private String supplierCode;

    /**
    * 供应商名称
    * isNullAble:1
    */
    private String supplierName;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setSupplierCode(String supplierCode){this.supplierCode = supplierCode;}

    public String getSupplierCode(){return this.supplierCode;}

    public void setSupplierName(String supplierName){this.supplierName = supplierName;}

    public String getSupplierName(){return this.supplierName;}
    @Override
    public String toString() {
        return "Supplier{" +
                "id='" + id + '\'' +
                "supplierCode='" + supplierCode + '\'' +
                "supplierName='" + supplierName + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Supplier set;

        private ConditionBuilder where;

        public UpdateBuilder set(Supplier set){
            this.set = set;
            return this;
        }

        public Supplier getSet(){
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

    public static class QueryBuilder extends Supplier{
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

        private List<String> supplierCodeList;

        public List<String> getSupplierCodeList(){return this.supplierCodeList;}


        private List<String> fuzzySupplierCode;

        public List<String> getFuzzySupplierCode(){return this.fuzzySupplierCode;}

        private List<String> rightFuzzySupplierCode;

        public List<String> getRightFuzzySupplierCode(){return this.rightFuzzySupplierCode;}
        private List<String> supplierNameList;

        public List<String> getSupplierNameList(){return this.supplierNameList;}


        private List<String> fuzzySupplierName;

        public List<String> getFuzzySupplierName(){return this.fuzzySupplierName;}

        private List<String> rightFuzzySupplierName;

        public List<String> getRightFuzzySupplierName(){return this.rightFuzzySupplierName;}
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

        public QueryBuilder fuzzySupplierCode (List<String> fuzzySupplierCode){
            this.fuzzySupplierCode = fuzzySupplierCode;
            return this;
        }

        public QueryBuilder fuzzySupplierCode (String ... fuzzySupplierCode){
            this.fuzzySupplierCode = solveNullList(fuzzySupplierCode);
            return this;
        }

        public QueryBuilder rightFuzzySupplierCode (List<String> rightFuzzySupplierCode){
            this.rightFuzzySupplierCode = rightFuzzySupplierCode;
            return this;
        }

        public QueryBuilder rightFuzzySupplierCode (String ... rightFuzzySupplierCode){
            this.rightFuzzySupplierCode = solveNullList(rightFuzzySupplierCode);
            return this;
        }

        public QueryBuilder supplierCode(String supplierCode){
            setSupplierCode(supplierCode);
            return this;
        }

        public QueryBuilder supplierCodeList(String ... supplierCode){
            this.supplierCodeList = solveNullList(supplierCode);
            return this;
        }

        public QueryBuilder supplierCodeList(List<String> supplierCode){
            this.supplierCodeList = supplierCode;
            return this;
        }

        public QueryBuilder fetchSupplierCode(){
            setFetchFields("fetchFields","supplierCode");
            return this;
        }

        public QueryBuilder excludeSupplierCode(){
            setFetchFields("excludeFields","supplierCode");
            return this;
        }

        public QueryBuilder fuzzySupplierName (List<String> fuzzySupplierName){
            this.fuzzySupplierName = fuzzySupplierName;
            return this;
        }

        public QueryBuilder fuzzySupplierName (String ... fuzzySupplierName){
            this.fuzzySupplierName = solveNullList(fuzzySupplierName);
            return this;
        }

        public QueryBuilder rightFuzzySupplierName (List<String> rightFuzzySupplierName){
            this.rightFuzzySupplierName = rightFuzzySupplierName;
            return this;
        }

        public QueryBuilder rightFuzzySupplierName (String ... rightFuzzySupplierName){
            this.rightFuzzySupplierName = solveNullList(rightFuzzySupplierName);
            return this;
        }

        public QueryBuilder supplierName(String supplierName){
            setSupplierName(supplierName);
            return this;
        }

        public QueryBuilder supplierNameList(String ... supplierName){
            this.supplierNameList = solveNullList(supplierName);
            return this;
        }

        public QueryBuilder supplierNameList(List<String> supplierName){
            this.supplierNameList = supplierName;
            return this;
        }

        public QueryBuilder fetchSupplierName(){
            setFetchFields("fetchFields","supplierName");
            return this;
        }

        public QueryBuilder excludeSupplierName(){
            setFetchFields("excludeFields","supplierName");
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

        public Supplier build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> supplierCodeList;

        public List<String> getSupplierCodeList(){return this.supplierCodeList;}


        private List<String> fuzzySupplierCode;

        public List<String> getFuzzySupplierCode(){return this.fuzzySupplierCode;}

        private List<String> rightFuzzySupplierCode;

        public List<String> getRightFuzzySupplierCode(){return this.rightFuzzySupplierCode;}
        private List<String> supplierNameList;

        public List<String> getSupplierNameList(){return this.supplierNameList;}


        private List<String> fuzzySupplierName;

        public List<String> getFuzzySupplierName(){return this.fuzzySupplierName;}

        private List<String> rightFuzzySupplierName;

        public List<String> getRightFuzzySupplierName(){return this.rightFuzzySupplierName;}

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

        public ConditionBuilder fuzzySupplierCode (List<String> fuzzySupplierCode){
            this.fuzzySupplierCode = fuzzySupplierCode;
            return this;
        }

        public ConditionBuilder fuzzySupplierCode (String ... fuzzySupplierCode){
            this.fuzzySupplierCode = solveNullList(fuzzySupplierCode);
            return this;
        }

        public ConditionBuilder rightFuzzySupplierCode (List<String> rightFuzzySupplierCode){
            this.rightFuzzySupplierCode = rightFuzzySupplierCode;
            return this;
        }

        public ConditionBuilder rightFuzzySupplierCode (String ... rightFuzzySupplierCode){
            this.rightFuzzySupplierCode = solveNullList(rightFuzzySupplierCode);
            return this;
        }

        public ConditionBuilder supplierCodeList(String ... supplierCode){
            this.supplierCodeList = solveNullList(supplierCode);
            return this;
        }

        public ConditionBuilder supplierCodeList(List<String> supplierCode){
            this.supplierCodeList = supplierCode;
            return this;
        }

        public ConditionBuilder fuzzySupplierName (List<String> fuzzySupplierName){
            this.fuzzySupplierName = fuzzySupplierName;
            return this;
        }

        public ConditionBuilder fuzzySupplierName (String ... fuzzySupplierName){
            this.fuzzySupplierName = solveNullList(fuzzySupplierName);
            return this;
        }

        public ConditionBuilder rightFuzzySupplierName (List<String> rightFuzzySupplierName){
            this.rightFuzzySupplierName = rightFuzzySupplierName;
            return this;
        }

        public ConditionBuilder rightFuzzySupplierName (String ... rightFuzzySupplierName){
            this.rightFuzzySupplierName = solveNullList(rightFuzzySupplierName);
            return this;
        }

        public ConditionBuilder supplierNameList(String ... supplierName){
            this.supplierNameList = solveNullList(supplierName);
            return this;
        }

        public ConditionBuilder supplierNameList(List<String> supplierName){
            this.supplierNameList = supplierName;
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

        private Supplier obj;

        public Builder(){
            this.obj = new Supplier();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder supplierCode(String supplierCode){
            this.obj.setSupplierCode(supplierCode);
            return this;
        }
        public Builder supplierName(String supplierName){
            this.obj.setSupplierName(supplierName);
            return this;
        }
        public Supplier build(){return obj;}
    }

}
