public class ProduceClient {
    public static void main(String[] args)throws Exception {
        // TODO Auto-generated method stub
        MQClient client = new MQClient();
        client.produce("Hello Java");
    }

}
