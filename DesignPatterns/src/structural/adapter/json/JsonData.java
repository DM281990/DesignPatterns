package structural.adapter.json;

import structural.adapter.Data;
import structural.adapter.xml.XmlData;

public class JsonData extends Data {
    public JsonData (XmlData xmlData){
        this.type="json";
        this.content= buildJsonContentFromXmlContent(xmlData.content);
    }

    private String buildJsonContentFromXmlContent(String content) {
        //Soome operation
        return "converted json data";
    }
}
