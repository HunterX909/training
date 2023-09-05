package com.ey.builder;

public class Computer {
	private String cpu ;
	private int ram;
	private int hdd;
	private String gpu;
	private int ssd;

	@Override
	public String toString() {
		return "Builder [cpu=" + cpu + ", " + "ram=" + ram + ", ssd=" + ssd + ", gpu=" + gpu + ", hdd=" + hdd + "]";
	}
		public static class Builder {
	        private String cpu = "i3-7th-generaiton";
	        private int ram = 4;
	        private int ssd = 0;
	        private String gpu = "Integrated Graphics";
	        private int hdd = 256;

	        public Builder() {
	        }
	       
	        public Builder cpu(String cpu) {
	            this.cpu = cpu;
	            return this;
	        }

	        public Builder ram(int ram) {
	            this.ram = ram;
	            return this;
	        }

	        public Builder ssd(int ssd) {
	            if (ssd != 0) {
					this.ssd = ssd;	
				}
	            return this;
	        }

	        public Builder gpu(String gpu) {
	            this.gpu = gpu;
	            return this;
	        }
	        
	        public Builder hdd(int hdd) {
	        	this.hdd = hdd;
	        	return this;
	        }

			public Computer build() {
	            Computer computer = new Computer();
	            computer.cpu = this.cpu;
	            computer.ram = this.ram;
	            computer.ssd = this.ssd;
	            computer.gpu = this.gpu;
	            computer.hdd = this.hdd;
	            return computer;
	        }
			@Override
			public String toString() {
				return "Builder [cpu=" + cpu + ", "
						+ "ram=" + ram + ", ssd=" + ssd
						+ ", gpu=" + gpu + ", hdd=" + hdd + "]";
			}
	        
	}
		
	
}
