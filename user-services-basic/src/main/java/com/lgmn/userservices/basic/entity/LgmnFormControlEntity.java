package com.lgmn.userservices.basic.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "lgmn_form_control", schema = "lgmn_user_services", catalog = "")
public class LgmnFormControlEntity {
    private int id;
    private String type;
    private String name;
    private int formId;
    private int fieldId;
    private String fieldType;
    private String fieldComment;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type", nullable = false, length = 20)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "form_id", nullable = false)
    public int getFormId() {
        return formId;
    }

    public void setFormId(int formId) {
        this.formId = formId;
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
    @Column(name = "field_type", nullable = false, length = 20)
    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    @Basic
    @Column(name = "field_comment", nullable = true, length = 200)
    public String getFieldComment() {
        return fieldComment;
    }

    public void setFieldComment(String fieldComment) {
        this.fieldComment = fieldComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LgmnFormControlEntity that = (LgmnFormControlEntity) o;
        return id == that.id &&
                formId == that.formId &&
                fieldId == that.fieldId &&
                Objects.equals(type, that.type) &&
                Objects.equals(name, that.name) &&
                Objects.equals(fieldType, that.fieldType) &&
                Objects.equals(fieldComment, that.fieldComment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, name, formId, fieldId, fieldType, fieldComment);
    }
}