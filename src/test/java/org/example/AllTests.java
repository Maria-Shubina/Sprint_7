package org.example;

import org.example.courier.CourierCreateTest;
import org.example.courier.CouriereDeleteTest;
import org.example.courier.CredentialsTest;
import org.example.order.CreateOrderParamTest;
import org.example.order.GetOrderListTest;
import org.example.order.GetOrderTest;
import org.example.order.GetOrderTrackParamTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CourierCreateTest.class,
        CouriereDeleteTest.class,
        CredentialsTest.class,
        CreateOrderParamTest.class,
        GetOrderListTest.class,
        GetOrderTest.class,
        GetOrderTrackParamTest.class
})
public class AllTests {

}
