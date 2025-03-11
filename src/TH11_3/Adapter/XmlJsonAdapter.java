package TH11_3.Adapter;

public class XmlJsonAdapter implements JsonService {
    private XMLService xmlService;

    public XmlJsonAdapter(XMLService xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public String processJson(String json) {
        // Chuyển đổi từ JSON sang XML
        String xmlRequest = convertJsonToXml(json);
        // Gọi XMLService để xử lý dữ liệu XML
        String xmlResponse = xmlService.processXml(xmlRequest);
        // Chuyển đổi kết quả từ XML về JSON
        return convertXmlToJson(xmlResponse);
    }

    // Phương thức chuyển đổi từ JSON sang XML (giả lập)
    private String convertJsonToXml(String json) {
        // Trong thực tế có thể dùng thư viện chuyển đổi chuyên dụng
        return "<xml>" + json + "</xml>";
    }

    // Phương thức chuyển đổi từ XML sang JSON (giả lập)
    private String convertXmlToJson(String xml) {
        // Giả lập chuyển đổi: ở đây chỉ trả về kết quả cố định cho demo
        return "{\"response\":\"Processed\"}";
    }
}

