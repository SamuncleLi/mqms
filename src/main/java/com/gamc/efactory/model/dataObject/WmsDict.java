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
public class WmsDict implements Serializable {

    private static final long serialVersionUID = 1571131546989L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer dictId;

    /**
    * 字典类型1（对应combobox的最高层级）
    * isNullAble:1
    */
    private String dictType1;

    /**
    * 字典类型2（对应combobox的次高层级）
    * isNullAble:1
    */
    private String dictType2;

    /**
    *  字典项的值（对应combobox的value）
    * isNullAble:1
    */
    private String dictValue;

    /**
    * 字典项的含义（对应combobox中的text）
    * isNullAble:1
    */
    private String dictText;

    /**
    * 字典项的最高层级的描述
    * isNullAble:1
    */
    private String dictDesc1;

    /**
    * 字典项的次高层级的描述
    * isNullAble:1
    */
    private String dictDesc2;

    /**
    * 字典项的状态（是否废止）
    * isNullAble:1
    */
    private String dictState;

    /**
    * 字典项的图标
    * isNullAble:1
    */
    private String dictIcon;

    /**
    * 字典项是否允许修改
    * isNullAble:1,defaultVal:1
    */
    private Integer dictCanModify;

    /**
    * 字典项是否是默认值
    * isNullAble:1,defaultVal:0
    */
    private Integer dictDefault;


    public void setDictId(Integer dictId){this.dictId = dictId;}

    public Integer getDictId(){return this.dictId;}

    public void setDictType1(String dictType1){this.dictType1 = dictType1;}

    public String getDictType1(){return this.dictType1;}

    public void setDictType2(String dictType2){this.dictType2 = dictType2;}

    public String getDictType2(){return this.dictType2;}

    public void setDictValue(String dictValue){this.dictValue = dictValue;}

    public String getDictValue(){return this.dictValue;}

    public void setDictText(String dictText){this.dictText = dictText;}

    public String getDictText(){return this.dictText;}

    public void setDictDesc1(String dictDesc1){this.dictDesc1 = dictDesc1;}

    public String getDictDesc1(){return this.dictDesc1;}

    public void setDictDesc2(String dictDesc2){this.dictDesc2 = dictDesc2;}

    public String getDictDesc2(){return this.dictDesc2;}

    public void setDictState(String dictState){this.dictState = dictState;}

    public String getDictState(){return this.dictState;}

    public void setDictIcon(String dictIcon){this.dictIcon = dictIcon;}

    public String getDictIcon(){return this.dictIcon;}

    public void setDictCanModify(Integer dictCanModify){this.dictCanModify = dictCanModify;}

    public Integer getDictCanModify(){return this.dictCanModify;}

    public void setDictDefault(Integer dictDefault){this.dictDefault = dictDefault;}

    public Integer getDictDefault(){return this.dictDefault;}
    @Override
    public String toString() {
        return "WmsDict{" +
                "dictId='" + dictId + '\'' +
                "dictType1='" + dictType1 + '\'' +
                "dictType2='" + dictType2 + '\'' +
                "dictValue='" + dictValue + '\'' +
                "dictText='" + dictText + '\'' +
                "dictDesc1='" + dictDesc1 + '\'' +
                "dictDesc2='" + dictDesc2 + '\'' +
                "dictState='" + dictState + '\'' +
                "dictIcon='" + dictIcon + '\'' +
                "dictCanModify='" + dictCanModify + '\'' +
                "dictDefault='" + dictDefault + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private WmsDict set;

        private ConditionBuilder where;

        public UpdateBuilder set(WmsDict set){
            this.set = set;
            return this;
        }

        public WmsDict getSet(){
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

    public static class QueryBuilder extends WmsDict{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> dictIdList;

        public List<Integer> getDictIdList(){return this.dictIdList;}

        private Integer dictIdSt;

        private Integer dictIdEd;

        public Integer getDictIdSt(){return this.dictIdSt;}

        public Integer getDictIdEd(){return this.dictIdEd;}

        private List<String> dictType1List;

        public List<String> getDictType1List(){return this.dictType1List;}


        private List<String> fuzzyDictType1;

        public List<String> getFuzzyDictType1(){return this.fuzzyDictType1;}

        private List<String> rightFuzzyDictType1;

        public List<String> getRightFuzzyDictType1(){return this.rightFuzzyDictType1;}
        private List<String> dictType2List;

        public List<String> getDictType2List(){return this.dictType2List;}


        private List<String> fuzzyDictType2;

        public List<String> getFuzzyDictType2(){return this.fuzzyDictType2;}

        private List<String> rightFuzzyDictType2;

        public List<String> getRightFuzzyDictType2(){return this.rightFuzzyDictType2;}
        private List<String> dictValueList;

        public List<String> getDictValueList(){return this.dictValueList;}


        private List<String> fuzzyDictValue;

        public List<String> getFuzzyDictValue(){return this.fuzzyDictValue;}

        private List<String> rightFuzzyDictValue;

        public List<String> getRightFuzzyDictValue(){return this.rightFuzzyDictValue;}
        private List<String> dictTextList;

        public List<String> getDictTextList(){return this.dictTextList;}


        private List<String> fuzzyDictText;

        public List<String> getFuzzyDictText(){return this.fuzzyDictText;}

        private List<String> rightFuzzyDictText;

        public List<String> getRightFuzzyDictText(){return this.rightFuzzyDictText;}
        private List<String> dictDesc1List;

        public List<String> getDictDesc1List(){return this.dictDesc1List;}


        private List<String> fuzzyDictDesc1;

        public List<String> getFuzzyDictDesc1(){return this.fuzzyDictDesc1;}

        private List<String> rightFuzzyDictDesc1;

        public List<String> getRightFuzzyDictDesc1(){return this.rightFuzzyDictDesc1;}
        private List<String> dictDesc2List;

        public List<String> getDictDesc2List(){return this.dictDesc2List;}


        private List<String> fuzzyDictDesc2;

        public List<String> getFuzzyDictDesc2(){return this.fuzzyDictDesc2;}

        private List<String> rightFuzzyDictDesc2;

        public List<String> getRightFuzzyDictDesc2(){return this.rightFuzzyDictDesc2;}
        private List<String> dictStateList;

        public List<String> getDictStateList(){return this.dictStateList;}


        private List<String> fuzzyDictState;

        public List<String> getFuzzyDictState(){return this.fuzzyDictState;}

        private List<String> rightFuzzyDictState;

        public List<String> getRightFuzzyDictState(){return this.rightFuzzyDictState;}
        private List<String> dictIconList;

        public List<String> getDictIconList(){return this.dictIconList;}


        private List<String> fuzzyDictIcon;

        public List<String> getFuzzyDictIcon(){return this.fuzzyDictIcon;}

        private List<String> rightFuzzyDictIcon;

        public List<String> getRightFuzzyDictIcon(){return this.rightFuzzyDictIcon;}
        private List<Integer> dictCanModifyList;

        public List<Integer> getDictCanModifyList(){return this.dictCanModifyList;}

        private Integer dictCanModifySt;

        private Integer dictCanModifyEd;

        public Integer getDictCanModifySt(){return this.dictCanModifySt;}

        public Integer getDictCanModifyEd(){return this.dictCanModifyEd;}

        private List<Integer> dictDefaultList;

        public List<Integer> getDictDefaultList(){return this.dictDefaultList;}

        private Integer dictDefaultSt;

        private Integer dictDefaultEd;

        public Integer getDictDefaultSt(){return this.dictDefaultSt;}

        public Integer getDictDefaultEd(){return this.dictDefaultEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder dictIdBetWeen(Integer dictIdSt,Integer dictIdEd){
            this.dictIdSt = dictIdSt;
            this.dictIdEd = dictIdEd;
            return this;
        }

        public QueryBuilder dictIdGreaterEqThan(Integer dictIdSt){
            this.dictIdSt = dictIdSt;
            return this;
        }
        public QueryBuilder dictIdLessEqThan(Integer dictIdEd){
            this.dictIdEd = dictIdEd;
            return this;
        }


        public QueryBuilder dictId(Integer dictId){
            setDictId(dictId);
            return this;
        }

        public QueryBuilder dictIdList(Integer ... dictId){
            this.dictIdList = solveNullList(dictId);
            return this;
        }

        public QueryBuilder dictIdList(List<Integer> dictId){
            this.dictIdList = dictId;
            return this;
        }

        public QueryBuilder fetchDictId(){
            setFetchFields("fetchFields","dictId");
            return this;
        }

        public QueryBuilder excludeDictId(){
            setFetchFields("excludeFields","dictId");
            return this;
        }

        public QueryBuilder fuzzyDictType1 (List<String> fuzzyDictType1){
            this.fuzzyDictType1 = fuzzyDictType1;
            return this;
        }

        public QueryBuilder fuzzyDictType1 (String ... fuzzyDictType1){
            this.fuzzyDictType1 = solveNullList(fuzzyDictType1);
            return this;
        }

        public QueryBuilder rightFuzzyDictType1 (List<String> rightFuzzyDictType1){
            this.rightFuzzyDictType1 = rightFuzzyDictType1;
            return this;
        }

        public QueryBuilder rightFuzzyDictType1 (String ... rightFuzzyDictType1){
            this.rightFuzzyDictType1 = solveNullList(rightFuzzyDictType1);
            return this;
        }

        public QueryBuilder dictType1(String dictType1){
            setDictType1(dictType1);
            return this;
        }

        public QueryBuilder dictType1List(String ... dictType1){
            this.dictType1List = solveNullList(dictType1);
            return this;
        }

        public QueryBuilder dictType1List(List<String> dictType1){
            this.dictType1List = dictType1;
            return this;
        }

        public QueryBuilder fetchDictType1(){
            setFetchFields("fetchFields","dictType1");
            return this;
        }

        public QueryBuilder excludeDictType1(){
            setFetchFields("excludeFields","dictType1");
            return this;
        }

        public QueryBuilder fuzzyDictType2 (List<String> fuzzyDictType2){
            this.fuzzyDictType2 = fuzzyDictType2;
            return this;
        }

        public QueryBuilder fuzzyDictType2 (String ... fuzzyDictType2){
            this.fuzzyDictType2 = solveNullList(fuzzyDictType2);
            return this;
        }

        public QueryBuilder rightFuzzyDictType2 (List<String> rightFuzzyDictType2){
            this.rightFuzzyDictType2 = rightFuzzyDictType2;
            return this;
        }

        public QueryBuilder rightFuzzyDictType2 (String ... rightFuzzyDictType2){
            this.rightFuzzyDictType2 = solveNullList(rightFuzzyDictType2);
            return this;
        }

        public QueryBuilder dictType2(String dictType2){
            setDictType2(dictType2);
            return this;
        }

        public QueryBuilder dictType2List(String ... dictType2){
            this.dictType2List = solveNullList(dictType2);
            return this;
        }

        public QueryBuilder dictType2List(List<String> dictType2){
            this.dictType2List = dictType2;
            return this;
        }

        public QueryBuilder fetchDictType2(){
            setFetchFields("fetchFields","dictType2");
            return this;
        }

        public QueryBuilder excludeDictType2(){
            setFetchFields("excludeFields","dictType2");
            return this;
        }

        public QueryBuilder fuzzyDictValue (List<String> fuzzyDictValue){
            this.fuzzyDictValue = fuzzyDictValue;
            return this;
        }

        public QueryBuilder fuzzyDictValue (String ... fuzzyDictValue){
            this.fuzzyDictValue = solveNullList(fuzzyDictValue);
            return this;
        }

        public QueryBuilder rightFuzzyDictValue (List<String> rightFuzzyDictValue){
            this.rightFuzzyDictValue = rightFuzzyDictValue;
            return this;
        }

        public QueryBuilder rightFuzzyDictValue (String ... rightFuzzyDictValue){
            this.rightFuzzyDictValue = solveNullList(rightFuzzyDictValue);
            return this;
        }

        public QueryBuilder dictValue(String dictValue){
            setDictValue(dictValue);
            return this;
        }

        public QueryBuilder dictValueList(String ... dictValue){
            this.dictValueList = solveNullList(dictValue);
            return this;
        }

        public QueryBuilder dictValueList(List<String> dictValue){
            this.dictValueList = dictValue;
            return this;
        }

        public QueryBuilder fetchDictValue(){
            setFetchFields("fetchFields","dictValue");
            return this;
        }

        public QueryBuilder excludeDictValue(){
            setFetchFields("excludeFields","dictValue");
            return this;
        }

        public QueryBuilder fuzzyDictText (List<String> fuzzyDictText){
            this.fuzzyDictText = fuzzyDictText;
            return this;
        }

        public QueryBuilder fuzzyDictText (String ... fuzzyDictText){
            this.fuzzyDictText = solveNullList(fuzzyDictText);
            return this;
        }

        public QueryBuilder rightFuzzyDictText (List<String> rightFuzzyDictText){
            this.rightFuzzyDictText = rightFuzzyDictText;
            return this;
        }

        public QueryBuilder rightFuzzyDictText (String ... rightFuzzyDictText){
            this.rightFuzzyDictText = solveNullList(rightFuzzyDictText);
            return this;
        }

        public QueryBuilder dictText(String dictText){
            setDictText(dictText);
            return this;
        }

        public QueryBuilder dictTextList(String ... dictText){
            this.dictTextList = solveNullList(dictText);
            return this;
        }

        public QueryBuilder dictTextList(List<String> dictText){
            this.dictTextList = dictText;
            return this;
        }

        public QueryBuilder fetchDictText(){
            setFetchFields("fetchFields","dictText");
            return this;
        }

        public QueryBuilder excludeDictText(){
            setFetchFields("excludeFields","dictText");
            return this;
        }

        public QueryBuilder fuzzyDictDesc1 (List<String> fuzzyDictDesc1){
            this.fuzzyDictDesc1 = fuzzyDictDesc1;
            return this;
        }

        public QueryBuilder fuzzyDictDesc1 (String ... fuzzyDictDesc1){
            this.fuzzyDictDesc1 = solveNullList(fuzzyDictDesc1);
            return this;
        }

        public QueryBuilder rightFuzzyDictDesc1 (List<String> rightFuzzyDictDesc1){
            this.rightFuzzyDictDesc1 = rightFuzzyDictDesc1;
            return this;
        }

        public QueryBuilder rightFuzzyDictDesc1 (String ... rightFuzzyDictDesc1){
            this.rightFuzzyDictDesc1 = solveNullList(rightFuzzyDictDesc1);
            return this;
        }

        public QueryBuilder dictDesc1(String dictDesc1){
            setDictDesc1(dictDesc1);
            return this;
        }

        public QueryBuilder dictDesc1List(String ... dictDesc1){
            this.dictDesc1List = solveNullList(dictDesc1);
            return this;
        }

        public QueryBuilder dictDesc1List(List<String> dictDesc1){
            this.dictDesc1List = dictDesc1;
            return this;
        }

        public QueryBuilder fetchDictDesc1(){
            setFetchFields("fetchFields","dictDesc1");
            return this;
        }

        public QueryBuilder excludeDictDesc1(){
            setFetchFields("excludeFields","dictDesc1");
            return this;
        }

        public QueryBuilder fuzzyDictDesc2 (List<String> fuzzyDictDesc2){
            this.fuzzyDictDesc2 = fuzzyDictDesc2;
            return this;
        }

        public QueryBuilder fuzzyDictDesc2 (String ... fuzzyDictDesc2){
            this.fuzzyDictDesc2 = solveNullList(fuzzyDictDesc2);
            return this;
        }

        public QueryBuilder rightFuzzyDictDesc2 (List<String> rightFuzzyDictDesc2){
            this.rightFuzzyDictDesc2 = rightFuzzyDictDesc2;
            return this;
        }

        public QueryBuilder rightFuzzyDictDesc2 (String ... rightFuzzyDictDesc2){
            this.rightFuzzyDictDesc2 = solveNullList(rightFuzzyDictDesc2);
            return this;
        }

        public QueryBuilder dictDesc2(String dictDesc2){
            setDictDesc2(dictDesc2);
            return this;
        }

        public QueryBuilder dictDesc2List(String ... dictDesc2){
            this.dictDesc2List = solveNullList(dictDesc2);
            return this;
        }

        public QueryBuilder dictDesc2List(List<String> dictDesc2){
            this.dictDesc2List = dictDesc2;
            return this;
        }

        public QueryBuilder fetchDictDesc2(){
            setFetchFields("fetchFields","dictDesc2");
            return this;
        }

        public QueryBuilder excludeDictDesc2(){
            setFetchFields("excludeFields","dictDesc2");
            return this;
        }

        public QueryBuilder fuzzyDictState (List<String> fuzzyDictState){
            this.fuzzyDictState = fuzzyDictState;
            return this;
        }

        public QueryBuilder fuzzyDictState (String ... fuzzyDictState){
            this.fuzzyDictState = solveNullList(fuzzyDictState);
            return this;
        }

        public QueryBuilder rightFuzzyDictState (List<String> rightFuzzyDictState){
            this.rightFuzzyDictState = rightFuzzyDictState;
            return this;
        }

        public QueryBuilder rightFuzzyDictState (String ... rightFuzzyDictState){
            this.rightFuzzyDictState = solveNullList(rightFuzzyDictState);
            return this;
        }

        public QueryBuilder dictState(String dictState){
            setDictState(dictState);
            return this;
        }

        public QueryBuilder dictStateList(String ... dictState){
            this.dictStateList = solveNullList(dictState);
            return this;
        }

        public QueryBuilder dictStateList(List<String> dictState){
            this.dictStateList = dictState;
            return this;
        }

        public QueryBuilder fetchDictState(){
            setFetchFields("fetchFields","dictState");
            return this;
        }

        public QueryBuilder excludeDictState(){
            setFetchFields("excludeFields","dictState");
            return this;
        }

        public QueryBuilder fuzzyDictIcon (List<String> fuzzyDictIcon){
            this.fuzzyDictIcon = fuzzyDictIcon;
            return this;
        }

        public QueryBuilder fuzzyDictIcon (String ... fuzzyDictIcon){
            this.fuzzyDictIcon = solveNullList(fuzzyDictIcon);
            return this;
        }

        public QueryBuilder rightFuzzyDictIcon (List<String> rightFuzzyDictIcon){
            this.rightFuzzyDictIcon = rightFuzzyDictIcon;
            return this;
        }

        public QueryBuilder rightFuzzyDictIcon (String ... rightFuzzyDictIcon){
            this.rightFuzzyDictIcon = solveNullList(rightFuzzyDictIcon);
            return this;
        }

        public QueryBuilder dictIcon(String dictIcon){
            setDictIcon(dictIcon);
            return this;
        }

        public QueryBuilder dictIconList(String ... dictIcon){
            this.dictIconList = solveNullList(dictIcon);
            return this;
        }

        public QueryBuilder dictIconList(List<String> dictIcon){
            this.dictIconList = dictIcon;
            return this;
        }

        public QueryBuilder fetchDictIcon(){
            setFetchFields("fetchFields","dictIcon");
            return this;
        }

        public QueryBuilder excludeDictIcon(){
            setFetchFields("excludeFields","dictIcon");
            return this;
        }

        public QueryBuilder dictCanModifyBetWeen(Integer dictCanModifySt,Integer dictCanModifyEd){
            this.dictCanModifySt = dictCanModifySt;
            this.dictCanModifyEd = dictCanModifyEd;
            return this;
        }

        public QueryBuilder dictCanModifyGreaterEqThan(Integer dictCanModifySt){
            this.dictCanModifySt = dictCanModifySt;
            return this;
        }
        public QueryBuilder dictCanModifyLessEqThan(Integer dictCanModifyEd){
            this.dictCanModifyEd = dictCanModifyEd;
            return this;
        }


        public QueryBuilder dictCanModify(Integer dictCanModify){
            setDictCanModify(dictCanModify);
            return this;
        }

        public QueryBuilder dictCanModifyList(Integer ... dictCanModify){
            this.dictCanModifyList = solveNullList(dictCanModify);
            return this;
        }

        public QueryBuilder dictCanModifyList(List<Integer> dictCanModify){
            this.dictCanModifyList = dictCanModify;
            return this;
        }

        public QueryBuilder fetchDictCanModify(){
            setFetchFields("fetchFields","dictCanModify");
            return this;
        }

        public QueryBuilder excludeDictCanModify(){
            setFetchFields("excludeFields","dictCanModify");
            return this;
        }

        public QueryBuilder dictDefaultBetWeen(Integer dictDefaultSt,Integer dictDefaultEd){
            this.dictDefaultSt = dictDefaultSt;
            this.dictDefaultEd = dictDefaultEd;
            return this;
        }

        public QueryBuilder dictDefaultGreaterEqThan(Integer dictDefaultSt){
            this.dictDefaultSt = dictDefaultSt;
            return this;
        }
        public QueryBuilder dictDefaultLessEqThan(Integer dictDefaultEd){
            this.dictDefaultEd = dictDefaultEd;
            return this;
        }


        public QueryBuilder dictDefault(Integer dictDefault){
            setDictDefault(dictDefault);
            return this;
        }

        public QueryBuilder dictDefaultList(Integer ... dictDefault){
            this.dictDefaultList = solveNullList(dictDefault);
            return this;
        }

        public QueryBuilder dictDefaultList(List<Integer> dictDefault){
            this.dictDefaultList = dictDefault;
            return this;
        }

        public QueryBuilder fetchDictDefault(){
            setFetchFields("fetchFields","dictDefault");
            return this;
        }

        public QueryBuilder excludeDictDefault(){
            setFetchFields("excludeFields","dictDefault");
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

        public WmsDict build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> dictIdList;

        public List<Integer> getDictIdList(){return this.dictIdList;}

        private Integer dictIdSt;

        private Integer dictIdEd;

        public Integer getDictIdSt(){return this.dictIdSt;}

        public Integer getDictIdEd(){return this.dictIdEd;}

        private List<String> dictType1List;

        public List<String> getDictType1List(){return this.dictType1List;}


        private List<String> fuzzyDictType1;

        public List<String> getFuzzyDictType1(){return this.fuzzyDictType1;}

        private List<String> rightFuzzyDictType1;

        public List<String> getRightFuzzyDictType1(){return this.rightFuzzyDictType1;}
        private List<String> dictType2List;

        public List<String> getDictType2List(){return this.dictType2List;}


        private List<String> fuzzyDictType2;

        public List<String> getFuzzyDictType2(){return this.fuzzyDictType2;}

        private List<String> rightFuzzyDictType2;

        public List<String> getRightFuzzyDictType2(){return this.rightFuzzyDictType2;}
        private List<String> dictValueList;

        public List<String> getDictValueList(){return this.dictValueList;}


        private List<String> fuzzyDictValue;

        public List<String> getFuzzyDictValue(){return this.fuzzyDictValue;}

        private List<String> rightFuzzyDictValue;

        public List<String> getRightFuzzyDictValue(){return this.rightFuzzyDictValue;}
        private List<String> dictTextList;

        public List<String> getDictTextList(){return this.dictTextList;}


        private List<String> fuzzyDictText;

        public List<String> getFuzzyDictText(){return this.fuzzyDictText;}

        private List<String> rightFuzzyDictText;

        public List<String> getRightFuzzyDictText(){return this.rightFuzzyDictText;}
        private List<String> dictDesc1List;

        public List<String> getDictDesc1List(){return this.dictDesc1List;}


        private List<String> fuzzyDictDesc1;

        public List<String> getFuzzyDictDesc1(){return this.fuzzyDictDesc1;}

        private List<String> rightFuzzyDictDesc1;

        public List<String> getRightFuzzyDictDesc1(){return this.rightFuzzyDictDesc1;}
        private List<String> dictDesc2List;

        public List<String> getDictDesc2List(){return this.dictDesc2List;}


        private List<String> fuzzyDictDesc2;

        public List<String> getFuzzyDictDesc2(){return this.fuzzyDictDesc2;}

        private List<String> rightFuzzyDictDesc2;

        public List<String> getRightFuzzyDictDesc2(){return this.rightFuzzyDictDesc2;}
        private List<String> dictStateList;

        public List<String> getDictStateList(){return this.dictStateList;}


        private List<String> fuzzyDictState;

        public List<String> getFuzzyDictState(){return this.fuzzyDictState;}

        private List<String> rightFuzzyDictState;

        public List<String> getRightFuzzyDictState(){return this.rightFuzzyDictState;}
        private List<String> dictIconList;

        public List<String> getDictIconList(){return this.dictIconList;}


        private List<String> fuzzyDictIcon;

        public List<String> getFuzzyDictIcon(){return this.fuzzyDictIcon;}

        private List<String> rightFuzzyDictIcon;

        public List<String> getRightFuzzyDictIcon(){return this.rightFuzzyDictIcon;}
        private List<Integer> dictCanModifyList;

        public List<Integer> getDictCanModifyList(){return this.dictCanModifyList;}

        private Integer dictCanModifySt;

        private Integer dictCanModifyEd;

        public Integer getDictCanModifySt(){return this.dictCanModifySt;}

        public Integer getDictCanModifyEd(){return this.dictCanModifyEd;}

        private List<Integer> dictDefaultList;

        public List<Integer> getDictDefaultList(){return this.dictDefaultList;}

        private Integer dictDefaultSt;

        private Integer dictDefaultEd;

        public Integer getDictDefaultSt(){return this.dictDefaultSt;}

        public Integer getDictDefaultEd(){return this.dictDefaultEd;}


        public ConditionBuilder dictIdBetWeen(Integer dictIdSt,Integer dictIdEd){
            this.dictIdSt = dictIdSt;
            this.dictIdEd = dictIdEd;
            return this;
        }

        public ConditionBuilder dictIdGreaterEqThan(Integer dictIdSt){
            this.dictIdSt = dictIdSt;
            return this;
        }
        public ConditionBuilder dictIdLessEqThan(Integer dictIdEd){
            this.dictIdEd = dictIdEd;
            return this;
        }


        public ConditionBuilder dictIdList(Integer ... dictId){
            this.dictIdList = solveNullList(dictId);
            return this;
        }

        public ConditionBuilder dictIdList(List<Integer> dictId){
            this.dictIdList = dictId;
            return this;
        }

        public ConditionBuilder fuzzyDictType1 (List<String> fuzzyDictType1){
            this.fuzzyDictType1 = fuzzyDictType1;
            return this;
        }

        public ConditionBuilder fuzzyDictType1 (String ... fuzzyDictType1){
            this.fuzzyDictType1 = solveNullList(fuzzyDictType1);
            return this;
        }

        public ConditionBuilder rightFuzzyDictType1 (List<String> rightFuzzyDictType1){
            this.rightFuzzyDictType1 = rightFuzzyDictType1;
            return this;
        }

        public ConditionBuilder rightFuzzyDictType1 (String ... rightFuzzyDictType1){
            this.rightFuzzyDictType1 = solveNullList(rightFuzzyDictType1);
            return this;
        }

        public ConditionBuilder dictType1List(String ... dictType1){
            this.dictType1List = solveNullList(dictType1);
            return this;
        }

        public ConditionBuilder dictType1List(List<String> dictType1){
            this.dictType1List = dictType1;
            return this;
        }

        public ConditionBuilder fuzzyDictType2 (List<String> fuzzyDictType2){
            this.fuzzyDictType2 = fuzzyDictType2;
            return this;
        }

        public ConditionBuilder fuzzyDictType2 (String ... fuzzyDictType2){
            this.fuzzyDictType2 = solveNullList(fuzzyDictType2);
            return this;
        }

        public ConditionBuilder rightFuzzyDictType2 (List<String> rightFuzzyDictType2){
            this.rightFuzzyDictType2 = rightFuzzyDictType2;
            return this;
        }

        public ConditionBuilder rightFuzzyDictType2 (String ... rightFuzzyDictType2){
            this.rightFuzzyDictType2 = solveNullList(rightFuzzyDictType2);
            return this;
        }

        public ConditionBuilder dictType2List(String ... dictType2){
            this.dictType2List = solveNullList(dictType2);
            return this;
        }

        public ConditionBuilder dictType2List(List<String> dictType2){
            this.dictType2List = dictType2;
            return this;
        }

        public ConditionBuilder fuzzyDictValue (List<String> fuzzyDictValue){
            this.fuzzyDictValue = fuzzyDictValue;
            return this;
        }

        public ConditionBuilder fuzzyDictValue (String ... fuzzyDictValue){
            this.fuzzyDictValue = solveNullList(fuzzyDictValue);
            return this;
        }

        public ConditionBuilder rightFuzzyDictValue (List<String> rightFuzzyDictValue){
            this.rightFuzzyDictValue = rightFuzzyDictValue;
            return this;
        }

        public ConditionBuilder rightFuzzyDictValue (String ... rightFuzzyDictValue){
            this.rightFuzzyDictValue = solveNullList(rightFuzzyDictValue);
            return this;
        }

        public ConditionBuilder dictValueList(String ... dictValue){
            this.dictValueList = solveNullList(dictValue);
            return this;
        }

        public ConditionBuilder dictValueList(List<String> dictValue){
            this.dictValueList = dictValue;
            return this;
        }

        public ConditionBuilder fuzzyDictText (List<String> fuzzyDictText){
            this.fuzzyDictText = fuzzyDictText;
            return this;
        }

        public ConditionBuilder fuzzyDictText (String ... fuzzyDictText){
            this.fuzzyDictText = solveNullList(fuzzyDictText);
            return this;
        }

        public ConditionBuilder rightFuzzyDictText (List<String> rightFuzzyDictText){
            this.rightFuzzyDictText = rightFuzzyDictText;
            return this;
        }

        public ConditionBuilder rightFuzzyDictText (String ... rightFuzzyDictText){
            this.rightFuzzyDictText = solveNullList(rightFuzzyDictText);
            return this;
        }

        public ConditionBuilder dictTextList(String ... dictText){
            this.dictTextList = solveNullList(dictText);
            return this;
        }

        public ConditionBuilder dictTextList(List<String> dictText){
            this.dictTextList = dictText;
            return this;
        }

        public ConditionBuilder fuzzyDictDesc1 (List<String> fuzzyDictDesc1){
            this.fuzzyDictDesc1 = fuzzyDictDesc1;
            return this;
        }

        public ConditionBuilder fuzzyDictDesc1 (String ... fuzzyDictDesc1){
            this.fuzzyDictDesc1 = solveNullList(fuzzyDictDesc1);
            return this;
        }

        public ConditionBuilder rightFuzzyDictDesc1 (List<String> rightFuzzyDictDesc1){
            this.rightFuzzyDictDesc1 = rightFuzzyDictDesc1;
            return this;
        }

        public ConditionBuilder rightFuzzyDictDesc1 (String ... rightFuzzyDictDesc1){
            this.rightFuzzyDictDesc1 = solveNullList(rightFuzzyDictDesc1);
            return this;
        }

        public ConditionBuilder dictDesc1List(String ... dictDesc1){
            this.dictDesc1List = solveNullList(dictDesc1);
            return this;
        }

        public ConditionBuilder dictDesc1List(List<String> dictDesc1){
            this.dictDesc1List = dictDesc1;
            return this;
        }

        public ConditionBuilder fuzzyDictDesc2 (List<String> fuzzyDictDesc2){
            this.fuzzyDictDesc2 = fuzzyDictDesc2;
            return this;
        }

        public ConditionBuilder fuzzyDictDesc2 (String ... fuzzyDictDesc2){
            this.fuzzyDictDesc2 = solveNullList(fuzzyDictDesc2);
            return this;
        }

        public ConditionBuilder rightFuzzyDictDesc2 (List<String> rightFuzzyDictDesc2){
            this.rightFuzzyDictDesc2 = rightFuzzyDictDesc2;
            return this;
        }

        public ConditionBuilder rightFuzzyDictDesc2 (String ... rightFuzzyDictDesc2){
            this.rightFuzzyDictDesc2 = solveNullList(rightFuzzyDictDesc2);
            return this;
        }

        public ConditionBuilder dictDesc2List(String ... dictDesc2){
            this.dictDesc2List = solveNullList(dictDesc2);
            return this;
        }

        public ConditionBuilder dictDesc2List(List<String> dictDesc2){
            this.dictDesc2List = dictDesc2;
            return this;
        }

        public ConditionBuilder fuzzyDictState (List<String> fuzzyDictState){
            this.fuzzyDictState = fuzzyDictState;
            return this;
        }

        public ConditionBuilder fuzzyDictState (String ... fuzzyDictState){
            this.fuzzyDictState = solveNullList(fuzzyDictState);
            return this;
        }

        public ConditionBuilder rightFuzzyDictState (List<String> rightFuzzyDictState){
            this.rightFuzzyDictState = rightFuzzyDictState;
            return this;
        }

        public ConditionBuilder rightFuzzyDictState (String ... rightFuzzyDictState){
            this.rightFuzzyDictState = solveNullList(rightFuzzyDictState);
            return this;
        }

        public ConditionBuilder dictStateList(String ... dictState){
            this.dictStateList = solveNullList(dictState);
            return this;
        }

        public ConditionBuilder dictStateList(List<String> dictState){
            this.dictStateList = dictState;
            return this;
        }

        public ConditionBuilder fuzzyDictIcon (List<String> fuzzyDictIcon){
            this.fuzzyDictIcon = fuzzyDictIcon;
            return this;
        }

        public ConditionBuilder fuzzyDictIcon (String ... fuzzyDictIcon){
            this.fuzzyDictIcon = solveNullList(fuzzyDictIcon);
            return this;
        }

        public ConditionBuilder rightFuzzyDictIcon (List<String> rightFuzzyDictIcon){
            this.rightFuzzyDictIcon = rightFuzzyDictIcon;
            return this;
        }

        public ConditionBuilder rightFuzzyDictIcon (String ... rightFuzzyDictIcon){
            this.rightFuzzyDictIcon = solveNullList(rightFuzzyDictIcon);
            return this;
        }

        public ConditionBuilder dictIconList(String ... dictIcon){
            this.dictIconList = solveNullList(dictIcon);
            return this;
        }

        public ConditionBuilder dictIconList(List<String> dictIcon){
            this.dictIconList = dictIcon;
            return this;
        }

        public ConditionBuilder dictCanModifyBetWeen(Integer dictCanModifySt,Integer dictCanModifyEd){
            this.dictCanModifySt = dictCanModifySt;
            this.dictCanModifyEd = dictCanModifyEd;
            return this;
        }

        public ConditionBuilder dictCanModifyGreaterEqThan(Integer dictCanModifySt){
            this.dictCanModifySt = dictCanModifySt;
            return this;
        }
        public ConditionBuilder dictCanModifyLessEqThan(Integer dictCanModifyEd){
            this.dictCanModifyEd = dictCanModifyEd;
            return this;
        }


        public ConditionBuilder dictCanModifyList(Integer ... dictCanModify){
            this.dictCanModifyList = solveNullList(dictCanModify);
            return this;
        }

        public ConditionBuilder dictCanModifyList(List<Integer> dictCanModify){
            this.dictCanModifyList = dictCanModify;
            return this;
        }

        public ConditionBuilder dictDefaultBetWeen(Integer dictDefaultSt,Integer dictDefaultEd){
            this.dictDefaultSt = dictDefaultSt;
            this.dictDefaultEd = dictDefaultEd;
            return this;
        }

        public ConditionBuilder dictDefaultGreaterEqThan(Integer dictDefaultSt){
            this.dictDefaultSt = dictDefaultSt;
            return this;
        }
        public ConditionBuilder dictDefaultLessEqThan(Integer dictDefaultEd){
            this.dictDefaultEd = dictDefaultEd;
            return this;
        }


        public ConditionBuilder dictDefaultList(Integer ... dictDefault){
            this.dictDefaultList = solveNullList(dictDefault);
            return this;
        }

        public ConditionBuilder dictDefaultList(List<Integer> dictDefault){
            this.dictDefaultList = dictDefault;
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

        private WmsDict obj;

        public Builder(){
            this.obj = new WmsDict();
        }

        public Builder dictId(Integer dictId){
            this.obj.setDictId(dictId);
            return this;
        }
        public Builder dictType1(String dictType1){
            this.obj.setDictType1(dictType1);
            return this;
        }
        public Builder dictType2(String dictType2){
            this.obj.setDictType2(dictType2);
            return this;
        }
        public Builder dictValue(String dictValue){
            this.obj.setDictValue(dictValue);
            return this;
        }
        public Builder dictText(String dictText){
            this.obj.setDictText(dictText);
            return this;
        }
        public Builder dictDesc1(String dictDesc1){
            this.obj.setDictDesc1(dictDesc1);
            return this;
        }
        public Builder dictDesc2(String dictDesc2){
            this.obj.setDictDesc2(dictDesc2);
            return this;
        }
        public Builder dictState(String dictState){
            this.obj.setDictState(dictState);
            return this;
        }
        public Builder dictIcon(String dictIcon){
            this.obj.setDictIcon(dictIcon);
            return this;
        }
        public Builder dictCanModify(Integer dictCanModify){
            this.obj.setDictCanModify(dictCanModify);
            return this;
        }
        public Builder dictDefault(Integer dictDefault){
            this.obj.setDictDefault(dictDefault);
            return this;
        }
        public WmsDict build(){return obj;}
    }

}
