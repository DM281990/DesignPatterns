package structural.adapter.xml;

import structural.adapter.Data;
import structural.adapter.DataAdapter;
import structural.adapter.json.JsonData;

public class XmlToJsonAdapter implements DataAdapter {
    @Override
    public Data convert(Data data) {
        XmlData xmlData = (XmlData) data;
        JsonData jsonData = new JsonData(xmlData);
        return jsonData;
    }
}
