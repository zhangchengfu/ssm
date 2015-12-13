package com.laozhang.common;

import org.springframework.util.StringUtils;

public final class CommonEnum {

	private CommonEnum() {
	}
	
	public enum Status implements IEnum {
		DRAFT("草稿", "0"),
		PENDING_APPROVAL("待审核", "5"),
		AUDIT_THROUGH("审核通过", "10");
		
		private String label;
		
		private String code;
		
		private Status(String label, String code) {
			this.label = label;
			this.code = code;
		}

		public String getEnumName() {
			return "Status";
		}

		public String getCode() {
			return code;
		}

		public String getLabel() {
			return label;
		}
		
		@Override
		public String toString() {
			return this.label;
		}
		
		public String toValueString() {
			return this.code;
		}
		
		public String toLabelString() {
			return this.label;
		}
		
		public static String getEnumLabel(String code) {
			for (Status c : Status.values()) {
				if (c.code.equals(code)) {
					return c.label;
				}
			}
			return null;
		}
		
		public static String getEnumCode(String label) {
			for (Status c : Status.values()) {
				if (c.label.equals(label)) {
					return c.code;
				}
			}
			return null;
		}
		
	}
}
