package com.lgmn.userservices.basic.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "lgmn_role_field", schema = "lgmn_user_services", catalog = "")
public class LgmnRoleFieldEntity {
    private int id;
    private int roleId;
    private int fieldId;
    private Integer isShow;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "role_id", nullable = false)
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "field_id", nullable = false)
    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }

    @Basic
    @Column(name = "is_show", nullable = true)
    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LgmnRoleFieldEntity that = (LgmnRoleFieldEntity) o;
        return id == that.id &&
                roleId == that.roleId &&
                fieldId == that.fieldId &&
                Objects.equals(isShow, that.isShow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleId, fieldId, isShow);
    }
}