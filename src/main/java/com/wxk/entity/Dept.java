package com.wxk.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author 478
 * @data 2020/10/31 - 10:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Entity(name = "t_dept")
@Table(name = "t_dept")
public class Dept implements Serializable {
    private static final long SerialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "JDBC")
    private String id;
    @Column( name = "deptName")
    private String deptName;
}
