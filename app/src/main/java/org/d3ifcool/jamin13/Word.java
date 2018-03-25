package org.d3ifcool.jamin13;

/**
 * Created by Lenovo Y500 on 3/12/2018.
 */

public class Word {
    private String mlist;
    private String mData;
    private int mImageResourseId;

    public Word(String list){
        mlist = list;
    }

    public Word(String list,int imageResourseId ){
        mlist = list;
        mImageResourseId = imageResourseId;
    }

    public String getMlist() {
        return mlist;
    }
    public  int getmImageResourseId(){ return mImageResourseId;}
}
