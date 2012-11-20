package ard.quizler.domain.common.entity;

import ard.quizler.core.entity.BaseAuditedBean;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "account")
public class Account extends BaseAuditedBean {

    private static final long serialVersionUID = 1L;

    @Column(length = 50, nullable = false, unique = true)
    private String name;

    @Column(columnDefinition = "text", nullable = true)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(length = 10, nullable = false)
    private AccountStatus status = AccountStatus.IN_ACTIVE;

    @Column(name = "active_time", nullable = true)
    private Date activeTime;

    @Column(name = "activation_code", length = 50, nullable = false)
    private String activationCode;

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }
}
