package com.pacvue.h10.customer.api.domain.customer.entity;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import lombok.Data;

import java.time.Instant;

/**
 * 实体类。
 *
 * @author mybatis-flex-helper automatic generation
 * @since 1.0
 */
@Table(value = "PpcTokenOfAccount")
@Data
public class PpcTokenOfAccount {

    @Id(keyType = KeyType.Auto)
    private Long id;

    @Column(value = "Account_id")
    private Integer accountId;

    @Column(value = "token")
    private String token;

    @Column(value = "status")
    private Integer status;

    @Column(value = "created_at")
    private Integer createdAt;

    @Column(value = "today_last_synced_at")
    private Instant todayLastSyncedAt;

    @Column(value = "yesterday_last_synced_at")
    private Instant yesterdayLastSyncedAt;

    @Column(value = "week_last_synced_at")
    private Instant weekLastSyncedAt;

    @Column(value = "profile_list")
    private String profileList;

    @Column(value = "todayLastSyncedLockTo")
    private Instant todayLastSyncedLockTo;

    @Column(value = "yesterdayLastSyncedLockTo")
    private Instant yesterdayLastSyncedLockTo;

    @Column(value = "weekLastSyncedLockTo")
    private Instant weekLastSyncedLockTo;

    @Column(value = "month_last_synced_at")
    private Instant monthLastSyncedAt;

    @Column(value = "monthLastSyncedLockTo")
    private Instant monthLastSyncedLockTo;
}
