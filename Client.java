import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Hello proxiedHello = (Hello)Proxy.newProxyInstance(
                Client.class.getClassLoader(),
                new Class[]{ Hello.class },
                new UppercaseHandler(new HelloTarget())
                );

        assert proxiedHello.sayHello("Toby") == "HeLLo ToBY" : "동일하지 않다.";
    }
}
