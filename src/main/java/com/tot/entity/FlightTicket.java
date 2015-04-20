package com.tot.entity;

import java.math.BigDecimal;
import java.util.Date;

public class FlightTicket {
    private Integer id;

    private String code;

    private String type;

    private String discr;

    private Boolean isAutoIssue;

    private Integer ordererId;

    private String pnr1;

    private String pnr2;

    private String status;

    private Integer airportConstructionFee;

    private Integer fuelSurcharge;

    private Integer ticketParPrice;

    private BigDecimal ticketParPriceDiscount;

    private BigDecimal rebate;

    private BigDecimal commissionCharge;

    private Integer diffTicketParPrice;

    private BigDecimal totalPrice;

    private BigDecimal commissionChargeFromVendor;

    private BigDecimal rebateFromVendor;

    private BigDecimal totalCostPrice;

    private Integer belongCompanyId;

    private Integer belongTmcId;

    private Integer belongVendorId;

    private Integer flightSegmentId;

    private String passengerName;

    private Integer passengerId;

    private String passengerCertificateType;

    private String passengerCertificateCode;

    private String passengerType;

    private String passengerSourceType;

    private String passengerBirthday;

    private String passengerGender;

    private Boolean passengerIsVip;

    private Boolean passengerNeedSmsNotice;

    private String passengerMobile;

    private Integer sourceTicketId;

    private Integer originalTicketId;

    private Integer curSettleLogDetailId;

    private Integer belongOrderId;

    private String changeOrRefundType;

    private Date createTime;

    private Date updateTime;

    private Byte isI18nTicket;

    private Byte isMultiSegment;

    private BigDecimal totalTax;

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

    public Integer getOrdererId() {
        return ordererId;
    }

    public void setOrdererId(Integer ordererId) {
        this.ordererId = ordererId;
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

    public Integer getAirportConstructionFee() {
        return airportConstructionFee;
    }

    public void setAirportConstructionFee(Integer airportConstructionFee) {
        this.airportConstructionFee = airportConstructionFee;
    }

    public Integer getFuelSurcharge() {
        return fuelSurcharge;
    }

    public void setFuelSurcharge(Integer fuelSurcharge) {
        this.fuelSurcharge = fuelSurcharge;
    }

    public Integer getTicketParPrice() {
        return ticketParPrice;
    }

    public void setTicketParPrice(Integer ticketParPrice) {
        this.ticketParPrice = ticketParPrice;
    }

    public BigDecimal getTicketParPriceDiscount() {
        return ticketParPriceDiscount;
    }

    public void setTicketParPriceDiscount(BigDecimal ticketParPriceDiscount) {
        this.ticketParPriceDiscount = ticketParPriceDiscount;
    }

    public BigDecimal getRebate() {
        return rebate;
    }

    public void setRebate(BigDecimal rebate) {
        this.rebate = rebate;
    }

    public BigDecimal getCommissionCharge() {
        return commissionCharge;
    }

    public void setCommissionCharge(BigDecimal commissionCharge) {
        this.commissionCharge = commissionCharge;
    }

    public Integer getDiffTicketParPrice() {
        return diffTicketParPrice;
    }

    public void setDiffTicketParPrice(Integer diffTicketParPrice) {
        this.diffTicketParPrice = diffTicketParPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getCommissionChargeFromVendor() {
        return commissionChargeFromVendor;
    }

    public void setCommissionChargeFromVendor(BigDecimal commissionChargeFromVendor) {
        this.commissionChargeFromVendor = commissionChargeFromVendor;
    }

    public BigDecimal getRebateFromVendor() {
        return rebateFromVendor;
    }

    public void setRebateFromVendor(BigDecimal rebateFromVendor) {
        this.rebateFromVendor = rebateFromVendor;
    }

    public BigDecimal getTotalCostPrice() {
        return totalCostPrice;
    }

    public void setTotalCostPrice(BigDecimal totalCostPrice) {
        this.totalCostPrice = totalCostPrice;
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

    public Integer getFlightSegmentId() {
        return flightSegmentId;
    }

    public void setFlightSegmentId(Integer flightSegmentId) {
        this.flightSegmentId = flightSegmentId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName == null ? null : passengerName.trim();
    }

    public Integer getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }

    public String getPassengerCertificateType() {
        return passengerCertificateType;
    }

    public void setPassengerCertificateType(String passengerCertificateType) {
        this.passengerCertificateType = passengerCertificateType == null ? null : passengerCertificateType.trim();
    }

    public String getPassengerCertificateCode() {
        return passengerCertificateCode;
    }

    public void setPassengerCertificateCode(String passengerCertificateCode) {
        this.passengerCertificateCode = passengerCertificateCode == null ? null : passengerCertificateCode.trim();
    }

    public String getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType == null ? null : passengerType.trim();
    }

    public String getPassengerSourceType() {
        return passengerSourceType;
    }

    public void setPassengerSourceType(String passengerSourceType) {
        this.passengerSourceType = passengerSourceType == null ? null : passengerSourceType.trim();
    }

    public String getPassengerBirthday() {
        return passengerBirthday;
    }

    public void setPassengerBirthday(String passengerBirthday) {
        this.passengerBirthday = passengerBirthday == null ? null : passengerBirthday.trim();
    }

    public String getPassengerGender() {
        return passengerGender;
    }

    public void setPassengerGender(String passengerGender) {
        this.passengerGender = passengerGender == null ? null : passengerGender.trim();
    }

    public Boolean getPassengerIsVip() {
        return passengerIsVip;
    }

    public void setPassengerIsVip(Boolean passengerIsVip) {
        this.passengerIsVip = passengerIsVip;
    }

    public Boolean getPassengerNeedSmsNotice() {
        return passengerNeedSmsNotice;
    }

    public void setPassengerNeedSmsNotice(Boolean passengerNeedSmsNotice) {
        this.passengerNeedSmsNotice = passengerNeedSmsNotice;
    }

    public String getPassengerMobile() {
        return passengerMobile;
    }

    public void setPassengerMobile(String passengerMobile) {
        this.passengerMobile = passengerMobile == null ? null : passengerMobile.trim();
    }

    public Integer getSourceTicketId() {
        return sourceTicketId;
    }

    public void setSourceTicketId(Integer sourceTicketId) {
        this.sourceTicketId = sourceTicketId;
    }

    public Integer getOriginalTicketId() {
        return originalTicketId;
    }

    public void setOriginalTicketId(Integer originalTicketId) {
        this.originalTicketId = originalTicketId;
    }

    public Integer getCurSettleLogDetailId() {
        return curSettleLogDetailId;
    }

    public void setCurSettleLogDetailId(Integer curSettleLogDetailId) {
        this.curSettleLogDetailId = curSettleLogDetailId;
    }

    public Integer getBelongOrderId() {
        return belongOrderId;
    }

    public void setBelongOrderId(Integer belongOrderId) {
        this.belongOrderId = belongOrderId;
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

    public BigDecimal getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }
}