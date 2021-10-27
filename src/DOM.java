
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xp
 */


public class DOM {
    Document doc;
    
    public int abrir_XML_DOM (File fichero){
        doc = null;
        
        try {
            DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);
            factory.setIgnoringElementContentWhitespace(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            doc= builder.parse(fichero);
            return 0;
        } catch (Exception e) {
        }
        return -1;
        
    }
    
    public String mostrar(){
        try {
            String salida = "";
            Node node;
            String datos_nodo[]= null;

            Node raiz = doc.getFirstChild();
            NodeList nodelist = raiz.getChildNodes();

            for(int i =0; i<nodelist.getLength(); i++){
                node= nodelist.item(i);

                if(node.getNodeType() == Node.ELEMENT_NODE){
                    datos_nodo = procesarLibro(node);
                    salida=salida + "\n" + "Publicado en: " + datos_nodo[0];
                    salida=salida + "\n" + "El titulo es: " + datos_nodo[1];
                    salida=salida + "\n" + "El autor es: " + datos_nodo[2];
                    salida=salida + "\n --------------------------------";
                }
            }
            return salida;
        } catch (Exception e) {
            System.err.println(e.toString());
            return null;
        }
    }
    
    private String[] procesarLibro(Node n){
        try {
            String datos[]= new String[3];
            Node ntemp= null;
            int contador = 1;

            datos[0] = n.getAttributes().item(0).getNodeValue();

            NodeList nodos = n.getChildNodes();

            for(int i=0; i<nodos.getLength(); i++){
                ntemp = nodos.item(i);

                if(ntemp.getNodeType() == Node.ELEMENT_NODE){
                    datos[contador] = ntemp.getFirstChild().getNodeValue();
                    contador++;
                }
            }
            return datos;
        } catch (Exception e) {
            System.err.println(e.toString());
            return null;
        }
    }
    
    public int annadir_DOM(String titulo, String autor,String anno){
        try {
            Node ntitulo = doc.createElement("Titulo");
            Node ntitulo_text = doc.createTextNode(titulo);
            ntitulo.appendChild(ntitulo_text);
            
            Node nautor = doc.createElement("Autor");
            Node nautor_text = doc.createTextNode(autor);
            nautor.appendChild(nautor_text);
            
            Node nlibro = doc.createElement("Libro");
            
            ((Element)nlibro).setAttribute("publicado_en", anno);
            nlibro.appendChild(ntitulo);
            nlibro.appendChild(nautor);
            
            Node raiz = doc.getFirstChild();
            raiz.appendChild(nlibro);
            return 0;
            
        } catch (Exception e) {
            System.out.println(e.toString());
            return -1;
        }
    }
}
