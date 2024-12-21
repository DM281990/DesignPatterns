package structural.adapter.xml;

import structural.adapter.Data;
import structural.adapter.json.JsonData;

public class XmlData extends Data {
    public XmlData (JsonData jsonData){
        this.type="xml";
        this.content= buildXmlContentFromJsonContent(jsonData.content);
    }

    private String buildXmlContentFromJsonContent(String content) {
        //Soome operation
        return "converted xml data";
    }

}
