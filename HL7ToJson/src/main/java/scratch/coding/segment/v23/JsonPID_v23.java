 package scratch.coding.segment.v23;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import scratch.coding.models.CE_v2;
import scratch.coding.models.TS_v2;
import scratch.coding.models.v23.CX_v23;
import scratch.coding.models.v23.DLN_v23;
import scratch.coding.models.v23.XAD_v23;
import scratch.coding.models.v23.XPN_v23;
import scratch.coding.models.v23.XTN_v23;

@JsonIgnoreProperties(ignoreUnknown= true)
public class JsonPID_v23 {
	@JsonProperty("pid_1_setIdpatientId")
	private String pid_1_setIdpatientId;
	@JsonProperty("cx_pid_2_externalPatientId")
	private CX_v23 cx_pid_2_externalPatientId;
	@JsonProperty("cx_pid_3_internalPatientId")
	private CX_v23[] cx_pid_3_internalPatientId;
	@JsonProperty("cx_pid_4_alternatePatientId")
	private CX_v23 cx_pid_4_alternatePatientId;
	@JsonProperty("xpn_pid_5_patientName")
	private XPN_v23[] xpn_pid_5_patientName;
	@JsonProperty("xpn_pid_6_mothersMaidenName")
	private XPN_v23 xpn_pid_6_mothersMaidenName;
	@JsonProperty("ts_pid_7_dateTimeOfBirth")
	private TS_v2 ts_pid_7_dateTimeOfBirth;
	@JsonProperty("pid_8_sex")
	private String pid_8_sex;
	@JsonProperty("xpn_pid_9_patienAlias")
	private XPN_v23[] xpn_pid_9_patienAlias;
	@JsonProperty("pid_10_race")
	private String pid_10_race;
	@JsonProperty("xad_pid_11_patientAddress")
	private XAD_v23[] xad_pid_11_patientAddress;
	@JsonProperty("pid_12_countryCode")
	private String pid_12_countryCode;
	@JsonProperty("xtn_pid_13_phoneNumberHome")
	private XTN_v23[] xtn_pid_13_phoneNumberHome;
	@JsonProperty("xtn_pid_14_phoneNumberBusiness")
	private XTN_v23[] xtn_pid_14_phoneNumberBusiness;
	@JsonProperty("ce_pid_15_primaryLanguage")
	private CE_v2 ce_pid_15_primaryLanguage;
	@JsonProperty("pid_16_maritalStatus")
	private String[] pid_16_maritalStatus;
	@JsonProperty("pid_17_religion")
	private String pid_17_religion;
	@JsonProperty("cx_pid_18_patientAccountNumber")
	private CX_v23 cx_pid_18_patientAccountNumber;
	@JsonProperty("pid_19_patientSsnNumber")
	private String pid_19_patientSsnNumber;
	@JsonProperty("dln_pid_20_patientDriverLicense")
	private DLN_v23 dln_pid_20_patientDriverLicense;
	@JsonProperty("cx_pid_21_mothersIdentifier")
	private CX_v23 cx_pid_21_mothersIdentifier;
	@JsonProperty("pid_22_ethnicGroup")
	private String pid_22_ethnicGroup;
	@JsonProperty("pid_23_birthPlace")
	private String pid_23_birthPlace;
	@JsonProperty("pid_24_multipleBirthIndicator")
	private String pid_24_multipleBirthIndicator;
	@JsonProperty("pid_25_birthOrder")
	private String pid_25_birthOrder;
	@JsonProperty("pid_26_citizenship")
	private String pid_26_citizenship;
	@JsonProperty("ce_pid_27_veteransMilitaryStatus")
	private CE_v2 ce_pid_27_veteransMilitaryStatus;
	@JsonProperty("ce_pid_28_nationality")
	private CE_v2 ce_pid_28_nationality;
	@JsonProperty("ts_pid_29_patientDeathDateTime")
	private TS_v2 ts_pid_29_patientDeathDateTime;
	@JsonProperty("pid_30_patientDeathIndicator")
	private String pid_30_patientDeathIndicator;
	@JsonProperty("pd1_pid")
	private JsonPD1_v23 pd1_pid;
	@JsonProperty("nte_pid")
	private JsonNTE_v23[] nte_pid;
	@JsonProperty("pv1_pid")
	private JsonPV1_v23 pv1_pid;
	@JsonProperty("pv2_pid")	  
	private JsonPV2_v23 pv2_pid;
	private JsonPID_v23(PIDBuilder builder) {
		super();
		this.pid_1_setIdpatientId = builder.pid_1_setIdpatientId;
		this.cx_pid_2_externalPatientId = builder.cx_pid_2_externalPatientId;
		this.cx_pid_3_internalPatientId = builder.cx_pid_3_internalPatientId;
		this.cx_pid_4_alternatePatientId = builder.cx_pid_4_alternatePatientId;
		this.xpn_pid_5_patientName = builder.xpn_pid_5_patientName;
		this.xpn_pid_6_mothersMaidenName = builder.xpn_pid_6_mothersMaidenName;
		this.ts_pid_7_dateTimeOfBirth = builder.ts_pid_7_dateTimeOfBirth;
		this.pid_8_sex = builder.pid_8_sex;
		this.xpn_pid_9_patienAlias = builder.xpn_pid_9_patienAlias;
		this.pid_10_race = builder.pid_10_race;
		this.xad_pid_11_patientAddress = builder.xad_pid_11_patientAddress;
		this.pid_12_countryCode = builder.pid_12_countryCode;
		this.xtn_pid_13_phoneNumberHome = builder.xtn_pid_13_phoneNumberHome;
		this.xtn_pid_14_phoneNumberBusiness = builder.xtn_pid_14_phoneNumberBusiness;
		this.ce_pid_15_primaryLanguage = builder.ce_pid_15_primaryLanguage;
		this.pid_16_maritalStatus = builder.pid_16_maritalStatus;
		this.pid_17_religion = builder.pid_17_religion;
		this.cx_pid_18_patientAccountNumber = builder.cx_pid_18_patientAccountNumber;
		this.pid_19_patientSsnNumber = builder.pid_19_patientSsnNumber;
		this.dln_pid_20_patientDriverLicense = builder.dln_pid_20_patientDriverLicense;
		this.cx_pid_21_mothersIdentifier = builder.cx_pid_21_mothersIdentifier;
		this.pid_22_ethnicGroup = builder.pid_22_ethnicGroup;
		this.pid_23_birthPlace = builder.pid_23_birthPlace;
		this.pid_24_multipleBirthIndicator = builder.pid_24_multipleBirthIndicator;
		this.pid_25_birthOrder = builder.pid_25_birthOrder;
		this.pid_26_citizenship = builder.pid_26_citizenship;
		this.ce_pid_27_veteransMilitaryStatus = builder.ce_pid_27_veteransMilitaryStatus;
		this.ce_pid_28_nationality = builder.ce_pid_28_nationality;
		this.ts_pid_29_patientDeathDateTime = builder.ts_pid_29_patientDeathDateTime;
		this.pid_30_patientDeathIndicator = builder.pid_30_patientDeathIndicator;
		this.pd1_pid = builder.pd1_pid;
		this.nte_pid = builder.nte_pid;
		this.pv1_pid = builder.pv1_pid;
		this.pv2_pid = builder.pv2_pid;
	}
	public JsonPID_v23(String pid_1_setIdpatientId, CX_v23 cx_pid_2_externalPatientId,
			CX_v23[] cx_pid_3_internalPatientId, CX_v23 cx_pid_4_alternatePatientId, XPN_v23[] xpn_pid_5_patientName,
			XPN_v23 xpn_pid_6_mothersMaidenName, TS_v2 ts_pid_7_dateTimeOfBirth, String pid_8_sex,
			XPN_v23[] xpn_pid_9_patienAlias, String pid_10_race, XAD_v23[] xad_pid_11_patientAddress,
			String pid_12_countryCode, XTN_v23[] xtn_pid_13_phoneNumberHome, XTN_v23[] xtn_pid_14_phoneNumberBusiness,
			CE_v2 ce_pid_15_primaryLanguage, String[] pid_16_maritalStatus, String pid_17_religion,
			CX_v23 cx_pid_18_patientAccountNumber, String pid_19_patientSsnNumber,
			DLN_v23 dln_pid_20_patientDriverLicense, CX_v23 cx_pid_21_mothersIdentifier, String pid_22_ethnicGroup,
			String pid_23_birthPlace, String pid_24_multipleBirthIndicator, String pid_25_birthOrder,
			String pid_26_citizenship, CE_v2 ce_pid_27_veteransMilitaryStatus, CE_v2 ce_pid_28_nationality,
			TS_v2 ts_pid_29_patientDeathDateTime, String pid_30_patientDeathIndicator, JsonPD1_v23 pd1_pid,
			JsonNTE_v23[] nte_pid, JsonPV1_v23 pv1_pid, JsonPV2_v23 pv2_pid) {
		super();
		this.pid_1_setIdpatientId = pid_1_setIdpatientId;
		this.cx_pid_2_externalPatientId = cx_pid_2_externalPatientId;
		this.cx_pid_3_internalPatientId = cx_pid_3_internalPatientId;
		this.cx_pid_4_alternatePatientId = cx_pid_4_alternatePatientId;
		this.xpn_pid_5_patientName = xpn_pid_5_patientName;
		this.xpn_pid_6_mothersMaidenName = xpn_pid_6_mothersMaidenName;
		this.ts_pid_7_dateTimeOfBirth = ts_pid_7_dateTimeOfBirth;
		this.pid_8_sex = pid_8_sex;
		this.xpn_pid_9_patienAlias = xpn_pid_9_patienAlias;
		this.pid_10_race = pid_10_race;
		this.xad_pid_11_patientAddress = xad_pid_11_patientAddress;
		this.pid_12_countryCode = pid_12_countryCode;
		this.xtn_pid_13_phoneNumberHome = xtn_pid_13_phoneNumberHome;
		this.xtn_pid_14_phoneNumberBusiness = xtn_pid_14_phoneNumberBusiness;
		this.ce_pid_15_primaryLanguage = ce_pid_15_primaryLanguage;
		this.pid_16_maritalStatus = pid_16_maritalStatus;
		this.pid_17_religion = pid_17_religion;
		this.cx_pid_18_patientAccountNumber = cx_pid_18_patientAccountNumber;
		this.pid_19_patientSsnNumber = pid_19_patientSsnNumber;
		this.dln_pid_20_patientDriverLicense = dln_pid_20_patientDriverLicense;
		this.cx_pid_21_mothersIdentifier = cx_pid_21_mothersIdentifier;
		this.pid_22_ethnicGroup = pid_22_ethnicGroup;
		this.pid_23_birthPlace = pid_23_birthPlace;
		this.pid_24_multipleBirthIndicator = pid_24_multipleBirthIndicator;
		this.pid_25_birthOrder = pid_25_birthOrder;
		this.pid_26_citizenship = pid_26_citizenship;
		this.ce_pid_27_veteransMilitaryStatus = ce_pid_27_veteransMilitaryStatus;
		this.ce_pid_28_nationality = ce_pid_28_nationality;
		this.ts_pid_29_patientDeathDateTime = ts_pid_29_patientDeathDateTime;
		this.pid_30_patientDeathIndicator = pid_30_patientDeathIndicator;
		this.pd1_pid = pd1_pid;
		this.nte_pid = nte_pid;
		this.pv1_pid = pv1_pid;
		this.pv2_pid = pv2_pid;
	}
	public JsonPID_v23() {
		super();
		this.pid_1_setIdpatientId = "";
		this.cx_pid_2_externalPatientId = new CX_v23();
		this.cx_pid_3_internalPatientId = new CX_v23[] {};
		this.cx_pid_4_alternatePatientId = new CX_v23();
		this.xpn_pid_5_patientName = new XPN_v23[] {};
		this.xpn_pid_6_mothersMaidenName = new XPN_v23();
		this.ts_pid_7_dateTimeOfBirth = new TS_v2();
		this.pid_8_sex = "";
		this.xpn_pid_9_patienAlias = new XPN_v23[] {};
		this.pid_10_race = "";
		this.xad_pid_11_patientAddress = new XAD_v23[] {};
		this.pid_12_countryCode = "";
		this.xtn_pid_13_phoneNumberHome = new XTN_v23[] {};
		this.xtn_pid_14_phoneNumberBusiness = new XTN_v23[] {};
		this.ce_pid_15_primaryLanguage = new CE_v2();
		this.pid_16_maritalStatus = new String[] {};
		this.pid_17_religion = "";
		this.cx_pid_18_patientAccountNumber = new CX_v23();
		this.pid_19_patientSsnNumber = "";
		this.dln_pid_20_patientDriverLicense = new DLN_v23();
		this.cx_pid_21_mothersIdentifier = new CX_v23();
		this.pid_22_ethnicGroup = "";
		this.pid_23_birthPlace = "";
		this.pid_24_multipleBirthIndicator = "";
		this.pid_25_birthOrder = "";
		this.pid_26_citizenship = "";
		this.ce_pid_27_veteransMilitaryStatus = new CE_v2();
		this.ce_pid_28_nationality = new CE_v2();
		this.ts_pid_29_patientDeathDateTime = new TS_v2();
		this.pid_30_patientDeathIndicator = "";
		this.pd1_pid = new JsonPD1_v23();
		this.nte_pid = new JsonNTE_v23[] {};
		this.pv1_pid = new JsonPV1_v23();
		this.pv2_pid = new JsonPV2_v23();
	}
	public static class PIDBuilder {
		private String pid_1_setIdpatientId;
		private CX_v23 cx_pid_2_externalPatientId;
		private CX_v23[] cx_pid_3_internalPatientId;
		private CX_v23 cx_pid_4_alternatePatientId;
		private XPN_v23[] xpn_pid_5_patientName;
		private XPN_v23 xpn_pid_6_mothersMaidenName;
		private TS_v2 ts_pid_7_dateTimeOfBirth;
		private String pid_8_sex;
		private XPN_v23[] xpn_pid_9_patienAlias;
		private String pid_10_race;
		private XAD_v23[] xad_pid_11_patientAddress;
		private String pid_12_countryCode;
		private XTN_v23[] xtn_pid_13_phoneNumberHome;
		private XTN_v23[] xtn_pid_14_phoneNumberBusiness;
		private CE_v2 ce_pid_15_primaryLanguage;
		private String[] pid_16_maritalStatus;
		private String pid_17_religion;
		private CX_v23 cx_pid_18_patientAccountNumber;
		private String pid_19_patientSsnNumber;
		private DLN_v23 dln_pid_20_patientDriverLicense;
		private CX_v23 cx_pid_21_mothersIdentifier;
		private String pid_22_ethnicGroup;
		private String pid_23_birthPlace;
		private String pid_24_multipleBirthIndicator;
		private String pid_25_birthOrder;
		private String pid_26_citizenship;
		private CE_v2 ce_pid_27_veteransMilitaryStatus;
		private CE_v2 ce_pid_28_nationality;
		private TS_v2 ts_pid_29_patientDeathDateTime;
		private String pid_30_patientDeathIndicator;
		private JsonPD1_v23 pd1_pid;
		private JsonNTE_v23[] nte_pid;
		private JsonPV1_v23 pv1_pid;
		private JsonPV2_v23 pv2_pid;
		public PIDBuilder(CX_v23[] cx_pid_3_internalPatientId, XPN_v23[] xpn_pid_5_patientName) {
			super();
			this.pid_1_setIdpatientId = "";
			this.cx_pid_2_externalPatientId = new CX_v23();
			this.cx_pid_3_internalPatientId = cx_pid_3_internalPatientId;
			this.cx_pid_4_alternatePatientId = new CX_v23();
			this.xpn_pid_5_patientName = xpn_pid_5_patientName;
			this.xpn_pid_6_mothersMaidenName = new XPN_v23();
			this.ts_pid_7_dateTimeOfBirth = new TS_v2();
			this.pid_8_sex = "";
			this.xpn_pid_9_patienAlias = new XPN_v23[] {};
			this.pid_10_race = "";
			this.xad_pid_11_patientAddress = new XAD_v23[] {};
			this.pid_12_countryCode = "";
			this.xtn_pid_13_phoneNumberHome = new XTN_v23[] {};
			this.xtn_pid_14_phoneNumberBusiness = new XTN_v23[] {};
			this.ce_pid_15_primaryLanguage = new CE_v2();
			this.pid_16_maritalStatus = new String[] {};
			this.pid_17_religion = "";
			this.cx_pid_18_patientAccountNumber = new CX_v23();
			this.pid_19_patientSsnNumber = "";
			this.dln_pid_20_patientDriverLicense = new DLN_v23();
			this.cx_pid_21_mothersIdentifier = new CX_v23();
			this.pid_22_ethnicGroup = "";
			this.pid_23_birthPlace = "";
			this.pid_24_multipleBirthIndicator = "";
			this.pid_25_birthOrder = "";
			this.pid_26_citizenship = "";
			this.ce_pid_27_veteransMilitaryStatus = new CE_v2();
			this.ce_pid_28_nationality = new CE_v2();
			this.ts_pid_29_patientDeathDateTime = new TS_v2();
			this.pid_30_patientDeathIndicator = "";
			this.pd1_pid = new JsonPD1_v23();
			this.nte_pid = new JsonNTE_v23[] {};
			this.pv1_pid = new JsonPV1_v23();
			this.pv2_pid = new JsonPV2_v23();
		}
		public PIDBuilder pid_1_setIdpatientId(String pid_1_setIdpatientId) {
			this.pid_1_setIdpatientId = pid_1_setIdpatientId;
			return this;
		}
		public PIDBuilder cx_pid_2_externalPatientId(CX_v23 cx_pid_2_externalPatientId) {
			this.cx_pid_2_externalPatientId = cx_pid_2_externalPatientId;
			return this;
		}
		public PIDBuilder cx_pid_3_internalPatientId(CX_v23[] cx_pid_3_internalPatientId) {
			this.cx_pid_3_internalPatientId = cx_pid_3_internalPatientId;
			return this;
		}
		public PIDBuilder cx_pid_4_alternatePatientId(CX_v23 cx_pid_4_alternatePatientId) {
			this.cx_pid_4_alternatePatientId = cx_pid_4_alternatePatientId;
			return this;
		}
		public PIDBuilder xpn_pid_5_patientName(XPN_v23[] xpn_pid_5_patientName) {
			this.xpn_pid_5_patientName = xpn_pid_5_patientName;
			return this;
		}
		public PIDBuilder xpn_pid_6_mothersMaidenName(XPN_v23 xpn_pid_6_mothersMaidenName) {
			this.xpn_pid_6_mothersMaidenName = xpn_pid_6_mothersMaidenName;
			return this;
		}
		public PIDBuilder ts_pid_7_dateTimeOfBirth(TS_v2 ts_pid_7_dateTimeOfBirth) {
			this.ts_pid_7_dateTimeOfBirth = ts_pid_7_dateTimeOfBirth;
			return this;
		}
		public PIDBuilder pid_8_sex(String pid_8_sex) {
			this.pid_8_sex = pid_8_sex;
			return this;
		}
		public PIDBuilder xpn_pid_9_patienAlias(XPN_v23[] xpn_pid_9_patienAlias) {
			this.xpn_pid_9_patienAlias = xpn_pid_9_patienAlias;
			return this;
		}
		public PIDBuilder pid_10_race(String pid_10_race) {
			this.pid_10_race = pid_10_race;
			return this;
		}
		public PIDBuilder xad_pid_11_patientAddress(XAD_v23[] xad_pid_11_patientAddress) {
			this.xad_pid_11_patientAddress = xad_pid_11_patientAddress;
			return this;
		}
		public PIDBuilder pid_12_countryCode(String pid_12_countryCode) {
			this.pid_12_countryCode = pid_12_countryCode;
			return this;
		}
		public PIDBuilder xtn_pid_13_phoneNumberHome(XTN_v23[] xtn_pid_13_phoneNumberHome) {
			this.xtn_pid_13_phoneNumberHome = xtn_pid_13_phoneNumberHome;
			return this;
		}
		public PIDBuilder xtn_pid_14_phoneNumberBusiness(XTN_v23[] xtn_pid_14_phoneNumberBusiness) {
			this.xtn_pid_14_phoneNumberBusiness = xtn_pid_14_phoneNumberBusiness;
			return this;
		}
		public PIDBuilder ce_pid_15_primaryLanguage(CE_v2 ce_pid_15_primaryLanguage) {
			this.ce_pid_15_primaryLanguage = ce_pid_15_primaryLanguage;
			return this;
		}
		public PIDBuilder pid_16_maritalStatus(String[] pid_16_maritalStatus) {
			this.pid_16_maritalStatus = pid_16_maritalStatus;
			return this;
		}
		public PIDBuilder pid_17_religion(String pid_17_religion) {
			this.pid_17_religion = pid_17_religion;
			return this;
		}
		public PIDBuilder cx_pid_18_patientAccountNumber(CX_v23 cx_pid_18_patientAccountNumber) {
			this.cx_pid_18_patientAccountNumber = cx_pid_18_patientAccountNumber;
			return this;
		}
		public PIDBuilder pid_19_patientSsnNumber(String pid_19_patientSsnNumber) {
			this.pid_19_patientSsnNumber = pid_19_patientSsnNumber;
			return this;
		}
		public PIDBuilder dln_pid_20_patientDriverLicense(DLN_v23 dln_pid_20_patientDriverLicense) {
			this.dln_pid_20_patientDriverLicense = dln_pid_20_patientDriverLicense;
			return this;
		}
		public PIDBuilder cx_pid_21_mothersIdentifier(CX_v23 cx_pid_21_mothersIdentifier) {
			this.cx_pid_21_mothersIdentifier = cx_pid_21_mothersIdentifier;
			return this;
		}
		public PIDBuilder pid_22_ethnicGroup(String pid_22_ethnicGroup) {
			this.pid_22_ethnicGroup = pid_22_ethnicGroup;
			return this;
		}
		public PIDBuilder pid_23_birthPlace(String pid_23_birthPlace) {
			this.pid_23_birthPlace = pid_23_birthPlace;
			return this;
		}
		public PIDBuilder pid_24_multipleBirthIndicator(String pid_24_multipleBirthIndicator) {
			this.pid_24_multipleBirthIndicator = pid_24_multipleBirthIndicator;
			return this;
		}
		public PIDBuilder pid_25_birthOrder(String pid_25_birthOrder) {
			this.pid_25_birthOrder = pid_25_birthOrder;
			return this;
		}
		public PIDBuilder pid_26_citizenship(String pid_26_citizenship) {
			this.pid_26_citizenship = pid_26_citizenship;
			return this;
		}
		public PIDBuilder ce_pid_27_veteransMilitaryStatus(CE_v2 ce_pid_27_veteransMilitaryStatus) {
			this.ce_pid_27_veteransMilitaryStatus = ce_pid_27_veteransMilitaryStatus;
			return this;
		}
		public PIDBuilder ce_pid_28_nationality(CE_v2 ce_pid_28_nationality) {
			this.ce_pid_28_nationality = ce_pid_28_nationality;
			return this;
		}
		public PIDBuilder ts_pid_29_patientDeathDateTime(TS_v2 ts_pid_29_patientDeathDateTime) {
			this.ts_pid_29_patientDeathDateTime = ts_pid_29_patientDeathDateTime;
			return this;
		}
		public PIDBuilder pid_30_patientDeathIndicator(String pid_30_patientDeathIndicator) {
			this.pid_30_patientDeathIndicator = pid_30_patientDeathIndicator;
			return this;
		}
		public PIDBuilder pd1_pid(JsonPD1_v23 pd1_pid) {
			this.pd1_pid = pd1_pid;
			return this;
		}
		public PIDBuilder nte_pid(JsonNTE_v23[] nte_pid) {
			this.nte_pid = nte_pid;
			return this;
		}
		public PIDBuilder pv1_pid(JsonPV1_v23 pv1_pid) {
			this.pv1_pid = pv1_pid;
			return this;
		}
		public PIDBuilder pv2_pid(JsonPV2_v23 pv2_pid) {
			this.pv2_pid = pv2_pid;
			return this;
		}
		public JsonPID_v23 build() {
			return new JsonPID_v23(this);
		}
	}
	public String getPid_1_setIdpatientId() {
		return pid_1_setIdpatientId;
	}
	public CX_v23 getCx_pid_2_externalPatientId() {
		return cx_pid_2_externalPatientId;
	}
	public CX_v23[] getCx_pid_3_internalPatientId() {
		return cx_pid_3_internalPatientId;
	}
	public CX_v23 getCx_pid_4_alternatePatientId() {
		return cx_pid_4_alternatePatientId;
	}
	public XPN_v23[] getXpn_pid_5_patientName() {
		return xpn_pid_5_patientName;
	}
	public XPN_v23 getXpn_pid_6_mothersMaidenName() {
		return xpn_pid_6_mothersMaidenName;
	}
	public TS_v2 getTs_pid_7_dateTimeOfBirth() {
		return ts_pid_7_dateTimeOfBirth;
	}
	public String getPid_8_sex() {
		return pid_8_sex;
	}
	public XPN_v23[] getXpn_pid_9_patienAlias() {
		return xpn_pid_9_patienAlias;
	}
	public String getPid_10_race() {
		return pid_10_race;
	}
	public XAD_v23[] getXad_pid_11_patientAddress() {
		return xad_pid_11_patientAddress;
	}
	public String getPid_12_countryCode() {
		return pid_12_countryCode;
	}
	public XTN_v23[] getXtn_pid_13_phoneNumberHome() {
		return xtn_pid_13_phoneNumberHome;
	}
	public XTN_v23[] getXtn_pid_14_phoneNumberBusiness() {
		return xtn_pid_14_phoneNumberBusiness;
	}
	public CE_v2 getCe_pid_15_primaryLanguage() {
		return ce_pid_15_primaryLanguage;
	}
	public String[] getPid_16_maritalStatus() {
		return pid_16_maritalStatus;
	}
	public String getPid_17_religion() {
		return pid_17_religion;
	}
	public CX_v23 getCx_pid_18_patientAccountNumber() {
		return cx_pid_18_patientAccountNumber;
	}
	public String getPid_19_patientSsnNumber() {
		return pid_19_patientSsnNumber;
	}
	public DLN_v23 getDln_pid_20_patientDriverLicense() {
		return dln_pid_20_patientDriverLicense;
	}
	public CX_v23 getCx_pid_21_mothersIdentifier() {
		return cx_pid_21_mothersIdentifier;
	}
	public String getPid_22_ethnicGroup() {
		return pid_22_ethnicGroup;
	}
	public String getPid_23_birthPlace() {
		return pid_23_birthPlace;
	}
	public String getPid_24_multipleBirthIndicator() {
		return pid_24_multipleBirthIndicator;
	}
	public String getPid_25_birthOrder() {
		return pid_25_birthOrder;
	}
	public String getPid_26_citizenship() {
		return pid_26_citizenship;
	}
	public CE_v2 getCe_pid_27_veteransMilitaryStatus() {
		return ce_pid_27_veteransMilitaryStatus;
	}
	public CE_v2 getCe_pid_28_nationality() {
		return ce_pid_28_nationality;
	}
	public TS_v2 getTs_pid_29_patientDeathDateTime() {
		return ts_pid_29_patientDeathDateTime;
	}
	public String getPid_30_patientDeathIndicator() {
		return pid_30_patientDeathIndicator;
	}
	public JsonPD1_v23 getPd1_pid() {
		return pd1_pid;
	}
	public JsonNTE_v23[] getNte_pid() {
		return nte_pid;
	}
	public JsonPV1_v23 getPv1_pid() {
		return pv1_pid;
	}
	public JsonPV2_v23 getPv2_pid() {
		return pv2_pid;
	}
	@Override
	public String toString() {
		return "JsonPID_v23 [pid_1_setIdpatientId=" + pid_1_setIdpatientId + ", cx_pid_2_externalPatientId="
				+ cx_pid_2_externalPatientId + ", cx_pid_3_internalPatientId="
				+ Arrays.toString(cx_pid_3_internalPatientId) + ", cx_pid_4_alternatePatientId="
				+ cx_pid_4_alternatePatientId + ", xpn_pid_5_patientName=" + Arrays.toString(xpn_pid_5_patientName)
				+ ", xpn_pid_6_mothersMaidenName=" + xpn_pid_6_mothersMaidenName + ", ts_pid_7_dateTimeOfBirth="
				+ ts_pid_7_dateTimeOfBirth + ", pid_8_sex=" + pid_8_sex + ", xpn_pid_9_patienAlias="
				+ Arrays.toString(xpn_pid_9_patienAlias) + ", pid_10_race=" + pid_10_race
				+ ", xad_pid_11_patientAddress=" + Arrays.toString(xad_pid_11_patientAddress) + ", pid_12_countryCode="
				+ pid_12_countryCode + ", xtn_pid_13_phoneNumberHome=" + Arrays.toString(xtn_pid_13_phoneNumberHome)
				+ ", xtn_pid_14_phoneNumberBusiness=" + Arrays.toString(xtn_pid_14_phoneNumberBusiness)
				+ ", ce_pid_15_primaryLanguage=" + ce_pid_15_primaryLanguage + ", pid_16_maritalStatus="
				+ Arrays.toString(pid_16_maritalStatus) + ", pid_17_religion=" + pid_17_religion
				+ ", cx_pid_18_patientAccountNumber=" + cx_pid_18_patientAccountNumber + ", pid_19_patientSsnNumber="
				+ pid_19_patientSsnNumber + ", dln_pid_20_patientDriverLicense=" + dln_pid_20_patientDriverLicense
				+ ", cx_pid_21_mothersIdentifier=" + cx_pid_21_mothersIdentifier + ", pid_22_ethnicGroup="
				+ pid_22_ethnicGroup + ", pid_23_birthPlace=" + pid_23_birthPlace + ", pid_24_multipleBirthIndicator="
				+ pid_24_multipleBirthIndicator + ", pid_25_birthOrder=" + pid_25_birthOrder + ", pid_26_citizenship="
				+ pid_26_citizenship + ", ce_pid_27_veteransMilitaryStatus=" + ce_pid_27_veteransMilitaryStatus
				+ ", ce_pid_28_nationality=" + ce_pid_28_nationality + ", ts_pid_29_patientDeathDateTime="
				+ ts_pid_29_patientDeathDateTime + ", pid_30_patientDeathIndicator=" + pid_30_patientDeathIndicator
				+ ", pd1_pid=" + pd1_pid + ", nte_pid=" + Arrays.toString(nte_pid) + ", pv1_pid=" + pv1_pid
				+ ", pv2_pid=" + pv2_pid + "]";
	}
	
}
