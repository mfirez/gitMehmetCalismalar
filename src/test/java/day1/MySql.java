package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySql {
    public static void main(String[] args) {

        try{
            Connection myConn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/deneme2","root","mehmet_1903");
            Statement myStatement =  myConn.createStatement();
            ResultSet myResultSet = myStatement.executeQuery("select * from ogrenci");
            while (myResultSet.next()){
                System.out.println(myResultSet.getString("ogr_no")+"-"+myResultSet.getString("ogr_ad")+" "+myResultSet.getString("ogr_soyad"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
