package com.emnify.tapfilereport.pojo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public final class SearchResult_old {
  public final String scroll_id;
  public final long took;
  public final boolean timed_out;
  public final Shards shards;
  public final Hits hits;

  @JsonCreator
  public SearchResult_old(@JsonProperty("_scroll_id") String scroll_id, @JsonProperty("took") long took,
      @JsonProperty("timed_out") boolean timed_out, @JsonProperty("_shards") Shards shards,
      @JsonProperty("hits") Hits hits) {
    this.scroll_id = scroll_id;
    this.took = took;
    this.timed_out = timed_out;
    this.shards = shards;
    this.hits = hits;
  }

  public static final class Shards {
    public final long total;
    public final long successful;
    public final long failed;

    @JsonCreator
    public Shards(@JsonProperty("total") long total, @JsonProperty("successful") long successful,
        @JsonProperty("failed") long failed) {
      this.total = total;
      this.successful = successful;
      this.failed = failed;
    }
  }

  public static final class Hits {
    public final long total;
    public final double max_score;
    public final Hit[] hits;

    @JsonCreator
    public Hits(@JsonProperty("total") long total, @JsonProperty("max_score") double max_score,
        @JsonProperty("hits") Hit[] hits) {
      this.total = total;
      this.max_score = max_score;
      this.hits = hits;
    }

    public static final class Hit {
      public final String index;
      public final String type;
      public final String id;
      public final double score;
      public final Source source;

      @JsonCreator
      public Hit(@JsonProperty("_index") String index, @JsonProperty("_type") String type,
          @JsonProperty("_id") String id, @JsonProperty("_score") double score,
          @JsonProperty("_source") Source source) {
        this.index = index;
        this.type = type;
        this.id = id;
        this.score = score;
        this.source = source;
      }

      public static final class Source {
        public final int[] recording_Entity;
        public final long charging_Id;
        public final String accessPointName_OI;
        public final String accessPointName_NI;
        public final String pdp_Address;
        public final String imei;
        public final Serving_Network serving_Network;
        public final long totalCallEventDuration;
        public final String traffic_Type;
        public final double volume_Tx;
        public final double volume_Rx;
        public final double volume_Total;
        public final String imsi;
        public final String msisdn;
        public final String tapFileName;
        public final String file_Sequence_Number;
        public final String sender;
        public final String recipient;
        public final String localCurrency;
        public final CurrencyConversionInfo currencyConversionInfo;
        public final UTCTimeOffsetInfo utcTimeOffsetInfo;
        public final SGSN_GGSN_Info sgsn_ggsn_Info[];
        public final AuditControlInfo auditControlInfo;
        public final AccountingInfo accountingInfo;
        public final String callEventStartTimeStamp_UTCTimestamp;
        public final ChargeInformationList chargeInformationList[];
        public final CellID cellID;
        public final Location_Area location_Area;
        public final long callEventStartTimeStamp_UTCOffset;
        public final String callEventStartTimeStamp_LocalTimestamp;

        @JsonCreator
        public Source(@JsonProperty("Recording_Entity") int[] recording_Entity,
            @JsonProperty("Charging_Id") long charging_Id,
            @JsonProperty("AccessPointName_OI") String accessPointName_OI,
            @JsonProperty("AccessPointName_NI") String accessPointName_NI,
            @JsonProperty("PDP_Address") String pdp_Address, @JsonProperty("IMEI") String imei,
            @JsonProperty("Serving_Network") Serving_Network serving_Network,
            @JsonProperty("TotalCallEventDuration") long totalCallEventDuration,
            @JsonProperty("Traffic_Type") String traffic_Type,
            @JsonProperty("Volume_Tx") double volume_Tx,
            @JsonProperty("Volume_Rx") double volume_Rx,
            @JsonProperty("Volume_Total") double volume_Total, @JsonProperty("IMSI") String imsi,
            @JsonProperty("MSISDN") String msisdn, @JsonProperty("TapFileName") String tapFileName,
            @JsonProperty("File_Sequence_Number") String file_Sequence_Number,
            @JsonProperty("Sender") String sender, @JsonProperty("Recipient") String recipient,
            @JsonProperty("LocalCurrency") String localCurrency,
            @JsonProperty("CurrencyConversionInfo") CurrencyConversionInfo currencyConversionInfo,
            @JsonProperty("UTCTimeOffsetInfo") UTCTimeOffsetInfo utcTimeOffsetInfo,
            @JsonProperty("SGSN_GGSN_Info") SGSN_GGSN_Info[] sgsn_ggsn_Info,
            @JsonProperty("AuditControlInfo") AuditControlInfo auditControlInfo,
            @JsonProperty("AccountingInfo") AccountingInfo accountingInfo,
            @JsonProperty("CallEventStartTimeStamp_UTCTimestamp") String callEventStartTimeStamp_UTCTimestamp,
            @JsonProperty("ChargeInformationList") ChargeInformationList[] chargeInformationList,
            @JsonProperty("CellID") CellID cellID,
            @JsonProperty("Location_Area") Location_Area location_Area,
            @JsonProperty("CallEventStartTimeStamp_UTCOffset") long callEventStartTimeStamp_UTCOffset,
            @JsonProperty("CallEventStartTimeStamp_LocalTimestamp") String callEventStartTimeStamp_LocalTimestamp) {
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
          this.msisdn = msisdn;
          this.tapFileName = tapFileName;
          this.file_Sequence_Number = file_Sequence_Number;
          this.sender = sender;
          this.recipient = recipient;
          this.localCurrency = localCurrency;
          this.currencyConversionInfo = currencyConversionInfo;
          this.utcTimeOffsetInfo = utcTimeOffsetInfo;
          this.sgsn_ggsn_Info = sgsn_ggsn_Info;
          this.auditControlInfo = auditControlInfo;
          this.accountingInfo = accountingInfo;
          this.callEventStartTimeStamp_UTCTimestamp = callEventStartTimeStamp_UTCTimestamp;
          this.chargeInformationList = chargeInformationList;
          this.cellID = cellID;
          this.location_Area = location_Area;
          this.callEventStartTimeStamp_UTCOffset = callEventStartTimeStamp_UTCOffset;
          this.callEventStartTimeStamp_LocalTimestamp = callEventStartTimeStamp_LocalTimestamp;
        }

        public static final class Serving_Network {

          @JsonCreator
          public Serving_Network() {}
        }

        public static final class CurrencyConversionInfo {
          public final long exchangeRate;
          public final long exchangeRateCode;
          public final long numberOfDecimalPlaces;

          @JsonCreator
          public CurrencyConversionInfo(@JsonProperty("exchangeRate") long exchangeRate,
              @JsonProperty("exchangeRateCode") long exchangeRateCode,
              @JsonProperty("numberOfDecimalPlaces") long numberOfDecimalPlaces) {
            this.exchangeRate = exchangeRate;
            this.exchangeRateCode = exchangeRateCode;
            this.numberOfDecimalPlaces = numberOfDecimalPlaces;
          }
        }

        public static final class UTCTimeOffsetInfo {
          public final long utcTimeOffsetCode;
          public final String utcTimeOffset;

          @JsonCreator
          public UTCTimeOffsetInfo(@JsonProperty("utcTimeOffsetCode") long utcTimeOffsetCode,
              @JsonProperty("utcTimeOffset") String utcTimeOffset) {
            this.utcTimeOffsetCode = utcTimeOffsetCode;
            this.utcTimeOffset = utcTimeOffset;
          }
        }

        public static final class SGSN_GGSN_Info {
          public final long recEntityCode;
          public final String recEntityId;
          public final long recEntityType;

          @JsonCreator
          public SGSN_GGSN_Info(@JsonProperty("recEntityCode") long recEntityCode,
              @JsonProperty("recEntityId") String recEntityId,
              @JsonProperty("recEntityType") long recEntityType) {
            this.recEntityCode = recEntityCode;
            this.recEntityId = recEntityId;
            this.recEntityType = recEntityType;
          }
        }

        public static final class AuditControlInfo {
          public final long totalCharge;
          public final EarliestCallTimeStamp earliestCallTimeStamp;
          public final long callEventDetailsCount;
          public final long totalTaxValue;
          public final int[] operatorSpecInformation;
          public final long totalDiscountValue;
          public final LatestCallTimeStamp latestCallTimeStamp;

          @JsonCreator
          public AuditControlInfo(@JsonProperty("totalCharge") long totalCharge,
              @JsonProperty("earliestCallTimeStamp") EarliestCallTimeStamp earliestCallTimeStamp,
              @JsonProperty("callEventDetailsCount") long callEventDetailsCount,
              @JsonProperty("totalTaxValue") long totalTaxValue,
              @JsonProperty("operatorSpecInformation") int[] operatorSpecInformation,
              @JsonProperty("totalDiscountValue") long totalDiscountValue,
              @JsonProperty("latestCallTimeStamp") LatestCallTimeStamp latestCallTimeStamp) {
            this.totalCharge = totalCharge;
            this.earliestCallTimeStamp = earliestCallTimeStamp;
            this.callEventDetailsCount = callEventDetailsCount;
            this.totalTaxValue = totalTaxValue;
            this.operatorSpecInformation = operatorSpecInformation;
            this.totalDiscountValue = totalDiscountValue;
            this.latestCallTimeStamp = latestCallTimeStamp;
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
          public final CurrencyConversionInfo currencyConversionInfo[];
          public final String localCurrency;
          public final long tapDecimalPlaces;

          @JsonCreator
          public AccountingInfo(
              @JsonProperty("currencyConversionInfo") CurrencyConversionInfo[] currencyConversionInfo,
              @JsonProperty("localCurrency") String localCurrency,
              @JsonProperty("tapDecimalPlaces") long tapDecimalPlaces) {
            this.currencyConversionInfo = currencyConversionInfo;
            this.localCurrency = localCurrency;
            this.tapDecimalPlaces = tapDecimalPlaces;
          }

          public static final class CurrencyConversionInfo {
            public final long exchangeRate;
            public final long exchangeRateCode;
            public final long numberOfDecimalPlaces;

            @JsonCreator
            public CurrencyConversionInfo(@JsonProperty("exchangeRate") long exchangeRate,
                @JsonProperty("exchangeRateCode") long exchangeRateCode,
                @JsonProperty("numberOfDecimalPlaces") long numberOfDecimalPlaces) {
              this.exchangeRate = exchangeRate;
              this.exchangeRateCode = exchangeRateCode;
              this.numberOfDecimalPlaces = numberOfDecimalPlaces;
            }
          }
        }

        public static final class ChargeInformationList {
          public final String chargedItem;
          public final CallTypeGroup callTypeGroup;
          public final ChargeDetailList chargeDetailList[];

          @JsonCreator
          public ChargeInformationList(@JsonProperty("chargedItem") String chargedItem,
              @JsonProperty("callTypeGroup") CallTypeGroup callTypeGroup,
              @JsonProperty("chargeDetailList") ChargeDetailList[] chargeDetailList) {
            this.chargedItem = chargedItem;
            this.callTypeGroup = callTypeGroup;
            this.chargeDetailList = chargeDetailList;
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
            public final long chargeableUnits;
            public final String chargeType;
            public final long chargedUnits;
            public final long charge;

            @JsonCreator
            public ChargeDetailList(@JsonProperty("chargeableUnits") long chargeableUnits,
                @JsonProperty("chargeType") String chargeType,
                @JsonProperty("chargedUnits") long chargedUnits,
                @JsonProperty("charge") long charge) {
              this.chargeableUnits = chargeableUnits;
              this.chargeType = chargeType;
              this.chargedUnits = chargedUnits;
              this.charge = charge;
            }
          }
        }

        public static final class CellID {

          @JsonCreator
          public CellID() {}
        }

        public static final class Location_Area {

          @JsonCreator
          public Location_Area() {}
        }
      }
    }
  }



  public static void main(String[] args) {
    String json =
        "{\"_scroll_id\":\"cXVlcnlUaGVuR\",\"took\":493,\"timed_out\":false,\"_shards\":{\"total\":5,\"successful\":5,\"failed\":0},\"hits\":{\"total\":7752184,\"max_score\":1.010285,\"hits\":[{\"_index\":\"tapdata\",\"_type\":\"starhome\",\"_id\":\"AVA3RF0Aat7VifUaGZxf\",\"_score\":1.010285,\"_source\":{\"Recording_Entity\":[0,2],\"Charging_Id\":4057,\"AccessPointName_OI\":\"mnc043.mcc901.gprs\",\"AccessPointName_NI\":\"EM\",\"PDP_Address\":\"10.199.1.154\",\"IMEI\":\"3568130309734390\",\"Serving_Network\":null,\"TotalCallEventDuration\":168,\"Traffic_Type\":\"Data\",\"Volume_Tx\":0.21995,\"Volume_Rx\":4.644254,\"Volume_Total\":4.864204,\"IMSI\":\"901430000000341\",\"MSISDN\":null,\"TapFileName\":\"TDAUTPTEMNDE00015\",\"File_Sequence_Number\":\"00015\",\"Sender\":\"AUTPT\",\"Recipient\":\"EMNDE\",\"LocalCurrency\":\"EUR\",\"CurrencyConversionInfo\":{\"exchangeRateCode\":0,\"exchangeRate\":125037,\"numberOfDecimalPlaces\":5},\"UTCTimeOffsetInfo\":{\"utcTimeOffset\":\"+0200\",\"utcTimeOffsetCode\":1},\"SGSN_GGSN_Info\":[{\"recEntityType\":4,\"recEntityCode\":2,\"recEntityId\":\"194.48.132.12\"},{\"recEntityCode\":1,\"recEntityId\":\"194.48.132.14\",\"recEntityType\":4},{\"recEntityId\":\"185.57.216.35\",\"recEntityCode\":0,\"recEntityType\":3}],\"AuditControlInfo\":{\"latestCallTimeStamp\":{\"utcTimeOffset\":\"+0200\",\"localTimeStamp\":\"20150916125547\"},\"totalDiscountValue\":0,\"callEventDetailsCount\":3,\"totalTaxValue\":3887,\"earliestCallTimeStamp\":{\"localTimeStamp\":\"20150915094053\",\"utcTimeOffset\":\"+0200\"},\"totalCharge\":19443},\"AccountingInfo\":{\"taxation\":[{\"taxCode\":0,\"taxType\":\"01\",\"taxRate\":2e+06}],\"tapDecimalPlaces\":5,\"localCurrency\":\"EUR\",\"currencyConversionInfo\":[{\"exchangeRateCode\":0,\"exchangeRate\":125037,\"numberOfDecimalPlaces\":5}]},\"CallEventStartTimeStamp_UTCTimestamp\":\"20150916125547+0200\",\"ChargeInformationList\":[{\"callTypeGroup\":{\"callTypeLevel3\":1,\"callTypeLevel1\":11,\"callTypeLevel2\":0},\"exchangeRateCode\":0,\"chargedItem\":\"X\",\"taxInformation\":[{\"taxableAmount\":18555,\"taxCode\":0,\"taxValue\":3711}],\"chargeDetailList\":[{\"charge\":18555,\"chargeType\":\"00\",\"chargeableUnits\":4864204}]}],\"CellID\":62114,\"Location_Area\":17007,\"CallEventStartTimeStamp_UTCOffset\":1,\"CallEventStartTimeStamp_LocalTimestamp\":\"20150916125547\"}},{\"_index\":\"tapdata\",\"_type\":\"starhome\",\"_id\":\"AVBrPqrwat7VifUaO87U\",\"_score\":1.010285,\"_source\":{\"Recording_Entity\":[5,6],\"Charging_Id\":387,\"AccessPointName_OI\":null,\"AccessPointName_NI\":\"em\",\"PDP_Address\":\"10.199.1.213\",\"IMEI\":\"0131690002414519\",\"Serving_Network\":null,\"TotalCallEventDuration\":4,\"Traffic_Type\":\"Data\",\"Volume_Tx\":0.000503,\"Volume_Rx\":0.000465,\"Volume_Total\":0.000968,\"IMSI\":\"295050999900089\",\"MSISDN\":\"423663999900089\",\"TapFileName\":\"CDCANRWEMNLI09201\",\"File_Sequence_Number\":\"09201\",\"Sender\":\"CANRW\",\"Recipient\":\"EMNLIEMK\",\"LocalCurrency\":\"USD\",\"CurrencyConversionInfo\":{\"exchangeRate\":1402740,\"exchangeRateCode\":0,\"numberOfDecimalPlaces\":6},\"UTCTimeOffsetInfo\":{\"utcTimeOffsetCode\":0,\"utcTimeOffset\":\"-0500\"},\"SGSN_GGSN_Info\":[{\"recEntityCode\":0,\"recEntityId\":\"194.48.132.218\",\"recEntityType\":3},{\"recEntityId\":\"142.146.244.33\",\"recEntityCode\":1,\"recEntityType\":4},{\"recEntityType\":4,\"recEntityId\":\"74.198.68.5\",\"recEntityCode\":2},{\"recEntityType\":1,\"recEntityId\":\"MOU\",\"recEntityCode\":3},{\"recEntityType\":1,\"recEntityCode\":4,\"recEntityId\":\"VAU\"},{\"recEntityType\":3,\"recEntityId\":\"185.57.216.35\",\"recEntityCode\":5},{\"recEntityType\":4,\"recEntityId\":\"74.198.72.162\",\"recEntityCode\":6},{\"recEntityType\":1,\"recEntityCode\":7,\"recEntityId\":\"TOU\"}],\"AuditControlInfo\":{\"totalCharge\":0,\"earliestCallTimeStamp\":{\"localTimeStamp\":\"20151012201857\",\"utcTimeOffset\":\"-0700\"},\"callEventDetailsCount\":35,\"totalTaxValue\":0,\"operatorSpecInformation\":[0,0],\"totalDiscountValue\":0,\"latestCallTimeStamp\":{\"utcTimeOffset\":\"-0700\",\"localTimeStamp\":\"20151013154318\"}},\"AccountingInfo\":{\"currencyConversionInfo\":[{\"exchangeRate\":1402740,\"exchangeRateCode\":0,\"numberOfDecimalPlaces\":6}],\"localCurrency\":\"USD\",\"tapDecimalPlaces\":4},\"CallEventStartTimeStamp_UTCTimestamp\":\"20151012201857-0500\",\"ChargeInformationList\":[{\"chargedItem\":\"X\",\"callTypeGroup\":{\"callTypeLevel2\":0,\"callTypeLevel1\":10,\"callTypeLevel3\":0},\"chargeDetailList\":[{\"chargeableUnits\":968,\"chargeType\":\"00\",\"chargedUnits\":1024,\"charge\":0}]}],\"CellID\":null,\"Location_Area\":null,\"CallEventStartTimeStamp_UTCOffset\":2,\"CallEventStartTimeStamp_LocalTimestamp\":\"20151012201857\"}},{\"_index\":\"tapdata\",\"_type\":\"starhome\",\"_id\":\"AVBrPqrwat7VifUaO87Z\",\"_score\":1.010285,\"_source\":{\"Recording_Entity\":[5,6],\"Charging_Id\":397,\"AccessPointName_OI\":null,\"AccessPointName_NI\":\"em\",\"PDP_Address\":\"10.199.1.213\",\"IMEI\":\"0131690002414519\",\"Serving_Network\":null,\"TotalCallEventDuration\":4,\"Traffic_Type\":\"Data\",\"Volume_Tx\":0.000193,\"Volume_Rx\":8.2e-05,\"Volume_Total\":0.000275,\"IMSI\":\"295050999900089\",\"MSISDN\":\"423663999900089\",\"TapFileName\":\"CDCANRWEMNLI09201\",\"File_Sequence_Number\":\"09201\",\"Sender\":\"CANRW\",\"Recipient\":\"EMNLIEMK\",\"LocalCurrency\":\"USD\",\"CurrencyConversionInfo\":{\"exchangeRate\":1402740,\"exchangeRateCode\":0,\"numberOfDecimalPlaces\":6},\"UTCTimeOffsetInfo\":{\"utcTimeOffsetCode\":0,\"utcTimeOffset\":\"-0500\"},\"SGSN_GGSN_Info\":[{\"recEntityCode\":0,\"recEntityId\":\"194.48.132.218\",\"recEntityType\":3},{\"recEntityId\":\"142.146.244.33\",\"recEntityCode\":1,\"recEntityType\":4},{\"recEntityType\":4,\"recEntityId\":\"74.198.68.5\",\"recEntityCode\":2},{\"recEntityType\":1,\"recEntityId\":\"MOU\",\"recEntityCode\":3},{\"recEntityType\":1,\"recEntityCode\":4,\"recEntityId\":\"VAU\"},{\"recEntityType\":3,\"recEntityId\":\"185.57.216.35\",\"recEntityCode\":5},{\"recEntityType\":4,\"recEntityId\":\"74.198.72.162\",\"recEntityCode\":6},{\"recEntityType\":1,\"recEntityCode\":7,\"recEntityId\":\"TOU\"}],\"AuditControlInfo\":{\"totalCharge\":0,\"earliestCallTimeStamp\":{\"localTimeStamp\":\"20151012201857\",\"utcTimeOffset\":\"-0700\"},\"callEventDetailsCount\":35,\"totalTaxValue\":0,\"operatorSpecInformation\":[0,0],\"totalDiscountValue\":0,\"latestCallTimeStamp\":{\"utcTimeOffset\":\"-0700\",\"localTimeStamp\":\"20151013154318\"}},\"AccountingInfo\":{\"currencyConversionInfo\":[{\"exchangeRate\":1402740,\"exchangeRateCode\":0,\"numberOfDecimalPlaces\":6}],\"localCurrency\":\"USD\",\"tapDecimalPlaces\":4},\"CallEventStartTimeStamp_UTCTimestamp\":\"20151012210531-0500\",\"ChargeInformationList\":[{\"chargeDetailList\":[{\"chargeableUnits\":275,\"chargeType\":\"00\",\"chargedUnits\":1024,\"charge\":0}],\"chargedItem\":\"X\",\"callTypeGroup\":{\"callTypeLevel1\":10,\"callTypeLevel3\":0,\"callTypeLevel2\":0}}],\"CellID\":null,\"Location_Area\":null,\"CallEventStartTimeStamp_UTCOffset\":2,\"CallEventStartTimeStamp_LocalTimestamp\":\"20151012210531\"}},{\"_index\":\"tapdata\",\"_type\":\"starhome\",\"_id\":\"AVBrPqrwat7VifUaO87d\",\"_score\":1.010285,\"_source\":{\"Recording_Entity\":[5,6],\"Charging_Id\":405,\"AccessPointName_OI\":null,\"AccessPointName_NI\":\"em\",\"PDP_Address\":\"10.199.1.213\",\"IMEI\":\"0131690002414519\",\"Serving_Network\":null,\"TotalCallEventDuration\":10,\"Traffic_Type\":\"Data\",\"Volume_Tx\":0.001632,\"Volume_Rx\":0.041331,\"Volume_Total\":0.042963,\"IMSI\":\"295050999900089\",\"MSISDN\":\"423663999900089\",\"TapFileName\":\"CDCANRWEMNLI09201\",\"File_Sequence_Number\":\"09201\",\"Sender\":\"CANRW\",\"Recipient\":\"EMNLIEMK\",\"LocalCurrency\":\"USD\",\"CurrencyConversionInfo\":{\"exchangeRate\":1402740,\"exchangeRateCode\":0,\"numberOfDecimalPlaces\":6},\"UTCTimeOffsetInfo\":{\"utcTimeOffsetCode\":0,\"utcTimeOffset\":\"-0500\"},\"SGSN_GGSN_Info\":[{\"recEntityCode\":0,\"recEntityId\":\"194.48.132.218\",\"recEntityType\":3},{\"recEntityId\":\"142.146.244.33\",\"recEntityCode\":1,\"recEntityType\":4},{\"recEntityType\":4,\"recEntityId\":\"74.198.68.5\",\"recEntityCode\":2},{\"recEntityType\":1,\"recEntityId\":\"MOU\",\"recEntityCode\":3},{\"recEntityType\":1,\"recEntityCode\":4,\"recEntityId\":\"VAU\"},{\"recEntityType\":3,\"recEntityId\":\"185.57.216.35\",\"recEntityCode\":5},{\"recEntityType\":4,\"recEntityId\":\"74.198.72.162\",\"recEntityCode\":6},{\"recEntityType\":1,\"recEntityCode\":7,\"recEntityId\":\"TOU\"}],\"AuditControlInfo\":{\"totalCharge\":0,\"earliestCallTimeStamp\":{\"localTimeStamp\":\"20151012201857\",\"utcTimeOffset\":\"-0700\"},\"callEventDetailsCount\":35,\"totalTaxValue\":0,\"operatorSpecInformation\":[0,0],\"totalDiscountValue\":0,\"latestCallTimeStamp\":{\"utcTimeOffset\":\"-0700\",\"localTimeStamp\":\"20151013154318\"}},\"AccountingInfo\":{\"currencyConversionInfo\":[{\"exchangeRate\":1402740,\"exchangeRateCode\":0,\"numberOfDecimalPlaces\":6}],\"localCurrency\":\"USD\",\"tapDecimalPlaces\":4},\"CallEventStartTimeStamp_UTCTimestamp\":\"20151012212624-0500\",\"ChargeInformationList\":[{\"chargeDetailList\":[{\"chargeableUnits\":42963,\"chargedUnits\":43008,\"chargeType\":\"00\",\"charge\":0}],\"callTypeGroup\":{\"callTypeLevel1\":10,\"callTypeLevel3\":0,\"callTypeLevel2\":0},\"chargedItem\":\"X\",\"exchangeRateCode\":0}],\"CellID\":null,\"Location_Area\":null,\"CallEventStartTimeStamp_UTCOffset\":2,\"CallEventStartTimeStamp_LocalTimestamp\":\"20151012212624\"}},{\"_index\":\"tapdata\",\"_type\":\"starhome\",\"_id\":\"AVBrPqrwat7VifUaO87i\",\"_score\":1.010285,\"_source\":{\"Recording_Entity\":[5,6],\"Charging_Id\":501,\"AccessPointName_OI\":null,\"AccessPointName_NI\":\"em\",\"PDP_Address\":\"10.199.1.213\",\"IMEI\":\"0131690002414519\",\"Serving_Network\":null,\"TotalCallEventDuration\":4,\"Traffic_Type\":\"Data\",\"Volume_Tx\":0.000503,\"Volume_Rx\":0.000465,\"Volume_Total\":0.000968,\"IMSI\":\"295050999900089\",\"MSISDN\":\"423663999900089\",\"TapFileName\":\"CDCANRWEMNLI09201\",\"File_Sequence_Number\":\"09201\",\"Sender\":\"CANRW\",\"Recipient\":\"EMNLIEMK\",\"LocalCurrency\":\"USD\",\"CurrencyConversionInfo\":{\"exchangeRate\":1402740,\"exchangeRateCode\":0,\"numberOfDecimalPlaces\":6},\"UTCTimeOffsetInfo\":{\"utcTimeOffsetCode\":0,\"utcTimeOffset\":\"-0500\"},\"SGSN_GGSN_Info\":[{\"recEntityCode\":0,\"recEntityId\":\"194.48.132.218\",\"recEntityType\":3},{\"recEntityId\":\"142.146.244.33\",\"recEntityCode\":1,\"recEntityType\":4},{\"recEntityType\":4,\"recEntityId\":\"74.198.68.5\",\"recEntityCode\":2},{\"recEntityType\":1,\"recEntityId\":\"MOU\",\"recEntityCode\":3},{\"recEntityType\":1,\"recEntityCode\":4,\"recEntityId\":\"VAU\"},{\"recEntityType\":3,\"recEntityId\":\"185.57.216.35\",\"recEntityCode\":5},{\"recEntityType\":4,\"recEntityId\":\"74.198.72.162\",\"recEntityCode\":6},{\"recEntityType\":1,\"recEntityCode\":7,\"recEntityId\":\"TOU\"}],\"AuditControlInfo\":{\"totalCharge\":0,\"earliestCallTimeStamp\":{\"localTimeStamp\":\"20151012201857\",\"utcTimeOffset\":\"-0700\"},\"callEventDetailsCount\":35,\"totalTaxValue\":0,\"operatorSpecInformation\":[0,0],\"totalDiscountValue\":0,\"latestCallTimeStamp\":{\"utcTimeOffset\":\"-0700\",\"localTimeStamp\":\"20151013154318\"}},\"AccountingInfo\":{\"currencyConversionInfo\":[{\"exchangeRate\":1402740,\"exchangeRateCode\":0,\"numberOfDecimalPlaces\":6}],\"localCurrency\":\"USD\",\"tapDecimalPlaces\":4},\"CallEventStartTimeStamp_UTCTimestamp\":\"20151013081001-0500\",\"ChargeInformationList\":[{\"chargeDetailList\":[{\"chargeableUnits\":968,\"chargeType\":\"00\",\"chargedUnits\":1024,\"charge\":0}],\"callTypeGroup\":{\"callTypeLevel2\":0,\"callTypeLevel3\":0,\"callTypeLevel1\":10},\"chargedItem\":\"X\"}],\"CellID\":null,\"Location_Area\":null,\"CallEventStartTimeStamp_UTCOffset\":2,\"CallEventStartTimeStamp_LocalTimestamp\":\"20151013081001\"}},{\"_index\":\"tapdata\",\"_type\":\"starhome\",\"_id\":\"AVBrPqrwat7VifUaO87n\",\"_score\":1.010285,\"_source\":{\"Recording_Entity\":[5,6],\"Charging_Id\":507,\"AccessPointName_OI\":null,\"AccessPointName_NI\":\"em\",\"PDP_Address\":\"10.199.1.213\",\"IMEI\":\"0131690002414519\",\"Serving_Network\":null,\"TotalCallEventDuration\":5,\"Traffic_Type\":\"Data\",\"Volume_Tx\":0.001632,\"Volume_Rx\":0.041331,\"Volume_Total\":0.042963,\"IMSI\":\"295050999900089\",\"MSISDN\":\"423663999900089\",\"TapFileName\":\"CDCANRWEMNLI09201\",\"File_Sequence_Number\":\"09201\",\"Sender\":\"CANRW\",\"Recipient\":\"EMNLIEMK\",\"LocalCurrency\":\"USD\",\"CurrencyConversionInfo\":{\"exchangeRate\":1402740,\"exchangeRateCode\":0,\"numberOfDecimalPlaces\":6},\"UTCTimeOffsetInfo\":{\"utcTimeOffsetCode\":0,\"utcTimeOffset\":\"-0500\"},\"SGSN_GGSN_Info\":[{\"recEntityCode\":0,\"recEntityId\":\"194.48.132.218\",\"recEntityType\":3},{\"recEntityId\":\"142.146.244.33\",\"recEntityCode\":1,\"recEntityType\":4},{\"recEntityType\":4,\"recEntityId\":\"74.198.68.5\",\"recEntityCode\":2},{\"recEntityType\":1,\"recEntityId\":\"MOU\",\"recEntityCode\":3},{\"recEntityType\":1,\"recEntityCode\":4,\"recEntityId\":\"VAU\"},{\"recEntityType\":3,\"recEntityId\":\"185.57.216.35\",\"recEntityCode\":5},{\"recEntityType\":4,\"recEntityId\":\"74.198.72.162\",\"recEntityCode\":6},{\"recEntityType\":1,\"recEntityCode\":7,\"recEntityId\":\"TOU\"}],\"AuditControlInfo\":{\"totalCharge\":0,\"earliestCallTimeStamp\":{\"localTimeStamp\":\"20151012201857\",\"utcTimeOffset\":\"-0700\"},\"callEventDetailsCount\":35,\"totalTaxValue\":0,\"operatorSpecInformation\":[0,0],\"totalDiscountValue\":0,\"latestCallTimeStamp\":{\"utcTimeOffset\":\"-0700\",\"localTimeStamp\":\"20151013154318\"}},\"AccountingInfo\":{\"currencyConversionInfo\":[{\"exchangeRate\":1402740,\"exchangeRateCode\":0,\"numberOfDecimalPlaces\":6}],\"localCurrency\":\"USD\",\"tapDecimalPlaces\":4},\"CallEventStartTimeStamp_UTCTimestamp\":\"20151013082103-0500\",\"ChargeInformationList\":[{\"exchangeRateCode\":0,\"chargeDetailList\":[{\"charge\":0,\"chargeType\":\"00\",\"chargedUnits\":43008,\"chargeableUnits\":42963}],\"callTypeGroup\":{\"callTypeLevel1\":10,\"callTypeLevel3\":0,\"callTypeLevel2\":0},\"chargedItem\":\"X\"}],\"CellID\":null,\"Location_Area\":null,\"CallEventStartTimeStamp_UTCOffset\":2,\"CallEventStartTimeStamp_LocalTimestamp\":\"20151013082103\"}},{\"_index\":\"tapdata\",\"_type\":\"starhome\",\"_id\":\"AVBrPqrwat7VifUaO87s\",\"_score\":1.010285,\"_source\":{\"Recording_Entity\":[5,6],\"Charging_Id\":513,\"AccessPointName_OI\":null,\"AccessPointName_NI\":\"em\",\"PDP_Address\":\"10.199.1.213\",\"IMEI\":\"0131690002414519\",\"Serving_Network\":null,\"TotalCallEventDuration\":3,\"Traffic_Type\":\"Data\",\"Volume_Tx\":0.000185,\"Volume_Rx\":0,\"Volume_Total\":0.000185,\"IMSI\":\"295050999900089\",\"MSISDN\":\"423663999900089\",\"TapFileName\":\"CDCANRWEMNLI09201\",\"File_Sequence_Number\":\"09201\",\"Sender\":\"CANRW\",\"Recipient\":\"EMNLIEMK\",\"LocalCurrency\":\"USD\",\"CurrencyConversionInfo\":{\"exchangeRate\":1402740,\"exchangeRateCode\":0,\"numberOfDecimalPlaces\":6},\"UTCTimeOffsetInfo\":{\"utcTimeOffsetCode\":0,\"utcTimeOffset\":\"-0500\"},\"SGSN_GGSN_Info\":[{\"recEntityCode\":0,\"recEntityId\":\"194.48.132.218\",\"recEntityType\":3},{\"recEntityId\":\"142.146.244.33\",\"recEntityCode\":1,\"recEntityType\":4},{\"recEntityType\":4,\"recEntityId\":\"74.198.68.5\",\"recEntityCode\":2},{\"recEntityType\":1,\"recEntityId\":\"MOU\",\"recEntityCode\":3},{\"recEntityType\":1,\"recEntityCode\":4,\"recEntityId\":\"VAU\"},{\"recEntityType\":3,\"recEntityId\":\"185.57.216.35\",\"recEntityCode\":5},{\"recEntityType\":4,\"recEntityId\":\"74.198.72.162\",\"recEntityCode\":6},{\"recEntityType\":1,\"recEntityCode\":7,\"recEntityId\":\"TOU\"}],\"AuditControlInfo\":{\"totalCharge\":0,\"earliestCallTimeStamp\":{\"localTimeStamp\":\"20151012201857\",\"utcTimeOffset\":\"-0700\"},\"callEventDetailsCount\":35,\"totalTaxValue\":0,\"operatorSpecInformation\":[0,0],\"totalDiscountValue\":0,\"latestCallTimeStamp\":{\"utcTimeOffset\":\"-0700\",\"localTimeStamp\":\"20151013154318\"}},\"AccountingInfo\":{\"currencyConversionInfo\":[{\"exchangeRate\":1402740,\"exchangeRateCode\":0,\"numberOfDecimalPlaces\":6}],\"localCurrency\":\"USD\",\"tapDecimalPlaces\":4},\"CallEventStartTimeStamp_UTCTimestamp\":\"20151013082820-0500\",\"ChargeInformationList\":[{\"callTypeGroup\":{\"callTypeLevel2\":0,\"callTypeLevel3\":0,\"callTypeLevel1\":10},\"chargedItem\":\"X\",\"chargeDetailList\":[{\"charge\":0,\"chargeType\":\"00\",\"chargedUnits\":1024,\"chargeableUnits\":185}]}],\"CellID\":null,\"Location_Area\":null,\"CallEventStartTimeStamp_UTCOffset\":2,\"CallEventStartTimeStamp_LocalTimestamp\":\"20151013082820\"}},{\"_index\":\"tapdata\",\"_type\":\"starhome\",\"_id\":\"AVBrPqrwat7VifUaO87x\",\"_score\":1.010285,\"_source\":{\"Recording_Entity\":[5,6],\"Charging_Id\":519,\"AccessPointName_OI\":null,\"AccessPointName_NI\":\"em\",\"PDP_Address\":\"10.199.1.213\",\"IMEI\":\"0131690002414519\",\"Serving_Network\":null,\"TotalCallEventDuration\":2,\"Traffic_Type\":\"Data\",\"Volume_Tx\":0.000187,\"Volume_Rx\":0,\"Volume_Total\":0.000187,\"IMSI\":\"295050999900089\",\"MSISDN\":\"423663999900089\",\"TapFileName\":\"CDCANRWEMNLI09201\",\"File_Sequence_Number\":\"09201\",\"Sender\":\"CANRW\",\"Recipient\":\"EMNLIEMK\",\"LocalCurrency\":\"USD\",\"CurrencyConversionInfo\":{\"exchangeRate\":1402740,\"exchangeRateCode\":0,\"numberOfDecimalPlaces\":6},\"UTCTimeOffsetInfo\":{\"utcTimeOffsetCode\":0,\"utcTimeOffset\":\"-0500\"},\"SGSN_GGSN_Info\":[{\"recEntityCode\":0,\"recEntityId\":\"194.48.132.218\",\"recEntityType\":3},{\"recEntityId\":\"142.146.244.33\",\"recEntityCode\":1,\"recEntityType\":4},{\"recEntityType\":4,\"recEntityId\":\"74.198.68.5\",\"recEntityCode\":2},{\"recEntityType\":1,\"recEntityId\":\"MOU\",\"recEntityCode\":3},{\"recEntityType\":1,\"recEntityCode\":4,\"recEntityId\":\"VAU\"},{\"recEntityType\":3,\"recEntityId\":\"185.57.216.35\",\"recEntityCode\":5},{\"recEntityType\":4,\"recEntityId\":\"74.198.72.162\",\"recEntityCode\":6},{\"recEntityType\":1,\"recEntityCode\":7,\"recEntityId\":\"TOU\"}],\"AuditControlInfo\":{\"totalCharge\":0,\"earliestCallTimeStamp\":{\"localTimeStamp\":\"20151012201857\",\"utcTimeOffset\":\"-0700\"},\"callEventDetailsCount\":35,\"totalTaxValue\":0,\"operatorSpecInformation\":[0,0],\"totalDiscountValue\":0,\"latestCallTimeStamp\":{\"utcTimeOffset\":\"-0700\",\"localTimeStamp\":\"20151013154318\"}},\"AccountingInfo\":{\"currencyConversionInfo\":[{\"exchangeRate\":1402740,\"exchangeRateCode\":0,\"numberOfDecimalPlaces\":6}],\"localCurrency\":\"USD\",\"tapDecimalPlaces\":4},\"CallEventStartTimeStamp_UTCTimestamp\":\"20151013083323-0500\",\"ChargeInformationList\":[{\"chargeDetailList\":[{\"chargeableUnits\":187,\"chargeType\":\"00\",\"chargedUnits\":1024,\"charge\":0}],\"chargedItem\":\"X\",\"callTypeGroup\":{\"callTypeLevel2\":0,\"callTypeLevel1\":10,\"callTypeLevel3\":0}}],\"CellID\":null,\"Location_Area\":null,\"CallEventStartTimeStamp_UTCOffset\":2,\"CallEventStartTimeStamp_LocalTimestamp\":\"20151013083323\"}},{\"_index\":\"tapdata\",\"_type\":\"starhome\",\"_id\":\"AVBrPqrwat7VifUaO872\",\"_score\":1.010285,\"_source\":{\"Recording_Entity\":[5,6],\"Charging_Id\":578,\"AccessPointName_OI\":null,\"AccessPointName_NI\":\"em\",\"PDP_Address\":\"10.199.1.213\",\"IMEI\":\"0131690002414519\",\"Serving_Network\":null,\"TotalCallEventDuration\":4,\"Traffic_Type\":\"Data\",\"Volume_Tx\":0.000193,\"Volume_Rx\":8.2e-05,\"Volume_Total\":0.000275,\"IMSI\":\"295050999900089\",\"MSISDN\":\"423663999900089\",\"TapFileName\":\"CDCANRWEMNLI09201\",\"File_Sequence_Number\":\"09201\",\"Sender\":\"CANRW\",\"Recipient\":\"EMNLIEMK\",\"LocalCurrency\":\"USD\",\"CurrencyConversionInfo\":{\"exchangeRate\":1402740,\"exchangeRateCode\":0,\"numberOfDecimalPlaces\":6},\"UTCTimeOffsetInfo\":{\"utcTimeOffsetCode\":0,\"utcTimeOffset\":\"-0500\"},\"SGSN_GGSN_Info\":[{\"recEntityCode\":0,\"recEntityId\":\"194.48.132.218\",\"recEntityType\":3},{\"recEntityId\":\"142.146.244.33\",\"recEntityCode\":1,\"recEntityType\":4},{\"recEntityType\":4,\"recEntityId\":\"74.198.68.5\",\"recEntityCode\":2},{\"recEntityType\":1,\"recEntityId\":\"MOU\",\"recEntityCode\":3},{\"recEntityType\":1,\"recEntityCode\":4,\"recEntityId\":\"VAU\"},{\"recEntityType\":3,\"recEntityId\":\"185.57.216.35\",\"recEntityCode\":5},{\"recEntityType\":4,\"recEntityId\":\"74.198.72.162\",\"recEntityCode\":6},{\"recEntityType\":1,\"recEntityCode\":7,\"recEntityId\":\"TOU\"}],\"AuditControlInfo\":{\"totalCharge\":0,\"earliestCallTimeStamp\":{\"localTimeStamp\":\"20151012201857\",\"utcTimeOffset\":\"-0700\"},\"callEventDetailsCount\":35,\"totalTaxValue\":0,\"operatorSpecInformation\":[0,0],\"totalDiscountValue\":0,\"latestCallTimeStamp\":{\"utcTimeOffset\":\"-0700\",\"localTimeStamp\":\"20151013154318\"}},\"AccountingInfo\":{\"currencyConversionInfo\":[{\"exchangeRate\":1402740,\"exchangeRateCode\":0,\"numberOfDecimalPlaces\":6}],\"localCurrency\":\"USD\",\"tapDecimalPlaces\":4},\"CallEventStartTimeStamp_UTCTimestamp\":\"20151013154318-0500\",\"ChargeInformationList\":[{\"chargeDetailList\":[{\"chargeableUnits\":275,\"chargeType\":\"00\",\"chargedUnits\":1024,\"charge\":0}],\"callTypeGroup\":{\"callTypeLevel2\":0,\"callTypeLevel3\":0,\"callTypeLevel1\":10},\"chargedItem\":\"X\"}],\"CellID\":null,\"Location_Area\":null,\"CallEventStartTimeStamp_UTCOffset\":2,\"CallEventStartTimeStamp_LocalTimestamp\":\"20151013154318\"}},{\"_index\":\"tapdata\",\"_type\":\"starhome\",\"_id\":\"AVBrPqtlat7VifUaO879\",\"_score\":1.010285,\"_source\":{\"Recording_Entity\":[35,3],\"Charging_Id\":647,\"AccessPointName_OI\":null,\"AccessPointName_NI\":\"em\",\"PDP_Address\":\"10.199.2.252\",\"IMEI\":\"3537480633967801\",\"Serving_Network\":null,\"TotalCallEventDuration\":7,\"Traffic_Type\":\"Data\",\"Volume_Tx\":0.001615,\"Volume_Rx\":0.005706,\"Volume_Total\":0.007321,\"IMSI\":\"295050999900075\",\"MSISDN\":null,\"TapFileName\":\"CDGBRVFEMNLI05688\",\"File_Sequence_Number\":\"05688\",\"Sender\":\"GBRVF\",\"Recipient\":\"EMNLIEMK\",\"LocalCurrency\":\"GBP\",\"CurrencyConversionInfo\":{\"exchangeRateCode\":0,\"exchangeRate\":91599,\"numberOfDecimalPlaces\":5},\"UTCTimeOffsetInfo\":{\"utcTimeOffsetCode\":0,\"utcTimeOffset\":\"+0100\"},\"SGSN_GGSN_Info\":[{\"recEntityType\":1,\"recEntityId\":\"OUSE\",\"recEntityCode\":0},{\"recEntityId\":\"194.48.132.218\",\"recEntityCode\":1,\"recEntityType\":3},{\"recEntityId\":\"212.183.144.252\",\"recEntityCode\":2,\"recEntityType\":4},{\"recEntityType\":4,\"recEntityId\":\"212.183.144.249\",\"recEntityCode\":3},{\"recEntityCode\":4,\"recEntityId\":\"212.183.144.245\",\"recEntityType\":4},{\"recEntityCode\":5,\"recEntityId\":\"212.183.144.250\",\"recEntityType\":4},{\"recEntityId\":\"212.183.144.243\",\"recEntityCode\":6,\"recEntityType\":4},{\"recEntityId\":\"212.183.144.247\",\"recEntityCode\":7,\"recEntityType\":4},{\"recEntityType\":4,\"recEntityId\":\"212.183.144.248\",\"recEntityCode\":8},{\"recEntityId\":\"212.183.144.244\",\"recEntityCode\":9,\"recEntityType\":4},{\"recEntityCode\":10,\"recEntityId\":\"212.183.144.246\",\"recEntityType\":4},{\"recEntityId\":\"BEULT\",\"recEntityCode\":11,\"recEntityType\":1},{\"recEntityCode\":12,\"recEntityId\":\"S0\",\"recEntityType\":1},{\"recEntityId\":\"PANG\",\"recEntityCode\":13,\"recEntityType\":1},{\"recEntityCode\":14,\"recEntityId\":\"DERWENT\",\"recEntityType\":1},{\"recEntityId\":\"COLNE\",\"recEntityCode\":15,\"recEntityType\":1},{\"recEntityType\":1,\"recEntityCode\":16,\"recEntityId\":\"BR\"},{\"recEntityCode\":17,\"recEntityId\":\"LOSTOCKMSCBC\",\"recEntityType\":1},{\"recEntityType\":1,\"recEntityId\":\"BREDE\",\"recEntityCode\":18},{\"recEntityCode\":19,\"recEntityId\":\"TRENTMSCBC\",\"recEntityType\":1},{\"recEntityType\":1,\"recEntityId\":\"HAMBLE\",\"recEntityCode\":20},{\"recEntityId\":\"ITCHEN\",\"recEntityCode\":21,\"recEntityType\":1},{\"recEntityType\":1,\"recEntityId\":\"FLEET\",\"recEntityCode\":22},{\"recEntityId\":\"LONGFORD\",\"recEntityCode\":23,\"recEntityType\":1},{\"recEntityType\":1,\"recEntityCode\":24,\"recEntityId\":\"THAMES\"},{\"recEntityType\":1,\"recEntityId\":\"MILTONKEYNES\",\"recEntityCode\":25},{\"recEntityType\":1,\"recEntityCode\":26,\"recEntityId\":\"FROME\"},{\"recEntityId\":\"IRWELL\",\"recEntityCode\":27,\"recEntityType\":1},{\"recEntityType\":1,\"recEntityCode\":28,\"recEntityId\":\"BASINGSTOKE3\"},{\"recEntityType\":1,\"recEntityId\":\"B4\",\"recEntityCode\":29},{\"recEntityCode\":30,\"recEntityId\":\"CROAL\",\"recEntityType\":1},{\"recEntityType\":1,\"recEntityCode\":31,\"recEntityId\":\"ARROW\"},{\"recEntityType\":1,\"recEntityId\":\"S2\",\"recEntityCode\":32},{\"recEntityType\":1,\"recEntityCode\":33,\"recEntityId\":\"B3\"},{\"recEntityCode\":34,\"recEntityId\":\"R0\",\"recEntityType\":1},{\"recEntityCode\":35,\"recEntityId\":\"185.57.216.35\",\"recEntityType\":3},{\"recEntityType\":1,\"recEntityId\":\"REGENT\",\"recEntityCode\":36},{\"recEntityCode\":37,\"recEntityId\":\"BASINGSTOKEMMSC\",\"recEntityType\":1},{\"recEntityType\":1,\"recEntityId\":\"C0\",\"recEntityCode\":38},{\"recEntityCode\":39,\"recEntityId\":\"TAME\",\"recEntityType\":1},{\"recEntityId\":\"194.48.132.214\",\"recEntityCode\":40,\"recEntityType\":3},{\"recEntityType\":1,\"recEntityCode\":41,\"recEntityId\":\"CHELMER\"},{\"recEntityType\":3,\"recEntityCode\":42,\"recEntityId\":\"194.48.132.215\"},{\"recEntityId\":\"USK\",\"recEntityCode\":43,\"recEntityType\":1},{\"recEntityId\":\"C2\",\"recEntityCode\":44,\"recEntityType\":1}],\"AuditControlInfo\":{\"totalTaxValue\":0,\"earliestCallTimeStamp\":{\"utcTimeOffset\":\"+0100\",\"localTimeStamp\":\"20151013235529\"},\"latestCallTimeStamp\":{\"localTimeStamp\":\"20151014143810\",\"utcTimeOffset\":\"+0100\"},\"callEventDetailsCount\":10,\"totalCharge\":0,\"totalDiscountValue\":0,\"operatorSpecInformation\":[\"ACIgeneratedbySVR*FSH\"]},\"AccountingInfo\":{\"localCurrency\":\"GBP\",\"currencyConversionInfo\":[{\"exchangeRateCode\":0,\"exchangeRate\":91599,\"numberOfDecimalPlaces\":5}],\"tapDecimalPlaces\":3},\"CallEventStartTimeStamp_UTCTimestamp\":\"20151014095729+0100\",\"ChargeInformationList\":[{\"chargeDetailList\":[{\"charge\":0,\"chargeableUnits\":7321,\"chargeType\":\"00\"}],\"callTypeGroup\":{\"callTypeLevel2\":0,\"callTypeLevel1\":10,\"callTypeLevel3\":0},\"exchangeRateCode\":0,\"chargedItem\":\"X\"}],\"CellID\":null,\"Location_Area\":140,\"CallEventStartTimeStamp_UTCOffset\":0,\"CallEventStartTimeStamp_LocalTimestamp\":\"20151014095729\"}}]}}";

    ObjectMapper mapper = new ObjectMapper();
    try {
      SearchResult_old s = mapper.readValue(json, SearchResult_old.class);
    } catch (JsonParseException e) {
      e.printStackTrace();
    } catch (JsonMappingException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
