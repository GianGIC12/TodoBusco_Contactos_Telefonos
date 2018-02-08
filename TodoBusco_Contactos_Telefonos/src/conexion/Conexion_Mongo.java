/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.util.JSON;
import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.internal.parser.JSONParser;
import org.bson.Document;

/**
 *
 * @author user
 */
public class Conexion_Mongo {

    MongoClient mongoC;
    String gestor, bd, user, pass;
    DB dataBase = null;
    DBCollection collection1 = null;

    public Conexion_Mongo() {

        gestor = "mdb.todobusco.com";
        bd = "mdb_todobusco_prod";
        user = "u_todobusco_prod";
        pass = "Shai7te5aesheu";

    }

    public void conectar() {
        System.out.println("mongodb://" + user + ":" + pass + "@" + gestor + ":27017" + "/" + bd);
        MongoClientURI uri = new MongoClientURI("mongodb://" + user + ":" + pass + "@" + gestor + ":27017" + "/" + bd);
        mongoC = new MongoClient(uri);
        dataBase = mongoC.getDB(bd);

        System.out.println("conexion1 exitosa");
        collection1 = dataBase.getCollection("mod_statistic_by_announcement");

        System.out.println("conexion2 exitosa");

        BasicDBObject query = new BasicDBObject("idAviso", 37331);
        BasicDBObject query2 = new BasicDBObject("fechaFormat", "05/02/2018");
        List<DBObject> criterio = new ArrayList<>();
        criterio.add(query);
        criterio.add(query2);

        BasicDBObject querys = new BasicDBObject("$and", criterio);

        DBCursor cursor = collection1.find(querys);

        while (cursor.hasNext()) {

            DBObject o = cursor.next();

            System.out.println("" + o.get("idAviso"));
            System.out.println("" + o.get("idPais"));
            System.out.println("" + o.get("destaque"));
            System.out.println("" + o.get("visitas"));

      //    JsonObject output= new JsonObject(JSON.serialize(o.get("statistic")));
        }

    }

}
