package com.fzk.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author fzk
 * @version 1.0
 * @date 2023/3/4  11:27
 */


@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable{

    private Long deptno;

    private String dname;

    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
