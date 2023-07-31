package com.example.healthcare_app;

public class DataClass {

    private String dataTitle;

    private String dataTitle2;

    private String dataTitle3;

    private String dataTitle4;

    private String dataTitle5;

    private String dataTitle6;

    private String dataSort;
    private int dataDesc;

    private int dataDesc8;

    private int dataDesc2;

    private int dataDesc3;

    private int dataDesc4;

    private int dataDesc5;

    private int dataDesc6;

    private int dataDesc7;

    private int dataImage;

    private int dataImage2;

    private int dataImage3;

    private int dataImage4;

    private int dataImage5;

    private int dataImage6;

    public String getDataTitle() {
        return dataTitle;
    }

    public String getDataTitle2() {
        return dataTitle2;
    }

    public String getDataSort(){return dataSort;}

    public int getDataDesc() {return dataDesc;}

    public int getDataDesc8() {return dataDesc8;}


    public int getDataDesc2() {return dataDesc2;}

    public int getDataDesc3() {return dataDesc3;}

    public int getDataDesc4() {return dataDesc4;}

    public int getDataDesc5() {return dataDesc5;}

    public int getDataDesc6() {return dataDesc6;}

    public int getDataDesc7() {return dataDesc7;}

    public int getDataImage() {
        return dataImage;
    }

    public int getDataImage2() {
        return dataImage2;
    }

    public int getDataImage3() {
        return dataImage3;
    }

    public int getDataImage4() {
        return dataImage4;
    }
    public int getDataImage5() {
        return dataImage5;
    }

    public int getDataImage6() {
        return dataImage6;
    }



    public DataClass(String dataTitle, String dataTitle2, String dataSort, int dataDesc,  int dataDesc8, int dataDesc2,  int dataDesc3,  int dataDesc4,  int dataDesc5,  int dataDesc6,  int dataDesc7, int dataImage, int dataImage2, int dataImage3, int dataImage4, int dataImage5, int dataImage6) {
        this.dataTitle = dataTitle;
        this.dataTitle2 = dataTitle2;
        this.dataSort = dataSort;
        this.dataDesc = dataDesc;
        this.dataDesc8= dataDesc8;
        this.dataDesc2= dataDesc2;
        this.dataDesc3= dataDesc3;
        this.dataDesc4= dataDesc4;
        this.dataDesc5= dataDesc5;
        this.dataDesc6= dataDesc6;
        this.dataDesc7= dataDesc7;
        this.dataImage = dataImage;
        this.dataImage2 = dataImage2;
        this.dataImage3 = dataImage3;
        this.dataImage4 = dataImage4;
        this.dataImage5 = dataImage5;
        this.dataImage6 = dataImage6;


    }
}