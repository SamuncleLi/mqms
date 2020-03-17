package com.gamc.efactory.model.dataObject;

import com.alibaba.fastjson.JSONArray;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcessForm implements Serializable {
    /**
     * normalData用于展示内容，一个 DataDisplayGroup 代表一个块
     */
    private List<DataDisplayGroup> normalData;
    private List<DataDisplayList>   listData;
    private SubmitFormGroup submitForm;
    private List<SubmitButton>  submitButton;

    private String script;

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public List<SubmitButton> getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(List<SubmitButton> submitButton) {
        this.submitButton = submitButton;
    }

    public SubmitFormGroup getSubmitForm() {
        return submitForm;
    }

    public void setSubmitForm(SubmitFormGroup submitForm) {
        this.submitForm = submitForm;
    }

    public List<DataDisplayGroup> getNormalData() {
        return normalData;
    }

    public void setNormalData(List<DataDisplayGroup> normalData) {
        this.normalData = normalData;
    }

    public List<DataDisplayList> getListData() {
        return listData;
    }

    public void setListData(List<DataDisplayList> listData) {
        this.listData = listData;
    }
    public void addNormalData(DataDisplayGroup dataDisplayGroup){
        if(normalData==null){
            normalData=new ArrayList<>();
        }
        normalData.add(dataDisplayGroup);
    }
    public void addListData(DataDisplayList dataDisplayList){
        if(listData==null){
            listData=new ArrayList<>();
        }
        listData.add(dataDisplayList);
    }
    public void addSubmitButton(SubmitButton button){
        if(submitButton==null){
            submitButton=new ArrayList<>();
        }
        submitButton.add(button);
    }

    public static DataDisplayGroup buildDataDisplayGroup(){
        return new DataDisplayGroup();
    }

    public static DataDisplaySingle buildDataDisplaySingle(){
        return new DataDisplaySingle();
    }
    public static DatagridHead buildDatagridHead(){
        return new DatagridHead();
    }
    public static DataDisplayList buildDataDisplayList(){
        return new DataDisplayList();
    }
    public static DatagridData buildDatagridData(){
        return new DatagridData();
    }
    public static SubmitFormGroup buildSubmitFormGroup(){
        return new SubmitFormGroup();
    }
    public static SubmitButton buildSubmitButton(){
        return new SubmitButton();
    }

    /**
     * DataDisplayGroup 表示一个数据展示区域
     * group_name 展示区域的标题
     * structure  描述电脑版本上该区域的表格结构（手机版无视该结构）
     *            表格最多只能有四列，列于列之间可以合并
     *            示例： [[1,1,1,1],[2,2]]表示该表格有两行，第一行是4列  ，第二行第一列和第二列合并，第三列和第四列合并
     *            列数可以有省缺值，例如[[1],[1]] 表示有两行，每一行都是4列，但是每一行的数组里至少放一个1
     * data       展示内容的集合
     */
    public static   class DataDisplayGroup implements Serializable{
        private String group_name;
        private List<List<Integer>> structure;
        private List<DataDisplaySingle> data;

        public String getGroup_name() {
            return group_name;
        }

        public void setGroup_name(String group_name) {
            this.group_name = group_name;
        }

        public List<List<Integer>> getStructure() {
            return structure;
        }

        public void setStructure(List<List<Integer>> structure) {
            this.structure = structure;
        }

        public List<DataDisplaySingle> getData() {
            return data;
        }

        public void setData(List<DataDisplaySingle> data) {
            this.data = data;
        }
        public void addData(DataDisplaySingle dataDisplaySingle){
            if(data==null){
                data=new ArrayList<>();
            }
            data.add(dataDisplaySingle);
        }
    }

    /**
     * DataDisplaySingle 用于描述单个展示的内容
     * type  类型，
     */
    public static class DataDisplaySingle implements Serializable{
        private    String type;
        private    String content;
        private    String title;
        private    int row;
        private    int col;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getRow() {
            return row;
        }

        public void setRow(int row) {
            this.row = row;
        }

        public int getCol() {
            return col;
        }

        public void setCol(int col) {
            this.col = col;
        }
    }

    public static class DataDisplayList implements Serializable{
        private String group_name;
        private String data_url;
        private List<DatagridHead> head;
        private JSONArray data;

        public String getGroup_name() {
            return group_name;
        }

        public void setGroup_name(String group_name) {
            this.group_name = group_name;
        }

        public String getData_url() {
            return data_url;
        }

        public void setData_url(String data_url) {
            this.data_url = data_url;
        }

        public List<DatagridHead> getHead() {
            return head;
        }

        public void setHead(List<DatagridHead> head) {
            this.head = head;
        }

        public JSONArray getData() {
            return data;
        }

        public void setData(JSONArray data) {
            this.data = data;
        }
    }
    public static class DatagridHead implements Serializable{
        private String name;
        private String field;
        private String width;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }
    }
    public static class DatagridDataSingle{
        private String field;
        private String name;
        private String value;

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
    public static class DatagridData{
      private List<DatagridDataSingle> dataList;

        public List<DatagridDataSingle> getDataList() {
            return dataList;
        }

        public void setDataList(List<DatagridDataSingle> dataList) {
            this.dataList = dataList;
        }
    }
    public static class SubmitFormGroup implements Serializable{
        private List<SubmitFormSingle> input;
        private List<List<Integer>> structure;

        public List<SubmitFormSingle> getInput() {
            return input;
        }

        public void setInput(List<SubmitFormSingle> input) {
            this.input = input;
        }

        public List<List<Integer>> getStructure() {
            return structure;
        }

        public void setStructure(List<List<Integer>> structure) {
            this.structure = structure;
        }
        public void addSubmitSingle(SubmitFormSingle submitFormSingle){
            if(input==null){
                input=new ArrayList<>();
            }
            input.add(submitFormSingle);
        }
    }
    public static class SubmitFormSingle implements Serializable{
        private String type;
        private String name;
        private String text;
        private String input_id;
        private String title;
        private int lines;
        private int row;
        private int col;
        private String data_url;
        private Map<String,String> attr;
        private Map<String,String> option;

        public String getData_url() {
            return data_url;
        }

        public void setData_url(String data_url) {
            this.data_url = data_url;
        }

        public int getLines() {
            return lines;
        }

        public void setLines(int lines) {
            this.lines = lines;
        }

        public int getRow() {
            return row;
        }

        public void setRow(int row) {
            this.row = row;
        }

        public int getCol() {
            return col;
        }

        public void setCol(int col) {
            this.col = col;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }



        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getInput_id() {
            return input_id;
        }

        public void setInput_id(String input_id) {
            this.input_id = input_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Map<String, String> getAttr() {
            return attr;
        }

        public void setAttr(Map<String, String> attr) {
            this.attr = attr;
        }

        public Map<String, String> getOption() {
            return option;
        }

        public void setOption(Map<String, String> option) {
            this.option = option;
        }
        public void addAttr(String name,String value){
            if(attr==null){
                attr=new HashMap<>();
            }
            attr.put(name,value);
        }
        public void addOption(String name,String value){
            if(option==null){
                option=new HashMap<>();
            }
            option.put(name,value);
        }
    }
    public static class SubmitButton{
        private String button_id;
        private String name;
        private String url;
        private String icon;

        public String getButton_id() {
            return button_id;
        }

        public void setButton_id(String button_id) {
            this.button_id = button_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }
    public static class name_value implements Serializable{
        private String name;
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
