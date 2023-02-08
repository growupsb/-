package classex_03;

public class TV {
	private static final int MINCHANNEL = 1;
	private static final int MAXCHANNEL = 99;
	private static final int MAXVOLUMN = 10;
	private static final int MINVOLUMN = 0;
	
	private String brandName;
	private boolean powered;
	private int channel;
	private int volumn;

	public TV() {
		brandName = null;
		powered = false;
		channel = MINCHANNEL;
		volumn = 0;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		/*if(!brandName.equals(" ") &&  brandName.length()!=0) {
			this.brandName = brandName;
			System.out.println("브래드명 : "+brandName+"TV");
		}else {
			System.out.println("브래드명이 없음. ");
		}*/
		this.brandName = brandName;
	}

	public boolean isPowered() {
		return powered;
	}

	public void setPowered(boolean powered) {
		if (powered == false)
			System.out.println("전원 종료합니다");
		else {
			System.out.println("전원 켜졌습니다");
			this.powered = powered;
		}

		this.powered = powered;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if (powered == true) {
			/*this.channel=channel;
			if (channel > MAXCHANNEL) {
				System.out.println("99번이 끝입니다. 1번로 채널로 돌아갑니다");
				this.channel = MINCHANNEL;
			} else if (channel < MINCHANNEL) {
				System.out.println("1번이 끝입니다. 99번로 채널로 돌아갑니다");
				this.channel = MAXCHANNEL;
			}*/
			if(channel>=MINCHANNEL && channel<=MAXCHANNEL) {
				this.channel=channel;
			}else {
				System.out.println("오류:채널은 유효한 범위안에 있어야 한다 ");
			}
			//System.out.println("현재 채널은 " + this.channel + "입니다");
		}
	}
	public void incrementChannel() {
		if(channel>=MINCHANNEL && channel<=MAXCHANNEL) {//1~99
			if(channel==MAXCHANNEL)//채널이 최대 99일때 channel=MINCHANNEL
				channel=MINCHANNEL;
			else
				channel++;
		}else {
			System.out.println("오류: 채널 번호는 유효한 범위안에 있어야 한다.");
		}
		
	}
	public void decrementChannel() {
		if(channel>=MINCHANNEL && channel<=MAXCHANNEL) {//1~99
			if(channel==MINCHANNEL)//채널이 최소 1일때 channel=MAXCHANNEL
				channel=MAXCHANNEL;
			else
				channel--;
		}else {
			System.out.println("오류: 채널 번호는 유효한 범위안에 있어야 한다.");
		}
	}

	public int getVolumn() {
		return volumn;
	}
	public void setVolumn(int volumn) {
		if(powered==true) {
			/*if(volumn>10) {
				//System.out.println("볼륨이 최대치입니다(10)");
				this.volumn=10;//코드 작성
			}else if(volumn<0) {
				//System.out.println("볼륨이 최소치입니다(0)");
				this.volumn=0;//코드 작성
			}else {
				this.volumn=volumn;
			}*/
			if(volumn>=MINVOLUMN && volumn<=MAXVOLUMN) {
				this.volumn=volumn;
			}else
				System.out.println("오류: 불륨는 유효한 범위안에 있어야 한다(0~10).");
			//System.out.println("현재 볼륨은 " + this.volumn + "입니다");
		}	
	}
	public void incrementVolumn() {
		if(volumn>0 && volumn<=10) {
			if(volumn!=10)
				volumn++;
			else
				System.out.println("오류: 불륨는 유효한 범위안에 있어야 한다.");
		}
	}
	public void decrementVolumn() {
		if(volumn>0 && volumn<=10) {
			if(volumn!=0)
				volumn--;
			else
				System.out.println("오류: 불륨는 유효한 범위안에 있어야 한다.");
		}
	}
	public String toString() {
		String str="";
		if(!brandName.equals(""))
			str+="브래드명 : "+getBrandName()+"\n";
		else str+="브랜드명 :"+""+"\n";
		str+="전원:"+isPowered()+"\n";
		str+="채널번호 :"+getChannel()+"\n";
		str+="볼륨 :"+getVolumn()+"\n";
		
		return str;
	}
}
