package com.banyuan.homework;

public class Book {

    private  String  title;
    private  int     pageNum;


    public Book() {

    }

    public Book(String title, int pageNum) {
        this.title = title;
        this.pageNum = pageNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        if(pageNum>200){
            this.pageNum = pageNum;
        }else{
            this.pageNum=200;
            System.out.println("页数太少...");
        }

    }


    public    String   detail(){
        return "Book{" +
                "title='" + title + '\'' +
                ", pageNum=" + pageNum +
                '}';
    }



//    @Override
//    public String toString() {
//        return "Book{" +
//                "title='" + title + '\'' +
//                ", pageNum=" + pageNum +
//                '}';
//    }

//    public  String  show(){
//        return  "书名 title："+this.getTitle()+",页数："+this.getPageNum();
//    }






}
