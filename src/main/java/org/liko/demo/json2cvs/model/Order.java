package org.liko.demo.json2cvs.model;

import lombok.Data;

import java.util.List;

/**
 * Order
 *
 * @author liko
 * @date 2019/10/17
 */
@Data
public class Order {
    private String code;
    private String message;
    private String total_count;
    private List<Trades> trades;
}
