package org.liko.demo.json2cvs;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.liko.demo.json2cvs.model.GoodsList;
import org.liko.demo.json2cvs.model.Order;
import org.liko.demo.json2cvs.model.Trades;

import java.io.*;
import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Json2CvsTest
 *
 * @author liko
 * @date 2019/10/17
 */
public class Json2CvsTest {
    @Test
    public void test() throws IOException {
        File file = new File("/Users/liko/project/github/LikoLi/json2cvs/src/test/resources/Order.json");
        FileReader reader = new FileReader(file);
        BufferedReader bf = new BufferedReader(reader);
        String collect = bf.lines().collect(Collectors.joining());

        Order order = JSON.parseObject(collect, Order.class);

        write2Cvs(order);
    }

    private void write2Cvs(Order order) throws IOException {
        List<Trades> trades = order.getTrades();
        writeList2Csv(trades, "/Users/liko/project/github/LikoLi/json2cvs/src/test/resources/trades.csv", getHeader(Trades.class));
        writeList2Csv(trades.stream().map(Trades::getGoods_list).collect(Collectors.toList()).get(0), "/Users/liko/project/github/LikoLi/json2cvs/src/test/resources/goodsList.csv", getHeader(GoodsList.class));
    }

    private <T> void writeList2Csv(List<T> list, String path, String header) throws IOException {
        File file = new File(path);
        FileWriter writer = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write(header);
        bw.newLine();
        for (T t : list) {
            bw.write(t.toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private String getHeader(Class tradesClass) {
        Field[] declaredFields = tradesClass.getDeclaredFields();
        String str = "";
        for (Field declaredField : declaredFields) {
            if ("goods_list".equals(declaredField.getName())) {
                continue;
            }
            str = str + declaredField.getName() + ",";
        }
        return str.substring(0, str.length() - 1);
    }

}
