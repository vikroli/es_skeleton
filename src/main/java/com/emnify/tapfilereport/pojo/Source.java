
package com.emnify.tapfilereport.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Recording_Entity",
    "Charging_Id",
    "AccessPointName_OI",
    "AccessPointName_NI",
    "PDP_Address",
    "IMEI",
    "Serving_Network",
    "TotalCallEventDuration",
    "Traffic_Type",
    "Volume_Tx",
    "Volume_Rx",
    "Volume_Total",
    "IMSI",
    "MSISDN",
    "TapFileName",
    "File_Sequence_Number",
    "Sender",
    "Recipient",
    "LocalCurrency",
    "CurrencyConversionInfo",
    "UTCTimeOffsetInfo",
    "SGSN_GGSN_Info",
    "AuditControlInfo",
    "AccountingInfo",
    "CallEventStartTimeStamp_UTCTimestamp",
    "ChargeInformationList",
    "CellID",
    "Location_Area",
    "CallEventStartTimeStamp_UTCOffset",
    "CallEventStartTimeStamp_LocalTimestamp"
})
public class Source implements Serializable
{

    @JsonProperty("Recording_Entity")
    private List<Integer> recordingEntity = null;
    @JsonProperty("Charging_Id")
    private int chargingId;
    @JsonProperty("AccessPointName_OI")
    private Object accessPointNameOI;
    @JsonProperty("AccessPointName_NI")
    private String accessPointNameNI;
    @JsonProperty("PDP_Address")
    private String pDPAddress;
    @JsonProperty("IMEI")
    private String iMEI;
    @JsonProperty("Serving_Network")
    private Object servingNetwork;
    @JsonProperty("TotalCallEventDuration")
    private int totalCallEventDuration;
    @JsonProperty("Traffic_Type")
    private String trafficType;
    @JsonProperty("Volume_Tx")
    private double volumeTx;
    @JsonProperty("Volume_Rx")
    private double volumeRx;
    @JsonProperty("Volume_Total")
    private double volumeTotal;
    @JsonProperty("IMSI")
    private String iMSI;
    @JsonProperty("MSISDN")
    private Object mSISDN;
    @JsonProperty("TapFileName")
    private String tapFileName;
    @JsonProperty("File_Sequence_Number")
    private String fileSequenceNumber;
    @JsonProperty("Sender")
    private String sender;
    @JsonProperty("Recipient")
    private String recipient;
    @JsonProperty("LocalCurrency")
    private String localCurrency;
    @JsonProperty("CurrencyConversionInfo")
    private CurrencyConversionInfo currencyConversionInfo;
    @JsonProperty("UTCTimeOffsetInfo")
    private UTCTimeOffsetInfo uTCTimeOffsetInfo;
    @JsonProperty("SGSN_GGSN_Info")
    private List<SGSNGGSNInfo> sGSNGGSNInfo = null;
    @JsonProperty("AuditControlInfo")
    private AuditControlInfo auditControlInfo;
    @JsonProperty("AccountingInfo")
    private AccountingInfo accountingInfo;
    @JsonProperty("CallEventStartTimeStamp_UTCTimestamp")
    private String callEventStartTimeStampUTCTimestamp;
    @JsonProperty("ChargeInformationList")
    private List<ChargeInformationList> chargeInformationList = null;
    @JsonProperty("CellID")
    private Object cellID;
    @JsonProperty("Location_Area")
    private int locationArea;
    @JsonProperty("CallEventStartTimeStamp_UTCOffset")
    private int callEventStartTimeStampUTCOffset;
    @JsonProperty("CallEventStartTimeStamp_LocalTimestamp")
    private String callEventStartTimeStampLocalTimestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6504585696760529437L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Source() {
    }

    /**
     * 
     * @param callEventStartTimeStampLocalTimestamp
     * @param localCurrency
     * @param accessPointNameNI
     * @param tapFileName
     * @param chargeInformationList
     * @param iMSI
     * @param volumeTotal
     * @param locationArea
     * @param cellID
     * @param recipient
     * @param servingNetwork
     * @param iMEI
     * @param sender
     * @param auditControlInfo
     * @param chargingId
     * @param mSISDN
     * @param volumeRx
     * @param totalCallEventDuration
     * @param accessPointNameOI
     * @param volumeTx
     * @param fileSequenceNumber
     * @param pDPAddress
     * @param trafficType
     * @param callEventStartTimeStampUTCTimestamp
     * @param accountingInfo
     * @param callEventStartTimeStampUTCOffset
     * @param currencyConversionInfo
     * @param recordingEntity
     * @param sGSNGGSNInfo
     * @param uTCTimeOffsetInfo
     */
    public Source(List<Integer> recordingEntity, int chargingId, Object accessPointNameOI, String accessPointNameNI, String pDPAddress, String iMEI, Object servingNetwork, int totalCallEventDuration, String trafficType, double volumeTx, double volumeRx, double volumeTotal, String iMSI, Object mSISDN, String tapFileName, String fileSequenceNumber, String sender, String recipient, String localCurrency, CurrencyConversionInfo currencyConversionInfo, UTCTimeOffsetInfo uTCTimeOffsetInfo, List<SGSNGGSNInfo> sGSNGGSNInfo, AuditControlInfo auditControlInfo, AccountingInfo accountingInfo, String callEventStartTimeStampUTCTimestamp, List<ChargeInformationList> chargeInformationList, Object cellID, int locationArea, int callEventStartTimeStampUTCOffset, String callEventStartTimeStampLocalTimestamp) {
        super();
        this.recordingEntity = recordingEntity;
        this.chargingId = chargingId;
        this.accessPointNameOI = accessPointNameOI;
        this.accessPointNameNI = accessPointNameNI;
        this.pDPAddress = pDPAddress;
        this.iMEI = iMEI;
        this.servingNetwork = servingNetwork;
        this.totalCallEventDuration = totalCallEventDuration;
        this.trafficType = trafficType;
        this.volumeTx = volumeTx;
        this.volumeRx = volumeRx;
        this.volumeTotal = volumeTotal;
        this.iMSI = iMSI;
        this.mSISDN = mSISDN;
        this.tapFileName = tapFileName;
        this.fileSequenceNumber = fileSequenceNumber;
        this.sender = sender;
        this.recipient = recipient;
        this.localCurrency = localCurrency;
        this.currencyConversionInfo = currencyConversionInfo;
        this.uTCTimeOffsetInfo = uTCTimeOffsetInfo;
        this.sGSNGGSNInfo = sGSNGGSNInfo;
        this.auditControlInfo = auditControlInfo;
        this.accountingInfo = accountingInfo;
        this.callEventStartTimeStampUTCTimestamp = callEventStartTimeStampUTCTimestamp;
        this.chargeInformationList = chargeInformationList;
        this.cellID = cellID;
        this.locationArea = locationArea;
        this.callEventStartTimeStampUTCOffset = callEventStartTimeStampUTCOffset;
        this.callEventStartTimeStampLocalTimestamp = callEventStartTimeStampLocalTimestamp;
    }

    @JsonProperty("Recording_Entity")
    public List<Integer> getRecordingEntity() {
        return recordingEntity;
    }

    @JsonProperty("Recording_Entity")
    public void setRecordingEntity(List<Integer> recordingEntity) {
        this.recordingEntity = recordingEntity;
    }

    @JsonProperty("Charging_Id")
    public int getChargingId() {
        return chargingId;
    }

    @JsonProperty("Charging_Id")
    public void setChargingId(int chargingId) {
        this.chargingId = chargingId;
    }

    @JsonProperty("AccessPointName_OI")
    public Object getAccessPointNameOI() {
        return accessPointNameOI;
    }

    @JsonProperty("AccessPointName_OI")
    public void setAccessPointNameOI(Object accessPointNameOI) {
        this.accessPointNameOI = accessPointNameOI;
    }

    @JsonProperty("AccessPointName_NI")
    public String getAccessPointNameNI() {
        return accessPointNameNI;
    }

    @JsonProperty("AccessPointName_NI")
    public void setAccessPointNameNI(String accessPointNameNI) {
        this.accessPointNameNI = accessPointNameNI;
    }

    @JsonProperty("PDP_Address")
    public String getPDPAddress() {
        return pDPAddress;
    }

    @JsonProperty("PDP_Address")
    public void setPDPAddress(String pDPAddress) {
        this.pDPAddress = pDPAddress;
    }

    @JsonProperty("IMEI")
    public String getIMEI() {
        return iMEI;
    }

    @JsonProperty("IMEI")
    public void setIMEI(String iMEI) {
        this.iMEI = iMEI;
    }

    @JsonProperty("Serving_Network")
    public Object getServingNetwork() {
        return servingNetwork;
    }

    @JsonProperty("Serving_Network")
    public void setServingNetwork(Object servingNetwork) {
        this.servingNetwork = servingNetwork;
    }

    @JsonProperty("TotalCallEventDuration")
    public int getTotalCallEventDuration() {
        return totalCallEventDuration;
    }

    @JsonProperty("TotalCallEventDuration")
    public void setTotalCallEventDuration(int totalCallEventDuration) {
        this.totalCallEventDuration = totalCallEventDuration;
    }

    @JsonProperty("Traffic_Type")
    public String getTrafficType() {
        return trafficType;
    }

    @JsonProperty("Traffic_Type")
    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }

    @JsonProperty("Volume_Tx")
    public double getVolumeTx() {
        return volumeTx;
    }

    @JsonProperty("Volume_Tx")
    public void setVolumeTx(double volumeTx) {
        this.volumeTx = volumeTx;
    }

    @JsonProperty("Volume_Rx")
    public double getVolumeRx() {
        return volumeRx;
    }

    @JsonProperty("Volume_Rx")
    public void setVolumeRx(double volumeRx) {
        this.volumeRx = volumeRx;
    }

    @JsonProperty("Volume_Total")
    public double getVolumeTotal() {
        return volumeTotal;
    }

    @JsonProperty("Volume_Total")
    public void setVolumeTotal(double volumeTotal) {
        this.volumeTotal = volumeTotal;
    }

    @JsonProperty("IMSI")
    public String getIMSI() {
        return iMSI;
    }

    @JsonProperty("IMSI")
    public void setIMSI(String iMSI) {
        this.iMSI = iMSI;
    }

    @JsonProperty("MSISDN")
    public Object getMSISDN() {
        return mSISDN;
    }

    @JsonProperty("MSISDN")
    public void setMSISDN(Object mSISDN) {
        this.mSISDN = mSISDN;
    }

    @JsonProperty("TapFileName")
    public String getTapFileName() {
        return tapFileName;
    }

    @JsonProperty("TapFileName")
    public void setTapFileName(String tapFileName) {
        this.tapFileName = tapFileName;
    }

    @JsonProperty("File_Sequence_Number")
    public String getFileSequenceNumber() {
        return fileSequenceNumber;
    }

    @JsonProperty("File_Sequence_Number")
    public void setFileSequenceNumber(String fileSequenceNumber) {
        this.fileSequenceNumber = fileSequenceNumber;
    }

    @JsonProperty("Sender")
    public String getSender() {
        return sender;
    }

    @JsonProperty("Sender")
    public void setSender(String sender) {
        this.sender = sender;
    }

    @JsonProperty("Recipient")
    public String getRecipient() {
        return recipient;
    }

    @JsonProperty("Recipient")
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @JsonProperty("LocalCurrency")
    public String getLocalCurrency() {
        return localCurrency;
    }

    @JsonProperty("LocalCurrency")
    public void setLocalCurrency(String localCurrency) {
        this.localCurrency = localCurrency;
    }

    @JsonProperty("CurrencyConversionInfo")
    public CurrencyConversionInfo getCurrencyConversionInfo() {
        return currencyConversionInfo;
    }

    @JsonProperty("CurrencyConversionInfo")
    public void setCurrencyConversionInfo(CurrencyConversionInfo currencyConversionInfo) {
        this.currencyConversionInfo = currencyConversionInfo;
    }

    @JsonProperty("UTCTimeOffsetInfo")
    public UTCTimeOffsetInfo getUTCTimeOffsetInfo() {
        return uTCTimeOffsetInfo;
    }

    @JsonProperty("UTCTimeOffsetInfo")
    public void setUTCTimeOffsetInfo(UTCTimeOffsetInfo uTCTimeOffsetInfo) {
        this.uTCTimeOffsetInfo = uTCTimeOffsetInfo;
    }

    @JsonProperty("SGSN_GGSN_Info")
    public List<SGSNGGSNInfo> getSGSNGGSNInfo() {
        return sGSNGGSNInfo;
    }

    @JsonProperty("SGSN_GGSN_Info")
    public void setSGSNGGSNInfo(List<SGSNGGSNInfo> sGSNGGSNInfo) {
        this.sGSNGGSNInfo = sGSNGGSNInfo;
    }

    @JsonProperty("AuditControlInfo")
    public AuditControlInfo getAuditControlInfo() {
        return auditControlInfo;
    }

    @JsonProperty("AuditControlInfo")
    public void setAuditControlInfo(AuditControlInfo auditControlInfo) {
        this.auditControlInfo = auditControlInfo;
    }

    @JsonProperty("AccountingInfo")
    public AccountingInfo getAccountingInfo() {
        return accountingInfo;
    }

    @JsonProperty("AccountingInfo")
    public void setAccountingInfo(AccountingInfo accountingInfo) {
        this.accountingInfo = accountingInfo;
    }

    @JsonProperty("CallEventStartTimeStamp_UTCTimestamp")
    public String getCallEventStartTimeStampUTCTimestamp() {
        return callEventStartTimeStampUTCTimestamp;
    }

    @JsonProperty("CallEventStartTimeStamp_UTCTimestamp")
    public void setCallEventStartTimeStampUTCTimestamp(String callEventStartTimeStampUTCTimestamp) {
        this.callEventStartTimeStampUTCTimestamp = callEventStartTimeStampUTCTimestamp;
    }

    @JsonProperty("ChargeInformationList")
    public List<ChargeInformationList> getChargeInformationList() {
        return chargeInformationList;
    }

    @JsonProperty("ChargeInformationList")
    public void setChargeInformationList(List<ChargeInformationList> chargeInformationList) {
        this.chargeInformationList = chargeInformationList;
    }

    @JsonProperty("CellID")
    public Object getCellID() {
        return cellID;
    }

    @JsonProperty("CellID")
    public void setCellID(Object cellID) {
        this.cellID = cellID;
    }

    @JsonProperty("Location_Area")
    public int getLocationArea() {
        return locationArea;
    }

    @JsonProperty("Location_Area")
    public void setLocationArea(int locationArea) {
        this.locationArea = locationArea;
    }

    @JsonProperty("CallEventStartTimeStamp_UTCOffset")
    public int getCallEventStartTimeStampUTCOffset() {
        return callEventStartTimeStampUTCOffset;
    }

    @JsonProperty("CallEventStartTimeStamp_UTCOffset")
    public void setCallEventStartTimeStampUTCOffset(int callEventStartTimeStampUTCOffset) {
        this.callEventStartTimeStampUTCOffset = callEventStartTimeStampUTCOffset;
    }

    @JsonProperty("CallEventStartTimeStamp_LocalTimestamp")
    public String getCallEventStartTimeStampLocalTimestamp() {
        return callEventStartTimeStampLocalTimestamp;
    }

    @JsonProperty("CallEventStartTimeStamp_LocalTimestamp")
    public void setCallEventStartTimeStampLocalTimestamp(String callEventStartTimeStampLocalTimestamp) {
        this.callEventStartTimeStampLocalTimestamp = callEventStartTimeStampLocalTimestamp;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
