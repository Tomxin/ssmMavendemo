package com.tot.entity;

import java.math.BigDecimal;
import java.util.Date;

public class FlightOrder {
    private Integer id;

    private String code;

    private String type;

    private String discr;

    private Boolean isAutoIssue;

    private Integer insuranceTypeId;

    private String vendorOrderId;

    private Integer ordererId;

    private Integer assessorId;

    private String requestReason;

    private String rejectReason;

    private Integer belongCompanyId;

    private Integer belongTmcId;

    private Integer belongVendorId;

    private String pnr1;

    private String pnr2;

    private String status;

    private BigDecimal totalCostPrice;

    private BigDecimal totalDealPrice;

    private BigDecimal totalPayPrice;

    private String extraMobile;

    private Integer originalOrderId;

    private Integer sourceOrderId;

    private String clientPlatformName;

    private String clientAppMarketName;

    private String clientAppName;

    private String clientAppVersion;

    private String clientIpAddress;

    private Boolean isOnline;

    private Boolean isVisible;

    private Boolean isReturnRebate;

    private Date entryTime;

    private Date successTime;

    private String changeOrRefundType;

    private Date createTime;

    private Date updateTime;

    private Byte isI18nTicket;

    private Byte isMultiSegment;

    private String tripleCode;

    private String autoIssueId;

    private String lowerPriceFlights;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDiscr() {
        return discr;
    }

    public void setDiscr(String discr) {
        this.discr = discr == null ? null : discr.trim();
    }

    public Boolean getIsAutoIssue() {
        return isAutoIssue;
    }

    public void setIsAutoIssue(Boolean isAutoIssue) {
        this.isAutoIssue = isAutoIssue;
    }

    public Integer getInsuranceTypeId() {
        return insuranceTypeId;
    }

    public void setInsuranceTypeId(Integer insuranceTypeId) {
        this.insuranceTypeId = insuranceTypeId;
    }

    public String getVendorOrderId() {
        return vendorOrderId;
    }

    public void setVendorOrderId(String vendorOrderId) {
        this.vendorOrderId = vendorOrderId == null ? null : vendorOrderId.trim();
    }

    public Integer getOrdererId() {
        return ordererId;
    }

    public void setOrdererId(Integer ordererId) {
        this.ordererId = ordererId;
    }

    public Integer getAssessorId() {
        return assessorId;
    }

    public void setAssessorId(Integer assessorId) {
        this.assessorId = assessorId;
    }

    public String getRequestReason() {
        return requestReason;
    }

    public void setRequestReason(String requestReason) {
        this.requestReason = requestReason == null ? null : requestReason.trim();
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason == null ? null : rejectReason.trim();
    }

    public Integer getBelongCompanyId() {
        return belongCompanyId;
    }

    public void setBelongCompanyId(Integer belongCompanyId) {
        this.belongCompanyId = belongCompanyId;
    }

    public Integer getBelongTmcId() {
        return belongTmcId;
    }

    public void setBelongTmcId(Integer belongTmcId) {
        this.belongTmcId = belongTmcId;
    }

    public Integer getBelongVendorId() {
        return belongVendorId;
    }

    public void setBelongVendorId(Integer belongVendorId) {
        this.belongVendorId = belongVendorId;
    }

    public String getPnr1() {
        return pnr1;
    }

    public void setPnr1(String pnr1) {
        this.pnr1 = pnr1 == null ? null : pnr1.trim();
    }

    public String getPnr2() {
        return pnr2;
    }

    public void setPnr2(String pnr2) {
        this.pnr2 = pnr2 == null ? null : pnr2.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public BigDecimal getTotalCostPrice() {
        return totalCostPrice;
    }

    public void setTotalCostPrice(BigDecimal totalCostPrice) {
        this.totalCostPrice = totalCostPrice;
    }

    public BigDecimal getTotalDealPrice() {
        return totalDealPrice;
    }

    public void setTotalDealPrice(BigDecimal totalDealPrice) {
        this.totalDealPrice = totalDealPrice;
    }

    public BigDecimal getTotalPayPrice() {
        return totalPayPrice;
    }

    public void setTotalPayPrice(BigDecimal totalPayPrice) {
        this.totalPayPrice = totalPayPrice;
    }

    public String getExtraMobile() {
        return extraMobile;
    }

    public void setExtraMobile(String extraMobile) {
        this.extraMobile = extraMobile == null ? null : extraMobile.trim();
    }

    public Integer getOriginalOrderId() {
        return originalOrderId;
    }

    public void setOriginalOrderId(Integer originalOrderId) {
        this.originalOrderId = originalOrderId;
    }

    public Integer getSourceOrderId() {
        return sourceOrderId;
    }

    public void setSourceOrderId(Integer sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
    }

    public String getClientPlatformName() {
        return clientPlatformName;
    }

    public void setClientPlatformName(String clientPlatformName) {
        this.clientPlatformName = clientPlatformName == null ? null : clientPlatformName.trim();
    }

    public String getClientAppMarketName() {
        return clientAppMarketName;
    }

    public void setClientAppMarketName(String clientAppMarketName) {
        this.clientAppMarketName = clientAppMarketName == null ? null : clientAppMarketName.trim();
    }

    public String getClientAppName() {
        return clientAppName;
    }

    public void setClientAppName(String clientAppName) {
        this.clientAppName = clientAppName == null ? null : clientAppName.trim();
    }

    public String getClientAppVersion() {
        return clientAppVersion;
    }

    public void setClientAppVersion(String clientAppVersion) {
        this.clientAppVersion = clientAppVersion == null ? null : clientAppVersion.trim();
    }

    public String getClientIpAddress() {
        return clientIpAddress;
    }

    public void setClientIpAddress(String clientIpAddress) {
        this.clientIpAddress = clientIpAddress == null ? null : clientIpAddress.trim();
    }

    public Boolean getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    public Boolean getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    public Boolean getIsReturnRebate() {
        return isReturnRebate;
    }

    public void setIsReturnRebate(Boolean isReturnRebate) {
        this.isReturnRebate = isReturnRebate;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    public String getChangeOrRefundType() {
        return changeOrRefundType;
    }

    public void setChangeOrRefundType(String changeOrRefundType) {
        this.changeOrRefundType = changeOrRefundType == null ? null : changeOrRefundType.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getIsI18nTicket() {
        return isI18nTicket;
    }

    public void setIsI18nTicket(Byte isI18nTicket) {
        this.isI18nTicket = isI18nTicket;
    }

    public Byte getIsMultiSegment() {
        return isMultiSegment;
    }

    public void setIsMultiSegment(Byte isMultiSegment) {
        this.isMultiSegment = isMultiSegment;
    }

    public String getTripleCode() {
        return tripleCode;
    }

    public void setTripleCode(String tripleCode) {
        this.tripleCode = tripleCode == null ? null : tripleCode.trim();
    }

    public String getAutoIssueId() {
        return autoIssueId;
    }

    public void setAutoIssueId(String autoIssueId) {
        this.autoIssueId = autoIssueId == null ? null : autoIssueId.trim();
    }

    public String getLowerPriceFlights() {
        return lowerPriceFlights;
    }

    public void setLowerPriceFlights(String lowerPriceFlights) {
        this.lowerPriceFlights = lowerPriceFlights == null ? null : lowerPriceFlights.trim();
    }
}