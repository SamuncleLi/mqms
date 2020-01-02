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
public class MaterialContract implements Serializable {

    private static final long serialVersionUID = 1564351954345L;


    /**
    * 主键
    * 已签开口合同资材id
    * isNullAble:0
    */
    private Integer materialContractId;

    /**
    * 物料号
    * isNullAble:1
    */
    private String materialCode;

    /**
    * 物料名称
    * isNullAble:1
    */
    private String materialName;

    /**
    * 规格型号
    * isNullAble:1
    */
    private String materialSpecs;

    /**
    * 品牌
    * isNullAble:1
    */
    private String materialBrand;

    /**
    * 单位
    * isNullAble:1
    */
    private String materialUnit;

    /**
    * 最小订购量
    * isNullAble:1
    */
    private String materialOrderMinNum;

    /**
    * 交货周期
    * isNullAble:1
    */
    private String materialLeadTime;

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

    /**
    * 采购担当
    * isNullAble:1
    */
    private String materialBuyer;


    public void setMaterialContractId(Integer materialContractId){this.materialContractId = materialContractId;}

    public Integer getMaterialContractId(){return this.materialContractId;}

    public void setMaterialCode(String materialCode){this.materialCode = materialCode;}

    public String getMaterialCode(){return this.materialCode;}

    public void setMaterialName(String materialName){this.materialName = materialName;}

    public String getMaterialName(){return this.materialName;}

    public void setMaterialSpecs(String materialSpecs){this.materialSpecs = materialSpecs;}

    public String getMaterialSpecs(){return this.materialSpecs;}

    public void setMaterialBrand(String materialBrand){this.materialBrand = materialBrand;}

    public String getMaterialBrand(){return this.materialBrand;}

    public void setMaterialUnit(String materialUnit){this.materialUnit = materialUnit;}

    public String getMaterialUnit(){return this.materialUnit;}

    public void setMaterialOrderMinNum(String materialOrderMinNum){this.materialOrderMinNum = materialOrderMinNum;}

    public String getMaterialOrderMinNum(){return this.materialOrderMinNum;}

    public void setMaterialLeadTime(String materialLeadTime){this.materialLeadTime = materialLeadTime;}

    public String getMaterialLeadTime(){return this.materialLeadTime;}

    public void setSupplierCode(String supplierCode){this.supplierCode = supplierCode;}

    public String getSupplierCode(){return this.supplierCode;}

    public void setSupplierName(String supplierName){this.supplierName = supplierName;}

    public String getSupplierName(){return this.supplierName;}

    public void setMaterialBuyer(String materialBuyer){this.materialBuyer = materialBuyer;}

    public String getMaterialBuyer(){return this.materialBuyer;}
    @Override
    public String toString() {
        return "MaterialContract{" +
                "materialContractId='" + materialContractId + '\'' +
                "materialCode='" + materialCode + '\'' +
                "materialName='" + materialName + '\'' +
                "materialSpecs='" + materialSpecs + '\'' +
                "materialBrand='" + materialBrand + '\'' +
                "materialUnit='" + materialUnit + '\'' +
                "materialOrderMinNum='" + materialOrderMinNum + '\'' +
                "materialLeadTime='" + materialLeadTime + '\'' +
                "supplierCode='" + supplierCode + '\'' +
                "supplierName='" + supplierName + '\'' +
                "materialBuyer='" + materialBuyer + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MaterialContract set;

        private ConditionBuilder where;

        public UpdateBuilder set(MaterialContract set){
            this.set = set;
            return this;
        }

        public MaterialContract getSet(){
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

    public static class QueryBuilder extends MaterialContract{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> materialContractIdList;

        public List<Integer> getMaterialContractIdList(){return this.materialContractIdList;}

        private Integer materialContractIdSt;

        private Integer materialContractIdEd;

        public Integer getMaterialContractIdSt(){return this.materialContractIdSt;}

        public Integer getMaterialContractIdEd(){return this.materialContractIdEd;}

        private List<String> materialCodeList;

        public List<String> getMaterialCodeList(){return this.materialCodeList;}


        private List<String> fuzzyMaterialCode;

        public List<String> getFuzzyMaterialCode(){return this.fuzzyMaterialCode;}

        private List<String> rightFuzzyMaterialCode;

        public List<String> getRightFuzzyMaterialCode(){return this.rightFuzzyMaterialCode;}
        private List<String> materialNameList;

        public List<String> getMaterialNameList(){return this.materialNameList;}


        private List<String> fuzzyMaterialName;

        public List<String> getFuzzyMaterialName(){return this.fuzzyMaterialName;}

        private List<String> rightFuzzyMaterialName;

        public List<String> getRightFuzzyMaterialName(){return this.rightFuzzyMaterialName;}
        private List<String> materialSpecsList;

        public List<String> getMaterialSpecsList(){return this.materialSpecsList;}


        private List<String> fuzzyMaterialSpecs;

        public List<String> getFuzzyMaterialSpecs(){return this.fuzzyMaterialSpecs;}

        private List<String> rightFuzzyMaterialSpecs;

        public List<String> getRightFuzzyMaterialSpecs(){return this.rightFuzzyMaterialSpecs;}
        private List<String> materialBrandList;

        public List<String> getMaterialBrandList(){return this.materialBrandList;}


        private List<String> fuzzyMaterialBrand;

        public List<String> getFuzzyMaterialBrand(){return this.fuzzyMaterialBrand;}

        private List<String> rightFuzzyMaterialBrand;

        public List<String> getRightFuzzyMaterialBrand(){return this.rightFuzzyMaterialBrand;}
        private List<String> materialUnitList;

        public List<String> getMaterialUnitList(){return this.materialUnitList;}


        private List<String> fuzzyMaterialUnit;

        public List<String> getFuzzyMaterialUnit(){return this.fuzzyMaterialUnit;}

        private List<String> rightFuzzyMaterialUnit;

        public List<String> getRightFuzzyMaterialUnit(){return this.rightFuzzyMaterialUnit;}
        private List<String> materialOrderMinNumList;

        public List<String> getMaterialOrderMinNumList(){return this.materialOrderMinNumList;}


        private List<String> fuzzyMaterialOrderMinNum;

        public List<String> getFuzzyMaterialOrderMinNum(){return this.fuzzyMaterialOrderMinNum;}

        private List<String> rightFuzzyMaterialOrderMinNum;

        public List<String> getRightFuzzyMaterialOrderMinNum(){return this.rightFuzzyMaterialOrderMinNum;}
        private List<String> materialLeadTimeList;

        public List<String> getMaterialLeadTimeList(){return this.materialLeadTimeList;}


        private List<String> fuzzyMaterialLeadTime;

        public List<String> getFuzzyMaterialLeadTime(){return this.fuzzyMaterialLeadTime;}

        private List<String> rightFuzzyMaterialLeadTime;

        public List<String> getRightFuzzyMaterialLeadTime(){return this.rightFuzzyMaterialLeadTime;}
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
        private List<String> materialBuyerList;

        public List<String> getMaterialBuyerList(){return this.materialBuyerList;}


        private List<String> fuzzyMaterialBuyer;

        public List<String> getFuzzyMaterialBuyer(){return this.fuzzyMaterialBuyer;}

        private List<String> rightFuzzyMaterialBuyer;

        public List<String> getRightFuzzyMaterialBuyer(){return this.rightFuzzyMaterialBuyer;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder materialContractIdBetWeen(Integer materialContractIdSt,Integer materialContractIdEd){
            this.materialContractIdSt = materialContractIdSt;
            this.materialContractIdEd = materialContractIdEd;
            return this;
        }

        public QueryBuilder materialContractIdGreaterEqThan(Integer materialContractIdSt){
            this.materialContractIdSt = materialContractIdSt;
            return this;
        }
        public QueryBuilder materialContractIdLessEqThan(Integer materialContractIdEd){
            this.materialContractIdEd = materialContractIdEd;
            return this;
        }


        public QueryBuilder materialContractId(Integer materialContractId){
            setMaterialContractId(materialContractId);
            return this;
        }

        public QueryBuilder materialContractIdList(Integer ... materialContractId){
            this.materialContractIdList = solveNullList(materialContractId);
            return this;
        }

        public QueryBuilder materialContractIdList(List<Integer> materialContractId){
            this.materialContractIdList = materialContractId;
            return this;
        }

        public QueryBuilder fetchMaterialContractId(){
            setFetchFields("fetchFields","materialContractId");
            return this;
        }

        public QueryBuilder excludeMaterialContractId(){
            setFetchFields("excludeFields","materialContractId");
            return this;
        }

        public QueryBuilder fuzzyMaterialCode (List<String> fuzzyMaterialCode){
            this.fuzzyMaterialCode = fuzzyMaterialCode;
            return this;
        }

        public QueryBuilder fuzzyMaterialCode (String ... fuzzyMaterialCode){
            this.fuzzyMaterialCode = solveNullList(fuzzyMaterialCode);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialCode (List<String> rightFuzzyMaterialCode){
            this.rightFuzzyMaterialCode = rightFuzzyMaterialCode;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialCode (String ... rightFuzzyMaterialCode){
            this.rightFuzzyMaterialCode = solveNullList(rightFuzzyMaterialCode);
            return this;
        }

        public QueryBuilder materialCode(String materialCode){
            setMaterialCode(materialCode);
            return this;
        }

        public QueryBuilder materialCodeList(String ... materialCode){
            this.materialCodeList = solveNullList(materialCode);
            return this;
        }

        public QueryBuilder materialCodeList(List<String> materialCode){
            this.materialCodeList = materialCode;
            return this;
        }

        public QueryBuilder fetchMaterialCode(){
            setFetchFields("fetchFields","materialCode");
            return this;
        }

        public QueryBuilder excludeMaterialCode(){
            setFetchFields("excludeFields","materialCode");
            return this;
        }

        public QueryBuilder fuzzyMaterialName (List<String> fuzzyMaterialName){
            this.fuzzyMaterialName = fuzzyMaterialName;
            return this;
        }

        public QueryBuilder fuzzyMaterialName (String ... fuzzyMaterialName){
            this.fuzzyMaterialName = solveNullList(fuzzyMaterialName);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialName (List<String> rightFuzzyMaterialName){
            this.rightFuzzyMaterialName = rightFuzzyMaterialName;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialName (String ... rightFuzzyMaterialName){
            this.rightFuzzyMaterialName = solveNullList(rightFuzzyMaterialName);
            return this;
        }

        public QueryBuilder materialName(String materialName){
            setMaterialName(materialName);
            return this;
        }

        public QueryBuilder materialNameList(String ... materialName){
            this.materialNameList = solveNullList(materialName);
            return this;
        }

        public QueryBuilder materialNameList(List<String> materialName){
            this.materialNameList = materialName;
            return this;
        }

        public QueryBuilder fetchMaterialName(){
            setFetchFields("fetchFields","materialName");
            return this;
        }

        public QueryBuilder excludeMaterialName(){
            setFetchFields("excludeFields","materialName");
            return this;
        }

        public QueryBuilder fuzzyMaterialSpecs (List<String> fuzzyMaterialSpecs){
            this.fuzzyMaterialSpecs = fuzzyMaterialSpecs;
            return this;
        }

        public QueryBuilder fuzzyMaterialSpecs (String ... fuzzyMaterialSpecs){
            this.fuzzyMaterialSpecs = solveNullList(fuzzyMaterialSpecs);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialSpecs (List<String> rightFuzzyMaterialSpecs){
            this.rightFuzzyMaterialSpecs = rightFuzzyMaterialSpecs;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialSpecs (String ... rightFuzzyMaterialSpecs){
            this.rightFuzzyMaterialSpecs = solveNullList(rightFuzzyMaterialSpecs);
            return this;
        }

        public QueryBuilder materialSpecs(String materialSpecs){
            setMaterialSpecs(materialSpecs);
            return this;
        }

        public QueryBuilder materialSpecsList(String ... materialSpecs){
            this.materialSpecsList = solveNullList(materialSpecs);
            return this;
        }

        public QueryBuilder materialSpecsList(List<String> materialSpecs){
            this.materialSpecsList = materialSpecs;
            return this;
        }

        public QueryBuilder fetchMaterialSpecs(){
            setFetchFields("fetchFields","materialSpecs");
            return this;
        }

        public QueryBuilder excludeMaterialSpecs(){
            setFetchFields("excludeFields","materialSpecs");
            return this;
        }

        public QueryBuilder fuzzyMaterialBrand (List<String> fuzzyMaterialBrand){
            this.fuzzyMaterialBrand = fuzzyMaterialBrand;
            return this;
        }

        public QueryBuilder fuzzyMaterialBrand (String ... fuzzyMaterialBrand){
            this.fuzzyMaterialBrand = solveNullList(fuzzyMaterialBrand);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialBrand (List<String> rightFuzzyMaterialBrand){
            this.rightFuzzyMaterialBrand = rightFuzzyMaterialBrand;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialBrand (String ... rightFuzzyMaterialBrand){
            this.rightFuzzyMaterialBrand = solveNullList(rightFuzzyMaterialBrand);
            return this;
        }

        public QueryBuilder materialBrand(String materialBrand){
            setMaterialBrand(materialBrand);
            return this;
        }

        public QueryBuilder materialBrandList(String ... materialBrand){
            this.materialBrandList = solveNullList(materialBrand);
            return this;
        }

        public QueryBuilder materialBrandList(List<String> materialBrand){
            this.materialBrandList = materialBrand;
            return this;
        }

        public QueryBuilder fetchMaterialBrand(){
            setFetchFields("fetchFields","materialBrand");
            return this;
        }

        public QueryBuilder excludeMaterialBrand(){
            setFetchFields("excludeFields","materialBrand");
            return this;
        }

        public QueryBuilder fuzzyMaterialUnit (List<String> fuzzyMaterialUnit){
            this.fuzzyMaterialUnit = fuzzyMaterialUnit;
            return this;
        }

        public QueryBuilder fuzzyMaterialUnit (String ... fuzzyMaterialUnit){
            this.fuzzyMaterialUnit = solveNullList(fuzzyMaterialUnit);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialUnit (List<String> rightFuzzyMaterialUnit){
            this.rightFuzzyMaterialUnit = rightFuzzyMaterialUnit;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialUnit (String ... rightFuzzyMaterialUnit){
            this.rightFuzzyMaterialUnit = solveNullList(rightFuzzyMaterialUnit);
            return this;
        }

        public QueryBuilder materialUnit(String materialUnit){
            setMaterialUnit(materialUnit);
            return this;
        }

        public QueryBuilder materialUnitList(String ... materialUnit){
            this.materialUnitList = solveNullList(materialUnit);
            return this;
        }

        public QueryBuilder materialUnitList(List<String> materialUnit){
            this.materialUnitList = materialUnit;
            return this;
        }

        public QueryBuilder fetchMaterialUnit(){
            setFetchFields("fetchFields","materialUnit");
            return this;
        }

        public QueryBuilder excludeMaterialUnit(){
            setFetchFields("excludeFields","materialUnit");
            return this;
        }

        public QueryBuilder fuzzyMaterialOrderMinNum (List<String> fuzzyMaterialOrderMinNum){
            this.fuzzyMaterialOrderMinNum = fuzzyMaterialOrderMinNum;
            return this;
        }

        public QueryBuilder fuzzyMaterialOrderMinNum (String ... fuzzyMaterialOrderMinNum){
            this.fuzzyMaterialOrderMinNum = solveNullList(fuzzyMaterialOrderMinNum);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialOrderMinNum (List<String> rightFuzzyMaterialOrderMinNum){
            this.rightFuzzyMaterialOrderMinNum = rightFuzzyMaterialOrderMinNum;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialOrderMinNum (String ... rightFuzzyMaterialOrderMinNum){
            this.rightFuzzyMaterialOrderMinNum = solveNullList(rightFuzzyMaterialOrderMinNum);
            return this;
        }

        public QueryBuilder materialOrderMinNum(String materialOrderMinNum){
            setMaterialOrderMinNum(materialOrderMinNum);
            return this;
        }

        public QueryBuilder materialOrderMinNumList(String ... materialOrderMinNum){
            this.materialOrderMinNumList = solveNullList(materialOrderMinNum);
            return this;
        }

        public QueryBuilder materialOrderMinNumList(List<String> materialOrderMinNum){
            this.materialOrderMinNumList = materialOrderMinNum;
            return this;
        }

        public QueryBuilder fetchMaterialOrderMinNum(){
            setFetchFields("fetchFields","materialOrderMinNum");
            return this;
        }

        public QueryBuilder excludeMaterialOrderMinNum(){
            setFetchFields("excludeFields","materialOrderMinNum");
            return this;
        }

        public QueryBuilder fuzzyMaterialLeadTime (List<String> fuzzyMaterialLeadTime){
            this.fuzzyMaterialLeadTime = fuzzyMaterialLeadTime;
            return this;
        }

        public QueryBuilder fuzzyMaterialLeadTime (String ... fuzzyMaterialLeadTime){
            this.fuzzyMaterialLeadTime = solveNullList(fuzzyMaterialLeadTime);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialLeadTime (List<String> rightFuzzyMaterialLeadTime){
            this.rightFuzzyMaterialLeadTime = rightFuzzyMaterialLeadTime;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialLeadTime (String ... rightFuzzyMaterialLeadTime){
            this.rightFuzzyMaterialLeadTime = solveNullList(rightFuzzyMaterialLeadTime);
            return this;
        }

        public QueryBuilder materialLeadTime(String materialLeadTime){
            setMaterialLeadTime(materialLeadTime);
            return this;
        }

        public QueryBuilder materialLeadTimeList(String ... materialLeadTime){
            this.materialLeadTimeList = solveNullList(materialLeadTime);
            return this;
        }

        public QueryBuilder materialLeadTimeList(List<String> materialLeadTime){
            this.materialLeadTimeList = materialLeadTime;
            return this;
        }

        public QueryBuilder fetchMaterialLeadTime(){
            setFetchFields("fetchFields","materialLeadTime");
            return this;
        }

        public QueryBuilder excludeMaterialLeadTime(){
            setFetchFields("excludeFields","materialLeadTime");
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

        public QueryBuilder fuzzyMaterialBuyer (List<String> fuzzyMaterialBuyer){
            this.fuzzyMaterialBuyer = fuzzyMaterialBuyer;
            return this;
        }

        public QueryBuilder fuzzyMaterialBuyer (String ... fuzzyMaterialBuyer){
            this.fuzzyMaterialBuyer = solveNullList(fuzzyMaterialBuyer);
            return this;
        }

        public QueryBuilder rightFuzzyMaterialBuyer (List<String> rightFuzzyMaterialBuyer){
            this.rightFuzzyMaterialBuyer = rightFuzzyMaterialBuyer;
            return this;
        }

        public QueryBuilder rightFuzzyMaterialBuyer (String ... rightFuzzyMaterialBuyer){
            this.rightFuzzyMaterialBuyer = solveNullList(rightFuzzyMaterialBuyer);
            return this;
        }

        public QueryBuilder materialBuyer(String materialBuyer){
            setMaterialBuyer(materialBuyer);
            return this;
        }

        public QueryBuilder materialBuyerList(String ... materialBuyer){
            this.materialBuyerList = solveNullList(materialBuyer);
            return this;
        }

        public QueryBuilder materialBuyerList(List<String> materialBuyer){
            this.materialBuyerList = materialBuyer;
            return this;
        }

        public QueryBuilder fetchMaterialBuyer(){
            setFetchFields("fetchFields","materialBuyer");
            return this;
        }

        public QueryBuilder excludeMaterialBuyer(){
            setFetchFields("excludeFields","materialBuyer");
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

        public MaterialContract build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> materialContractIdList;

        public List<Integer> getMaterialContractIdList(){return this.materialContractIdList;}

        private Integer materialContractIdSt;

        private Integer materialContractIdEd;

        public Integer getMaterialContractIdSt(){return this.materialContractIdSt;}

        public Integer getMaterialContractIdEd(){return this.materialContractIdEd;}

        private List<String> materialCodeList;

        public List<String> getMaterialCodeList(){return this.materialCodeList;}


        private List<String> fuzzyMaterialCode;

        public List<String> getFuzzyMaterialCode(){return this.fuzzyMaterialCode;}

        private List<String> rightFuzzyMaterialCode;

        public List<String> getRightFuzzyMaterialCode(){return this.rightFuzzyMaterialCode;}
        private List<String> materialNameList;

        public List<String> getMaterialNameList(){return this.materialNameList;}


        private List<String> fuzzyMaterialName;

        public List<String> getFuzzyMaterialName(){return this.fuzzyMaterialName;}

        private List<String> rightFuzzyMaterialName;

        public List<String> getRightFuzzyMaterialName(){return this.rightFuzzyMaterialName;}
        private List<String> materialSpecsList;

        public List<String> getMaterialSpecsList(){return this.materialSpecsList;}


        private List<String> fuzzyMaterialSpecs;

        public List<String> getFuzzyMaterialSpecs(){return this.fuzzyMaterialSpecs;}

        private List<String> rightFuzzyMaterialSpecs;

        public List<String> getRightFuzzyMaterialSpecs(){return this.rightFuzzyMaterialSpecs;}
        private List<String> materialBrandList;

        public List<String> getMaterialBrandList(){return this.materialBrandList;}


        private List<String> fuzzyMaterialBrand;

        public List<String> getFuzzyMaterialBrand(){return this.fuzzyMaterialBrand;}

        private List<String> rightFuzzyMaterialBrand;

        public List<String> getRightFuzzyMaterialBrand(){return this.rightFuzzyMaterialBrand;}
        private List<String> materialUnitList;

        public List<String> getMaterialUnitList(){return this.materialUnitList;}


        private List<String> fuzzyMaterialUnit;

        public List<String> getFuzzyMaterialUnit(){return this.fuzzyMaterialUnit;}

        private List<String> rightFuzzyMaterialUnit;

        public List<String> getRightFuzzyMaterialUnit(){return this.rightFuzzyMaterialUnit;}
        private List<String> materialOrderMinNumList;

        public List<String> getMaterialOrderMinNumList(){return this.materialOrderMinNumList;}


        private List<String> fuzzyMaterialOrderMinNum;

        public List<String> getFuzzyMaterialOrderMinNum(){return this.fuzzyMaterialOrderMinNum;}

        private List<String> rightFuzzyMaterialOrderMinNum;

        public List<String> getRightFuzzyMaterialOrderMinNum(){return this.rightFuzzyMaterialOrderMinNum;}
        private List<String> materialLeadTimeList;

        public List<String> getMaterialLeadTimeList(){return this.materialLeadTimeList;}


        private List<String> fuzzyMaterialLeadTime;

        public List<String> getFuzzyMaterialLeadTime(){return this.fuzzyMaterialLeadTime;}

        private List<String> rightFuzzyMaterialLeadTime;

        public List<String> getRightFuzzyMaterialLeadTime(){return this.rightFuzzyMaterialLeadTime;}
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
        private List<String> materialBuyerList;

        public List<String> getMaterialBuyerList(){return this.materialBuyerList;}


        private List<String> fuzzyMaterialBuyer;

        public List<String> getFuzzyMaterialBuyer(){return this.fuzzyMaterialBuyer;}

        private List<String> rightFuzzyMaterialBuyer;

        public List<String> getRightFuzzyMaterialBuyer(){return this.rightFuzzyMaterialBuyer;}

        public ConditionBuilder materialContractIdBetWeen(Integer materialContractIdSt,Integer materialContractIdEd){
            this.materialContractIdSt = materialContractIdSt;
            this.materialContractIdEd = materialContractIdEd;
            return this;
        }

        public ConditionBuilder materialContractIdGreaterEqThan(Integer materialContractIdSt){
            this.materialContractIdSt = materialContractIdSt;
            return this;
        }
        public ConditionBuilder materialContractIdLessEqThan(Integer materialContractIdEd){
            this.materialContractIdEd = materialContractIdEd;
            return this;
        }


        public ConditionBuilder materialContractIdList(Integer ... materialContractId){
            this.materialContractIdList = solveNullList(materialContractId);
            return this;
        }

        public ConditionBuilder materialContractIdList(List<Integer> materialContractId){
            this.materialContractIdList = materialContractId;
            return this;
        }

        public ConditionBuilder fuzzyMaterialCode (List<String> fuzzyMaterialCode){
            this.fuzzyMaterialCode = fuzzyMaterialCode;
            return this;
        }

        public ConditionBuilder fuzzyMaterialCode (String ... fuzzyMaterialCode){
            this.fuzzyMaterialCode = solveNullList(fuzzyMaterialCode);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialCode (List<String> rightFuzzyMaterialCode){
            this.rightFuzzyMaterialCode = rightFuzzyMaterialCode;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialCode (String ... rightFuzzyMaterialCode){
            this.rightFuzzyMaterialCode = solveNullList(rightFuzzyMaterialCode);
            return this;
        }

        public ConditionBuilder materialCodeList(String ... materialCode){
            this.materialCodeList = solveNullList(materialCode);
            return this;
        }

        public ConditionBuilder materialCodeList(List<String> materialCode){
            this.materialCodeList = materialCode;
            return this;
        }

        public ConditionBuilder fuzzyMaterialName (List<String> fuzzyMaterialName){
            this.fuzzyMaterialName = fuzzyMaterialName;
            return this;
        }

        public ConditionBuilder fuzzyMaterialName (String ... fuzzyMaterialName){
            this.fuzzyMaterialName = solveNullList(fuzzyMaterialName);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialName (List<String> rightFuzzyMaterialName){
            this.rightFuzzyMaterialName = rightFuzzyMaterialName;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialName (String ... rightFuzzyMaterialName){
            this.rightFuzzyMaterialName = solveNullList(rightFuzzyMaterialName);
            return this;
        }

        public ConditionBuilder materialNameList(String ... materialName){
            this.materialNameList = solveNullList(materialName);
            return this;
        }

        public ConditionBuilder materialNameList(List<String> materialName){
            this.materialNameList = materialName;
            return this;
        }

        public ConditionBuilder fuzzyMaterialSpecs (List<String> fuzzyMaterialSpecs){
            this.fuzzyMaterialSpecs = fuzzyMaterialSpecs;
            return this;
        }

        public ConditionBuilder fuzzyMaterialSpecs (String ... fuzzyMaterialSpecs){
            this.fuzzyMaterialSpecs = solveNullList(fuzzyMaterialSpecs);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialSpecs (List<String> rightFuzzyMaterialSpecs){
            this.rightFuzzyMaterialSpecs = rightFuzzyMaterialSpecs;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialSpecs (String ... rightFuzzyMaterialSpecs){
            this.rightFuzzyMaterialSpecs = solveNullList(rightFuzzyMaterialSpecs);
            return this;
        }

        public ConditionBuilder materialSpecsList(String ... materialSpecs){
            this.materialSpecsList = solveNullList(materialSpecs);
            return this;
        }

        public ConditionBuilder materialSpecsList(List<String> materialSpecs){
            this.materialSpecsList = materialSpecs;
            return this;
        }

        public ConditionBuilder fuzzyMaterialBrand (List<String> fuzzyMaterialBrand){
            this.fuzzyMaterialBrand = fuzzyMaterialBrand;
            return this;
        }

        public ConditionBuilder fuzzyMaterialBrand (String ... fuzzyMaterialBrand){
            this.fuzzyMaterialBrand = solveNullList(fuzzyMaterialBrand);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialBrand (List<String> rightFuzzyMaterialBrand){
            this.rightFuzzyMaterialBrand = rightFuzzyMaterialBrand;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialBrand (String ... rightFuzzyMaterialBrand){
            this.rightFuzzyMaterialBrand = solveNullList(rightFuzzyMaterialBrand);
            return this;
        }

        public ConditionBuilder materialBrandList(String ... materialBrand){
            this.materialBrandList = solveNullList(materialBrand);
            return this;
        }

        public ConditionBuilder materialBrandList(List<String> materialBrand){
            this.materialBrandList = materialBrand;
            return this;
        }

        public ConditionBuilder fuzzyMaterialUnit (List<String> fuzzyMaterialUnit){
            this.fuzzyMaterialUnit = fuzzyMaterialUnit;
            return this;
        }

        public ConditionBuilder fuzzyMaterialUnit (String ... fuzzyMaterialUnit){
            this.fuzzyMaterialUnit = solveNullList(fuzzyMaterialUnit);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialUnit (List<String> rightFuzzyMaterialUnit){
            this.rightFuzzyMaterialUnit = rightFuzzyMaterialUnit;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialUnit (String ... rightFuzzyMaterialUnit){
            this.rightFuzzyMaterialUnit = solveNullList(rightFuzzyMaterialUnit);
            return this;
        }

        public ConditionBuilder materialUnitList(String ... materialUnit){
            this.materialUnitList = solveNullList(materialUnit);
            return this;
        }

        public ConditionBuilder materialUnitList(List<String> materialUnit){
            this.materialUnitList = materialUnit;
            return this;
        }

        public ConditionBuilder fuzzyMaterialOrderMinNum (List<String> fuzzyMaterialOrderMinNum){
            this.fuzzyMaterialOrderMinNum = fuzzyMaterialOrderMinNum;
            return this;
        }

        public ConditionBuilder fuzzyMaterialOrderMinNum (String ... fuzzyMaterialOrderMinNum){
            this.fuzzyMaterialOrderMinNum = solveNullList(fuzzyMaterialOrderMinNum);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialOrderMinNum (List<String> rightFuzzyMaterialOrderMinNum){
            this.rightFuzzyMaterialOrderMinNum = rightFuzzyMaterialOrderMinNum;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialOrderMinNum (String ... rightFuzzyMaterialOrderMinNum){
            this.rightFuzzyMaterialOrderMinNum = solveNullList(rightFuzzyMaterialOrderMinNum);
            return this;
        }

        public ConditionBuilder materialOrderMinNumList(String ... materialOrderMinNum){
            this.materialOrderMinNumList = solveNullList(materialOrderMinNum);
            return this;
        }

        public ConditionBuilder materialOrderMinNumList(List<String> materialOrderMinNum){
            this.materialOrderMinNumList = materialOrderMinNum;
            return this;
        }

        public ConditionBuilder fuzzyMaterialLeadTime (List<String> fuzzyMaterialLeadTime){
            this.fuzzyMaterialLeadTime = fuzzyMaterialLeadTime;
            return this;
        }

        public ConditionBuilder fuzzyMaterialLeadTime (String ... fuzzyMaterialLeadTime){
            this.fuzzyMaterialLeadTime = solveNullList(fuzzyMaterialLeadTime);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialLeadTime (List<String> rightFuzzyMaterialLeadTime){
            this.rightFuzzyMaterialLeadTime = rightFuzzyMaterialLeadTime;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialLeadTime (String ... rightFuzzyMaterialLeadTime){
            this.rightFuzzyMaterialLeadTime = solveNullList(rightFuzzyMaterialLeadTime);
            return this;
        }

        public ConditionBuilder materialLeadTimeList(String ... materialLeadTime){
            this.materialLeadTimeList = solveNullList(materialLeadTime);
            return this;
        }

        public ConditionBuilder materialLeadTimeList(List<String> materialLeadTime){
            this.materialLeadTimeList = materialLeadTime;
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

        public ConditionBuilder fuzzyMaterialBuyer (List<String> fuzzyMaterialBuyer){
            this.fuzzyMaterialBuyer = fuzzyMaterialBuyer;
            return this;
        }

        public ConditionBuilder fuzzyMaterialBuyer (String ... fuzzyMaterialBuyer){
            this.fuzzyMaterialBuyer = solveNullList(fuzzyMaterialBuyer);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialBuyer (List<String> rightFuzzyMaterialBuyer){
            this.rightFuzzyMaterialBuyer = rightFuzzyMaterialBuyer;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterialBuyer (String ... rightFuzzyMaterialBuyer){
            this.rightFuzzyMaterialBuyer = solveNullList(rightFuzzyMaterialBuyer);
            return this;
        }

        public ConditionBuilder materialBuyerList(String ... materialBuyer){
            this.materialBuyerList = solveNullList(materialBuyer);
            return this;
        }

        public ConditionBuilder materialBuyerList(List<String> materialBuyer){
            this.materialBuyerList = materialBuyer;
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

        private MaterialContract obj;

        public Builder(){
            this.obj = new MaterialContract();
        }

        public Builder materialContractId(Integer materialContractId){
            this.obj.setMaterialContractId(materialContractId);
            return this;
        }
        public Builder materialCode(String materialCode){
            this.obj.setMaterialCode(materialCode);
            return this;
        }
        public Builder materialName(String materialName){
            this.obj.setMaterialName(materialName);
            return this;
        }
        public Builder materialSpecs(String materialSpecs){
            this.obj.setMaterialSpecs(materialSpecs);
            return this;
        }
        public Builder materialBrand(String materialBrand){
            this.obj.setMaterialBrand(materialBrand);
            return this;
        }
        public Builder materialUnit(String materialUnit){
            this.obj.setMaterialUnit(materialUnit);
            return this;
        }
        public Builder materialOrderMinNum(String materialOrderMinNum){
            this.obj.setMaterialOrderMinNum(materialOrderMinNum);
            return this;
        }
        public Builder materialLeadTime(String materialLeadTime){
            this.obj.setMaterialLeadTime(materialLeadTime);
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
        public Builder materialBuyer(String materialBuyer){
            this.obj.setMaterialBuyer(materialBuyer);
            return this;
        }
        public MaterialContract build(){return obj;}
    }

}
