package jesusignacio.es.parser;

import android.util.Log;
import android.util.Xml;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jesusignacio on 20/06/15.
 */
public class XMLHandler {

    private static final String ns = null;
    private static final String TAG = "XMLHandler";

    public class Pregunta {

        public final String enunciado;
        public final String opcion1;
        public final String opcion2;
        public final String opcion3;
        public final String opcion4;
        public final String opcion5;

        private Pregunta(String enunciado, String opcion1, String opcion2, String opcion3, String opcion4, String opcion5) {
            this.enunciado = enunciado;
            this.opcion1 = opcion1;
            this.opcion2 = opcion2;
            this.opcion3 = opcion3;
            this.opcion4 = opcion4;
            this.opcion5 = opcion5;
        }

    }

    public List<Pregunta> parse(InputStream in) throws XmlPullParserException,
            IOException {
        Log.d(TAG, "List<Pregunta> parse");
        try {
            XmlPullParser parser = Xml.newPullParser();
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            parser.setInput(in, null);
            parser.nextTag();
            return readFeed(parser);
        } finally {
            in.close();
        }
    }

    private List<Pregunta> readFeed(XmlPullParser parser)
            throws XmlPullParserException, IOException {

        Log.d(TAG, "List<Pregunta> readFeed");
        List<Pregunta> PreguntasList = new ArrayList<Pregunta>();

        parser.require(XmlPullParser.START_TAG, ns, "examen1");
        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            String tag = parser.getName();
            if (tag.equals("pregunta")) {
                Log.d(TAG, "tag == 'pregunta'");
                PreguntasList.add(readPregunta(parser));
            } else {
                skip(parser);
            }
        }

        return PreguntasList;
    }

    private Pregunta readPregunta(XmlPullParser parser)
            throws XmlPullParserException, IOException {

        Log.d(TAG, "Pregunta readPregunta");
        parser.require(XmlPullParser.START_TAG, ns, "pregunta");

        String enunciado = null;
        String opcion1 = null;
        String opcion2 = null;
        String opcion3 = null;
        String opcion4 = null;
        String opcion5 = null;

        /*while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            String tag = parser.getName();
            if (tag.equals("topartists")) {
                Log.d(TAG, "tag == " + tag);
                tag = parser.getName();

            } else if (tag.equals("artist")) {
                Log.d(TAG, "tag == " + tag);
                PreguntasList.add(readArtist(parser));
            } else {
                skip(parser);
            }
        }*/

        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            String tag = parser.getName();

            if (tag.equals("enunciado")) {
                enunciado = readEnunciado(parser);
                Log.d(TAG, "tag == 'enunciado': " + enunciado);
            }

            else if (tag.equals("opcion1")) {
                opcion1 = readOpcion1(parser);
                Log.d(TAG, "tag == 'opcion1': " + opcion1);
            }

            else if (tag.equals("opcion2")) {
                opcion2 = readOpcion2(parser);
                Log.d(TAG, "tag == 'opcion2': " + opcion2);
            }

            else if (tag.equals("opcion3")) {
                opcion3 = readOpcion3(parser);
                Log.d(TAG, "tag == 'opcion3': " + opcion3);
            }

            else if (tag.equals("opcion4")) {
                opcion4 = readOpcion4(parser);
                Log.d(TAG, "tag == 'opcion4': " + opcion4);
            }

            else if (tag.equals("opcion5")) {
                opcion5 = readOpcion5(parser);
                Log.d(TAG, "tag == 'opcion5': " + opcion5);
            }

            else {
                skip(parser);
            }
        }

        return new Pregunta(enunciado, opcion1, opcion2, opcion3, opcion4, opcion5);
    }

    private String readEnunciado(XmlPullParser parser) throws IOException,
            XmlPullParserException {
        Log.d(TAG, "readEnunciado");
        parser.require(XmlPullParser.START_TAG, ns, "enunciado");
        String enunciado = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "enunciado");
        return enunciado;
    }

    private String readOpcion1(XmlPullParser parser) throws IOException,
            XmlPullParserException {
        Log.d(TAG, "readOpcion1");
        parser.require(XmlPullParser.START_TAG, ns, "opcion1");
        String opcion1 = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "opcion1");
        return opcion1;
    }
    private String readOpcion2(XmlPullParser parser) throws IOException,
            XmlPullParserException {
        Log.d(TAG, "readOpcion2");
        parser.require(XmlPullParser.START_TAG, ns, "opcion2");
        String opcion2 = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "opcion2");
        return opcion2;
    }
    private String readOpcion3(XmlPullParser parser) throws IOException,
            XmlPullParserException {
        Log.d(TAG, "readOpcion3");
        parser.require(XmlPullParser.START_TAG, ns, "opcion3");
        String opcion3 = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "opcion3");
        return opcion3;
    }
    private String readOpcion4(XmlPullParser parser) throws IOException,
            XmlPullParserException {
        Log.d(TAG, "readOpcion4");
        parser.require(XmlPullParser.START_TAG, ns, "opcion4");
        String opcion4 = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "opcion4");
        return opcion4;
    }
    private String readOpcion5(XmlPullParser parser) throws IOException,
            XmlPullParserException {
        Log.d(TAG, "readOpcion5");
        parser.require(XmlPullParser.START_TAG, ns, "opcion5");
        String opcion5 = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "opcion5");
        return opcion5;
    }

    private String readText(XmlPullParser parser) throws IOException,
            XmlPullParserException {
        Log.d(TAG, "readText");
        String result = "";
        if (parser.next() == XmlPullParser.TEXT) {
            result = parser.getText();
            parser.nextTag();
        }
        return result;
    }

    private void skip(XmlPullParser parser) throws XmlPullParserException,
            IOException {

        Log.d(TAG, "skip");

        if (parser.getEventType() != XmlPullParser.START_TAG) {
            throw new IllegalStateException();
        }
        int depth = 1;
        while (depth != 0) {
            switch (parser.next()) {
                case XmlPullParser.END_TAG:
                    depth--;
                    break;
                case XmlPullParser.START_TAG:
                    depth++;
                    break;
            }
        }
    }
}