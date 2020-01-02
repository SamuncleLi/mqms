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
public class SparePartsOrder implements Serializable {

    private static final long serialVersionUID = 1564109276296L;


    /**
    * 主键
    * 备件订单id
    * isNullAble:0
    */
    private Integer sparePartsOrderId;

    /**
    * 订单id
    * isNullAble:1
    */
    private Long orderId;

    /**
    * 订单编号
    * isNullAble:1
    */
    private String orderCode;

    /**
    * 生产线
    * isNullAble:1
    */
    private String productionLine;

    /**
    * 工序号
    * isNullAble:1
    */
    private String operationPositionCode;

    /**
    * 设备厂家
    * isNullAble:1
    */
    private String equipmentCompany;

    /**
    * 品牌
    * isNullAble:1
    */
    private String sparePartsBrand;

    /**
    * 订购说明
    * isNullAble:1
    */
    private String sparePartsOrderDesc;

    /**
    * 紧急性
    * isNullAble:1
    */
    private String sparePartsEmergency;

    /**
    * 订购性质
    * isNullAble:1
    */
    private String sparePartsOrderReason;


    public void setSparePartsOrderId(Integer sparePartsOrderId){this.sparePartsOrderId = sparePartsOrderId;}

    public Integer getSparePartsOrderId(){return this.sparePartsOrderId;}

    public void setOrderId(Long orderId){this.orderId = orderId;}

    public Long getOrderId(){return this.orderId;}

    public void setOrderCode(String orderCode){this.orderCode = orderCode;}

    public String getOrderCode(){return this.orderCode;}

    public void setProductionLine(String productionLine){this.productionLine = productionLine;}

    public String getProductionLine(){return this.productionLine;}

    public void setOperationPositionCode(String operationPositionCode){this.operationPositionCode = operationPositionCode;}

    public String getOperationPositionCode(){return this.operationPositionCode;}

    public void setEquipmentCompany(String equipmentCompany){this.equipmentCompany = equipmentCompany;}

    public String getEquipmentCompany(){return this.equipmentCompany;}

    public void setSparePartsBrand(String sparePartsBrand){this.sparePartsBrand = sparePartsBrand;}

    public String getSparePartsBrand(){return this.sparePartsBrand;}

    public void setSparePartsOrderDesc(String sparePartsOrderDesc){this.sparePartsOrderDesc = sparePartsOrderDesc;}

    public String getSparePartsOrderDesc(){return this.sparePartsOrderDesc;}

    public void setSparePartsEmergency(String sparePartsEmergency){this.sparePartsEmergency = sparePartsEmergency;}

    public String getSparePartsEmergency(){return this.sparePartsEmergency;}

    public void setSparePartsOrderReason(String sparePartsOrderReason){this.sparePartsOrderReason = sparePartsOrderReason;}

    public String getSparePartsOrderReason(){return this.sparePartsOrderReason;}
    @Override
    public String toString() {
        return "SparePartsOrder{" +
                "sparePartsOrderId='" + sparePartsOrderId + '\'' +
                "orderId='" + orderId + '\'' +
                "orderCode='" + orderCode + '\'' +
                "productionLine='" + productionLine + '\'' +
                "operationPositionCode='" + operationPositionCode + '\'' +
                "equipmentCompany='" + equipmentCompany + '\'' +
                "sparePartsBrand='" + sparePartsBrand + '\'' +
                "sparePartsOrderDesc='" + sparePartsOrderDesc + '\'' +
                "sparePartsEmergency='" + sparePartsEmergency + '\'' +
                "sparePartsOrderReason='" + sparePartsOrderReason + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private SparePartsOrder set;

        private ConditionBuilder where;

        public UpdateBuilder set(SparePartsOrder set){
            this.set = set;
            return this;
        }

        public SparePartsOrder getSet(){
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

    public static class QueryBuilder extends SparePartsOrder{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> sparePartsOrderIdList;

        public List<Integer> getSparePartsOrderIdList(){return this.sparePartsOrderIdList;}

        private Integer sparePartsOrderIdSt;

        private Integer sparePartsOrderIdEd;

        public Integer getSparePartsOrderIdSt(){return this.sparePartsOrderIdSt;}

        public Integer getSparePartsOrderIdEd(){return this.sparePartsOrderIdEd;}

        private List<Long> orderIdList;

        public List<Long> getOrderIdList(){return this.orderIdList;}

        private Long orderIdSt;

        private Long orderIdEd;

        public Long getOrderIdSt(){return this.orderIdSt;}

        public Long getOrderIdEd(){return this.orderIdEd;}

        private List<String> orderCodeList;

        public List<String> getOrderCodeList(){return this.orderCodeList;}


        private List<String> fuzzyOrderCode;

        public List<String> getFuzzyOrderCode(){return this.fuzzyOrderCode;}

        private List<String> rightFuzzyOrderCode;

        public List<String> getRightFuzzyOrderCode(){return this.rightFuzzyOrderCode;}
        private List<String> productionLineList;

        public List<String> getProductionLineList(){return this.productionLineList;}


        private List<String> fuzzyProductionLine;

        public List<String> getFuzzyProductionLine(){return this.fuzzyProductionLine;}

        private List<String> rightFuzzyProductionLine;

        public List<String> getRightFuzzyProductionLine(){return this.rightFuzzyProductionLine;}
        private List<String> operationPositionCodeList;

        public List<String> getOperationPositionCodeList(){return this.operationPositionCodeList;}


        private List<String> fuzzyOperationPositionCode;

        public List<String> getFuzzyOperationPositionCode(){return this.fuzzyOperationPositionCode;}

        private List<String> rightFuzzyOperationPositionCode;

        public List<String> getRightFuzzyOperationPositionCode(){return this.rightFuzzyOperationPositionCode;}
        private List<String> equipmentCompanyList;

        public List<String> getEquipmentCompanyList(){return this.equipmentCompanyList;}


        private List<String> fuzzyEquipmentCompany;

        public List<String> getFuzzyEquipmentCompany(){return this.fuzzyEquipmentCompany;}

        private List<String> rightFuzzyEquipmentCompany;

        public List<String> getRightFuzzyEquipmentCompany(){return this.rightFuzzyEquipmentCompany;}
        private List<String> sparePartsBrandList;

        public List<String> getSparePartsBrandList(){return this.sparePartsBrandList;}


        private List<String> fuzzySparePartsBrand;

        public List<String> getFuzzySparePartsBrand(){return this.fuzzySparePartsBrand;}

        private List<String> rightFuzzySparePartsBrand;

        public List<String> getRightFuzzySparePartsBrand(){return this.rightFuzzySparePartsBrand;}
        private List<String> sparePartsOrderDescList;

        public List<String> getSparePartsOrderDescList(){return this.sparePartsOrderDescList;}


        private List<String> fuzzySparePartsOrderDesc;

        public List<String> getFuzzySparePartsOrderDesc(){return this.fuzzySparePartsOrderDesc;}

        private List<String> rightFuzzySparePartsOrderDesc;

        public List<String> getRightFuzzySparePartsOrderDesc(){return this.rightFuzzySparePartsOrderDesc;}
        private List<String> sparePartsEmergencyList;

        public List<String> getSparePartsEmergencyList(){return this.sparePartsEmergencyList;}


        private List<String> fuzzySparePartsEmergency;

        public List<String> getFuzzySparePartsEmergency(){return this.fuzzySparePartsEmergency;}

        private List<String> rightFuzzySparePartsEmergency;

        public List<String> getRightFuzzySparePartsEmergency(){return this.rightFuzzySparePartsEmergency;}
        private List<String> sparePartsOrderReasonList;

        public List<String> getSparePartsOrderReasonList(){return this.sparePartsOrderReasonList;}


        private List<String> fuzzySparePartsOrderReason;

        public List<String> getFuzzySparePartsOrderReason(){return this.fuzzySparePartsOrderReason;}

        private List<String> rightFuzzySparePartsOrderReason;

        public List<String> getRightFuzzySparePartsOrderReason(){return this.rightFuzzySparePartsOrderReason;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder sparePartsOrderIdBetWeen(Integer sparePartsOrderIdSt,Integer sparePartsOrderIdEd){
            this.sparePartsOrderIdSt = sparePartsOrderIdSt;
            this.sparePartsOrderIdEd = sparePartsOrderIdEd;
            return this;
        }

        public QueryBuilder sparePartsOrderIdGreaterEqThan(Integer sparePartsOrderIdSt){
            this.sparePartsOrderIdSt = sparePartsOrderIdSt;
            return this;
        }
        public QueryBuilder sparePartsOrderIdLessEqThan(Integer sparePartsOrderIdEd){
            this.sparePartsOrderIdEd = sparePartsOrderIdEd;
            return this;
        }


        public QueryBuilder sparePartsOrderId(Integer sparePartsOrderId){
            setSparePartsOrderId(sparePartsOrderId);
            return this;
        }

        public QueryBuilder sparePartsOrderIdList(Integer ... sparePartsOrderId){
            this.sparePartsOrderIdList = solveNullList(sparePartsOrderId);
            return this;
        }

        public QueryBuilder sparePartsOrderIdList(List<Integer> sparePartsOrderId){
            this.sparePartsOrderIdList = sparePartsOrderId;
            return this;
        }

        public QueryBuilder fetchSparePartsOrderId(){
            setFetchFields("fetchFields","sparePartsOrderId");
            return this;
        }

        public QueryBuilder excludeSparePartsOrderId(){
            setFetchFields("excludeFields","sparePartsOrderId");
            return this;
        }

        public QueryBuilder orderIdBetWeen(Long orderIdSt,Long orderIdEd){
            this.orderIdSt = orderIdSt;
            this.orderIdEd = orderIdEd;
            return this;
        }

        public QueryBuilder orderIdGreaterEqThan(Long orderIdSt){
            this.orderIdSt = orderIdSt;
            return this;
        }
        public QueryBuilder orderIdLessEqThan(Long orderIdEd){
            this.orderIdEd = orderIdEd;
            return this;
        }


        public QueryBuilder orderId(Long orderId){
            setOrderId(orderId);
            return this;
        }

        public QueryBuilder orderIdList(Long ... orderId){
            this.orderIdList = solveNullList(orderId);
            return this;
        }

        public QueryBuilder orderIdList(List<Long> orderId){
            this.orderIdList = orderId;
            return this;
        }

        public QueryBuilder fetchOrderId(){
            setFetchFields("fetchFields","orderId");
            return this;
        }

        public QueryBuilder excludeOrderId(){
            setFetchFields("excludeFields","orderId");
            return this;
        }

        public QueryBuilder fuzzyOrderCode (List<String> fuzzyOrderCode){
            this.fuzzyOrderCode = fuzzyOrderCode;
            return this;
        }

        public QueryBuilder fuzzyOrderCode (String ... fuzzyOrderCode){
            this.fuzzyOrderCode = solveNullList(fuzzyOrderCode);
            return this;
        }

        public QueryBuilder rightFuzzyOrderCode (List<String> rightFuzzyOrderCode){
            this.rightFuzzyOrderCode = rightFuzzyOrderCode;
            return this;
        }

        public QueryBuilder rightFuzzyOrderCode (String ... rightFuzzyOrderCode){
            this.rightFuzzyOrderCode = solveNullList(rightFuzzyOrderCode);
            return this;
        }

        public QueryBuilder orderCode(String orderCode){
            setOrderCode(orderCode);
            return this;
        }

        public QueryBuilder orderCodeList(String ... orderCode){
            this.orderCodeList = solveNullList(orderCode);
            return this;
        }

        public QueryBuilder orderCodeList(List<String> orderCode){
            this.orderCodeList = orderCode;
            return this;
        }

        public QueryBuilder fetchOrderCode(){
            setFetchFields("fetchFields","orderCode");
            return this;
        }

        public QueryBuilder excludeOrderCode(){
            setFetchFields("excludeFields","orderCode");
            return this;
        }

        public QueryBuilder fuzzyProductionLine (List<String> fuzzyProductionLine){
            this.fuzzyProductionLine = fuzzyProductionLine;
            return this;
        }

        public QueryBuilder fuzzyProductionLine (String ... fuzzyProductionLine){
            this.fuzzyProductionLine = solveNullList(fuzzyProductionLine);
            return this;
        }

        public QueryBuilder rightFuzzyProductionLine (List<String> rightFuzzyProductionLine){
            this.rightFuzzyProductionLine = rightFuzzyProductionLine;
            return this;
        }

        public QueryBuilder rightFuzzyProductionLine (String ... rightFuzzyProductionLine){
            this.rightFuzzyProductionLine = solveNullList(rightFuzzyProductionLine);
            return this;
        }

        public QueryBuilder productionLine(String productionLine){
            setProductionLine(productionLine);
            return this;
        }

        public QueryBuilder productionLineList(String ... productionLine){
            this.productionLineList = solveNullList(productionLine);
            return this;
        }

        public QueryBuilder productionLineList(List<String> productionLine){
            this.productionLineList = productionLine;
            return this;
        }

        public QueryBuilder fetchProductionLine(){
            setFetchFields("fetchFields","productionLine");
            return this;
        }

        public QueryBuilder excludeProductionLine(){
            setFetchFields("excludeFields","productionLine");
            return this;
        }

        public QueryBuilder fuzzyOperationPositionCode (List<String> fuzzyOperationPositionCode){
            this.fuzzyOperationPositionCode = fuzzyOperationPositionCode;
            return this;
        }

        public QueryBuilder fuzzyOperationPositionCode (String ... fuzzyOperationPositionCode){
            this.fuzzyOperationPositionCode = solveNullList(fuzzyOperationPositionCode);
            return this;
        }

        public QueryBuilder rightFuzzyOperationPositionCode (List<String> rightFuzzyOperationPositionCode){
            this.rightFuzzyOperationPositionCode = rightFuzzyOperationPositionCode;
            return this;
        }

        public QueryBuilder rightFuzzyOperationPositionCode (String ... rightFuzzyOperationPositionCode){
            this.rightFuzzyOperationPositionCode = solveNullList(rightFuzzyOperationPositionCode);
            return this;
        }

        public QueryBuilder operationPositionCode(String operationPositionCode){
            setOperationPositionCode(operationPositionCode);
            return this;
        }

        public QueryBuilder operationPositionCodeList(String ... operationPositionCode){
            this.operationPositionCodeList = solveNullList(operationPositionCode);
            return this;
        }

        public QueryBuilder operationPositionCodeList(List<String> operationPositionCode){
            this.operationPositionCodeList = operationPositionCode;
            return this;
        }

        public QueryBuilder fetchOperationPositionCode(){
            setFetchFields("fetchFields","operationPositionCode");
            return this;
        }

        public QueryBuilder excludeOperationPositionCode(){
            setFetchFields("excludeFields","operationPositionCode");
            return this;
        }

        public QueryBuilder fuzzyEquipmentCompany (List<String> fuzzyEquipmentCompany){
            this.fuzzyEquipmentCompany = fuzzyEquipmentCompany;
            return this;
        }

        public QueryBuilder fuzzyEquipmentCompany (String ... fuzzyEquipmentCompany){
            this.fuzzyEquipmentCompany = solveNullList(fuzzyEquipmentCompany);
            return this;
        }

        public QueryBuilder rightFuzzyEquipmentCompany (List<String> rightFuzzyEquipmentCompany){
            this.rightFuzzyEquipmentCompany = rightFuzzyEquipmentCompany;
            return this;
        }

        public QueryBuilder rightFuzzyEquipmentCompany (String ... rightFuzzyEquipmentCompany){
            this.rightFuzzyEquipmentCompany = solveNullList(rightFuzzyEquipmentCompany);
            return this;
        }

        public QueryBuilder equipmentCompany(String equipmentCompany){
            setEquipmentCompany(equipmentCompany);
            return this;
        }

        public QueryBuilder equipmentCompanyList(String ... equipmentCompany){
            this.equipmentCompanyList = solveNullList(equipmentCompany);
            return this;
        }

        public QueryBuilder equipmentCompanyList(List<String> equipmentCompany){
            this.equipmentCompanyList = equipmentCompany;
            return this;
        }

        public QueryBuilder fetchEquipmentCompany(){
            setFetchFields("fetchFields","equipmentCompany");
            return this;
        }

        public QueryBuilder excludeEquipmentCompany(){
            setFetchFields("excludeFields","equipmentCompany");
            return this;
        }

        public QueryBuilder fuzzySparePartsBrand (List<String> fuzzySparePartsBrand){
            this.fuzzySparePartsBrand = fuzzySparePartsBrand;
            return this;
        }

        public QueryBuilder fuzzySparePartsBrand (String ... fuzzySparePartsBrand){
            this.fuzzySparePartsBrand = solveNullList(fuzzySparePartsBrand);
            return this;
        }

        public QueryBuilder rightFuzzySparePartsBrand (List<String> rightFuzzySparePartsBrand){
            this.rightFuzzySparePartsBrand = rightFuzzySparePartsBrand;
            return this;
        }

        public QueryBuilder rightFuzzySparePartsBrand (String ... rightFuzzySparePartsBrand){
            this.rightFuzzySparePartsBrand = solveNullList(rightFuzzySparePartsBrand);
            return this;
        }

        public QueryBuilder sparePartsBrand(String sparePartsBrand){
            setSparePartsBrand(sparePartsBrand);
            return this;
        }

        public QueryBuilder sparePartsBrandList(String ... sparePartsBrand){
            this.sparePartsBrandList = solveNullList(sparePartsBrand);
            return this;
        }

        public QueryBuilder sparePartsBrandList(List<String> sparePartsBrand){
            this.sparePartsBrandList = sparePartsBrand;
            return this;
        }

        public QueryBuilder fetchSparePartsBrand(){
            setFetchFields("fetchFields","sparePartsBrand");
            return this;
        }

        public QueryBuilder excludeSparePartsBrand(){
            setFetchFields("excludeFields","sparePartsBrand");
            return this;
        }

        public QueryBuilder fuzzySparePartsOrderDesc (List<String> fuzzySparePartsOrderDesc){
            this.fuzzySparePartsOrderDesc = fuzzySparePartsOrderDesc;
            return this;
        }

        public QueryBuilder fuzzySparePartsOrderDesc (String ... fuzzySparePartsOrderDesc){
            this.fuzzySparePartsOrderDesc = solveNullList(fuzzySparePartsOrderDesc);
            return this;
        }

        public QueryBuilder rightFuzzySparePartsOrderDesc (List<String> rightFuzzySparePartsOrderDesc){
            this.rightFuzzySparePartsOrderDesc = rightFuzzySparePartsOrderDesc;
            return this;
        }

        public QueryBuilder rightFuzzySparePartsOrderDesc (String ... rightFuzzySparePartsOrderDesc){
            this.rightFuzzySparePartsOrderDesc = solveNullList(rightFuzzySparePartsOrderDesc);
            return this;
        }

        public QueryBuilder sparePartsOrderDesc(String sparePartsOrderDesc){
            setSparePartsOrderDesc(sparePartsOrderDesc);
            return this;
        }

        public QueryBuilder sparePartsOrderDescList(String ... sparePartsOrderDesc){
            this.sparePartsOrderDescList = solveNullList(sparePartsOrderDesc);
            return this;
        }

        public QueryBuilder sparePartsOrderDescList(List<String> sparePartsOrderDesc){
            this.sparePartsOrderDescList = sparePartsOrderDesc;
            return this;
        }

        public QueryBuilder fetchSparePartsOrderDesc(){
            setFetchFields("fetchFields","sparePartsOrderDesc");
            return this;
        }

        public QueryBuilder excludeSparePartsOrderDesc(){
            setFetchFields("excludeFields","sparePartsOrderDesc");
            return this;
        }

        public QueryBuilder fuzzySparePartsEmergency (List<String> fuzzySparePartsEmergency){
            this.fuzzySparePartsEmergency = fuzzySparePartsEmergency;
            return this;
        }

        public QueryBuilder fuzzySparePartsEmergency (String ... fuzzySparePartsEmergency){
            this.fuzzySparePartsEmergency = solveNullList(fuzzySparePartsEmergency);
            return this;
        }

        public QueryBuilder rightFuzzySparePartsEmergency (List<String> rightFuzzySparePartsEmergency){
            this.rightFuzzySparePartsEmergency = rightFuzzySparePartsEmergency;
            return this;
        }

        public QueryBuilder rightFuzzySparePartsEmergency (String ... rightFuzzySparePartsEmergency){
            this.rightFuzzySparePartsEmergency = solveNullList(rightFuzzySparePartsEmergency);
            return this;
        }

        public QueryBuilder sparePartsEmergency(String sparePartsEmergency){
            setSparePartsEmergency(sparePartsEmergency);
            return this;
        }

        public QueryBuilder sparePartsEmergencyList(String ... sparePartsEmergency){
            this.sparePartsEmergencyList = solveNullList(sparePartsEmergency);
            return this;
        }

        public QueryBuilder sparePartsEmergencyList(List<String> sparePartsEmergency){
            this.sparePartsEmergencyList = sparePartsEmergency;
            return this;
        }

        public QueryBuilder fetchSparePartsEmergency(){
            setFetchFields("fetchFields","sparePartsEmergency");
            return this;
        }

        public QueryBuilder excludeSparePartsEmergency(){
            setFetchFields("excludeFields","sparePartsEmergency");
            return this;
        }

        public QueryBuilder fuzzySparePartsOrderReason (List<String> fuzzySparePartsOrderReason){
            this.fuzzySparePartsOrderReason = fuzzySparePartsOrderReason;
            return this;
        }

        public QueryBuilder fuzzySparePartsOrderReason (String ... fuzzySparePartsOrderReason){
            this.fuzzySparePartsOrderReason = solveNullList(fuzzySparePartsOrderReason);
            return this;
        }

        public QueryBuilder rightFuzzySparePartsOrderReason (List<String> rightFuzzySparePartsOrderReason){
            this.rightFuzzySparePartsOrderReason = rightFuzzySparePartsOrderReason;
            return this;
        }

        public QueryBuilder rightFuzzySparePartsOrderReason (String ... rightFuzzySparePartsOrderReason){
            this.rightFuzzySparePartsOrderReason = solveNullList(rightFuzzySparePartsOrderReason);
            return this;
        }

        public QueryBuilder sparePartsOrderReason(String sparePartsOrderReason){
            setSparePartsOrderReason(sparePartsOrderReason);
            return this;
        }

        public QueryBuilder sparePartsOrderReasonList(String ... sparePartsOrderReason){
            this.sparePartsOrderReasonList = solveNullList(sparePartsOrderReason);
            return this;
        }

        public QueryBuilder sparePartsOrderReasonList(List<String> sparePartsOrderReason){
            this.sparePartsOrderReasonList = sparePartsOrderReason;
            return this;
        }

        public QueryBuilder fetchSparePartsOrderReason(){
            setFetchFields("fetchFields","sparePartsOrderReason");
            return this;
        }

        public QueryBuilder excludeSparePartsOrderReason(){
            setFetchFields("excludeFields","sparePartsOrderReason");
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

        public SparePartsOrder build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> sparePartsOrderIdList;

        public List<Integer> getSparePartsOrderIdList(){return this.sparePartsOrderIdList;}

        private Integer sparePartsOrderIdSt;

        private Integer sparePartsOrderIdEd;

        public Integer getSparePartsOrderIdSt(){return this.sparePartsOrderIdSt;}

        public Integer getSparePartsOrderIdEd(){return this.sparePartsOrderIdEd;}

        private List<Long> orderIdList;

        public List<Long> getOrderIdList(){return this.orderIdList;}

        private Long orderIdSt;

        private Long orderIdEd;

        public Long getOrderIdSt(){return this.orderIdSt;}

        public Long getOrderIdEd(){return this.orderIdEd;}

        private List<String> orderCodeList;

        public List<String> getOrderCodeList(){return this.orderCodeList;}


        private List<String> fuzzyOrderCode;

        public List<String> getFuzzyOrderCode(){return this.fuzzyOrderCode;}

        private List<String> rightFuzzyOrderCode;

        public List<String> getRightFuzzyOrderCode(){return this.rightFuzzyOrderCode;}
        private List<String> productionLineList;

        public List<String> getProductionLineList(){return this.productionLineList;}


        private List<String> fuzzyProductionLine;

        public List<String> getFuzzyProductionLine(){return this.fuzzyProductionLine;}

        private List<String> rightFuzzyProductionLine;

        public List<String> getRightFuzzyProductionLine(){return this.rightFuzzyProductionLine;}
        private List<String> operationPositionCodeList;

        public List<String> getOperationPositionCodeList(){return this.operationPositionCodeList;}


        private List<String> fuzzyOperationPositionCode;

        public List<String> getFuzzyOperationPositionCode(){return this.fuzzyOperationPositionCode;}

        private List<String> rightFuzzyOperationPositionCode;

        public List<String> getRightFuzzyOperationPositionCode(){return this.rightFuzzyOperationPositionCode;}
        private List<String> equipmentCompanyList;

        public List<String> getEquipmentCompanyList(){return this.equipmentCompanyList;}


        private List<String> fuzzyEquipmentCompany;

        public List<String> getFuzzyEquipmentCompany(){return this.fuzzyEquipmentCompany;}

        private List<String> rightFuzzyEquipmentCompany;

        public List<String> getRightFuzzyEquipmentCompany(){return this.rightFuzzyEquipmentCompany;}
        private List<String> sparePartsBrandList;

        public List<String> getSparePartsBrandList(){return this.sparePartsBrandList;}


        private List<String> fuzzySparePartsBrand;

        public List<String> getFuzzySparePartsBrand(){return this.fuzzySparePartsBrand;}

        private List<String> rightFuzzySparePartsBrand;

        public List<String> getRightFuzzySparePartsBrand(){return this.rightFuzzySparePartsBrand;}
        private List<String> sparePartsOrderDescList;

        public List<String> getSparePartsOrderDescList(){return this.sparePartsOrderDescList;}


        private List<String> fuzzySparePartsOrderDesc;

        public List<String> getFuzzySparePartsOrderDesc(){return this.fuzzySparePartsOrderDesc;}

        private List<String> rightFuzzySparePartsOrderDesc;

        public List<String> getRightFuzzySparePartsOrderDesc(){return this.rightFuzzySparePartsOrderDesc;}
        private List<String> sparePartsEmergencyList;

        public List<String> getSparePartsEmergencyList(){return this.sparePartsEmergencyList;}


        private List<String> fuzzySparePartsEmergency;

        public List<String> getFuzzySparePartsEmergency(){return this.fuzzySparePartsEmergency;}

        private List<String> rightFuzzySparePartsEmergency;

        public List<String> getRightFuzzySparePartsEmergency(){return this.rightFuzzySparePartsEmergency;}
        private List<String> sparePartsOrderReasonList;

        public List<String> getSparePartsOrderReasonList(){return this.sparePartsOrderReasonList;}


        private List<String> fuzzySparePartsOrderReason;

        public List<String> getFuzzySparePartsOrderReason(){return this.fuzzySparePartsOrderReason;}

        private List<String> rightFuzzySparePartsOrderReason;

        public List<String> getRightFuzzySparePartsOrderReason(){return this.rightFuzzySparePartsOrderReason;}

        public ConditionBuilder sparePartsOrderIdBetWeen(Integer sparePartsOrderIdSt,Integer sparePartsOrderIdEd){
            this.sparePartsOrderIdSt = sparePartsOrderIdSt;
            this.sparePartsOrderIdEd = sparePartsOrderIdEd;
            return this;
        }

        public ConditionBuilder sparePartsOrderIdGreaterEqThan(Integer sparePartsOrderIdSt){
            this.sparePartsOrderIdSt = sparePartsOrderIdSt;
            return this;
        }
        public ConditionBuilder sparePartsOrderIdLessEqThan(Integer sparePartsOrderIdEd){
            this.sparePartsOrderIdEd = sparePartsOrderIdEd;
            return this;
        }


        public ConditionBuilder sparePartsOrderIdList(Integer ... sparePartsOrderId){
            this.sparePartsOrderIdList = solveNullList(sparePartsOrderId);
            return this;
        }

        public ConditionBuilder sparePartsOrderIdList(List<Integer> sparePartsOrderId){
            this.sparePartsOrderIdList = sparePartsOrderId;
            return this;
        }

        public ConditionBuilder orderIdBetWeen(Long orderIdSt,Long orderIdEd){
            this.orderIdSt = orderIdSt;
            this.orderIdEd = orderIdEd;
            return this;
        }

        public ConditionBuilder orderIdGreaterEqThan(Long orderIdSt){
            this.orderIdSt = orderIdSt;
            return this;
        }
        public ConditionBuilder orderIdLessEqThan(Long orderIdEd){
            this.orderIdEd = orderIdEd;
            return this;
        }


        public ConditionBuilder orderIdList(Long ... orderId){
            this.orderIdList = solveNullList(orderId);
            return this;
        }

        public ConditionBuilder orderIdList(List<Long> orderId){
            this.orderIdList = orderId;
            return this;
        }

        public ConditionBuilder fuzzyOrderCode (List<String> fuzzyOrderCode){
            this.fuzzyOrderCode = fuzzyOrderCode;
            return this;
        }

        public ConditionBuilder fuzzyOrderCode (String ... fuzzyOrderCode){
            this.fuzzyOrderCode = solveNullList(fuzzyOrderCode);
            return this;
        }

        public ConditionBuilder rightFuzzyOrderCode (List<String> rightFuzzyOrderCode){
            this.rightFuzzyOrderCode = rightFuzzyOrderCode;
            return this;
        }

        public ConditionBuilder rightFuzzyOrderCode (String ... rightFuzzyOrderCode){
            this.rightFuzzyOrderCode = solveNullList(rightFuzzyOrderCode);
            return this;
        }

        public ConditionBuilder orderCodeList(String ... orderCode){
            this.orderCodeList = solveNullList(orderCode);
            return this;
        }

        public ConditionBuilder orderCodeList(List<String> orderCode){
            this.orderCodeList = orderCode;
            return this;
        }

        public ConditionBuilder fuzzyProductionLine (List<String> fuzzyProductionLine){
            this.fuzzyProductionLine = fuzzyProductionLine;
            return this;
        }

        public ConditionBuilder fuzzyProductionLine (String ... fuzzyProductionLine){
            this.fuzzyProductionLine = solveNullList(fuzzyProductionLine);
            return this;
        }

        public ConditionBuilder rightFuzzyProductionLine (List<String> rightFuzzyProductionLine){
            this.rightFuzzyProductionLine = rightFuzzyProductionLine;
            return this;
        }

        public ConditionBuilder rightFuzzyProductionLine (String ... rightFuzzyProductionLine){
            this.rightFuzzyProductionLine = solveNullList(rightFuzzyProductionLine);
            return this;
        }

        public ConditionBuilder productionLineList(String ... productionLine){
            this.productionLineList = solveNullList(productionLine);
            return this;
        }

        public ConditionBuilder productionLineList(List<String> productionLine){
            this.productionLineList = productionLine;
            return this;
        }

        public ConditionBuilder fuzzyOperationPositionCode (List<String> fuzzyOperationPositionCode){
            this.fuzzyOperationPositionCode = fuzzyOperationPositionCode;
            return this;
        }

        public ConditionBuilder fuzzyOperationPositionCode (String ... fuzzyOperationPositionCode){
            this.fuzzyOperationPositionCode = solveNullList(fuzzyOperationPositionCode);
            return this;
        }

        public ConditionBuilder rightFuzzyOperationPositionCode (List<String> rightFuzzyOperationPositionCode){
            this.rightFuzzyOperationPositionCode = rightFuzzyOperationPositionCode;
            return this;
        }

        public ConditionBuilder rightFuzzyOperationPositionCode (String ... rightFuzzyOperationPositionCode){
            this.rightFuzzyOperationPositionCode = solveNullList(rightFuzzyOperationPositionCode);
            return this;
        }

        public ConditionBuilder operationPositionCodeList(String ... operationPositionCode){
            this.operationPositionCodeList = solveNullList(operationPositionCode);
            return this;
        }

        public ConditionBuilder operationPositionCodeList(List<String> operationPositionCode){
            this.operationPositionCodeList = operationPositionCode;
            return this;
        }

        public ConditionBuilder fuzzyEquipmentCompany (List<String> fuzzyEquipmentCompany){
            this.fuzzyEquipmentCompany = fuzzyEquipmentCompany;
            return this;
        }

        public ConditionBuilder fuzzyEquipmentCompany (String ... fuzzyEquipmentCompany){
            this.fuzzyEquipmentCompany = solveNullList(fuzzyEquipmentCompany);
            return this;
        }

        public ConditionBuilder rightFuzzyEquipmentCompany (List<String> rightFuzzyEquipmentCompany){
            this.rightFuzzyEquipmentCompany = rightFuzzyEquipmentCompany;
            return this;
        }

        public ConditionBuilder rightFuzzyEquipmentCompany (String ... rightFuzzyEquipmentCompany){
            this.rightFuzzyEquipmentCompany = solveNullList(rightFuzzyEquipmentCompany);
            return this;
        }

        public ConditionBuilder equipmentCompanyList(String ... equipmentCompany){
            this.equipmentCompanyList = solveNullList(equipmentCompany);
            return this;
        }

        public ConditionBuilder equipmentCompanyList(List<String> equipmentCompany){
            this.equipmentCompanyList = equipmentCompany;
            return this;
        }

        public ConditionBuilder fuzzySparePartsBrand (List<String> fuzzySparePartsBrand){
            this.fuzzySparePartsBrand = fuzzySparePartsBrand;
            return this;
        }

        public ConditionBuilder fuzzySparePartsBrand (String ... fuzzySparePartsBrand){
            this.fuzzySparePartsBrand = solveNullList(fuzzySparePartsBrand);
            return this;
        }

        public ConditionBuilder rightFuzzySparePartsBrand (List<String> rightFuzzySparePartsBrand){
            this.rightFuzzySparePartsBrand = rightFuzzySparePartsBrand;
            return this;
        }

        public ConditionBuilder rightFuzzySparePartsBrand (String ... rightFuzzySparePartsBrand){
            this.rightFuzzySparePartsBrand = solveNullList(rightFuzzySparePartsBrand);
            return this;
        }

        public ConditionBuilder sparePartsBrandList(String ... sparePartsBrand){
            this.sparePartsBrandList = solveNullList(sparePartsBrand);
            return this;
        }

        public ConditionBuilder sparePartsBrandList(List<String> sparePartsBrand){
            this.sparePartsBrandList = sparePartsBrand;
            return this;
        }

        public ConditionBuilder fuzzySparePartsOrderDesc (List<String> fuzzySparePartsOrderDesc){
            this.fuzzySparePartsOrderDesc = fuzzySparePartsOrderDesc;
            return this;
        }

        public ConditionBuilder fuzzySparePartsOrderDesc (String ... fuzzySparePartsOrderDesc){
            this.fuzzySparePartsOrderDesc = solveNullList(fuzzySparePartsOrderDesc);
            return this;
        }

        public ConditionBuilder rightFuzzySparePartsOrderDesc (List<String> rightFuzzySparePartsOrderDesc){
            this.rightFuzzySparePartsOrderDesc = rightFuzzySparePartsOrderDesc;
            return this;
        }

        public ConditionBuilder rightFuzzySparePartsOrderDesc (String ... rightFuzzySparePartsOrderDesc){
            this.rightFuzzySparePartsOrderDesc = solveNullList(rightFuzzySparePartsOrderDesc);
            return this;
        }

        public ConditionBuilder sparePartsOrderDescList(String ... sparePartsOrderDesc){
            this.sparePartsOrderDescList = solveNullList(sparePartsOrderDesc);
            return this;
        }

        public ConditionBuilder sparePartsOrderDescList(List<String> sparePartsOrderDesc){
            this.sparePartsOrderDescList = sparePartsOrderDesc;
            return this;
        }

        public ConditionBuilder fuzzySparePartsEmergency (List<String> fuzzySparePartsEmergency){
            this.fuzzySparePartsEmergency = fuzzySparePartsEmergency;
            return this;
        }

        public ConditionBuilder fuzzySparePartsEmergency (String ... fuzzySparePartsEmergency){
            this.fuzzySparePartsEmergency = solveNullList(fuzzySparePartsEmergency);
            return this;
        }

        public ConditionBuilder rightFuzzySparePartsEmergency (List<String> rightFuzzySparePartsEmergency){
            this.rightFuzzySparePartsEmergency = rightFuzzySparePartsEmergency;
            return this;
        }

        public ConditionBuilder rightFuzzySparePartsEmergency (String ... rightFuzzySparePartsEmergency){
            this.rightFuzzySparePartsEmergency = solveNullList(rightFuzzySparePartsEmergency);
            return this;
        }

        public ConditionBuilder sparePartsEmergencyList(String ... sparePartsEmergency){
            this.sparePartsEmergencyList = solveNullList(sparePartsEmergency);
            return this;
        }

        public ConditionBuilder sparePartsEmergencyList(List<String> sparePartsEmergency){
            this.sparePartsEmergencyList = sparePartsEmergency;
            return this;
        }

        public ConditionBuilder fuzzySparePartsOrderReason (List<String> fuzzySparePartsOrderReason){
            this.fuzzySparePartsOrderReason = fuzzySparePartsOrderReason;
            return this;
        }

        public ConditionBuilder fuzzySparePartsOrderReason (String ... fuzzySparePartsOrderReason){
            this.fuzzySparePartsOrderReason = solveNullList(fuzzySparePartsOrderReason);
            return this;
        }

        public ConditionBuilder rightFuzzySparePartsOrderReason (List<String> rightFuzzySparePartsOrderReason){
            this.rightFuzzySparePartsOrderReason = rightFuzzySparePartsOrderReason;
            return this;
        }

        public ConditionBuilder rightFuzzySparePartsOrderReason (String ... rightFuzzySparePartsOrderReason){
            this.rightFuzzySparePartsOrderReason = solveNullList(rightFuzzySparePartsOrderReason);
            return this;
        }

        public ConditionBuilder sparePartsOrderReasonList(String ... sparePartsOrderReason){
            this.sparePartsOrderReasonList = solveNullList(sparePartsOrderReason);
            return this;
        }

        public ConditionBuilder sparePartsOrderReasonList(List<String> sparePartsOrderReason){
            this.sparePartsOrderReasonList = sparePartsOrderReason;
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

        private SparePartsOrder obj;

        public Builder(){
            this.obj = new SparePartsOrder();
        }

        public Builder sparePartsOrderId(Integer sparePartsOrderId){
            this.obj.setSparePartsOrderId(sparePartsOrderId);
            return this;
        }
        public Builder orderId(Long orderId){
            this.obj.setOrderId(orderId);
            return this;
        }
        public Builder orderCode(String orderCode){
            this.obj.setOrderCode(orderCode);
            return this;
        }
        public Builder productionLine(String productionLine){
            this.obj.setProductionLine(productionLine);
            return this;
        }
        public Builder operationPositionCode(String operationPositionCode){
            this.obj.setOperationPositionCode(operationPositionCode);
            return this;
        }
        public Builder equipmentCompany(String equipmentCompany){
            this.obj.setEquipmentCompany(equipmentCompany);
            return this;
        }
        public Builder sparePartsBrand(String sparePartsBrand){
            this.obj.setSparePartsBrand(sparePartsBrand);
            return this;
        }
        public Builder sparePartsOrderDesc(String sparePartsOrderDesc){
            this.obj.setSparePartsOrderDesc(sparePartsOrderDesc);
            return this;
        }
        public Builder sparePartsEmergency(String sparePartsEmergency){
            this.obj.setSparePartsEmergency(sparePartsEmergency);
            return this;
        }
        public Builder sparePartsOrderReason(String sparePartsOrderReason){
            this.obj.setSparePartsOrderReason(sparePartsOrderReason);
            return this;
        }
        public SparePartsOrder build(){return obj;}
    }

}
