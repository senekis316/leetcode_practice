package practice.leecode.Window;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinWindow_76Test {

    @Test
    public void minWindow_1() {
        MinWindow_76 minWindow_76 = new MinWindow_76();
        assertEquals("BANC", minWindow_76.minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    public void minWindow_2() {
        MinWindow_76 minWindow_76 = new MinWindow_76();
        assertEquals("a", minWindow_76.minWindow("a", "a"));
    }

    @Test
    public void minWindow_3() {
        MinWindow_76 minWindow_76 = new MinWindow_76();
        assertEquals("", minWindow_76.minWindow("a", "aa"));
    }

    @Test
    public void minWindow_4() {
        MinWindow_76 minWindow_76 = new MinWindow_76();
        assertEquals("aa", minWindow_76.minWindow("aa", "aa"));
    }

    @Test
    public void minWindow_5() {
        MinWindow_76 minWindow_76 = new MinWindow_76();
        assertEquals("baca", minWindow_76.minWindow("acbbaca", "aba"));
    }

    // 正向流程
    // (1) pvms订单号存在
    // (2) 库存状态不为空，库存不是库存状态，没有销售记录
    // (3)


    // 反向流程
    // 1.什么样的车辆允许去做解绑操作
    //  (1) 订单已生效，
    //  (2) 报价单类型是无配额的，
    //  (3) stocktype = 0

    // 2.反向流程需要修改那些数据
    // (1) 通过错误的commNo重新创建一条库存记录
    // (2) stock对应的错误的commNo从stock记录中删除
    // (3) commNo对应的销售记录清除
    // (4) 合同和报价单信息都无需修改
    // (5) 通知DMS进行车辆解绑, 解绑需要dms_order_id, 销售顾问的userId,
    // locationCode, dealerCode, companyCode, vehicleChangeEnum = 4, modelCode

}