/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conexion;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/**
 *
 * @author user
 */
public class Conexion {
    
    MongoClient mongoC;
    String gestor, bd, user, pass;
    DB dataBase=null;
    DBCollection collection1=null;
    
    
    public Conexion() {
        
        gestor="mdb.todobusco.com";
        bd="mdb_todobusco_prod";
        user="u_todobusco_prod";
        pass="Shai7te5aesheu";
     
    }
    
    public void conectar(){
        System.out.println("mongodb://"+user+":"+pass+"@"+gestor+":27017"+"/"+bd);
        MongoClientURI uri= new MongoClientURI("mongodb://"+user+":"+pass+"@"+gestor+":27017"+"/"+bd);
        mongoC=new MongoClient(uri);
        dataBase=mongoC.getDB(bd);
        
        System.out.println("conexion1 exitosa");
        collection1=dataBase.getCollection("mod_log_cron_republicar");
        
        System.out.println("conexion2 exitosa");
        
        DBCursor rs= collection1.find();
        
        int i=0;
        while(rs.hasNext()&& i<=20){
            
            DBObject dbo= rs.next();
            i++;
            
            System.out.println(i+"***"+dbo.get("name"));  
            
            
        } 
        
        
        
        
        
    }
    
    
    
}
