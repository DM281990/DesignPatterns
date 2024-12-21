package structural.adapter.json;

import structural.adapter.Data;
import structural.adapter.DataAdapter;
import structural.adapter.xml.XmlData;

public class JsonToXmlAdapter implements DataAdapter {
    @Override
    public Data convert(Data data) {
        JsonData jsonData = (JsonData) data;
        XmlData xmlData = new XmlData(jsonData);
        return xmlData;
    }
}
