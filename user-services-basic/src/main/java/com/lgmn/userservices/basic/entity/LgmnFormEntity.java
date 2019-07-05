package com.lgmn.userservices.basic.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "lgmn_form", schema = "lgmn_user_services", catalog = "")
public class LgmnFormEntity {
    private int id;
    private int permissionId;
    private int formType;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "permission_id", nullable = false)
    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    @Basic
    @Column(name = "form_type", nullable = false)
    public int getFormType() {
        return formType;
    }

    public void setFormType(int formType) {
        this.formType = formType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LgmnFormEntity that = (LgmnFormEntity) o;
        return id == that.id &&
                permissionId == that.permissionId &&
                formType == that.formType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, permissionId, formType);
    }
}