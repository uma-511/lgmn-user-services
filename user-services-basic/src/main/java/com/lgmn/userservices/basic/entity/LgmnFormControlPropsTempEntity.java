package com.lgmn.userservices.basic.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "lgmn_form_control_props_temp", schema = "lgmn_user_services", catalog = "")
public class LgmnFormControlPropsTempEntity {
    private int id;
    private int lfctId;
    private String key;
    private String value;
    private String type;
    private String group;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "lfct_id", nullable = false)
    public int getLfctId() {
        return lfctId;
    }

    public void setLfctId(int lfctId) {
        this.lfctId = lfctId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LgmnFormControlPropsTempEntity that = (LgmnFormControlPropsTempEntity) o;
        return id == that.id &&
                lfctId == that.lfctId &&
                Objects.equals(key, that.key) &&
                Objects.equals(value, that.value) &&
                Objects.equals(type, that.type) &&
                Objects.equals(group, that.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lfctId, key, value, type, group);
    }
}