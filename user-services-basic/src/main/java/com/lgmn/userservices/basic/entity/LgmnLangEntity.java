package com.lgmn.userservices.basic.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "lgmn_lang", schema = "lgmn_user_services", catalog = "")
public class LgmnLangEntity {
    private int id;
    private String zhCn;
    private String zhTw;
    private String enUs;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "zh_cn", nullable = false, length = 50)
    public String getZhCn() {
        return zhCn;
    }

    public void setZhCn(String zhCn) {
        this.zhCn = zhCn;
    }

    @Basic
    @Column(name = "zh_tw", nullable = false, length = 50)
    public String getZhTw() {
        return zhTw;
    }

    public void setZhTw(String zhTw) {
        this.zhTw = zhTw;
    }

    @Basic
    @Column(name = "en_us", nullable = false, length = 50)
    public String getEnUs() {
        return enUs;
    }

    public void setEnUs(String enUs) {
        this.enUs = enUs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LgmnLangEntity that = (LgmnLangEntity) o;
        return id == that.id &&
                Objects.equals(zhCn, that.zhCn) &&
                Objects.equals(zhTw, that.zhTw) &&
                Objects.equals(enUs, that.enUs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, zhCn, zhTw, enUs);
    }
}