package com.itheima.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Description TODO
 * @Author W12777
 * @Date 2021/5/13 10:57
 * @Version 1.0
 **/

/**
 * 1.lombok插件
 * 2.引入依赖
 * 3.Bean上注解使用
 *
 * @Data ：自动提供getter和setter、hashCode、equals、toString等
 * @Getter：自动提供getter方法
 * @Setter：自动提供setter方法
 * @Slf4j：自动在bean中提供log变量，
 * 其实用的是slf4j的日志功能。
 * 例如；在javabean上加@Data，那么就可以省去getter和setter等方法的编写，lombok插件会自动生成。
 *
 */

@Data
@Table(name = "tb_user") //在User实体类上加JPA注解
public class User {
    //  id
    //开启主键自动回填
    @Id  // 相当于http://localhost/user/12   中的12赋值给主键id查询 SELECT id,user_name,password,name,age,sex,birthday,created,updated,note FROM tb_user WHERE id = ?
    // 不加@Id  SELECT id,user_name,password,name,age,sex,birthday,created,updated,note FROM tb_user WHERE id = ? AND user_name = ? AND password = ? AND name = ? AND age = ? AND sex = ? AND birthday = ? AND created = ? AND updated = ? AND note = ?
    @KeySql(useGeneratedKeys = true)
    private Long id;

    //  用户名
    private String userName;
    // 密码
    private String password;
    // 姓名
    private String name;
    // 年龄
    private Integer age;
    // 性别，1男性，2女性
    private Integer sex;
    // 出生日期
    private Date birthday;
    // 创建时间
    private Date created;
    // 更新时间
    private Date updated;
    // 备注
    private String note;

}
