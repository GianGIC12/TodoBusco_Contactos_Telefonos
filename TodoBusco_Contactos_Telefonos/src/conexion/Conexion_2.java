/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/**
 *
 * @author user
 */
public class Conexion_2 {

    MongoClient mongoC;
    String gestor, bd, user, pass;
    DB dataBase = null;
    DBCollection collection1 = null;

    public Conexion_2() {

        gestor = "mdb.todobusco.com";
        bd = "mdb_todobusco_prod";
        user = "u_todobusco_prod";
        pass = "Shai7te5aesheu";

    }

    public void Conectar() {

        MongoClientURI uri = new MongoClientURI("mongodb://" + user + ":" + pass + "@" + gestor + ":27017" + "/" + bd);
        mongoC = new MongoClient(uri);
        dataBase = mongoC.getDB(bd);

    }

    public void Desconectar() {

        mongoC.close();

    }

    public MongoClient getMongoC() {
        return mongoC;
    }

    public void setMongoC(MongoClient mongoC) {
        this.mongoC = mongoC;
    }

    public String getGestor() {
        return gestor;
    }

    public void setGestor(String gestor) {
        this.gestor = gestor;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public DB getDataBase() {
        return dataBase;
    }

    public void setDataBase(DB dataBase) {
        this.dataBase = dataBase;
    }

    public DBCollection getCollection1() {
        return collection1;
    }

    public void setCollection1(DBCollection collection1) {
        this.collection1 = collection1;
    }

}
