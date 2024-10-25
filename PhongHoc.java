package NhuY23718321_PhongHoc;

abstract class PhongHoc {

		public abstract boolean getDatChuan();

		protected String maPhong, dayNha;
		protected double dienTich;
		protected int soBongDen;

		public PhongHoc() {
		}

		public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {

			this.maPhong = maPhong;
			this.dayNha = dayNha;
			this.dienTich = dienTich;
			this.soBongDen = soBongDen;
		}

		public String getMaPhong() {
			return maPhong;
		}

		public void setMaPhong(String maPhong) throws Exception {
			if (maPhong != "") {
				this.maPhong = maPhong;
			}
			throw new Exception("Loi");
		}

		public String getDayNha() {
			return dayNha;
		}

		public void setDayNha(String dayNha) {
			this.dayNha = dayNha;
		}

		public double getDienTich() {
			return dienTich;
		}

		public void setDienTich(double dienTich) {
			this.dienTich = dienTich;
		}

		public int getSoBongDen() {
			return soBongDen;
		}

		public void setSoBongDen(int soBongDen) {
			this.soBongDen = soBongDen;
		}

		String PhongHocChuan = (getDatChuan())?"Dat chuan":"Khong dat chuan";
		public boolean duSang() {
			return getDienTich() / getSoBongDen() <= 10;
		}

		@Override
		public String toString() {
			String s = "";
			s += s.format("|%10s|%10s|%10s|%10s|%10s|", getMaPhong(), getDayNha(), getDienTich(), getSoBongDen(),getDatChuan());
			return s;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((maPhong == null) ? 0 : maPhong.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!(obj instanceof PhongHoc))
				return false;
			PhongHoc other = (PhongHoc) obj;
			if (maPhong == null) {
				if (other.maPhong != null)
					return false;
			} else if (!maPhong.equals(other.maPhong))
				return false;
			return true;
		}

	}


