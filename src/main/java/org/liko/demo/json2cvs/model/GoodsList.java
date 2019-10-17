package org.liko.demo.json2cvs.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * GoodsList
 *
 * @author liko
 * @date 2019/10/17
 */
@Getter
@Setter
public class GoodsList {
    private String rec_id;
    private String trade_id;
    private String spec_id;
    private String platform_id;
    private String src_oid;
    private String suite_id;
    private String src_tid;
    private String gift_type;
    private String refund_status;
    private String guarantee_mode;
    private String delivery_term;
    private String bind_oid;
    private String num;
    private String price;
    private String actual_num;
    private String refund_num;
    private String order_price;
    private String share_price;
    private String adjust;
    private String discount;
    private String share_amount;
    private String share_post;
    private String paid;
    private String goods_name;
    private String goods_id;
    private String goods_no;
    private String spec_name;
    private String spec_no;
    private String spec_code;
    private String suite_no;
    private String flag;
    private String suite_name;
    private String suite_num;
    private String suite_amount;
    private String suite_discount;
    private String api_goods_name;
    private String api_spec_name;
    private String weight;
    private String commission;
    private String goods_type;
    private String large_type;
    private String invoice_type;
    private String invoice_content;
    private String from_mask;
    private String cid;
    private String remark;
    private String modified;
    private String created;
    private String platform_goods_id;
    private String platform_spec_id;
    private String prop2;
    private String tax_rate;

    @Override
    public String toString() {
        return rec_id + "," + trade_id + "," + spec_id + "," + platform_id + "," + src_oid + "," + suite_id + "," + src_tid + "," + gift_type + "," + refund_status + "," + guarantee_mode + "," + delivery_term + "," + bind_oid + "," + num + "," + price + "," + actual_num + "," + refund_num + "," + order_price + "," + share_price + "," + adjust + "," + discount + "," + share_amount + "," + share_post + "," + paid + "," + goods_name + "," + goods_id + "," + goods_no + "," + spec_name + "," + spec_no + "," + spec_code + "," + suite_no + "," + flag + "," + suite_name + "," + suite_num + "," + suite_amount + "," + suite_discount + "," + api_goods_name + "," + api_spec_name + "," + weight + "," + commission + "," + goods_type + "," + large_type + "," + invoice_type + "," + invoice_content + "," + from_mask + "," + cid + "," + remark + "," + modified + "," + created + "," + platform_goods_id + "," + platform_spec_id + "," + prop2 + "," + tax_rate;
    }
}
