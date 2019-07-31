package com.erp.sys.model.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Param {

    @Id
    private Integer paramCode;

    private String paramValue;

    private String remark;

    private Integer ver;

    private Integer updator;

    private Date uptTime;
}
