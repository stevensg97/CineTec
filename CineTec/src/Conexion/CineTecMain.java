/**
 *
 * @author Steven
 */
package Conexion;
import GUI.CineTecUI;
import static GUI.CineTecUI.jTable1;
import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import org.bson.Document;
import com.mongodb.Block;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Accumulators.avg;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.BsonField;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.gt;
import static com.mongodb.client.model.Filters.lte;
import static com.mongodb.client.model.Filters.or;
import static com.mongodb.client.model.Filters.regex;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.Popup;
import javax.swing.table.DefaultTableModel;
import org.bson.BsonDocument;
import org.bson.BsonString;

public class CineTecMain {
    private static CineTecUI interfaz = new CineTecUI();
    private static MongoClient mongoClient = new MongoClient();
    private static MongoDatabase db = mongoClient.getDatabase("cinetec");
    
    public static void main(String[] args){
        interfaz.setVisible(true);
        //infoPeliculasPorProductora("Lucasfilm");
    }
    
    //Método para buscar películas por nombre
    public static void peliculaPorTitulo(String titulo){
        interfaz.cleanTable();
        String[] Fila = new String[9];
        FindIterable<Document> iterable = db.getCollection("peliculas").find(new Document("nombre", titulo));
        iterable.forEach(new Block<Document>() {
            @Override
            public void apply(final Document document) {
                Fila[0]=document.get("nombre").toString();
                Fila[1]=document.get("genero").toString();
                Fila[2]=document.get("Director").toString();
                Fila[3]=document.get("franquicia").toString();
                Fila[4]=document.get("pais").toString();
                Fila[5]=document.get("año").toString();
                Fila[6]=document.get("duracion").toString();
                Fila[7]=document.get("productora").toString();
                Fila[8]=document.get("actores").toString();
                addTableRow(Fila);
            }
        }); 
    }
    
    //Método para buscar películas por franquicia
    public static void peliculaPorFranquicia(String franquicia){
        interfaz.cleanTable();
        String[] Fila = new String[9];
        FindIterable<Document> iterable = db.getCollection("peliculas").find(new Document("franquicia", franquicia));
        iterable.forEach(new Block<Document>() {
            @Override
            public void apply(final Document document) {
                Fila[0]=document.get("nombre").toString();
                Fila[1]=document.get("genero").toString();
                Fila[2]=document.get("Director").toString();
                Fila[3]=document.get("franquicia").toString();
                Fila[4]=document.get("pais").toString();
                Fila[5]=document.get("año").toString();
                Fila[6]=document.get("duracion").toString();
                Fila[7]=document.get("productora").toString();
                Fila[8]=document.get("actores").toString();
                addTableRow(Fila);
            }
        }); 
    }
    
    //Método para buscar películas por un rango de años
    public static void peliculasPorAños(String año1, String año2){
        interfaz.cleanTable();
        String[] Fila = new String[9];
        FindIterable<Document> iterable = db.getCollection("peliculas").find(and(gt("año", año1), lte("año", año2)));
        iterable.forEach(new Block<Document>() {
            @Override
            public void apply(final Document document) {
                Fila[0]=document.get("nombre").toString();
                Fila[1]=document.get("genero").toString();
                Fila[2]=document.get("Director").toString();
                Fila[3]=document.get("franquicia").toString();
                Fila[4]=document.get("pais").toString();
                Fila[5]=document.get("año").toString();
                Fila[6]=document.get("duracion").toString();
                Fila[7]=document.get("productora").toString();
                Fila[8]=document.get("actores").toString();
                addTableRow(Fila);
            }
        });
        
    }
    
    //Método para buscar películas por productora
    public static void peliculasPorProductora(String productora){
        interfaz.cleanTable();
        BasicDBObject searchObject = new BasicDBObject();
        searchObject.put("productora",productora);
        BasicDBObject fieldObject = new BasicDBObject();
        fieldObject.put("nombre", 1);
        fieldObject.put("genero", 1);
        fieldObject.put("año", 1);
        String[] Fila = new String[9];
        FindIterable<Document> iterable = db.getCollection("peliculas").find(searchObject).projection(fieldObject);
        iterable.forEach(new Block<Document>() {
            @Override
            public void apply(final Document document) {
                Fila[0]=document.get("nombre").toString();
                Fila[1]=document.get("genero").toString();
                Fila[5]=document.get("año").toString();
                addTableRow(Fila);
            }
        }); 
    }
    
    //Método para buscar información de películas por productora
    public static void infoPeliculasPorProductora(String productora){
        interfaz.cleanTable();
        JFrame frame = new JFrame("Información de "+productora);
        JTextArea txt_Area = new JTextArea();
        txt_Area.setEditable(false);
        txt_Area.setFont(txt_Area.getFont().deriveFont(20f));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 500);
        frame.setVisible(true);
        frame.setResizable(false);
        BasicDBObject searchObject = new BasicDBObject();
        searchObject.put("productora",productora);
        BasicDBObject fieldObject = new BasicDBObject();
        fieldObject.put("nombre", 1);
        fieldObject.put("duracion", 1);
        BasicDBObject durationMaxObject = new BasicDBObject();
        durationMaxObject.put("duracion", -1);
        BasicDBObject durationMinObject = new BasicDBObject();
        durationMinObject.put("duracion", 1);
        String[] Fila = new String[9];
        long cantidadPeliculas = db.getCollection("peliculas").countDocuments(new Document("productora", productora));
        txt_Area.setText(txt_Area.getText()+"Cantidad de Películas: "+String.valueOf(cantidadPeliculas)+"\n");
        FindIterable<Document> menor = db.getCollection("peliculas").find(searchObject).projection(fieldObject).sort(durationMinObject).limit(1);
        menor.forEach(new Block<Document>() {
            @Override
            public void apply(final Document document) {
                Fila[0]=document.get("nombre").toString();
                Fila[6]=document.get("duracion").toString();
                //addTableRow(Fila);
                txt_Area.setText(txt_Area.getText()+"Película con menor duración: "+document.get("nombre").toString()+" ("+document.get("duracion").toString()+" minutos)"+"\n");
            }
        });
        
        FindIterable<Document> mayor = db.getCollection("peliculas").find(searchObject).projection(fieldObject).sort(durationMaxObject).limit(1);
        mayor.forEach(new Block<Document>() {
            @Override
            public void apply(final Document document) {
                Fila[0]=document.get("nombre").toString();
                Fila[6]=document.get("duracion").toString();
                //addTableRow(Fila);
                txt_Area.setText(txt_Area.getText()+"Película con mayor duración: "+document.get("nombre").toString()+" ("+document.get("duracion").toString()+" minutos)"+"\n");
            }
        });
        
        
        MongoCollection<org.bson.Document> dbCollection = db.getCollection("peliculas");
        AggregateIterable<org.bson.Document> aggregate = dbCollection.aggregate(Arrays.asList(Aggregates.group(new BsonDocument("_id", new BsonString("$productora")), new BsonField("avgDuration", new BsonDocument("$avg", new BsonString("$duracion"))))));
        aggregate.forEach(new Block<Document>() {
            @Override
            public void apply(final Document document) {
                if (document.get("_id").toString().equals("Document{{_id="+productora+"}}")) {
                    Fila[2]= document.get("avgDuration").toString();
                    //addTableRow(Fila);
                    txt_Area.setText(txt_Area.getText()+"Duración promedio de película: "+document.get("avgDuration").toString()+" minutos"+"\n");
                    
                }
            }
        });
        
        frame.add(txt_Area);
    }
    
    //Función para añadir una fila a la tabla
    public static void addTableRow(String[] Fila){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{Fila[0], Fila[1], Fila[2], Fila[3], Fila[4], 
        Fila[5], Fila[6], Fila[7], Fila[8]});
    }
}
