package com.lgmn.userservices.basic.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "lgmn_form_control_props", schema = "lgmn_user_services", catalog = "")
public class LgmnFormControlPropsEntity {
    private int id;
    private int lfcId;
    private String key;
    private String value;
    private String type;
    private String group;
    private Integer multilang;
    private Integer langId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "lfc_id", nullable = false)
    public int getLfcId() {
        return lfcId;
    }

    public void setLfcId(int lfcId) {
        this.lfcId = lfcId;
    }

    @Basic
    @Column(name = "key", nullable = false, length = 20)
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Basic
    @Column(name = "value", nullable = true, length = 20)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 20)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "group", nullable = true, length = 20)
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Basic
    @Column(name = "multilang", nullable = true)
    public Integer getMultilang() {
        return multilang;
    }

    public void setMultilang(Integer multilang) {
        this.multilang = multilang;
    }

    @Basic
    @Column(name = "lang_id", nullable = true)
    public Integer getLangId() {
        return langId;
    }

    public void setLangId(Integer langId) {
        this.langId = langId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LgmnFormControlPropsEntity that = (LgmnFormControlPropsEntity) o;
        return id == that.id &&
                lfcId == that.lfcId &&
                Objects.equals(key, that.key) &&
                Objects.equals(value, that.value) &&
                Objects.equals(type, that.type) &&
                Objects.equals(group, that.group) &&
                Objects.equals(multilang, that.multilang) &&
                Objects.equals(langId, that.langId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lfcId, key, value, type, group, multilang, langId);
    }
}