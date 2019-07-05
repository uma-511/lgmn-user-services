package com.lgmn.userservices.basic.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "lgmn_fields", schema = "lgmn_user_services", catalog = "")
public class LgmnFieldsEntity {
    private int id;
    private int permissionId;
    private String tableName;
    private String fieldName;
    private String fieldType;
    private String fieldComment;
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
    @Column(name = "permission_id", nullable = false)
    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    @Basic
    @Column(name = "table_name", nullable = false, length = 50)
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "field_name", nullable = false, length = 50)
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @Basic
    @Column(name = "field_type", nullable = false, length = 20)
    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    @Basic
    @Column(name = "field_comment", nullable = true, length = 300)
    public String getFieldComment() {
        return fieldComment;
    }

    public void setFieldComment(String fieldComment) {
        this.fieldComment = fieldComment;
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
        LgmnFieldsEntity that = (LgmnFieldsEntity) o;
        return id == that.id &&
                permissionId == that.permissionId &&
                Objects.equals(tableName, that.tableName) &&
                Objects.equals(fieldName, that.fieldName) &&
                Objects.equals(fieldType, that.fieldType) &&
                Objects.equals(fieldComment, that.fieldComment) &&
                Objects.equals(langId, that.langId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, permissionId, tableName, fieldName, fieldType, fieldComment, langId);
    }
}