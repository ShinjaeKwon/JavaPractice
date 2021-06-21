interface Parseble{
    //구문 분석 잡업을 수행한다.
    public abstract void parse(String fileName);
}
class ParserManager{
    //리턴 타입이 Parseble 인터페이스이다.
    public static Parseble getParser(String type){
        if(type.equals("XML")){
            return new XMLParser();
        } else{
            Parseble p = new HTMLParser();
            return p;
            //return new HTMLParser();
        }
    }
}

class XMLParser implements Parseble{
    public void parse(String fileName){
        //구문 분석 잡업을 수해앟는 코도를 적는다.
        System.out.println(fileName + "-XML parsing completed.");
    }
}

class HTMLParser implements Parseble{
    public void parse(String fileName) {
        //구문 분석 작업을 수행하는 코드를 적는다.
        System.out.println(fileName + "-HTML parsing completed.");
    }
}

public class ParserTest {
    public static void main(String[] args) {
        Parseble parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");
    }
}
