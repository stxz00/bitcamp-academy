package com.bit.dto;

public class Bean {
		//war���Ϸ� �������� ������ �ҽ��ڵ�� �޾ƿ��� ���Ѵ�.
		// javaBeanŬ����
		// bean -> dto -> Vo
		private int num;
		private String sub,id;
		private java.sql.Date nalja;
		
		// SETTER
		public void setNum(int num) {
			this.num=num;
		}
		// GETTER
		public int getNum() {
			return this.num;
		}
		public void setSub(String sub) {
			this.sub = sub;
		}
		public String getSub() {
			if(sub.length()>5) return sub.substring(0,5) + "...";
			return sub;
		}
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public java.sql.Date getNalja() {
			return nalja;
		}
		public void setNalja(java.sql.Date nalja) {
			this.nalja = nalja;
		}
		
		
}
