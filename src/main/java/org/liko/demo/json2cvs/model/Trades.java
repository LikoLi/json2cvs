package org.liko.demo.json2cvs.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Trades
 *
 * @author liko
 * @date 2019/10/17
 */
@Getter
@Setter
public class Trades {
    private String trade_id;
    private String trade_no;
    private String platform_id;
    private String warehouse_type;
    private String src_tids;
    private String pay_account;
    private String trade_status;
    private String consign_status;
    private String trade_type;
    private String delivery_term;
    private String freeze_reason;
    private String refund_status;
    private String fenxiao_type;
    private String fenxiao_nick;
    private String trade_time;
    private String pay_time;
    private String buyer_nick;
    private String receiver_name;
    private String receiver_province;
    private String receiver_city;
    private String receiver_district;
    private String receiver_address;
    private String receiver_mobile;
    private String receiver_telno;
    private String receiver_zip;
    private String receiver_area;
    private String receiver_ring;
    private String receiver_dtb;
    private String to_deliver_time;
    private String bad_reason;
    private String logistics_no;
    private String buyer_message;
    private String cs_remark;
    private String remark_flag;
    private String print_remark;
    private String goods_type_count;
    private String goods_count;
    private String goods_amount;
    private String post_amount;
    private String other_amount;
    private String discount;
    private String receivable;
    private String dap_amount;
    private String cod_amount;
    private String ext_cod_fee;
    private String goods_cost;
    private String post_cost;
    private String paid;
    private String weight;
    private String profit;
    private String tax;
    private String tax_rate;
    private String commission;
    private String invoice_type;
    private String invoice_title;
    private String invoice_content;
    private String salesman_id;
    private String checker_id;
    private String fchecker_id;
    private String checkouter_id;
    private String stockout_no;
    private String flag_name;
    private String trade_from;
    private String single_spec_no;
    private String raw_goods_count;
    private String raw_goods_type_count;
    private String currency;
    private String split_package_num;
    private String invoice_id;
    private String version_id;
    private String modified;
    private String created;
    private String id_card_type;
    private String id_card;
    private String shop_no;
    private String shop_name;
    private String shop_remark;
    private String warehouse_no;
    private String customer_name;
    private String customer_no;
    private String logistics_id;
    private String logistics_name;
    private String logistics_code;
    private String logistics_type;
    private String fullname;
    private String checker_name;
    private List<GoodsList> goods_list;

    @Override
    public String toString() {
        return trade_id + "," + trade_no + "," + platform_id + "," + warehouse_type + "," + src_tids + "," + pay_account + "," + trade_status + "," + consign_status + "," + trade_type + "," + delivery_term + "," + freeze_reason + "," + refund_status + "," + fenxiao_type + "," + fenxiao_nick + "," + trade_time + "," + pay_time + "," + buyer_nick + "," + receiver_name + "," + receiver_province + "," + receiver_city + "," + receiver_district + "," + receiver_address + "," + receiver_mobile + "," + receiver_telno + "," + receiver_zip + "," + receiver_area + "," + receiver_ring + "," + receiver_dtb + "," + to_deliver_time + "," + bad_reason + "," + logistics_no + "," + buyer_message + "," + cs_remark + "," + remark_flag + "," + print_remark + "," + goods_type_count + "," + goods_count + "," + goods_amount + "," + post_amount + "," + other_amount + "," + discount + "," + receivable + "," + dap_amount + "," + cod_amount + "," + ext_cod_fee + "," + goods_cost + "," + post_cost + "," + paid + "," + weight + "," + profit + "," + tax + "," + tax_rate + "," + commission + "," + invoice_type + "," + invoice_title + "," + invoice_content + "," + salesman_id + "," + checker_id + "," + fchecker_id + "," + checkouter_id + "," + stockout_no + "," + flag_name + "," + trade_from + "," + single_spec_no + "," + raw_goods_count + "," + raw_goods_type_count + "," + currency + "," + split_package_num + "," + invoice_id + "," + version_id + "," + modified + "," + created + "," + id_card_type + "," + id_card + "," + shop_no + "," + shop_name + "," + shop_remark + "," + warehouse_no + "," + customer_name + "," + customer_no + "," + logistics_id + "," + logistics_name + "," + logistics_code + "," + logistics_type + "," + fullname + "," + checker_name;
    }
}
