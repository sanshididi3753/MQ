public class ConsumerClient {
    public static void main(String[] args) throws Exception{
        MQClient client = new MQClient();
        String message = client.consume();
        System.out.println("获取的消息为： "+message);
    }
}
