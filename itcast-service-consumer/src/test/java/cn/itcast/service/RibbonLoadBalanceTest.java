package cn.itcast.service;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;

@SpringBootTest
public class RibbonLoadBalanceTest {

    @Autowired
    private RibbonLoadBalancerClient client;

    @Test
    public void test(){
        for (int i = 0; i < 50; i++) {
            ServiceInstance instance = this.client.choose("service-provider");
            System.out.println(instance.getHost()+":"+instance.getPort());
        }
    }
}
