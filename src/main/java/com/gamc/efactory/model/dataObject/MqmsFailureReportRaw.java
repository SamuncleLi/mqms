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
public class MqmsFailureReportRaw implements Serializable {

    private static final long serialVersionUID = 1578469863655L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer voucherId;

    /**
    * 
    * isNullAble:1
    */
    private String voucherCode;

    /**
    * 
    * isNullAble:1
    */
    private String voucher;


    public void setVoucherId(Integer voucherId){this.voucherId = voucherId;}

    public Integer getVoucherId(){return this.voucherId;}

    public void setVoucherCode(String voucherCode){this.voucherCode = voucherCode;}

    public String getVoucherCode(){return this.voucherCode;}

    public void setVoucher(String voucher){this.voucher = voucher;}

    public String getVoucher(){return this.voucher;}
    @Override
    public String toString() {
        return "MqmsFailureReportRaw{" +
                "voucherId='" + voucherId + '\'' +
                "voucherCode='" + voucherCode + '\'' +
                "voucher='" + voucher + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MqmsFailureReportRaw set;

        private ConditionBuilder where;

        public UpdateBuilder set(MqmsFailureReportRaw set){
            this.set = set;
            return this;
        }

        public MqmsFailureReportRaw getSet(){
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

    public static class QueryBuilder extends MqmsFailureReportRaw{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> voucherIdList;

        public List<Integer> getVoucherIdList(){return this.voucherIdList;}

        private Integer voucherIdSt;

        private Integer voucherIdEd;

        public Integer getVoucherIdSt(){return this.voucherIdSt;}

        public Integer getVoucherIdEd(){return this.voucherIdEd;}

        private List<String> voucherCodeList;

        public List<String> getVoucherCodeList(){return this.voucherCodeList;}


        private List<String> fuzzyVoucherCode;

        public List<String> getFuzzyVoucherCode(){return this.fuzzyVoucherCode;}

        private List<String> rightFuzzyVoucherCode;

        public List<String> getRightFuzzyVoucherCode(){return this.rightFuzzyVoucherCode;}
        private List<String> voucherList;

        public List<String> getVoucherList(){return this.voucherList;}


        private List<String> fuzzyVoucher;

        public List<String> getFuzzyVoucher(){return this.fuzzyVoucher;}

        private List<String> rightFuzzyVoucher;

        public List<String> getRightFuzzyVoucher(){return this.rightFuzzyVoucher;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder voucherIdBetWeen(Integer voucherIdSt,Integer voucherIdEd){
            this.voucherIdSt = voucherIdSt;
            this.voucherIdEd = voucherIdEd;
            return this;
        }

        public QueryBuilder voucherIdGreaterEqThan(Integer voucherIdSt){
            this.voucherIdSt = voucherIdSt;
            return this;
        }
        public QueryBuilder voucherIdLessEqThan(Integer voucherIdEd){
            this.voucherIdEd = voucherIdEd;
            return this;
        }


        public QueryBuilder voucherId(Integer voucherId){
            setVoucherId(voucherId);
            return this;
        }

        public QueryBuilder voucherIdList(Integer ... voucherId){
            this.voucherIdList = solveNullList(voucherId);
            return this;
        }

        public QueryBuilder voucherIdList(List<Integer> voucherId){
            this.voucherIdList = voucherId;
            return this;
        }

        public QueryBuilder fetchVoucherId(){
            setFetchFields("fetchFields","voucherId");
            return this;
        }

        public QueryBuilder excludeVoucherId(){
            setFetchFields("excludeFields","voucherId");
            return this;
        }

        public QueryBuilder fuzzyVoucherCode (List<String> fuzzyVoucherCode){
            this.fuzzyVoucherCode = fuzzyVoucherCode;
            return this;
        }

        public QueryBuilder fuzzyVoucherCode (String ... fuzzyVoucherCode){
            this.fuzzyVoucherCode = solveNullList(fuzzyVoucherCode);
            return this;
        }

        public QueryBuilder rightFuzzyVoucherCode (List<String> rightFuzzyVoucherCode){
            this.rightFuzzyVoucherCode = rightFuzzyVoucherCode;
            return this;
        }

        public QueryBuilder rightFuzzyVoucherCode (String ... rightFuzzyVoucherCode){
            this.rightFuzzyVoucherCode = solveNullList(rightFuzzyVoucherCode);
            return this;
        }

        public QueryBuilder voucherCode(String voucherCode){
            setVoucherCode(voucherCode);
            return this;
        }

        public QueryBuilder voucherCodeList(String ... voucherCode){
            this.voucherCodeList = solveNullList(voucherCode);
            return this;
        }

        public QueryBuilder voucherCodeList(List<String> voucherCode){
            this.voucherCodeList = voucherCode;
            return this;
        }

        public QueryBuilder fetchVoucherCode(){
            setFetchFields("fetchFields","voucherCode");
            return this;
        }

        public QueryBuilder excludeVoucherCode(){
            setFetchFields("excludeFields","voucherCode");
            return this;
        }

        public QueryBuilder fuzzyVoucher (List<String> fuzzyVoucher){
            this.fuzzyVoucher = fuzzyVoucher;
            return this;
        }

        public QueryBuilder fuzzyVoucher (String ... fuzzyVoucher){
            this.fuzzyVoucher = solveNullList(fuzzyVoucher);
            return this;
        }

        public QueryBuilder rightFuzzyVoucher (List<String> rightFuzzyVoucher){
            this.rightFuzzyVoucher = rightFuzzyVoucher;
            return this;
        }

        public QueryBuilder rightFuzzyVoucher (String ... rightFuzzyVoucher){
            this.rightFuzzyVoucher = solveNullList(rightFuzzyVoucher);
            return this;
        }

        public QueryBuilder voucher(String voucher){
            setVoucher(voucher);
            return this;
        }

        public QueryBuilder voucherList(String ... voucher){
            this.voucherList = solveNullList(voucher);
            return this;
        }

        public QueryBuilder voucherList(List<String> voucher){
            this.voucherList = voucher;
            return this;
        }

        public QueryBuilder fetchVoucher(){
            setFetchFields("fetchFields","voucher");
            return this;
        }

        public QueryBuilder excludeVoucher(){
            setFetchFields("excludeFields","voucher");
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

        public MqmsFailureReportRaw build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> voucherIdList;

        public List<Integer> getVoucherIdList(){return this.voucherIdList;}

        private Integer voucherIdSt;

        private Integer voucherIdEd;

        public Integer getVoucherIdSt(){return this.voucherIdSt;}

        public Integer getVoucherIdEd(){return this.voucherIdEd;}

        private List<String> voucherCodeList;

        public List<String> getVoucherCodeList(){return this.voucherCodeList;}


        private List<String> fuzzyVoucherCode;

        public List<String> getFuzzyVoucherCode(){return this.fuzzyVoucherCode;}

        private List<String> rightFuzzyVoucherCode;

        public List<String> getRightFuzzyVoucherCode(){return this.rightFuzzyVoucherCode;}
        private List<String> voucherList;

        public List<String> getVoucherList(){return this.voucherList;}


        private List<String> fuzzyVoucher;

        public List<String> getFuzzyVoucher(){return this.fuzzyVoucher;}

        private List<String> rightFuzzyVoucher;

        public List<String> getRightFuzzyVoucher(){return this.rightFuzzyVoucher;}

        public ConditionBuilder voucherIdBetWeen(Integer voucherIdSt,Integer voucherIdEd){
            this.voucherIdSt = voucherIdSt;
            this.voucherIdEd = voucherIdEd;
            return this;
        }

        public ConditionBuilder voucherIdGreaterEqThan(Integer voucherIdSt){
            this.voucherIdSt = voucherIdSt;
            return this;
        }
        public ConditionBuilder voucherIdLessEqThan(Integer voucherIdEd){
            this.voucherIdEd = voucherIdEd;
            return this;
        }


        public ConditionBuilder voucherIdList(Integer ... voucherId){
            this.voucherIdList = solveNullList(voucherId);
            return this;
        }

        public ConditionBuilder voucherIdList(List<Integer> voucherId){
            this.voucherIdList = voucherId;
            return this;
        }

        public ConditionBuilder fuzzyVoucherCode (List<String> fuzzyVoucherCode){
            this.fuzzyVoucherCode = fuzzyVoucherCode;
            return this;
        }

        public ConditionBuilder fuzzyVoucherCode (String ... fuzzyVoucherCode){
            this.fuzzyVoucherCode = solveNullList(fuzzyVoucherCode);
            return this;
        }

        public ConditionBuilder rightFuzzyVoucherCode (List<String> rightFuzzyVoucherCode){
            this.rightFuzzyVoucherCode = rightFuzzyVoucherCode;
            return this;
        }

        public ConditionBuilder rightFuzzyVoucherCode (String ... rightFuzzyVoucherCode){
            this.rightFuzzyVoucherCode = solveNullList(rightFuzzyVoucherCode);
            return this;
        }

        public ConditionBuilder voucherCodeList(String ... voucherCode){
            this.voucherCodeList = solveNullList(voucherCode);
            return this;
        }

        public ConditionBuilder voucherCodeList(List<String> voucherCode){
            this.voucherCodeList = voucherCode;
            return this;
        }

        public ConditionBuilder fuzzyVoucher (List<String> fuzzyVoucher){
            this.fuzzyVoucher = fuzzyVoucher;
            return this;
        }

        public ConditionBuilder fuzzyVoucher (String ... fuzzyVoucher){
            this.fuzzyVoucher = solveNullList(fuzzyVoucher);
            return this;
        }

        public ConditionBuilder rightFuzzyVoucher (List<String> rightFuzzyVoucher){
            this.rightFuzzyVoucher = rightFuzzyVoucher;
            return this;
        }

        public ConditionBuilder rightFuzzyVoucher (String ... rightFuzzyVoucher){
            this.rightFuzzyVoucher = solveNullList(rightFuzzyVoucher);
            return this;
        }

        public ConditionBuilder voucherList(String ... voucher){
            this.voucherList = solveNullList(voucher);
            return this;
        }

        public ConditionBuilder voucherList(List<String> voucher){
            this.voucherList = voucher;
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

        private MqmsFailureReportRaw obj;

        public Builder(){
            this.obj = new MqmsFailureReportRaw();
        }

        public Builder voucherId(Integer voucherId){
            this.obj.setVoucherId(voucherId);
            return this;
        }
        public Builder voucherCode(String voucherCode){
            this.obj.setVoucherCode(voucherCode);
            return this;
        }
        public Builder voucher(String voucher){
            this.obj.setVoucher(voucher);
            return this;
        }
        public MqmsFailureReportRaw build(){return obj;}
    }

}
