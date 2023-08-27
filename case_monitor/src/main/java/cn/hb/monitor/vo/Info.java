package cn.hb.monitor.vo;

import lombok.Data;

/**
 * @author yihang
 */
@Data
public class Info {
    private long free;
    private long total;
    private long max;
    private long time;
}
