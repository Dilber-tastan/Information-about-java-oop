package com.example.javaoopdetails;

public class kedi {
    String isim ;
    String gozrengi ;
      String tuyrengi;


  public  static  String türismi ="felis";

    public kedi (String isim,String gozrengi ,String tuyrengi){
   this.isim=isim;
   this.gozrengi=gozrengi;
   this.tuyrengi=tuyrengi;
    }
    public  static  void  konuskedistatic (){
      //  System.out.println("benim ismim"+this.isim+" benim türüm "+türismi);
    }
     public  void  konuskedi (){
         System.out.println("benim ismim"+this.isim+" benim türüm "+türismi);
     }


}
