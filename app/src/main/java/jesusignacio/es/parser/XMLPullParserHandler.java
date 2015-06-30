package jesusignacio.es.parser;

/**
 * Created by jesusignacio on 14/06/15.
 */
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Sairamkrishna on 4/11/2015.
 */
public class XMLPullParserHandler {
    private String opcion1 = "opcion1";
    private String opcion2 = "opcion2";
    private String opcion3 = "opcion3";
    private String opcion4 = "opcion4";
    private String opcion5 = "opcion5";
    private String enunciado = "enunciado";
    private int respuesta;
    private int code;

    private XmlPullParserFactory xmlFactoryObject;
    public volatile boolean parsingComplete = true;

    /*public XMLPullParserHandler(String url){
        this.urlString = url;
    }*/

    public String getEnunciado(){
        return enunciado;
    }

    public int getRespuesta(){
        return respuesta;
    }

    public int getCode(){
        return code;
    }

    public String getOpcion1(){
        return opcion1;
    }

    public String getOpcion2(){
        return opcion2;
    }

    public String getOpcion3(){
        return opcion3;
    }

    public String getOpcion4(){
        return opcion4;
    }

    public String getOpcion5(){
        return opcion5;
    }


    public void parseXMLAndStoreIt(XmlPullParser myParser) {
        int event;
        String text=null;

        try {
            event = myParser.getEventType();

            while (event != XmlPullParser.END_DOCUMENT) {
                String name=myParser.getName();

                switch (event){
                    case XmlPullParser.START_TAG:
                        break;

                    case XmlPullParser.TEXT:
                        text = myParser.getText();
                        break;

                    case XmlPullParser.END_TAG:
                        if(name.equals("enunciado")){
                            enunciado = text;
                        }

                        else if(name.equals("opcion1")){
                            opcion1 = text;
                        }

                        else if(name.equals("opcion2")){
                            opcion2 = text;
                        }

                        else if(name.equals("opcion3")){
                            opcion3 = text;
                        }

                        else if(name.equals("opcion4")){
                            opcion3 = text;
                        }

                        else if(name.equals("opcion5")){
                            opcion3 = text;
                        }

                        else{
                        }
                        break;
                }
                event = myParser.next();
            }
            parsingComplete = false;
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
