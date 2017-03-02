package com.emnify.tapfilereport.pojo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Cdr {
  public final String _index;
  public final String _type;
  public final String _id;
  public final Score _score;
  public final Source _source;

  @JsonCreator
  public Cdr(@JsonProperty("_index") String _index, @JsonProperty("_type") String _type,
      @JsonProperty("_id") String _id, @JsonProperty("_score") Score _score,
      @JsonProperty("_source") Source _source) {
    this._index = _index;
    this._type = _type;
    this._id = _id;
    this._score = _score;
    this._source = _source;
  }

  public static final class Score {

    @JsonCreator
    public Score() {}
  }

  public static final class Source {
    public final int[] recording_Entity;
    public final long charging_Id;
    public final AccessPointName_OI accessPointName_OI;
    public final String accessPointName_NI;
    public final String pdp_Address;
    public final String imei;
    public final String serving_Network;
    public final long totalCallEventDuration;
    public final String traffic_Type;
    public final double volume_Tx;
    public final double volume_Rx;
    public final double volume_Total;
    public final String imsi;
    public final MSISDN mSISDN;
    public final String tapFileName;
    public final String file_Sequence_Number;
    public final String sender;
    public final String recipient;
    public final String localCurrency;
    public final CurrencyConversionInfo currencyConversionInfo;
    public final UTCTimeOffsetInfo uTCTimeOffsetInfo;
    public final SGSN_GGSN_Info sGSN_GGSN_Info[];
    public final AuditControlInfo auditControlInfo;
    public final AccountingInfo accountingInfo;
    public final String callEventStartTimeStamp_UTCTimestamp;
    public final ChargeInformationList chargeInformationList[];
    public final long cellID;
    public final long location_Area;
    public final long callEventStartTimeStamp_UTCOffset;
    public final String callEventStartTimeStamp_LocalTimestamp;

    @JsonCreator
    public Source(@JsonProperty("recording_Entity") int[] recording_Entity,
        @JsonProperty("charging_Id") long charging_Id,
        @JsonProperty("accessPointName_OI") AccessPointName_OI accessPointName_OI,
        @JsonProperty("accessPointName_NI") String accessPointName_NI,
        @JsonProperty("pdp_Address") String pdp_Address, @JsonProperty("imei") String imei,
        @JsonProperty("serving_Network") String serving_Network,
        @JsonProperty("totalCallEventDuration") long totalCallEventDuration,
        @JsonProperty("traffic_Type") String traffic_Type,
        @JsonProperty("volume_Tx") double volume_Tx, @JsonProperty("volume_Rx") double volume_Rx,
        @JsonProperty("volume_Total") double volume_Total, @JsonProperty("imsi") String imsi,
        @JsonProperty("mSISDN") MSISDN mSISDN, @JsonProperty("tapFileName") String tapFileName,
        @JsonProperty("file_Sequence_Number") String file_Sequence_Number,
        @JsonProperty("sender") String sender, @JsonProperty("recipient") String recipient,
        @JsonProperty("localCurrency") String localCurrency,
        @JsonProperty("currencyConversionInfo") CurrencyConversionInfo currencyConversionInfo,
        @JsonProperty("uTCTimeOffsetInfo") UTCTimeOffsetInfo uTCTimeOffsetInfo,
        @JsonProperty("sGSN_GGSN_Info") SGSN_GGSN_Info[] sGSN_GGSN_Info,
        @JsonProperty("auditControlInfo") AuditControlInfo auditControlInfo,
        @JsonProperty("accountingInfo") AccountingInfo accountingInfo,
        @JsonProperty("callEventStartTimeStamp_UTCTimestamp") String callEventStartTimeStamp_UTCTimestamp,
        @JsonProperty("chargeInformationList") ChargeInformationList[] chargeInformationList,
        @JsonProperty("cellID") long cellID, @JsonProperty("location_Area") long location_Area,
        @JsonProperty("callEventStartTimeStamp_UTCOffset") long callEventStartTimeStamp_UTCOffset,
        @JsonProperty("callEventStartTimeStamp_LocalTimestamp") String callEventStartTimeStamp_LocalTimestamp) {
      this.recording_Entity = recording_Entity;
      this.charging_Id = charging_Id;
      this.accessPointName_OI = accessPointName_OI;
      this.accessPointName_NI = accessPointName_NI;
      this.pdp_Address = pdp_Address;
      this.imei = imei;
      this.serving_Network = serving_Network;
      this.totalCallEventDuration = totalCallEventDuration;
      this.traffic_Type = traffic_Type;
      this.volume_Tx = volume_Tx;
      this.volume_Rx = volume_Rx;
      this.volume_Total = volume_Total;
      this.imsi = imsi;
      this.mSISDN = mSISDN;
      this.tapFileName = tapFileName;
      this.file_Sequence_Number = file_Sequence_Number;
      this.sender = sender;
      this.recipient = recipient;
      this.localCurrency = localCurrency;
      this.currencyConversionInfo = currencyConversionInfo;
      this.uTCTimeOffsetInfo = uTCTimeOffsetInfo;
      this.sGSN_GGSN_Info = sGSN_GGSN_Info;
      this.auditControlInfo = auditControlInfo;
      this.accountingInfo = accountingInfo;
      this.callEventStartTimeStamp_UTCTimestamp = callEventStartTimeStamp_UTCTimestamp;
      this.chargeInformationList = chargeInformationList;
      this.cellID = cellID;
      this.location_Area = location_Area;
      this.callEventStartTimeStamp_UTCOffset = callEventStartTimeStamp_UTCOffset;
      this.callEventStartTimeStamp_LocalTimestamp = callEventStartTimeStamp_LocalTimestamp;
    }

    public static final class AccessPointName_OI {

      @JsonCreator
      public AccessPointName_OI() {}
    }

    public static final class MSISDN {

      @JsonCreator
      public MSISDN() {}
    }

    public static final class CurrencyConversionInfo {
      public final long numberOfDecimalPlaces;
      public final long exchangeRate;
      public final long exchangeRateCode;

      @JsonCreator
      public CurrencyConversionInfo(
          @JsonProperty("numberOfDecimalPlaces") long numberOfDecimalPlaces,
          @JsonProperty("exchangeRate") long exchangeRate,
          @JsonProperty("exchangeRateCode") long exchangeRateCode) {
        this.numberOfDecimalPlaces = numberOfDecimalPlaces;
        this.exchangeRate = exchangeRate;
        this.exchangeRateCode = exchangeRateCode;
      }
    }

    public static final class UTCTimeOffsetInfo {
      public final String utcTimeOffset;
      public final long utcTimeOffsetCode;

      @JsonCreator
      public UTCTimeOffsetInfo(@JsonProperty("utcTimeOffset") String utcTimeOffset,
          @JsonProperty("utcTimeOffsetCode") long utcTimeOffsetCode) {
        this.utcTimeOffset = utcTimeOffset;
        this.utcTimeOffsetCode = utcTimeOffsetCode;
      }
    }

    public static final class SGSN_GGSN_Info {
      public final long recEntityType;
      public final long recEntityCode;
      public final String recEntityId;

      @JsonCreator
      public SGSN_GGSN_Info(@JsonProperty("recEntityType") long recEntityType,
          @JsonProperty("recEntityCode") long recEntityCode,
          @JsonProperty("recEntityId") String recEntityId) {
        this.recEntityType = recEntityType;
        this.recEntityCode = recEntityCode;
        this.recEntityId = recEntityId;
      }
    }

    public static final class AuditControlInfo {
      public final long totalCharge;
      public final EarliestCallTimeStamp earliestCallTimeStamp;
      public final LatestCallTimeStamp latestCallTimeStamp;
      public final long totalDiscountValue;
      public final long totalTaxValue;
      public final long callEventDetailsCount;

      @JsonCreator
      public AuditControlInfo(@JsonProperty("totalCharge") long totalCharge,
          @JsonProperty("earliestCallTimeStamp") EarliestCallTimeStamp earliestCallTimeStamp,
          @JsonProperty("latestCallTimeStamp") LatestCallTimeStamp latestCallTimeStamp,
          @JsonProperty("totalDiscountValue") long totalDiscountValue,
          @JsonProperty("totalTaxValue") long totalTaxValue,
          @JsonProperty("callEventDetailsCount") long callEventDetailsCount) {
        this.totalCharge = totalCharge;
        this.earliestCallTimeStamp = earliestCallTimeStamp;
        this.latestCallTimeStamp = latestCallTimeStamp;
        this.totalDiscountValue = totalDiscountValue;
        this.totalTaxValue = totalTaxValue;
        this.callEventDetailsCount = callEventDetailsCount;
      }

      public static final class EarliestCallTimeStamp {
        public final String localTimeStamp;
        public final String utcTimeOffset;

        @JsonCreator
        public EarliestCallTimeStamp(@JsonProperty("localTimeStamp") String localTimeStamp,
            @JsonProperty("utcTimeOffset") String utcTimeOffset) {
          this.localTimeStamp = localTimeStamp;
          this.utcTimeOffset = utcTimeOffset;
        }
      }

      public static final class LatestCallTimeStamp {
        public final String utcTimeOffset;
        public final String localTimeStamp;

        @JsonCreator
        public LatestCallTimeStamp(@JsonProperty("utcTimeOffset") String utcTimeOffset,
            @JsonProperty("localTimeStamp") String localTimeStamp) {
          this.utcTimeOffset = utcTimeOffset;
          this.localTimeStamp = localTimeStamp;
        }
      }
    }

    public static final class AccountingInfo {
      public final long tapDecimalPlaces;
      public final String localCurrency;
      public final CurrencyConversionInfo currencyConversionInfo[];

      @JsonCreator
      public AccountingInfo(@JsonProperty("tapDecimalPlaces") long tapDecimalPlaces,
          @JsonProperty("localCurrency") String localCurrency,
          @JsonProperty("currencyConversionInfo") CurrencyConversionInfo[] currencyConversionInfo) {
        this.tapDecimalPlaces = tapDecimalPlaces;
        this.localCurrency = localCurrency;
        this.currencyConversionInfo = currencyConversionInfo;
      }

      public static final class CurrencyConversionInfo {
        public final long numberOfDecimalPlaces;
        public final long exchangeRate;
        public final long exchangeRateCode;

        @JsonCreator
        public CurrencyConversionInfo(
            @JsonProperty("numberOfDecimalPlaces") long numberOfDecimalPlaces,
            @JsonProperty("exchangeRate") long exchangeRate,
            @JsonProperty("exchangeRateCode") long exchangeRateCode) {
          this.numberOfDecimalPlaces = numberOfDecimalPlaces;
          this.exchangeRate = exchangeRate;
          this.exchangeRateCode = exchangeRateCode;
        }
      }
    }

    public static final class ChargeInformationList {
      public final CallTypeGroup callTypeGroup;
      public final String chargedItem;
      public final ChargeDetailList chargeDetailList[];
      public final long exchangeRateCode;

      @JsonCreator
      public ChargeInformationList(@JsonProperty("callTypeGroup") CallTypeGroup callTypeGroup,
          @JsonProperty("chargedItem") String chargedItem,
          @JsonProperty("chargeDetailList") ChargeDetailList[] chargeDetailList,
          @JsonProperty("exchangeRateCode") long exchangeRateCode) {
        this.callTypeGroup = callTypeGroup;
        this.chargedItem = chargedItem;
        this.chargeDetailList = chargeDetailList;
        this.exchangeRateCode = exchangeRateCode;
      }

      public static final class CallTypeGroup {
        public final long callTypeLevel2;
        public final long callTypeLevel1;
        public final long callTypeLevel3;

        @JsonCreator
        public CallTypeGroup(@JsonProperty("callTypeLevel2") long callTypeLevel2,
            @JsonProperty("callTypeLevel1") long callTypeLevel1,
            @JsonProperty("callTypeLevel3") long callTypeLevel3) {
          this.callTypeLevel2 = callTypeLevel2;
          this.callTypeLevel1 = callTypeLevel1;
          this.callTypeLevel3 = callTypeLevel3;
        }
      }

      public static final class ChargeDetailList {
        public final String chargeType;
        public final long chargeableUnits;
        public final long charge;
        public final long chargedUnits;

        @JsonCreator
        public ChargeDetailList(@JsonProperty("chargeType") String chargeType,
            @JsonProperty("chargeableUnits") long chargeableUnits,
            @JsonProperty("charge") long charge, @JsonProperty("chargedUnits") long chargedUnits) {
          this.chargeType = chargeType;
          this.chargeableUnits = chargeableUnits;
          this.charge = charge;
          this.chargedUnits = chargedUnits;
        }
      }
    }
  }
}
